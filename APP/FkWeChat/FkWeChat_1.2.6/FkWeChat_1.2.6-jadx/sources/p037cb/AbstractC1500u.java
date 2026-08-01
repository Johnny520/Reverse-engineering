package p037cb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import la.AbstractC4721a;
import la.C4725e;
import p024b9.AbstractC1061t;
import p067eb.C2085m0;
import p067eb.InterfaceC2096s;
import p082fb.InterfaceC2412n;
import p143ja.C3780m;
import p143ja.C3781n;
import p143ja.C3783p;
import p143ja.C3784q;
import p185m8.AbstractC5116y;
import p213oa.C5691b;
import p213oa.C5692c;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6005h0;
import p376zd.C10010p0;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: cb.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1500u extends AbstractC1494r {

    /* JADX INFO: renamed from: A */
    public final C1485m0 f4441A;

    /* JADX INFO: renamed from: B */
    public C3781n f4442B;

    /* JADX INFO: renamed from: C */
    public InterfaceC9913k f4443C;

    /* JADX INFO: renamed from: x */
    public final AbstractC4721a f4444x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC2096s f4445y;

    /* JADX INFO: renamed from: z */
    public final C4725e f4446z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1500u(C5692c c5692c, InterfaceC2412n interfaceC2412n, InterfaceC6005h0 interfaceC6005h0, C3781n c3781n, AbstractC4721a abstractC4721a, InterfaceC2096s interfaceC2096s) {
        super(c5692c, interfaceC2412n, interfaceC6005h0);
        c5692c.getClass();
        interfaceC2412n.getClass();
        interfaceC6005h0.getClass();
        c3781n.getClass();
        abstractC4721a.getClass();
        this.f4444x = abstractC4721a;
        this.f4445y = interfaceC2096s;
        C3784q c3784qM14593O = c3781n.m14593O();
        c3784qM14593O.getClass();
        C3783p c3783pM14592N = c3781n.m14592N();
        c3783pM14592N.getClass();
        C4725e c4725e = new C4725e(c3784qM14593O, c3783pM14592N);
        this.f4446z = c4725e;
        this.f4441A = new C1485m0(c3781n, c4725e, abstractC4721a, new C1496s(this));
        this.f4442B = c3781n;
    }

    /* JADX INFO: renamed from: U0 */
    public static final InterfaceC6003g1 m5883U0(AbstractC1500u abstractC1500u, C5691b c5691b) {
        c5691b.getClass();
        InterfaceC2096s interfaceC2096s = abstractC1500u.f4445y;
        if (interfaceC2096s != null) {
            return interfaceC2096s;
        }
        InterfaceC6003g1 interfaceC6003g1 = InterfaceC6003g1.f18958a;
        interfaceC6003g1.getClass();
        return interfaceC6003g1;
    }

    /* JADX INFO: renamed from: W0 */
    public static final Collection m5884W0(AbstractC1500u abstractC1500u) {
        Collection collectionM5822b = abstractC1500u.mo5878L0().m5822b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionM5822b) {
            C5691b c5691b = (C5691b) obj;
            if (!c5691b.m22990j() && !C1482l.f4365c.m5817a().contains(c5691b)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C5691b) it.next()).m22988h());
        }
        return arrayList2;
    }

    @Override // p037cb.AbstractC1494r
    /* JADX INFO: renamed from: R0 */
    public void mo5880R0(C1486n c1486n) {
        c1486n.getClass();
        C3781n c3781n = this.f4442B;
        if (c3781n == null) {
            C10010p0.m38820a("Repeated call to DeserializedPackageFragmentImpl::initialize");
            return;
        }
        this.f4442B = null;
        C3780m c3780mM14591M = c3781n.m14591M();
        c3780mM14591M.getClass();
        this.f4443C = new C2085m0(this, c3780mM14591M, this.f4446z, this.f4444x, this.f4445y, c1486n, "scope of " + this, new C1498t(this));
    }

    @Override // p037cb.AbstractC1494r
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public C1485m0 mo5878L0() {
        return this.f4441A;
    }

    @Override // p229p9.InterfaceC6023n0
    /* JADX INFO: renamed from: v */
    public InterfaceC9913k mo5510v() {
        InterfaceC9913k interfaceC9913k = this.f4443C;
        if (interfaceC9913k != null) {
            return interfaceC9913k;
        }
        AbstractC1061t.m3851l("_memberScope");
        return null;
    }
}
