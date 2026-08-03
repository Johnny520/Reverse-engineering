package p050c0;

import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: c0.T0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0625T0 {

    /* JADX INFO: renamed from: a */
    public final boolean f1925a;

    /* JADX INFO: renamed from: b */
    public final String f1926b;

    /* JADX INFO: renamed from: c */
    public final String f1927c;

    /* JADX INFO: renamed from: d */
    public final float f1928d;

    /* JADX INFO: renamed from: e */
    public final int f1929e;

    /* JADX INFO: renamed from: f */
    public final int f1930f;

    /* JADX INFO: renamed from: g */
    public final int f1931g;

    /* JADX INFO: renamed from: h */
    public final int f1932h;

    /* JADX INFO: renamed from: i */
    public final int f1933i;

    /* JADX INFO: renamed from: j */
    public final int f1934j;

    /* JADX INFO: renamed from: k */
    public final boolean f1935k;

    public /* synthetic */ C0625T0() {
        this(true, "${time} ${relativeTime}", "MM-dd HH:mm:ss", 12.0f, 0, 0, 0, -855638017, -436207616, -855638017, false);
    }

    /* JADX INFO: renamed from: a */
    public final int m1526a(boolean r3) {
        int r02 = this.f1931g;
        int r1 = this.f1930f;
        if (r1 != 0) goto L7;
        if (r02 != 0) goto L7;
        return this.f1929e;
    L7:
        if (r3 == true) goto L9;
        return r02;
    L9:
        return r1;
    }

    /* JADX INFO: renamed from: b */
    public final int m1527b(boolean r3) {
        int r02 = this.f1931g;
        int r1 = this.f1930f;
        if (r1 != 0) goto L7;
        if (r02 != 0) goto L7;
        return this.f1929e;
    L7:
        if (r3 == false) goto L10;
        return r02;
    L10:
        return r1;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0625T0) == true) goto L8;
        return false;
    L8:
        C0625T0 r52 = (C0625T0) r5;
        boolean r1 = r52.f1925a;
        if (this.f1925a == r1) goto L12;
        return false;
    L12:
        if (AbstractC0307g.m699a(this.f1926b, r52.f1926b) == true) goto L15;
        return false;
    L15:
        if (AbstractC0307g.m699a(this.f1927c, r52.f1927c) == true) goto L18;
        return false;
    L18:
        if (Float.compare(this.f1928d, r52.f1928d) == 0) goto L21;
        return false;
    L21:
        if (this.f1929e == r52.f1929e) goto L24;
        return false;
    L24:
        if (this.f1930f == r52.f1930f) goto L27;
        return false;
    L27:
        if (this.f1931g == r52.f1931g) goto L30;
        return false;
    L30:
        if (this.f1932h == r52.f1932h) goto L33;
        return false;
    L33:
        if (this.f1933i == r52.f1933i) goto L36;
        return false;
    L36:
        if (this.f1934j == r52.f1934j) goto L39;
        return false;
    L39:
        if (this.f1935k == r52.f1935k) goto L41;
        return false;
    L41:
        return true;
    }

    public final int hashCode() {
        int r02 = Boolean.hashCode(this.f1925a) * 31;
        int r2 = (this.f1926b.hashCode() + r02) * 31;
        int r03 = (this.f1927c.hashCode() + r2) * 31;
        int r22 = (Float.hashCode(this.f1928d) + r03) * 31;
        int r04 = AbstractC0324d.m718a(this.f1929e, r22, 31);
        int r05 = AbstractC0324d.m718a(this.f1930f, r04, 31);
        int r06 = AbstractC0324d.m718a(this.f1931g, r05, 31);
        int r07 = AbstractC0324d.m718a(this.f1932h, r06, 31);
        int r08 = AbstractC0324d.m718a(this.f1933i, r07, 31);
        int r09 = AbstractC0324d.m718a(this.f1934j, r08, 31);
        return Boolean.hashCode(this.f1935k) + r09;
    }

    public final String toString() {
        return "MessageDetailOptions(enabled=" + this.f1925a + ", template=" + this.f1926b + ", timePattern=" + this.f1927c + ", textSizeSp=" + this.f1928d + ", horizontalMarginDp=" + this.f1929e + ", leftMarginDp=" + this.f1930f + ", rightMarginDp=" + this.f1931g + ", textColor=" + this.f1932h + ", textColorLight=" + this.f1933i + ", textColorDark=" + this.f1934j + ", clickToShow=" + this.f1935k + ")";
    }

    public C0625T0(boolean r2, String r3, String r4, float r5, int r6, int r7, int r8, int r9, int r10, int r11, boolean r12) {
        AbstractC0307g.m703e(r3, "template");
        AbstractC0307g.m703e(r4, "timePattern");
        this.f1925a = r2;
        this.f1926b = r3;
        this.f1927c = r4;
        this.f1928d = r5;
        this.f1929e = r6;
        this.f1930f = r7;
        this.f1931g = r8;
        this.f1932h = r9;
        this.f1933i = r10;
        this.f1934j = r11;
        this.f1935k = r12;
    }
}
