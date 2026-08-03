package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3554 extends java.util.Random {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C3554.C3555 f11338 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final long f11339 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.AbstractC5185 f11340;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f11341;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۧۦ$ۥ, reason: contains not printable characters */
    public static final class C3555 {
        public C3555() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C3555(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥ۠ۦۧۦ$ۥ r0 = new Yue.ۥ۠ۦۧۦ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C3554.f11338 = r0
            return
    }

    public C3554(@Yue.InterfaceC4418 Yue.AbstractC5185 r2) {
            r1 = this;
            java.lang.String r0 = "impl"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f11340 = r2
            return
    }

    @Override // java.util.Random
    public int next(int r2) {
            r1 = this;
            Yue.ۥۡۥۨۤ r0 = r1.f11340
            int r2 = r0.mo435(r2)
            return r2
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
            r1 = this;
            Yue.ۥۡۥۨۤ r0 = r1.f11340
            boolean r0 = r0.mo436()
            return r0
    }

    @Override // java.util.Random
    public void nextBytes(@Yue.InterfaceC4418 byte[] r2) {
            r1 = this;
            java.lang.String r0 = "bytes"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۡۥۨۤ r0 = r1.f11340
            r0.mo437(r2)
            return
    }

    @Override // java.util.Random
    public double nextDouble() {
            r2 = this;
            Yue.ۥۡۥۨۤ r0 = r2.f11340
            double r0 = r0.mo438()
            return r0
    }

    @Override // java.util.Random
    public float nextFloat() {
            r1 = this;
            Yue.ۥۡۥۨۤ r0 = r1.f11340
            float r0 = r0.mo439()
            return r0
    }

    @Override // java.util.Random
    public int nextInt() {
            r1 = this;
            Yue.ۥۡۥۨۤ r0 = r1.f11340
            int r0 = r0.mo440()
            return r0
    }

    @Override // java.util.Random
    public int nextInt(int r2) {
            r1 = this;
            Yue.ۥۡۥۨۤ r0 = r1.f11340
            int r2 = r0.mo441(r2)
            return r2
    }

    @Override // java.util.Random
    public long nextLong() {
            r2 = this;
            Yue.ۥۡۥۨۤ r0 = r2.f11340
            long r0 = r0.mo442()
            return r0
    }

    @Override // java.util.Random
    public void setSeed(long r1) {
            r0 = this;
            boolean r1 = r0.f11341
            if (r1 != 0) goto L8
            r1 = 1
            r0.f11341 = r1
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Setting seed is not supported."
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.AbstractC5185 m14478() {
            r1 = this;
            Yue.ۥۡۥۨۤ r0 = r1.f11340
            return r0
    }
}
