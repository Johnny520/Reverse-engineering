package p224q2;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: renamed from: q2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2916g implements WildcardType, Serializable {

    /* JADX INFO: renamed from: d */
    public final Type f9214d;

    /* JADX INFO: renamed from: e */
    public final Type f9215e;

    public C2916g(Type[] typeArr, Type[] typeArr2) {
        AbstractC2917h.m5110b(typeArr2.length <= 1);
        AbstractC2917h.m5110b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            AbstractC2917h.m5111c(typeArr[0]);
            this.f9215e = null;
            this.f9214d = AbstractC2917h.m5109a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        AbstractC2917h.m5111c(typeArr2[0]);
        AbstractC2917h.m5110b(typeArr[0] == Object.class);
        this.f9215e = AbstractC2917h.m5109a(typeArr2[0]);
        this.f9214d = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC2917h.m5113e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f9215e;
        return type != null ? new Type[]{type} : AbstractC2917h.f9216a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f9214d};
    }

    public final int hashCode() {
        Type type = this.f9215e;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f9214d.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f9215e;
        if (type != null) {
            return "? super " + AbstractC2917h.m5119k(type);
        }
        Type type2 = this.f9214d;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC2917h.m5119k(type2);
    }
}
