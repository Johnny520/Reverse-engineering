package com.abc.core.features;

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
    public final int m1526a(boolean z2) {
        int i2 = this.f1931g;
        int i3 = this.f1930f;
        return (i3 == 0 && i2 == 0) ? this.f1929e : z2 ? i3 : i2;
    }

    /* JADX INFO: renamed from: b */
    public final int m1527b(boolean z2) {
        int i2 = this.f1931g;
        int i3 = this.f1930f;
        return (i3 == 0 && i2 == 0) ? this.f1929e : z2 ? i2 : i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0625T0)) {
            return false;
        }
        C0625T0 c0625t0 = (C0625T0) obj;
        return this.f1925a == c0625t0.f1925a && AbstractC0307g.m699a(this.f1926b, c0625t0.f1926b) && AbstractC0307g.m699a(this.f1927c, c0625t0.f1927c) && Float.compare(this.f1928d, c0625t0.f1928d) == 0 && this.f1929e == c0625t0.f1929e && this.f1930f == c0625t0.f1930f && this.f1931g == c0625t0.f1931g && this.f1932h == c0625t0.f1932h && this.f1933i == c0625t0.f1933i && this.f1934j == c0625t0.f1934j && this.f1935k == c0625t0.f1935k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1935k) + AbstractC0324d.m718a(this.f1934j, AbstractC0324d.m718a(this.f1933i, AbstractC0324d.m718a(this.f1932h, AbstractC0324d.m718a(this.f1931g, AbstractC0324d.m718a(this.f1930f, AbstractC0324d.m718a(this.f1929e, (Float.hashCode(this.f1928d) + ((this.f1927c.hashCode() + ((this.f1926b.hashCode() + (Boolean.hashCode(this.f1925a) * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "MessageDetailOptions(enabled=" + this.f1925a + ", template=" + this.f1926b + ", timePattern=" + this.f1927c + ", textSizeSp=" + this.f1928d + ", horizontalMarginDp=" + this.f1929e + ", leftMarginDp=" + this.f1930f + ", rightMarginDp=" + this.f1931g + ", textColor=" + this.f1932h + ", textColorLight=" + this.f1933i + ", textColorDark=" + this.f1934j + ", clickToShow=" + this.f1935k + ")";
    }

    public C0625T0(boolean z2, String str, String str2, float f2, int i2, int i3, int i4, int i5, int i6, int i7, boolean z3) {
        AbstractC0307g.m703e(str, "template");
        AbstractC0307g.m703e(str2, "timePattern");
        this.f1925a = z2;
        this.f1926b = str;
        this.f1927c = str2;
        this.f1928d = f2;
        this.f1929e = i2;
        this.f1930f = i3;
        this.f1931g = i4;
        this.f1932h = i5;
        this.f1933i = i6;
        this.f1934j = i7;
        this.f1935k = z3;
    }
}
