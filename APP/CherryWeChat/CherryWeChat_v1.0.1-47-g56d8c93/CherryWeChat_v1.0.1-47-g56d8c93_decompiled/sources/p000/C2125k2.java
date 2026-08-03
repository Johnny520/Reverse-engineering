package p000;

import java.util.Objects;

/* JADX INFO: renamed from: k2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2125k2 extends AbstractC2080j1 {

    /* JADX INFO: renamed from: l */
    public final int f7456l;

    /* JADX INFO: renamed from: m */
    public final C2610v1 f7457m;

    public C2125k2(int i, C2610v1 c2610v1) {
        this.f7456l = i;
        this.f7457m = c2610v1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2125k2)) {
            return false;
        }
        C2125k2 c2125k2 = (C2125k2) obj;
        return c2125k2.f7456l == this.f7456l && c2125k2.f7457m == this.f7457m;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f7456l), this.f7457m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.f7457m);
        sb.append(", ");
        return AbstractC0213Ey.m409g(sb, this.f7456l, "-byte key)");
    }
}
