package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: Gw */
/* JADX INFO: loaded from: classes.dex */
public final class C0297Gw implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Throwable f1010a;

    public C0297Gw(Throwable r1) {
        this.f1010a = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C0297Gw) == false) goto L8;
        Throwable r22 = ((C0297Gw) r2).f1010a;
        if (AbstractC0585Nj.m1134a(this.f1010a, r22) == false) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public final int hashCode() {
        return this.f1010a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f1010a + ')';
    }
}
