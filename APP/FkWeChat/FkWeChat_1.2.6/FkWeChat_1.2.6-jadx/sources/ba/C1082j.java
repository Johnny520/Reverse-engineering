package ba;

import ba.InterfaceC1088p;
import ca.C1415d0;
import java.util.Collection;
import java.util.List;
import p010a9.InterfaceC0184l;
import p081fa.InterfaceC2393u;
import p082fb.InterfaceC2399a;
import p172l8.AbstractC4707n;
import p185m8.AbstractC5114x;
import p213oa.C5692c;
import p229p9.InterfaceC6041t0;
import p244qb.AbstractC6370a;
import p358y9.AbstractC9647t;

/* JADX INFO: renamed from: ba.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1082j implements InterfaceC6041t0 {

    /* JADX INFO: renamed from: a */
    public final C1083k f3263a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2399a f3264b;

    public C1082j(C1076d c1076d) {
        c1076d.getClass();
        C1083k c1083k = new C1083k(c1076d, InterfaceC1088p.a.f3276a, AbstractC4707n.m18789c(null));
        this.f3263a = c1083k;
        this.f3264b = c1083k.m3941e().mo8661d();
    }

    /* JADX INFO: renamed from: f */
    public static final C1415d0 m3930f(C1082j c1082j, InterfaceC2393u interfaceC2393u) {
        return new C1415d0(c1082j.f3263a, interfaceC2393u);
    }

    @Override // p229p9.InterfaceC6041t0
    /* JADX INFO: renamed from: a */
    public boolean mo3931a(C5692c c5692c) {
        c5692c.getClass();
        return AbstractC9647t.m37721a(this.f3263a.m3937a().m3899d(), c5692c, false, 2, null) == null;
    }

    @Override // p229p9.InterfaceC6041t0
    /* JADX INFO: renamed from: b */
    public void mo3932b(C5692c c5692c, Collection collection) {
        c5692c.getClass();
        collection.getClass();
        AbstractC6370a.m25339a(collection, m3934e(c5692c));
    }

    @Override // p229p9.InterfaceC6026o0
    /* JADX INFO: renamed from: c */
    public List mo3933c(C5692c c5692c) {
        c5692c.getClass();
        return AbstractC5114x.m20804s(m3934e(c5692c));
    }

    /* JADX INFO: renamed from: e */
    public final C1415d0 m3934e(C5692c c5692c) {
        InterfaceC2393u interfaceC2393uM37721a = AbstractC9647t.m37721a(this.f3263a.m3937a().m3899d(), c5692c, false, 2, null);
        if (interfaceC2393uM37721a == null) {
            return null;
        }
        return (C1415d0) this.f3264b.mo8651a(c5692c, new C1081i(this, interfaceC2393uM37721a));
    }

    @Override // p229p9.InterfaceC6026o0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public List mo3936q(C5692c c5692c, InterfaceC0184l interfaceC0184l) {
        c5692c.getClass();
        interfaceC0184l.getClass();
        C1415d0 c1415d0M3934e = m3934e(c5692c);
        List listM5509W0 = c1415d0M3934e != null ? c1415d0M3934e.m5509W0() : null;
        return listM5509W0 == null ? AbstractC5114x.m20800o() : listM5509W0;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f3263a.m3937a().m3908m();
    }
}
