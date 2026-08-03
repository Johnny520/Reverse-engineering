package p027c0;

import p015b0.C0136d0;
import p015b0.C0151q;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: c0.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C0357b extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C0151q f1008a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0357b(C0151q c0151q) {
        this.f1008a = c0151q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0357b) {
            return this.f1008a == ((C0357b) obj).f1008a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C0358c c0358c = new C0358c();
        c0358c.f1009w = this.f1008a;
        C0136d0 c0136d0 = new C0136d0(c0358c, 1);
        C0356a c0356a = new C0356a();
        c0356a.f1007u = c0136d0;
        c0358c.m10122k1(c0356a);
        return c0358c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        ((C0358c) abstractC5852n).f1009w = this.f1008a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1008a.hashCode();
    }
}
