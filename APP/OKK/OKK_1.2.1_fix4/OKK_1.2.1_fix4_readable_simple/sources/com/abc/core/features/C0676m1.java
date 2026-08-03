package com.abc.core.features;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0676m1 extends AbstractC0685p1 {

    /* JADX INFO: renamed from: a */
    public final String f2104a;

    public C0676m1(String r1) {
        this.f2104a = r1;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C0676m1) == true) goto L9;
        return false;
    L9:
        if (AbstractC0307g.m699a(this.f2104a, ((C0676m1) r4).f2104a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f2104a.hashCode();
    }

    public final String toString() {
        return "Failure(msg=" + this.f2104a + ")";
    }
}
