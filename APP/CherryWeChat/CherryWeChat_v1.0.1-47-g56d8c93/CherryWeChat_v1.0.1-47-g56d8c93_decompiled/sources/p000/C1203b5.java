package p000;

/* JADX INFO: renamed from: b5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1203b5 {

    /* JADX INFO: renamed from: a */
    public int f4116a;

    /* JADX INFO: renamed from: b */
    public int f4117b;

    /* JADX INFO: renamed from: c */
    public float f4118c;

    /* JADX INFO: renamed from: d */
    public float f4119d;

    /* JADX INFO: renamed from: e */
    public long f4120e;

    /* JADX INFO: renamed from: f */
    public long f4121f;

    /* JADX INFO: renamed from: g */
    public long f4122g;

    /* JADX INFO: renamed from: h */
    public float f4123h;

    /* JADX INFO: renamed from: i */
    public int f4124i;

    /* JADX INFO: renamed from: a */
    public final float m2323a(long j) {
        if (j < this.f4120e) {
            return 0.0f;
        }
        long j2 = this.f4122g;
        if (j2 < 0 || j < j2) {
            return ViewOnTouchListenerC0504Lo.m984b((j - r0) / this.f4116a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f4123h;
        return (ViewOnTouchListenerC0504Lo.m984b((j - j2) / this.f4124i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
