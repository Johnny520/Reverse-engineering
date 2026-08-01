package p203n;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: n.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2669n extends AbstractC2670o {

    /* JADX INFO: renamed from: a */
    public float f8505a;

    /* JADX INFO: renamed from: b */
    public float f8506b;

    /* JADX INFO: renamed from: c */
    public float f8507c;

    /* JADX INFO: renamed from: d */
    public float f8508d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2669n(float f2, float f5, float f6, float f7) {
        this.f8505a = f2;
        this.f8506b = f5;
        this.f8507c = f6;
        this.f8508d = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.AbstractC2670o
    /* JADX INFO: renamed from: a */
    public final float mo4624a(int i5) {
        if (i5 == 0) {
            return this.f8505a;
        }
        if (i5 == 1) {
            return this.f8506b;
        }
        if (i5 == 2) {
            return this.f8507c;
        }
        if (i5 != 3) {
            return 0.0f;
        }
        return this.f8508d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.AbstractC2670o
    /* JADX INFO: renamed from: b */
    public final int mo4625b() {
        return 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.AbstractC2670o
    /* JADX INFO: renamed from: c */
    public final AbstractC2670o mo4626c() {
        return new C2669n(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.AbstractC2670o
    /* JADX INFO: renamed from: d */
    public final void mo4627d() {
        this.f8505a = 0.0f;
        this.f8506b = 0.0f;
        this.f8507c = 0.0f;
        this.f8508d = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.AbstractC2670o
    /* JADX INFO: renamed from: e */
    public final void mo4628e(float f2, int i5) {
        if (i5 == 0) {
            this.f8505a = f2;
            return;
        }
        if (i5 == 1) {
            this.f8506b = f2;
        } else if (i5 == 2) {
            this.f8507c = f2;
        } else {
            if (i5 != 3) {
                return;
            }
            this.f8508d = f2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2669n)) {
            return false;
        }
        C2669n c2669n = (C2669n) obj;
        return c2669n.f8505a == this.f8505a && c2669n.f8506b == this.f8506b && c2669n.f8507c == this.f8507c && c2669n.f8508d == this.f8508d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8508d) + AbstractC0231b.m390a(this.f8507c, AbstractC0231b.m390a(this.f8506b, Float.hashCode(this.f8505a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f8505a + ", v2 = " + this.f8506b + ", v3 = " + this.f8507c + ", v4 = " + this.f8508d;
    }
}
