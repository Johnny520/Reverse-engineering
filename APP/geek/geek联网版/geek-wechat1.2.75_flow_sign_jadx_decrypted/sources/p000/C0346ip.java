package p000;

import android.graphics.Insets;

/* JADX INFO: renamed from: ip */
/* JADX INFO: loaded from: classes.dex */
public final class C0346ip {

    /* JADX INFO: renamed from: e */
    public static final C0346ip f2570e = new C0346ip(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f2571a;

    /* JADX INFO: renamed from: b */
    public final int f2572b;

    /* JADX INFO: renamed from: c */
    public final int f2573c;

    /* JADX INFO: renamed from: d */
    public final int f2574d;

    public C0346ip(int i, int i2, int i3, int i4) {
        this.f2571a = i;
        this.f2572b = i2;
        this.f2573c = i3;
        this.f2574d = i4;
    }

    /* JADX INFO: renamed from: a */
    public static C0346ip m1523a(C0346ip c0346ip, C0346ip c0346ip2) {
        return m1524b(Math.max(c0346ip.f2571a, c0346ip2.f2571a), Math.max(c0346ip.f2572b, c0346ip2.f2572b), Math.max(c0346ip.f2573c, c0346ip2.f2573c), Math.max(c0346ip.f2574d, c0346ip2.f2574d));
    }

    /* JADX INFO: renamed from: b */
    public static C0346ip m1524b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f2570e : new C0346ip(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static C0346ip m1525c(Insets insets) {
        return m1524b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: d */
    public final Insets m1526d() {
        return AbstractC0306hp.m1411a(this.f2571a, this.f2572b, this.f2573c, this.f2574d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0346ip.class != obj.getClass()) {
            return false;
        }
        C0346ip c0346ip = (C0346ip) obj;
        return this.f2574d == c0346ip.f2574d && this.f2571a == c0346ip.f2571a && this.f2573c == c0346ip.f2573c && this.f2572b == c0346ip.f2572b;
    }

    public final int hashCode() {
        return (((((this.f2571a * 31) + this.f2572b) * 31) + this.f2573c) * 31) + this.f2574d;
    }

    public final String toString() {
        return "Insets{left=" + this.f2571a + ", top=" + this.f2572b + ", right=" + this.f2573c + ", bottom=" + this.f2574d + '}';
    }
}
