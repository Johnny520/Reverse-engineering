package com.abc.core.features;

import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: c0.K0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0601K0 {

    /* JADX INFO: renamed from: a */
    public final String f1835a;

    /* JADX INFO: renamed from: b */
    public final int f1836b;

    /* JADX INFO: renamed from: c */
    public final int f1837c;

    /* JADX INFO: renamed from: d */
    public final int f1838d;

    /* JADX INFO: renamed from: e */
    public final int f1839e;

    /* JADX INFO: renamed from: f */
    public final int f1840f;

    /* JADX INFO: renamed from: g */
    public final int f1841g;

    /* JADX INFO: renamed from: h */
    public final int f1842h;

    public C0601K0(String r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        AbstractC0307g.m703e(r2, "dateKey");
        this.f1835a = r2;
        this.f1836b = r3;
        this.f1837c = r4;
        this.f1838d = r5;
        this.f1839e = r6;
        this.f1840f = r7;
        this.f1841g = r8;
        this.f1842h = r9;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0601K0) == true) goto L8;
        return false;
    L8:
        C0601K0 r52 = (C0601K0) r5;
        String r1 = r52.f1835a;
        if (AbstractC0307g.m699a(this.f1835a, r1) == true) goto L12;
        return false;
    L12:
        if (this.f1836b == r52.f1836b) goto L15;
        return false;
    L15:
        if (this.f1837c == r52.f1837c) goto L18;
        return false;
    L18:
        if (this.f1838d == r52.f1838d) goto L21;
        return false;
    L21:
        if (this.f1839e == r52.f1839e) goto L24;
        return false;
    L24:
        if (this.f1840f == r52.f1840f) goto L27;
        return false;
    L27:
        if (this.f1841g == r52.f1841g) goto L30;
        return false;
    L30:
        if (this.f1842h == r52.f1842h) goto L32;
        return false;
    L32:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f1835a.hashCode() * 31;
        int r03 = AbstractC0324d.m718a(this.f1836b, r02, 31);
        int r04 = AbstractC0324d.m718a(this.f1837c, r03, 31);
        int r05 = AbstractC0324d.m718a(this.f1838d, r04, 31);
        int r06 = AbstractC0324d.m718a(this.f1839e, r05, 31);
        int r07 = AbstractC0324d.m718a(this.f1840f, r06, 31);
        int r08 = AbstractC0324d.m718a(this.f1841g, r07, 31);
        return Integer.hashCode(this.f1842h) + r08;
    }

    public final String toString() {
        return "InputStatsSnapshot(dateKey=" + this.f1835a + ", totalMsg=" + this.f1836b + ", textMsg=" + this.f1837c + ", textWord=" + this.f1838d + ", emojiMsg=" + this.f1839e + ", transferMsg=" + this.f1840f + ", redBagMsg=" + this.f1841g + ", fileMsg=" + this.f1842h + ")";
    }
}
