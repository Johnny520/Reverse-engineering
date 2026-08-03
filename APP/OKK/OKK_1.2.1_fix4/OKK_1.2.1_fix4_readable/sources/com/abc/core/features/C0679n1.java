package com.abc.core.features;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0679n1 extends AbstractC0685p1 {

    /* JADX INFO: renamed from: a */
    public final String f2136a;

    public C0679n1(String str) {
        AbstractC0307g.m703e(str, "name");
        this.f2136a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0679n1) && AbstractC0307g.m699a(this.f2136a, ((C0679n1) obj).f2136a);
    }

    public final int hashCode() {
        return this.f2136a.hashCode();
    }

    public final String toString() {
        return "Found(name=" + this.f2136a + ")";
    }
}
