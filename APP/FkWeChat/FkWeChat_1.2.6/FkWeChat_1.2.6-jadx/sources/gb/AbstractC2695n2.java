package gb;

import java.util.List;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: gb.n2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2695n2 extends AbstractC2706r0 {
    public AbstractC2695n2() {
        super(null);
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: R0 */
    public List mo9330R0() {
        return mo9525X0().mo9330R0();
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: S0 */
    public C2704q1 mo9331S0() {
        return mo9525X0().mo9331S0();
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: T0 */
    public InterfaceC2716u1 mo9332T0() {
        return mo9525X0().mo9332T0();
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: U0 */
    public boolean mo9258U0() {
        return mo9525X0().mo9258U0();
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: W0 */
    public final AbstractC2687l2 mo9510W0() {
        AbstractC2706r0 abstractC2706r0Mo9525X0 = mo9525X0();
        while (abstractC2706r0Mo9525X0 instanceof AbstractC2695n2) {
            abstractC2706r0Mo9525X0 = ((AbstractC2695n2) abstractC2706r0Mo9525X0).mo9525X0();
        }
        abstractC2706r0Mo9525X0.getClass();
        return (AbstractC2687l2) abstractC2706r0Mo9525X0;
    }

    /* JADX INFO: renamed from: X0 */
    public abstract AbstractC2706r0 mo9525X0();

    /* JADX INFO: renamed from: Y0 */
    public abstract boolean mo9526Y0();

    public String toString() {
        return mo9526Y0() ? mo9525X0().toString() : "<Not computed yet>";
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: v */
    public InterfaceC9913k mo7040v() {
        return mo9525X0().mo7040v();
    }
}
