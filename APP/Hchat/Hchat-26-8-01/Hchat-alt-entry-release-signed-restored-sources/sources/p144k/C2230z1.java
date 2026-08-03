package p144k;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: k.z1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2230z1 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C2221w1 f7389a;

    /* JADX INFO: renamed from: b */
    public final boolean f7390b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2230z1(C2221w1 c2221w1, boolean z9) {
        this.f7389a = c2221w1;
        this.f7390b = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2230z1)) {
            return false;
        }
        C2230z1 c2230z1 = (C2230z1) obj;
        return AbstractC1416l.m3825a(this.f7389a, c2230z1.f7389a) && this.f7390b == c2230z1.f7390b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C2215u1 c2215u1 = new C2215u1();
        c2215u1.f7339u = this.f7389a;
        c2215u1.f7340v = this.f7390b;
        return c2215u1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C2215u1 c2215u1 = (C2215u1) abstractC5852n;
        c2215u1.f7339u = this.f7389a;
        c2215u1.f7340v = this.f7390b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f7390b) + AbstractC0921a.m2245h(this.f7389a.hashCode() * 31, 31, false);
    }
}
