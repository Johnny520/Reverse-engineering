package p000;

import java.util.Objects;

/* JADX INFO: renamed from: k2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2125k2 extends AbstractC2080j1 {

    /* JADX INFO: renamed from: l */
    public final int f7456l;

    /* JADX INFO: renamed from: m */
    public final C2610v1 f7457m;

    public C2125k2(int r1, C2610v1 r2) {
        this.f7456l = r1;
        this.f7457m = r2;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C2125k2) == true) goto L5;
        return false;
    L5:
        C2125k2 r42 = (C2125k2) r4;
        if (r42.f7456l == this.f7456l) goto L8;
    L11:
        return false;
    L8:
        if (r42.f7457m != this.f7457m) goto L11;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f7456l), this.f7457m});
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("AesGcmSiv Parameters (variant: ");
        r0.append(this.f7457m);
        r0.append(", ");
        return AbstractC0213Ey.m409g(r0, this.f7456l, "-byte key)");
    }
}
