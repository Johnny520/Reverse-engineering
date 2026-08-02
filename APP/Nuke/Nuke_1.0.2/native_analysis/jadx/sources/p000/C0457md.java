package p000;

/* JADX INFO: renamed from: md */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0457md extends AbstractC0494nd {

    /* JADX INFO: renamed from: a */
    public float f6567a;

    /* JADX INFO: renamed from: b */
    public float f6568b;

    /* JADX INFO: renamed from: c */
    public float f6569c;

    /* JADX INFO: renamed from: d */
    public float f6570d;

    public C0457md(float f, float f2, float f3, float f4) {
        this.f6567a = f;
        this.f6568b = f2;
        this.f6569c = f3;
        this.f6570d = f4;
    }

    @Override // p000.AbstractC0494nd
    /* JADX INFO: renamed from: a */
    public final float mo2477a(int i) {
        if (i == 0) {
            return this.f6567a;
        }
        if (i == 1) {
            return this.f6568b;
        }
        if (i == 2) {
            return this.f6569c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f6570d;
    }

    @Override // p000.AbstractC0494nd
    /* JADX INFO: renamed from: b */
    public final int mo2478b() {
        return 4;
    }

    @Override // p000.AbstractC0494nd
    /* JADX INFO: renamed from: c */
    public final AbstractC0494nd mo2479c() {
        return new C0457md(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // p000.AbstractC0494nd
    /* JADX INFO: renamed from: d */
    public final void mo2480d() {
        this.f6567a = 0.0f;
        this.f6568b = 0.0f;
        this.f6569c = 0.0f;
        this.f6570d = 0.0f;
    }

    @Override // p000.AbstractC0494nd
    /* JADX INFO: renamed from: e */
    public final void mo2481e(float f, int i) {
        if (i == 0) {
            this.f6567a = f;
            return;
        }
        if (i == 1) {
            this.f6568b = f;
        } else if (i == 2) {
            this.f6569c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.f6570d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0457md)) {
            return false;
        }
        C0457md c0457md = (C0457md) obj;
        return c0457md.f6567a == this.f6567a && c0457md.f6568b == this.f6568b && c0457md.f6569c == this.f6569c && c0457md.f6570d == this.f6570d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6570d) + vi0.m5684c(this.f6569c, vi0.m5684c(this.f6568b, Float.hashCode(this.f6567a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f6567a + ", v2 = " + this.f6568b + ", v3 = " + this.f6569c + ", v4 = " + this.f6570d;
    }
}
