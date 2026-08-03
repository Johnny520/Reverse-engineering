package p222p;

import p085fg.InterfaceC1231l;
import p339x1.AbstractC5618k;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: p.t0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C3257t0 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1231l f10384a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3257t0(InterfaceC1231l interfaceC1231l) {
        this.f10384a = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C3257t0 c3257t0 = obj instanceof C3257t0 ? (C3257t0) obj : null;
        return c3257t0 != null && this.f10384a == c3257t0.f10384a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C3260u0 c3260u0 = new C3260u0();
        c3260u0.f10389u = this.f10384a;
        c3260u0.f10390v = true;
        return c3260u0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3260u0 c3260u0 = (C3260u0) abstractC5852n;
        InterfaceC1231l interfaceC1231l = c3260u0.f10389u;
        InterfaceC1231l interfaceC1231l2 = this.f10384a;
        if (interfaceC1231l != interfaceC1231l2 || !c3260u0.f10390v) {
            AbstractC5618k.m10167w(c3260u0).m10022U(false);
        }
        c3260u0.f10389u = interfaceC1231l2;
        c3260u0.f10390v = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f10384a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f10384a + ", rtlAware=true)";
    }
}
