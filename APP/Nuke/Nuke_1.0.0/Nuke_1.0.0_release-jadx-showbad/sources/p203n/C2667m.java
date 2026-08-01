package p203n;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: n.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2667m extends AbstractC2670o {

    /* JADX INFO: renamed from: a */
    public float f8501a;

    /* JADX INFO: renamed from: b */
    public float f8502b;

    /* JADX INFO: renamed from: c */
    public float f8503c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2667m(float f2, float f5, float f6) {
        this.f8501a = f2;
        this.f8502b = f5;
        this.f8503c = f6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.AbstractC2670o
    /* JADX INFO: renamed from: a */
    public final float mo4624a(int i5) {
        if (i5 == 0) {
            return this.f8501a;
        }
        if (i5 == 1) {
            return this.f8502b;
        }
        if (i5 != 2) {
            return 0.0f;
        }
        return this.f8503c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.AbstractC2670o
    /* JADX INFO: renamed from: b */
    public final int mo4625b() {
        return 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.AbstractC2670o
    /* JADX INFO: renamed from: c */
    public final AbstractC2670o mo4626c() {
        return new C2667m(0.0f, 0.0f, 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.AbstractC2670o
    /* JADX INFO: renamed from: d */
    public final void mo4627d() {
        this.f8501a = 0.0f;
        this.f8502b = 0.0f;
        this.f8503c = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.AbstractC2670o
    /* JADX INFO: renamed from: e */
    public final void mo4628e(float f2, int i5) {
        if (i5 == 0) {
            this.f8501a = f2;
        } else if (i5 == 1) {
            this.f8502b = f2;
        } else {
            if (i5 != 2) {
                return;
            }
            this.f8503c = f2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2667m)) {
            return false;
        }
        C2667m c2667m = (C2667m) obj;
        return c2667m.f8501a == this.f8501a && c2667m.f8502b == this.f8502b && c2667m.f8503c == this.f8503c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8503c) + AbstractC0231b.m390a(this.f8502b, Float.hashCode(this.f8501a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f8501a + ", v2 = " + this.f8502b + ", v3 = " + this.f8503c;
    }
}
