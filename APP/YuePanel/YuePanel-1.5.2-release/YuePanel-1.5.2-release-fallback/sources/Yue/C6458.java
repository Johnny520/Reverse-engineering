package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6458 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f22757 = "TwilightManager";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f22758 = 6;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f22759 = 22;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Yue.C6458 f22760;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f22761;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final android.location.LocationManager f22762;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C6458.C6459 f22763;

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۢ$ۥ, reason: contains not printable characters */
    public static class C6459 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean f22764;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public long f22765;

        public C6459() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    @Yue.InterfaceC6959
    public C6458(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 android.location.LocationManager r3) {
            r1 = this;
            r1.<init>()
            Yue.ۥۣۢۢۢ$ۥ r0 = new Yue.ۥۣۢۢۢ$ۥ
            r0.<init>()
            r1.f22763 = r0
            r1.f22761 = r2
            r1.f22762 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.C6458 m23782(@Yue.InterfaceC4410 android.content.Context r2) {
            Yue.ۥۣۢۢۢ r0 = Yue.C6458.f22760
            if (r0 != 0) goto L17
            android.content.Context r2 = r2.getApplicationContext()
            Yue.ۥۣۢۢۢ r0 = new Yue.ۥۣۢۢۢ
            java.lang.String r1 = "location"
            java.lang.Object r1 = r2.getSystemService(r1)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            r0.<init>(r2, r1)
            Yue.C6458.f22760 = r0
        L17:
            Yue.ۥۣۢۢۢ r2 = Yue.C6458.f22760
            return r2
    }

    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m23783(Yue.C6458 r0) {
            Yue.C6458.f22760 = r0
            return
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final android.location.Location m23784() {
            r6 = this;
            android.content.Context r0 = r6.f22761
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = Yue.C4749.m18943(r0, r1)
            r1 = 0
            if (r0 != 0) goto L12
            java.lang.String r0 = "network"
            android.location.Location r0 = r6.m23785(r0)
            goto L13
        L12:
            r0 = r1
        L13:
            android.content.Context r2 = r6.f22761
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            int r2 = Yue.C4749.m18943(r2, r3)
            if (r2 != 0) goto L23
            java.lang.String r1 = "gps"
            android.location.Location r1 = r6.m23785(r1)
        L23:
            if (r1 == 0) goto L35
            if (r0 == 0) goto L35
            long r2 = r1.getTime()
            long r4 = r0.getTime()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L34
            r0 = r1
        L34:
            return r0
        L35:
            if (r1 == 0) goto L38
            r0 = r1
        L38:
            return r0
    }

    @Yue.InterfaceC5344(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final android.location.Location m23785(java.lang.String r3) {
            r2 = this;
            android.location.LocationManager r0 = r2.f22762     // Catch: java.lang.Exception -> Lf
            boolean r0 = r0.isProviderEnabled(r3)     // Catch: java.lang.Exception -> Lf
            if (r0 == 0) goto L17
            android.location.LocationManager r0 = r2.f22762     // Catch: java.lang.Exception -> Lf
            android.location.Location r3 = r0.getLastKnownLocation(r3)     // Catch: java.lang.Exception -> Lf
            return r3
        Lf:
            r3 = move-exception
            java.lang.String r0 = "TwilightManager"
            java.lang.String r1 = "Failed to get last known location"
            android.util.Log.d(r0, r1, r3)
        L17:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m23786() {
            r2 = this;
            Yue.ۥۣۢۢۢ$ۥ r0 = r2.f22763
            boolean r1 = r2.m23787()
            if (r1 == 0) goto Lb
            boolean r0 = r0.f22764
            return r0
        Lb:
            android.location.Location r1 = r2.m23784()
            if (r1 == 0) goto L17
            r2.m23788(r1)
            boolean r0 = r0.f22764
            return r0
        L17:
            java.lang.String r0 = "TwilightManager"
            java.lang.String r1 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."
            android.util.Log.i(r0, r1)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 11
            int r0 = r0.get(r1)
            r1 = 6
            if (r0 < r1) goto L32
            r1 = 22
            if (r0 < r1) goto L30
            goto L32
        L30:
            r0 = 0
            goto L33
        L32:
            r0 = 1
        L33:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m23787() {
            r4 = this;
            Yue.ۥۣۢۢۢ$ۥ r0 = r4.f22763
            long r0 = r0.f22765
            long r2 = java.lang.System.currentTimeMillis()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m23788(@Yue.InterfaceC4410 android.location.Location r20) {
            r19 = this;
            r0 = r19
            Yue.ۥۣۢۢۢ$ۥ r1 = r0.f22763
            long r9 = java.lang.System.currentTimeMillis()
            Yue.ۥۢۢۢۢ r11 = Yue.C6457.m23780()
            r12 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r9 - r12
            double r5 = r20.getLatitude()
            double r7 = r20.getLongitude()
            r2 = r11
            r2.m23781(r3, r5, r7)
            double r5 = r20.getLatitude()
            double r7 = r20.getLongitude()
            r3 = r9
            r2.m23781(r3, r5, r7)
            int r2 = r11.f22756
            r3 = 1
            if (r2 != r3) goto L30
        L2e:
            r14 = r3
            goto L32
        L30:
            r3 = 0
            goto L2e
        L32:
            long r7 = r11.f22755
            long r5 = r11.f22754
            long r3 = r9 + r12
            double r12 = r20.getLatitude()
            double r15 = r20.getLongitude()
            r2 = r11
            r17 = r5
            r5 = r12
            r12 = r7
            r7 = r15
            r2.m23781(r3, r5, r7)
            long r7 = r11.f22755
            r2 = -1
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L68
            int r2 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r2 != 0) goto L56
            goto L68
        L56:
            int r2 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r2 <= 0) goto L5b
            goto L63
        L5b:
            int r2 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r2 <= 0) goto L62
            r7 = r17
            goto L63
        L62:
            r7 = r12
        L63:
            r2 = 60000(0xea60, double:2.9644E-319)
            long r7 = r7 + r2
            goto L6d
        L68:
            r2 = 43200000(0x2932e00, double:2.1343636E-316)
            long r7 = r9 + r2
        L6d:
            r1.f22764 = r14
            r1.f22765 = r7
            return
    }
}
