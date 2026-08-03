package p247qe;

import p025bc.AbstractC0255e;
import p074f5.C1071g;
import p083fe.C1214a;
import p136j8.AbstractC2091b;
import p233pd.C3403n;
import p246qd.AbstractC3506j;
import p246qd.C3505i;
import p302ud.C4325u;
import p302ud.InterfaceC4317m;

/* JADX INFO: renamed from: qe.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3526i implements InterfaceC3522e {

    /* JADX INFO: renamed from: a */
    public final C4325u f11470a;

    /* JADX INFO: renamed from: b */
    public final C3403n f11471b;

    /* JADX INFO: renamed from: c */
    public final AbstractC3506j f11472c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3526i(C4325u c4325u, C3403n c3403n, AbstractC3506j abstractC3506j) {
        this.f11470a = c4325u;
        this.f11471b = c3403n;
        this.f11472c = abstractC3506j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p247qe.InterfaceC3522e
    /* JADX INFO: renamed from: a */
    public final AbstractC3506j mo7425a(C1071g c1071g) {
        return m7426c(c1071g.m2699b(this.f11471b.mo7179S(0)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p247qe.InterfaceC3521d
    /* JADX INFO: renamed from: b */
    public final int mo7424b() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final AbstractC3506j m7426c(AbstractC3506j abstractC3506j) {
        C4325u c4325u = this.f11470a;
        C1214a c1214a = c4325u.f14442h;
        C3403n c3403n = this.f11471b;
        InterfaceC4317m interfaceC4317mM3342g = c1214a.m3342g(c3403n);
        AbstractC3506j abstractC3506jM3345l = c4325u.f14443i.m3345l(abstractC3506j, interfaceC4317mM3342g != null ? interfaceC4317mM3342g.mo2222q().f10153j.f10138g : abstractC3506j, this.f11472c);
        if (abstractC3506jM3345l == null) {
            abstractC3506jM3345l = null;
        } else if (abstractC3506jM3345l instanceof C3505i) {
            abstractC3506jM3345l = abstractC3506jM3345l.mo7356r();
        }
        return abstractC3506jM3345l != null ? abstractC3506jM3345l : c3403n.f11005p.f10151h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3526i.class != obj.getClass()) {
            return false;
        }
        return this.f11471b.equals(((C3526i) obj).f11471b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p247qe.InterfaceC3521d
    public final AbstractC3506j getType() {
        return m7426c(this.f11471b.mo7179S(0).mo7375I());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11471b.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C3403n c3403n = this.f11471b;
        String str = c3403n.f11005p.f10154k;
        String strValueOf = String.valueOf(this.f11472c);
        return AbstractC2091b.m5164k(AbstractC0255e.m1027p("InvokeAssign{", str, ", returnType=", strValueOf, ", currentType="), String.valueOf(getType()), ", instanceArg=", String.valueOf(c3403n.mo7179S(0)), "}");
    }
}
