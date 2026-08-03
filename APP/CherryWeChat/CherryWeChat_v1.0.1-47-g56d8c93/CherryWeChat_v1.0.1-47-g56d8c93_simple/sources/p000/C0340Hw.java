package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: Hw */
/* JADX INFO: loaded from: classes.dex */
public final class C0340Hw implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f1148a;

    public /* synthetic */ C0340Hw(Object r1) {
        this.f1148a = r1;
    }

    /* JADX INFO: renamed from: a */
    public static final Throwable m726a(Object r1) {
        if ((r1 instanceof C0297Gw) == true) goto L5;
        return null;
    L5:
        return ((C0297Gw) r1).f1010a;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C0340Hw) == false) goto L11;
        Object r22 = ((C0340Hw) r2).f1148a;
        if (AbstractC0585Nj.m1134a(this.f1148a, r22) == true) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        Object r0 = this.f1148a;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.hashCode();
    }

    public final String toString() {
        Object r0 = this.f1148a;
        if ((r0 instanceof C0297Gw) == false) goto L7;
        return ((C0297Gw) r0).toString();
    L7:
        return "Success(" + r0 + ')';
    }
}
