package com.abc.internal.probe;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: b0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0557g extends AbstractC0560j {

    /* JADX INFO: renamed from: a */
    public final String f1655a;

    public C0557g(String str) {
        this.f1655a = str;
    }

    @Override // com.abc.internal.probe.AbstractC0560j
    /* JADX INFO: renamed from: a */
    public final String mo1370a() {
        return this.f1655a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0557g) && AbstractC0307g.m699a(this.f1655a, ((C0557g) obj).f1655a);
    }

    public final int hashCode() {
        return this.f1655a.hashCode();
    }

    public final String toString() {
        return "FAIL(detail=" + this.f1655a + ")";
    }
}
