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

    public C2653w1(int i, int i2, C2610v1 c2610v1) {
        this.f9185l = i;
        this.f9186m = i2;
        this.f9187n = c2610v1;
    }

    /* JADX INFO: renamed from: N */
    public final int m5185N() {
        C2610v1 c2610v1 = C2610v1.f9005f;
        int i = this.f9186m;
        C2610v1 c2610v12 = this.f9187n;
        if (c2610v12 == c2610v1) {
            return i;
        }
        if (c2610v12 != C2610v1.f9002c && c2610v12 != C2610v1.f9003d && c2610v12 != C2610v1.f9004e) {
            throw new IllegalStateException("Unknown variant");
        }
        return i + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2653w1)) {
            return false;
        }
        C2653w1 c2653w1 = (C2653w1) obj;
        return c2653w1.f9185l == this.f9185l && c2653w1.m5185N() == m5185N() && c2653w1.f9187n == this.f9187n;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f9185l), Integer.valueOf(this.f9186m), this.f9187n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.f9187n);
        sb.append(", ");
        sb.append(this.f9186m);
        sb.append("-byte tags, and ");
        return AbstractC0213Ey.m409g(sb, this.f9185l, "-byte key)");
    }
}
