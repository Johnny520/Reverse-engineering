package re;

import java.util.ArrayList;
import java.util.List;
import re.AbstractC6622a;
import re.AbstractC6630i;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: re.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6623b implements InterfaceC6627f {

    /* JADX INFO: renamed from: a */
    public final AbstractC6622a[] f20742a;

    public C6623b(AbstractC6622a... abstractC6622aArr) {
        abstractC6622aArr.getClass();
        this.f20742a = abstractC6622aArr;
    }

    @Override // re.InterfaceC6627f
    /* JADX INFO: renamed from: a */
    public InterfaceC6627f.b mo26237a(AbstractC6630i abstractC6630i, List list) {
        abstractC6630i.getClass();
        list.getClass();
        InterfaceC6627f.c cVar = new InterfaceC6627f.c();
        AbstractC6630i.b bVar = new AbstractC6630i.b(abstractC6630i, list);
        ArrayList arrayListM26239c = m26239c(abstractC6630i, bVar);
        m26238b(arrayListM26239c);
        for (AbstractC6622a abstractC6622a : this.f20742a) {
            abstractC6622a.mo9942f(abstractC6630i, bVar, arrayListM26239c, cVar);
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m26238b(java.util.ArrayList r20) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: re.C6623b.m26238b(java.util.ArrayList):void");
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m26239c(AbstractC6630i abstractC6630i, AbstractC6630i.a aVar) {
        ArrayList arrayList = new ArrayList();
        loop0: while (aVar.m26273h() != null) {
            int i10 = 0;
            for (AbstractC6622a abstractC6622a : this.f20742a) {
                int iMo9943g = abstractC6622a.mo9943g(abstractC6630i, aVar, arrayList);
                i10 += iMo9943g;
                for (int i11 = 0; i11 < iMo9943g; i11++) {
                    if (aVar.m26273h() == null) {
                        break loop0;
                    }
                    aVar = aVar.mo26266a();
                }
            }
            if (i10 == 0) {
                aVar = aVar.mo26266a();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m26240d(AbstractC6622a.b bVar, AbstractC6622a.b bVar2) {
        if ((bVar.m26227a() || bVar2.m26228b()) && (bVar.m26230d() + bVar2.m26230d()) % 3 == 0) {
            return (bVar.m26230d() % 3 == 0 && bVar2.m26230d() % 3 == 0) ? false : true;
        }
        return false;
    }
}
