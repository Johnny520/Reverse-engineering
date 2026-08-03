package p222p;

import p293u2.C4236f;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: p.m1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C3237m1 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final float f10324a;

    /* JADX INFO: renamed from: b */
    public final float f10325b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3237m1(float f3, float f10) {
        this.f10324a = f3;
        this.f10325b = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3237m1)) {
            return false;
        }
        C3237m1 c3237m1 = (C3237m1) obj;
        return C4236f.m8520b(this.f10324a, c3237m1.f10324a) && C4236f.m8520b(this.f10325b, c3237m1.f10325b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C3240n1 c3240n1 = new C3240n1();
        c3240n1.f10332u = this.f10324a;
        c3240n1.f10333v = this.f10325b;
        return c3240n1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3240n1 c3240n1 = (C3240n1) abstractC5852n;
        c3240n1.f10332u = this.f10324a;
        c3240n1.f10333v = this.f10325b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f10325b) + (Float.hashCode(this.f10324a) * 31);
    }
}
