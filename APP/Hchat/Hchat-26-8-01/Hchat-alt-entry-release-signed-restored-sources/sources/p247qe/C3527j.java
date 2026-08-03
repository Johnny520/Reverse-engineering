package p247qe;

import p025bc.AbstractC0255e;
import p074f5.C1071g;
import p136j8.AbstractC2091b;
import p233pd.AbstractC3391b;
import p246qd.AbstractC3506j;
import p246qd.C3514r;
import p302ud.C4325u;

/* JADX INFO: renamed from: qe.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3527j implements InterfaceC3522e {

    /* JADX INFO: renamed from: a */
    public final C4325u f11473a;

    /* JADX INFO: renamed from: b */
    public final AbstractC3391b f11474b;

    /* JADX INFO: renamed from: c */
    public final C3514r f11475c;

    /* JADX INFO: renamed from: d */
    public final AbstractC3506j f11476d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3527j(C4325u c4325u, AbstractC3391b abstractC3391b, C3514r c3514r, AbstractC3506j abstractC3506j) {
        this.f11473a = c4325u;
        this.f11474b = abstractC3391b;
        this.f11475c = c3514r;
        this.f11476d = abstractC3506j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p247qe.InterfaceC3522e
    /* JADX INFO: renamed from: a */
    public final AbstractC3506j mo7425a(C1071g c1071g) {
        AbstractC3506j abstractC3506jM2699b = c1071g.m2699b(this.f11474b.mo7171k0());
        AbstractC3506j abstractC3506jM2699b2 = c1071g.m2699b(this.f11475c);
        AbstractC3506j abstractC3506jM3345l = this.f11473a.f14443i.m3345l(abstractC3506jM2699b, abstractC3506jM2699b, this.f11476d);
        return abstractC3506jM3345l != null ? abstractC3506jM3345l : abstractC3506jM2699b2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p247qe.InterfaceC3521d
    /* JADX INFO: renamed from: b */
    public final int mo7424b() {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3527j.class != obj.getClass()) {
            return false;
        }
        return this.f11474b.equals(((C3527j) obj).f11474b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p247qe.InterfaceC3521d
    public final AbstractC3506j getType() {
        AbstractC3506j abstractC3506jMo7375I = this.f11474b.mo7171k0().mo7375I();
        AbstractC3506j abstractC3506jMo7375I2 = this.f11475c.mo7375I();
        AbstractC3506j abstractC3506jM3345l = this.f11473a.f14443i.m3345l(abstractC3506jMo7375I, abstractC3506jMo7375I, this.f11476d);
        return abstractC3506jM3345l != null ? abstractC3506jM3345l : abstractC3506jMo7375I2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11474b.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        AbstractC3391b abstractC3391b = this.f11474b;
        String str = abstractC3391b.mo7169i0().f10154k;
        String strValueOf = String.valueOf(this.f11476d);
        return AbstractC2091b.m5164k(AbstractC0255e.m1027p("InvokeAssign{", str, ", argType=", strValueOf, ", currentType="), String.valueOf(getType()), ", instanceArg=", String.valueOf(abstractC3391b.mo7171k0()), "}");
    }
}
