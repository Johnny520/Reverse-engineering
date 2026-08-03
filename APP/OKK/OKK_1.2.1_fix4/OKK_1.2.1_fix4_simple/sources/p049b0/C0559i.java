package p049b0;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: b0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0559i extends AbstractC0560j {

    /* JADX INFO: renamed from: a */
    public final String f1657a;

    public C0559i(String r1) {
        this.f1657a = r1;
    }

    @Override // p049b0.AbstractC0560j
    /* JADX INFO: renamed from: a */
    public final String mo1370a() {
        return this.f1657a;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C0559i) == true) goto L9;
        return false;
    L9:
        if (AbstractC0307g.m699a(this.f1657a, ((C0559i) r4).f1657a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f1657a.hashCode();
    }

    public final String toString() {
        return "PARTIAL(detail=" + this.f1657a + ")";
    }
}
