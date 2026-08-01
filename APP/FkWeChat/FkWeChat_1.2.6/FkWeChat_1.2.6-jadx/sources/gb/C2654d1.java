package gb;

import java.util.List;
import p010a9.InterfaceC0184l;
import p112hb.AbstractC2949h;
import p129ib.C3376g;
import p129ib.C3382m;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: gb.d1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2654d1 extends AbstractC2650c1 {

    /* JADX INFO: renamed from: r */
    public final InterfaceC2716u1 f6970r;

    /* JADX INFO: renamed from: s */
    public final List f6971s;

    /* JADX INFO: renamed from: t */
    public final boolean f6972t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC9913k f6973u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC0184l f6974v;

    public C2654d1(InterfaceC2716u1 interfaceC2716u1, List list, boolean z10, InterfaceC9913k interfaceC9913k, InterfaceC0184l interfaceC0184l) {
        interfaceC2716u1.getClass();
        list.getClass();
        interfaceC9913k.getClass();
        interfaceC0184l.getClass();
        this.f6970r = interfaceC2716u1;
        this.f6971s = list;
        this.f6972t = z10;
        this.f6973u = interfaceC9913k;
        this.f6974v = interfaceC0184l;
        if (!(mo7040v() instanceof C3376g) || (mo7040v() instanceof C3382m)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("SimpleTypeImpl should not be created for error type: ");
        sb2.append(mo7040v());
        InterfaceC2716u1 interfaceC2716u1Mo9332T0 = mo9332T0();
        sb2.append('\n');
        sb2.append(interfaceC2716u1Mo9332T0);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: R0 */
    public List mo9330R0() {
        return this.f6971s;
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: S0 */
    public C2704q1 mo9331S0() {
        return C2704q1.f7069r.m9585k();
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: T0 */
    public InterfaceC2716u1 mo9332T0() {
        return this.f6970r;
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: U0 */
    public boolean mo9258U0() {
        return this.f6972t;
    }

    @Override // gb.AbstractC2687l2
    /* JADX INFO: renamed from: a1 */
    public AbstractC2650c1 mo7032X0(boolean z10) {
        return z10 == mo9258U0() ? this : z10 ? new C2642a1(this) : new C2727y0(this);
    }

    @Override // gb.AbstractC2687l2
    /* JADX INFO: renamed from: b1 */
    public AbstractC2650c1 mo7034Z0(C2704q1 c2704q1) {
        c2704q1.getClass();
        return c2704q1.isEmpty() ? this : new C2658e1(this, c2704q1);
    }

    @Override // gb.AbstractC2687l2
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public AbstractC2650c1 mo9325d1(AbstractC2949h abstractC2949h) {
        abstractC2949h.getClass();
        AbstractC2650c1 abstractC2650c1 = (AbstractC2650c1) this.f6974v.mo27m(abstractC2949h);
        return abstractC2650c1 == null ? this : abstractC2650c1;
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: v */
    public InterfaceC9913k mo7040v() {
        return this.f6973u;
    }
}
