package p000;

/* JADX INFO: renamed from: x6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0882x6 {

    /* JADX INFO: renamed from: a */
    public int f5104a;

    /* JADX INFO: renamed from: b */
    public int f5105b;

    /* JADX INFO: renamed from: c */
    public float f5106c;

    /* JADX INFO: renamed from: d */
    public float f5107d;

    /* JADX INFO: renamed from: e */
    public long f5108e;

    /* JADX INFO: renamed from: f */
    public long f5109f;

    /* JADX INFO: renamed from: g */
    public long f5110g;

    /* JADX INFO: renamed from: h */
    public float f5111h;

    /* JADX INFO: renamed from: i */
    public int f5112i;

    /* JADX INFO: renamed from: a */
    public final float m2613a(long j) {
        if (j < this.f5108e) {
            return 0.0f;
        }
        long j2 = this.f5110g;
        if (j2 < 0 || j < j2) {
            return ViewOnTouchListenerC0458lr.m1761b((j - r0) / this.f5104a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f5111h;
        return (ViewOnTouchListenerC0458lr.m1761b((j - j2) / this.f5112i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
