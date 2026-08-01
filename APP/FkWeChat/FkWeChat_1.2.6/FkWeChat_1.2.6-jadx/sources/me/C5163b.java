package me;

import be.AbstractC1113a;
import be.C1116d;
import java.util.ArrayList;
import java.util.List;
import me.AbstractC5170i;
import okhttp3.internal.url._UrlKt;
import p038ce.C1520b;
import p038ce.InterfaceC1519a;
import p175le.C4752a;
import p185m8.AbstractC5081g0;
import re.AbstractC6630i;
import re.AbstractC6630i.a;

/* JADX INFO: renamed from: me.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5163b extends AbstractC5170i {

    /* JADX INFO: renamed from: c */
    public final AbstractC6630i f15760c;

    /* JADX INFO: renamed from: d */
    public int f15761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5163b(C1520b c1520b, AbstractC6630i abstractC6630i, InterfaceC5162a interfaceC5162a) {
        super(c1520b, interfaceC5162a);
        c1520b.getClass();
        abstractC6630i.getClass();
        interfaceC5162a.getClass();
        this.f15760c = abstractC6630i;
        this.f15761d = -1;
    }

    @Override // me.AbstractC5170i
    /* JADX INFO: renamed from: c */
    public AbstractC5170i.a mo21176c(AbstractC5170i.b bVar, List list, boolean z10) {
        C5163b c5163b;
        bVar.getClass();
        list.getClass();
        AbstractC1113a abstractC1113aM26256b = bVar.m21236c().m26256b();
        int iM8560o = bVar.m21236c().m26255a().m8560o();
        int iM8561p = bVar.m21236c().m26255a().m8561p();
        ArrayList arrayList = new ArrayList(list.size());
        if (z10) {
            m21178f(this.f15760c, arrayList, iM8560o, -1, -1);
            c5163b = this;
        } else {
            c5163b = this;
        }
        int size = list.size();
        for (int i10 = 1; i10 < size; i10++) {
            AbstractC5170i.a aVar = (AbstractC5170i.a) list.get(i10 - 1);
            AbstractC5170i.a aVar2 = (AbstractC5170i.a) list.get(i10);
            arrayList.add(aVar.m21232a());
            c5163b.m21178f(c5163b.f15760c, arrayList, aVar.m21233b() - 1, 1, c5163b.f15760c.new a(aVar2.m21234c()).m26272g());
        }
        if (!list.isEmpty()) {
            arrayList.add(((AbstractC5170i.a) AbstractC5081g0.m20587u0(list)).m21232a());
        }
        if (z10) {
            AbstractC6630i abstractC6630i = c5163b.f15760c;
            c5163b.m21178f(abstractC6630i, arrayList, iM8561p - 1, 1, abstractC6630i.new a(iM8561p).m26272g());
        }
        return new AbstractC5170i.a(m21231e().m5941a(abstractC1113aM26256b, arrayList), iM8560o, iM8561p);
    }

    @Override // me.AbstractC5170i
    /* JADX INFO: renamed from: d */
    public void mo21177d(AbstractC5170i.b bVar, List list) {
        bVar.getClass();
        if (this.f15761d == -1) {
            this.f15761d = bVar.m21237g();
        }
        while (this.f15761d < bVar.m21237g()) {
            m21179g(this.f15760c, list, this.f15761d);
            this.f15761d++;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m21178f(AbstractC6630i abstractC6630i, List list, int i10, int i11, int i12) {
        AbstractC6630i.a aVar = abstractC6630i.new a(i10);
        int i13 = 0;
        while (true) {
            int i14 = i13 + i11;
            if (aVar.mo26275j(i14) == null || aVar.m26276k(i14) == i12) {
                break;
            } else {
                i13 = i14;
            }
        }
        while (i13 != 0) {
            AbstractC1113a abstractC1113aMo26275j = aVar.mo26275j(i13);
            abstractC1113aMo26275j.getClass();
            list.addAll(m21231e().mo5942b(abstractC1113aMo26275j, aVar.m26276k(i13), aVar.m26276k(i13 + 1)));
            i13 -= i11;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m21179g(AbstractC6630i abstractC6630i, List list, int i10) {
        AbstractC6630i.a aVar = abstractC6630i.new a(i10);
        C4752a c4752a = C4752a.f14072a;
        if (!(aVar.m26273h() != null)) {
            throw new C1116d(_UrlKt.FRAGMENT_ENCODE_SET);
        }
        C1520b c1520bM21231e = m21231e();
        AbstractC1113a abstractC1113aM26273h = aVar.m26273h();
        abstractC1113aM26273h.getClass();
        for (InterfaceC1519a interfaceC1519a : c1520bM21231e.mo5942b(abstractC1113aM26273h, aVar.m26272g(), aVar.m26268c())) {
            if (list != null) {
                list.add(new AbstractC5170i.a(interfaceC1519a, aVar.m26270e(), aVar.m26270e() + 1));
            }
        }
    }
}
