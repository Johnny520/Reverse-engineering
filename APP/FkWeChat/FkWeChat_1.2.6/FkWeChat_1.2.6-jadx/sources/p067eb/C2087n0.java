package p067eb;

import la.AbstractC4722b;
import la.C4728h;
import la.C4729i;
import la.InterfaceC4724d;
import p143ja.C3782o;
import p213oa.C5695f;
import p229p9.AbstractC6043u;
import p229p9.EnumC5996e0;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6055y0;
import p243q9.InterfaceC6333h;
import p273s9.C7222k0;

/* JADX INFO: renamed from: eb.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2087n0 extends C7222k0 implements InterfaceC2062b {

    /* JADX INFO: renamed from: S */
    public final C3782o f5835S;

    /* JADX INFO: renamed from: T */
    public final InterfaceC4724d f5836T;

    /* JADX INFO: renamed from: U */
    public final C4728h f5837U;

    /* JADX INFO: renamed from: V */
    public final C4729i f5838V;

    /* JADX INFO: renamed from: W */
    public final InterfaceC2096s f5839W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2087n0(InterfaceC6019m interfaceC6019m, InterfaceC6055y0 interfaceC6055y0, InterfaceC6333h interfaceC6333h, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u, boolean z10, C5695f c5695f, InterfaceC5986b.a aVar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, C3782o c3782o, InterfaceC4724d interfaceC4724d, C4728h c4728h, C4729i c4729i, InterfaceC2096s interfaceC2096s) {
        super(interfaceC6019m, interfaceC6055y0, interfaceC6333h, enumC5996e0, abstractC6043u, z10, c5695f, aVar, InterfaceC6003g1.f18958a, z11, z12, z15, false, z13, z14);
        interfaceC6019m.getClass();
        interfaceC6333h.getClass();
        enumC5996e0.getClass();
        abstractC6043u.getClass();
        c5695f.getClass();
        aVar.getClass();
        c3782o.getClass();
        interfaceC4724d.getClass();
        c4728h.getClass();
        c4729i.getClass();
        this.f5835S = c3782o;
        this.f5836T = interfaceC4724d;
        this.f5837U = c4728h;
        this.f5838V = c4729i;
        this.f5839W = interfaceC2096s;
    }

    @Override // p273s9.C7222k0, p229p9.InterfaceC5993d0
    /* JADX INFO: renamed from: C */
    public boolean mo7416C() {
        Boolean boolMo18852d = AbstractC4722b.f13961E.mo18852d(mo7417J().m14649e0());
        boolMo18852d.getClass();
        return boolMo18852d.booleanValue();
    }

    @Override // p273s9.C7222k0
    /* JADX INFO: renamed from: V0 */
    public C7222k0 mo437V0(InterfaceC6019m interfaceC6019m, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u, InterfaceC6055y0 interfaceC6055y0, InterfaceC5986b.a aVar, C5695f c5695f, InterfaceC6003g1 interfaceC6003g1) {
        interfaceC6019m.getClass();
        enumC5996e0.getClass();
        abstractC6043u.getClass();
        aVar.getClass();
        c5695f.getClass();
        interfaceC6003g1.getClass();
        return new C2087n0(interfaceC6019m, interfaceC6055y0, getAnnotations(), enumC5996e0, abstractC6043u, mo12681n0(), c5695f, aVar, mo12686w0(), mo435E(), mo7416C(), mo12672T(), mo5576R(), mo7417J(), mo7420g0(), mo7419X(), m7496m1(), mo7421i0());
    }

    @Override // p067eb.InterfaceC2098t
    /* JADX INFO: renamed from: X */
    public C4728h mo7419X() {
        return this.f5837U;
    }

    @Override // p067eb.InterfaceC2098t
    /* JADX INFO: renamed from: g0 */
    public InterfaceC4724d mo7420g0() {
        return this.f5836T;
    }

    @Override // p067eb.InterfaceC2098t
    /* JADX INFO: renamed from: i0 */
    public InterfaceC2096s mo7421i0() {
        return this.f5839W;
    }

    @Override // p067eb.InterfaceC2098t
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public C3782o mo7417J() {
        return this.f5835S;
    }

    /* JADX INFO: renamed from: m1 */
    public C4729i m7496m1() {
        return this.f5838V;
    }
}
