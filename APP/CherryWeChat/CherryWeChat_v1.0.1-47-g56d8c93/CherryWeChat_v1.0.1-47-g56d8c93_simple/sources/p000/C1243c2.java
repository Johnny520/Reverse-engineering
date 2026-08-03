package p000;

import java.util.Objects;

/* JADX INFO: renamed from: c2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1243c2 extends AbstractC2080j1 {

    /* JADX INFO: renamed from: l */
    public final int f4227l;

    /* JADX INFO: renamed from: m */
    public final int f4228m;

    /* JADX INFO: renamed from: n */
    public final int f4229n;

    /* JADX INFO: renamed from: o */
    public final C2610v1 f4230o;

    public C1243c2(int r1, int r2, int r3, C2610v1 r4) {
        this.f4227l = r1;
        this.f4228m = r2;
        this.f4229n = r3;
        this.f4230o = r4;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C1243c2) == true) goto L5;
        return false;
    L5:
        C1243c2 r42 = (C1243c2) r4;
        if (r42.f4227l == this.f4227l) goto L8;
    L15:
        return false;
    L8:
        if (r42.f4228m != this.f4228m) goto L15;
        if (r42.f4229n != this.f4229n) goto L15;
        if (r42.f4230o != this.f4230o) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f4227l), Integer.valueOf(this.f4228m), Integer.valueOf(this.f4229n), this.f4230o});
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("AesGcm Parameters (variant: ");
        r0.append(this.f4230o);
        r0.append(", ");
        r0.append(this.f4228m);
        r0.append("-byte IV, ");
        r0.append(this.f4229n);
        r0.append("-byte tag, and ");
        return AbstractC0213Ey.m409g(r0, this.f4227l, "-byte key)");
    }
}
