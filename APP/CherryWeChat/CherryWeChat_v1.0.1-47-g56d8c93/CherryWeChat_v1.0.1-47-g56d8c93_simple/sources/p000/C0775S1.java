package p000;

import java.util.Objects;

/* JADX INFO: renamed from: S1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0775S1 extends AbstractC2080j1 {

    /* JADX INFO: renamed from: l */
    public final int f2449l;

    /* JADX INFO: renamed from: m */
    public final int f2450m;

    /* JADX INFO: renamed from: n */
    public final int f2451n;

    /* JADX INFO: renamed from: o */
    public final C2610v1 f2452o;

    public C0775S1(int r1, int r2, int r3, C2610v1 r4) {
        this.f2449l = r1;
        this.f2450m = r2;
        this.f2451n = r3;
        this.f2452o = r4;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C0775S1) == true) goto L5;
        return false;
    L5:
        C0775S1 r42 = (C0775S1) r4;
        if (r42.f2449l == this.f2449l) goto L8;
    L15:
        return false;
    L8:
        if (r42.f2450m != this.f2450m) goto L15;
        if (r42.f2451n != this.f2451n) goto L15;
        if (r42.f2452o != this.f2452o) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f2449l), Integer.valueOf(this.f2450m), Integer.valueOf(this.f2451n), this.f2452o});
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("AesEax Parameters (variant: ");
        r0.append(this.f2452o);
        r0.append(", ");
        r0.append(this.f2450m);
        r0.append("-byte IV, ");
        r0.append(this.f2451n);
        r0.append("-byte tag, and ");
        return AbstractC0213Ey.m409g(r0, this.f2449l, "-byte key)");
    }
}
