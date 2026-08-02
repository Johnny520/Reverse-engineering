package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d93 implements GenericArrayType {

    /* JADX INFO: renamed from: h */
    public final Type f1939h;

    public d93(Type type) {
        this.f1939h = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && xe1.m6139p(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f1939h;
    }

    public final int hashCode() {
        return this.f1939h.hashCode();
    }

    public final String toString() {
        return xe1.m6136n0(this.f1939h) + "[]";
    }
}
