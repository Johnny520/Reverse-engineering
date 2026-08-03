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

    public C1243c2(int i, int i2, int i3, C2610v1 c2610v1) {
        this.f4227l = i;
        this.f4228m = i2;
        this.f4229n = i3;
        this.f4230o = c2610v1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1243c2)) {
            return false;
        }
        C1243c2 c1243c2 = (C1243c2) obj;
        return c1243c2.f4227l == this.f4227l && c1243c2.f4228m == this.f4228m && c1243c2.f4229n == this.f4229n && c1243c2.f4230o == this.f4230o;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4227l), Integer.valueOf(this.f4228m), Integer.valueOf(this.f4229n), this.f4230o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.f4230o);
        sb.append(", ");
        sb.append(this.f4228m);
        sb.append("-byte IV, ");
        sb.append(this.f4229n);
        sb.append("-byte tag, and ");
        return AbstractC0213Ey.m409g(sb, this.f4227l, "-byte key)");
    }
}
