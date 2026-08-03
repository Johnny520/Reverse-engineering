package p233pd;

import gf.C1402a;
import java.util.ArrayList;
import p215od.C3131d;
import p246qd.AbstractC3508l;
import p246qd.C3514r;
import p302ud.C4320p;
import p351xe.AbstractC5792m;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: pd.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3402m extends C3403n {

    /* JADX INFO: renamed from: q */
    public final C3403n f11002q;

    /* JADX INFO: renamed from: r */
    public ArrayList f11003r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3402m(C3403n c3403n, C3131d c3131d, C1402a c1402a, boolean z9) {
        super(c3131d, c1402a, 8, false, z9);
        this.f11002q = c3403n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.C3403n, p302ud.C4320p
    /* JADX INFO: renamed from: O */
    public final C4320p mo7167O() {
        C3402m c3402m = new C3402m(this.f11002q, this.f11005p, this.f11004o, this.f14398m.size());
        m8681P(c3402m);
        c3402m.f11003r = this.f11003r;
        return c3402m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.C3403n, p302ud.C4320p
    /* JADX INFO: renamed from: Y */
    public final boolean mo7168Y(C4320p c4320p) {
        if (this == c4320p) {
            return true;
        }
        if ((c4320p instanceof C3402m) && super.mo7168Y(c4320p)) {
            if (this.f11002q.mo7168Y(((C3402m) c4320p).f11002q)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.C3403n, p233pd.AbstractC3391b
    /* JADX INFO: renamed from: j0 */
    public final int mo7170j0() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.C3403n, p233pd.AbstractC3391b
    /* JADX INFO: renamed from: k0 */
    public final AbstractC3508l mo7171k0() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.C3403n, p302ud.C4320p
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC5792m.m10487d(this.f14399n));
        sb2.append(": INVOKE_CUSTOM ");
        C3514r c3514r = this.f14397l;
        if (c3514r != null) {
            sb2.append(c3514r);
            sb2.append(" = ");
        }
        if (!m8676J(sb2)) {
            sb2.append('\n');
        }
        m8677K(sb2);
        sb2.append(" call-site: \n  ");
        sb2.append(AbstractC5798s.m10516j(this.f11003r, "\n  "));
        sb2.append('\n');
        return sb2.toString();
    }

    public C3402m(C3403n c3403n, C3131d c3131d, int i9, int i10) {
        super(c3131d, i9, i10);
        this.f11002q = c3403n;
    }
}
