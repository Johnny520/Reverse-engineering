package se;

import ge.C2787b;
import ge.C2790e;
import java.util.List;
import p024b9.AbstractC1061t;
import p080f9.C2363j;
import re.AbstractC6630i;
import re.C6626e;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: se.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7797g implements InterfaceC6627f {
    /* JADX INFO: renamed from: b */
    private final AbstractC6630i.a m30224b(AbstractC6630i.a aVar, int i10) {
        while (aVar.m26273h() != null) {
            if (AbstractC1061t.m3842c(aVar.m26273h(), C2790e.f7275g) && aVar.m26271f() == i10) {
                return aVar;
            }
            aVar = aVar.mo26266a();
        }
        return null;
    }

    @Override // re.InterfaceC6627f
    /* JADX INFO: renamed from: a */
    public InterfaceC6627f.b mo26237a(AbstractC6630i abstractC6630i, List list) {
        AbstractC6630i.a aVarM30224b;
        abstractC6630i.getClass();
        list.getClass();
        InterfaceC6627f.c cVar = new InterfaceC6627f.c();
        C6626e c6626e = new C6626e();
        AbstractC6630i.a bVar = new AbstractC6630i.b(abstractC6630i, list);
        while (bVar.m26273h() != null) {
            if (!AbstractC1061t.m3842c(bVar.m26273h(), C2790e.f7275g) || (aVarM30224b = m30224b(bVar.mo26266a(), bVar.m26271f())) == null) {
                c6626e.m26254b(bVar.m26270e());
                bVar = bVar.mo26266a();
            } else {
                if (bVar.m26271f() == 1) {
                    cVar.m26258d(new InterfaceC6627f.a(new C2363j(bVar.m26270e(), aVarM30224b.m26270e() + 1), C2787b.f7262f));
                } else {
                    cVar.m26258d(new InterfaceC6627f.a(new C2363j(bVar.m26270e(), aVarM30224b.m26270e() + 1), C2787b.f7263g));
                }
                bVar = aVarM30224b.mo26266a();
            }
        }
        return cVar.m26257c(c6626e.m26253a());
    }
}
