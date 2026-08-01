package se;

import be.AbstractC1113a;
import be.AbstractC1117e;
import be.C1115c;
import java.util.Collection;
import java.util.List;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p080f9.C2363j;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import re.AbstractC6630i;
import re.C6625d;
import re.C6626e;
import re.InterfaceC6627f;
import se.AbstractC7796f;

/* JADX INFO: renamed from: se.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7795e implements InterfaceC6627f {

    /* JADX INFO: renamed from: a */
    public static final a f25991a = new a(null);

    @Override // re.InterfaceC6627f
    /* JADX INFO: renamed from: a */
    public InterfaceC6627f.b mo26237a(AbstractC6630i abstractC6630i, List list) {
        C6625d c6625dM30219a;
        abstractC6630i.getClass();
        list.getClass();
        InterfaceC6627f.c cVar = new InterfaceC6627f.c();
        C6626e c6626e = new C6626e();
        AbstractC6630i.a bVar = new AbstractC6630i.b(abstractC6630i, list);
        while (bVar.m26273h() != null) {
            if (!AbstractC1061t.m3842c(bVar.m26273h(), AbstractC1117e.f3400j) || (c6625dM30219a = f25991a.m30219a(bVar)) == null) {
                c6626e.m26254b(bVar.m26270e());
                bVar = bVar.mo26266a();
            } else {
                bVar = c6625dM30219a.m26252c().mo26266a();
                cVar = cVar.m26259e(c6625dM30219a);
            }
        }
        return cVar.m26257c(c6626e.m26253a());
    }

    /* JADX INFO: renamed from: se.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C6625d m30219a(AbstractC6630i.a aVar) {
            Collection collectionMo26251b;
            Collection collectionMo26251b2;
            aVar.getClass();
            int iM26270e = aVar.m26270e();
            AbstractC7796f.a aVar2 = AbstractC7796f.f25992a;
            C6625d c6625dM30222c = aVar2.m30222c(aVar);
            if (c6625dM30222c == null) {
                return null;
            }
            AbstractC6630i.a aVarM26252c = c6625dM30222c.m26252c();
            if (!AbstractC1061t.m3842c(aVarM26252c.mo26275j(1), AbstractC1117e.f3398h)) {
                return null;
            }
            AbstractC6630i.a aVarMo26266a = aVarM26252c.mo26266a().mo26266a();
            AbstractC1113a abstractC1113aM26273h = aVarMo26266a.m26273h();
            AbstractC1113a abstractC1113a = AbstractC1117e.f3407q;
            if (AbstractC1061t.m3842c(abstractC1113aM26273h, abstractC1113a)) {
                aVarMo26266a = aVarMo26266a.mo26266a();
            }
            C6625d c6625dM30220a = aVar2.m30220a(aVarMo26266a);
            if (c6625dM30220a != null) {
                aVarMo26266a = c6625dM30220a.m26252c().mo26266a();
                if (AbstractC1061t.m3842c(aVarMo26266a.m26273h(), abstractC1113a)) {
                    aVarMo26266a = aVarMo26266a.mo26266a();
                }
            }
            C6625d c6625dM30223d = aVar2.m30223d(aVarMo26266a);
            if (c6625dM30223d != null) {
                aVarMo26266a = c6625dM30223d.m26252c().mo26266a();
                if (AbstractC1061t.m3842c(aVarMo26266a.m26273h(), abstractC1113a)) {
                    aVarMo26266a = aVarMo26266a.mo26266a();
                }
            }
            if (AbstractC1061t.m3842c(aVarMo26266a.m26273h(), AbstractC1117e.f3399i)) {
                return new C6625d(aVarMo26266a, AbstractC5081g0.m20534F0(AbstractC5081g0.m20533E0(AbstractC5081g0.m20533E0(c6625dM30222c.mo26251b(), (c6625dM30220a == null || (collectionMo26251b2 = c6625dM30220a.mo26251b()) == null) ? AbstractC5114x.m20800o() : collectionMo26251b2), (c6625dM30223d == null || (collectionMo26251b = c6625dM30223d.mo26251b()) == null) ? AbstractC5114x.m20800o() : collectionMo26251b), new InterfaceC6627f.a(new C2363j(iM26270e, aVarMo26266a.m26270e() + 1), C1115c.f3369s)), c6625dM30222c.mo26250a());
            }
            return null;
        }

        public a() {
        }
    }
}
