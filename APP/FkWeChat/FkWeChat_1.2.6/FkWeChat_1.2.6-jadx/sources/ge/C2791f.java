package ge;

import java.util.List;
import p024b9.AbstractC1061t;
import p080f9.C2363j;
import p172l8.C4711r;
import re.AbstractC6622a;
import re.AbstractC6630i;
import re.InterfaceC6627f;
import se.C7793c;

/* JADX INFO: renamed from: ge.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2791f extends AbstractC6622a {
    @Override // re.AbstractC6622a
    /* JADX INFO: renamed from: f */
    public void mo9942f(AbstractC6630i abstractC6630i, AbstractC6630i.a aVar, List list, InterfaceC6627f.c cVar) {
        abstractC6630i.getClass();
        aVar.getClass();
        list.getClass();
        cVar.getClass();
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        boolean zM30218a = false;
        while (true) {
            int i10 = size - 1;
            if (zM30218a) {
                zM30218a = false;
            } else {
                AbstractC6622a.b bVar = (AbstractC6622a.b) list.get(size);
                if (AbstractC1061t.m3842c(bVar.m26233g(), C2790e.f7270b) && bVar.m26229c() != -1) {
                    zM30218a = C7793c.f25990b.m30218a(list, size, bVar.m26229c());
                    AbstractC6622a.b bVar2 = (AbstractC6622a.b) list.get(bVar.m26229c());
                    if (zM30218a) {
                        cVar.m26258d(new InterfaceC6627f.a(new C2363j(bVar.m26232f() - 1, bVar2.m26232f() + 2), C2787b.f7258b));
                    }
                }
            }
            if (i10 < 0) {
                return;
            } else {
                size = i10;
            }
        }
    }

    @Override // re.AbstractC6622a
    /* JADX INFO: renamed from: g */
    public int mo9943g(AbstractC6630i abstractC6630i, AbstractC6630i.a aVar, List list) {
        abstractC6630i.getClass();
        aVar.getClass();
        list.getClass();
        if (!AbstractC1061t.m3842c(aVar.m26273h(), C2790e.f7270b)) {
            return 0;
        }
        AbstractC6630i.a aVarMo26266a = aVar;
        int i10 = 1;
        for (int i11 = 0; i11 < 50 && AbstractC1061t.m3842c(aVarMo26266a.mo26275j(1), C2790e.f7270b); i11++) {
            aVarMo26266a = aVarMo26266a.mo26266a();
            i10++;
        }
        C4711r c4711rM26221a = m26221a(abstractC6630i, aVar, aVarMo26266a, true);
        boolean zBooleanValue = ((Boolean) c4711rM26221a.m18792a()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) c4711rM26221a.m18793b()).booleanValue();
        for (int i12 = 0; i12 < i10; i12++) {
            list.add(new AbstractC6622a.b(C2790e.f7270b, aVar.m26270e() + i12, 0, zBooleanValue, zBooleanValue2, '~', 0, 64, null));
        }
        return i10;
    }
}
