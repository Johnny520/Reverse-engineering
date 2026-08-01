package gb;

import p112hb.AbstractC2949h;

/* JADX INFO: renamed from: gb.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2640a extends AbstractC2641a0 {

    /* JADX INFO: renamed from: r */
    public final AbstractC2650c1 f6960r;

    /* JADX INFO: renamed from: s */
    public final AbstractC2650c1 f6961s;

    public C2640a(AbstractC2650c1 abstractC2650c1, AbstractC2650c1 abstractC2650c12) {
        abstractC2650c1.getClass();
        abstractC2650c12.getClass();
        this.f6960r = abstractC2650c1;
        this.f6961s = abstractC2650c12;
    }

    /* JADX INFO: renamed from: a0 */
    public final AbstractC2650c1 m9324a0() {
        return mo9261c1();
    }

    @Override // gb.AbstractC2687l2
    /* JADX INFO: renamed from: b1 */
    public AbstractC2650c1 mo7034Z0(C2704q1 c2704q1) {
        c2704q1.getClass();
        return new C2640a(mo9261c1().mo7034Z0(c2704q1), this.f6961s);
    }

    @Override // gb.AbstractC2641a0
    /* JADX INFO: renamed from: c1 */
    public AbstractC2650c1 mo9261c1() {
        return this.f6960r;
    }

    /* JADX INFO: renamed from: f1 */
    public final AbstractC2650c1 m9326f1() {
        return this.f6961s;
    }

    @Override // gb.AbstractC2650c1
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public C2640a mo7032X0(boolean z10) {
        return new C2640a(mo9261c1().mo7032X0(z10), this.f6961s.mo7032X0(z10));
    }

    @Override // gb.AbstractC2641a0
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C2640a mo9325d1(AbstractC2949h abstractC2949h) {
        abstractC2949h.getClass();
        AbstractC2706r0 abstractC2706r0Mo9586a = abstractC2949h.mo9586a(mo9261c1());
        abstractC2706r0Mo9586a.getClass();
        AbstractC2706r0 abstractC2706r0Mo9586a2 = abstractC2949h.mo9586a(this.f6961s);
        abstractC2706r0Mo9586a2.getClass();
        return new C2640a((AbstractC2650c1) abstractC2706r0Mo9586a, (AbstractC2650c1) abstractC2706r0Mo9586a2);
    }

    @Override // gb.AbstractC2641a0
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public C2640a mo9262e1(AbstractC2650c1 abstractC2650c1) {
        abstractC2650c1.getClass();
        return new C2640a(abstractC2650c1, this.f6961s);
    }
}
