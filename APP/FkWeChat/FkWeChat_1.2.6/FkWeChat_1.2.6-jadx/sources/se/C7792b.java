package se;

import be.AbstractC1117e;
import be.C1115c;
import java.util.List;
import p024b9.AbstractC1061t;
import p080f9.C2363j;
import re.AbstractC6630i;
import re.C6626e;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: se.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7792b implements InterfaceC6627f {
    @Override // re.InterfaceC6627f
    /* JADX INFO: renamed from: a */
    public InterfaceC6627f.b mo26237a(AbstractC6630i abstractC6630i, List list) {
        AbstractC6630i.a aVarM30216b;
        abstractC6630i.getClass();
        list.getClass();
        InterfaceC6627f.c cVar = new InterfaceC6627f.c();
        C6626e c6626e = new C6626e();
        AbstractC6630i.a bVar = new AbstractC6630i.b(abstractC6630i, list);
        while (bVar.m26273h() != null) {
            if ((AbstractC1061t.m3842c(bVar.m26273h(), AbstractC1117e.f3415y) || AbstractC1061t.m3842c(bVar.m26273h(), AbstractC1117e.f3416z)) && (aVarM30216b = m30216b(bVar.mo26266a(), m30217c(bVar, true))) != null) {
                cVar.m26258d(new InterfaceC6627f.a(new C2363j(bVar.m26270e(), aVarM30216b.m26270e() + 1), C1115c.f3359i));
                bVar = aVarM30216b.mo26266a();
            } else {
                c6626e.m26254b(bVar.m26270e());
                bVar = bVar.mo26266a();
            }
        }
        return cVar.m26257c(c6626e.m26253a());
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC6630i.a m30216b(AbstractC6630i.a aVar, int i10) {
        while (aVar.m26273h() != null) {
            if ((AbstractC1061t.m3842c(aVar.m26273h(), AbstractC1117e.f3415y) || AbstractC1061t.m3842c(aVar.m26273h(), AbstractC1117e.f3416z)) && m30217c(aVar, false) == i10) {
                return aVar;
            }
            aVar = aVar.mo26266a();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m30217c(AbstractC6630i.a aVar, boolean z10) {
        return aVar.m26271f() - (AbstractC1061t.m3842c(aVar.m26273h(), AbstractC1117e.f3416z) ? z10 ? 2 : 1 : 0);
    }
}
