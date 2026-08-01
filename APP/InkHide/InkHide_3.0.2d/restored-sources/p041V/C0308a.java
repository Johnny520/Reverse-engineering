package p041V;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: renamed from: V.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0308a implements GenericArrayType, Serializable {

    /* JADX INFO: renamed from: a */
    public final Type f678a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0308a(Type type) {
        Objects.requireNonNull(type);
        this.f678a = AbstractC0311d.m539a(type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC0311d.m542d(this, (GenericArrayType) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f678a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f678a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0311d.m548j(this.f678a) + "[]";
    }
}
