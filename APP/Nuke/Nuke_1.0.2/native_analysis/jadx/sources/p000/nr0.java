package p000;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nr0 implements WildcardType, Serializable {

    /* JADX INFO: renamed from: h */
    public final Type f7303h;

    /* JADX INFO: renamed from: i */
    public final Type f7304i;

    public nr0(Type[] typeArr, Type[] typeArr2) {
        rg3.m4483s(typeArr2.length <= 1);
        rg3.m4483s(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            AbstractC0738tl.m5317p(typeArr[0]);
            this.f7304i = null;
            this.f7303h = AbstractC0738tl.m5315n(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        AbstractC0738tl.m5317p(typeArr2[0]);
        rg3.m4483s(typeArr[0] == Object.class);
        this.f7304i = AbstractC0738tl.m5315n(typeArr2[0]);
        this.f7303h = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC0738tl.m5324w(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f7304i;
        return type != null ? new Type[]{type} : AbstractC0738tl.f10823d;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f7303h};
    }

    public final int hashCode() {
        Type type = this.f7304i;
        return (this.f7303h.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.f7304i;
        if (type != null) {
            return "? super " + AbstractC0738tl.m5305d0(type);
        }
        Type type2 = this.f7303h;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC0738tl.m5305d0(type2);
    }
}
