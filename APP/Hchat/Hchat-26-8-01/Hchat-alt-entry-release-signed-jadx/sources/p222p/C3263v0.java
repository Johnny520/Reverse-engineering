package p222p;

import p068eh.AbstractC0921a;
import p234q.AbstractC3418a;
import p293u2.C4236f;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: p.v0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C3263v0 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final float f10397a;

    /* JADX INFO: renamed from: b */
    public final float f10398b;

    /* JADX INFO: renamed from: c */
    public final float f10399c;

    /* JADX INFO: renamed from: d */
    public final float f10400d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3263v0(float f3, float f10, float f11, float f12) {
        this.f10397a = f3;
        this.f10398b = f10;
        this.f10399c = f11;
        this.f10400d = f12;
        boolean z9 = true;
        boolean z10 = (f3 >= 0.0f || Float.isNaN(f3)) & (f10 >= 0.0f || Float.isNaN(f10)) & (f11 >= 0.0f || Float.isNaN(f11));
        if (f12 < 0.0f && !Float.isNaN(f12)) {
            z9 = false;
        }
        if (!z10 || !z9) {
            AbstractC3418a.m7194a("Padding must be non-negative");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        C3263v0 c3263v0 = obj instanceof C3263v0 ? (C3263v0) obj : null;
        return c3263v0 != null && C4236f.m8520b(this.f10397a, c3263v0.f10397a) && C4236f.m8520b(this.f10398b, c3263v0.f10398b) && C4236f.m8520b(this.f10399c, c3263v0.f10399c) && C4236f.m8520b(this.f10400d, c3263v0.f10400d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C3266w0 c3266w0 = new C3266w0();
        c3266w0.f10404u = this.f10397a;
        c3266w0.f10405v = this.f10398b;
        c3266w0.f10406w = this.f10399c;
        c3266w0.f10407x = this.f10400d;
        c3266w0.f10408y = true;
        return c3266w0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3266w0 c3266w0 = (C3266w0) abstractC5852n;
        c3266w0.f10404u = this.f10397a;
        c3266w0.f10405v = this.f10398b;
        c3266w0.f10406w = this.f10399c;
        c3266w0.f10407x = this.f10400d;
        c3266w0.f10408y = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0921a.m2241d(this.f10400d, AbstractC0921a.m2241d(this.f10399c, AbstractC0921a.m2241d(this.f10398b, Float.hashCode(this.f10397a) * 31, 31), 31), 31);
    }
}
