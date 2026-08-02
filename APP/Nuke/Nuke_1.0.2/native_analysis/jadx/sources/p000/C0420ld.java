package p000;

/* JADX INFO: renamed from: ld */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0420ld extends AbstractC0494nd {

    /* JADX INFO: renamed from: a */
    public float f6063a;

    /* JADX INFO: renamed from: b */
    public float f6064b;

    /* JADX INFO: renamed from: c */
    public float f6065c;

    public C0420ld(float f, float f2, float f3) {
        this.f6063a = f;
        this.f6064b = f2;
        this.f6065c = f3;
    }

    @Override // p000.AbstractC0494nd
    /* JADX INFO: renamed from: a */
    public final float mo2477a(int i) {
        if (i == 0) {
            return this.f6063a;
        }
        if (i == 1) {
            return this.f6064b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.f6065c;
    }

    @Override // p000.AbstractC0494nd
    /* JADX INFO: renamed from: b */
    public final int mo2478b() {
        return 3;
    }

    @Override // p000.AbstractC0494nd
    /* JADX INFO: renamed from: c */
    public final AbstractC0494nd mo2479c() {
        return new C0420ld(0.0f, 0.0f, 0.0f);
    }

    @Override // p000.AbstractC0494nd
    /* JADX INFO: renamed from: d */
    public final void mo2480d() {
        this.f6063a = 0.0f;
        this.f6064b = 0.0f;
        this.f6065c = 0.0f;
    }

    @Override // p000.AbstractC0494nd
    /* JADX INFO: renamed from: e */
    public final void mo2481e(float f, int i) {
        if (i == 0) {
            this.f6063a = f;
        } else if (i == 1) {
            this.f6064b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.f6065c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0420ld)) {
            return false;
        }
        C0420ld c0420ld = (C0420ld) obj;
        return c0420ld.f6063a == this.f6063a && c0420ld.f6064b == this.f6064b && c0420ld.f6065c == this.f6065c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6065c) + vi0.m5684c(this.f6064b, Float.hashCode(this.f6063a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f6063a + ", v2 = " + this.f6064b + ", v3 = " + this.f6065c;
    }
}
