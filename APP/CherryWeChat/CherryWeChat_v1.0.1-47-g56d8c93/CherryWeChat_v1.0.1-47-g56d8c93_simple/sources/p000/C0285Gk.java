package p000;

import java.util.Objects;

/* JADX INFO: renamed from: Gk */
/* JADX INFO: loaded from: classes.dex */
public final class C0285Gk extends AbstractC2080j1 {

    /* JADX INFO: renamed from: l */
    public final int f926l;

    /* JADX INFO: renamed from: m */
    public final int f927m;

    /* JADX INFO: renamed from: n */
    public final C2610v1 f928n;

    /* JADX INFO: renamed from: o */
    public final C2610v1 f929o;

    public C0285Gk(int r1, int r2, C2610v1 r3, C2610v1 r4) {
        this.f926l = r1;
        this.f927m = r2;
        this.f928n = r3;
        this.f929o = r4;
    }

    /* JADX INFO: renamed from: N */
    public final int m572N() {
        C2610v1 r0 = C2610v1.f8995A;
        int r1 = this.f927m;
        C2610v1 r2 = this.f928n;
        if (r2 != r0) goto L6;
        return r1;
    L6:
        if (r2 != C2610v1.f9023x) goto L10;
        return r1 + 5;
    L10:
        if (r2 != C2610v1.f9024y) goto L14;
        return r1 + 5;
    L14:
        if (r2 != C2610v1.f9025z) goto L18;
        return r1 + 5;
    L18:
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C0285Gk) == true) goto L5;
        return false;
    L5:
        C0285Gk r42 = (C0285Gk) r4;
        if (r42.f926l == this.f926l) goto L8;
    L15:
        return false;
    L8:
        if (r42.m572N() != m572N()) goto L15;
        if (r42.f928n != this.f928n) goto L15;
        if (r42.f929o != this.f929o) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f926l), Integer.valueOf(this.f927m), this.f928n, this.f929o});
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("HMAC Parameters (variant: ");
        r0.append(this.f928n);
        r0.append(", hashType: ");
        r0.append(this.f929o);
        r0.append(", ");
        r0.append(this.f927m);
        r0.append("-byte tags, and ");
        return AbstractC0213Ey.m409g(r0, this.f926l, "-byte key)");
    }
}
