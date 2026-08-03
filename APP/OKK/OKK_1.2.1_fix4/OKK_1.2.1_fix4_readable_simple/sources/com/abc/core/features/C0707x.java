package com.abc.core.features;

/* JADX INFO: renamed from: c0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0707x {

    /* JADX INFO: renamed from: a */
    public final boolean f2222a;

    /* JADX INFO: renamed from: b */
    public final boolean f2223b;

    /* JADX INFO: renamed from: c */
    public final boolean f2224c;

    /* JADX INFO: renamed from: d */
    public final boolean f2225d;

    /* JADX INFO: renamed from: e */
    public final boolean f2226e;

    public C0707x(boolean r1, boolean r2, boolean r3, boolean r4, boolean r5) {
        this.f2222a = r1;
        this.f2223b = r2;
        this.f2224c = r3;
        this.f2225d = r4;
        this.f2226e = r5;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0707x) == true) goto L8;
        return false;
    L8:
        C0707x r52 = (C0707x) r5;
        boolean r1 = r52.f2222a;
        if (this.f2222a == r1) goto L12;
        return false;
    L12:
        if (this.f2223b == r52.f2223b) goto L15;
        return false;
    L15:
        if (this.f2224c == r52.f2224c) goto L18;
        return false;
    L18:
        if (this.f2225d == r52.f2225d) goto L21;
        return false;
    L21:
        if (this.f2226e == r52.f2226e) goto L23;
        return false;
    L23:
        return true;
    }

    public final int hashCode() {
        int r02 = Boolean.hashCode(this.f2222a) * 31;
        int r1 = (Boolean.hashCode(this.f2223b) + r02) * 31;
        int r03 = (Boolean.hashCode(this.f2224c) + r1) * 31;
        int r12 = (Boolean.hashCode(this.f2225d) + r03) * 31;
        return Boolean.hashCode(this.f2226e) + r12;
    }

    public final String toString() {
        return "AutoLoginWinOptions(enabled=" + this.f2222a + ", syncMsg=" + this.f2223b + ", showDevice=" + this.f2224c + ", autoLoginDevice=" + this.f2225d + ", autoClick=" + this.f2226e + ")";
    }
}
