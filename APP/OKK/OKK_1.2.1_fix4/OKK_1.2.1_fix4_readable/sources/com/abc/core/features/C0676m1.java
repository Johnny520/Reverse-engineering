package com.abc.core.features;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0676m1 extends AbstractC0685p1 {

    /* JADX INFO: renamed from: a */
    public final String f2104a;

    public C0676m1(String str) {
        this.f2104a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0676m1) && AbstractC0307g.m699a(this.f2104a, ((C0676m1) obj).f2104a);
    }

    public final int hashCode() {
        return this.f2104a.hashCode();
    }

    public final String toString() {
        return "Failure(msg=" + this.f2104a + ")";
    }
}
