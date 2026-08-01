package gb;

import p112hb.AbstractC2949h;
import p259ra.AbstractC6569n;
import p259ra.InterfaceC6578w;

/* JADX INFO: renamed from: gb.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2681k0 extends AbstractC2673i0 implements InterfaceC2679j2 {

    /* JADX INFO: renamed from: t */
    public final AbstractC2673i0 f7025t;

    /* JADX INFO: renamed from: u */
    public final AbstractC2706r0 f7026u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2681k0(AbstractC2673i0 abstractC2673i0, AbstractC2706r0 abstractC2706r0) {
        super(abstractC2673i0.m9451b1(), abstractC2673i0.m9452c1());
        abstractC2673i0.getClass();
        abstractC2706r0.getClass();
        this.f7025t = abstractC2673i0;
        this.f7026u = abstractC2706r0;
    }

    @Override // gb.InterfaceC2679j2
    /* JADX INFO: renamed from: N */
    public AbstractC2706r0 mo9374N() {
        return this.f7026u;
    }

    @Override // gb.AbstractC2687l2
    /* JADX INFO: renamed from: X0 */
    public AbstractC2687l2 mo7032X0(boolean z10) {
        return AbstractC2683k2.m9491d(mo9373J0().mo7032X0(z10), mo9374N().mo9510W0().mo7032X0(z10));
    }

    @Override // gb.AbstractC2687l2
    /* JADX INFO: renamed from: Z0 */
    public AbstractC2687l2 mo7034Z0(C2704q1 c2704q1) {
        c2704q1.getClass();
        return AbstractC2683k2.m9491d(mo9373J0().mo7034Z0(c2704q1), mo9374N());
    }

    @Override // gb.AbstractC2673i0
    /* JADX INFO: renamed from: a1 */
    public AbstractC2650c1 mo7035a1() {
        return mo9373J0().mo7035a1();
    }

    @Override // gb.AbstractC2673i0
    /* JADX INFO: renamed from: d1 */
    public String mo7036d1(AbstractC6569n abstractC6569n, InterfaceC6578w interfaceC6578w) {
        abstractC6569n.getClass();
        interfaceC6578w.getClass();
        return interfaceC6578w.mo26021g() ? abstractC6569n.mo25911S(mo9374N()) : mo9373J0().mo7036d1(abstractC6569n, interfaceC6578w);
    }

    @Override // gb.InterfaceC2679j2
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public AbstractC2673i0 mo9373J0() {
        return this.f7025t;
    }

    @Override // gb.AbstractC2687l2
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public C2681k0 mo9325d1(AbstractC2949h abstractC2949h) {
        abstractC2949h.getClass();
        AbstractC2706r0 abstractC2706r0Mo9586a = abstractC2949h.mo9586a(mo9373J0());
        abstractC2706r0Mo9586a.getClass();
        return new C2681k0((AbstractC2673i0) abstractC2706r0Mo9586a, abstractC2949h.mo9586a(mo9374N()));
    }

    @Override // gb.AbstractC2673i0
    public String toString() {
        return "[@EnhancedForWarnings(" + mo9374N() + ")] " + mo9373J0();
    }
}
