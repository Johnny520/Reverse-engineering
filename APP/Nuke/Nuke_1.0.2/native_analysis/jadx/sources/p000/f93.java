package p000;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f93 implements WildcardType {

    /* JADX INFO: renamed from: h */
    public final Type f2876h;

    /* JADX INFO: renamed from: i */
    public final Type f2877i;

    public f93(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            xe1.m6125i(typeArr[0]);
            this.f2877i = null;
            this.f2876h = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        xe1.m6125i(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f2877i = typeArr2[0];
        this.f2876h = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && xe1.m6139p(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f2877i;
        return type != null ? new Type[]{type} : xe1.f12998g;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f2876h};
    }

    public final int hashCode() {
        Type type = this.f2877i;
        return (this.f2876h.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.f2877i;
        if (type != null) {
            return "? super " + xe1.m6136n0(type);
        }
        Type type2 = this.f2876h;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + xe1.m6136n0(type2);
    }
}
