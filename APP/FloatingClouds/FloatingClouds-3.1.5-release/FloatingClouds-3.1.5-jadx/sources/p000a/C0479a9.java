package p000a;

import android.graphics.Insets;

/* JADX INFO: renamed from: a.a9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0479a9 {

    /* JADX INFO: renamed from: e */
    public static final C0479a9 f1797e = new C0479a9(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f1798a;

    /* JADX INFO: renamed from: b */
    public final int f1799b;

    /* JADX INFO: renamed from: c */
    public final int f1800c;

    /* JADX INFO: renamed from: d */
    public final int f1801d;

    /* JADX INFO: renamed from: a.a9$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Insets m1168a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public C0479a9(int i, int i2, int i3, int i4) {
        this.f1798a = i;
        this.f1799b = i2;
        this.f1800c = i3;
        this.f1801d = i4;
    }

    /* JADX INFO: renamed from: a */
    public static C0479a9 m1164a(C0479a9 c0479a9, C0479a9 c0479a92) {
        return m1165b(Math.max(c0479a9.f1798a, c0479a92.f1798a), Math.max(c0479a9.f1799b, c0479a92.f1799b), Math.max(c0479a9.f1800c, c0479a92.f1800c), Math.max(c0479a9.f1801d, c0479a92.f1801d));
    }

    /* JADX INFO: renamed from: b */
    public static C0479a9 m1165b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f1797e : new C0479a9(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static C0479a9 m1166c(Insets insets) {
        return m1165b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: d */
    public final Insets m1167d() {
        return a.m1168a(this.f1798a, this.f1799b, this.f1800c, this.f1801d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0479a9.class != obj.getClass()) {
            return false;
        }
        C0479a9 c0479a9 = (C0479a9) obj;
        return this.f1801d == c0479a9.f1801d && this.f1798a == c0479a9.f1798a && this.f1800c == c0479a9.f1800c && this.f1799b == c0479a9.f1799b;
    }

    public final int hashCode() {
        return (((((this.f1798a * 31) + this.f1799b) * 31) + this.f1800c) * 31) + this.f1801d;
    }

    public final String toString() {
        return "Insets{left=" + this.f1798a + ", top=" + this.f1799b + ", right=" + this.f1800c + ", bottom=" + this.f1801d + '}';
    }
}
