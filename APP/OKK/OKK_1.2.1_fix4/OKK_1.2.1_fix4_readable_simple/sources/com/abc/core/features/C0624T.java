package com.abc.core.features;

/* JADX INFO: renamed from: c0.T */
/* JADX INFO: loaded from: classes.dex */
public final class C0624T {

    /* JADX INFO: renamed from: a */
    public final int f1923a;

    /* JADX INFO: renamed from: b */
    public final int f1924b;

    public C0624T(int r1, int r2) {
        this.f1923a = r1;
        this.f1924b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0624T) == true) goto L8;
        return false;
    L8:
        C0624T r52 = (C0624T) r5;
        int r1 = r52.f1923a;
        if (this.f1923a == r1) goto L12;
        return false;
    L12:
        if (this.f1924b == r52.f1924b) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r02 = Integer.hashCode(this.f1923a) * 31;
        return Integer.hashCode(this.f1924b) + r02;
    }

    public final String toString() {
        return "Range(start=" + this.f1923a + ", end=" + this.f1924b + ")";
    }
}
