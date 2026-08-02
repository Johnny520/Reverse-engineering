package p000;

/* JADX INFO: renamed from: kd */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0383kd extends AbstractC0494nd {

    /* JADX INFO: renamed from: a */
    public float f5460a;

    /* JADX INFO: renamed from: b */
    public float f5461b;

    public C0383kd(float f, float f2) {
        this.f5460a = f;
        this.f5461b = f2;
    }

    @Override // p000.AbstractC0494nd
    /* JADX INFO: renamed from: a */
    public final float mo2477a(int i) {
        if (i == 0) {
            return this.f5460a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.f5461b;
    }

    @Override // p000.AbstractC0494nd
    /* JADX INFO: renamed from: b */
    public final int mo2478b() {
        return 2;
    }

    @Override // p000.AbstractC0494nd
    /* JADX INFO: renamed from: c */
    public final AbstractC0494nd mo2479c() {
        return new C0383kd(0.0f, 0.0f);
    }

    @Override // p000.AbstractC0494nd
    /* JADX INFO: renamed from: d */
    public final void mo2480d() {
        this.f5460a = 0.0f;
        this.f5461b = 0.0f;
    }

    @Override // p000.AbstractC0494nd
    /* JADX INFO: renamed from: e */
    public final void mo2481e(float f, int i) {
        if (i == 0) {
            this.f5460a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.f5461b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0383kd)) {
            return false;
        }
        C0383kd c0383kd = (C0383kd) obj;
        return c0383kd.f5460a == this.f5460a && c0383kd.f5461b == this.f5461b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5461b) + (Float.hashCode(this.f5460a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f5460a + ", v2 = " + this.f5461b;
    }
}
