package p321w;

import gg.AbstractC1416l;
import p119i2.AbstractC1923e0;
import p119i2.C1941n0;
import p339x1.AbstractC5618k;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: w.i0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C4605i0 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C1941n0 f15187a;

    /* JADX INFO: renamed from: b */
    public final int f15188b;

    /* JADX INFO: renamed from: c */
    public final int f15189c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4605i0(C1941n0 c1941n0, int i9, int i10) {
        this.f15187a = c1941n0;
        this.f15188b = i9;
        this.f15189c = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4605i0)) {
            return false;
        }
        C4605i0 c4605i0 = (C4605i0) obj;
        return AbstractC1416l.m3825a(this.f15187a, c4605i0.f15187a) && this.f15188b == c4605i0.f15188b && this.f15189c == c4605i0.f15189c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C4611k0 c4611k0 = new C4611k0();
        c4611k0.f15217u = this.f15187a;
        c4611k0.f15218v = this.f15188b;
        c4611k0.f15219w = this.f15189c;
        c4611k0.f15221y = -1;
        c4611k0.f15222z = -1;
        return c4611k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C4611k0 c4611k0 = (C4611k0) abstractC5852n;
        C1941n0 c1941n0 = c4611k0.f15217u;
        C1941n0 c1941n02 = this.f15187a;
        boolean zM3825a = AbstractC1416l.m3825a(c1941n0, c1941n02);
        int i9 = this.f15188b;
        int i10 = this.f15189c;
        if (zM3825a && c4611k0.f15218v == i9 && c4611k0.f15219w == i10) {
            return;
        }
        c4611k0.f15217u = c1941n02;
        c4611k0.f15218v = i9;
        c4611k0.f15219w = i10;
        c4611k0.f15215A = AbstractC1923e0.m4790h(c1941n02, AbstractC5618k.m10167w(c4611k0).f22772F);
        c4611k0.f15220x = true;
        AbstractC5618k.m10157m(c4611k0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((this.f15187a.hashCode() * 31) + this.f15188b) * 31) + this.f15189c;
    }
}
