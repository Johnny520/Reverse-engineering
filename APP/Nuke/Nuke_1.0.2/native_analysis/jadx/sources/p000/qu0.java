package p000;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qu0 {

    /* JADX INFO: renamed from: a */
    public final Constructor f9169a;

    /* JADX INFO: renamed from: b */
    public final Object[] f9170b;

    public qu0(Constructor constructor, Object[] objArr) {
        this.f9169a = constructor;
        this.f9170b = objArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu0)) {
            return false;
        }
        qu0 qu0Var = (qu0) obj;
        return this.f9169a.equals(qu0Var.f9169a) && this.f9170b.equals(qu0Var.f9170b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9170b) + (this.f9169a.hashCode() * 31);
    }

    public final String toString() {
        return "ResolvedConstructor(constructor=" + this.f9169a + ", arguments=" + Arrays.toString(this.f9170b) + ")";
    }
}
