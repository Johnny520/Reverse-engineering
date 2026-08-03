package p233pd;

import p136j8.AbstractC2091b;
import p215od.C3131d;
import p246qd.AbstractC3508l;
import p246qd.C3514r;
import p302ud.C4320p;
import p351xe.AbstractC5792m;

/* JADX INFO: renamed from: pd.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3401l extends C3403n {

    /* JADX INFO: renamed from: q */
    public C3131d f10997q;

    /* JADX INFO: renamed from: r */
    public int f10998r;

    /* JADX INFO: renamed from: s */
    public AbstractC3391b f10999s;

    /* JADX INFO: renamed from: t */
    public boolean f11000t;

    /* JADX INFO: renamed from: u */
    public boolean f11001u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.C3403n, p302ud.C4320p
    /* JADX INFO: renamed from: O */
    public final C4320p mo7167O() {
        C3401l c3401l = new C3401l(this.f11005p, this.f11004o, this.f14398m.size());
        m8681P(c3401l);
        c3401l.f10997q = this.f10997q;
        c3401l.f10998r = this.f10998r;
        c3401l.f10999s = this.f10999s;
        c3401l.f11000t = this.f11000t;
        c3401l.f11001u = this.f11001u;
        return c3401l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.C3403n, p302ud.C4320p
    /* JADX INFO: renamed from: Y */
    public final boolean mo7168Y(C4320p c4320p) {
        if (this == c4320p) {
            return true;
        }
        if (!(c4320p instanceof C3401l) || !super.mo7168Y(c4320p)) {
            return false;
        }
        C3401l c3401l = (C3401l) c4320p;
        return this.f10998r == c3401l.f10998r && this.f10997q.equals(c3401l.f10997q) && this.f10999s.mo7168Y(c3401l.f10999s) && this.f11000t == c3401l.f11000t && this.f11001u == c3401l.f11001u;
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
        m8676J(sb2);
        m8677K(sb2);
        sb2.append("\n handle type: ");
        sb2.append(AbstractC2091b.m5175v(this.f10998r));
        sb2.append("\n lambda: ");
        sb2.append(this.f10997q);
        sb2.append("\n call insn: ");
        sb2.append(this.f10999s);
        return sb2.toString();
    }
}
