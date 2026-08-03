package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class dh extends com.tendcloud.tenddata.cy {
    private com.tendcloud.tenddata.ba a;
    private java.lang.String c;

    /* JADX INFO: renamed from: com.tendcloud.tenddata.dh$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$talkingdata$sdk$saf$datamodel$network$TDNetworkType = null;

        static {
                com.tendcloud.tenddata.di[] r0 = com.tendcloud.tenddata.di.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.tendcloud.tenddata.dh.AnonymousClass1.$SwitchMap$com$talkingdata$sdk$saf$datamodel$network$TDNetworkType = r0
                com.tendcloud.tenddata.di r1 = com.tendcloud.tenddata.di.a     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.tendcloud.tenddata.dh.AnonymousClass1.$SwitchMap$com$talkingdata$sdk$saf$datamodel$network$TDNetworkType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.tendcloud.tenddata.di r1 = com.tendcloud.tenddata.di.b     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.tendcloud.tenddata.dh.AnonymousClass1.$SwitchMap$com$talkingdata$sdk$saf$datamodel$network$TDNetworkType     // Catch: java.lang.NoSuchFieldError -> L28
                com.tendcloud.tenddata.di r1 = com.tendcloud.tenddata.di.c     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public dh(com.tendcloud.tenddata.di r11) {
            r10 = this;
            r10.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r10.c = r0
            int[] r0 = com.tendcloud.tenddata.dh.AnonymousClass1.$SwitchMap$com$talkingdata$sdk$saf$datamodel$network$TDNetworkType
            int r11 = r11.ordinal()
            r11 = r0[r11]
            r0 = 1
            java.lang.String r1 = ":"
            java.lang.String r2 = "proxy"
            java.lang.String r3 = "current"
            java.lang.String r4 = "available"
            java.lang.String r5 = "ipv6"
            java.lang.String r6 = "ip"
            java.lang.String r7 = "connected"
            java.lang.String r8 = "type"
            java.lang.String r9 = "scannable"
            if (r11 == r0) goto Lb2
            r0 = 2
            if (r11 == r0) goto L3d
            r0 = 3
            if (r11 == r0) goto L32
            goto L163
        L32:
            com.tendcloud.tenddata.di r11 = com.tendcloud.tenddata.di.c     // Catch: java.lang.Throwable -> L163
            java.lang.String r11 = r11.a()     // Catch: java.lang.Throwable -> L163
            r10.a(r8, r11)     // Catch: java.lang.Throwable -> L163
            goto L163
        L3d:
            com.tendcloud.tenddata.di r11 = com.tendcloud.tenddata.di.b     // Catch: java.lang.Throwable -> L163
            java.lang.String r11 = r11.a()     // Catch: java.lang.Throwable -> L163
            r10.a(r8, r11)     // Catch: java.lang.Throwable -> L163
            android.content.Context r11 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L163
            boolean r11 = com.tendcloud.tenddata.o.e(r11)     // Catch: java.lang.Throwable -> L163
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Throwable -> L163
            r10.a(r4, r11)     // Catch: java.lang.Throwable -> L163
            android.content.Context r11 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L163
            boolean r11 = com.tendcloud.tenddata.o.j(r11)     // Catch: java.lang.Throwable -> L163
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Throwable -> L163
            r10.a(r7, r11)     // Catch: java.lang.Throwable -> L163
            java.lang.String r11 = "cell_ip"
            java.lang.String r11 = com.tendcloud.tenddata.o.a(r11)     // Catch: java.lang.Throwable -> L163
            r10.a(r6, r11)     // Catch: java.lang.Throwable -> L163
            java.lang.String r11 = "cell_ipv6"
            java.lang.String r11 = com.tendcloud.tenddata.o.a(r11)     // Catch: java.lang.Throwable -> L163
            r10.a(r5, r11)     // Catch: java.lang.Throwable -> L163
            android.content.Context r11 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L163
            boolean r11 = com.tendcloud.tenddata.o.b(r11)     // Catch: java.lang.Throwable -> L163
            if (r11 == 0) goto L84
            android.content.Context r11 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L163
            r0 = 0
            org.json.JSONArray r11 = com.tendcloud.tenddata.o.a(r11, r0)     // Catch: java.lang.Throwable -> L163
            r10.a(r3, r11)     // Catch: java.lang.Throwable -> L163
        L84:
            boolean r11 = com.tendcloud.tenddata.o.b()     // Catch: java.lang.Throwable -> L163
            if (r11 == 0) goto La7
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L163
            r11.<init>()     // Catch: java.lang.Throwable -> L163
            java.lang.String r0 = android.net.Proxy.getDefaultHost()     // Catch: java.lang.Throwable -> L163
            r11.append(r0)     // Catch: java.lang.Throwable -> L163
            r11.append(r1)     // Catch: java.lang.Throwable -> L163
            int r0 = android.net.Proxy.getDefaultPort()     // Catch: java.lang.Throwable -> L163
            r11.append(r0)     // Catch: java.lang.Throwable -> L163
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L163
            r10.a(r2, r11)     // Catch: java.lang.Throwable -> L163
        La7:
            android.content.Context r11 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L163
            org.json.JSONArray r11 = com.tendcloud.tenddata.o.v(r11)     // Catch: java.lang.Throwable -> L163
            r10.a(r9, r11)     // Catch: java.lang.Throwable -> L163
            goto L163
        Lb2:
            com.tendcloud.tenddata.di r11 = com.tendcloud.tenddata.di.a
            java.lang.String r11 = r11.a()
            r10.a(r8, r11)
            android.content.Context r11 = com.tendcloud.tenddata.ab.g
            boolean r11 = com.tendcloud.tenddata.o.d(r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10.a(r4, r11)
            android.content.Context r11 = com.tendcloud.tenddata.ab.g
            boolean r11 = com.tendcloud.tenddata.o.i(r11)
            if (r11 == 0) goto L134
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r10.a(r7, r11)
            android.content.Context r11 = com.tendcloud.tenddata.ab.g
            org.json.JSONArray r11 = com.tendcloud.tenddata.o.y(r11)
            r10.a(r3, r11)
            android.content.Context r11 = com.tendcloud.tenddata.ab.g
            org.json.JSONArray r11 = com.tendcloud.tenddata.o.z(r11)
            com.tendcloud.tenddata.ba r0 = a(r11)
            com.tendcloud.tenddata.ba r3 = r10.a
            if (r3 != 0) goto Lf2
            r10.a(r9, r11)
            r10.a = r0
            goto L11a
        Lf2:
            com.tendcloud.tenddata.bb r3 = new com.tendcloud.tenddata.bb
            r3.<init>()
            com.tendcloud.tenddata.ba r4 = r10.a
            double r3 = r3.a(r4, r0)
            r7 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 <= 0) goto L10b
            r11 = 0
            r10.a(r9, r11)
            goto L11a
        L10b:
            r10.a(r9, r11)
            r10.a = r0
            java.util.UUID r11 = java.util.UUID.randomUUID()
            java.lang.String r11 = r11.toString()
            r10.c = r11
        L11a:
            android.content.Context r11 = com.tendcloud.tenddata.ab.g
            org.json.JSONArray r11 = com.tendcloud.tenddata.o.x(r11)
            java.lang.String r0 = "configured"
            r10.a(r0, r11)
            java.lang.String r11 = com.tendcloud.tenddata.o.a(r6)
            r10.a(r6, r11)
            java.lang.String r11 = com.tendcloud.tenddata.o.a(r5)
            r10.a(r5, r11)
            goto L139
        L134:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r10.a(r7, r11)
        L139:
            boolean r11 = com.tendcloud.tenddata.o.b()
            if (r11 == 0) goto L15c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = android.net.Proxy.getDefaultHost()
            r11.append(r0)
            r11.append(r1)
            int r0 = android.net.Proxy.getDefaultPort()
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.a(r2, r11)
        L15c:
            java.lang.String r11 = r10.c
            java.lang.String r0 = "scannableFingerId"
            r10.a(r0, r11)
        L163:
            return
    }

    private static com.tendcloud.tenddata.ba a(org.json.JSONArray r10) {
            if (r10 == 0) goto L41
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L8:
            int r2 = r10.length()
            if (r1 >= r2) goto L38
            org.json.JSONObject r2 = r10.getJSONObject(r1)     // Catch: java.lang.Throwable -> L31
            com.tendcloud.tenddata.ax r9 = new com.tendcloud.tenddata.ax     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = "name"
            java.lang.String r4 = r2.getString(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = "id"
            java.lang.String r5 = r2.getString(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = "level"
            int r2 = r2.getInt(r3)     // Catch: java.lang.Throwable -> L31
            byte r6 = (byte) r2     // Catch: java.lang.Throwable -> L31
            r7 = 0
            r8 = 0
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L31
            r0.add(r9)     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            r2 = move-exception
            com.tendcloud.tenddata.h.eForInternal(r2)
        L35:
            int r1 = r1 + 1
            goto L8
        L38:
            com.tendcloud.tenddata.ba r10 = new com.tendcloud.tenddata.ba
            r10.<init>()
            r10.setBsslist(r0)
            goto L42
        L41:
            r10 = 0
        L42:
            return r10
    }
}
