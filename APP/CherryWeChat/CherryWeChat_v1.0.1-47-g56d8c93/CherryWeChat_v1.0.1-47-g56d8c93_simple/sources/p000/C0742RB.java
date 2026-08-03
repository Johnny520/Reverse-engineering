package p000;

/* JADX INFO: renamed from: RB */
/* JADX INFO: loaded from: classes.dex */
public final class C0742RB {

    /* JADX INFO: renamed from: d */
    public static C0742RB f2370d;

    /* JADX INFO: renamed from: a */
    public long f2371a;

    /* JADX INFO: renamed from: b */
    public long f2372b;

    /* JADX INFO: renamed from: c */
    public int f2373c;

    /* JADX INFO: renamed from: a */
    public final void m1536a(double r15, double r17, long r19) {
        double r4 = (0.01720197f * ((r19 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double r8 = (((Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + ((Math.sin(2.0f * r3) * 3.4906598739326E-4d) + ((Math.sin(r4) * 0.03341960161924362d) + r4))) + 1.796593063d) + 3.141592653589793d;
        double r2 = (Math.sin(2.0d * r8) * (-0.0069d)) + ((Math.sin(r4) * 0.0053d) + (((double) (Math.round(((double) (r2 - 9.0E-4f)) - r6) + 9.0E-4f)) + ((-r17) / 360.0d)));
        double r42 = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(r8));
        double r6 = 0.01745329238474369d * r15;
        double r82 = (Math.sin(-0.10471975803375244d) - (Math.sin(r42) * Math.sin(r6))) / (Math.cos(r42) * Math.cos(r6));
        if (r82 < 1.0d) goto L7;
        this.f2373c = 1;
        this.f2371a = -1;
        this.f2372b = -1;
        return;
    L7:
        if (r82 > (-1.0d)) goto L10;
        this.f2373c = 0;
        this.f2371a = -1;
        this.f2372b = -1;
        return;
    L10:
        double r62 = (float) (Math.acos(r82) / 6.283185307179586d);
        this.f2371a = Math.round((r2 + r62) * 8.64E7d) + 946728000000L;
        long r22 = Math.round((r2 - r62) * 8.64E7d) + 946728000000L;
        this.f2372b = r22;
        if (r22 < r19) goto L13;
    L16:
        this.f2373c = 1;
        return;
    L13:
        if (this.f2371a <= r19) goto L16;
        this.f2373c = 0;
    }
}
