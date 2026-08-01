package p203n;

/* JADX INFO: renamed from: n.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2665l extends AbstractC2670o {

    /* JADX INFO: renamed from: a */
    public float f8486a;

    /* JADX INFO: renamed from: b */
    public float f8487b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2665l(float f2, float f5) {
        this.f8486a = f2;
        this.f8487b = f5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.AbstractC2670o
    /* JADX INFO: renamed from: a */
    public final float mo4624a(int i5) {
        if (i5 == 0) {
            return this.f8486a;
        }
        if (i5 != 1) {
            return 0.0f;
        }
        return this.f8487b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.AbstractC2670o
    /* JADX INFO: renamed from: b */
    public final int mo4625b() {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.AbstractC2670o
    /* JADX INFO: renamed from: c */
    public final AbstractC2670o mo4626c() {
        return new C2665l(0.0f, 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.AbstractC2670o
    /* JADX INFO: renamed from: d */
    public final void mo4627d() {
        this.f8486a = 0.0f;
        this.f8487b = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.AbstractC2670o
    /* JADX INFO: renamed from: e */
    public final void mo4628e(float f2, int i5) {
        if (i5 == 0) {
            this.f8486a = f2;
        } else {
            if (i5 != 1) {
                return;
            }
            this.f8487b = f2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2665l)) {
            return false;
        }
        C2665l c2665l = (C2665l) obj;
        return c2665l.f8486a == this.f8486a && c2665l.f8487b == this.f8487b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8487b) + (Float.hashCode(this.f8486a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f8486a + ", v2 = " + this.f8487b;
    }
}
