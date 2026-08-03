package th;

import gg.AbstractC1416l;
import p339x1.AbstractC5618k;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: th.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C4219k extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C4218j f13886a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4219k(C4218j c4218j) {
        c4218j.getClass();
        this.f13886a = c4218j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4219k)) {
            return false;
        }
        return AbstractC1416l.m3825a(this.f13886a, ((C4219k) obj).f13886a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C4218j c4218j = this.f13886a;
        c4218j.getClass();
        C4220l c4220l = new C4220l();
        c4220l.f13887u = c4218j;
        return c4220l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C4220l c4220l = (C4220l) abstractC5852n;
        c4220l.getClass();
        C4218j c4218j = c4220l.f13887u;
        C4218j c4218j2 = this.f13886a;
        if (c4218j != c4218j2) {
            c4218j.f13882c.setValue(null);
            c4218j2.getClass();
            c4220l.f13887u = c4218j2;
        }
        AbstractC5618k.m10156l(c4220l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f13886a.hashCode();
    }
}
