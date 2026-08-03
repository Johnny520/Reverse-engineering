package p233pd;

import af.C0084g;
import java.util.ArrayList;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p246qd.AbstractC3508l;
import p246qd.C3514r;
import p302ud.C4305a;
import p302ud.C4320p;
import p332wb.AbstractC4855en;
import p351xe.C5791l;

/* JADX INFO: renamed from: pd.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3406q extends C4320p {

    /* JADX INFO: renamed from: o */
    public final ArrayList f11009o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3406q(int i9) {
        super(EnumC3400k.f10972X, i9);
        this.f11009o = new ArrayList(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: I */
    public final void mo7178I(AbstractC3508l abstractC3508l) {
        throw new C0084g("Direct addArg is forbidden for PHI insn, bindArg must be used");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: O */
    public final C4320p mo7167O() {
        C3406q c3406q = new C3406q(this.f14398m.size());
        m8681P(c3406q);
        return c3406q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: S */
    public final AbstractC3508l mo7179S(int i9) {
        return (C3514r) super.mo7179S(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: a0 */
    public final AbstractC3508l mo7180a0(int i9) {
        C3514r c3514r = (C3514r) super.mo7180a0(0);
        this.f11009o.remove(0);
        c3514r.f11440m.m7411p();
        return c3514r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: b0 */
    public final boolean mo7181b0(AbstractC3508l abstractC3508l, AbstractC3508l abstractC3508l2) {
        int iM8684T;
        if (!(abstractC3508l instanceof C3514r) || !(abstractC3508l2 instanceof C3514r) || (iM8684T = m8684T(abstractC3508l)) == -1) {
            return false;
        }
        ((C3514r) abstractC3508l2).f11440m.m7397a(this);
        super.mo7182c0(iM8684T, abstractC3508l2);
        C5791l.m10477i(null, abstractC3508l);
        ((C3514r) abstractC3508l).f11440m.m7411p();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: c0 */
    public final void mo7182c0(int i9, AbstractC3508l abstractC3508l) {
        throw new C0084g("Direct setArg is forbidden for PHI insn, bindArg must be used");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public final void m7183i0(C3514r c3514r, C4305a c4305a) {
        ArrayList arrayList = this.f11009o;
        if (arrayList.contains(c4305a)) {
            C0086a.m452k(AbstractC0255e.m1021j("Duplicate predecessors in PHI insn: ", String.valueOf(c4305a), ", ", String.valueOf(this)));
        } else if (c4305a == null) {
            C0086a.m452k("Null bind block in PHI insn: ".concat(String.valueOf(this)));
        } else {
            super.mo7178I(c3514r);
            arrayList.add(c4305a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public final C3514r m7184j0(int i9) {
        return (C3514r) super.mo7179S(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public final C3514r m7185k0(C4305a c4305a) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f11009o;
            if (i9 >= arrayList.size()) {
                return null;
            }
            if (arrayList.get(i9) == c4305a) {
                return (C3514r) super.mo7179S(i9);
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public final void m7186l0(C3514r c3514r) {
        int iM8684T = m8684T(c3514r);
        if (iM8684T == -1) {
            return;
        }
        C3514r c3514r2 = (C3514r) super.mo7180a0(iM8684T);
        this.f11009o.remove(iM8684T);
        c3514r2.f11440m.m7411p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    public final String toString() {
        return AbstractC4855en.m9265i(m8692k(), " binds: ", String.valueOf(this.f11009o), m8679M());
    }
}
