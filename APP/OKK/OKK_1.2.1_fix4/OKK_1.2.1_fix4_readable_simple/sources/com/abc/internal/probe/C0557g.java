package com.abc.internal.probe;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: b0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0557g extends AbstractC0560j {

    /* JADX INFO: renamed from: a */
    public final String f1655a;

    public C0557g(String r1) {
        this.f1655a = r1;
    }

    @Override // com.abc.internal.probe.AbstractC0560j
    /* JADX INFO: renamed from: a */
    public final String mo1370a() {
        return this.f1655a;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C0557g) == true) goto L9;
        return false;
    L9:
        if (AbstractC0307g.m699a(this.f1655a, ((C0557g) r4).f1655a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f1655a.hashCode();
    }

    public final String toString() {
        return "FAIL(detail=" + this.f1655a + ")";
    }
}
