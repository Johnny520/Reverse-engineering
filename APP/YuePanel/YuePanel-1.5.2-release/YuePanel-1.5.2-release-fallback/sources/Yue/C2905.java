package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
public class C2905 extends Yue.AbstractC2887 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f9359 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f9360 = 32;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f9361 = 33;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f9362 = 64;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f9363 = -87;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f9364 = 64;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f9365 = 24;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f9366 = 193;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f9367 = 200;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f9368 = 200;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f9369 = 35;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final android.location.GpsStatus f9370;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @Yue.InterfaceC2947("mWrapped")
    public int f9371;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @Yue.InterfaceC2947("mWrapped")
    public java.util.Iterator<android.location.GpsSatellite> f9372;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    @Yue.InterfaceC2947("mWrapped")
    public int f9373;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    @Yue.InterfaceC2947("mWrapped")
    public android.location.GpsSatellite f9374;

    public C2905(android.location.GpsStatus r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r2 = Yue.C4868.m19181(r2)
            android.location.GpsStatus r2 = (android.location.GpsStatus) r2
            r1.f9370 = r2
            r0 = -1
            r1.f9371 = r0
            java.lang.Iterable r2 = r2.getSatellites()
            java.util.Iterator r2 = r2.iterator()
            r1.f9372 = r2
            r1.f9373 = r0
            r2 = 0
            r1.f9374 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static int m12407(int r2) {
            if (r2 <= 0) goto L8
            r0 = 32
            if (r2 > r0) goto L8
            r2 = 1
            return r2
        L8:
            r0 = 33
            r1 = 64
            if (r2 < r0) goto L12
            if (r2 > r1) goto L12
            r2 = 2
            return r2
        L12:
            if (r2 <= r1) goto L1a
            r0 = 88
            if (r2 > r0) goto L1a
            r2 = 3
            return r2
        L1a:
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 <= r0) goto L24
            r1 = 235(0xeb, float:3.3E-43)
            if (r2 > r1) goto L24
            r2 = 5
            return r2
        L24:
            r1 = 193(0xc1, float:2.7E-43)
            if (r2 < r1) goto L2c
            if (r2 > r0) goto L2c
            r2 = 4
            return r2
        L2c:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static int m12408(int r2) {
            int r0 = m12407(r2)
            r1 = 2
            if (r0 == r1) goto L14
            r1 = 3
            if (r0 == r1) goto L11
            r1 = 5
            if (r0 == r1) goto Le
            goto L16
        Le:
            int r2 = r2 + (-200)
            goto L16
        L11:
            int r2 = r2 + (-64)
            goto L16
        L14:
            int r2 = r2 + 87
        L16:
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof Yue.C2905
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            Yue.ۥۣ۠ۧ۠ r2 = (Yue.C2905) r2
            android.location.GpsStatus r0 = r1.f9370
            android.location.GpsStatus r2 = r2.f9370
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            android.location.GpsStatus r0 = r1.f9370
            int r0 = r0.hashCode()
            return r0
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ */
    public float mo12367(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.m12409(r1)
            float r1 = r1.getAzimuth()
            return r1
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟ */
    public float mo12368(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟۟ */
    public float mo12369(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public float mo12370(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.m12409(r1)
            float r1 = r1.getSnr()
            return r1
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public int mo12371(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.m12409(r1)
            int r1 = r1.getPrn()
            int r1 = m12407(r1)
            return r1
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public float mo12372(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.m12409(r1)
            float r1 = r1.getElevation()
            return r1
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public int mo12373() {
            r3 = this;
            android.location.GpsStatus r0 = r3.f9370
            monitor-enter(r0)
            int r1 = r3.f9371     // Catch: java.lang.Throwable -> L25
            r2 = -1
            if (r1 != r2) goto L2d
            android.location.GpsStatus r1 = r3.f9370     // Catch: java.lang.Throwable -> L25
            java.lang.Iterable r1 = r1.getSatellites()     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L25
        L12:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L25
            android.location.GpsSatellite r2 = (android.location.GpsSatellite) r2     // Catch: java.lang.Throwable -> L25
            int r2 = r3.f9371     // Catch: java.lang.Throwable -> L25
            int r2 = r2 + 1
            r3.f9371 = r2     // Catch: java.lang.Throwable -> L25
            goto L12
        L25:
            r1 = move-exception
            goto L31
        L27:
            int r1 = r3.f9371     // Catch: java.lang.Throwable -> L25
            int r1 = r1 + 1
            r3.f9371 = r1     // Catch: java.lang.Throwable -> L25
        L2d:
            int r1 = r3.f9371     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return r1
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r1
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public int mo12374(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.m12409(r1)
            int r1 = r1.getPrn()
            int r1 = m12408(r1)
            return r1
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public boolean mo12375(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.m12409(r1)
            boolean r1 = r1.hasAlmanac()
            return r1
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public boolean mo12376(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public boolean mo12377(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public boolean mo12378(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.m12409(r1)
            boolean r1 = r1.hasEphemeris()
            return r1
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public boolean mo12379(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.m12409(r1)
            boolean r1 = r1.usedInFix()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final android.location.GpsSatellite m12409(int r3) {
            r2 = this;
            android.location.GpsStatus r0 = r2.f9370
            monitor-enter(r0)
            int r1 = r2.f9373     // Catch: java.lang.Throwable -> L17
            if (r3 >= r1) goto L19
            android.location.GpsStatus r1 = r2.f9370     // Catch: java.lang.Throwable -> L17
            java.lang.Iterable r1 = r1.getSatellites()     // Catch: java.lang.Throwable -> L17
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L17
            r2.f9372 = r1     // Catch: java.lang.Throwable -> L17
            r1 = -1
            r2.f9373 = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r3 = move-exception
            goto L42
        L19:
            int r1 = r2.f9373     // Catch: java.lang.Throwable -> L17
            if (r1 >= r3) goto L38
            int r1 = r1 + 1
            r2.f9373 = r1     // Catch: java.lang.Throwable -> L17
            java.util.Iterator<android.location.GpsSatellite> r1 = r2.f9372     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.hasNext()     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2d
            r3 = 0
            r2.f9374 = r3     // Catch: java.lang.Throwable -> L17
            goto L38
        L2d:
            java.util.Iterator<android.location.GpsSatellite> r1 = r2.f9372     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L17
            android.location.GpsSatellite r1 = (android.location.GpsSatellite) r1     // Catch: java.lang.Throwable -> L17
            r2.f9374 = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L38:
            android.location.GpsSatellite r3 = r2.f9374     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r3 = Yue.C4868.m19181(r3)
            android.location.GpsSatellite r3 = (android.location.GpsSatellite) r3
            return r3
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
    }
}
