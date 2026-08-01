package p006D;

/* JADX INFO: renamed from: D.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0072a {

    /* JADX INFO: renamed from: a */
    public int f326a;

    /* JADX INFO: renamed from: b */
    public int f327b;

    /* JADX INFO: renamed from: c */
    public float f328c;

    /* JADX INFO: renamed from: d */
    public float f329d;

    /* JADX INFO: renamed from: e */
    public long f330e;

    /* JADX INFO: renamed from: f */
    public long f331f;

    /* JADX INFO: renamed from: g */
    public long f332g;

    /* JADX INFO: renamed from: h */
    public float f333h;

    /* JADX INFO: renamed from: i */
    public int f334i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final float m154a(long j2) {
        if (j2 < this.f330e) {
            return 0.0f;
        }
        long j3 = this.f332g;
        if (j3 < 0 || j2 < j3) {
            return ViewOnTouchListenerC0081j.m215b((j2 - r0) / this.f326a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f333h;
        return (ViewOnTouchListenerC0081j.m215b((j2 - j3) / this.f334i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
