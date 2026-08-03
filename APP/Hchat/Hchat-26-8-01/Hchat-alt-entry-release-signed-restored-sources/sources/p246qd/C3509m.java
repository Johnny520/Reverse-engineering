package p246qd;

import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p233pd.C3393d;
import p233pd.EnumC3400k;
import p302ud.C4320p;

/* JADX INFO: renamed from: qd.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3509m extends AbstractC3508l {

    /* JADX INFO: renamed from: l */
    public final C4320p f11421l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3509m(C4320p c4320p) {
        C3514r c3514r = c4320p.f14397l;
        this.f11419i = c3514r != null ? c3514r.mo7375I() : AbstractC3506j.f11404u;
        this.f11421l = c4320p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3508l
    /* JADX INFO: renamed from: H */
    public final AbstractC3508l mo7374H() {
        C3509m c3509m = new C3509m(this.f11421l.mo7167O());
        c3509m.f11419i = this.f11419i;
        c3509m.m6225B(this);
        c3509m.mo7385V(this.f11420j);
        return c3509m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3508l
    /* JADX INFO: renamed from: V */
    public final void mo7385V(C4320p c4320p) {
        if (c4320p != this.f11421l) {
            this.f11420j = c4320p;
        } else {
            C0086a.m452k("Can't wrap instruction info itself: ".concat(String.valueOf(c4320p)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3508l
    /* JADX INFO: renamed from: X */
    public final String mo7387X() {
        C4320p c4320p = this.f11421l;
        return c4320p.f14396k == EnumC3400k.f10978h ? AbstractC0921a.m2251n("(\"", ((C3393d) c4320p).f10930o, "\")") : AbstractC0255e.m1022k("(wrap:", String.valueOf(this.f11419i), ":", String.valueOf(c4320p.f14396k), ")");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3509m)) {
            return false;
        }
        C4320p c4320p = ((C3509m) obj).f11421l;
        C4320p c4320p2 = this.f11421l;
        if (!c4320p2.mo7168Y(c4320p)) {
            return false;
        }
        int size = c4320p2.f14398m.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (!c4320p2.mo7179S(i9).equals(c4320p.mo7179S(i9))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11421l.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C4320p c4320p = this.f11421l;
        return c4320p.f14396k == EnumC3400k.f10978h ? AbstractC0921a.m2251n("(\"", ((C3393d) c4320p).f10930o, "\")") : AbstractC0255e.m1022k("(wrap:", String.valueOf(this.f11419i), ":", String.valueOf(c4320p), ")");
    }
}
