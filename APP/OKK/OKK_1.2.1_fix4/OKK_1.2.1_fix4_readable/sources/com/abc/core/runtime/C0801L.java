package com.abc.core.runtime;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: f0.L */
/* JADX INFO: loaded from: classes.dex */
public final class C0801L extends AbstractC0805P {

    /* JADX INFO: renamed from: b */
    public final String f2916b;

    public C0801L(String str) {
        this.f2916b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0801L) && AbstractC0307g.m699a(this.f2916b, ((C0801L) obj).f2916b);
    }

    public final int hashCode() {
        return this.f2916b.hashCode();
    }

    public final String toString() {
        return "FeatureDetail(key=" + this.f2916b + ")";
    }
}
