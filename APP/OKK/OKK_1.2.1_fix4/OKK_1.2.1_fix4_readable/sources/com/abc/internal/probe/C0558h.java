package com.abc.internal.probe;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: b0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0558h extends AbstractC0560j {

    /* JADX INFO: renamed from: a */
    public final String f1656a;

    public C0558h(String str) {
        this.f1656a = str;
    }

    @Override // com.abc.internal.probe.AbstractC0560j
    /* JADX INFO: renamed from: a */
    public final String mo1370a() {
        return this.f1656a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0558h) && AbstractC0307g.m699a(this.f1656a, ((C0558h) obj).f1656a);
    }

    public final int hashCode() {
        return this.f1656a.hashCode();
    }

    public final String toString() {
        return "OK(detail=" + this.f1656a + ")";
    }
}
