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

    public C0285Gk(int i, int i2, C2610v1 c2610v1, C2610v1 c2610v12) {
        this.f926l = i;
        this.f927m = i2;
        this.f928n = c2610v1;
        this.f929o = c2610v12;
    }

    /* JADX INFO: renamed from: N */
    public final int m572N() {
        C2610v1 c2610v1 = C2610v1.f8995A;
        int i = this.f927m;
        C2610v1 c2610v12 = this.f928n;
        if (c2610v12 == c2610v1) {
            return i;
        }
        if (c2610v12 != C2610v1.f9023x && c2610v12 != C2610v1.f9024y && c2610v12 != C2610v1.f9025z) {
            throw new IllegalStateException("Unknown variant");
        }
        return i + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0285Gk)) {
            return false;
        }
        C0285Gk c0285Gk = (C0285Gk) obj;
        return c0285Gk.f926l == this.f926l && c0285Gk.m572N() == m572N() && c0285Gk.f928n == this.f928n && c0285Gk.f929o == this.f929o;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f926l), Integer.valueOf(this.f927m), this.f928n, this.f929o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.f928n);
        sb.append(", hashType: ");
        sb.append(this.f929o);
        sb.append(", ");
        sb.append(this.f927m);
        sb.append("-byte tags, and ");
        return AbstractC0213Ey.m409g(sb, this.f926l, "-byte key)");
    }
}
