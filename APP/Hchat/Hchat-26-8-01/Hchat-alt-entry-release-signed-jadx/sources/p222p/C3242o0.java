package p222p;

import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: p.o0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C3242o0 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final EnumC3239n0 f10337a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3242o0(EnumC3239n0 enumC3239n0) {
        this.f10337a = enumC3239n0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C3242o0 c3242o0 = obj instanceof C3242o0 ? (C3242o0) obj : null;
        return c3242o0 != null && this.f10337a == c3242o0.f10337a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C3245p0 c3245p0 = new C3245p0(1);
        c3245p0.f10346v = this.f10337a;
        c3245p0.f10347w = true;
        return c3245p0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3245p0 c3245p0 = (C3245p0) abstractC5852n;
        c3245p0.f10346v = this.f10337a;
        c3245p0.f10347w = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f10337a.hashCode() * 31);
    }
}
