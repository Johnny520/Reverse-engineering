package p000;

/* JADX INFO: renamed from: y7 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0953y7 extends AbstractC0046b8 {

    /* JADX INFO: renamed from: a */
    public float f7557a;

    /* JADX INFO: renamed from: b */
    public float f7558b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0953y7(float f, float f2) {
        this.f7557a = f;
        this.f7558b = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0046b8
    /* JADX INFO: renamed from: a */
    public final float mo26a(int i) {
        if (i == 0) {
            return this.f7557a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.f7558b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0046b8
    /* JADX INFO: renamed from: b */
    public final int mo27b() {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0046b8
    /* JADX INFO: renamed from: c */
    public final AbstractC0046b8 mo28c() {
        return new C0953y7(0.0f, 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0046b8
    /* JADX INFO: renamed from: d */
    public final void mo29d() {
        this.f7557a = 0.0f;
        this.f7558b = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0046b8
    /* JADX INFO: renamed from: e */
    public final void mo30e(float f, int i) {
        if (i == 0) {
            this.f7557a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.f7558b = f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0953y7)) {
            return false;
        }
        C0953y7 c0953y7 = (C0953y7) obj;
        return c0953y7.f7557a == this.f7557a && c0953y7.f7558b == this.f7558b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f7558b) + (Float.hashCode(this.f7557a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f7557a + ", v2 = " + this.f7558b;
    }
}
