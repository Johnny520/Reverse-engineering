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
    public final float m592a(long r9) {
        if (r9 >= this.f439e) goto L5;
        return 0.0f;
    L5:
        long r4 = this.f441g;
        if (r4 < 0) goto L13;
        if (r9 < r4) goto L13;
        float r02 = this.f442h;
        return (ViewOnTouchListenerC0218g.m606b((r9 - r4) / this.f443i, 0.0f, 1.0f) * r02) + (1.0f - r02);
    L13:
        return ViewOnTouchListenerC0218g.m606b((r9 - r0) / this.f435a, 0.0f, 1.0f) * 0.5f;
    }
}
