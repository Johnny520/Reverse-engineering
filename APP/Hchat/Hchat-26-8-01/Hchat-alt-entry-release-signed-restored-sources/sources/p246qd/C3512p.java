package p246qd;

import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: qd.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3512p extends AbstractC3508l implements InterfaceC3511o {

    /* JADX INFO: renamed from: l */
    public String f11423l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3512p(String str, AbstractC3506j abstractC3506j) {
        this.f11423l = str;
        this.f11419i = abstractC3506j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3508l
    /* JADX INFO: renamed from: H */
    public final AbstractC3508l mo7374H() {
        C3512p c3512p = new C3512p(this.f11423l, this.f11419i);
        c3512p.m6225B(this);
        c3512p.mo7385V(this.f11420j);
        return c3512p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3508l
    /* JADX INFO: renamed from: X */
    public final String mo7387X() {
        return this.f11423l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3512p) {
            return this.f11423l.equals(((C3512p) obj).f11423l);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.InterfaceC3511o
    public final String getName() {
        return this.f11423l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11423l.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.InterfaceC3511o
    /* JADX INFO: renamed from: p */
    public final void mo7390p(String str) {
        this.f11423l = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("(", this.f11423l, " ", String.valueOf(this.f11419i), ")");
    }
}
