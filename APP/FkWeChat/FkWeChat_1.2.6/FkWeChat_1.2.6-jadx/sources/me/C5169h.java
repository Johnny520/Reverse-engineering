package me;

import be.AbstractC1113a;
import be.AbstractC1117e;
import be.C1114b;
import java.util.ArrayList;
import java.util.List;
import me.AbstractC5170i;
import p038ce.C1520b;
import p038ce.InterfaceC1519a;
import p185m8.AbstractC5081g0;

/* JADX INFO: renamed from: me.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5169h extends AbstractC5170i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5169h(C1520b c1520b) {
        super(c1520b);
        c1520b.getClass();
    }

    @Override // me.AbstractC5170i
    /* JADX INFO: renamed from: c */
    public AbstractC5170i.a mo21176c(AbstractC5170i.b bVar, List list, boolean z10) {
        bVar.getClass();
        list.getClass();
        AbstractC1113a abstractC1113aM26256b = bVar.m21236c().m26256b();
        int iM8560o = bVar.m21236c().m26255a().m8560o();
        int iM8561p = bVar.m21236c().m26255a().m8561p();
        if ((abstractC1113aM26256b instanceof C1114b) && ((C1114b) abstractC1113aM26256b).m4016b()) {
            return new AbstractC5170i.a((InterfaceC1519a) AbstractC5081g0.m20576j0(m21231e().mo5942b(abstractC1113aM26256b, iM8560o, iM8561p)), iM8560o, iM8561p);
        }
        ArrayList arrayList = new ArrayList(list.size());
        AbstractC5170i.a aVar = (AbstractC5170i.a) AbstractC5081g0.m20578l0(list);
        m21228f(arrayList, iM8560o, aVar != null ? aVar.m21234c() : iM8561p);
        int size = list.size();
        for (int i10 = 1; i10 < size; i10++) {
            AbstractC5170i.a aVar2 = (AbstractC5170i.a) list.get(i10 - 1);
            AbstractC5170i.a aVar3 = (AbstractC5170i.a) list.get(i10);
            arrayList.add(aVar2.m21232a());
            m21228f(arrayList, aVar2.m21233b(), aVar3.m21234c());
        }
        if (!list.isEmpty()) {
            arrayList.add(((AbstractC5170i.a) AbstractC5081g0.m20587u0(list)).m21232a());
            m21228f(arrayList, ((AbstractC5170i.a) AbstractC5081g0.m20587u0(list)).m21233b(), iM8561p);
        }
        return new AbstractC5170i.a(m21231e().m5941a(abstractC1113aM26256b, arrayList), iM8560o, iM8561p);
    }

    @Override // me.AbstractC5170i
    /* JADX INFO: renamed from: d */
    public void mo21177d(AbstractC5170i.b bVar, List list) {
        bVar.getClass();
    }

    /* JADX INFO: renamed from: f */
    public final void m21228f(List list, int i10, int i11) {
        if (i10 != i11) {
            list.addAll(m21231e().mo5942b(AbstractC1117e.f3390N, i10, i11));
        }
    }
}
