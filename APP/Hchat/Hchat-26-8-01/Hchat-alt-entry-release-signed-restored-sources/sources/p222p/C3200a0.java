package p222p;

import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: p.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3200a0 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final EnumC3269y f10233a;

    /* JADX INFO: renamed from: b */
    public final float f10234b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3200a0(EnumC3269y enumC3269y, float f3) {
        this.f10233a = enumC3269y;
        this.f10234b = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3200a0)) {
            return false;
        }
        C3200a0 c3200a0 = (C3200a0) obj;
        return this.f10233a == c3200a0.f10233a && this.f10234b == c3200a0.f10234b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C3203b0 c3203b0 = new C3203b0();
        c3203b0.f10240u = this.f10233a;
        c3203b0.f10241v = this.f10234b;
        return c3203b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3203b0 c3203b0 = (C3203b0) abstractC5852n;
        c3203b0.f10240u = this.f10233a;
        c3203b0.f10241v = this.f10234b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f10234b) + (this.f10233a.hashCode() * 31);
    }
}
