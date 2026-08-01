package p058L;

import java.util.ArrayList;
import java.util.List;
import p000A.C0049a;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0377O;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p061L2.C0982v;

/* JADX INFO: renamed from: L.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0909K implements InterfaceC0377O {

    /* JADX INFO: renamed from: a */
    public static final C0909K f2825a = new C0909K();

    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: i */
    public final InterfaceC0378P mo16i(InterfaceC0379Q interfaceC0379Q, List list, long j5) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC0391b0 abstractC0391b0Mo648e = ((InterfaceC0376N) list.get(i5)).mo648e(j5);
            iMax = Math.max(iMax, abstractC0391b0Mo648e.f1206d);
            iMax2 = Math.max(iMax2, abstractC0391b0Mo648e.f1207e);
            arrayList.add(abstractC0391b0Mo648e);
        }
        return interfaceC0379Q.mo604f0(iMax, iMax2, C0982v.f3048d, new C0049a(9, arrayList));
    }
}
