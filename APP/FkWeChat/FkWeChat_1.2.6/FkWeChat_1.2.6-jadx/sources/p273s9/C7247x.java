package p273s9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p024b9.C1038h0;
import p082fb.AbstractC2411m;
import p082fb.InterfaceC2407i;
import p082fb.InterfaceC2412n;
import p098g9.InterfaceC2557k;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5116y;
import p213oa.C5692c;
import p229p9.AbstractC6038s0;
import p229p9.InterfaceC6023n0;
import p229p9.InterfaceC6025o;
import p229p9.InterfaceC6044u0;
import p243q9.InterfaceC6333h;
import za.C9904b;
import za.C9911i;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: s9.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C7247x extends AbstractC7225m implements InterfaceC6044u0 {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ InterfaceC2557k[] f24102x = {AbstractC1052o0.m3814i(new C1038h0(C7247x.class, "fragments", "getFragments()Ljava/util/List;", 0)), AbstractC1052o0.m3814i(new C1038h0(C7247x.class, "empty", "getEmpty()Z", 0))};

    /* JADX INFO: renamed from: s */
    public final C7212f0 f24103s;

    /* JADX INFO: renamed from: t */
    public final C5692c f24104t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC2407i f24105u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC2407i f24106v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC9913k f24107w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7247x(C7212f0 c7212f0, C5692c c5692c, InterfaceC2412n interfaceC2412n) {
        super(InterfaceC6333h.f19873o.m25003b(), c5692c.m23000g());
        c7212f0.getClass();
        c5692c.getClass();
        interfaceC2412n.getClass();
        this.f24103s = c7212f0;
        this.f24104t = c5692c;
        this.f24105u = interfaceC2412n.mo8663f(new C7241u(this));
        this.f24106v = interfaceC2412n.mo8663f(new C7243v(this));
        this.f24107w = new C9911i(interfaceC2412n, new C7245w(this));
    }

    /* JADX INFO: renamed from: R0 */
    public static final boolean m28678R0(C7247x c7247x) {
        return AbstractC6038s0.m24065b(c7247x.mo24099z0().m28462S0(), c7247x.mo24097d());
    }

    /* JADX INFO: renamed from: S0 */
    public static final List m28679S0(C7247x c7247x) {
        return AbstractC6038s0.m24066c(c7247x.mo24099z0().m28462S0(), c7247x.mo24097d());
    }

    /* JADX INFO: renamed from: W0 */
    public static final InterfaceC9913k m28680W0(C7247x c7247x) {
        if (c7247x.isEmpty()) {
            return InterfaceC9913k.b.f33436b;
        }
        List listMo24096O = c7247x.mo24096O();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listMo24096O, 10));
        Iterator it = listMo24096O.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC6023n0) it.next()).mo5510v());
        }
        List listM20534F0 = AbstractC5081g0.m20534F0(arrayList, new C7232p0(c7247x.mo24099z0(), c7247x.mo24097d()));
        return C9904b.f33389d.m38420a("package view scope for " + c7247x.mo24097d() + " in " + c7247x.mo24099z0().getName(), listM20534F0);
    }

    @Override // p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: M0 */
    public Object mo12663M0(InterfaceC6025o interfaceC6025o, Object obj) {
        interfaceC6025o.getClass();
        return interfaceC6025o.mo24041l(this, obj);
    }

    @Override // p229p9.InterfaceC6044u0
    /* JADX INFO: renamed from: O */
    public List mo24096O() {
        return (List) AbstractC2411m.m8702a(this.f24105u, this, f24102x[0]);
    }

    @Override // p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public InterfaceC6044u0 mo7443b() {
        if (mo24097d().m22996c()) {
            return null;
        }
        return mo24099z0().mo12666e0(mo24097d().m22997d());
    }

    /* JADX INFO: renamed from: U0 */
    public final boolean m28682U0() {
        return ((Boolean) AbstractC2411m.m8702a(this.f24106v, this, f24102x[1])).booleanValue();
    }

    @Override // p229p9.InterfaceC6044u0
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public C7212f0 mo24099z0() {
        return this.f24103s;
    }

    @Override // p229p9.InterfaceC6044u0
    /* JADX INFO: renamed from: d */
    public C5692c mo24097d() {
        return this.f24104t;
    }

    public boolean equals(Object obj) {
        InterfaceC6044u0 interfaceC6044u0 = obj instanceof InterfaceC6044u0 ? (InterfaceC6044u0) obj : null;
        return interfaceC6044u0 != null && AbstractC1061t.m3842c(mo24097d(), interfaceC6044u0.mo24097d()) && AbstractC1061t.m3842c(mo24099z0(), interfaceC6044u0.mo24099z0());
    }

    public int hashCode() {
        return (mo24099z0().hashCode() * 31) + mo24097d().hashCode();
    }

    @Override // p229p9.InterfaceC6044u0
    public boolean isEmpty() {
        return m28682U0();
    }

    @Override // p229p9.InterfaceC6044u0
    /* JADX INFO: renamed from: v */
    public InterfaceC9913k mo24098v() {
        return this.f24107w;
    }
}
