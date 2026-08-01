package za;

import java.util.Collection;
import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p024b9.C1038h0;
import p082fb.AbstractC2411m;
import p082fb.InterfaceC2407i;
import p082fb.InterfaceC2412n;
import p098g9.InterfaceC2557k;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p213oa.C5695f;
import p229p9.EnumC5998f;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6000f1;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6055y0;
import p244qb.C6379j;
import p342x9.InterfaceC9468b;
import sa.AbstractC7258h;

/* JADX INFO: renamed from: za.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9919q extends AbstractC9914l {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InterfaceC2557k[] f33439f = {AbstractC1052o0.m3814i(new C1038h0(C9919q.class, "functions", "getFunctions()Ljava/util/List;", 0)), AbstractC1052o0.m3814i(new C1038h0(C9919q.class, "properties", "getProperties()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: b */
    public final InterfaceC5995e f33440b;

    /* JADX INFO: renamed from: c */
    public final boolean f33441c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2407i f33442d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2407i f33443e;

    public C9919q(InterfaceC2412n interfaceC2412n, InterfaceC5995e interfaceC5995e, boolean z10) {
        interfaceC2412n.getClass();
        interfaceC5995e.getClass();
        this.f33440b = interfaceC5995e;
        this.f33441c = z10;
        interfaceC5995e.mo5588j();
        EnumC5998f enumC5998f = EnumC5998f.f18948r;
        this.f33442d = interfaceC2412n.mo8663f(new C9917o(this));
        this.f33443e = interfaceC2412n.mo8663f(new C9918p(this));
    }

    /* JADX INFO: renamed from: j */
    public static final List m38464j(C9919q c9919q) {
        return AbstractC5114x.m20803r(AbstractC7258h.m28723g(c9919q.f33440b), AbstractC7258h.m28724h(c9919q.f33440b));
    }

    /* JADX INFO: renamed from: p */
    public static final List m38465p(C9919q c9919q) {
        return c9919q.f33441c ? AbstractC5114x.m20804s(AbstractC7258h.m28722f(c9919q.f33440b)) : AbstractC5114x.m20800o();
    }

    @Override // za.AbstractC9914l, za.InterfaceC9913k
    /* JADX INFO: renamed from: c */
    public Collection mo5515c(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        List listM38470o = m38470o();
        C6379j c6379j = new C6379j();
        for (Object obj : listM38470o) {
            if (AbstractC1061t.m3842c(((InterfaceC6055y0) obj).getName(), c5695f)) {
                c6379j.add(obj);
            }
        }
        return c6379j;
    }

    @Override // za.AbstractC9914l, za.InterfaceC9916n
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ InterfaceC6004h mo5518f(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        return (InterfaceC6004h) m38466k(c5695f, interfaceC9468b);
    }

    /* JADX INFO: renamed from: k */
    public Void m38466k(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        return null;
    }

    @Override // za.AbstractC9914l, za.InterfaceC9916n
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public List mo5519g(C9906d c9906d, InterfaceC0184l interfaceC0184l) {
        c9906d.getClass();
        interfaceC0184l.getClass();
        return AbstractC5081g0.m20533E0(m38469n(), m38470o());
    }

    @Override // za.AbstractC9914l, za.InterfaceC9913k
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C6379j mo5513a(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        List listM38469n = m38469n();
        C6379j c6379j = new C6379j();
        for (Object obj : listM38469n) {
            if (AbstractC1061t.m3842c(((InterfaceC6000f1) obj).getName(), c5695f)) {
                c6379j.add(obj);
            }
        }
        return c6379j;
    }

    /* JADX INFO: renamed from: n */
    public final List m38469n() {
        return (List) AbstractC2411m.m8702a(this.f33442d, this, f33439f[0]);
    }

    /* JADX INFO: renamed from: o */
    public final List m38470o() {
        return (List) AbstractC2411m.m8702a(this.f33443e, this, f33439f[1]);
    }
}
