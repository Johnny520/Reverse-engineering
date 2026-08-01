package p100U;

import p058L.C0946r;
import p095T.C1324L0;
import p095T.C1349a;
import p095T.InterfaceC1353c;
import p117X2.AbstractC1676u;
import p136b0.C1849k;

/* JADX INFO: renamed from: U.J */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1437J {

    /* JADX INFO: renamed from: a */
    public final int f5094a;

    /* JADX INFO: renamed from: b */
    public final int f5095b;

    public AbstractC1437J(int i5, int i6) {
        this.f5094a = i5;
        this.f5095b = i6;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2722a(C0946r c0946r, InterfaceC1353c interfaceC1353c, C1324L0 c1324l0, C1849k c1849k, InterfaceC1438K interfaceC1438K);

    /* JADX INFO: renamed from: b */
    public C1349a mo2723b(C0946r c0946r) {
        return null;
    }

    public final String toString() {
        String strM2978b = AbstractC1676u.m2995a(getClass()).m2978b();
        return strM2978b == null ? "" : strM2978b;
    }

    public /* synthetic */ AbstractC1437J(int i5, int i6, int i7) {
        this((i7 & 1) != 0 ? 0 : i5, (i7 & 2) != 0 ? 0 : i6);
    }
}
