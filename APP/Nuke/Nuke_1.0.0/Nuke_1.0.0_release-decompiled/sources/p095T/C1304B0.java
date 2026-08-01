package p095T;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: T.B0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1304B0 extends AbstractC1385s {

    /* JADX INFO: renamed from: d */
    public final AbstractC1385s f4667d;

    /* JADX INFO: renamed from: e */
    public final int f4668e;

    public C1304B0(AbstractC1385s abstractC1385s, int i5) {
        this.f4667d = abstractC1385s;
        this.f4668e = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1304B0)) {
            return false;
        }
        C1304B0 c1304b0 = (C1304B0) obj;
        return AbstractC1665j.m2981a(c1304b0.f4667d, this.f4667d) && c1304b0.f4668e == this.f4668e;
    }

    public final int hashCode() {
        return this.f4667d.hashCode() + (this.f4668e * 31);
    }
}
