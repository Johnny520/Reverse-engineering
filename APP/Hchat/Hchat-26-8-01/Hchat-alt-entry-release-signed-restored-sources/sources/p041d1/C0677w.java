package p041d1;

import gg.AbstractC1416l;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: d1.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C0677w extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C0676v f2082a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0677w(C0676v c0676v) {
        this.f2082a = c0676v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0677w) && AbstractC1416l.m3825a(this.f2082a, ((C0677w) obj).f2082a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C0679y c0679y = new C0679y();
        c0679y.f2083u = this.f2082a;
        return c0679y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C0679y c0679y = (C0679y) abstractC5852n;
        c0679y.f2083u.f2081a.m5064j(c0679y);
        C0676v c0676v = this.f2082a;
        c0679y.f2083u = c0676v;
        c0676v.f2081a.m5056b(c0679y);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2082a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f2082a + ')';
    }
}
