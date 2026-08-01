package p100U;

import java.util.ArrayList;
import p058L.C0946r;
import p095T.C1324L0;
import p095T.C1388t0;
import p095T.InterfaceC1353c;
import p105V.C1483e;
import p136b0.C1845g;
import p136b0.C1849k;
import p186k.C2408E;

/* JADX INFO: renamed from: U.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1454o extends AbstractC1437J {

    /* JADX INFO: renamed from: c */
    public static final C1454o f5128c = new C1454o(0, 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p100U.AbstractC1437J
    /* JADX INFO: renamed from: a */
    public final void mo2722a(C0946r c0946r, InterfaceC1353c interfaceC1353c, C1324L0 c1324l0, C1849k c1849k, InterfaceC1438K interfaceC1438K) {
        C1483e c1483e;
        C1388t0 c1388t0 = (C1388t0) c0946r.m1953d(0);
        C2408E c2408e = c1849k.f6266i;
        if (c2408e == null || ((C1845g) c2408e.m4272g(c1388t0)) == null) {
            return;
        }
        ArrayList arrayList = c1849k.f6267j;
        if (arrayList != null && (c1483e = (C1483e) arrayList.remove(arrayList.size() - 1)) != null) {
            c1849k.f6262e = c1483e;
        }
        c2408e.m4276k(c1388t0);
    }
}
