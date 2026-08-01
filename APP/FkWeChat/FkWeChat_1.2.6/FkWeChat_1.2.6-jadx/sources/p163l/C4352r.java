package p163l;

/* JADX INFO: renamed from: l.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4352r extends AbstractC4357s {

    /* JADX INFO: renamed from: a */
    public float f12753a;

    /* JADX INFO: renamed from: b */
    public float f12754b;

    /* JADX INFO: renamed from: c */
    public float f12755c;

    /* JADX INFO: renamed from: d */
    public float f12756d;

    /* JADX INFO: renamed from: e */
    public final int f12757e;

    public C4352r(float f10, float f11, float f12, float f13) {
        super(null);
        this.f12753a = f10;
        this.f12754b = f11;
        this.f12755c = f12;
        this.f12756d = f13;
        this.f12757e = 4;
    }

    @Override // p163l.AbstractC4357s
    /* JADX INFO: renamed from: a */
    public float mo17032a(int i10) {
        if (i10 == 0) {
            return this.f12753a;
        }
        if (i10 == 1) {
            return this.f12754b;
        }
        if (i10 == 2) {
            return this.f12755c;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f12756d;
    }

    @Override // p163l.AbstractC4357s
    /* JADX INFO: renamed from: b */
    public int mo17033b() {
        return this.f12757e;
    }

    @Override // p163l.AbstractC4357s
    /* JADX INFO: renamed from: d */
    public void mo17035d() {
        this.f12753a = 0.0f;
        this.f12754b = 0.0f;
        this.f12755c = 0.0f;
        this.f12756d = 0.0f;
    }

    @Override // p163l.AbstractC4357s
    /* JADX INFO: renamed from: e */
    public void mo17036e(int i10, float f10) {
        if (i10 == 0) {
            this.f12753a = f10;
            return;
        }
        if (i10 == 1) {
            this.f12754b = f10;
        } else if (i10 == 2) {
            this.f12755c = f10;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f12756d = f10;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4352r)) {
            return false;
        }
        C4352r c4352r = (C4352r) obj;
        return c4352r.f12753a == this.f12753a && c4352r.f12754b == this.f12754b && c4352r.f12755c == this.f12755c && c4352r.f12756d == this.f12756d;
    }

    /* JADX INFO: renamed from: f */
    public final float m17107f() {
        return this.f12753a;
    }

    /* JADX INFO: renamed from: g */
    public final float m17108g() {
        return this.f12754b;
    }

    /* JADX INFO: renamed from: h */
    public final float m17109h() {
        return this.f12755c;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f12753a) * 31) + Float.hashCode(this.f12754b)) * 31) + Float.hashCode(this.f12755c)) * 31) + Float.hashCode(this.f12756d);
    }

    /* JADX INFO: renamed from: i */
    public final float m17110i() {
        return this.f12756d;
    }

    @Override // p163l.AbstractC4357s
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C4352r mo17034c() {
        return new C4352r(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f12753a + ", v2 = " + this.f12754b + ", v3 = " + this.f12755c + ", v4 = " + this.f12756d;
    }
}
