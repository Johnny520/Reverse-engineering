package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class x {
    private static android.location.Location a;
    private static boolean b;

    public x() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.List<android.location.Location> a(android.content.Context r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tendcloud.tenddata.TalkingDataSDKConfig r1 = com.tendcloud.tenddata.ab.T
            boolean r1 = r1.isLocationEnabled()
            if (r1 != 0) goto Le
            return r0
        Le:
            boolean r1 = com.tendcloud.tenddata.ab.P
            if (r1 == 0) goto L13
            return r0
        L13:
            android.location.Location r2 = f(r2)     // Catch: java.lang.Throwable -> L1a
            r0.add(r2)     // Catch: java.lang.Throwable -> L1a
        L1a:
            return r0
    }

    public static java.lang.String b(android.content.Context r7) {
            java.util.List r7 = a(r7)     // Catch: java.lang.Throwable -> La6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r0.<init>()     // Catch: java.lang.Throwable -> La6
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> La6
        Ld:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto La1
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> La6
            android.location.Location r1 = (android.location.Location) r1     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto Ld
            double r2 = r1.getLatitude()     // Catch: java.lang.Throwable -> La6
            r0.append(r2)     // Catch: java.lang.Throwable -> La6
            r2 = 44
            r0.append(r2)     // Catch: java.lang.Throwable -> La6
            double r3 = r1.getLongitude()     // Catch: java.lang.Throwable -> La6
            r0.append(r3)     // Catch: java.lang.Throwable -> La6
            r0.append(r2)     // Catch: java.lang.Throwable -> La6
            boolean r3 = r1.hasAltitude()     // Catch: java.lang.Throwable -> La6
            java.lang.String r4 = ""
            if (r3 == 0) goto L42
            double r5 = r1.getAltitude()     // Catch: java.lang.Throwable -> La6
            java.lang.Double r3 = java.lang.Double.valueOf(r5)     // Catch: java.lang.Throwable -> La6
            goto L43
        L42:
            r3 = r4
        L43:
            r0.append(r3)     // Catch: java.lang.Throwable -> La6
            r0.append(r2)     // Catch: java.lang.Throwable -> La6
            long r5 = r1.getTime()     // Catch: java.lang.Throwable -> La6
            r0.append(r5)     // Catch: java.lang.Throwable -> La6
            r0.append(r2)     // Catch: java.lang.Throwable -> La6
            boolean r3 = r1.hasAccuracy()     // Catch: java.lang.Throwable -> La6
            if (r3 == 0) goto L62
            float r3 = r1.getAccuracy()     // Catch: java.lang.Throwable -> La6
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Throwable -> La6
            goto L63
        L62:
            r3 = r4
        L63:
            r0.append(r3)     // Catch: java.lang.Throwable -> La6
            r0.append(r2)     // Catch: java.lang.Throwable -> La6
            boolean r3 = r1.hasBearing()     // Catch: java.lang.Throwable -> La6
            if (r3 == 0) goto L78
            float r3 = r1.getBearing()     // Catch: java.lang.Throwable -> La6
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Throwable -> La6
            goto L79
        L78:
            r3 = r4
        L79:
            r0.append(r3)     // Catch: java.lang.Throwable -> La6
            r0.append(r2)     // Catch: java.lang.Throwable -> La6
            boolean r3 = r1.hasSpeed()     // Catch: java.lang.Throwable -> La6
            if (r3 == 0) goto L8d
            float r3 = r1.getSpeed()     // Catch: java.lang.Throwable -> La6
            java.lang.Float r4 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Throwable -> La6
        L8d:
            r0.append(r4)     // Catch: java.lang.Throwable -> La6
            r0.append(r2)     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = r1.getProvider()     // Catch: java.lang.Throwable -> La6
            r0.append(r1)     // Catch: java.lang.Throwable -> La6
            r1 = 58
            r0.append(r1)     // Catch: java.lang.Throwable -> La6
            goto Ld
        La1:
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> La6
            return r7
        La6:
            r7 = 0
            return r7
    }

    public static org.json.JSONArray c(android.content.Context r5) {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            com.tendcloud.tenddata.TalkingDataSDKConfig r1 = com.tendcloud.tenddata.ab.T
            boolean r1 = r1.isLocationEnabled()
            if (r1 != 0) goto Le
            return r0
        Le:
            boolean r1 = com.tendcloud.tenddata.ab.P
            if (r1 == 0) goto L13
            return r0
        L13:
            android.location.Location r5 = f(r5)     // Catch: java.lang.Throwable -> L95
            if (r5 == 0) goto L95
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L95
            r1.<init>()     // Catch: java.lang.Throwable -> L95
            java.lang.String r2 = "lat"
            double r3 = r5.getLatitude()     // Catch: java.lang.Throwable -> L95
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L95
            java.lang.String r2 = "lng"
            double r3 = r5.getLongitude()     // Catch: java.lang.Throwable -> L95
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L95
            java.lang.String r2 = "ts"
            long r3 = r5.getTime()     // Catch: java.lang.Throwable -> L95
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L95
            r2 = 17
            boolean r2 = com.tendcloud.tenddata.y.a(r2)     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L4a
            java.lang.String r2 = "elapsed"
            long r3 = r5.getElapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L95
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L95
        L4a:
            boolean r2 = r5.hasAltitude()     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L59
            java.lang.String r2 = "altitude"
            double r3 = r5.getAltitude()     // Catch: java.lang.Throwable -> L95
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L95
        L59:
            boolean r2 = r5.hasAccuracy()     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L69
            java.lang.String r2 = "hAccuracy"
            float r3 = r5.getAccuracy()     // Catch: java.lang.Throwable -> L95
            double r3 = (double) r3     // Catch: java.lang.Throwable -> L95
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L95
        L69:
            boolean r2 = r5.hasBearing()     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L79
            java.lang.String r2 = "bearing"
            float r3 = r5.getBearing()     // Catch: java.lang.Throwable -> L95
            double r3 = (double) r3     // Catch: java.lang.Throwable -> L95
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L95
        L79:
            boolean r2 = r5.hasSpeed()     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L89
            java.lang.String r2 = "speed"
            float r3 = r5.getSpeed()     // Catch: java.lang.Throwable -> L95
            double r3 = (double) r3     // Catch: java.lang.Throwable -> L95
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L95
        L89:
            java.lang.String r2 = "provider"
            java.lang.String r5 = r5.getProvider()     // Catch: java.lang.Throwable -> L95
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> L95
            r0.put(r1)     // Catch: java.lang.Throwable -> L95
        L95:
            return r0
    }

    public static org.json.JSONArray d(android.content.Context r5) {
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            org.json.JSONArray r5 = com.tendcloud.tenddata.o.A(r5)     // Catch: java.lang.Throwable -> L69
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "type"
            if (r1 <= 0) goto L23
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L69
            r1.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "sim"
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "extra"
            r1.put(r3, r5)     // Catch: java.lang.Throwable -> L69
            r0.put(r1)     // Catch: java.lang.Throwable -> L69
        L23:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L69
            r5.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = "account"
            r5.put(r2, r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = com.tendcloud.tenddata.ab.r     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L36
            java.lang.String r2 = "accountId"
            r5.put(r2, r1)     // Catch: java.lang.Throwable -> L69
        L36:
            java.lang.String r1 = com.tendcloud.tenddata.i.l()     // Catch: java.lang.Throwable -> L69
            boolean r2 = com.tendcloud.tenddata.y.b(r1)     // Catch: java.lang.Throwable -> L69
            r3 = 1
            if (r2 != 0) goto L59
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L69
            r4 = 0
            r2[r4] = r1     // Catch: java.lang.Throwable -> L69
            com.tendcloud.tenddata.h.dForInternal(r2)     // Catch: java.lang.Throwable -> L69
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L69
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L69
            int r1 = r2.length()     // Catch: java.lang.Throwable -> L69
            if (r1 <= 0) goto L59
            java.lang.String r1 = "accountProp"
            r5.put(r1, r2)     // Catch: java.lang.Throwable -> L69
        L59:
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L69
            if (r1 <= r3) goto L62
            r0.put(r5)     // Catch: java.lang.Throwable -> L69
        L62:
            int r5 = r0.length()     // Catch: java.lang.Throwable -> L69
            if (r5 <= 0) goto L69
            return r0
        L69:
            r5 = 0
            return r5
    }

    public static java.lang.Long[][] e(android.content.Context r0) {
            r0 = 3
            java.lang.Long[][] r0 = new java.lang.Long[r0][]
            return r0
    }

    private static android.location.Location f(android.content.Context r4) {
            com.tendcloud.tenddata.TalkingDataSDKConfig r0 = com.tendcloud.tenddata.ab.T
            boolean r0 = r0.isLocationEnabled()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            boolean r0 = com.tendcloud.tenddata.x.b
            if (r0 == 0) goto L11
            android.location.Location r4 = com.tendcloud.tenddata.x.a
            return r4
        L11:
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r4 = com.tendcloud.tenddata.y.b(r4, r0)
            r0 = 1
            if (r4 != 0) goto L1d
            com.tendcloud.tenddata.x.b = r0
            return r1
        L1d:
            android.content.Context r4 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "location"
            java.lang.Object r4 = r4.getSystemService(r2)     // Catch: java.lang.Throwable -> L42
            android.location.LocationManager r4 = (android.location.LocationManager) r4     // Catch: java.lang.Throwable -> L42
            r2 = 0
            if (r4 == 0) goto L37
            java.lang.String r2 = "gps"
            boolean r2 = r4.isProviderEnabled(r2)     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "network"
            boolean r3 = r4.isProviderEnabled(r3)     // Catch: java.lang.Throwable -> L42
            goto L38
        L37:
            r3 = r2
        L38:
            if (r2 != 0) goto L3c
            if (r3 == 0) goto L42
        L3c:
            java.lang.String r2 = "passive"
            android.location.Location r1 = r4.getLastKnownLocation(r2)     // Catch: java.lang.Throwable -> L42
        L42:
            com.tendcloud.tenddata.x.a = r1
            com.tendcloud.tenddata.x.b = r0
            return r1
    }
}
