package p222p;

import gg.AbstractC1416l;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: p.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C3218g0 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C3254s0 f10273a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3218g0(C3254s0 c3254s0) {
        this.f10273a = c3254s0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3218g0) {
            return ((C3218g0) obj).f10273a.equals(this.f10273a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C3224i0(this.f10273a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3224i0 c3224i0 = (C3224i0) abstractC5852n;
        InterfaceC3252r1 interfaceC3252r1 = c3224i0.f10292w;
        C3254s0 c3254s0 = this.f10273a;
        if (AbstractC1416l.m3825a(c3254s0, interfaceC3252r1)) {
            return;
        }
        c3224i0.f10292w = c3254s0;
        c3224i0.mo6895l1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10273a.hashCode();
    }
}
