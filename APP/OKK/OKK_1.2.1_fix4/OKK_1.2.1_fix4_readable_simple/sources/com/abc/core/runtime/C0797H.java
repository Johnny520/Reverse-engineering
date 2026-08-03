package com.abc.core.runtime;

import p029P0.InterfaceC0290p;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: f0.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0797H {

    /* JADX INFO: renamed from: a */
    public final String f2892a;

    /* JADX INFO: renamed from: b */
    public final String f2893b;

    /* JADX INFO: renamed from: c */
    public final String f2894c;

    /* JADX INFO: renamed from: d */
    public final boolean f2895d;

    /* JADX INFO: renamed from: e */
    public final boolean f2896e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0290p f2897f;

    public C0797H(String r1, String r2, String r3, boolean r4, boolean r5, InterfaceC0290p r6) {
        this.f2892a = r1;
        this.f2893b = r2;
        this.f2894c = r3;
        this.f2895d = r4;
        this.f2896e = r5;
        this.f2897f = r6;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0797H) == true) goto L8;
        return false;
    L8:
        C0797H r52 = (C0797H) r5;
        String r1 = r52.f2892a;
        if (AbstractC0307g.m699a(this.f2892a, r1) == true) goto L12;
        return false;
    L12:
        if (AbstractC0307g.m699a(this.f2893b, r52.f2893b) == true) goto L15;
        return false;
    L15:
        if (AbstractC0307g.m699a(this.f2894c, r52.f2894c) == true) goto L18;
        return false;
    L18:
        if (this.f2895d == r52.f2895d) goto L21;
        return false;
    L21:
        if (this.f2896e == r52.f2896e) goto L24;
        return false;
    L24:
        if (AbstractC0307g.m699a(this.f2897f, r52.f2897f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f2892a.hashCode() * 31;
        int r1 = (this.f2893b.hashCode() + r02) * 31;
        int r03 = (this.f2894c.hashCode() + r1) * 31;
        int r12 = (Boolean.hashCode(this.f2895d) + r03) * 31;
        int r04 = (Boolean.hashCode(this.f2896e) + r12) * 31;
        InterfaceC0290p r13 = this.f2897f;
        if (r13 != null) goto L5;
        int r14 = 0;
    L7:
        return r04 + r14;
    L5:
        r14 = r13.hashCode();
        goto L7
    }

    public final String toString() {
        return "FeatureItem(title=" + this.f2892a + ", summary=" + this.f2893b + ", key=" + this.f2894c + ", defaultOn=" + this.f2895d + ", hasConfig=" + this.f2896e + ", onConfigClick=" + this.f2897f + ")";
    }
}
