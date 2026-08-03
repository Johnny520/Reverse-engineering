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
    public final float m2323a(long r9) {
        if (r9 >= this.f4120e) goto L5;
        return 0.0f;
    L5:
        long r4 = this.f4122g;
        if (r4 < 0) goto L13;
        if (r9 < r4) goto L13;
        float r0 = this.f4123h;
        return (ViewOnTouchListenerC0504Lo.m984b((r9 - r4) / this.f4124i, 0.0f, 1.0f) * r0) + (1.0f - r0);
    L13:
        return ViewOnTouchListenerC0504Lo.m984b((r9 - r0) / this.f4116a, 0.0f, 1.0f) * 0.5f;
    }
}
