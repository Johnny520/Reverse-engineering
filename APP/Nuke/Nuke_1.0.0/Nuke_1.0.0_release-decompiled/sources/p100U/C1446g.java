package p100U;

import java.util.List;
import p058L.C0946r;
import p095T.C1324L0;
import p095T.InterfaceC1353c;
import p136b0.C1844f;
import p136b0.C1849k;

/* JADX INFO: renamed from: U.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1446g extends AbstractC1437J {

    /* JADX INFO: renamed from: c */
    public static final C1446g f5120c = new C1446g(0, 2, 1);

    @Override // p100U.AbstractC1437J
    /* JADX INFO: renamed from: a */
    public final void mo2722a(C0946r c0946r, InterfaceC1353c interfaceC1353c, C1324L0 c1324l0, C1849k c1849k, InterfaceC1438K interfaceC1438K) {
        int i5 = ((C1844f) c0946r.m1953d(0)).f6246a;
        List list = (List) c0946r.m1953d(1);
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = list.get(i6);
            int i7 = i5 + i6;
            interfaceC1353c.mo780c(i7, obj);
            interfaceC1353c.mo783f(i7, obj);
        }
    }
}
