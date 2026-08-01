package p163l;

/* JADX INFO: renamed from: l.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4337o extends AbstractC4357s {

    /* JADX INFO: renamed from: a */
    public float f12685a;

    /* JADX INFO: renamed from: b */
    public final int f12686b;

    public C4337o(float f10) {
        super(null);
        this.f12685a = f10;
        this.f12686b = 1;
    }

    @Override // p163l.AbstractC4357s
    /* JADX INFO: renamed from: a */
    public float mo17032a(int i10) {
        if (i10 == 0) {
            return this.f12685a;
        }
        return 0.0f;
    }

    @Override // p163l.AbstractC4357s
    /* JADX INFO: renamed from: b */
    public int mo17033b() {
        return this.f12686b;
    }

    @Override // p163l.AbstractC4357s
    /* JADX INFO: renamed from: d */
    public void mo17035d() {
        this.f12685a = 0.0f;
    }

    @Override // p163l.AbstractC4357s
    /* JADX INFO: renamed from: e */
    public void mo17036e(int i10, float f10) {
        if (i10 == 0) {
            this.f12685a = f10;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4337o) && ((C4337o) obj).f12685a == this.f12685a;
    }

    /* JADX INFO: renamed from: f */
    public final float m17037f() {
        return this.f12685a;
    }

    @Override // p163l.AbstractC4357s
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C4337o mo17034c() {
        return new C4337o(0.0f);
    }

    public int hashCode() {
        return Float.hashCode(this.f12685a);
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.f12685a;
    }
}
