package p000;

/* JADX INFO: renamed from: h7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0288h7 {

    /* JADX INFO: renamed from: a */
    public int f2121a;

    /* JADX INFO: renamed from: b */
    public int f2122b;

    /* JADX INFO: renamed from: c */
    public float f2123c;

    /* JADX INFO: renamed from: d */
    public float f2124d;

    /* JADX INFO: renamed from: e */
    public long f2125e;

    /* JADX INFO: renamed from: f */
    public long f2126f;

    /* JADX INFO: renamed from: g */
    public long f2127g;

    /* JADX INFO: renamed from: h */
    public float f2128h;

    /* JADX INFO: renamed from: i */
    public int f2129i;

    /* JADX INFO: renamed from: a */
    public final float m1358a(long j) {
        if (j < this.f2125e) {
            return 0.0f;
        }
        long j2 = this.f2127g;
        if (j2 < 0 || j < j2) {
            return ViewOnTouchListenerC0606pr.m2092b((j - r0) / this.f2121a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f2128h;
        return (ViewOnTouchListenerC0606pr.m2092b((j - j2) / this.f2129i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
