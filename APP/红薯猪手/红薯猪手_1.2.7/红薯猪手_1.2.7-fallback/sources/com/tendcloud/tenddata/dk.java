package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class dk {
    private static com.tendcloud.tenddata.cw c;
    private static com.tendcloud.tenddata.cz d;
    private static com.tendcloud.tenddata.dd e;
    private static com.tendcloud.tenddata.da f;
    private static volatile com.tendcloud.tenddata.dk h;
    public org.json.JSONObject a;
    public org.json.JSONObject b;
    private com.tendcloud.tenddata.dh g;

    static {
            com.tendcloud.tenddata.dd r0 = new com.tendcloud.tenddata.dd
            r0.<init>()
            com.tendcloud.tenddata.dk.e = r0
            r0 = 0
            com.tendcloud.tenddata.dk.f = r0
            com.tendcloud.tenddata.dk.h = r0
            return
    }

    public dk() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.b = r0
            r1.g = r0
            return
    }

    public static com.tendcloud.tenddata.dk b() {
            com.tendcloud.tenddata.dk r0 = com.tendcloud.tenddata.dk.h
            if (r0 != 0) goto L17
            java.lang.Class<com.tendcloud.tenddata.dk> r0 = com.tendcloud.tenddata.dk.class
            monitor-enter(r0)
            com.tendcloud.tenddata.dk r1 = com.tendcloud.tenddata.dk.h     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.tendcloud.tenddata.dk r1 = new com.tendcloud.tenddata.dk     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.tendcloud.tenddata.dk.h = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.tendcloud.tenddata.dk r0 = com.tendcloud.tenddata.dk.h
            return r0
    }

    public synchronized org.json.JSONObject a(com.tendcloud.tenddata.cv r2, boolean r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            org.json.JSONObject r2 = r1.a(r2, r3, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r2
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized org.json.JSONObject a(com.tendcloud.tenddata.cv r2, boolean r3, com.tendcloud.tenddata.a r4) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            org.json.JSONObject r2 = r1.a(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r2
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized org.json.JSONObject a(com.tendcloud.tenddata.cv r4, boolean r5, com.tendcloud.tenddata.a r6, android.util.Pair<java.lang.String, org.json.JSONArray> r7) {
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L17d
            java.lang.Object r7 = r4.b()     // Catch: java.lang.Throwable -> L17a
            if (r7 != 0) goto Lb
            goto L17d
        Lb:
            java.lang.Class<android.util.EventLogTags> r7 = android.util.EventLogTags.class
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L17a
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L177
            r0.<init>()     // Catch: java.lang.Throwable -> L177
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L174
            r1.<init>()     // Catch: java.lang.Throwable -> L174
            r3.a = r1     // Catch: java.lang.Throwable -> L174
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L174
            r1.<init>()     // Catch: java.lang.Throwable -> L174
            r3.b = r1     // Catch: java.lang.Throwable -> L174
            com.tendcloud.tenddata.cw r1 = com.tendcloud.tenddata.dk.c     // Catch: java.lang.Throwable -> L89
            if (r1 != 0) goto L3c
            com.tendcloud.tenddata.cw r1 = com.tendcloud.tenddata.cw.a()     // Catch: java.lang.Throwable -> L89
            com.tendcloud.tenddata.dk.c = r1     // Catch: java.lang.Throwable -> L89
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L89
            android.content.Context r2 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = com.tendcloud.tenddata.dj.a(r2, r1)     // Catch: java.lang.Throwable -> L89
            com.tendcloud.tenddata.cw r2 = com.tendcloud.tenddata.dk.c     // Catch: java.lang.Throwable -> L89
            r2.setUniqueId(r1)     // Catch: java.lang.Throwable -> L89
        L3c:
            com.tendcloud.tenddata.cw r1 = com.tendcloud.tenddata.dk.c     // Catch: java.lang.Throwable -> L89
            r1.setSubmitAppId(r6)     // Catch: java.lang.Throwable -> L89
            com.tendcloud.tenddata.cw r1 = com.tendcloud.tenddata.dk.c     // Catch: java.lang.Throwable -> L89
            r1.setSubmitChannelId(r6)     // Catch: java.lang.Throwable -> L89
            com.tendcloud.tenddata.dd r6 = com.tendcloud.tenddata.dk.e     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L51
            com.tendcloud.tenddata.dd r6 = new com.tendcloud.tenddata.dd     // Catch: java.lang.Throwable -> L89
            r6.<init>()     // Catch: java.lang.Throwable -> L89
            com.tendcloud.tenddata.dk.e = r6     // Catch: java.lang.Throwable -> L89
        L51:
            com.tendcloud.tenddata.dc r6 = com.tendcloud.tenddata.dd.a     // Catch: java.lang.Throwable -> L89
            r6.a()     // Catch: java.lang.Throwable -> L89
            com.tendcloud.tenddata.dd r6 = com.tendcloud.tenddata.dk.e     // Catch: java.lang.Throwable -> L89
            com.tendcloud.tenddata.db r6 = r6.c()     // Catch: java.lang.Throwable -> L89
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L89
            int r1 = com.tendcloud.tenddata.o.B(r1)     // Catch: java.lang.Throwable -> L89
            r6.setSlots(r1)     // Catch: java.lang.Throwable -> L89
            com.tendcloud.tenddata.cz r6 = com.tendcloud.tenddata.dk.d     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L70
            com.tendcloud.tenddata.cz r6 = new com.tendcloud.tenddata.cz     // Catch: java.lang.Throwable -> L89
            r6.<init>()     // Catch: java.lang.Throwable -> L89
            com.tendcloud.tenddata.dk.d = r6     // Catch: java.lang.Throwable -> L89
        L70:
            com.tendcloud.tenddata.cz r6 = com.tendcloud.tenddata.dk.d     // Catch: java.lang.Throwable -> L89
            com.tendcloud.tenddata.TalkingDataSDKConfig r1 = com.tendcloud.tenddata.ab.T     // Catch: java.lang.Throwable -> L89
            int r1 = r1.getRules()     // Catch: java.lang.Throwable -> L89
            r6.setRule(r1)     // Catch: java.lang.Throwable -> L89
            com.tendcloud.tenddata.da r6 = com.tendcloud.tenddata.dk.f     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L89
            com.tendcloud.tenddata.da r6 = new com.tendcloud.tenddata.da     // Catch: java.lang.Throwable -> L89
            r6.<init>()     // Catch: java.lang.Throwable -> L89
            com.tendcloud.tenddata.dk.f = r6     // Catch: java.lang.Throwable -> L89
            r6.a()     // Catch: java.lang.Throwable -> L89
        L89:
            java.lang.String r6 = "version"
            java.lang.String r1 = "2.0"
            r0.put(r6, r1)     // Catch: java.lang.Throwable -> L174
            java.lang.String r6 = "action"
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> L174
            r0.put(r6, r4)     // Catch: java.lang.Throwable -> L174
            java.lang.String r4 = "device"
            com.tendcloud.tenddata.dd r6 = com.tendcloud.tenddata.dk.e     // Catch: java.lang.Throwable -> L174
            java.lang.Object r6 = r6.b()     // Catch: java.lang.Throwable -> L174
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> L174
            java.lang.String r4 = "app"
            com.tendcloud.tenddata.cw r6 = com.tendcloud.tenddata.dk.c     // Catch: java.lang.Throwable -> L174
            java.lang.Object r6 = r6.b()     // Catch: java.lang.Throwable -> L174
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> L174
            java.lang.String r4 = "sdk"
            com.tendcloud.tenddata.cz r6 = com.tendcloud.tenddata.dk.d     // Catch: java.lang.Throwable -> L174
            java.lang.Object r6 = r6.b()     // Catch: java.lang.Throwable -> L174
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> L174
            java.lang.String r4 = "appContext"
            com.tendcloud.tenddata.ct r6 = com.tendcloud.tenddata.ct.a()     // Catch: java.lang.Throwable -> L174
            java.lang.Object r6 = r6.b()     // Catch: java.lang.Throwable -> L174
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> L174
            java.lang.String r4 = "user"
            com.tendcloud.tenddata.da r6 = com.tendcloud.tenddata.dk.f     // Catch: java.lang.Throwable -> L174
            java.lang.Object r6 = r6.b()     // Catch: java.lang.Throwable -> L174
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> L174
            java.lang.String r4 = "sharingFilterPermission"
            com.tendcloud.tenddata.TalkingDataSharingFilter r6 = com.tendcloud.tenddata.ab.u     // Catch: java.lang.Throwable -> L174
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L174
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> L174
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L174
            java.lang.String r4 = "ts"
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L174
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L174
            r4.<init>()     // Catch: java.lang.Throwable -> L174
            r4.append(r1)     // Catch: java.lang.Throwable -> L174
            android.content.Context r6 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L174
            java.lang.String r6 = com.tendcloud.tenddata.dj.a(r6)     // Catch: java.lang.Throwable -> L174
            r4.append(r6)     // Catch: java.lang.Throwable -> L174
            com.tendcloud.tenddata.dd r6 = com.tendcloud.tenddata.dk.e     // Catch: java.lang.Throwable -> L174
            com.tendcloud.tenddata.de r6 = r6.a()     // Catch: java.lang.Throwable -> L174
            java.lang.String r6 = r6.a()     // Catch: java.lang.Throwable -> L174
            r4.append(r6)     // Catch: java.lang.Throwable -> L174
            com.tendcloud.tenddata.dd r6 = com.tendcloud.tenddata.dk.e     // Catch: java.lang.Throwable -> L174
            com.tendcloud.tenddata.de r6 = r6.a()     // Catch: java.lang.Throwable -> L174
            java.lang.String r6 = r6.c()     // Catch: java.lang.Throwable -> L174
            r4.append(r6)     // Catch: java.lang.Throwable -> L174
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L174
            java.lang.String r4 = com.tendcloud.tenddata.y.c(r4)     // Catch: java.lang.Throwable -> L174
            java.lang.String r6 = "fingerprint"
            r0.put(r6, r4)     // Catch: java.lang.Throwable -> L174
            if (r5 == 0) goto L174
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L174
            r4.<init>()     // Catch: java.lang.Throwable -> L174
            com.tendcloud.tenddata.dh r5 = new com.tendcloud.tenddata.dh     // Catch: java.lang.Throwable -> L174
            com.tendcloud.tenddata.di r6 = com.tendcloud.tenddata.di.a     // Catch: java.lang.Throwable -> L174
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L174
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L174
            r4.put(r5)     // Catch: java.lang.Throwable -> L174
            com.tendcloud.tenddata.dh r5 = r3.g     // Catch: java.lang.Throwable -> L174
            if (r5 != 0) goto L140
            com.tendcloud.tenddata.dh r5 = new com.tendcloud.tenddata.dh     // Catch: java.lang.Throwable -> L174
            com.tendcloud.tenddata.di r6 = com.tendcloud.tenddata.di.b     // Catch: java.lang.Throwable -> L174
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L174
            r3.g = r5     // Catch: java.lang.Throwable -> L174
        L140:
            com.tendcloud.tenddata.dh r5 = r3.g     // Catch: java.lang.Throwable -> L174
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L174
            r4.put(r5)     // Catch: java.lang.Throwable -> L174
            android.content.Context r5 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L161
            java.lang.String r6 = "android.permission.BLUETOOTH"
            boolean r5 = com.tendcloud.tenddata.y.b(r5, r6)     // Catch: java.lang.Throwable -> L161
            if (r5 == 0) goto L161
            com.tendcloud.tenddata.dh r5 = new com.tendcloud.tenddata.dh     // Catch: java.lang.Throwable -> L161
            com.tendcloud.tenddata.di r6 = com.tendcloud.tenddata.di.c     // Catch: java.lang.Throwable -> L161
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L161
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L161
            r4.put(r5)     // Catch: java.lang.Throwable -> L161
        L161:
            java.lang.String r5 = "networks"
            r0.put(r5, r4)     // Catch: java.lang.Throwable -> L174
            com.tendcloud.tenddata.cx r4 = new com.tendcloud.tenddata.cx     // Catch: java.lang.Throwable -> L174
            r4.<init>()     // Catch: java.lang.Throwable -> L174
            java.lang.String r5 = "locations"
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> L174
            r0.put(r5, r4)     // Catch: java.lang.Throwable -> L174
        L174:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L177
            monitor-exit(r3)
            return r0
        L177:
            r4 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L177
            throw r4     // Catch: java.lang.Throwable -> L17a
        L17a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L17d:
            r4 = 0
            monitor-exit(r3)
            return r4
    }

    public void a() {
            r1 = this;
            com.tendcloud.tenddata.da r0 = com.tendcloud.tenddata.dk.f
            if (r0 == 0) goto L7
            r0.c()
        L7:
            return
    }
}
