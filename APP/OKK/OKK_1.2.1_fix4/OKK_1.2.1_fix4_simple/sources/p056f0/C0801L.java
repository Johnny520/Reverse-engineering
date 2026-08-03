package p056f0;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: f0.L */
/* JADX INFO: loaded from: classes.dex */
public final class C0801L extends AbstractC0805P {

    /* JADX INFO: renamed from: b */
    public final String f2916b;

    public C0801L(String r1) {
        this.f2916b = r1;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C0801L) == true) goto L9;
        return false;
    L9:
        if (AbstractC0307g.m699a(this.f2916b, ((C0801L) r4).f2916b) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f2916b.hashCode();
    }

    public final String toString() {
        return "FeatureDetail(key=" + this.f2916b + ")";
    }
}
