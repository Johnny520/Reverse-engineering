package p222p;

import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: p.q0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3248q0 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final float f10351a;

    /* JADX INFO: renamed from: b */
    public final boolean f10352b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3248q0(float f3, boolean z9) {
        this.f10351a = f3;
        this.f10352b = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C3248q0 c3248q0 = obj instanceof C3248q0 ? (C3248q0) obj : null;
        return c3248q0 != null && this.f10351a == c3248q0.f10351a && this.f10352b == c3248q0.f10352b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C3251r0 c3251r0 = new C3251r0();
        c3251r0.f10355u = this.f10351a;
        c3251r0.f10356v = this.f10352b;
        return c3251r0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3251r0 c3251r0 = (C3251r0) abstractC5852n;
        c3251r0.f10355u = this.f10351a;
        c3251r0.f10356v = this.f10352b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f10352b) + (Float.hashCode(this.f10351a) * 31);
    }
}
