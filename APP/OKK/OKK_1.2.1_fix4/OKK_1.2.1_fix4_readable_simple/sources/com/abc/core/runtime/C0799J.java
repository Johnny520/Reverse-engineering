package com.abc.core.runtime;

import p034S.AbstractC0324d;

/* JADX INFO: renamed from: f0.J */
/* JADX INFO: loaded from: classes.dex */
public final class C0799J {

    /* JADX INFO: renamed from: a */
    public final int f2900a;

    /* JADX INFO: renamed from: b */
    public final int f2901b;

    /* JADX INFO: renamed from: c */
    public final int f2902c;

    /* JADX INFO: renamed from: d */
    public final int f2903d;

    /* JADX INFO: renamed from: e */
    public final int f2904e;

    /* JADX INFO: renamed from: f */
    public final int f2905f;

    /* JADX INFO: renamed from: g */
    public final int f2906g;

    /* JADX INFO: renamed from: h */
    public final int f2907h;

    /* JADX INFO: renamed from: i */
    public final int f2908i;

    /* JADX INFO: renamed from: j */
    public final int f2909j;

    /* JADX INFO: renamed from: k */
    public final int f2910k;

    /* JADX INFO: renamed from: l */
    public final int f2911l;

    /* JADX INFO: renamed from: m */
    public final int f2912m;

    /* JADX INFO: renamed from: n */
    public final int f2913n;

    /* JADX INFO: renamed from: o */
    public final boolean f2914o;

    public C0799J(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, boolean r15) {
        this.f2900a = r1;
        this.f2901b = r2;
        this.f2902c = r3;
        this.f2903d = r4;
        this.f2904e = r5;
        this.f2905f = r6;
        this.f2906g = r7;
        this.f2907h = r8;
        this.f2908i = r9;
        this.f2909j = r10;
        this.f2910k = r11;
        this.f2911l = r12;
        this.f2912m = r13;
        this.f2913n = r14;
        this.f2914o = r15;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0799J) == true) goto L8;
        return false;
    L8:
        C0799J r52 = (C0799J) r5;
        int r1 = r52.f2900a;
        if (this.f2900a == r1) goto L12;
        return false;
    L12:
        if (this.f2901b == r52.f2901b) goto L15;
        return false;
    L15:
        if (this.f2902c == r52.f2902c) goto L18;
        return false;
    L18:
        if (this.f2903d == r52.f2903d) goto L21;
        return false;
    L21:
        if (this.f2904e == r52.f2904e) goto L24;
        return false;
    L24:
        if (this.f2905f == r52.f2905f) goto L27;
        return false;
    L27:
        if (this.f2906g == r52.f2906g) goto L30;
        return false;
    L30:
        if (this.f2907h == r52.f2907h) goto L33;
        return false;
    L33:
        if (this.f2908i == r52.f2908i) goto L36;
        return false;
    L36:
        if (this.f2909j == r52.f2909j) goto L39;
        return false;
    L39:
        if (this.f2910k == r52.f2910k) goto L42;
        return false;
    L42:
        if (this.f2911l == r52.f2911l) goto L45;
        return false;
    L45:
        if (this.f2912m == r52.f2912m) goto L48;
        return false;
    L48:
        if (this.f2913n == r52.f2913n) goto L51;
        return false;
    L51:
        if (this.f2914o == r52.f2914o) goto L53;
        return false;
    L53:
        return true;
    }

    public final int hashCode() {
        int r02 = Integer.hashCode(this.f2900a) * 31;
        int r03 = AbstractC0324d.m718a(this.f2901b, r02, 31);
        int r04 = AbstractC0324d.m718a(this.f2902c, r03, 31);
        int r05 = AbstractC0324d.m718a(this.f2903d, r04, 31);
        int r06 = AbstractC0324d.m718a(this.f2904e, r05, 31);
        int r07 = AbstractC0324d.m718a(this.f2905f, r06, 31);
        int r08 = AbstractC0324d.m718a(this.f2906g, r07, 31);
        int r09 = AbstractC0324d.m718a(this.f2907h, r08, 31);
        int r010 = AbstractC0324d.m718a(this.f2908i, r09, 31);
        int r011 = AbstractC0324d.m718a(this.f2909j, r010, 31);
        int r012 = AbstractC0324d.m718a(this.f2910k, r011, 31);
        int r013 = AbstractC0324d.m718a(this.f2911l, r012, 31);
        int r014 = AbstractC0324d.m718a(this.f2912m, r013, 31);
        int r015 = AbstractC0324d.m718a(this.f2913n, r014, 31);
        return Boolean.hashCode(this.f2914o) + r015;
    }

    public final String toString() {
        return "Palette(pageBg=" + this.f2900a + ", surface=" + this.f2901b + ", fieldBg=" + this.f2902c + ", titleC=" + this.f2903d + ", primaryC=" + this.f2904e + ", subC=" + this.f2905f + ", sectionC=" + this.f2906g + ", accent=" + this.f2907h + ", accentSoft=" + this.f2908i + ", divider=" + this.f2909j + ", chevron=" + this.f2910k + ", navIdle=" + this.f2911l + ", statusCardBg=" + this.f2912m + ", statusCardFg=" + this.f2913n + ", night=" + this.f2914o + ")";
    }
}
