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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2914e(Type type) {
        Objects.requireNonNull(type);
        this.f9210d = AbstractC2917h.m5109a(type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC2917h.m5113e(this, (GenericArrayType) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f9210d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9210d.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC2917h.m5119k(this.f9210d) + "[]";
    }
}
