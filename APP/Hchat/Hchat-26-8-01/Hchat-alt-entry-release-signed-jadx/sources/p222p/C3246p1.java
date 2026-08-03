package p222p;

import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;
import p356y0.C5844f;

/* JADX INFO: renamed from: p.p1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3246p1 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C5844f f10348a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3246p1(C5844f c5844f) {
        this.f10348a = c5844f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C3246p1 c3246p1 = obj instanceof C3246p1 ? (C3246p1) obj : null;
        if (c3246p1 == null) {
            return false;
        }
        return this.f10348a.equals(c3246p1.f10348a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C3249q1 c3249q1 = new C3249q1();
        c3249q1.f10353u = this.f10348a;
        return c3249q1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        ((C3249q1) abstractC5852n).f10353u = this.f10348a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f10348a.f23779a);
    }
}
