package com.abc.core.features;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0709x1 {

    /* JADX INFO: renamed from: a */
    public final boolean f2230a;

    /* JADX INFO: renamed from: b */
    public final float f2231b;

    /* JADX INFO: renamed from: c */
    public final String f2232c;

    /* JADX INFO: renamed from: d */
    public final long f2233d;

    public C0709x1(boolean r2, float r3, String r4, long r5) {
        AbstractC0307g.m703e(r4, "source");
        this.f2230a = r2;
        this.f2231b = r3;
        this.f2232c = r4;
        this.f2233d = r5;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C0709x1) == true) goto L8;
        return false;
    L8:
        C0709x1 r82 = (C0709x1) r8;
        boolean r1 = r82.f2230a;
        if (this.f2230a == r1) goto L12;
        return false;
    L12:
        if (Float.compare(this.f2231b, r82.f2231b) == 0) goto L15;
        return false;
    L15:
        if (AbstractC0307g.m699a(this.f2232c, r82.f2232c) == true) goto L18;
        return false;
    L18:
        if (this.f2233d == r82.f2233d) goto L20;
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        int r02 = Boolean.hashCode(this.f2230a) * 31;
        int r1 = (Float.hashCode(this.f2231b) + r02) * 31;
        int r03 = (this.f2232c.hashCode() + r1) * 31;
        return Long.hashCode(this.f2233d) + r03;
    }

    public final String toString() {
        return "RoundAvatarOptions(enabled=" + this.f2230a + ", radius=" + this.f2231b + ", source=" + this.f2232c + ", updated=" + this.f2233d + ")";
    }
}
