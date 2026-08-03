package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class bm {
    public static android.os.Handler a = null;
    public static android.os.HandlerThread b = null;
    private static final java.lang.String c = "check_wifi_permission";
    private static final java.lang.String d = "check_bs_permission";
    private static final java.lang.String e = "check_gps_permission";
    private static final int f = 1;
    private static final int g = 2;
    private static final int h = 3;
    private static final int i = 4;
    private static final long j = 600000;
    private static volatile com.tendcloud.tenddata.bm k;
    private static android.net.wifi.WifiManager l;


    static {
            com.tendcloud.tenddata.z r0 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> Lb
            com.tendcloud.tenddata.bm r1 = a()     // Catch: java.lang.Throwable -> Lb
            r0.register(r1)     // Catch: java.lang.Throwable -> Lb
        Lb:
            return
    }

    private bm() {
            r3 = this;
            r3.<init>()
            android.os.HandlerThread r0 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "locHandlerThread"
            r2 = 10
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L24
            com.tendcloud.tenddata.bm.b = r0     // Catch: java.lang.Throwable -> L24
            r0.start()     // Catch: java.lang.Throwable -> L24
            com.tendcloud.tenddata.bm$1 r0 = new com.tendcloud.tenddata.bm$1     // Catch: java.lang.Throwable -> L24
            android.os.HandlerThread r1 = com.tendcloud.tenddata.bm.b     // Catch: java.lang.Throwable -> L24
            android.os.Looper r1 = r1.getLooper()     // Catch: java.lang.Throwable -> L24
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L24
            com.tendcloud.tenddata.bm.a = r0     // Catch: java.lang.Throwable -> L24
            r0 = 4
            r1 = 0
            r3.a(r0, r1)     // Catch: java.lang.Throwable -> L24
        L24:
            return
    }

    public static com.tendcloud.tenddata.bm a() {
            com.tendcloud.tenddata.bm r0 = com.tendcloud.tenddata.bm.k
            if (r0 != 0) goto L17
            java.lang.Class<com.tendcloud.tenddata.bm> r0 = com.tendcloud.tenddata.bm.class
            monitor-enter(r0)
            com.tendcloud.tenddata.bm r1 = com.tendcloud.tenddata.bm.k     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.tendcloud.tenddata.bm r1 = new com.tendcloud.tenddata.bm     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.tendcloud.tenddata.bm.k = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.tendcloud.tenddata.bm r0 = com.tendcloud.tenddata.bm.k
            return r0
    }

    public static /* synthetic */ void a(com.tendcloud.tenddata.bm r0) {
            r0.c()
            return
    }

    private void b() {
            r4 = this;
            java.lang.String r0 = "check_wifi_permission"
            boolean r0 = r4.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L10
            r0 = 1
            r1 = 180000(0x2bf20, double:8.8932E-319)
            r4.a(r0, r1)     // Catch: java.lang.Throwable -> L35
            return
        L10:
            android.content.Context r0 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "wifi"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L35
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch: java.lang.Throwable -> L35
            com.tendcloud.tenddata.bm.l = r0     // Catch: java.lang.Throwable -> L35
            boolean r0 = r0.isWifiEnabled()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L35
            com.tendcloud.tenddata.br r0 = new com.tendcloud.tenddata.br     // Catch: java.lang.Throwable -> L35
            android.net.wifi.WifiManager r1 = com.tendcloud.tenddata.bm.l     // Catch: java.lang.Throwable -> L35
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L35
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L35
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "android.net.wifi.SCAN_RESULTS"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L35
            r1.registerReceiver(r0, r2)     // Catch: java.lang.Throwable -> L35
        L35:
            return
    }

    public static /* synthetic */ void b(com.tendcloud.tenddata.bm r0) {
            r0.b()
            return
    }

    @android.annotation.TargetApi(23)
    private void c() {
            r3 = this;
            java.lang.String r0 = "check_bs_permission"
            boolean r0 = r3.a(r0)     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto L10
            r0 = 3
            r1 = 180000(0x2bf20, double:8.8932E-319)
            r3.a(r0, r1)     // Catch: java.lang.Throwable -> L33
            return
        L10:
            android.content.Context r0 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L33
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L33
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Throwable -> L33
            int r1 = r0.getSimState()     // Catch: java.lang.Throwable -> L33
            r2 = 5
            if (r1 != r2) goto L33
            r0.getCellLocation()     // Catch: java.lang.Throwable -> L33
            com.tendcloud.tenddata.bq r1 = new com.tendcloud.tenddata.bq     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
            r2 = 16
            r0.listen(r1, r2)     // Catch: java.lang.Throwable -> L33
            android.telephony.CellLocation.requestLocationUpdate()     // Catch: java.lang.Throwable -> L33
        L33:
            return
    }

    public void a(int r2, long r3) {
            r1 = this;
            android.os.Message r0 = android.os.Message.obtain()     // Catch: java.lang.Throwable -> Lb
            r0.what = r2     // Catch: java.lang.Throwable -> Lb
            android.os.Handler r2 = com.tendcloud.tenddata.bm.a     // Catch: java.lang.Throwable -> Lb
            r2.sendMessageDelayed(r0, r3)     // Catch: java.lang.Throwable -> Lb
        Lb:
            return
    }

    public boolean a(java.lang.String r10) {
            r9 = this;
            r0 = 0
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            boolean r1 = com.tendcloud.tenddata.y.b(r1, r2)     // Catch: java.lang.Throwable -> L79
            android.content.Context r2 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r2 = com.tendcloud.tenddata.y.b(r2, r3)     // Catch: java.lang.Throwable -> L79
            r3 = 1
            if (r2 != 0) goto L21
            android.content.Context r2 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r2 = com.tendcloud.tenddata.y.b(r2, r4)     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L1f
            goto L21
        L1f:
            r2 = r0
            goto L22
        L21:
            r2 = r3
        L22:
            android.content.Context r4 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = "android.permission.ACCESS_WIFI_STATE"
            boolean r4 = com.tendcloud.tenddata.y.b(r4, r5)     // Catch: java.lang.Throwable -> L79
            r5 = -1
            int r6 = r10.hashCode()     // Catch: java.lang.Throwable -> L79
            r7 = -1215157370(0xffffffffb7922b86, float:-1.7424823E-5)
            r8 = 2
            if (r6 == r7) goto L54
            r7 = 1219872770(0x48b5c802, float:372288.06)
            if (r6 == r7) goto L4a
            r7 = 1355887771(0x50d1349b, float:2.8079086E10)
            if (r6 == r7) goto L40
            goto L5d
        L40:
            java.lang.String r6 = "check_gps_permission"
            boolean r10 = r10.equals(r6)     // Catch: java.lang.Throwable -> L79
            if (r10 == 0) goto L5d
            r5 = r3
            goto L5d
        L4a:
            java.lang.String r6 = "check_wifi_permission"
            boolean r10 = r10.equals(r6)     // Catch: java.lang.Throwable -> L79
            if (r10 == 0) goto L5d
            r5 = r8
            goto L5d
        L54:
            java.lang.String r6 = "check_bs_permission"
            boolean r10 = r10.equals(r6)     // Catch: java.lang.Throwable -> L79
            if (r10 == 0) goto L5d
            r5 = r0
        L5d:
            if (r5 == 0) goto L74
            if (r5 == r3) goto L73
            if (r5 == r8) goto L64
            goto L79
        L64:
            r10 = 23
            boolean r10 = com.tendcloud.tenddata.y.a(r10)     // Catch: java.lang.Throwable -> L79
            if (r10 == 0) goto L72
            if (r4 == 0) goto L71
            if (r2 == 0) goto L71
            r0 = r3
        L71:
            return r0
        L72:
            return r4
        L73:
            return r2
        L74:
            if (r2 == 0) goto L79
            if (r1 == 0) goto L79
            r0 = r3
        L79:
            return r0
    }

    public final void onTDEBEventLocationEvent(com.tendcloud.tenddata.bs r1) {
            r0 = this;
            return
    }
}
