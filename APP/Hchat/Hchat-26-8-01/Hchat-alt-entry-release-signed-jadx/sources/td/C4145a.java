package td;

import p025bc.AbstractC0255e;
import p215od.C3131d;
import p233pd.AbstractC3391b;
import p233pd.C3403n;
import p233pd.EnumC3400k;
import p246qd.AbstractC3508l;
import p302ud.C4320p;
import p302ud.C4322r;

/* JADX INFO: renamed from: td.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4145a extends AbstractC3391b {

    /* JADX INFO: renamed from: o */
    public final C3131d f13662o;

    /* JADX INFO: renamed from: p */
    public final int f13663p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4145a(C4322r c4322r, C3403n c3403n, C3131d c3131d) {
        super(EnumC3400k.f10967S, c3403n.f14398m.size() - 1);
        this.f13662o = c3131d;
        this.f13663p = !c3403n.mo7179S(0).m7380N() ? 1 : !c3131d.f10153j.equals(c4322r.f14411l.f14373m) ? 2 : c3131d.f10154k.equals(c4322r.f14410k.f10154k) ? 4 : 3;
        int size = c3403n.f14398m.size();
        for (int i9 = 1; i9 < size; i9++) {
            mo7178I(c3403n.mo7179S(i9));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: O */
    public final C4320p mo7167O() {
        C4145a c4145a = new C4145a(this.f13662o, this.f13663p);
        m8681P(c4145a);
        return c4145a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: Y */
    public final boolean mo7168Y(C4320p c4320p) {
        if (this == c4320p) {
            return true;
        }
        if (!(c4320p instanceof C4145a) || !super.mo7168Y(c4320p)) {
            return false;
        }
        C4145a c4145a = (C4145a) c4320p;
        return this.f13662o.equals(c4145a.f13662o) && this.f13663p == c4145a.f13663p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.AbstractC3391b
    /* JADX INFO: renamed from: i0 */
    public final C3131d mo7169i0() {
        return this.f13662o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.AbstractC3391b
    /* JADX INFO: renamed from: j0 */
    public final int mo7170j0() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.AbstractC3391b
    /* JADX INFO: renamed from: k0 */
    public final /* bridge */ /* synthetic */ AbstractC3508l mo7171k0() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public final boolean m8339l0() {
        return this.f13663p == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    public final String toString() {
        String string = super.toString();
        String strValueOf = String.valueOf(this.f13662o);
        int i9 = this.f13663p;
        return AbstractC0255e.m1033v(string, " call: ", strValueOf, " type: ", i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? "null" : "SELF" : "THIS" : "SUPER" : "CONSTRUCTOR");
    }

    public C4145a(C3131d c3131d, int i9) {
        super(EnumC3400k.f10967S, c3131d.f10152i.size());
        this.f13662o = c3131d;
        this.f13663p = i9;
    }
}
