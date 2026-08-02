package p000;

/* JADX INFO: renamed from: jd */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0346jd extends AbstractC0494nd {

    /* JADX INFO: renamed from: a */
    public float f4968a;

    public C0346jd(float f) {
        this.f4968a = f;
    }

    @Override // p000.AbstractC0494nd
    /* JADX INFO: renamed from: a */
    public final float mo2477a(int i) {
        if (i == 0) {
            return this.f4968a;
        }
        return 0.0f;
    }

    @Override // p000.AbstractC0494nd
    /* JADX INFO: renamed from: b */
    public final int mo2478b() {
        return 1;
    }

    @Override // p000.AbstractC0494nd
    /* JADX INFO: renamed from: c */
    public final AbstractC0494nd mo2479c() {
        return new C0346jd(0.0f);
    }

    @Override // p000.AbstractC0494nd
    /* JADX INFO: renamed from: d */
    public final void mo2480d() {
        this.f4968a = 0.0f;
    }

    @Override // p000.AbstractC0494nd
    /* JADX INFO: renamed from: e */
    public final void mo2481e(float f, int i) {
        if (i == 0) {
            this.f4968a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0346jd) && ((C0346jd) obj).f4968a == this.f4968a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4968a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f4968a;
    }
}
