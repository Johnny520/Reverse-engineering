package gb;

import java.util.List;
import p024b9.AbstractC1043k;
import p112hb.AbstractC2949h;
import p112hb.C2962u;
import p160kb.InterfaceC4229i;
import p243q9.InterfaceC6326a;
import p243q9.InterfaceC6333h;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: gb.r0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2706r0 implements InterfaceC6326a, InterfaceC4229i {

    /* JADX INFO: renamed from: q */
    public int f7071q;

    public /* synthetic */ AbstractC2706r0(AbstractC1043k abstractC1043k) {
        this();
    }

    /* JADX INFO: renamed from: Q0 */
    public final int m9587Q0() {
        return AbstractC2718v0.m9643a(this) ? super.hashCode() : (((mo9332T0().hashCode() * 31) + mo9330R0().hashCode()) * 31) + (mo9258U0() ? 1 : 0);
    }

    /* JADX INFO: renamed from: R0 */
    public abstract List mo9330R0();

    /* JADX INFO: renamed from: S0 */
    public abstract C2704q1 mo9331S0();

    /* JADX INFO: renamed from: T0 */
    public abstract InterfaceC2716u1 mo9332T0();

    /* JADX INFO: renamed from: U0 */
    public abstract boolean mo9258U0();

    /* JADX INFO: renamed from: V0 */
    public abstract AbstractC2706r0 mo7031V0(AbstractC2949h abstractC2949h);

    /* JADX INFO: renamed from: W0 */
    public abstract AbstractC2687l2 mo9510W0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2706r0)) {
            return false;
        }
        AbstractC2706r0 abstractC2706r0 = (AbstractC2706r0) obj;
        return mo9258U0() == abstractC2706r0.mo9258U0() && C2962u.f7810a.m10957a(mo9510W0(), abstractC2706r0.mo9510W0());
    }

    @Override // p243q9.InterfaceC6326a
    public InterfaceC6333h getAnnotations() {
        return AbstractC2711t.m9595a(mo9331S0());
    }

    public final int hashCode() {
        int i10 = this.f7071q;
        if (i10 != 0) {
            return i10;
        }
        int iM9587Q0 = m9587Q0();
        this.f7071q = iM9587Q0;
        return iM9587Q0;
    }

    /* JADX INFO: renamed from: v */
    public abstract InterfaceC9913k mo7040v();

    public AbstractC2706r0() {
    }
}
