package p000;

/* JADX INFO: renamed from: a8 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0009a8 extends AbstractC0046b8 {

    /* JADX INFO: renamed from: a */
    public float f65a;

    /* JADX INFO: renamed from: b */
    public float f66b;

    /* JADX INFO: renamed from: c */
    public float f67c;

    /* JADX INFO: renamed from: d */
    public float f68d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0009a8(float f, float f2, float f3, float f4) {
        this.f65a = f;
        this.f66b = f2;
        this.f67c = f3;
        this.f68d = f4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0046b8
    /* JADX INFO: renamed from: a */
    public final float mo26a(int i) {
        if (i == 0) {
            return this.f65a;
        }
        if (i == 1) {
            return this.f66b;
        }
        if (i == 2) {
            return this.f67c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f68d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0046b8
    /* JADX INFO: renamed from: b */
    public final int mo27b() {
        return 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0046b8
    /* JADX INFO: renamed from: c */
    public final AbstractC0046b8 mo28c() {
        return new C0009a8(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0046b8
    /* JADX INFO: renamed from: d */
    public final void mo29d() {
        this.f65a = 0.0f;
        this.f66b = 0.0f;
        this.f67c = 0.0f;
        this.f68d = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0046b8
    /* JADX INFO: renamed from: e */
    public final void mo30e(float f, int i) {
        if (i == 0) {
            this.f65a = f;
            return;
        }
        if (i == 1) {
            this.f66b = f;
        } else if (i == 2) {
            this.f67c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.f68d = f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0009a8)) {
            return false;
        }
        C0009a8 c0009a8 = (C0009a8) obj;
        return c0009a8.f65a == this.f65a && c0009a8.f66b == this.f66b && c0009a8.f67c == this.f67c && c0009a8.f68d == this.f68d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f68d) + AbstractC0748t1.m4143a(this.f67c, AbstractC0748t1.m4143a(this.f66b, Float.hashCode(this.f65a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f65a + ", v2 = " + this.f66b + ", v3 = " + this.f67c + ", v4 = " + this.f68d;
    }
}
