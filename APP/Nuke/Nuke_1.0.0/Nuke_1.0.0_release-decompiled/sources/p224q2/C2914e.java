package p224q2;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: renamed from: q2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2914e implements GenericArrayType, Serializable {

    /* JADX INFO: renamed from: d */
    public final Type f9210d;

    public C2914e(Type type) {
        Objects.requireNonNull(type);
        this.f9210d = AbstractC2917h.m5109a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC2917h.m5113e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f9210d;
    }

    public final int hashCode() {
        return this.f9210d.hashCode();
    }

    public final String toString() {
        return AbstractC2917h.m5119k(this.f9210d) + "[]";
    }
}
