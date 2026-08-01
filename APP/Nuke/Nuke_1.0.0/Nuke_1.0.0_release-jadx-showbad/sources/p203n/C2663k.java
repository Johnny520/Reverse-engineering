package p203n;

/* JADX INFO: renamed from: n.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2663k extends AbstractC2670o {

    /* JADX INFO: renamed from: a */
    public float f8483a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2663k(float f2) {
        this.f8483a = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.AbstractC2670o
    /* JADX INFO: renamed from: a */
    public final float mo4624a(int i5) {
        if (i5 == 0) {
            return this.f8483a;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.AbstractC2670o
    /* JADX INFO: renamed from: b */
    public final int mo4625b() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.AbstractC2670o
    /* JADX INFO: renamed from: c */
    public final AbstractC2670o mo4626c() {
        return new C2663k(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.AbstractC2670o
    /* JADX INFO: renamed from: d */
    public final void mo4627d() {
        this.f8483a = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.AbstractC2670o
    /* JADX INFO: renamed from: e */
    public final void mo4628e(float f2, int i5) {
        if (i5 == 0) {
            this.f8483a = f2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C2663k) && ((C2663k) obj).f8483a == this.f8483a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8483a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationVector1D: value = " + this.f8483a;
    }
}
