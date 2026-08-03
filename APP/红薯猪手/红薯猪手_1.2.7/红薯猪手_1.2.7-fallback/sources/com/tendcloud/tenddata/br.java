package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
final class br extends android.content.BroadcastReceiver {
    public com.tendcloud.tenddata.bb a;
    public java.util.ArrayList<android.net.wifi.ScanResult> b;
    public org.json.JSONArray c;
    public com.tendcloud.tenddata.ba d;
    public com.tendcloud.tenddata.ba e;
    public long f;
    public long g;
    private long h;
    private android.net.wifi.WifiManager i;


    public br(android.net.wifi.WifiManager r3) {
            r2 = this;
            r2.<init>()
            com.tendcloud.tenddata.bb r0 = new com.tendcloud.tenddata.bb
            r0.<init>()
            r2.a = r0
            r0 = 0
            r2.f = r0
            r2.g = r0
            r0 = 180000(0x2bf20, double:8.8932E-319)
            r2.h = r0
            r2.i = r3
            return
    }

    public static /* synthetic */ long a(com.tendcloud.tenddata.br r2) {
            long r0 = r2.h
            return r0
    }

    private com.tendcloud.tenddata.ba a(org.json.JSONArray r11) {
            r10 = this;
            if (r11 == 0) goto L3c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L8:
            int r2 = r11.length()
            if (r1 >= r2) goto L33
            org.json.JSONObject r2 = r11.getJSONObject(r1)     // Catch: java.lang.Throwable -> L30
            com.tendcloud.tenddata.ax r9 = new com.tendcloud.tenddata.ax     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "SSID"
            java.lang.String r4 = r2.getString(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "BSSID"
            java.lang.String r5 = r2.getString(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "level"
            int r2 = r2.getInt(r3)     // Catch: java.lang.Throwable -> L30
            byte r6 = (byte) r2     // Catch: java.lang.Throwable -> L30
            r7 = 0
            r8 = 0
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L30
            r0.add(r9)     // Catch: java.lang.Throwable -> L30
        L30:
            int r1 = r1 + 1
            goto L8
        L33:
            com.tendcloud.tenddata.ba r11 = new com.tendcloud.tenddata.ba
            r11.<init>()
            r11.setBsslist(r0)
            goto L3d
        L3c:
            r11 = 0
        L3d:
            return r11
    }

    private void a() {
            r2 = this;
            com.tendcloud.tenddata.bv r0 = new com.tendcloud.tenddata.bv     // Catch: java.lang.Throwable -> L18
            r0.<init>()     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "env"
            r0.b = r1     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "wifiUpdate"
            r0.c = r1     // Catch: java.lang.Throwable -> L18
            com.tendcloud.tenddata.a r1 = com.tendcloud.tenddata.a.ENV     // Catch: java.lang.Throwable -> L18
            r0.a = r1     // Catch: java.lang.Throwable -> L18
            com.tendcloud.tenddata.z r1 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> L18
            r1.post(r0)     // Catch: java.lang.Throwable -> L18
        L18:
            return
    }

    private com.tendcloud.tenddata.ba b() {
            r1 = this;
            org.json.JSONArray r0 = r1.c     // Catch: java.lang.Throwable -> L8
            com.tendcloud.tenddata.ba r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L8
            r1.d = r0     // Catch: java.lang.Throwable -> L8
        L8:
            com.tendcloud.tenddata.ba r0 = r1.d
            return r0
    }

    public static /* synthetic */ com.tendcloud.tenddata.ba b(com.tendcloud.tenddata.br r0) {
            com.tendcloud.tenddata.ba r0 = r0.b()
            return r0
    }

    private com.tendcloud.tenddata.ba c() {
            r5 = this;
            android.net.wifi.WifiManager r0 = r5.i     // Catch: java.lang.Throwable -> L69
            java.util.List r0 = r0.getScanResults()     // Catch: java.lang.Throwable -> L69
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L69
            r5.b = r0     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L69
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            r1 = 0
        L12:
            java.util.ArrayList<android.net.wifi.ScanResult> r2 = r5.b     // Catch: java.lang.Throwable -> L69
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L69
            if (r1 >= r2) goto L61
            java.util.ArrayList<android.net.wifi.ScanResult> r2 = r5.b     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L69
            android.net.wifi.ScanResult r2 = (android.net.wifi.ScanResult) r2     // Catch: java.lang.Throwable -> L69
            int r2 = r2.level     // Catch: java.lang.Throwable -> L69
            r3 = -75
            if (r2 >= r3) goto L29
            goto L5e
        L29:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L69
            r2.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "SSID"
            java.util.ArrayList<android.net.wifi.ScanResult> r4 = r5.b     // Catch: java.lang.Throwable -> L69
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L69
            android.net.wifi.ScanResult r4 = (android.net.wifi.ScanResult) r4     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = r4.SSID     // Catch: java.lang.Throwable -> L69
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "BSSID"
            java.util.ArrayList<android.net.wifi.ScanResult> r4 = r5.b     // Catch: java.lang.Throwable -> L69
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L69
            android.net.wifi.ScanResult r4 = (android.net.wifi.ScanResult) r4     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = r4.BSSID     // Catch: java.lang.Throwable -> L69
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "level"
            java.util.ArrayList<android.net.wifi.ScanResult> r4 = r5.b     // Catch: java.lang.Throwable -> L69
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L69
            android.net.wifi.ScanResult r4 = (android.net.wifi.ScanResult) r4     // Catch: java.lang.Throwable -> L69
            int r4 = r4.level     // Catch: java.lang.Throwable -> L69
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L69
            r0.put(r2)     // Catch: java.lang.Throwable -> L69
        L5e:
            int r1 = r1 + 1
            goto L12
        L61:
            r5.c = r0     // Catch: java.lang.Throwable -> L69
            com.tendcloud.tenddata.ba r0 = r5.a(r0)     // Catch: java.lang.Throwable -> L69
            r5.e = r0     // Catch: java.lang.Throwable -> L69
        L69:
            com.tendcloud.tenddata.ba r0 = r5.e
            return r0
    }

    public static /* synthetic */ void c(com.tendcloud.tenddata.br r0) {
            r0.a()
            return
    }

    public static /* synthetic */ com.tendcloud.tenddata.ba d(com.tendcloud.tenddata.br r0) {
            com.tendcloud.tenddata.ba r0 = r0.c()
            return r0
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r1, android.content.Intent r2) {
            r0 = this;
            android.os.Handler r1 = com.tendcloud.tenddata.bm.a
            com.tendcloud.tenddata.br$1 r2 = new com.tendcloud.tenddata.br$1
            r2.<init>(r0)
            r1.post(r2)
            return
    }
}
