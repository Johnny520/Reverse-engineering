package p116i;

/* JADX INFO: renamed from: i.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1769m extends AbstractC1781q {

    /* JADX INFO: renamed from: a */
    public float f5910a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1769m(float f3) {
        this.f5910a = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.AbstractC1781q
    /* JADX INFO: renamed from: a */
    public final float mo4423a(int i9) {
        if (i9 == 0) {
            return this.f5910a;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.AbstractC1781q
    /* JADX INFO: renamed from: b */
    public final int mo4424b() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.AbstractC1781q
    /* JADX INFO: renamed from: c */
    public final AbstractC1781q mo4425c() {
        return new C1769m(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.AbstractC1781q
    /* JADX INFO: renamed from: d */
    public final void mo4426d() {
        this.f5910a = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.AbstractC1781q
    /* JADX INFO: renamed from: e */
    public final void mo4427e(int i9, float f3) {
        if (i9 == 0) {
            this.f5910a = f3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C1769m) && ((C1769m) obj).f5910a == this.f5910a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f5910a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationVector1D: value = " + this.f5910a;
    }
}
