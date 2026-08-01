package gb;

import java.util.List;
import p160kb.InterfaceC4227g;
import p259ra.AbstractC6569n;
import p259ra.InterfaceC6578w;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: gb.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2673i0 extends AbstractC2687l2 implements InterfaceC4227g {

    /* JADX INFO: renamed from: r */
    public final AbstractC2650c1 f7010r;

    /* JADX INFO: renamed from: s */
    public final AbstractC2650c1 f7011s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2673i0(AbstractC2650c1 abstractC2650c1, AbstractC2650c1 abstractC2650c12) {
        super(null);
        abstractC2650c1.getClass();
        abstractC2650c12.getClass();
        this.f7010r = abstractC2650c1;
        this.f7011s = abstractC2650c12;
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: R0 */
    public List mo9330R0() {
        return mo7035a1().mo9330R0();
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: S0 */
    public C2704q1 mo9331S0() {
        return mo7035a1().mo9331S0();
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: T0 */
    public InterfaceC2716u1 mo9332T0() {
        return mo7035a1().mo9332T0();
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: U0 */
    public boolean mo9258U0() {
        return mo7035a1().mo9258U0();
    }

    /* JADX INFO: renamed from: a1 */
    public abstract AbstractC2650c1 mo7035a1();

    /* JADX INFO: renamed from: b1 */
    public final AbstractC2650c1 m9451b1() {
        return this.f7010r;
    }

    /* JADX INFO: renamed from: c1 */
    public final AbstractC2650c1 m9452c1() {
        return this.f7011s;
    }

    /* JADX INFO: renamed from: d1 */
    public abstract String mo7036d1(AbstractC6569n abstractC6569n, InterfaceC6578w interfaceC6578w);

    public String toString() {
        return AbstractC6569n.f20555k.mo25911S(this);
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: v */
    public InterfaceC9913k mo7040v() {
        return mo7035a1().mo7040v();
    }
}
