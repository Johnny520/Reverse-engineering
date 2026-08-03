package p000;

import android.graphics.Insets;

/* JADX INFO: renamed from: yl */
/* JADX INFO: loaded from: classes.dex */
public final class C2765yl {

    /* JADX INFO: renamed from: e */
    public static final C2765yl f9404e = new C2765yl(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f9405a;

    /* JADX INFO: renamed from: b */
    public final int f9406b;

    /* JADX INFO: renamed from: c */
    public final int f9407c;

    /* JADX INFO: renamed from: d */
    public final int f9408d;

    public C2765yl(int i, int i2, int i3, int i4) {
        this.f9405a = i;
        this.f9406b = i2;
        this.f9407c = i3;
        this.f9408d = i4;
    }

    /* JADX INFO: renamed from: a */
    public static C2765yl m5336a(C2765yl c2765yl, C2765yl c2765yl2) {
        return m5337b(Math.max(c2765yl.f9405a, c2765yl2.f9405a), Math.max(c2765yl.f9406b, c2765yl2.f9406b), Math.max(c2765yl.f9407c, c2765yl2.f9407c), Math.max(c2765yl.f9408d, c2765yl2.f9408d));
    }

    /* JADX INFO: renamed from: b */
    public static C2765yl m5337b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f9404e : new C2765yl(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static C2765yl m5338c(Insets insets) {
        return m5337b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: d */
    public final Insets m5339d() {
        return AbstractC2785z4.m5357b(this.f9405a, this.f9406b, this.f9407c, this.f9408d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2765yl.class != obj.getClass()) {
            return false;
        }
        C2765yl c2765yl = (C2765yl) obj;
        return this.f9408d == c2765yl.f9408d && this.f9405a == c2765yl.f9405a && this.f9407c == c2765yl.f9407c && this.f9406b == c2765yl.f9406b;
    }

    public final int hashCode() {
        return (((((this.f9405a * 31) + this.f9406b) * 31) + this.f9407c) * 31) + this.f9408d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f9405a);
        sb.append(", top=");
        sb.append(this.f9406b);
        sb.append(", right=");
        sb.append(this.f9407c);
        sb.append(", bottom=");
        return AbstractC0213Ey.m408f(sb, this.f9408d, '}');
    }
}
