package p027E4;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: renamed from: E4.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0313a0 implements WildcardType {

    /* JADX INFO: renamed from: d */
    public final Type f1029d;

    /* JADX INFO: renamed from: e */
    public final Type f1030e;

    public C0313a0(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            AbstractC0315b0.m533d(typeArr[0]);
            this.f1030e = null;
            this.f1029d = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        AbstractC0315b0.m533d(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f1030e = typeArr2[0];
        this.f1029d = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC0315b0.m534e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f1030e;
        return type != null ? new Type[]{type} : AbstractC0315b0.f1038a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f1029d};
    }

    public final int hashCode() {
        Type type = this.f1030e;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f1029d.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f1030e;
        if (type != null) {
            return "? super " + AbstractC0315b0.m548s(type);
        }
        Type type2 = this.f1029d;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC0315b0.m548s(type2);
    }
}
