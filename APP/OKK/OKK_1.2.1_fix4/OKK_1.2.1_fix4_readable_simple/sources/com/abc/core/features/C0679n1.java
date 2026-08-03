package com.abc.core.features;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0679n1 extends AbstractC0685p1 {

    /* JADX INFO: renamed from: a */
    public final String f2136a;

    public C0679n1(String r2) {
        AbstractC0307g.m703e(r2, "name");
        this.f2136a = r2;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C0679n1) == true) goto L9;
        return false;
    L9:
        if (AbstractC0307g.m699a(this.f2136a, ((C0679n1) r4).f2136a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f2136a.hashCode();
    }

    public final String toString() {
        return "Found(name=" + this.f2136a + ")";
    }
}
