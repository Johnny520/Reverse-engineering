package p163l;

/* JADX INFO: renamed from: l.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4347q extends AbstractC4357s {

    /* JADX INFO: renamed from: a */
    public float f12708a;

    /* JADX INFO: renamed from: b */
    public float f12709b;

    /* JADX INFO: renamed from: c */
    public float f12710c;

    /* JADX INFO: renamed from: d */
    public final int f12711d;

    public C4347q(float f10, float f11, float f12) {
        super(null);
        this.f12708a = f10;
        this.f12709b = f11;
        this.f12710c = f12;
        this.f12711d = 3;
    }

    @Override // p163l.AbstractC4357s
    /* JADX INFO: renamed from: a */
    public float mo17032a(int i10) {
        if (i10 == 0) {
            return this.f12708a;
        }
        if (i10 == 1) {
            return this.f12709b;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f12710c;
    }

    @Override // p163l.AbstractC4357s
    /* JADX INFO: renamed from: b */
    public int mo17033b() {
        return this.f12711d;
    }

    @Override // p163l.AbstractC4357s
    /* JADX INFO: renamed from: d */
    public void mo17035d() {
        this.f12708a = 0.0f;
        this.f12709b = 0.0f;
        this.f12710c = 0.0f;
    }

    @Override // p163l.AbstractC4357s
    /* JADX INFO: renamed from: e */
    public void mo17036e(int i10, float f10) {
        if (i10 == 0) {
            this.f12708a = f10;
        } else if (i10 == 1) {
            this.f12709b = f10;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f12710c = f10;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4347q)) {
            return false;
        }
        C4347q c4347q = (C4347q) obj;
        return c4347q.f12708a == this.f12708a && c4347q.f12709b == this.f12709b && c4347q.f12710c == this.f12710c;
    }

    @Override // p163l.AbstractC4357s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C4347q mo17034c() {
        return new C4347q(0.0f, 0.0f, 0.0f);
    }

    public int hashCode() {
        return (((Float.hashCode(this.f12708a) * 31) + Float.hashCode(this.f12709b)) * 31) + Float.hashCode(this.f12710c);
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.f12708a + ", v2 = " + this.f12709b + ", v3 = " + this.f12710c;
    }
}
