package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f93 implements WildcardType {
    public final Type h;
    public final Type i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f93(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            xe1.i(typeArr[0]);
            this.i = null;
            this.h = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        xe1.i(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.i = typeArr2[0];
        this.h = Object.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && xe1.p(this, (WildcardType) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.i;
        return type != null ? new Type[]{type} : xe1.g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.h};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Type type = this.i;
        return (this.h.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        Type type = this.i;
        if (type != null) {
            return "? super " + xe1.n0(type);
        }
        Type type2 = this.h;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + xe1.n0(type2);
    }
}
