package p233pd;

import md.EnumC2824a;
import p222p.AbstractC3199a;
import p246qd.AbstractC3508l;
import p246qd.C3510n;
import p246qd.C3514r;
import p302ud.C4320p;
import p351xe.AbstractC5792m;

/* JADX INFO: renamed from: pd.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3390a extends C4320p {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ int f10927p = 0;

    /* JADX INFO: renamed from: o */
    public final int f10928o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3390a(int i9, C3514r c3514r, AbstractC3508l abstractC3508l, AbstractC3508l abstractC3508l2) {
        super(EnumC3400k.f10980j, 2);
        this.f10928o = i9;
        m8688d0(c3514r);
        mo7178I(abstractC3508l);
        mo7178I(abstractC3508l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: O */
    public final C4320p mo7167O() {
        C3390a c3390a = new C3390a(this.f10928o, null, mo7179S(0).mo7374H(), mo7179S(1).mo7374H());
        m8681P(c3390a);
        return c3390a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: Y */
    public final boolean mo7168Y(C4320p c4320p) {
        if (this != c4320p) {
            if (!(c4320p instanceof C3390a) || !super.mo7168Y(c4320p)) {
                return false;
            }
            C3390a c3390a = (C3390a) c4320p;
            if (this.f10928o != c3390a.f10928o) {
                return false;
            }
            AbstractC3508l abstractC3508lMo7179S = mo7179S(1);
            AbstractC3508l abstractC3508lMo7179S2 = c3390a.mo7179S(1);
            abstractC3508lMo7179S.getClass();
            boolean z9 = abstractC3508lMo7179S instanceof C3510n;
            abstractC3508lMo7179S2.getClass();
            if (z9 != (abstractC3508lMo7179S2 instanceof C3510n)) {
                return false;
            }
            if (z9 && ((C3510n) abstractC3508lMo7179S).f11422l != ((C3510n) abstractC3508lMo7179S2).f11422l) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC5792m.m10487d(this.f14399n));
        sb2.append(": ARITH ");
        boolean zMo6235a = this.f9217g.mo6235a(EnumC2824a.f9134T);
        int i9 = this.f10928o;
        if (zMo6235a) {
            sb2.append(mo7179S(0));
            sb2.append(' ');
            sb2.append(AbstractC3199a.m6832e(i9));
            sb2.append("= ");
            sb2.append(mo7179S(1));
        } else {
            C3514r c3514r = this.f14397l;
            if (c3514r != null) {
                sb2.append(c3514r);
                sb2.append(" = ");
            }
            sb2.append(mo7179S(0));
            sb2.append(' ');
            sb2.append(AbstractC3199a.m6832e(i9));
            sb2.append(' ');
            sb2.append(mo7179S(1));
        }
        m8677K(sb2);
        return sb2.toString();
    }
}
