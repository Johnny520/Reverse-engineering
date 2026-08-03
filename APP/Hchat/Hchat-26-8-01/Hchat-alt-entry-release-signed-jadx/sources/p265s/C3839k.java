package p265s;

import p116i.C1768l1;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: s.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3839k extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C1768l1 f12574a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3839k(C1768l1 c1768l1) {
        this.f12574a = c1768l1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3839k) && this.f12574a.equals(((C3839k) obj).f12574a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C3841l c3841l = new C3841l();
        c3841l.f12575u = this.f12574a;
        return c3841l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3841l c3841l = (C3841l) abstractC5852n;
        c3841l.getClass();
        c3841l.f12575u = this.f12574a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12574a.hashCode() * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=null, placementSpec=" + this.f12574a + ", fadeOutSpec=null)";
    }
}
