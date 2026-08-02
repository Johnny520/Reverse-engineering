package p000;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lr0 implements GenericArrayType, Serializable {

    /* JADX INFO: renamed from: h */
    public final Type f6278h;

    public lr0(Type type) {
        Objects.requireNonNull(type);
        this.f6278h = AbstractC0738tl.m5315n(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC0738tl.m5324w(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f6278h;
    }

    public final int hashCode() {
        return this.f6278h.hashCode();
    }

    public final String toString() {
        return AbstractC0738tl.m5305d0(this.f6278h) + "[]";
    }
}
