package gb;

/* JADX INFO: renamed from: gb.e1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2658e1 extends AbstractC2645b0 {

    /* JADX INFO: renamed from: s */
    public final C2704q1 f6982s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2658e1(AbstractC2650c1 abstractC2650c1, C2704q1 c2704q1) {
        super(abstractC2650c1);
        abstractC2650c1.getClass();
        c2704q1.getClass();
        this.f6982s = c2704q1;
    }

    @Override // gb.AbstractC2641a0, gb.AbstractC2706r0
    /* JADX INFO: renamed from: S0 */
    public C2704q1 mo9331S0() {
        return this.f6982s;
    }

    @Override // gb.AbstractC2641a0
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public C2658e1 mo9262e1(AbstractC2650c1 abstractC2650c1) {
        abstractC2650c1.getClass();
        return new C2658e1(abstractC2650c1, mo9331S0());
    }
}
