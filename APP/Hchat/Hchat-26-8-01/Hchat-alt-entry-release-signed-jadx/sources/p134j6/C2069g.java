package p134j6;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;
import p136j8.C2104o;

/* JADX INFO: renamed from: j6.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2069g implements WildcardType, Serializable {

    /* JADX INFO: renamed from: g */
    public final Type f6951g;

    /* JADX INFO: renamed from: h */
    public final Type f6952h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2069g(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            C2104o.m5294t("At most one lower bound is supported");
            throw null;
        }
        if (typeArr.length != 1) {
            C2104o.m5294t("Exactly one upper bound must be specified");
            throw null;
        }
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            AbstractC2070h.m5124b(typeArr[0]);
            this.f6952h = null;
            this.f6951g = AbstractC2070h.m5123a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        AbstractC2070h.m5124b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            C2104o.m5294t("When lower bound is specified, upper bound must be Object");
            throw null;
        }
        this.f6952h = AbstractC2070h.m5123a(typeArr2[0]);
        this.f6951g = Object.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC2070h.m5125c(this, (WildcardType) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f6952h;
        return type != null ? new Type[]{type} : AbstractC2070h.f6953a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f6951g};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Type type = this.f6952h;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f6951g.hashCode() + 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        Type type = this.f6952h;
        if (type != null) {
            return "? super " + AbstractC2070h.m5131i(type);
        }
        Type type2 = this.f6951g;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC2070h.m5131i(type2);
    }
}
