package p233pd;

import gf.C1402a;
import mc.InterfaceC2823a;
import p141jf.C2131g;
import p215od.C3131d;
import p246qd.C3514r;
import p302ud.C4320p;
import p351xe.AbstractC5792m;

/* JADX INFO: renamed from: pd.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3404o extends C3403n {

    /* JADX INFO: renamed from: q */
    public final InterfaceC2823a f11006q;

    /* JADX INFO: renamed from: r */
    public final C3131d f11007r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3404o(C3131d c3131d, C1402a c1402a, C2131g c2131g, C3131d c3131d2, boolean z9) {
        super(c3131d, c1402a, 6, true, z9);
        this.f11006q = c2131g;
        this.f11007r = c3131d2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.C3403n, p302ud.C4320p
    /* JADX INFO: renamed from: O */
    public final C4320p mo7167O() {
        C3404o c3404o = new C3404o(this.f11005p, this.f14398m.size(), this.f11006q, this.f11007r);
        m8681P(c3404o);
        return c3404o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.C3403n, p302ud.C4320p
    /* JADX INFO: renamed from: Y */
    public final boolean mo7168Y(C4320p c4320p) {
        if (this == c4320p) {
            return true;
        }
        if ((c4320p instanceof C3404o) && super.mo7168Y(c4320p)) {
            return this.f11006q.equals(((C3404o) c4320p).f11006q);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.C3403n, p302ud.C4320p
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC5792m.m10487d(this.f14399n));
        sb2.append(": INVOKE_POLYMORPHIC ");
        C3514r c3514r = this.f14397l;
        if (c3514r != null) {
            sb2.append(c3514r);
            sb2.append(" = ");
        }
        if (!m8676J(sb2)) {
            sb2.append('\n');
        }
        m8677K(sb2);
        sb2.append(" base: ");
        sb2.append(this.f11007r);
        sb2.append('\n');
        sb2.append(" proto: ");
        sb2.append(this.f11006q);
        sb2.append('\n');
        return sb2.toString();
    }

    public C3404o(C3131d c3131d, int i9, InterfaceC2823a interfaceC2823a, C3131d c3131d2) {
        super(c3131d, 6, i9);
        this.f11006q = interfaceC2823a;
        this.f11007r = c3131d2;
    }
}
