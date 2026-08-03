package p222p;

import gg.AbstractC1416l;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: p.y0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C3270y0 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3268x0 f10414a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3270y0(InterfaceC3268x0 interfaceC3268x0) {
        this.f10414a = interfaceC3268x0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        C3270y0 c3270y0 = obj instanceof C3270y0 ? (C3270y0) obj : null;
        if (c3270y0 == null) {
            return false;
        }
        return AbstractC1416l.m3825a(this.f10414a, c3270y0.f10414a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C3201a1 c3201a1 = new C3201a1();
        c3201a1.f10235u = this.f10414a;
        return c3201a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        ((C3201a1) abstractC5852n).f10235u = this.f10414a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10414a.hashCode();
    }
}
