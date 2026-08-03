package com.abc.core.features;

import p034S.AbstractC0324d;

/* JADX INFO: renamed from: c0.X */
/* JADX INFO: loaded from: classes.dex */
public final class C0632X {

    /* JADX INFO: renamed from: a */
    public final float f1944a;

    /* JADX INFO: renamed from: b */
    public final float f1945b;

    /* JADX INFO: renamed from: c */
    public final int f1946c;

    /* JADX INFO: renamed from: d */
    public boolean f1947d;

    public C0632X(float r1, float r2, int r3) {
        this.f1944a = r1;
        this.f1945b = r2;
        this.f1946c = r3;
        this.f1947d = false;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0632X) == true) goto L8;
        return false;
    L8:
        C0632X r52 = (C0632X) r5;
        float r1 = r52.f1944a;
        if (Float.compare(this.f1944a, r1) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.f1945b, r52.f1945b) == 0) goto L15;
        return false;
    L15:
        if (this.f1946c == r52.f1946c) goto L18;
        return false;
    L18:
        if (this.f1947d == r52.f1947d) goto L20;
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        int r02 = Float.hashCode(this.f1944a) * 31;
        int r2 = (Float.hashCode(this.f1945b) + r02) * 31;
        int r03 = AbstractC0324d.m718a(this.f1946c, r2, 31);
        return Boolean.hashCode(this.f1947d) + r03;
    }

    public final String toString() {
        return "SwipeState(initialRawX=" + this.f1944a + ", initialRawY=" + this.f1945b + ", touchSlop=" + this.f1946c + ", dragging=" + this.f1947d + ")";
    }
}
