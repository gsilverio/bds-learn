package com.dslearn.dslearn.entities.pk;

import com.dslearn.dslearn.entities.Enrollment;
import com.dslearn.dslearn.entities.Offer;
import com.dslearn.dslearn.entities.User;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;
@Embeddable
public class EnrollmentPK implements Serializable {
    private static final long serialVersionUID = 1l;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    public EnrollmentPK(){}

    public EnrollmentPK(User user, Offer offer) {
        this.user = user;
        this.offer = offer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnrollmentPK that)) return false;
        return user.equals(that.user) && offer.equals(that.offer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, offer);
    }
}
