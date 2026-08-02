package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nr0 implements WildcardType, Serializable {
    public final Type h;
    public final Type i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nr0(Type[] typeArr, Type[] typeArr2) {
        rg3.s(typeArr2.length <= 1);
        rg3.s(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            tl.p(typeArr[0]);
            this.i = null;
            this.h = tl.n(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        tl.p(typeArr2[0]);
        rg3.s(typeArr[0] == Object.class);
        this.i = tl.n(typeArr2[0]);
        this.h = Object.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && tl.w(this, (WildcardType) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.i;
        return type != null ? new Type[]{type} : tl.d;
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
            return "? super " + tl.d0(type);
        }
        Type type2 = this.h;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + tl.d0(type2);
    }
}
