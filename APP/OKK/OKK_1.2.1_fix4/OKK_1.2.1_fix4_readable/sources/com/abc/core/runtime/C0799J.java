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

    public C0799J(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, boolean z2) {
        this.f2900a = i2;
        this.f2901b = i3;
        this.f2902c = i4;
        this.f2903d = i5;
        this.f2904e = i6;
        this.f2905f = i7;
        this.f2906g = i8;
        this.f2907h = i9;
        this.f2908i = i10;
        this.f2909j = i11;
        this.f2910k = i12;
        this.f2911l = i13;
        this.f2912m = i14;
        this.f2913n = i15;
        this.f2914o = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0799J)) {
            return false;
        }
        C0799J c0799j = (C0799J) obj;
        return this.f2900a == c0799j.f2900a && this.f2901b == c0799j.f2901b && this.f2902c == c0799j.f2902c && this.f2903d == c0799j.f2903d && this.f2904e == c0799j.f2904e && this.f2905f == c0799j.f2905f && this.f2906g == c0799j.f2906g && this.f2907h == c0799j.f2907h && this.f2908i == c0799j.f2908i && this.f2909j == c0799j.f2909j && this.f2910k == c0799j.f2910k && this.f2911l == c0799j.f2911l && this.f2912m == c0799j.f2912m && this.f2913n == c0799j.f2913n && this.f2914o == c0799j.f2914o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2914o) + AbstractC0324d.m718a(this.f2913n, AbstractC0324d.m718a(this.f2912m, AbstractC0324d.m718a(this.f2911l, AbstractC0324d.m718a(this.f2910k, AbstractC0324d.m718a(this.f2909j, AbstractC0324d.m718a(this.f2908i, AbstractC0324d.m718a(this.f2907h, AbstractC0324d.m718a(this.f2906g, AbstractC0324d.m718a(this.f2905f, AbstractC0324d.m718a(this.f2904e, AbstractC0324d.m718a(this.f2903d, AbstractC0324d.m718a(this.f2902c, AbstractC0324d.m718a(this.f2901b, Integer.hashCode(this.f2900a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "Palette(pageBg=" + this.f2900a + ", surface=" + this.f2901b + ", fieldBg=" + this.f2902c + ", titleC=" + this.f2903d + ", primaryC=" + this.f2904e + ", subC=" + this.f2905f + ", sectionC=" + this.f2906g + ", accent=" + this.f2907h + ", accentSoft=" + this.f2908i + ", divider=" + this.f2909j + ", chevron=" + this.f2910k + ", navIdle=" + this.f2911l + ", statusCardBg=" + this.f2912m + ", statusCardFg=" + this.f2913n + ", night=" + this.f2914o + ")";
    }
}
