package p273s9;

import ae.C0307f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p082fb.InterfaceC2405g;
import p082fb.InterfaceC2412n;
import p172l8.AbstractC4706m;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p186m9.AbstractC5128i;
import p186m9.C5129j;
import p213oa.C5692c;
import p213oa.C5695f;
import p229p9.AbstractC5990c0;
import p229p9.C6002g0;
import p229p9.InterfaceC6005h0;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6025o;
import p229p9.InterfaceC6026o0;
import p229p9.InterfaceC6044u0;
import p243q9.InterfaceC6333h;
import p273s9.InterfaceC7218i0;
import pa.AbstractC6058a;

/* JADX INFO: renamed from: s9.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7212f0 extends AbstractC7225m implements InterfaceC6005h0 {

    /* JADX INFO: renamed from: A */
    public final InterfaceC2405g f23897A;

    /* JADX INFO: renamed from: B */
    public final InterfaceC4705l f23898B;

    /* JADX INFO: renamed from: s */
    public final InterfaceC2412n f23899s;

    /* JADX INFO: renamed from: t */
    public final AbstractC5128i f23900t;

    /* JADX INFO: renamed from: u */
    public final C5695f f23901u;

    /* JADX INFO: renamed from: v */
    public final Map f23902v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC7218i0 f23903w;

    /* JADX INFO: renamed from: x */
    public InterfaceC7204b0 f23904x;

    /* JADX INFO: renamed from: y */
    public InterfaceC6026o0 f23905y;

    /* JADX INFO: renamed from: z */
    public boolean f23906z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7212f0(C5695f c5695f, InterfaceC2412n interfaceC2412n, AbstractC5128i abstractC5128i, AbstractC6058a abstractC6058a, Map map, C5695f c5695f2) {
        super(InterfaceC6333h.f19873o.m25003b(), c5695f);
        c5695f.getClass();
        interfaceC2412n.getClass();
        abstractC5128i.getClass();
        map.getClass();
        this.f23899s = interfaceC2412n;
        this.f23900t = abstractC5128i;
        this.f23901u = c5695f2;
        if (!c5695f.m23033k()) {
            C0307f.m923a("Module name must be special: ", c5695f);
            throw null;
        }
        this.f23902v = map;
        InterfaceC7218i0 interfaceC7218i0 = (InterfaceC7218i0) mo12667p0(InterfaceC7218i0.f23939a.m28503a());
        this.f23903w = interfaceC7218i0 == null ? InterfaceC7218i0.b.f23942b : interfaceC7218i0;
        this.f23906z = true;
        this.f23897A = interfaceC2412n.mo8659b(new C7208d0(this));
        this.f23898B = AbstractC4706m.m18787a(new C7210e0(this));
    }

    /* JADX INFO: renamed from: V0 */
    private final boolean m28457V0() {
        return this.f23905y != null;
    }

    /* JADX INFO: renamed from: X0 */
    public static final C7223l m28458X0(C7212f0 c7212f0) {
        InterfaceC7204b0 interfaceC7204b0 = c7212f0.f23904x;
        if (interfaceC7204b0 == null) {
            C5129j.m20943a("Dependencies of module ", c7212f0.m28461R0(), " were not set before querying module content");
            return null;
        }
        List listMo28450a = interfaceC7204b0.mo28450a();
        c7212f0.m28460Q0();
        listMo28450a.contains(c7212f0);
        Iterator it = listMo28450a.iterator();
        while (it.hasNext()) {
            ((C7212f0) it.next()).m28457V0();
        }
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listMo28450a, 10));
        Iterator it2 = listMo28450a.iterator();
        while (it2.hasNext()) {
            InterfaceC6026o0 interfaceC6026o0 = ((C7212f0) it2.next()).f23905y;
            interfaceC6026o0.getClass();
            arrayList.add(interfaceC6026o0);
        }
        return new C7223l(arrayList, "CompositeProvider@ModuleDescriptor for " + c7212f0.getName());
    }

    /* JADX INFO: renamed from: Y0 */
    public static final InterfaceC6044u0 m28459Y0(C7212f0 c7212f0, C5692c c5692c) {
        c5692c.getClass();
        return c7212f0.f23903w.mo28502a(c7212f0, c5692c, c7212f0.f23899s);
    }

    @Override // p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: M0 */
    public Object mo12663M0(InterfaceC6025o interfaceC6025o, Object obj) {
        return InterfaceC6005h0.a.m24013a(this, interfaceC6025o, obj);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m28460Q0() {
        if (m28465W0()) {
            return;
        }
        AbstractC5990c0.m23997a(this);
    }

    /* JADX INFO: renamed from: R0 */
    public final String m28461R0() {
        String string = getName().toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: S0 */
    public final InterfaceC6026o0 m28462S0() {
        m28460Q0();
        return m28463T0();
    }

    /* JADX INFO: renamed from: T0 */
    public final C7223l m28463T0() {
        return (C7223l) this.f23898B.getValue();
    }

    /* JADX INFO: renamed from: U0 */
    public final void m28464U0(InterfaceC6026o0 interfaceC6026o0) {
        interfaceC6026o0.getClass();
        m28457V0();
        this.f23905y = interfaceC6026o0;
    }

    /* JADX INFO: renamed from: W0 */
    public boolean m28465W0() {
        return this.f23906z;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m28466Z0(List list) {
        list.getClass();
        m28467a1(list, AbstractC5068b1.m20483e());
    }

    /* JADX INFO: renamed from: a1 */
    public final void m28467a1(List list, Set set) {
        list.getClass();
        set.getClass();
        m28468b1(new C7206c0(list, set, AbstractC5114x.m20800o(), AbstractC5068b1.m20483e()));
    }

    @Override // p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: b */
    public InterfaceC6019m mo7443b() {
        return InterfaceC6005h0.a.m24014b(this);
    }

    @Override // p229p9.InterfaceC6005h0
    /* JADX INFO: renamed from: b0 */
    public boolean mo12665b0(InterfaceC6005h0 interfaceC6005h0) {
        interfaceC6005h0.getClass();
        if (AbstractC1061t.m3842c(this, interfaceC6005h0)) {
            return true;
        }
        InterfaceC7204b0 interfaceC7204b0 = this.f23904x;
        interfaceC7204b0.getClass();
        return AbstractC5081g0.m20559a0(interfaceC7204b0.mo28451b(), interfaceC6005h0) || mo12670x0().contains(interfaceC6005h0) || interfaceC6005h0.mo12670x0().contains(this);
    }

    /* JADX INFO: renamed from: b1 */
    public final void m28468b1(InterfaceC7204b0 interfaceC7204b0) {
        interfaceC7204b0.getClass();
        this.f23904x = interfaceC7204b0;
    }

    /* JADX INFO: renamed from: c1 */
    public final void m28469c1(C7212f0... c7212f0Arr) {
        c7212f0Arr.getClass();
        m28466Z0(AbstractC5106t.m20713V0(c7212f0Arr));
    }

    @Override // p229p9.InterfaceC6005h0
    /* JADX INFO: renamed from: e0 */
    public InterfaceC6044u0 mo12666e0(C5692c c5692c) {
        c5692c.getClass();
        m28460Q0();
        return (InterfaceC6044u0) this.f23897A.mo27m(c5692c);
    }

    @Override // p229p9.InterfaceC6005h0
    /* JADX INFO: renamed from: p0 */
    public Object mo12667p0(C6002g0 c6002g0) {
        c6002g0.getClass();
        Object obj = this.f23902v.get(c6002g0);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // p229p9.InterfaceC6005h0
    /* JADX INFO: renamed from: q */
    public Collection mo12668q(C5692c c5692c, InterfaceC0184l interfaceC0184l) {
        c5692c.getClass();
        interfaceC0184l.getClass();
        m28460Q0();
        return m28462S0().mo3936q(c5692c, interfaceC0184l);
    }

    @Override // p229p9.InterfaceC6005h0
    /* JADX INFO: renamed from: t */
    public AbstractC5128i mo12669t() {
        return this.f23900t;
    }

    @Override // p273s9.AbstractC7225m
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (!m28465W0()) {
            sb2.append(" !isValid");
        }
        sb2.append(" packageFragmentProvider: ");
        InterfaceC6026o0 interfaceC6026o0 = this.f23905y;
        sb2.append(interfaceC6026o0 != null ? interfaceC6026o0.getClass().getSimpleName() : null);
        return sb2.toString();
    }

    @Override // p229p9.InterfaceC6005h0
    /* JADX INFO: renamed from: x0 */
    public List mo12670x0() {
        InterfaceC7204b0 interfaceC7204b0 = this.f23904x;
        if (interfaceC7204b0 != null) {
            return interfaceC7204b0.mo28452c();
        }
        C5129j.m20943a("Dependencies of module ", m28461R0(), " were not set");
        return null;
    }

    public /* synthetic */ C7212f0(C5695f c5695f, InterfaceC2412n interfaceC2412n, AbstractC5128i abstractC5128i, AbstractC6058a abstractC6058a, Map map, C5695f c5695f2, int i10, AbstractC1043k abstractC1043k) {
        this(c5695f, interfaceC2412n, abstractC5128i, (i10 & 8) != 0 ? null : abstractC6058a, (i10 & 16) != 0 ? AbstractC5109u0.m20768i() : map, (i10 & 32) != 0 ? null : c5695f2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7212f0(C5695f c5695f, InterfaceC2412n interfaceC2412n, AbstractC5128i abstractC5128i, AbstractC6058a abstractC6058a) {
        this(c5695f, interfaceC2412n, abstractC5128i, abstractC6058a, null, null, 48, null);
        c5695f.getClass();
        interfaceC2412n.getClass();
        abstractC5128i.getClass();
    }
}
