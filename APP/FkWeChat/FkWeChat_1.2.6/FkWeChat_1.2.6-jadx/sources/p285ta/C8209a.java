package p285ta;

import gb.AbstractC2650c1;
import gb.C2704q1;
import gb.InterfaceC2643a2;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p112hb.AbstractC2949h;
import p129ib.C3381l;
import p129ib.EnumC3377h;
import p160kb.InterfaceC4224d;
import p185m8.AbstractC5114x;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: ta.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8209a extends AbstractC2650c1 implements InterfaceC4224d {

    /* JADX INFO: renamed from: r */
    public final InterfaceC2643a2 f27520r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC8210b f27521s;

    /* JADX INFO: renamed from: t */
    public final boolean f27522t;

    /* JADX INFO: renamed from: u */
    public final C2704q1 f27523u;

    public /* synthetic */ C8209a(InterfaceC2643a2 interfaceC2643a2, InterfaceC8210b interfaceC8210b, boolean z10, C2704q1 c2704q1, int i10, AbstractC1043k abstractC1043k) {
        this(interfaceC2643a2, (i10 & 2) != 0 ? new C8211c(interfaceC2643a2) : interfaceC8210b, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? C2704q1.f7069r.m9585k() : c2704q1);
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: R0 */
    public List mo9330R0() {
        return AbstractC5114x.m20800o();
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: S0 */
    public C2704q1 mo9331S0() {
        return this.f27523u;
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: U0 */
    public boolean mo9258U0() {
        return this.f27522t;
    }

    @Override // gb.AbstractC2687l2
    /* JADX INFO: renamed from: b1 */
    public AbstractC2650c1 mo7034Z0(C2704q1 c2704q1) {
        c2704q1.getClass();
        return new C8209a(this.f27520r, mo9332T0(), mo9258U0(), c2704q1);
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public InterfaceC8210b mo9332T0() {
        return this.f27521s;
    }

    @Override // gb.AbstractC2650c1
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public C8209a mo7032X0(boolean z10) {
        return z10 == mo9258U0() ? this : new C8209a(this.f27520r, mo9332T0(), z10, mo9331S0());
    }

    @Override // gb.AbstractC2687l2
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public C8209a mo9325d1(AbstractC2949h abstractC2949h) {
        abstractC2949h.getClass();
        InterfaceC2643a2 interfaceC2643a2Mo9334a = this.f27520r.mo9334a(abstractC2949h);
        interfaceC2643a2Mo9334a.getClass();
        return new C8209a(interfaceC2643a2Mo9334a, mo9332T0(), mo9258U0(), mo9331S0());
    }

    @Override // gb.AbstractC2650c1
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Captured(");
        sb2.append(this.f27520r);
        sb2.append(')');
        sb2.append(mo9258U0() ? "?" : _UrlKt.FRAGMENT_ENCODE_SET);
        return sb2.toString();
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: v */
    public InterfaceC9913k mo7040v() {
        return C3381l.m12701a(EnumC3377h.f9221r, true, new String[0]);
    }

    public C8209a(InterfaceC2643a2 interfaceC2643a2, InterfaceC8210b interfaceC8210b, boolean z10, C2704q1 c2704q1) {
        interfaceC2643a2.getClass();
        interfaceC8210b.getClass();
        c2704q1.getClass();
        this.f27520r = interfaceC2643a2;
        this.f27521s = interfaceC8210b;
        this.f27522t = z10;
        this.f27523u = c2704q1;
    }
}
