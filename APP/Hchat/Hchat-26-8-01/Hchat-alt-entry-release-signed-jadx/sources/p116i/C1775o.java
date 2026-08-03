package p116i;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: i.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1775o extends AbstractC1781q {

    /* JADX INFO: renamed from: a */
    public float f5918a;

    /* JADX INFO: renamed from: b */
    public float f5919b;

    /* JADX INFO: renamed from: c */
    public float f5920c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1775o(float f3, float f10, float f11) {
        this.f5918a = f3;
        this.f5919b = f10;
        this.f5920c = f11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.AbstractC1781q
    /* JADX INFO: renamed from: a */
    public final float mo4423a(int i9) {
        if (i9 == 0) {
            return this.f5918a;
        }
        if (i9 == 1) {
            return this.f5919b;
        }
        if (i9 != 2) {
            return 0.0f;
        }
        return this.f5920c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.AbstractC1781q
    /* JADX INFO: renamed from: b */
    public final int mo4424b() {
        return 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.AbstractC1781q
    /* JADX INFO: renamed from: c */
    public final AbstractC1781q mo4425c() {
        return new C1775o(0.0f, 0.0f, 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.AbstractC1781q
    /* JADX INFO: renamed from: d */
    public final void mo4426d() {
        this.f5918a = 0.0f;
        this.f5919b = 0.0f;
        this.f5920c = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.AbstractC1781q
    /* JADX INFO: renamed from: e */
    public final void mo4427e(int i9, float f3) {
        if (i9 == 0) {
            this.f5918a = f3;
        } else if (i9 == 1) {
            this.f5919b = f3;
        } else {
            if (i9 != 2) {
                return;
            }
            this.f5920c = f3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1775o)) {
            return false;
        }
        C1775o c1775o = (C1775o) obj;
        return c1775o.f5918a == this.f5918a && c1775o.f5919b == this.f5919b && c1775o.f5920c == this.f5920c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f5920c) + AbstractC0921a.m2241d(this.f5919b, Float.hashCode(this.f5918a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f5918a + ", v2 = " + this.f5919b + ", v3 = " + this.f5920c;
    }
}
