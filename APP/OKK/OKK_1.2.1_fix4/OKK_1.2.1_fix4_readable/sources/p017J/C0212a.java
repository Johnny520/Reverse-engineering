package p017J;

/* JADX INFO: renamed from: J.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0212a {

    /* JADX INFO: renamed from: a */
    public int f435a;

    /* JADX INFO: renamed from: b */
    public int f436b;

    /* JADX INFO: renamed from: c */
    public float f437c;

    /* JADX INFO: renamed from: d */
    public float f438d;

    /* JADX INFO: renamed from: e */
    public long f439e;

    /* JADX INFO: renamed from: f */
    public long f440f;

    /* JADX INFO: renamed from: g */
    public long f441g;

    /* JADX INFO: renamed from: h */
    public float f442h;

    /* JADX INFO: renamed from: i */
    public int f443i;

    /* JADX INFO: renamed from: a */
    public final float m592a(long j2) {
        if (j2 < this.f439e) {
            return 0.0f;
        }
        long j3 = this.f441g;
        if (j3 < 0 || j2 < j3) {
            return ViewOnTouchListenerC0218g.m606b((j2 - r0) / this.f435a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.f442h;
        return (ViewOnTouchListenerC0218g.m606b((j2 - j3) / this.f443i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
