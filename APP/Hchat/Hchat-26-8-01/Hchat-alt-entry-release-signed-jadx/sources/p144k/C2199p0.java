package p144k;

import gg.AbstractC1416l;
import p187n.C2857k;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: k.p0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C2199p0 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C2857k f7291a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2199p0(C2857k c2857k) {
        this.f7291a = c2857k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2199p0) && AbstractC1416l.m3825a(((C2199p0) obj).f7291a, this.f7291a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C2211t0 c2211t0 = new C2211t0();
        c2211t0.f7327u = this.f7291a;
        return c2211t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C2211t0 c2211t0 = (C2211t0) abstractC5852n;
        C2857k c2857k = c2211t0.f7327u;
        C2857k c2857k2 = this.f7291a;
        if (AbstractC1416l.m3825a(c2857k, c2857k2)) {
            return;
        }
        c2211t0.m5455m1();
        c2211t0.f7327u = c2857k2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f7291a.hashCode() * 31;
    }
}
