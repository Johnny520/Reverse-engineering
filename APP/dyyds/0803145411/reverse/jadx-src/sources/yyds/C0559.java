package yyds;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: renamed from: yyds.ᛳᛳᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0559 implements WildcardType {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Type f2655;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Type f2656;

    public C0559(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            C0188.m798("At most one lower bound is supported");
            throw null;
        }
        if (typeArr.length != 1) {
            C0188.m798("Exactly one upper bound must be specified");
            throw null;
        }
        if (typeArr2.length != 1) {
            AbstractC1917.m3692(typeArr[0]);
            this.f2656 = null;
            this.f2655 = AbstractC1917.m3702(typeArr[0]);
        } else {
            AbstractC1917.m3692(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                C0188.m798("When lower bound is specified, upper bound must be Object");
                throw null;
            }
            this.f2656 = AbstractC1917.m3702(typeArr2[0]);
            this.f2655 = Object.class;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC1917.m3706(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f2656;
        return type != null ? new Type[]{type} : AbstractC1917.f9668;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f2655};
    }

    public final int hashCode() {
        Type type = this.f2656;
        return (this.f2655.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.f2656;
        if (type != null) {
            return "? super " + AbstractC1917.m3703(type);
        }
        Type type2 = this.f2655;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC1917.m3703(type2);
    }
}
