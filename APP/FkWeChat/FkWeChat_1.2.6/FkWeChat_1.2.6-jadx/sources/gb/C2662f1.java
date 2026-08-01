package gb;

import p112hb.AbstractC2949h;

/* JADX INFO: renamed from: gb.f1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2662f1 extends AbstractC2641a0 implements InterfaceC2679j2 {

    /* JADX INFO: renamed from: r */
    public final AbstractC2650c1 f6987r;

    /* JADX INFO: renamed from: s */
    public final AbstractC2706r0 f6988s;

    public C2662f1(AbstractC2650c1 abstractC2650c1, AbstractC2706r0 abstractC2706r0) {
        abstractC2650c1.getClass();
        abstractC2706r0.getClass();
        this.f6987r = abstractC2650c1;
        this.f6988s = abstractC2706r0;
    }

    @Override // gb.InterfaceC2679j2
    /* JADX INFO: renamed from: N */
    public AbstractC2706r0 mo9374N() {
        return this.f6988s;
    }

    @Override // gb.AbstractC2687l2
    /* JADX INFO: renamed from: a1 */
    public AbstractC2650c1 mo7032X0(boolean z10) {
        AbstractC2687l2 abstractC2687l2M9491d = AbstractC2683k2.m9491d(mo9373J0().mo7032X0(z10), mo9374N().mo9510W0().mo7032X0(z10));
        abstractC2687l2M9491d.getClass();
        return (AbstractC2650c1) abstractC2687l2M9491d;
    }

    @Override // gb.AbstractC2687l2
    /* JADX INFO: renamed from: b1 */
    public AbstractC2650c1 mo7034Z0(C2704q1 c2704q1) {
        c2704q1.getClass();
        AbstractC2687l2 abstractC2687l2M9491d = AbstractC2683k2.m9491d(mo9373J0().mo7034Z0(c2704q1), mo9374N());
        abstractC2687l2M9491d.getClass();
        return (AbstractC2650c1) abstractC2687l2M9491d;
    }

    @Override // gb.AbstractC2641a0
    /* JADX INFO: renamed from: c1 */
    public AbstractC2650c1 mo9261c1() {
        return this.f6987r;
    }

    @Override // gb.InterfaceC2679j2
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public AbstractC2650c1 mo9373J0() {
        return mo9261c1();
    }

    @Override // gb.AbstractC2641a0
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public C2662f1 mo9325d1(AbstractC2949h abstractC2949h) {
        abstractC2949h.getClass();
        AbstractC2706r0 abstractC2706r0Mo9586a = abstractC2949h.mo9586a(mo9261c1());
        abstractC2706r0Mo9586a.getClass();
        return new C2662f1((AbstractC2650c1) abstractC2706r0Mo9586a, abstractC2949h.mo9586a(mo9374N()));
    }

    @Override // gb.AbstractC2641a0
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public C2662f1 mo9262e1(AbstractC2650c1 abstractC2650c1) {
        abstractC2650c1.getClass();
        return new C2662f1(abstractC2650c1, mo9374N());
    }

    @Override // gb.AbstractC2650c1
    public String toString() {
        return "[@EnhancedForWarnings(" + mo9374N() + ")] " + mo9373J0();
    }
}
