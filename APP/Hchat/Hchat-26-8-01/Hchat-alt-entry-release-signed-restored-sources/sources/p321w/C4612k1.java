package p321w;

import gg.AbstractC1416l;
import okio.C3193a;
import p119i2.AbstractC1923e0;
import p119i2.C1941n0;
import p177m2.InterfaceC2760d;
import p201o.AbstractC3026b;
import p320vh.C4579f;
import p339x1.AbstractC5618k;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;
import p357y1.AbstractC5888h1;

/* JADX INFO: renamed from: w.k1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C4612k1 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C1941n0 f15223a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4612k1(C1941n0 c1941n0) {
        this.f15223a = c1941n0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4612k1)) {
            return false;
        }
        return AbstractC1416l.m3825a(this.f15223a, ((C4612k1) obj).f15223a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C4615l1(this.f15223a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C4615l1 c4615l1 = (C4615l1) abstractC5852n;
        c4615l1.getClass();
        C1941n0 c1941n0M4790h = AbstractC1923e0.m4790h(this.f15223a, AbstractC5618k.m10167w(c4615l1).f22772F);
        c4615l1.m9035k1(c1941n0M4790h, (InterfaceC2760d) AbstractC5618k.m10152h(c4615l1, AbstractC5888h1.f23929k));
        C4579f c4579f = c4615l1.f15232w;
        if (c4579f != null) {
            C4579f.m9024a(c4579f, null, null, c1941n0M4790h, 23);
            AbstractC5618k.m10157m(c4615l1);
        } else {
            AbstractC3026b.m6429b("Min size state is not set.");
            C3193a.m6814c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f15223a.hashCode();
    }
}
