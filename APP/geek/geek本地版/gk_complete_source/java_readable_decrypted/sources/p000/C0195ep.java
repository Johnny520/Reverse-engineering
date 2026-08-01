package p000;

import android.graphics.Insets;

/* JADX INFO: renamed from: ep */
/* JADX INFO: loaded from: classes.dex */
public final class C0195ep {

    /* JADX INFO: renamed from: e */
    public static final C0195ep f1827e = new C0195ep(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f1828a;

    /* JADX INFO: renamed from: b */
    public final int f1829b;

    /* JADX INFO: renamed from: c */
    public final int f1830c;

    /* JADX INFO: renamed from: d */
    public final int f1831d;

    public C0195ep(int i, int i2, int i3, int i4) {
        this.f1828a = i;
        this.f1829b = i2;
        this.f1830c = i3;
        this.f1831d = i4;
    }

    /* JADX INFO: renamed from: a */
    public static C0195ep m1049a(C0195ep c0195ep, C0195ep c0195ep2) {
        return m1050b(Math.max(c0195ep.f1828a, c0195ep2.f1828a), Math.max(c0195ep.f1829b, c0195ep2.f1829b), Math.max(c0195ep.f1830c, c0195ep2.f1830c), Math.max(c0195ep.f1831d, c0195ep2.f1831d));
    }

    /* JADX INFO: renamed from: b */
    public static C0195ep m1050b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f1827e : new C0195ep(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static C0195ep m1051c(Insets insets) {
        return m1050b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: d */
    public final Insets m1052d() {
        return AbstractC0158dp.m948a(this.f1828a, this.f1829b, this.f1830c, this.f1831d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0195ep.class != obj.getClass()) {
            return false;
        }
        C0195ep c0195ep = (C0195ep) obj;
        return this.f1831d == c0195ep.f1831d && this.f1828a == c0195ep.f1828a && this.f1830c == c0195ep.f1830c && this.f1829b == c0195ep.f1829b;
    }

    public final int hashCode() {
        return (((((this.f1828a * 31) + this.f1829b) * 31) + this.f1830c) * 31) + this.f1831d;
    }

    public final String toString() {
        return "Insets{left=" + this.f1828a + ", top=" + this.f1829b + ", right=" + this.f1830c + ", bottom=" + this.f1831d + '}';
    }
}
