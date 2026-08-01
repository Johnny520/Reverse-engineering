package p163l;

/* JADX INFO: renamed from: l.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4342p extends AbstractC4357s {

    /* JADX INFO: renamed from: a */
    public float f12693a;

    /* JADX INFO: renamed from: b */
    public float f12694b;

    /* JADX INFO: renamed from: c */
    public final int f12695c;

    public C4342p(float f10, float f11) {
        super(null);
        this.f12693a = f10;
        this.f12694b = f11;
        this.f12695c = 2;
    }

    @Override // p163l.AbstractC4357s
    /* JADX INFO: renamed from: a */
    public float mo17032a(int i10) {
        if (i10 == 0) {
            return this.f12693a;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f12694b;
    }

    @Override // p163l.AbstractC4357s
    /* JADX INFO: renamed from: b */
    public int mo17033b() {
        return this.f12695c;
    }

    @Override // p163l.AbstractC4357s
    /* JADX INFO: renamed from: d */
    public void mo17035d() {
        this.f12693a = 0.0f;
        this.f12694b = 0.0f;
    }

    @Override // p163l.AbstractC4357s
    /* JADX INFO: renamed from: e */
    public void mo17036e(int i10, float f10) {
        if (i10 == 0) {
            this.f12693a = f10;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f12694b = f10;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4342p)) {
            return false;
        }
        C4342p c4342p = (C4342p) obj;
        return c4342p.f12693a == this.f12693a && c4342p.f12694b == this.f12694b;
    }

    /* JADX INFO: renamed from: f */
    public final float m17045f() {
        return this.f12693a;
    }

    /* JADX INFO: renamed from: g */
    public final float m17046g() {
        return this.f12694b;
    }

    @Override // p163l.AbstractC4357s
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C4342p mo17034c() {
        return new C4342p(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.hashCode(this.f12693a) * 31) + Float.hashCode(this.f12694b);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f12693a + ", v2 = " + this.f12694b;
    }
}
