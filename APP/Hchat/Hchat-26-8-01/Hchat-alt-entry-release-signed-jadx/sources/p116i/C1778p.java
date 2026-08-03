package p116i;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: i.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1778p extends AbstractC1781q {

    /* JADX INFO: renamed from: a */
    public float f5924a;

    /* JADX INFO: renamed from: b */
    public float f5925b;

    /* JADX INFO: renamed from: c */
    public float f5926c;

    /* JADX INFO: renamed from: d */
    public float f5927d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1778p(float f3, float f10, float f11, float f12) {
        this.f5924a = f3;
        this.f5925b = f10;
        this.f5926c = f11;
        this.f5927d = f12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.AbstractC1781q
    /* JADX INFO: renamed from: a */
    public final float mo4423a(int i9) {
        if (i9 == 0) {
            return this.f5924a;
        }
        if (i9 == 1) {
            return this.f5925b;
        }
        if (i9 == 2) {
            return this.f5926c;
        }
        if (i9 != 3) {
            return 0.0f;
        }
        return this.f5927d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.AbstractC1781q
    /* JADX INFO: renamed from: b */
    public final int mo4424b() {
        return 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.AbstractC1781q
    /* JADX INFO: renamed from: c */
    public final AbstractC1781q mo4425c() {
        return new C1778p(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.AbstractC1781q
    /* JADX INFO: renamed from: d */
    public final void mo4426d() {
        this.f5924a = 0.0f;
        this.f5925b = 0.0f;
        this.f5926c = 0.0f;
        this.f5927d = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.AbstractC1781q
    /* JADX INFO: renamed from: e */
    public final void mo4427e(int i9, float f3) {
        if (i9 == 0) {
            this.f5924a = f3;
            return;
        }
        if (i9 == 1) {
            this.f5925b = f3;
        } else if (i9 == 2) {
            this.f5926c = f3;
        } else {
            if (i9 != 3) {
                return;
            }
            this.f5927d = f3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1778p)) {
            return false;
        }
        C1778p c1778p = (C1778p) obj;
        return c1778p.f5924a == this.f5924a && c1778p.f5925b == this.f5925b && c1778p.f5926c == this.f5926c && c1778p.f5927d == this.f5927d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f5927d) + AbstractC0921a.m2241d(this.f5926c, AbstractC0921a.m2241d(this.f5925b, Float.hashCode(this.f5924a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f5924a + ", v2 = " + this.f5925b + ", v3 = " + this.f5926c + ", v4 = " + this.f5927d;
    }
}
