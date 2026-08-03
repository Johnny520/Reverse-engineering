package p027c0;

import p014b.C0126e;
import p100h0.C1551t0;
import p100h0.C1555v0;
import p100h0.C1557w0;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: c0.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C0367l extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C0126e f1025a;

    /* JADX INFO: renamed from: b */
    public final C1555v0 f1026b;

    /* JADX INFO: renamed from: c */
    public final C1557w0 f1027c;

    /* JADX INFO: renamed from: d */
    public final C1551t0 f1028d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0367l(C0126e c0126e, C1555v0 c1555v0, C1557w0 c1557w0, C1551t0 c1551t0) {
        this.f1025a = c0126e;
        this.f1026b = c1555v0;
        this.f1027c = c1557w0;
        this.f1028d = c1551t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0367l)) {
            return false;
        }
        C0367l c0367l = (C0367l) obj;
        return this.f1025a == c0367l.f1025a && this.f1026b == c0367l.f1026b && this.f1027c == c0367l.f1027c && this.f1028d == c0367l.f1028d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C0369n(this.f1025a, this.f1026b, this.f1027c, this.f1028d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C0369n c0369n = (C0369n) abstractC5852n;
        c0369n.f1037w.f332h = null;
        C0126e c0126e = this.f1025a;
        c0369n.f1037w = c0126e;
        c0126e.f332h = c0369n;
        c0126e.f333i = c0369n.f23801t ? EnumC0370o.f1043i : EnumC0370o.f1042h;
        c0369n.f1038x = this.f1026b;
        c0369n.f1039y = this.f1027c;
        c0369n.f1040z = this.f1028d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1028d.hashCode() + ((this.f1027c.hashCode() + ((this.f1026b.hashCode() + (this.f1025a.hashCode() * 31)) * 31)) * 31);
    }
}
