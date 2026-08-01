package p067eb;

import gb.AbstractC2706r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import la.AbstractC4727g;
import p037cb.AbstractC1483l0;
import p037cb.C1489o0;
import p037cb.C1490p;
import p037cb.C1505w0;
import p082fb.InterfaceC2412n;
import p143ja.C3785r;
import p143ja.C3787t;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5116y;
import p213oa.C5695f;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6012j1;
import p229p9.InterfaceC6019m;
import p243q9.InterfaceC6333h;
import p273s9.AbstractC7203b;
import p327wa.AbstractC9211e;

/* JADX INFO: renamed from: eb.r0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2095r0 extends AbstractC7203b {

    /* JADX INFO: renamed from: A */
    public final C1490p f5864A;

    /* JADX INFO: renamed from: B */
    public final C3787t f5865B;

    /* JADX INFO: renamed from: C */
    public final C2060a f5866C;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2095r0(C1490p c1490p, C3787t c3787t, int i10) {
        c1490p.getClass();
        c3787t.getClass();
        InterfaceC2412n interfaceC2412nM5872h = c1490p.m5872h();
        InterfaceC6019m interfaceC6019mM5869e = c1490p.m5869e();
        InterfaceC6333h interfaceC6333hM25003b = InterfaceC6333h.f19873o.m25003b();
        C5695f c5695fM5819b = AbstractC1483l0.m5819b(c1490p.m5871g(), c3787t.m14955N());
        C1489o0 c1489o0 = C1489o0.f4410a;
        C3787t.c cVarM14961T = c3787t.m14961T();
        cVarM14961T.getClass();
        super(interfaceC2412nM5872h, interfaceC6019mM5869e, interfaceC6333hM25003b, c5695fM5819b, c1489o0.m5864d(cVarM14961T), c3787t.m14956O(), i10, InterfaceC6003g1.f18958a, InterfaceC6012j1.a.f18963a);
        this.f5864A = c1490p;
        this.f5865B = c3787t;
        this.f5866C = new C2060a(c1490p.m5872h(), new C2093q0(this));
    }

    /* JADX INFO: renamed from: T0 */
    public static final List m7511T0(C2095r0 c2095r0) {
        return AbstractC5081g0.m20554X0(c2095r0.f5864A.m5867c().m5826d().mo5747h(c2095r0.f5865B, c2095r0.f5864A.m5871g()));
    }

    @Override // p273s9.AbstractC7215h
    /* JADX INFO: renamed from: R0 */
    public List mo5496R0() {
        List listM18892s = AbstractC4727g.m18892s(this.f5865B, this.f5864A.m5874j());
        if (listM18892s.isEmpty()) {
            return AbstractC5112w.m20789e(AbstractC9211e.m35858m(this).m20937z());
        }
        C1505w0 c1505w0M5873i = this.f5864A.m5873i();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM18892s, 10));
        Iterator it = listM18892s.iterator();
        while (it.hasNext()) {
            arrayList.add(c1505w0M5873i.m5914u((C3785r) it.next()));
        }
        return arrayList;
    }

    @Override // p243q9.AbstractC6327b, p243q9.InterfaceC6326a
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public C2060a getAnnotations() {
        return this.f5866C;
    }

    @Override // p273s9.AbstractC7215h
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public Void mo5495Q0(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
