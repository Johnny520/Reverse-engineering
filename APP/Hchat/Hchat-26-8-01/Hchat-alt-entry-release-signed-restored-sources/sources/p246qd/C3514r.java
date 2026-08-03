package p246qd;

import java.util.Objects;
import md.EnumC2824a;
import p012ah.C0086a;
import p302ud.C4320p;
import p302ud.C4322r;

/* JADX INFO: renamed from: qd.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3514r extends AbstractC3508l implements InterfaceC3511o {

    /* JADX INFO: renamed from: l */
    public final int f11439l;

    /* JADX INFO: renamed from: m */
    public C3515s f11440m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3514r(int i9, AbstractC3506j abstractC3506j) {
        this.f11419i = abstractC3506j;
        this.f11439l = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3508l
    /* JADX INFO: renamed from: I */
    public final AbstractC3506j mo7375I() {
        C3515s c3515s = this.f11440m;
        return c3515s != null ? (AbstractC3506j) c3515s.f11447l.f10677h : AbstractC3506j.f11404u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3508l
    /* JADX INFO: renamed from: P */
    public final boolean mo7382P() {
        C3515s c3515s = this.f11440m;
        if (c3515s != null) {
            return c3515s.m7404i();
        }
        return this.f9217g.mo6235a(EnumC2824a.f9128N);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3508l
    /* JADX INFO: renamed from: W */
    public final void mo7386W(AbstractC3506j abstractC3506j) {
        C3515s c3515s = this.f11440m;
        if (c3515s != null) {
            c3515s.m7409n(abstractC3506j);
        } else {
            C0086a.m452k("Can't change type for register without SSA variable: ".concat(String.valueOf(this)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3508l
    /* JADX INFO: renamed from: X */
    public final String mo7387X() {
        StringBuilder sb2 = new StringBuilder("r");
        sb2.append(this.f11439l);
        if (this.f11440m != null) {
            sb2.append('v');
            sb2.append(this.f11440m.f11443h);
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: H()Lqd/l; */
    @Override // p246qd.AbstractC3508l
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final C3514r mo7374H() {
        return m7392d0(this.f11439l, this.f11419i, this.f11440m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public final C3514r m7392d0(int i9, AbstractC3506j abstractC3506j, C3515s c3515s) {
        C3514r c3514r = new C3514r(i9, abstractC3506j);
        if (c3515s != null) {
            c3514r.f11440m = c3515s;
        }
        c3514r.m6225B(this);
        c3514r.mo7385V(this.f11420j);
        return c3514r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public final C3514r m7393e0(C4322r c4322r) {
        C3514r c3514rM7392d0 = m7392d0(this.f11439l, this.f11419i, null);
        c4322r.m8703b0(c3514rM7392d0);
        return c3514rM7392d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3514r)) {
            return false;
        }
        C3514r c3514r = (C3514r) obj;
        return this.f11439l == c3514r.f11439l && Objects.equals(this.f11440m, c3514r.f11440m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public final C4320p m7394f0() {
        C3515s c3515s = this.f11440m;
        if (c3515s == null) {
            return null;
        }
        return c3515s.f11444i.f11420j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public final boolean m7395g0(C3514r c3514r) {
        return this.f11440m.m7398b() == c3514r.f11440m.m7398b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.InterfaceC3511o
    public final String getName() {
        if (this.f9217g.mo6235a(EnumC2824a.f9125K)) {
            return "super";
        }
        if (m7380N()) {
            return "this";
        }
        C3515s c3515s = this.f11440m;
        if (c3515s == null) {
            return null;
        }
        return c3515s.m7401e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public final boolean m7396h0(AbstractC3508l abstractC3508l) {
        if (this == abstractC3508l) {
            return true;
        }
        abstractC3508l.getClass();
        if (!(abstractC3508l instanceof C3514r)) {
            return false;
        }
        C3514r c3514r = (C3514r) abstractC3508l;
        return this.f11439l == c3514r.f11439l && Objects.equals(this.f11440m, c3514r.f11440m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11439l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.InterfaceC3511o
    /* JADX INFO: renamed from: p */
    public final void mo7390p(String str) {
        C3515s c3515s = this.f11440m;
        if (c3515s == null || str == null) {
            return;
        }
        C3507k c3507k = c3515s.f11448m;
        if (c3507k != null) {
            c3507k.f11411a = str;
        } else {
            C0086a.m452k("CodeVar not initialized for name set in SSAVar: ".concat(String.valueOf(c3515s)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(r");
        sb2.append(this.f11439l);
        if (this.f11440m != null) {
            sb2.append('v');
            sb2.append(this.f11440m.f11443h);
        }
        if (getName() != null) {
            sb2.append(" '");
            sb2.append(getName());
            sb2.append('\'');
        }
        AbstractC3506j abstractC3506jMo7375I = this.f11440m != null ? mo7375I() : null;
        if (abstractC3506jMo7375I != null) {
            sb2.append(' ');
            sb2.append(abstractC3506jMo7375I);
        }
        AbstractC3506j abstractC3506j = this.f11419i;
        if (abstractC3506jMo7375I == null || (!abstractC3506jMo7375I.equals(abstractC3506j) && !abstractC3506jMo7375I.mo7345w())) {
            sb2.append(" I:");
            sb2.append(abstractC3506j);
        }
        if (!this.f9217g.mo6240f()) {
            sb2.append(' ');
            sb2.append(this.f9217g.toString());
        }
        sb2.append(')');
        return sb2.toString();
    }
}
