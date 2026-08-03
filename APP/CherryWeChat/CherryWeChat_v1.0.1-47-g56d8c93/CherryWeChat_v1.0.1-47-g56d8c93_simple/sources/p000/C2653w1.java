package p000;

import java.util.Objects;

/* JADX INFO: renamed from: w1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2653w1 extends AbstractC2080j1 {

    /* JADX INFO: renamed from: l */
    public final int f9185l;

    /* JADX INFO: renamed from: m */
    public final int f9186m;

    /* JADX INFO: renamed from: n */
    public final C2610v1 f9187n;

    public C2653w1(int r1, int r2, C2610v1 r3) {
        this.f9185l = r1;
        this.f9186m = r2;
        this.f9187n = r3;
    }

    /* JADX INFO: renamed from: N */
    public final int m5185N() {
        C2610v1 r0 = C2610v1.f9005f;
        int r1 = this.f9186m;
        C2610v1 r2 = this.f9187n;
        if (r2 != r0) goto L6;
        return r1;
    L6:
        if (r2 != C2610v1.f9002c) goto L10;
        return r1 + 5;
    L10:
        if (r2 != C2610v1.f9003d) goto L14;
        return r1 + 5;
    L14:
        if (r2 != C2610v1.f9004e) goto L18;
        return r1 + 5;
    L18:
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C2653w1) == true) goto L5;
        return false;
    L5:
        C2653w1 r42 = (C2653w1) r4;
        if (r42.f9185l == this.f9185l) goto L8;
    L13:
        return false;
    L8:
        if (r42.m5185N() != m5185N()) goto L13;
        if (r42.f9187n != this.f9187n) goto L13;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f9185l), Integer.valueOf(this.f9186m), this.f9187n});
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("AES-CMAC Parameters (variant: ");
        r0.append(this.f9187n);
        r0.append(", ");
        r0.append(this.f9186m);
        r0.append("-byte tags, and ");
        return AbstractC0213Ey.m409g(r0, this.f9185l, "-byte key)");
    }
}
