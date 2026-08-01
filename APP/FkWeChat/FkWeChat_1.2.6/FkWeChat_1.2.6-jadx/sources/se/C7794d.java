package se;

import be.AbstractC1117e;
import be.C1115c;
import java.util.List;
import p024b9.AbstractC1061t;
import p080f9.C2363j;
import re.AbstractC6630i;
import re.C6625d;
import re.C6626e;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: se.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7794d implements InterfaceC6627f {
    @Override // re.InterfaceC6627f
    /* JADX INFO: renamed from: a */
    public InterfaceC6627f.b mo26237a(AbstractC6630i abstractC6630i, List list) {
        abstractC6630i.getClass();
        list.getClass();
        InterfaceC6627f.c cVar = new InterfaceC6627f.c();
        C6626e c6626e = new C6626e();
        AbstractC6630i.a bVar = new AbstractC6630i.b(abstractC6630i, list);
        while (bVar.m26273h() != null) {
            if (AbstractC1061t.m3842c(bVar.m26273h(), AbstractC1117e.f3405o) && AbstractC1061t.m3842c(bVar.mo26275j(1), AbstractC1117e.f3400j)) {
                C6625d c6625dM30219a = C7795e.f25991a.m30219a(bVar.mo26266a());
                if (c6625dM30219a == null) {
                    c6625dM30219a = C7798h.f25993a.m30226b(bVar.mo26266a());
                }
                if (c6625dM30219a != null) {
                    cVar = cVar.m26258d(new InterfaceC6627f.a(new C2363j(bVar.m26270e(), c6625dM30219a.m26252c().m26270e() + 1), C1115c.f3372v)).m26259e(c6625dM30219a);
                    bVar = c6625dM30219a.m26252c().mo26266a();
                }
            }
            c6626e.m26254b(bVar.m26270e());
            bVar = bVar.mo26266a();
        }
        return cVar.m26257c(c6626e.m26253a());
    }
}
