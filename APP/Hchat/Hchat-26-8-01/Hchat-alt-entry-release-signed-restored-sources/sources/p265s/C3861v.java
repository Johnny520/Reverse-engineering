package p265s;

import gg.AbstractC1416l;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: s.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C3861v extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C3869z f12653a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3861v(C3869z c3869z) {
        this.f12653a = c3869z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3861v) && this.f12653a.equals(((C3861v) obj).f12653a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C3863w c3863w = new C3863w();
        c3863w.f12657u = this.f12653a;
        return c3863w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3863w c3863w = (C3863w) abstractC5852n;
        C3869z c3869z = c3863w.f12657u;
        C3869z c3869z2 = this.f12653a;
        if (AbstractC1416l.m3825a(c3869z, c3869z2) || !c3863w.f23788g.f23801t) {
            return;
        }
        C3869z c3869z3 = c3863w.f12657u;
        c3869z3.m8045d();
        c3869z3.f12685b = null;
        c3869z3.f12686c = -1;
        c3869z2.f12693j = c3863w;
        c3863w.f12657u = c3869z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12653a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.f12653a + ')';
    }
}
