package p247qe;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p074f5.C1071g;
import p083fe.C1214a;
import p215od.C3130c;
import p233pd.C3399j;
import p246qd.AbstractC3506j;
import p246qd.C3505i;
import p302ud.C4325u;

/* JADX INFO: renamed from: qe.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3525h implements InterfaceC3522e {

    /* JADX INFO: renamed from: a */
    public final C4325u f11466a;

    /* JADX INFO: renamed from: b */
    public final C3399j f11467b;

    /* JADX INFO: renamed from: c */
    public final C3130c f11468c;

    /* JADX INFO: renamed from: d */
    public final AbstractC3506j f11469d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3525h(C4325u c4325u, C3399j c3399j, AbstractC3506j abstractC3506j) {
        this.f11466a = c4325u;
        this.f11467b = c3399j;
        this.f11468c = (C3130c) c3399j.f10948o;
        this.f11469d = abstractC3506j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p247qe.InterfaceC3522e
    /* JADX INFO: renamed from: a */
    public final AbstractC3506j mo7425a(C1071g c1071g) {
        AbstractC3506j abstractC3506jM2699b = c1071g.m2699b(this.f11467b.mo7179S(0));
        C1214a c1214a = this.f11466a.f14443i;
        AbstractC3506j abstractC3506j = this.f11469d;
        AbstractC3506j abstractC3506jM3345l = c1214a.m3345l(abstractC3506jM2699b, abstractC3506jM2699b, abstractC3506j);
        return (abstractC3506jM3345l == null || (abstractC3506jM3345l instanceof C3505i)) ? abstractC3506j : abstractC3506jM3345l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p247qe.InterfaceC3521d
    /* JADX INFO: renamed from: b */
    public final int mo7424b() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3525h.class != obj.getClass()) {
            return false;
        }
        return this.f11467b.equals(((C3525h) obj).f11467b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p247qe.InterfaceC3521d
    public final AbstractC3506j getType() {
        AbstractC3506j abstractC3506jMo7375I = this.f11467b.mo7179S(0).mo7375I();
        C1214a c1214a = this.f11466a.f14443i;
        AbstractC3506j abstractC3506j = this.f11469d;
        AbstractC3506j abstractC3506jM3345l = c1214a.m3345l(abstractC3506jMo7375I, abstractC3506jMo7375I, abstractC3506j);
        return (abstractC3506jM3345l == null || (abstractC3506jM3345l instanceof C3505i)) ? abstractC3506j : abstractC3506jM3345l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11467b.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strValueOf = String.valueOf(this.f11468c);
        String strValueOf2 = String.valueOf(getType());
        return AbstractC0921a.m2255r(AbstractC0255e.m1027p("FieldGetAssign{", strValueOf, ", type=", strValueOf2, ", instanceArg="), String.valueOf(this.f11467b.mo7179S(0)), "}");
    }
}
