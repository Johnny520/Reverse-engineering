package se;

import be.AbstractC1113a;
import be.AbstractC1117e;
import be.C1115c;
import java.util.List;
import p024b9.AbstractC1061t;
import p080f9.C2363j;
import re.AbstractC6630i;
import re.C6626e;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: se.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7791a implements InterfaceC6627f {

    /* JADX INFO: renamed from: a */
    public final List f25989a;

    public C7791a(List list) {
        list.getClass();
        this.f25989a = list;
    }

    @Override // re.InterfaceC6627f
    /* JADX INFO: renamed from: a */
    public InterfaceC6627f.b mo26237a(AbstractC6630i abstractC6630i, List list) {
        AbstractC1113a abstractC1113aMo26275j;
        AbstractC1113a abstractC1113a;
        abstractC6630i.getClass();
        list.getClass();
        InterfaceC6627f.c cVar = new InterfaceC6627f.c();
        C6626e c6626e = new C6626e();
        AbstractC6630i.b bVar = new AbstractC6630i.b(abstractC6630i, list);
        while (bVar.m26273h() != null) {
            if (AbstractC1061t.m3842c(bVar.m26273h(), AbstractC1117e.f3402l) && (abstractC1113aMo26275j = bVar.mo26275j(1)) != null && this.f25989a.contains(abstractC1113aMo26275j)) {
                int iM26270e = bVar.m26270e();
                while (true) {
                    AbstractC1113a abstractC1113aM26273h = bVar.m26273h();
                    abstractC1113a = AbstractC1117e.f3403m;
                    if (AbstractC1061t.m3842c(abstractC1113aM26273h, abstractC1113a) || bVar.m26273h() == null) {
                        break;
                    }
                    bVar = bVar.mo26266a();
                }
                if (AbstractC1061t.m3842c(bVar.m26273h(), abstractC1113a)) {
                    cVar.m26258d(new InterfaceC6627f.a(new C2363j(iM26270e, bVar.m26270e() + 1), C1115c.f3373w));
                }
            } else {
                c6626e.m26254b(bVar.m26270e());
            }
            bVar = bVar.mo26266a();
        }
        return cVar.m26257c(c6626e.m26253a());
    }
}
