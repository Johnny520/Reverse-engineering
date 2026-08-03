package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@Yue.InterfaceC5336(24)
public class C2890 extends Yue.AbstractC2887 {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final android.location.GnssStatus f9324;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۦ۠$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static class C2891 {
        public C2891() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static float m12384(android.location.GnssStatus r0, int r1) {
                float r0 = r0.getCarrierFrequencyHz(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static boolean m12385(android.location.GnssStatus r0, int r1) {
                boolean r0 = r0.hasCarrierFrequencyHz(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۦ۠$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(30)
    public static class C2892 {
        public C2892() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static float m12386(android.location.GnssStatus r0, int r1) {
                float r0 = r0.getBasebandCn0DbHz(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static boolean m12387(android.location.GnssStatus r0, int r1) {
                boolean r0 = r0.hasBasebandCn0DbHz(r1)
                return r0
        }
    }

    public C2890(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            android.location.GnssStatus r1 = (android.location.GnssStatus) r1
            java.lang.Object r1 = Yue.C4868.m19181(r1)
            android.location.GnssStatus r1 = (android.location.GnssStatus) r1
            r0.f9324 = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof Yue.C2890
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            Yue.ۥۣ۠ۦ۠ r2 = (Yue.C2890) r2
            android.location.GnssStatus r0 = r1.f9324
            android.location.GnssStatus r2 = r2.f9324
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            android.location.GnssStatus r0 = r1.f9324
            int r0 = r0.hashCode()
            return r0
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ */
    public float mo12367(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.f9324
            float r2 = r0.getAzimuthDegrees(r2)
            return r2
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟ */
    public float mo12368(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Ld
            android.location.GnssStatus r0 = r2.f9324
            float r3 = Yue.C2890.C2892.m12386(r0, r3)
            return r3
        Ld:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟۟ */
    public float mo12369(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.f9324
            float r2 = Yue.C2890.C2891.m12384(r0, r2)
            return r2
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public float mo12370(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.f9324
            float r2 = r0.getCn0DbHz(r2)
            return r2
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public int mo12371(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.f9324
            int r2 = r0.getConstellationType(r2)
            return r2
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public float mo12372(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.f9324
            float r2 = r0.getElevationDegrees(r2)
            return r2
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public int mo12373() {
            r1 = this;
            android.location.GnssStatus r0 = r1.f9324
            int r0 = r0.getSatelliteCount()
            return r0
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public int mo12374(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.f9324
            int r2 = r0.getSvid(r2)
            return r2
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public boolean mo12375(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.f9324
            boolean r2 = r0.hasAlmanacData(r2)
            return r2
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public boolean mo12376(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Ld
            android.location.GnssStatus r0 = r2.f9324
            boolean r3 = Yue.C2890.C2892.m12387(r0, r3)
            return r3
        Ld:
            r3 = 0
            return r3
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public boolean mo12377(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.f9324
            boolean r2 = Yue.C2890.C2891.m12385(r0, r2)
            return r2
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public boolean mo12378(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.f9324
            boolean r2 = r0.hasEphemerisData(r2)
            return r2
    }

    @Override // Yue.AbstractC2887
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public boolean mo12379(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.f9324
            boolean r2 = r0.usedInFix(r2)
            return r2
    }
}
