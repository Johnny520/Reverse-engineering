package p000;

/* JADX INFO: renamed from: z7 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0990z7 extends AbstractC0046b8 {

    /* JADX INFO: renamed from: a */
    public float f7819a;

    /* JADX INFO: renamed from: b */
    public float f7820b;

    /* JADX INFO: renamed from: c */
    public float f7821c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0990z7(float f, float f2, float f3) {
        this.f7819a = f;
        this.f7820b = f2;
        this.f7821c = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0046b8
    /* JADX INFO: renamed from: a */
    public final float mo26a(int i) {
        if (i == 0) {
            return this.f7819a;
        }
        if (i == 1) {
            return this.f7820b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.f7821c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0046b8
    /* JADX INFO: renamed from: b */
    public final int mo27b() {
        return 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0046b8
    /* JADX INFO: renamed from: c */
    public final AbstractC0046b8 mo28c() {
        return new C0990z7(0.0f, 0.0f, 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0046b8
    /* JADX INFO: renamed from: d */
    public final void mo29d() {
        this.f7819a = 0.0f;
        this.f7820b = 0.0f;
        this.f7821c = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0046b8
    /* JADX INFO: renamed from: e */
    public final void mo30e(float f, int i) {
        if (i == 0) {
            this.f7819a = f;
        } else if (i == 1) {
            this.f7820b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.f7821c = f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0990z7)) {
            return false;
        }
        C0990z7 c0990z7 = (C0990z7) obj;
        return c0990z7.f7819a == this.f7819a && c0990z7.f7820b == this.f7820b && c0990z7.f7821c == this.f7821c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f7821c) + AbstractC0748t1.m4143a(this.f7820b, Float.hashCode(this.f7819a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f7819a + ", v2 = " + this.f7820b + ", v3 = " + this.f7821c;
    }
}
