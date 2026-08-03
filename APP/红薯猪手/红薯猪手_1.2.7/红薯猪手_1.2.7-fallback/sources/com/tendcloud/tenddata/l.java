package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    private static android.telephony.TelephonyManager a;
    private static java.lang.String b;
    private static boolean c;
    private static final java.util.HashMap<java.lang.String, java.lang.String> d = null;


    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.tendcloud.tenddata.l.d = r0
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L86
            java.lang.String r2 = "phone"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L86
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> L86
            com.tendcloud.tenddata.l.a = r1     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = "imei1"
            android.content.Context r2 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L86
            r3 = 0
            java.lang.String r2 = a(r2, r3)     // Catch: java.lang.Throwable -> L86
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = "meid1"
            java.lang.String r2 = a(r3)     // Catch: java.lang.Throwable -> L86
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L86
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L86
            int r1 = com.tendcloud.tenddata.o.B(r1)     // Catch: java.lang.Throwable -> L86
            r2 = 2
            if (r1 != r2) goto L48
            java.lang.String r1 = "imei2"
            android.content.Context r2 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L86
            r3 = 1
            java.lang.String r2 = a(r2, r3)     // Catch: java.lang.Throwable -> L86
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = "meid2"
            java.lang.String r2 = a(r3)     // Catch: java.lang.Throwable -> L86
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L86
        L48:
            java.lang.String r1 = "imsi"
            android.content.Context r2 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = g(r2)     // Catch: java.lang.Throwable -> L86
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = "androidId"
            android.content.Context r2 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = e(r2)     // Catch: java.lang.Throwable -> L86
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = "mac"
            android.content.Context r2 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = d(r2)     // Catch: java.lang.Throwable -> L86
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = "ethMac"
            java.lang.String r2 = c()     // Catch: java.lang.Throwable -> L86
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = "dummy0"
            java.lang.String r2 = b()     // Catch: java.lang.Throwable -> L86
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = "serialNo"
            android.content.Context r2 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = c(r2)     // Catch: java.lang.Throwable -> L86
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L86
        L86:
            return
    }

    private l() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(int r2) {
            com.tendcloud.tenddata.TalkingDataSDKConfig r0 = com.tendcloud.tenddata.ab.T
            boolean r0 = r0.isIMEIAndMEIDEnabled()
            java.lang.String r1 = ""
            if (r0 != 0) goto Lb
            return r1
        Lb:
            r0 = 26
            boolean r0 = com.tendcloud.tenddata.y.a(r0)
            if (r0 == 0) goto L19
            android.telephony.TelephonyManager r0 = com.tendcloud.tenddata.l.a     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = p000.nc.m305(r0, r2)     // Catch: java.lang.Throwable -> L19
        L19:
            return r1
    }

    public static java.lang.String a(android.content.Context r10) {
            java.lang.String r0 = "|"
            java.lang.String r1 = "mac"
            java.lang.String r1 = a(r1)     // Catch: java.lang.Throwable -> L86
            boolean r2 = com.tendcloud.tenddata.y.b(r1)     // Catch: java.lang.Throwable -> L86
            if (r2 != 0) goto L20
            java.lang.String r2 = ":"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.replaceAll(r2, r3)     // Catch: java.lang.Throwable -> L86
            r2 = 16
            long r1 = java.lang.Long.parseLong(r1, r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L86
        L20:
            java.lang.String r2 = "androidId"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = "imeis"
            java.lang.String r3 = a(r3)     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = "imsi"
            java.lang.String r4 = a(r4)     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = "simId"
            java.lang.String r5 = a(r5)     // Catch: java.lang.Throwable -> L86
            java.lang.String r10 = com.tendcloud.tenddata.j.a(r10)     // Catch: java.lang.Throwable -> L86
            java.lang.String r6 = d()     // Catch: java.lang.Throwable -> L86
            java.lang.String r7 = "serialNo"
            java.lang.String r7 = a(r7)     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r9 = 170(0xaa, float:2.38E-43)
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L86
            r9 = 2
            r8.append(r9)     // Catch: java.lang.Throwable -> L86
            r8.append(r0)     // Catch: java.lang.Throwable -> L86
            r8.append(r1)     // Catch: java.lang.Throwable -> L86
            r8.append(r0)     // Catch: java.lang.Throwable -> L86
            r8.append(r2)     // Catch: java.lang.Throwable -> L86
            r8.append(r0)     // Catch: java.lang.Throwable -> L86
            r8.append(r3)     // Catch: java.lang.Throwable -> L86
            r8.append(r0)     // Catch: java.lang.Throwable -> L86
            r8.append(r4)     // Catch: java.lang.Throwable -> L86
            r8.append(r0)     // Catch: java.lang.Throwable -> L86
            r8.append(r5)     // Catch: java.lang.Throwable -> L86
            r8.append(r0)     // Catch: java.lang.Throwable -> L86
            r8.append(r10)     // Catch: java.lang.Throwable -> L86
            r8.append(r0)     // Catch: java.lang.Throwable -> L86
            r8.append(r6)     // Catch: java.lang.Throwable -> L86
            r8.append(r0)     // Catch: java.lang.Throwable -> L86
            r8.append(r7)     // Catch: java.lang.Throwable -> L86
            java.lang.String r10 = r8.toString()     // Catch: java.lang.Throwable -> L86
            return r10
        L86:
            r10 = 0
            return r10
    }

    private static java.lang.String a(android.content.Context r2, int r3) {
            com.tendcloud.tenddata.TalkingDataSDKConfig r0 = com.tendcloud.tenddata.ab.T
            boolean r0 = r0.isIMEIAndMEIDEnabled()
            java.lang.String r1 = ""
            if (r0 != 0) goto Lb
            return r1
        Lb:
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            boolean r2 = com.tendcloud.tenddata.y.b(r2, r0)
            if (r2 == 0) goto L37
            r2 = 26
            boolean r2 = com.tendcloud.tenddata.y.a(r2)
            if (r2 == 0) goto L22
            android.telephony.TelephonyManager r2 = com.tendcloud.tenddata.l.a     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = p000.nc.m306(r2, r3)     // Catch: java.lang.Throwable -> L37
            goto L37
        L22:
            r2 = 23
            boolean r2 = com.tendcloud.tenddata.y.a(r2)
            if (r2 == 0) goto L31
            android.telephony.TelephonyManager r2 = com.tendcloud.tenddata.l.a
            java.lang.String r1 = r2.getDeviceId(r3)
            goto L37
        L31:
            android.telephony.TelephonyManager r2 = com.tendcloud.tenddata.l.a
            java.lang.String r1 = r2.getDeviceId()
        L37:
            return r1
    }

    public static java.lang.String a(java.lang.String r1) {
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.tendcloud.tenddata.l.d
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    public static void a() {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            boolean r0 = com.tendcloud.tenddata.y.c(r0, r1)     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto Lb
            return
        Lb:
            android.content.Context r0 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L17
            com.tendcloud.tenddata.o.tryGetDoubleSimInfoReCheck(r0)     // Catch: java.lang.Throwable -> L17
            com.tendcloud.tenddata.dk r0 = com.tendcloud.tenddata.dk.b()     // Catch: java.lang.Throwable -> L17
            r0.a()     // Catch: java.lang.Throwable -> L17
        L17:
            return
    }

    public static /* synthetic */ boolean a(boolean r0) {
            com.tendcloud.tenddata.l.c = r0
            return r0
    }

    public static java.lang.String b() {
            java.lang.String r0 = "dummy"
            java.util.Enumeration r1 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Throwable -> L45
        L6:
            boolean r2 = r1.hasMoreElements()     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L45
            java.lang.Object r2 = r1.nextElement()     // Catch: java.lang.Throwable -> L45
            java.net.NetworkInterface r2 = (java.net.NetworkInterface) r2     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = r2.getName()     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L45
            boolean r3 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> L45
            if (r3 != 0) goto L21
            goto L6
        L21:
            java.util.Enumeration r2 = r2.getInetAddresses()     // Catch: java.lang.Throwable -> L45
        L25:
            boolean r3 = r2.hasMoreElements()     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L6
            java.lang.Object r3 = r2.nextElement()     // Catch: java.lang.Throwable -> L45
            java.net.InetAddress r3 = (java.net.InetAddress) r3     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = r3.getHostAddress()     // Catch: java.lang.Throwable -> L45
            boolean r4 = r3.contains(r0)     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L25
            java.lang.String r0 = "%"
            java.lang.String[] r0 = r3.split(r0)     // Catch: java.lang.Throwable -> L45
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L45
            return r0
        L45:
            r0 = 0
            return r0
    }

    public static java.lang.String b(int r2) {
            com.tendcloud.tenddata.TalkingDataSDKConfig r0 = com.tendcloud.tenddata.ab.T
            boolean r0 = r0.isIMEIAndMEIDEnabled()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            r0 = 1
            if (r2 != r0) goto L14
            java.lang.String r2 = "imei2"
        Lf:
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L23
            goto L17
        L14:
            java.lang.String r2 = "imei1"
            goto Lf
        L17:
            boolean r0 = com.tendcloud.tenddata.y.b(r2)     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L1e
            return r1
        L1e:
            java.lang.String r2 = com.tendcloud.tenddata.y.c(r2)     // Catch: java.lang.Throwable -> L23
            return r2
        L23:
            return r1
    }

    public static java.lang.String b(android.content.Context r2) {
            boolean r0 = com.tendcloud.tenddata.l.c     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto Le
            java.util.concurrent.ThreadPoolExecutor r0 = com.tendcloud.tenddata.w.a     // Catch: java.lang.Throwable -> L11
            com.tendcloud.tenddata.l$1 r1 = new com.tendcloud.tenddata.l$1     // Catch: java.lang.Throwable -> L11
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
            r0.execute(r1)     // Catch: java.lang.Throwable -> L11
        Le:
            java.lang.String r2 = com.tendcloud.tenddata.l.b     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = 0
            return r2
    }

    public static /* synthetic */ java.lang.String b(java.lang.String r0) {
            com.tendcloud.tenddata.l.b = r0
            return r0
    }

    public static java.lang.String c() {
            com.tendcloud.tenddata.TalkingDataSDKConfig r0 = com.tendcloud.tenddata.ab.T
            boolean r0 = r0.isMACEnabled()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.String r0 = f()     // Catch: java.lang.Throwable -> L16
            boolean r2 = com.tendcloud.tenddata.y.j(r0)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L15
            goto L16
        L15:
            r1 = r0
        L16:
            return r1
    }

    public static java.lang.String c(int r3) {
            com.tendcloud.tenddata.TalkingDataSDKConfig r0 = com.tendcloud.tenddata.ab.T
            boolean r0 = r0.isIMEIAndMEIDEnabled()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.String r0 = "meid1"
            r2 = 1
            if (r3 != r2) goto L11
            java.lang.String r0 = "meid2"
        L11:
            java.lang.String r3 = a(r0)     // Catch: java.lang.Throwable -> L21
            boolean r0 = com.tendcloud.tenddata.y.b(r3)     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L1c
            return r1
        L1c:
            java.lang.String r3 = com.tendcloud.tenddata.y.c(r3)     // Catch: java.lang.Throwable -> L21
            return r3
        L21:
            return r1
    }

    public static java.lang.String c(android.content.Context r0) {
            r0 = 0
            return r0
    }

    private static java.lang.String d() {
            com.tendcloud.tenddata.df r0 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = r0.c()     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            java.lang.String r0 = ""
        Lb:
            return r0
    }

    public static java.lang.String d(android.content.Context r2) {
            com.tendcloud.tenddata.TalkingDataSDKConfig r0 = com.tendcloud.tenddata.ab.T
            boolean r0 = r0.isMACEnabled()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            r0 = 23
            boolean r0 = com.tendcloud.tenddata.y.a(r0)     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L17
            java.lang.String r2 = e()     // Catch: java.lang.Throwable -> L23
            goto L1b
        L17:
            java.lang.String r2 = j(r2)     // Catch: java.lang.Throwable -> L23
        L1b:
            boolean r0 = com.tendcloud.tenddata.y.j(r2)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L22
            goto L23
        L22:
            r1 = r2
        L23:
            return r1
    }

    private static java.lang.String e() {
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Throwable -> L6a
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch: java.lang.Throwable -> L6a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6a
        Lc:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L6a
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r3 = "wlan0"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L6a
            if (r2 != 0) goto L25
            goto Lc
        L25:
            byte[] r0 = r1.getHardwareAddress()     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L2e
            java.lang.String r0 = ""
            return r0
        L2e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r1.<init>()     // Catch: java.lang.Throwable -> L6a
            int r2 = r0.length     // Catch: java.lang.Throwable -> L6a
            r3 = 0
            r4 = r3
        L36:
            r5 = 1
            if (r4 >= r2) goto L4f
            r6 = r0[r4]     // Catch: java.lang.Throwable -> L6a
            java.lang.String r7 = "%02X:"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L6a
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)     // Catch: java.lang.Throwable -> L6a
            r5[r3] = r6     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = java.lang.String.format(r7, r5)     // Catch: java.lang.Throwable -> L6a
            r1.append(r5)     // Catch: java.lang.Throwable -> L6a
            int r4 = r4 + 1
            goto L36
        L4f:
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L6a
            if (r0 <= 0) goto L5d
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L6a
            int r0 = r0 - r5
            r1.deleteCharAt(r0)     // Catch: java.lang.Throwable -> L6a
        L5d:
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r0.toUpperCase()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L6a
            return r0
        L6a:
            r0 = 0
            return r0
    }

    public static java.lang.String e(android.content.Context r1) {
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = "android_id"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = 0
            return r1
    }

    private static java.lang.String f() {
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Throwable -> L6a
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch: java.lang.Throwable -> L6a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6a
        Lc:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L6a
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r3 = "eth0"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L6a
            if (r2 != 0) goto L25
            goto Lc
        L25:
            byte[] r0 = r1.getHardwareAddress()     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L2e
            java.lang.String r0 = ""
            return r0
        L2e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r1.<init>()     // Catch: java.lang.Throwable -> L6a
            int r2 = r0.length     // Catch: java.lang.Throwable -> L6a
            r3 = 0
            r4 = r3
        L36:
            r5 = 1
            if (r4 >= r2) goto L4f
            r6 = r0[r4]     // Catch: java.lang.Throwable -> L6a
            java.lang.String r7 = "%02X:"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L6a
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)     // Catch: java.lang.Throwable -> L6a
            r5[r3] = r6     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = java.lang.String.format(r7, r5)     // Catch: java.lang.Throwable -> L6a
            r1.append(r5)     // Catch: java.lang.Throwable -> L6a
            int r4 = r4 + 1
            goto L36
        L4f:
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L6a
            if (r0 <= 0) goto L5d
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L6a
            int r0 = r0 - r5
            r1.deleteCharAt(r0)     // Catch: java.lang.Throwable -> L6a
        L5d:
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r0.toUpperCase()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L6a
            return r0
        L6a:
            r0 = 0
            return r0
    }

    public static java.lang.String f(android.content.Context r1) {
            com.tendcloud.tenddata.TalkingDataSDKConfig r0 = com.tendcloud.tenddata.ab.T
            boolean r0 = r0.isIMEIAndMEIDEnabled()
            if (r0 != 0) goto Lb
            java.lang.String r1 = ""
            return r1
        Lb:
            int r1 = com.tendcloud.tenddata.o.B(r1)     // Catch: java.lang.Throwable -> L23
            r0 = 2
            if (r1 != r0) goto L1d
            java.util.HashMap<java.lang.String, java.lang.String> r1 = com.tendcloud.tenddata.l.d     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "imei2"
        L16:
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L23
            goto L22
        L1d:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = com.tendcloud.tenddata.l.d     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "imei1"
            goto L16
        L22:
            return r1
        L23:
            r1 = 0
            return r1
    }

    public static java.lang.String g(android.content.Context r0) {
            r0 = 0
            return r0
    }

    private static java.lang.String h(android.content.Context r3) {
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            boolean r0 = com.tendcloud.tenddata.y.b(r3, r0)     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L34
            java.lang.String r0 = ""
            int r3 = com.tendcloud.tenddata.o.B(r3)     // Catch: java.lang.Throwable -> L34
            r1 = 2
            java.lang.String r2 = "imei1"
            if (r3 != r1) goto L24
            java.util.HashMap<java.lang.String, java.lang.String> r3 = com.tendcloud.tenddata.l.d     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L34
            java.lang.Object r1 = r3.get(r2)     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L34
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L34
            java.lang.String r1 = "imei2"
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L34
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L34
            r0 = r3
        L24:
            boolean r3 = com.tendcloud.tenddata.y.b(r0)     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L33
            java.util.HashMap<java.lang.String, java.lang.String> r3 = com.tendcloud.tenddata.l.d     // Catch: java.lang.Throwable -> L34
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L34
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L34
        L33:
            return r0
        L34:
            r3 = 0
            return r3
    }

    private static java.lang.String i(android.content.Context r0) {
            r0 = 0
            return r0
    }

    private static java.lang.String j(android.content.Context r1) {
            java.lang.String r0 = "android.permission.ACCESS_WIFI_STATE"
            boolean r0 = com.tendcloud.tenddata.y.b(r1, r0)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L31
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = "wifi"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> L31
            android.net.wifi.WifiManager r1 = (android.net.wifi.WifiManager) r1     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L31
            boolean r0 = r1.isWifiEnabled()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L31
            android.net.wifi.WifiInfo r1 = r1.getConnectionInfo()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L31
            java.lang.String r1 = r1.getMacAddress()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L31
            java.lang.String r1 = r1.toUpperCase()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L31
            return r1
        L31:
            r1 = 0
            return r1
    }
}
