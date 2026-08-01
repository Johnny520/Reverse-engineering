package se;

import be.AbstractC1117e;
import be.C1115c;
import java.util.List;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p080f9.C2363j;
import p172l8.C4711r;
import re.AbstractC6622a;
import re.AbstractC6630i;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: se.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7793c extends AbstractC6622a {

    /* JADX INFO: renamed from: b */
    public static final a f25990b = new a(null);

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
                if (AbstractC1061t.m3842c(bVar.m26233g(), AbstractC1117e.f3414x) && bVar.m26229c() != -1) {
                    zM30218a = f25990b.m30218a(list, size, bVar.m26229c());
                    AbstractC6622a.b bVar2 = (AbstractC6622a.b) list.get(bVar.m26229c());
                    cVar.m26258d(zM30218a ? new InterfaceC6627f.a(new C2363j(bVar.m26232f() - 1, bVar2.m26232f() + 2), C1115c.f3363m) : new InterfaceC6627f.a(new C2363j(bVar.m26232f(), bVar2.m26232f() + 1), C1115c.f3362l));
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
        if (!AbstractC1061t.m3842c(aVar.m26273h(), AbstractC1117e.f3414x)) {
            return 0;
        }
        char cM26226a = AbstractC6622a.f20734a.m26226a(aVar);
        AbstractC6630i.a aVarMo26266a = aVar;
        int i10 = 1;
        for (int i11 = 0; i11 < 50 && AbstractC1061t.m3842c(aVarMo26266a.mo26275j(1), AbstractC1117e.f3414x) && AbstractC6622a.f20734a.m26226a(aVarMo26266a.mo26266a()) == cM26226a; i11++) {
            aVarMo26266a = aVarMo26266a.mo26266a();
            i10++;
        }
        C4711r c4711rM26221a = m26221a(abstractC6630i, aVar, aVarMo26266a, cM26226a == '*');
        boolean zBooleanValue = ((Boolean) c4711rM26221a.m18792a()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) c4711rM26221a.m18793b()).booleanValue();
        for (int i12 = 0; i12 < i10; i12++) {
            list.add(new AbstractC6622a.b(AbstractC1117e.f3414x, aVar.m26270e() + i12, i10, zBooleanValue, zBooleanValue2, cM26226a, 0, 64, null));
        }
        return i10;
    }

    /* JADX INFO: renamed from: se.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m30218a(List list, int i10, int i11) {
            list.getClass();
            AbstractC6622a.b bVar = (AbstractC6622a.b) list.get(i10);
            AbstractC6622a.b bVar2 = (AbstractC6622a.b) list.get(i11);
            if (i10 <= 0) {
                return false;
            }
            int i12 = i10 - 1;
            return ((AbstractC6622a.b) list.get(i12)).m26229c() == bVar.m26229c() + 1 && ((AbstractC6622a.b) list.get(i12)).m26231e() == bVar.m26231e() && ((AbstractC6622a.b) list.get(i12)).m26232f() == bVar.m26232f() - 1 && ((AbstractC6622a.b) list.get(bVar.m26229c() + 1)).m26232f() == bVar2.m26232f() + 1;
        }

        public a() {
        }
    }
}
