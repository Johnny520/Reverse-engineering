package p308v1;

import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: v1.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C4432v extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final String f14741a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4432v(String str) {
        this.f14741a = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4432v) && this.f14741a.equals(((C4432v) obj).f14741a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C4436x c4436x = new C4436x();
        c4436x.f14747u = this.f14741a;
        return c4436x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        ((C4436x) abstractC5852n).f14747u = this.f14741a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f14741a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.f14741a) + ')';
    }
}
