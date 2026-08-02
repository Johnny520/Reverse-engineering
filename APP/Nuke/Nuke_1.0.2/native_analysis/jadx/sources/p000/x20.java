package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x20 extends AbstractC0147dz {

    /* JADX INFO: renamed from: h */
    public final w20 f12772h;

    public x20(w20 w20Var) {
        if (w20Var.f11990h) {
            throw new x70(null, "mutable instance");
        }
        this.f12772h = w20Var;
    }

    @Override // p000.t23
    /* JADX INFO: renamed from: b */
    public final String mo23b() {
        return this.f12772h.m2695g("{", "}", true);
    }

    @Override // p000.AbstractC0147dz
    /* JADX INFO: renamed from: e */
    public final int mo626e(AbstractC0147dz abstractC0147dz) {
        return this.f12772h.compareTo(((x20) abstractC0147dz).f12772h);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x20)) {
            return false;
        }
        return this.f12772h.equals(((x20) obj).f12772h);
    }

    @Override // p000.AbstractC0147dz
    /* JADX INFO: renamed from: f */
    public final String mo24f() {
        return "array";
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12772h.f5590i);
    }

    public final String toString() {
        return this.f12772h.m2695g("array{", "}", false);
    }
}
