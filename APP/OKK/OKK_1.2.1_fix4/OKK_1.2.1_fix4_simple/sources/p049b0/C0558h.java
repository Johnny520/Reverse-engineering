package p049b0;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: b0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0558h extends AbstractC0560j {

    /* JADX INFO: renamed from: a */
    public final String f1656a;

    public C0558h(String r1) {
        this.f1656a = r1;
    }

    @Override // p049b0.AbstractC0560j
    /* JADX INFO: renamed from: a */
    public final String mo1370a() {
        return this.f1656a;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C0558h) == true) goto L9;
        return false;
    L9:
        if (AbstractC0307g.m699a(this.f1656a, ((C0558h) r4).f1656a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f1656a.hashCode();
    }

    public final String toString() {
        return "OK(detail=" + this.f1656a + ")";
    }
}
