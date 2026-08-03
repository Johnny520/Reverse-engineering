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

    public C0775S1(int i, int i2, int i3, C2610v1 c2610v1) {
        this.f2449l = i;
        this.f2450m = i2;
        this.f2451n = i3;
        this.f2452o = c2610v1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0775S1)) {
            return false;
        }
        C0775S1 c0775s1 = (C0775S1) obj;
        return c0775s1.f2449l == this.f2449l && c0775s1.f2450m == this.f2450m && c0775s1.f2451n == this.f2451n && c0775s1.f2452o == this.f2452o;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2449l), Integer.valueOf(this.f2450m), Integer.valueOf(this.f2451n), this.f2452o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(this.f2452o);
        sb.append(", ");
        sb.append(this.f2450m);
        sb.append("-byte IV, ");
        sb.append(this.f2451n);
        sb.append("-byte tag, and ");
        return AbstractC0213Ey.m409g(sb, this.f2449l, "-byte key)");
    }
}
