package p037cb;

import java.util.Collection;
import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p082fb.InterfaceC2406h;
import p082fb.InterfaceC2412n;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5114x;
import p213oa.C5692c;
import p229p9.InterfaceC6005h0;
import p229p9.InterfaceC6023n0;
import p229p9.InterfaceC6041t0;
import p244qb.AbstractC6370a;

/* JADX INFO: renamed from: cb.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1464c implements InterfaceC6041t0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2412n f4317a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1461a0 f4318b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6005h0 f4319c;

    /* JADX INFO: renamed from: d */
    public C1486n f4320d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2406h f4321e;

    public AbstractC1464c(InterfaceC2412n interfaceC2412n, InterfaceC1461a0 interfaceC1461a0, InterfaceC6005h0 interfaceC6005h0) {
        interfaceC2412n.getClass();
        interfaceC1461a0.getClass();
        interfaceC6005h0.getClass();
        this.f4317a = interfaceC2412n;
        this.f4318b = interfaceC1461a0;
        this.f4319c = interfaceC6005h0;
        this.f4321e = interfaceC2412n.mo8665h(new C1462b(this));
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC6023n0 m5755f(AbstractC1464c abstractC1464c, C5692c c5692c) {
        c5692c.getClass();
        AbstractC1494r abstractC1494rMo5756e = abstractC1464c.mo5756e(c5692c);
        if (abstractC1494rMo5756e == null) {
            return null;
        }
        abstractC1494rMo5756e.mo5880R0(abstractC1464c.m5757g());
        return abstractC1494rMo5756e;
    }

    @Override // p229p9.InterfaceC6041t0
    /* JADX INFO: renamed from: a */
    public boolean mo3931a(C5692c c5692c) {
        c5692c.getClass();
        return (this.f4321e.mo8692q(c5692c) ? (InterfaceC6023n0) this.f4321e.mo27m(c5692c) : mo5756e(c5692c)) == null;
    }

    @Override // p229p9.InterfaceC6041t0
    /* JADX INFO: renamed from: b */
    public void mo3932b(C5692c c5692c, Collection collection) {
        c5692c.getClass();
        collection.getClass();
        AbstractC6370a.m25339a(collection, this.f4321e.mo27m(c5692c));
    }

    @Override // p229p9.InterfaceC6026o0
    /* JADX INFO: renamed from: c */
    public List mo3933c(C5692c c5692c) {
        c5692c.getClass();
        return AbstractC5114x.m20804s(this.f4321e.mo27m(c5692c));
    }

    /* JADX INFO: renamed from: e */
    public abstract AbstractC1494r mo5756e(C5692c c5692c);

    /* JADX INFO: renamed from: g */
    public final C1486n m5757g() {
        C1486n c1486n = this.f4320d;
        if (c1486n != null) {
            return c1486n;
        }
        AbstractC1061t.m3851l("components");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC1461a0 m5758h() {
        return this.f4318b;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC6005h0 m5759i() {
        return this.f4319c;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC2412n m5760j() {
        return this.f4317a;
    }

    /* JADX INFO: renamed from: k */
    public final void m5761k(C1486n c1486n) {
        c1486n.getClass();
        this.f4320d = c1486n;
    }

    @Override // p229p9.InterfaceC6026o0
    /* JADX INFO: renamed from: q */
    public Collection mo3936q(C5692c c5692c, InterfaceC0184l interfaceC0184l) {
        c5692c.getClass();
        interfaceC0184l.getClass();
        return AbstractC5068b1.m20483e();
    }
}
