package p116i;

/* JADX INFO: renamed from: i.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1772n extends AbstractC1781q {

    /* JADX INFO: renamed from: a */
    public float f5914a;

    /* JADX INFO: renamed from: b */
    public float f5915b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1772n(float f3, float f10) {
        this.f5914a = f3;
        this.f5915b = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.AbstractC1781q
    /* JADX INFO: renamed from: a */
    public final float mo4423a(int i9) {
        if (i9 == 0) {
            return this.f5914a;
        }
        if (i9 != 1) {
            return 0.0f;
        }
        return this.f5915b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.AbstractC1781q
    /* JADX INFO: renamed from: b */
    public final int mo4424b() {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.AbstractC1781q
    /* JADX INFO: renamed from: c */
    public final AbstractC1781q mo4425c() {
        return new C1772n(0.0f, 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.AbstractC1781q
    /* JADX INFO: renamed from: d */
    public final void mo4426d() {
        this.f5914a = 0.0f;
        this.f5915b = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.AbstractC1781q
    /* JADX INFO: renamed from: e */
    public final void mo4427e(int i9, float f3) {
        if (i9 == 0) {
            this.f5914a = f3;
        } else {
            if (i9 != 1) {
                return;
            }
            this.f5915b = f3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1772n)) {
            return false;
        }
        C1772n c1772n = (C1772n) obj;
        return c1772n.f5914a == this.f5914a && c1772n.f5915b == this.f5915b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f5915b) + (Float.hashCode(this.f5914a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f5914a + ", v2 = " + this.f5915b;
    }
}
