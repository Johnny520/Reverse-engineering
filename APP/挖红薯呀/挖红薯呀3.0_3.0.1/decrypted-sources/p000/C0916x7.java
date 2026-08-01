package p000;

/* JADX INFO: renamed from: x7 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0916x7 extends AbstractC0046b8 {

    /* JADX INFO: renamed from: a */
    public float f7277a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0916x7(float f) {
        this.f7277a = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0046b8
    /* JADX INFO: renamed from: a */
    public final float mo26a(int i) {
        if (i == 0) {
            return this.f7277a;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0046b8
    /* JADX INFO: renamed from: b */
    public final int mo27b() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0046b8
    /* JADX INFO: renamed from: c */
    public final AbstractC0046b8 mo28c() {
        return new C0916x7(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0046b8
    /* JADX INFO: renamed from: d */
    public final void mo29d() {
        this.f7277a = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0046b8
    /* JADX INFO: renamed from: e */
    public final void mo30e(float f, int i) {
        if (i == 0) {
            this.f7277a = f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C0916x7) && ((C0916x7) obj).f7277a == this.f7277a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f7277a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationVector1D: value = " + this.f7277a;
    }
}
