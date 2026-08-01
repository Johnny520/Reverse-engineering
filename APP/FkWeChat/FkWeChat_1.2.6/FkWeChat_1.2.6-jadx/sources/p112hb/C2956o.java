package p112hb;

import gb.AbstractC2687l2;
import gb.AbstractC2706r0;
import gb.InterfaceC2643a2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lb.AbstractC4734d;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p186m9.AbstractC5128i;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6018l1;
import p285ta.InterfaceC8210b;

/* JADX INFO: renamed from: hb.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2956o implements InterfaceC8210b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2643a2 f7797a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0173a f7798b;

    /* JADX INFO: renamed from: c */
    public final C2956o f7799c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6018l1 f7800d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4705l f7801e;

    public C2956o(InterfaceC2643a2 interfaceC2643a2, InterfaceC0173a interfaceC0173a, C2956o c2956o, InterfaceC6018l1 interfaceC6018l1) {
        interfaceC2643a2.getClass();
        this.f7797a = interfaceC2643a2;
        this.f7798b = interfaceC0173a;
        this.f7799c = c2956o;
        this.f7800d = interfaceC6018l1;
        this.f7801e = AbstractC4706m.m18788b(EnumC4708o.f13922r, new C2952k(this));
    }

    /* JADX INFO: renamed from: e */
    public static final List m10863e(C2956o c2956o) {
        InterfaceC0173a interfaceC0173a = c2956o.f7798b;
        if (interfaceC0173a != null) {
            return (List) interfaceC0173a.invoke();
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static final List m10869p(C2956o c2956o, AbstractC2949h abstractC2949h) {
        List listMo9546n = c2956o.mo9546n();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listMo9546n, 10));
        Iterator it = listMo9546n.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC2687l2) it.next()).mo9325d1(abstractC2949h));
        }
        return arrayList;
    }

    @Override // p285ta.InterfaceC8210b
    /* JADX INFO: renamed from: b */
    public InterfaceC2643a2 mo10870b() {
        return this.f7797a;
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: d */
    public List mo5600d() {
        return AbstractC5114x.m20800o();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC1061t.m3842c(C2956o.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C2956o c2956o = (C2956o) obj;
        C2956o c2956o2 = this.f7799c;
        if (c2956o2 == null) {
            c2956o2 = this;
        }
        C2956o c2956o3 = c2956o.f7799c;
        if (c2956o3 != null) {
            obj = c2956o3;
        }
        return c2956o2 == obj;
    }

    public int hashCode() {
        C2956o c2956o = this.f7799c;
        return c2956o != null ? c2956o.hashCode() : super.hashCode();
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public List mo9546n() {
        List listM10872k = m10872k();
        return listM10872k == null ? AbstractC5114x.m20800o() : listM10872k;
    }

    /* JADX INFO: renamed from: k */
    public final List m10872k() {
        return (List) this.f7801e.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final void m10873l(List list) {
        list.getClass();
        this.f7798b = new C2954m(list);
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C2956o mo9545a(AbstractC2949h abstractC2949h) {
        abstractC2949h.getClass();
        InterfaceC2643a2 interfaceC2643a2Mo9334a = mo10870b().mo9334a(abstractC2949h);
        interfaceC2643a2Mo9334a.getClass();
        C2955n c2955n = this.f7798b != null ? new C2955n(this, abstractC2949h) : null;
        C2956o c2956o = this.f7799c;
        if (c2956o == null) {
            c2956o = this;
        }
        return new C2956o(interfaceC2643a2Mo9334a, c2955n, c2956o, this.f7800d);
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: t */
    public AbstractC5128i mo9341t() {
        AbstractC2706r0 type = mo10870b().getType();
        type.getClass();
        return AbstractC4734d.m18919n(type);
    }

    public String toString() {
        return "CapturedType(" + mo10870b() + ')';
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: u */
    public InterfaceC6004h mo5602u() {
        return null;
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: v */
    public boolean mo5603v() {
        return false;
    }

    public /* synthetic */ C2956o(InterfaceC2643a2 interfaceC2643a2, InterfaceC0173a interfaceC0173a, C2956o c2956o, InterfaceC6018l1 interfaceC6018l1, int i10, AbstractC1043k abstractC1043k) {
        this(interfaceC2643a2, (i10 & 2) != 0 ? null : interfaceC0173a, (i10 & 4) != 0 ? null : c2956o, (i10 & 8) != 0 ? null : interfaceC6018l1);
    }

    public /* synthetic */ C2956o(InterfaceC2643a2 interfaceC2643a2, List list, C2956o c2956o, int i10, AbstractC1043k abstractC1043k) {
        this(interfaceC2643a2, list, (i10 & 4) != 0 ? null : c2956o);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2956o(InterfaceC2643a2 interfaceC2643a2, List list, C2956o c2956o) {
        this(interfaceC2643a2, new C2953l(list), c2956o, null, 8, null);
        interfaceC2643a2.getClass();
        list.getClass();
    }

    /* JADX INFO: renamed from: c */
    public static final List m10862c(List list) {
        return list;
    }

    /* JADX INFO: renamed from: m */
    public static final List m10868m(List list) {
        return list;
    }
}
