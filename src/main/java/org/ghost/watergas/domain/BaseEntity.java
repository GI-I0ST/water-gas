package org.ghost.watergas.domain;

import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

public abstract class BaseEntity {

    public abstract String getId();

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Measure measure = (Measure) o;
        return getId() != null && Objects.equals(getId(), measure.getId());
    }

    @Override
    public final int hashCode() {
        return getId().hashCode();
    }
}
