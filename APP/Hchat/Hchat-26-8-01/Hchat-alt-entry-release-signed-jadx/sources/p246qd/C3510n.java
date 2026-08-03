package p246qd;

import af.C0084g;
import p082fd.AbstractC1213j;
import p351xe.C5796q;

/* JADX INFO: renamed from: qd.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3510n extends AbstractC3508l {

    /* JADX INFO: renamed from: l */
    public final long f11422l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3510n(long j3, AbstractC3506j abstractC3506j) {
        if (j3 == 0 || !abstractC3506j.mo7351v()) {
            this.f11422l = j3;
            this.f11419i = abstractC3506j;
            return;
        }
        throw new C0084g("Wrong literal type: " + String.valueOf(abstractC3506j) + " for value: " + j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3508l
    /* JADX INFO: renamed from: H */
    public final AbstractC3508l mo7374H() {
        C3510n c3510n = new C3510n(this.f11422l, this.f11419i);
        c3510n.m6225B(this);
        c3510n.mo7385V(this.f11420j);
        return c3510n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3508l
    /* JADX INFO: renamed from: R */
    public final boolean mo7384R() {
        return this.f11422l == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3508l
    /* JADX INFO: renamed from: W */
    public final void mo7386W(AbstractC3506j abstractC3506j) {
        this.f11419i = abstractC3506j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3508l
    /* JADX INFO: renamed from: X */
    public final String mo7387X() {
        return Long.toString(this.f11422l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public final boolean m7389c0() {
        int iOrdinal = this.f11419i.mo7343o().ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3510n.class == obj.getClass()) {
            C3510n c3510n = (C3510n) obj;
            if (this.f11422l == c3510n.f11422l && this.f11419i.equals(c3510n.f11419i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        long j3 = this.f11422l;
        return (this.f11419i.f11410a * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        try {
            String strM3332a = AbstractC1213j.m3332a(this.f11422l, this.f11419i, C5796q.f23542b, true, false);
            if (this.f11419i.equals(AbstractC3506j.f11386c) && (strM3332a.equals("true") || strM3332a.equals("false"))) {
                return strM3332a;
            }
            return "(" + strM3332a + " " + String.valueOf(this.f11419i) + ")";
        } catch (C0084g unused) {
            return "(" + this.f11422l + " " + String.valueOf(this.f11419i) + ")";
        }
    }
}
