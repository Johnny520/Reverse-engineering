package gb;

/* JADX INFO: renamed from: gb.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2645b0 extends AbstractC2641a0 {

    /* JADX INFO: renamed from: r */
    public final AbstractC2650c1 f6962r;

    public AbstractC2645b0(AbstractC2650c1 abstractC2650c1) {
        abstractC2650c1.getClass();
        this.f6962r = abstractC2650c1;
    }

    @Override // gb.AbstractC2687l2
    /* JADX INFO: renamed from: a1 */
    public AbstractC2650c1 mo7032X0(boolean z10) {
        return z10 == mo9258U0() ? this : mo9261c1().mo7032X0(z10).mo7034Z0(mo9331S0());
    }

    @Override // gb.AbstractC2687l2
    /* JADX INFO: renamed from: b1 */
    public AbstractC2650c1 mo7034Z0(C2704q1 c2704q1) {
        c2704q1.getClass();
        return c2704q1 != mo9331S0() ? new C2658e1(this, c2704q1) : this;
    }

    @Override // gb.AbstractC2641a0
    /* JADX INFO: renamed from: c1 */
    public AbstractC2650c1 mo9261c1() {
        return this.f6962r;
    }
}
