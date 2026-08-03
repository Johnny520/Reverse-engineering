package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class o {
    public static final java.lang.String a = "www.talkingdata.net";
    public static final int b = 80;
    private static android.telephony.TelephonyManager c = null;
    private static final java.util.HashMap<java.lang.String, java.lang.String> d = null;
    private static final java.lang.String[] e = null;
    private static final java.lang.String[] f = null;
    private static com.tendcloud.tenddata.o.a g = null;
    private static boolean h = false;
    private static final long i = 300000;
    private static long j;
    private static volatile boolean k;
    private static volatile boolean l;
    private static org.json.JSONArray m;
    private static org.json.JSONArray n;
    private static volatile boolean o;
    private static volatile boolean p;
    private static volatile boolean q;
    private static org.json.JSONArray r;
    private static org.json.JSONArray s;
    private static org.json.JSONArray t;
    private static boolean u;
    private static com.tendcloud.tenddata.o.b v;
    private static org.json.JSONArray w;
    private static volatile boolean x;





    public static class a implements java.lang.Runnable {
        private android.content.Context context;
        private java.lang.Object lock;
        private android.content.BroadcastReceiver receiver;

        public a(android.content.Context r1, java.lang.Object r2, android.content.BroadcastReceiver r3) {
                r0 = this;
                r0.<init>()
                r0.context = r1
                r0.lock = r2
                r0.receiver = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.lang.Object r0 = r3.lock     // Catch: java.lang.Throwable -> L1a
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L1a
                java.lang.Object r1 = r3.lock     // Catch: java.lang.Throwable -> L10
                r1.notifyAll()     // Catch: java.lang.Throwable -> L10
                android.content.Context r1 = r3.context     // Catch: java.lang.Throwable -> L17
                android.content.BroadcastReceiver r2 = r3.receiver     // Catch: java.lang.Throwable -> L17
            Lc:
                r1.unregisterReceiver(r2)     // Catch: java.lang.Throwable -> L17
                goto L15
            L10:
                android.content.Context r1 = r3.context     // Catch: java.lang.Throwable -> L17
                android.content.BroadcastReceiver r2 = r3.receiver     // Catch: java.lang.Throwable -> L17
                goto Lc
            L15:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                goto L1a
            L17:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                throw r1     // Catch: java.lang.Throwable -> L1a
            L1a:
                return
        }

        public void unRegisterReceiver() {
                r2 = this;
                android.content.BroadcastReceiver r0 = r2.receiver
                if (r0 == 0) goto L9
                android.content.Context r1 = r2.context     // Catch: java.lang.Throwable -> L9
                r1.unregisterReceiver(r0)     // Catch: java.lang.Throwable -> L9
            L9:
                return
        }
    }

    public static class b extends android.content.BroadcastReceiver {
        private java.util.concurrent.CountDownLatch latch;

        public b() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
                r1 = 1
                r0.<init>(r1)
                r2.latch = r0
                return
        }

        public void await() {
                r4 = this;
                java.util.concurrent.CountDownLatch r0 = r4.latch     // Catch: java.lang.Throwable -> La
                r1 = 2000(0x7d0, double:9.88E-321)
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> La
                r0.await(r1, r3)     // Catch: java.lang.Throwable -> La
                goto Le
            La:
                r0 = move-exception
                com.tendcloud.tenddata.h.eForInternal(r0)
            Le:
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r3, android.content.Intent r4) {
                r2 = this;
                java.lang.String r3 = r4.getAction()
                java.lang.String r4 = "android.net.wifi.SCAN_RESULTS"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L1d
                java.util.concurrent.CountDownLatch r3 = r2.latch
                long r3 = r3.getCount()
                r0 = 0
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 <= 0) goto L1d
                java.util.concurrent.CountDownLatch r3 = r2.latch
                r3.countDown()
            L1d:
                return
        }

        public void reset() {
                r2 = this;
                java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
                r1 = 1
                r0.<init>(r1)
                r2.latch = r0
                return
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.tendcloud.tenddata.o.d = r0
            java.lang.String r1 = "UNKNOWN"
            java.lang.String r2 = "GPRS"
            java.lang.String r3 = "EDGE"
            java.lang.String r4 = "UMTS"
            java.lang.String r5 = "CDMA"
            java.lang.String r6 = "EVDO_0"
            java.lang.String r7 = "EVDO_A"
            java.lang.String r8 = "1xRTT"
            java.lang.String r9 = "HSDPA"
            java.lang.String r10 = "HSUPA"
            java.lang.String r11 = "HSPA"
            java.lang.String r12 = "IDEN"
            java.lang.String r13 = "EVDO_B"
            java.lang.String r14 = "LTE"
            java.lang.String r15 = "EHRPD"
            java.lang.String r16 = "HSPAP"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            com.tendcloud.tenddata.o.e = r1
            java.lang.String r1 = "NONE"
            java.lang.String r2 = "GSM"
            java.lang.String r3 = "CDMA"
            java.lang.String r4 = "SIP"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4}
            com.tendcloud.tenddata.o.f = r1
            r1 = 0
            com.tendcloud.tenddata.o.g = r1
            android.content.Context r1 = com.tendcloud.tenddata.ab.g
            r2 = 0
            if (r1 == 0) goto L7c
            java.lang.String[] r1 = a()
            r3 = r1[r2]
            java.lang.String r4 = "ip"
            r0.put(r4, r3)
            r3 = 1
            r3 = r1[r3]
            java.lang.String r4 = "ipv6"
            r0.put(r4, r3)
            r3 = 2
            r3 = r1[r3]
            java.lang.String r4 = "cell_ip"
            r0.put(r4, r3)
            r3 = 3
            r1 = r1[r3]
            java.lang.String r3 = "cell_ipv6"
            r0.put(r3, r1)
            android.content.Context r1 = com.tendcloud.tenddata.ab.g
            java.lang.String r1 = q(r1)
            java.lang.String r3 = "bssid"
            r0.put(r3, r1)
            android.content.Context r1 = com.tendcloud.tenddata.ab.g
            java.lang.String r1 = w(r1)
            java.lang.String r3 = "ssid"
            r0.put(r3, r1)
        L7c:
            com.tendcloud.tenddata.o.h = r2
            r0 = -300000(0xfffffffffffb6c20, double:NaN)
            com.tendcloud.tenddata.o.j = r0
            com.tendcloud.tenddata.o.k = r2
            com.tendcloud.tenddata.o.l = r2
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            com.tendcloud.tenddata.o.m = r0
            com.tendcloud.tenddata.o.o = r2
            com.tendcloud.tenddata.o.p = r2
            com.tendcloud.tenddata.o.q = r2
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            com.tendcloud.tenddata.o.r = r0
            com.tendcloud.tenddata.o.u = r2
            com.tendcloud.tenddata.o$b r0 = new com.tendcloud.tenddata.o$b
            r0.<init>()
            com.tendcloud.tenddata.o.v = r0
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            com.tendcloud.tenddata.o.w = r0
            com.tendcloud.tenddata.o.x = r2
            return
    }

    public o() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.json.JSONArray A(android.content.Context r1) {
            org.json.JSONArray r0 = com.tendcloud.tenddata.o.w
            int r0 = r0.length()
            if (r0 > 0) goto L1e
            boolean r0 = com.tendcloud.tenddata.o.x
            if (r0 == 0) goto Ld
            goto L1e
        Ld:
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            boolean r0 = com.tendcloud.tenddata.y.b(r1, r0)
            if (r0 != 0) goto L18
            org.json.JSONArray r1 = com.tendcloud.tenddata.o.w
            return r1
        L18:
            D(r1)
            org.json.JSONArray r1 = com.tendcloud.tenddata.o.w
            return r1
        L1e:
            org.json.JSONArray r1 = com.tendcloud.tenddata.o.w
            return r1
    }

    public static int B(android.content.Context r1) {
            r0 = 23
            boolean r0 = com.tendcloud.tenddata.y.a(r0)
            if (r0 == 0) goto L16
            android.telephony.TelephonyManager r0 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto Lf
            a(r1)     // Catch: java.lang.Throwable -> L1f
        Lf:
            android.telephony.TelephonyManager r1 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> L1f
            int r1 = r1.getPhoneCount()     // Catch: java.lang.Throwable -> L1f
            goto L20
        L16:
            org.json.JSONArray r1 = A(r1)     // Catch: java.lang.Throwable -> L1f
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L1f
            goto L20
        L1f:
            r1 = 0
        L20:
            return r1
    }

    public static java.util.Map<java.lang.String, java.lang.Object> C(android.content.Context r5) {
            boolean r5 = d(r5)
            r0 = 0
            if (r5 == 0) goto L73
            java.util.HashMap<java.lang.String, java.lang.String> r5 = com.tendcloud.tenddata.o.d     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "ip"
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L6d
            if (r5 == 0) goto L5d
            r1 = 46
            int r1 = r5.lastIndexOf(r1)     // Catch: java.lang.Throwable -> L6d
            r2 = 1
            int r1 = r1 + r2
            r3 = 0
            java.lang.String r5 = r5.substring(r3, r1)     // Catch: java.lang.Throwable -> L6d
            java.net.DatagramPacket r1 = new java.net.DatagramPacket     // Catch: java.lang.Throwable -> L6d
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r4, r3, r3)     // Catch: java.lang.Throwable -> L6d
            java.net.DatagramSocket r3 = new java.net.DatagramSocket     // Catch: java.lang.Throwable -> L6d
            r3.<init>()     // Catch: java.lang.Throwable -> L6d
        L2c:
            r4 = 255(0xff, float:3.57E-43)
            if (r2 >= r4) goto L59
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r4.<init>()     // Catch: java.lang.Throwable -> L6e
            r4.append(r5)     // Catch: java.lang.Throwable -> L6e
            r4.append(r2)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L6e
            java.net.InetAddress r4 = java.net.InetAddress.getByName(r4)     // Catch: java.lang.Throwable -> L6e
            r1.setAddress(r4)     // Catch: java.lang.Throwable -> L56
            r3.send(r1)     // Catch: java.lang.Throwable -> L56
            r4 = 125(0x7d, float:1.75E-43)
            if (r2 != r4) goto L56
            r3.close()     // Catch: java.lang.Throwable -> L56
            java.net.DatagramSocket r4 = new java.net.DatagramSocket     // Catch: java.lang.Throwable -> L56
            r4.<init>()     // Catch: java.lang.Throwable -> L56
            r3 = r4
        L56:
            int r2 = r2 + 1
            goto L2c
        L59:
            r3.close()     // Catch: java.lang.Throwable -> L6e
            goto L5e
        L5d:
            r3 = r0
        L5e:
            r1 = 5000(0x1388, double:2.4703E-320)
            java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> L6e
            java.util.Map r5 = c()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L6c
            r3.close()     // Catch: java.lang.Throwable -> L6c
        L6c:
            return r5
        L6d:
            r3 = r0
        L6e:
            if (r3 == 0) goto L73
            r3.close()     // Catch: java.lang.Throwable -> L73
        L73:
            return r0
    }

    private static void D(android.content.Context r12) {
            java.lang.String r0 = "meid5"
            java.lang.String r1 = "meid"
            java.lang.String r2 = "imei5"
            com.tendcloud.tenddata.TalkingDataSDKConfig r3 = com.tendcloud.tenddata.ab.T
            boolean r3 = r3.isIMEIAndMEIDEnabled()
            if (r3 != 0) goto Lf
            return
        Lf:
            r3 = 1
            java.lang.String r4 = "phone"
            java.lang.Object r4 = r12.getSystemService(r4)     // Catch: java.lang.Throwable -> L186
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4     // Catch: java.lang.Throwable -> L186
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L186
            r5.<init>()     // Catch: java.lang.Throwable -> L186
            r6 = 22
            boolean r6 = com.tendcloud.tenddata.y.a(r6)     // Catch: java.lang.Throwable -> L186
            java.lang.String r7 = "imei"
            r8 = 0
            if (r6 == 0) goto Lbe
            java.lang.String r5 = "telephony_subscription_service"
            java.lang.Object r5 = r12.getSystemService(r5)     // Catch: java.lang.Throwable -> L186
            android.telephony.SubscriptionManager r5 = (android.telephony.SubscriptionManager) r5     // Catch: java.lang.Throwable -> L186
            r6 = 26
            org.json.JSONObject r9 = a(r12, r5, r8)     // Catch: java.lang.Throwable -> L76
            boolean r10 = com.tendcloud.tenddata.y.a(r6)     // Catch: java.lang.Throwable -> L76
            java.lang.String r11 = "imei1"
            if (r10 == 0) goto L5d
            java.lang.String r10 = com.tendcloud.tenddata.l.a(r11)     // Catch: java.lang.Throwable -> L4c
            r9.put(r7, r10)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r10 = com.tendcloud.tenddata.l.b(r8)     // Catch: java.lang.Throwable -> L4c
            r9.put(r2, r10)     // Catch: java.lang.Throwable -> L4c
        L4c:
            java.lang.String r10 = "meid1"
            java.lang.String r10 = com.tendcloud.tenddata.l.a(r10)     // Catch: java.lang.Throwable -> L6b
            r9.put(r1, r10)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r8 = com.tendcloud.tenddata.l.c(r8)     // Catch: java.lang.Throwable -> L6b
            r9.put(r0, r8)     // Catch: java.lang.Throwable -> L6b
            goto L6b
        L5d:
            java.lang.String r10 = com.tendcloud.tenddata.l.a(r11)     // Catch: java.lang.Throwable -> L76
            r9.put(r7, r10)     // Catch: java.lang.Throwable -> L76
            java.lang.String r8 = com.tendcloud.tenddata.l.b(r8)     // Catch: java.lang.Throwable -> L76
            r9.put(r2, r8)     // Catch: java.lang.Throwable -> L76
        L6b:
            int r8 = r9.length()     // Catch: java.lang.Throwable -> L76
            if (r8 <= 0) goto L76
            org.json.JSONArray r8 = com.tendcloud.tenddata.o.w     // Catch: java.lang.Throwable -> L76
            r8.put(r9)     // Catch: java.lang.Throwable -> L76
        L76:
            org.json.JSONObject r12 = a(r12, r5, r3)     // Catch: java.lang.Throwable -> L186
            if (r4 == 0) goto Lb1
            boolean r4 = com.tendcloud.tenddata.y.a(r6)     // Catch: java.lang.Throwable -> L186
            java.lang.String r5 = "imei2"
            if (r4 == 0) goto La3
            java.lang.String r4 = com.tendcloud.tenddata.l.a(r5)     // Catch: java.lang.Throwable -> L92
            r12.put(r7, r4)     // Catch: java.lang.Throwable -> L92
            java.lang.String r4 = com.tendcloud.tenddata.l.b(r3)     // Catch: java.lang.Throwable -> L92
            r12.put(r2, r4)     // Catch: java.lang.Throwable -> L92
        L92:
            java.lang.String r2 = "meid2"
            java.lang.String r2 = com.tendcloud.tenddata.l.a(r2)     // Catch: java.lang.Throwable -> Lb1
            r12.put(r1, r2)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r1 = com.tendcloud.tenddata.l.c(r3)     // Catch: java.lang.Throwable -> Lb1
            r12.put(r0, r1)     // Catch: java.lang.Throwable -> Lb1
            goto Lb1
        La3:
            java.lang.String r0 = com.tendcloud.tenddata.l.a(r5)     // Catch: java.lang.Throwable -> L186
            r12.put(r7, r0)     // Catch: java.lang.Throwable -> L186
            java.lang.String r0 = com.tendcloud.tenddata.l.b(r3)     // Catch: java.lang.Throwable -> L186
            r12.put(r2, r0)     // Catch: java.lang.Throwable -> L186
        Lb1:
            int r0 = r12.length()     // Catch: java.lang.Throwable -> L186
            if (r0 <= 0) goto L186
            org.json.JSONArray r0 = com.tendcloud.tenddata.o.w     // Catch: java.lang.Throwable -> L186
            r0.put(r12)     // Catch: java.lang.Throwable -> L186
            goto L186
        Lbe:
            java.lang.String r0 = ""
            if (r4 == 0) goto Lc7
            java.lang.String r1 = r4.getDeviceId()     // Catch: java.lang.Throwable -> L186
            goto Lc8
        Lc7:
            r1 = r0
        Lc8:
            java.lang.String r2 = r1.trim()     // Catch: java.lang.Throwable -> L186
            java.lang.Boolean r2 = c(r2)     // Catch: java.lang.Throwable -> L186
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L186
            if (r2 == 0) goto Le8
            java.lang.String r2 = r1.trim()     // Catch: java.lang.Throwable -> L186
            r5.add(r2)     // Catch: java.lang.Throwable -> L186
            org.json.JSONObject r1 = a(r4, r1)     // Catch: java.lang.Throwable -> L186
            if (r1 == 0) goto Le8
            org.json.JSONArray r2 = com.tendcloud.tenddata.o.w     // Catch: java.lang.Throwable -> L186
            r2.put(r1)     // Catch: java.lang.Throwable -> L186
        Le8:
            java.lang.String r1 = "phone1"
            java.lang.Object r1 = r12.getSystemService(r1)     // Catch: java.lang.Throwable -> L118
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> L118
            if (r1 == 0) goto Lf7
            java.lang.String r2 = r1.getDeviceId()     // Catch: java.lang.Throwable -> L118
            goto Lf8
        Lf7:
            r2 = r0
        Lf8:
            if (r2 == 0) goto L118
            java.lang.Boolean r4 = c(r2)     // Catch: java.lang.Throwable -> L118
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L118
            if (r4 == 0) goto L118
            boolean r4 = r5.contains(r2)     // Catch: java.lang.Throwable -> L118
            if (r4 != 0) goto L118
            r5.add(r2)     // Catch: java.lang.Throwable -> L118
            org.json.JSONObject r1 = a(r1, r2)     // Catch: java.lang.Throwable -> L118
            if (r1 == 0) goto L118
            org.json.JSONArray r2 = com.tendcloud.tenddata.o.w     // Catch: java.lang.Throwable -> L118
            r2.put(r1)     // Catch: java.lang.Throwable -> L118
        L118:
            java.lang.String r1 = "phone2"
            java.lang.Object r1 = r12.getSystemService(r1)     // Catch: java.lang.Throwable -> L146
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> L146
            if (r1 == 0) goto L126
            java.lang.String r0 = r1.getDeviceId()     // Catch: java.lang.Throwable -> L146
        L126:
            if (r0 == 0) goto L146
            java.lang.Boolean r2 = c(r0)     // Catch: java.lang.Throwable -> L146
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L146
            if (r2 == 0) goto L146
            boolean r2 = r5.contains(r0)     // Catch: java.lang.Throwable -> L146
            if (r2 != 0) goto L146
            r5.add(r0)     // Catch: java.lang.Throwable -> L146
            org.json.JSONObject r0 = a(r1, r0)     // Catch: java.lang.Throwable -> L146
            if (r0 == 0) goto L146
            org.json.JSONArray r1 = com.tendcloud.tenddata.o.w     // Catch: java.lang.Throwable -> L146
            r1.put(r0)     // Catch: java.lang.Throwable -> L146
        L146:
            org.json.JSONArray r0 = H(r12)     // Catch: java.lang.Throwable -> L186
            org.json.JSONArray r1 = G(r12)     // Catch: java.lang.Throwable -> L186
            if (r1 == 0) goto L151
            r0 = r1
        L151:
            org.json.JSONArray r1 = F(r12)     // Catch: java.lang.Throwable -> L186
            if (r1 == 0) goto L158
            r0 = r1
        L158:
            org.json.JSONArray r12 = E(r12)     // Catch: java.lang.Throwable -> L186
            if (r12 == 0) goto L15f
            r0 = r12
        L15f:
            if (r0 == 0) goto L186
            int r12 = r0.length()     // Catch: java.lang.Throwable -> L186
            if (r12 <= 0) goto L186
        L167:
            int r12 = r0.length()     // Catch: java.lang.Throwable -> L186
            if (r8 >= r12) goto L186
            org.json.JSONObject r12 = r0.getJSONObject(r8)     // Catch: java.lang.Throwable -> L186
            java.lang.String r1 = r12.getString(r7)     // Catch: java.lang.Throwable -> L186
            boolean r2 = r5.contains(r1)     // Catch: java.lang.Throwable -> L186
            if (r2 != 0) goto L183
            r5.add(r1)     // Catch: java.lang.Throwable -> L186
            org.json.JSONArray r1 = com.tendcloud.tenddata.o.w     // Catch: java.lang.Throwable -> L186
            r1.put(r12)     // Catch: java.lang.Throwable -> L186
        L183:
            int r8 = r8 + 1
            goto L167
        L186:
            com.tendcloud.tenddata.o.x = r3
            return
    }

    private static org.json.JSONArray E(android.content.Context r10) {
            r0 = 0
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L95
            r1.<init>()     // Catch: java.lang.Throwable -> L95
            java.lang.String r2 = "phone"
            java.lang.Object r10 = r10.getSystemService(r2)     // Catch: java.lang.Throwable -> L95
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch: java.lang.Throwable -> L95
            java.lang.String r2 = "com.android.internal.telephony.Phone"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L95
            r3 = 0
            r4 = 1
            java.lang.String r5 = "GEMINI_SIM_1"
            java.lang.reflect.Field r5 = r2.getField(r5)     // Catch: java.lang.Throwable -> L35
            r5.setAccessible(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r5 = r5.get(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = "GEMINI_SIM_2"
            java.lang.reflect.Field r2 = r2.getField(r6)     // Catch: java.lang.Throwable -> L35
            r2.setAccessible(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L35
            goto L3d
        L35:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L95
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L95
        L3d:
            java.lang.Class<android.telephony.TelephonyManager> r6 = android.telephony.TelephonyManager.class
            java.lang.String r7 = "getDeviceIdGemini"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L95
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L95
            r8[r3] = r9     // Catch: java.lang.Throwable -> L95
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r8)     // Catch: java.lang.Throwable -> L95
            if (r10 == 0) goto L95
            if (r6 != 0) goto L50
            goto L95
        L50:
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L95
            r7[r3] = r5     // Catch: java.lang.Throwable -> L95
            java.lang.Object r7 = r6.invoke(r10, r7)     // Catch: java.lang.Throwable -> L95
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L95
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L95
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L95
            r4[r3] = r2     // Catch: java.lang.Throwable -> L95
            java.lang.Object r3 = r6.invoke(r10, r4)     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L95
            java.lang.Boolean r4 = c(r7)     // Catch: java.lang.Throwable -> L95
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L95
            java.lang.String r6 = "Gemini"
            if (r4 == 0) goto L81
            java.lang.Class<android.telephony.TelephonyManager> r4 = android.telephony.TelephonyManager.class
            org.json.JSONObject r4 = a(r4, r10, r5, r7, r6)     // Catch: java.lang.Throwable -> L95
            r1.put(r4)     // Catch: java.lang.Throwable -> L95
        L81:
            java.lang.Boolean r4 = c(r3)     // Catch: java.lang.Throwable -> L95
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L95
            if (r4 == 0) goto L94
            java.lang.Class<android.telephony.TelephonyManager> r4 = android.telephony.TelephonyManager.class
            org.json.JSONObject r10 = a(r4, r10, r2, r3, r6)     // Catch: java.lang.Throwable -> L95
            r1.put(r10)     // Catch: java.lang.Throwable -> L95
        L94:
            return r1
        L95:
            return r0
    }

    private static org.json.JSONArray F(android.content.Context r10) {
            r0 = 0
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L96
            r1.<init>()     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = "phone"
            java.lang.Object r10 = r10.getSystemService(r2)     // Catch: java.lang.Throwable -> L96
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = "com.android.internal.telephony.Phone"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L96
            r3 = 0
            r4 = 1
            java.lang.String r5 = "GEMINI_SIM_1"
            java.lang.reflect.Field r5 = r2.getField(r5)     // Catch: java.lang.Throwable -> L35
            r5.setAccessible(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r5 = r5.get(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = "GEMINI_SIM_2"
            java.lang.reflect.Field r2 = r2.getField(r6)     // Catch: java.lang.Throwable -> L35
            r2.setAccessible(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L35
            goto L3d
        L35:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L96
        L3d:
            java.lang.Class<android.telephony.TelephonyManager> r6 = android.telephony.TelephonyManager.class
            java.lang.String r7 = "getDefault"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L96
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L96
            r8[r3] = r9     // Catch: java.lang.Throwable -> L96
            java.lang.reflect.Method r6 = r6.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L96
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L96
            r7[r3] = r5     // Catch: java.lang.Throwable -> L96
            java.lang.Object r5 = r6.invoke(r10, r7)     // Catch: java.lang.Throwable -> L96
            android.telephony.TelephonyManager r5 = (android.telephony.TelephonyManager) r5     // Catch: java.lang.Throwable -> L96
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L96
            r4[r3] = r2     // Catch: java.lang.Throwable -> L96
            java.lang.Object r10 = r6.invoke(r10, r4)     // Catch: java.lang.Throwable -> L96
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = r5.getDeviceId()     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = r10.getDeviceId()     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L96
            java.lang.Boolean r4 = c(r2)     // Catch: java.lang.Throwable -> L96
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L96
            if (r4 == 0) goto L82
            org.json.JSONObject r2 = a(r5, r2)     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L82
            r1.put(r2)     // Catch: java.lang.Throwable -> L96
        L82:
            java.lang.Boolean r2 = c(r3)     // Catch: java.lang.Throwable -> L96
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L95
            org.json.JSONObject r10 = a(r10, r3)     // Catch: java.lang.Throwable -> L96
            if (r10 == 0) goto L95
            r1.put(r10)     // Catch: java.lang.Throwable -> L96
        L95:
            return r1
        L96:
            return r0
    }

    private static org.json.JSONArray G(android.content.Context r9) {
            java.lang.String r0 = "phone"
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L73
            r1.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = "com.android.internal.telephony.PhoneFactory"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = "getServiceName"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L73
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L73
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L73
            r8 = 1
            r5[r8] = r6     // Catch: java.lang.Throwable -> L73
            java.lang.reflect.Method r3 = r2.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L73
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L73
            r4[r7] = r0     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L73
            r4[r8] = r5     // Catch: java.lang.Throwable -> L73
            java.lang.Object r2 = r3.invoke(r2, r4)     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r9.getSystemService(r0)     // Catch: java.lang.Throwable -> L73
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = r0.getDeviceId()     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L73
            java.lang.Object r9 = r9.getSystemService(r2)     // Catch: java.lang.Throwable -> L73
            android.telephony.TelephonyManager r9 = (android.telephony.TelephonyManager) r9     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = r9.getDeviceId()     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r4 = c(r3)     // Catch: java.lang.Throwable -> L73
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L73
            if (r4 == 0) goto L5f
            org.json.JSONObject r0 = a(r0, r3)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L5f
            r1.put(r0)     // Catch: java.lang.Throwable -> L73
        L5f:
            java.lang.Boolean r0 = c(r2)     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L72
            org.json.JSONObject r9 = a(r9, r2)     // Catch: java.lang.Throwable -> L73
            if (r9 == 0) goto L72
            r1.put(r9)     // Catch: java.lang.Throwable -> L73
        L72:
            return r1
        L73:
            r9 = 0
            return r9
    }

    private static org.json.JSONArray H(android.content.Context r9) {
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L68
            r0.<init>()     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = "android.telephony.MSimTelephonyManager"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "phone_msim"
            java.lang.Object r9 = r9.getSystemService(r2)     // Catch: java.lang.Throwable -> L68
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L68
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L68
            java.lang.String r6 = "getDeviceId"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L68
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L68
            r7[r2] = r8     // Catch: java.lang.Throwable -> L68
            java.lang.reflect.Method r6 = r1.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L68
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L68
            r7[r2] = r3     // Catch: java.lang.Throwable -> L68
            java.lang.Object r7 = r6.invoke(r9, r7)     // Catch: java.lang.Throwable -> L68
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L68
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L68
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L68
            r4[r2] = r5     // Catch: java.lang.Throwable -> L68
            java.lang.Object r2 = r6.invoke(r9, r4)     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L68
            java.lang.Boolean r4 = c(r7)     // Catch: java.lang.Throwable -> L68
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L68
            java.lang.String r6 = ""
            if (r4 == 0) goto L56
            org.json.JSONObject r3 = a(r1, r9, r3, r7, r6)     // Catch: java.lang.Throwable -> L68
            r0.put(r3)     // Catch: java.lang.Throwable -> L68
        L56:
            java.lang.Boolean r3 = c(r2)     // Catch: java.lang.Throwable -> L68
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L67
            org.json.JSONObject r9 = a(r1, r9, r5, r2, r6)     // Catch: java.lang.Throwable -> L68
            r0.put(r9)     // Catch: java.lang.Throwable -> L68
        L67:
            return r0
        L68:
            r9 = 0
            return r9
    }

    private static java.lang.String a(int r2) {
            if (r2 < 0) goto La
            java.lang.String[] r0 = com.tendcloud.tenddata.o.e
            int r1 = r0.length
            if (r2 >= r1) goto La
            r2 = r0[r2]
            goto Le
        La:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        Le:
            return r2
    }

    public static java.lang.String a(java.lang.String r1) {
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.tendcloud.tenddata.o.d
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    public static org.json.JSONArray a(android.content.Context r5, boolean r6) {
            r0 = 0
            if (r5 != 0) goto L9
            android.content.Context r5 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> Lda
            if (r5 == 0) goto L8
            goto L9
        L8:
            return r0
        L9:
            org.json.JSONArray r1 = com.tendcloud.tenddata.o.m     // Catch: java.lang.Throwable -> Lda
            int r1 = r1.length()     // Catch: java.lang.Throwable -> Lda
            if (r1 > 0) goto Ld7
            boolean r1 = com.tendcloud.tenddata.o.k     // Catch: java.lang.Throwable -> Lda
            if (r1 == 0) goto L17
            goto Ld7
        L17:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lda
            r1.<init>()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r2 = "type"
            int r3 = n(r5)     // Catch: java.lang.Throwable -> Lda
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r2 = "mcc"
            java.lang.String r3 = o(r5)     // Catch: java.lang.Throwable -> Lda
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r2 = "operator"
            java.lang.String r3 = s(r5)     // Catch: java.lang.Throwable -> Lda
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r2 = "country"
            java.lang.String r3 = r(r5)     // Catch: java.lang.Throwable -> Lda
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lda
            com.tendcloud.tenddata.TalkingDataSDKConfig r2 = com.tendcloud.tenddata.ab.T     // Catch: java.lang.Throwable -> Lda
            boolean r2 = r2.isLocationEnabled()     // Catch: java.lang.Throwable -> Lda
            if (r2 == 0) goto L59
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r3 = com.tendcloud.tenddata.y.b(r5, r3)     // Catch: java.lang.Throwable -> Lda
            if (r3 != 0) goto L59
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r3 = com.tendcloud.tenddata.y.b(r5, r3)     // Catch: java.lang.Throwable -> Lda
            if (r3 != 0) goto L59
            r2 = 0
        L59:
            if (r2 == 0) goto Lcc
            android.telephony.TelephonyManager r2 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> Lda
            if (r2 != 0) goto L62
            a(r5)     // Catch: java.lang.Throwable -> Lda
        L62:
            boolean r5 = com.tendcloud.tenddata.y.c     // Catch: java.lang.Throwable -> Lda
            if (r5 != 0) goto L68
            if (r6 == 0) goto Lcc
        L68:
            boolean r5 = com.tendcloud.tenddata.ab.P     // Catch: java.lang.Throwable -> Lda
            if (r5 != 0) goto Lcc
            android.telephony.TelephonyManager r5 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> Lda
            android.telephony.CellLocation r5 = r5.getCellLocation()     // Catch: java.lang.Throwable -> Lda
            boolean r6 = r5 instanceof android.telephony.gsm.GsmCellLocation     // Catch: java.lang.Throwable -> Lda
            java.lang.String r2 = "basestationId"
            java.lang.String r3 = "networkId"
            java.lang.String r4 = "systemId"
            if (r6 == 0) goto L9e
            android.telephony.gsm.GsmCellLocation r5 = (android.telephony.gsm.GsmCellLocation) r5     // Catch: java.lang.Throwable -> Lda
            if (r5 == 0) goto Lcc
            int r6 = r5.getLac()     // Catch: java.lang.Throwable -> Lda
            r1.put(r4, r6)     // Catch: java.lang.Throwable -> Lda
            int r6 = r5.getCid()     // Catch: java.lang.Throwable -> Lda
            r1.put(r3, r6)     // Catch: java.lang.Throwable -> Lda
            r6 = 9
            boolean r6 = com.tendcloud.tenddata.y.a(r6)     // Catch: java.lang.Throwable -> Lda
            if (r6 == 0) goto Lcc
            int r5 = r5.getPsc()     // Catch: java.lang.Throwable -> Lda
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> Lda
            goto Lcc
        L9e:
            boolean r6 = r5 instanceof android.telephony.cdma.CdmaCellLocation     // Catch: java.lang.Throwable -> Lda
            if (r6 == 0) goto Lcc
            android.telephony.cdma.CdmaCellLocation r5 = (android.telephony.cdma.CdmaCellLocation) r5     // Catch: java.lang.Throwable -> Lda
            if (r5 == 0) goto Lcc
            int r6 = r5.getSystemId()     // Catch: java.lang.Throwable -> Lda
            r1.put(r4, r6)     // Catch: java.lang.Throwable -> Lda
            int r6 = r5.getNetworkId()     // Catch: java.lang.Throwable -> Lda
            r1.put(r3, r6)     // Catch: java.lang.Throwable -> Lda
            int r6 = r5.getBaseStationId()     // Catch: java.lang.Throwable -> Lda
            r1.put(r2, r6)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r6 = "location"
            int r2 = r5.getBaseStationLatitude()     // Catch: java.lang.Throwable -> Lda
            int r5 = r5.getBaseStationLongitude()     // Catch: java.lang.Throwable -> Lda
            org.json.JSONObject r5 = a(r2, r5)     // Catch: java.lang.Throwable -> Lda
            r1.put(r6, r5)     // Catch: java.lang.Throwable -> Lda
        Lcc:
            r5 = 1
            com.tendcloud.tenddata.o.k = r5     // Catch: java.lang.Throwable -> Lda
            org.json.JSONArray r5 = com.tendcloud.tenddata.o.m     // Catch: java.lang.Throwable -> Lda
            r5.put(r1)     // Catch: java.lang.Throwable -> Lda
            org.json.JSONArray r5 = com.tendcloud.tenddata.o.m     // Catch: java.lang.Throwable -> Lda
            return r5
        Ld7:
            org.json.JSONArray r5 = com.tendcloud.tenddata.o.m     // Catch: java.lang.Throwable -> Lda
            return r5
        Lda:
            return r0
    }

    public static org.json.JSONArray a(java.util.ArrayList r3, int r4) {
            com.tendcloud.tenddata.o$4 r0 = new com.tendcloud.tenddata.o$4     // Catch: java.lang.Throwable -> L1e
            r0.<init>()     // Catch: java.lang.Throwable -> L1e
            java.util.Collections.sort(r3, r0)     // Catch: java.lang.Throwable -> L1e
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            int r2 = r3.size()     // Catch: java.lang.Throwable -> L1e
            if (r2 <= r4) goto L12
            goto L16
        L12:
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L1e
        L16:
            java.util.List r3 = r3.subList(r1, r4)     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1e
            return r0
        L1e:
            r3 = 0
            return r3
    }

    private static org.json.JSONArray a(java.util.BitSet r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = r3.cardinality()
            r2 = 1
            if (r1 >= r2) goto Lc
            return r0
        Lc:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r1 = 0
        L12:
            int r1 = r3.nextSetBit(r1)
            if (r1 < 0) goto L1e
            r0.put(r1)
            int r1 = r1 + 1
            goto L12
        L1e:
            return r0
    }

    public static org.json.JSONArray a(org.json.JSONArray r4, int r5) {
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L3a
            if (r0 <= 0) goto L3a
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3a
            r0.<init>()     // Catch: java.lang.Throwable -> L3a
            r1 = 0
            r2 = r1
        Ld:
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L3a
            if (r2 >= r3) goto L1d
            org.json.JSONObject r3 = r4.optJSONObject(r2)     // Catch: java.lang.Throwable -> L3a
            r0.add(r3)     // Catch: java.lang.Throwable -> L3a
            int r2 = r2 + 1
            goto Ld
        L1d:
            com.tendcloud.tenddata.o$2 r4 = new com.tendcloud.tenddata.o$2     // Catch: java.lang.Throwable -> L3a
            r4.<init>()     // Catch: java.lang.Throwable -> L3a
            java.util.Collections.sort(r0, r4)     // Catch: java.lang.Throwable -> L3a
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L3a
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L3a
            if (r2 <= r5) goto L2e
            goto L32
        L2e:
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L3a
        L32:
            java.util.List r5 = r0.subList(r1, r5)     // Catch: java.lang.Throwable -> L3a
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3a
            return r4
        L3a:
            r4 = 0
            return r4
    }

    public static org.json.JSONObject a(int r2, int r3) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "lat"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "lng"
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "unit"
            java.lang.String r3 = "qd"
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L16
        L16:
            return r0
    }

    private static org.json.JSONObject a(android.content.Context r3, android.telephony.SubscriptionManager r4, int r5) {
            java.lang.String r3 = ""
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.tendcloud.tenddata.TalkingDataSDKConfig r1 = com.tendcloud.tenddata.ab.T
            boolean r1 = r1.isIMEIAndMEIDEnabled()
            if (r1 != 0) goto L10
            return r0
        L10:
            r1 = 22
            boolean r1 = com.tendcloud.tenddata.y.a(r1)     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L70
            android.telephony.SubscriptionInfo r4 = r4.getActiveSubscriptionInfoForSimSlotIndex(r5)     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L70
            java.lang.String r5 = "simSerialNumber"
            r0.put(r5, r3)     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = "simOperator"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r1.<init>()     // Catch: java.lang.Throwable -> L70
            int r2 = r4.getMcc()     // Catch: java.lang.Throwable -> L70
            r1.append(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = "0"
            r1.append(r2)     // Catch: java.lang.Throwable -> L70
            int r2 = r4.getMnc()     // Catch: java.lang.Throwable -> L70
            r1.append(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L70
            r0.put(r5, r1)     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = "simOperatorName"
            java.lang.CharSequence r1 = r4.getCarrierName()     // Catch: java.lang.Throwable -> L70
            if (r1 != 0) goto L4e
            r1 = r3
            goto L52
        L4e:
            java.lang.CharSequence r1 = r4.getCarrierName()     // Catch: java.lang.Throwable -> L70
        L52:
            r0.put(r5, r1)     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = "simCountryIso"
            java.lang.String r1 = r4.getCountryIso()     // Catch: java.lang.Throwable -> L70
            if (r1 != 0) goto L5e
            goto L62
        L5e:
            java.lang.String r3 = r4.getCountryIso()     // Catch: java.lang.Throwable -> L70
        L62:
            r0.put(r5, r3)     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = "subscriberId"
            java.lang.String r4 = "imsi"
            java.lang.String r4 = com.tendcloud.tenddata.l.a(r4)     // Catch: java.lang.Throwable -> L70
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L70
        L70:
            return r0
    }

    private static org.json.JSONObject a(android.telephony.TelephonyManager r4, java.lang.String r5) {
            com.tendcloud.tenddata.TalkingDataSDKConfig r0 = com.tendcloud.tenddata.ab.T
            boolean r0 = r0.isIMEIAndMEIDEnabled()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L86
            r0.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = "imei"
            java.lang.String r3 = r5.trim()     // Catch: java.lang.Throwable -> L86
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = "imei5"
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = com.tendcloud.tenddata.y.c(r5)     // Catch: java.lang.Throwable -> L86
            r0.put(r2, r5)     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = "dataState"
            int r2 = r4.getDataState()     // Catch: java.lang.Throwable -> L86
            r0.put(r5, r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = "networkType"
            int r2 = r4.getNetworkType()     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L86
            r0.put(r5, r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = "networkOperator"
            java.lang.String r2 = r4.getNetworkOperator()     // Catch: java.lang.Throwable -> L86
            r0.put(r5, r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = "phoneType"
            int r2 = r4.getPhoneType()     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = c(r2)     // Catch: java.lang.Throwable -> L86
            r0.put(r5, r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = "simOperator"
            java.lang.String r2 = r4.getSimOperator()     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = ""
            if (r2 != 0) goto L5d
            r2 = r3
            goto L61
        L5d:
            java.lang.String r2 = r4.getSimOperator()     // Catch: java.lang.Throwable -> L86
        L61:
            r0.put(r5, r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = "simOperatorName"
            java.lang.String r2 = r4.getSimOperatorName()     // Catch: java.lang.Throwable -> L86
            if (r2 != 0) goto L6e
            r2 = r3
            goto L72
        L6e:
            java.lang.String r2 = r4.getSimOperatorName()     // Catch: java.lang.Throwable -> L86
        L72:
            r0.put(r5, r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = "simCountryIso"
            java.lang.String r2 = r4.getSimCountryIso()     // Catch: java.lang.Throwable -> L86
            if (r2 != 0) goto L7e
            goto L82
        L7e:
            java.lang.String r3 = r4.getSimCountryIso()     // Catch: java.lang.Throwable -> L86
        L82:
            r0.put(r5, r3)     // Catch: java.lang.Throwable -> L86
            return r0
        L86:
            return r1
    }

    private static org.json.JSONObject a(java.lang.Class<?> r6, java.lang.Object r7, java.lang.Integer r8, java.lang.String r9, java.lang.String r10) {
            java.lang.String r0 = ""
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "imei"
            r1.put(r2, r9)
            java.lang.String r9 = com.tendcloud.tenddata.y.c(r9)
            java.lang.String r2 = "imei5"
            r1.put(r2, r9)
            r9 = 0
            r2 = 1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r3.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = "getDataState"
            r3.append(r4)     // Catch: java.lang.Throwable -> L41
            r3.append(r10)     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L41
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L41
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L41
            r4[r9] = r5     // Catch: java.lang.Throwable -> L41
            java.lang.reflect.Method r3 = r6.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = "dataState"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L41
            r5[r9] = r8     // Catch: java.lang.Throwable -> L41
            java.lang.Object r3 = r3.invoke(r7, r5)     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L41
            r1.put(r4, r3)     // Catch: java.lang.Throwable -> L41
        L41:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r3.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "getNetworkType"
            r3.append(r4)     // Catch: java.lang.Throwable -> L73
            r3.append(r10)     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L73
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L73
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L73
            r4[r9] = r5     // Catch: java.lang.Throwable -> L73
            java.lang.reflect.Method r3 = r6.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "networkType"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L73
            r5[r9] = r8     // Catch: java.lang.Throwable -> L73
            java.lang.Object r3 = r3.invoke(r7, r5)     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L73
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = a(r3)     // Catch: java.lang.Throwable -> L73
            r1.put(r4, r3)     // Catch: java.lang.Throwable -> L73
        L73:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r3.<init>()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = "getNetworkOperator"
            r3.append(r4)     // Catch: java.lang.Throwable -> L9d
            r3.append(r10)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L9d
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L9d
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L9d
            r4[r9] = r5     // Catch: java.lang.Throwable -> L9d
            java.lang.reflect.Method r3 = r6.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = "networkOperator"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L9d
            r5[r9] = r8     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r3 = r3.invoke(r7, r5)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L9d
            r1.put(r4, r3)     // Catch: java.lang.Throwable -> L9d
        L9d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcf
            r3.<init>()     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r4 = "getPhoneType"
            r3.append(r4)     // Catch: java.lang.Throwable -> Lcf
            r3.append(r10)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lcf
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> Lcf
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lcf
            r4[r9] = r5     // Catch: java.lang.Throwable -> Lcf
            java.lang.reflect.Method r3 = r6.getMethod(r3, r4)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r4 = "phoneType"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lcf
            r5[r9] = r8     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object r3 = r3.invoke(r7, r5)     // Catch: java.lang.Throwable -> Lcf
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> Lcf
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r3 = c(r3)     // Catch: java.lang.Throwable -> Lcf
            r1.put(r4, r3)     // Catch: java.lang.Throwable -> Lcf
        Lcf:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L109
            r3.<init>()     // Catch: java.lang.Throwable -> L109
            java.lang.String r4 = "getSimOperator"
            r3.append(r4)     // Catch: java.lang.Throwable -> L109
            r3.append(r10)     // Catch: java.lang.Throwable -> L109
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L109
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L109
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L109
            r4[r9] = r5     // Catch: java.lang.Throwable -> L109
            java.lang.reflect.Method r3 = r6.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L109
            java.lang.String r4 = "simOperator"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L109
            r5[r9] = r8     // Catch: java.lang.Throwable -> L109
            java.lang.Object r5 = r3.invoke(r7, r5)     // Catch: java.lang.Throwable -> L109
            if (r5 != 0) goto Lf8
            r3 = r0
            goto L106
        Lf8:
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L109
            r5[r9] = r8     // Catch: java.lang.Throwable -> L109
            java.lang.Object r3 = r3.invoke(r7, r5)     // Catch: java.lang.Throwable -> L109
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L109
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L109
        L106:
            r1.put(r4, r3)     // Catch: java.lang.Throwable -> L109
        L109:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L142
            r3.<init>()     // Catch: java.lang.Throwable -> L142
            java.lang.String r4 = "getSimOperatorName"
            r3.append(r4)     // Catch: java.lang.Throwable -> L142
            r3.append(r10)     // Catch: java.lang.Throwable -> L142
            java.lang.String r10 = r3.toString()     // Catch: java.lang.Throwable -> L142
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L142
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L142
            r3[r9] = r4     // Catch: java.lang.Throwable -> L142
            java.lang.reflect.Method r6 = r6.getMethod(r10, r3)     // Catch: java.lang.Throwable -> L142
            java.lang.String r10 = "simOperatorName"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L142
            r3[r9] = r8     // Catch: java.lang.Throwable -> L142
            java.lang.Object r3 = r6.invoke(r7, r3)     // Catch: java.lang.Throwable -> L142
            if (r3 != 0) goto L131
            goto L13f
        L131:
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L142
            r0[r9] = r8     // Catch: java.lang.Throwable -> L142
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch: java.lang.Throwable -> L142
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L142
            java.lang.String r0 = r6.trim()     // Catch: java.lang.Throwable -> L142
        L13f:
            r1.put(r10, r0)     // Catch: java.lang.Throwable -> L142
        L142:
            return r1
    }

    public static void a(android.content.Context r1) {
            java.lang.String r0 = "phone"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> La
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> La
            com.tendcloud.tenddata.o.c = r1     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    private static void a(java.lang.String[] r7) {
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()
            if (r0 != 0) goto L7
            return
        L7:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        Lc:
            boolean r2 = r0.hasMoreElements()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r0.nextElement()
            java.net.NetworkInterface r2 = (java.net.NetworkInterface) r2
            boolean r3 = r2.isLoopback()
            if (r3 == 0) goto L1f
            goto Lc
        L1f:
            java.lang.String r3 = r2.getName()
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r4 = "wlan"
            boolean r4 = r3.startsWith(r4)
            if (r4 != 0) goto Lc
            java.lang.String r4 = "eth"
            boolean r4 = r3.startsWith(r4)
            if (r4 != 0) goto Lc
            java.lang.String r4 = "dummy"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L40
            goto Lc
        L40:
            java.util.Enumeration r2 = r2.getInetAddresses()
            if (r2 == 0) goto Lc
            boolean r3 = r2.hasMoreElements()
            if (r3 != 0) goto L4d
            goto Lc
        L4d:
            java.util.ArrayList r2 = java.util.Collections.list(r2)
            r1.add(r2)
            goto Lc
        L55:
            int r0 = r1.size()
            if (r0 != 0) goto L5c
            return
        L5c:
            com.tendcloud.tenddata.o$1 r0 = new com.tendcloud.tenddata.o$1
            r0.<init>()
            java.util.Collections.sort(r1, r0)
            int r0 = r1.size()
            int r0 = r0 + (-1)
        L6a:
            if (r0 < 0) goto Lbc
            java.lang.Object r2 = r1.get(r0)
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L76:
            boolean r3 = r2.hasNext()
            r4 = 3
            r5 = 2
            if (r3 == 0) goto Lb0
            java.lang.Object r3 = r2.next()
            java.net.InetAddress r3 = (java.net.InetAddress) r3
            boolean r6 = r3.isLinkLocalAddress()
            if (r6 != 0) goto L76
            boolean r6 = r3.isLoopbackAddress()
            if (r6 == 0) goto L91
            goto L76
        L91:
            boolean r6 = r3 instanceof java.net.Inet4Address
            if (r6 == 0) goto L9c
            java.lang.String r3 = r3.getHostAddress()
            r7[r5] = r3
            goto L76
        L9c:
            boolean r5 = r3 instanceof java.net.Inet6Address
            if (r5 == 0) goto L76
            java.lang.String r3 = r3.getHostAddress()
            java.lang.String r5 = "ff:fe"
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto Lad
            goto L76
        Lad:
            r7[r4] = r3
            goto L76
        Lb0:
            r2 = r7[r5]
            if (r2 != 0) goto Lbc
            r2 = r7[r4]
            if (r2 == 0) goto Lb9
            goto Lbc
        Lb9:
            int r0 = r0 + (-1)
            goto L6a
        Lbc:
            return
    }

    public static java.lang.String[] a() {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[]{r0, r0, r0, r0}
            boolean r1 = com.tendcloud.tenddata.ab.R
            if (r1 == 0) goto La
            return r0
        La:
            android.content.Context r1 = com.tendcloud.tenddata.ab.g
            boolean r1 = i(r1)
            android.content.Context r2 = com.tendcloud.tenddata.ab.g
            boolean r2 = j(r2)
            if (r1 != 0) goto L24
            if (r2 != 0) goto L24
            java.lang.String r1 = "no-network"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            com.tendcloud.tenddata.h.iForInternal(r1)
            return r0
        L24:
            if (r1 == 0) goto L2a
            b(r0)     // Catch: java.lang.Throwable -> L2f
            goto L2f
        L2a:
            if (r2 == 0) goto L2f
            a(r0)     // Catch: java.lang.Throwable -> L2f
        L2f:
            return r0
    }

    private static java.lang.Boolean b(java.lang.String r4) {
            r0 = 48
            int r1 = r4.length()     // Catch: java.lang.Throwable -> L22
            r2 = 0
            if (r1 <= 0) goto Ld
            char r0 = r4.charAt(r2)     // Catch: java.lang.Throwable -> L22
        Ld:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L22
        Lf:
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L22
            if (r2 >= r3) goto L21
            char r3 = r4.charAt(r2)     // Catch: java.lang.Throwable -> L22
            if (r0 == r3) goto L1e
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L22
            goto L21
        L1e:
            int r2 = r2 + 1
            goto Lf
        L21:
            return r1
        L22:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
    }

    private static java.lang.String b(int r1) {
            java.lang.String r0 = "UNKNOWN"
            switch(r1) {
                case 1: goto Lc;
                case 2: goto Lc;
                case 3: goto L9;
                case 4: goto Lc;
                case 5: goto L9;
                case 6: goto L9;
                case 7: goto Lc;
                case 8: goto L9;
                case 9: goto L9;
                case 10: goto L9;
                case 11: goto Lc;
                case 12: goto L9;
                case 13: goto L6;
                case 14: goto L9;
                case 15: goto L9;
                case 16: goto Lc;
                case 17: goto L9;
                case 18: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            java.lang.String r0 = "4G"
            goto Le
        L9:
            java.lang.String r0 = "3G"
            goto Le
        Lc:
            java.lang.String r0 = "2G"
        Le:
            return r0
    }

    public static org.json.JSONArray b(org.json.JSONArray r4, int r5) {
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L3a
            if (r0 <= 0) goto L3a
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3a
            r0.<init>()     // Catch: java.lang.Throwable -> L3a
            r1 = 0
            r2 = r1
        Ld:
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L3a
            if (r2 >= r3) goto L1d
            org.json.JSONObject r3 = r4.optJSONObject(r2)     // Catch: java.lang.Throwable -> L3a
            r0.add(r3)     // Catch: java.lang.Throwable -> L3a
            int r2 = r2 + 1
            goto Ld
        L1d:
            com.tendcloud.tenddata.o$3 r4 = new com.tendcloud.tenddata.o$3     // Catch: java.lang.Throwable -> L3a
            r4.<init>()     // Catch: java.lang.Throwable -> L3a
            java.util.Collections.sort(r0, r4)     // Catch: java.lang.Throwable -> L3a
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L3a
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L3a
            if (r2 <= r5) goto L2e
            goto L32
        L2e:
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L3a
        L32:
            java.util.List r5 = r0.subList(r1, r5)     // Catch: java.lang.Throwable -> L3a
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3a
            return r4
        L3a:
            r4 = 0
            return r4
    }

    private static void b(java.lang.String[] r6) {
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r0.nextElement()
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1
            java.lang.String r2 = r1.getName()
            java.lang.String r2 = r2.toLowerCase()
            java.lang.String r3 = "wlan"
            boolean r2 = r2.startsWith(r3)
            if (r2 != 0) goto L24
            goto L7
        L24:
            java.util.Enumeration r1 = r1.getInetAddresses()
            if (r1 != 0) goto L2b
            goto L7
        L2b:
            boolean r2 = r1.hasMoreElements()
            if (r2 == 0) goto L7
            java.lang.Object r2 = r1.nextElement()
            java.net.InetAddress r2 = (java.net.InetAddress) r2
            if (r2 == 0) goto L2b
            boolean r3 = r2.isLoopbackAddress()
            if (r3 == 0) goto L40
            goto L2b
        L40:
            java.lang.String r3 = r2.getHostAddress()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L4b
            goto L2b
        L4b:
            boolean r4 = r2 instanceof java.net.Inet4Address
            r5 = 0
            if (r4 == 0) goto L53
            r6[r5] = r3
            goto L2b
        L53:
            boolean r2 = r2 instanceof java.net.Inet6Address
            if (r2 == 0) goto L2b
            java.lang.String r2 = "%"
            int r2 = r3.indexOf(r2)
            if (r2 <= 0) goto L63
            java.lang.String r3 = r3.substring(r5, r2)
        L63:
            r2 = 1
            r6[r2] = r3
            goto L2b
        L67:
            return
    }

    public static boolean b() {
            r0 = 11
            boolean r0 = com.tendcloud.tenddata.y.a(r0)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L15
            java.lang.String r0 = "http.proxyHost"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L20
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L20
            r0 = r0 ^ 1
            return r0
        L15:
            java.lang.String r0 = android.net.Proxy.getDefaultHost()     // Catch: java.lang.Throwable -> L20
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L20
            r0 = r0 ^ 1
            return r0
        L20:
            r0 = 0
            return r0
    }

    public static boolean b(android.content.Context r7) {
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = com.tendcloud.tenddata.y.b(r7, r0)     // Catch: java.lang.Throwable -> L97
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L52
            java.lang.String r0 = "connectivity"
            java.lang.Object r7 = r7.getSystemService(r0)     // Catch: java.lang.Throwable -> L97
            android.net.ConnectivityManager r7 = (android.net.ConnectivityManager) r7     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L52
            r0 = 29
            boolean r0 = com.tendcloud.tenddata.y.a(r0)     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L33
            android.net.Network r0 = r7.getActiveNetwork()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L52
            android.net.NetworkCapabilities r7 = r7.getNetworkCapabilities(r0)     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L31
            r0 = 12
            boolean r7 = r7.hasCapability(r0)     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L31
            goto L32
        L31:
            r1 = r2
        L32:
            return r1
        L33:
            android.net.NetworkInfo r0 = r7.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L3e
            boolean r7 = r0.isConnected()     // Catch: java.lang.Throwable -> L97
            return r7
        L3e:
            android.net.NetworkInfo r7 = r7.getNetworkInfo(r2)     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L51
            android.net.NetworkInfo$State r7 = r7.getState()     // Catch: java.lang.Throwable -> L97
            android.net.NetworkInfo$State r0 = android.net.NetworkInfo.State.UNKNOWN     // Catch: java.lang.Throwable -> L97
            boolean r7 = r7.equals(r0)     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L51
            goto L52
        L51:
            return r2
        L52:
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L97
            long r5 = com.tendcloud.tenddata.o.j     // Catch: java.lang.Throwable -> L97
            long r3 = r3 - r5
            r5 = 300000(0x493e0, double:1.482197E-318)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L97
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L97
            com.tendcloud.tenddata.o.j = r3     // Catch: java.lang.Throwable -> L97
            r7 = 0
            boolean r0 = b()     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L7b
            java.net.Socket r0 = new java.net.Socket     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = android.net.Proxy.getDefaultHost()     // Catch: java.lang.Throwable -> L8b
            int r4 = android.net.Proxy.getDefaultPort()     // Catch: java.lang.Throwable -> L8b
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L8b
            goto L84
        L7b:
            java.net.Socket r0 = new java.net.Socket     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = "www.talkingdata.net"
            r4 = 80
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L8b
        L84:
            r7 = r0
            com.tendcloud.tenddata.o.h = r1     // Catch: java.lang.Throwable -> L8b
        L87:
            r7.close()     // Catch: java.lang.Throwable -> L97
            goto L97
        L8b:
            com.tendcloud.tenddata.o.h = r2     // Catch: java.lang.Throwable -> L90
            if (r7 == 0) goto L97
            goto L87
        L90:
            r0 = move-exception
            if (r7 == 0) goto L96
            r7.close()     // Catch: java.lang.Throwable -> L96
        L96:
            throw r0     // Catch: java.lang.Throwable -> L97
        L97:
            boolean r7 = com.tendcloud.tenddata.o.h
            return r7
    }

    private static java.lang.Boolean c(java.lang.String r3) {
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L29
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L29
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L29
            r2 = 10
            if (r1 <= r2) goto L29
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L29
            r1 = 20
            if (r0 >= r1) goto L29
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L29
            java.lang.Boolean r3 = b(r3)     // Catch: java.lang.Throwable -> L29
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L29
            if (r3 != 0) goto L29
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L29
            return r3
        L29:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
    }

    private static java.lang.String c(int r2) {
            if (r2 < 0) goto La
            java.lang.String[] r0 = com.tendcloud.tenddata.o.f
            int r1 = r0.length
            if (r2 >= r1) goto La
            r2 = r0[r2]
            goto Le
        La:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        Le:
            return r2
    }

    private static java.lang.String c(java.lang.String[] r5) {
            r0 = 0
            if (r5 == 0) goto L35
            int r1 = r5.length
            r2 = 6
            if (r1 >= r2) goto L8
            goto L35
        L8:
            r1 = 0
            r2 = r1
        La:
            int r3 = r5.length
            if (r2 >= r3) goto L1d
            r3 = r5[r2]
            java.lang.String r4 = "lladdr"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L1a
            int r1 = r2 + 1
            goto L1d
        L1a:
            int r2 = r2 + 1
            goto La
        L1d:
            if (r1 <= 0) goto L35
            int r2 = r5.length
            if (r1 >= r2) goto L35
            r5 = r5[r1]
            java.lang.String r1 = "([\\da-fA-F]{2}:){5}([\\da-fA-F]{2}){1}"
            boolean r1 = r5.matches(r1)
            if (r1 == 0) goto L35
            java.lang.String r1 = "00:00:00:00:00:00"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L35
            return r5
        L35:
            return r0
    }

    private static java.util.Map<java.lang.String, java.lang.Object> c() {
            r0 = 29
            boolean r0 = com.tendcloud.tenddata.y.a(r0)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto Ld
            java.util.Map r0 = d()     // Catch: java.lang.Throwable -> L55
            return r0
        Ld:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L55
            r0.<init>()     // Catch: java.lang.Throwable -> L55
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L55
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L55
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = "/proc/net/arp"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L55
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L55
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L55
        L23:
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L51
            java.lang.String r3 = "[ ]+"
            java.lang.String[] r2 = r2.split(r3)     // Catch: java.lang.Throwable -> L55
            r3 = 0
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = "IP"
            boolean r4 = r4.matches(r5)     // Catch: java.lang.Throwable -> L55
            if (r4 != 0) goto L23
            r3 = r2[r3]     // Catch: java.lang.Throwable -> L55
            r4 = 3
            r2 = r2[r4]     // Catch: java.lang.Throwable -> L55
            boolean r4 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L55
            if (r4 != 0) goto L23
            java.lang.String r4 = "00:00:00:00:00:00"
            boolean r4 = r2.equals(r4)     // Catch: java.lang.Throwable -> L55
            if (r4 != 0) goto L23
            r0.put(r3, r2)     // Catch: java.lang.Throwable -> L55
            goto L23
        L51:
            r1.close()     // Catch: java.lang.Throwable -> L55
            return r0
        L55:
            r0 = 0
            return r0
    }

    public static boolean c(android.content.Context r2) {
            r0 = 0
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.tendcloud.tenddata.y.b(r2, r1)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L1e
            java.lang.String r1 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L1e
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch: java.lang.Throwable -> L1e
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L1e
            boolean r2 = r2.isAvailable()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L1e
            r0 = 1
        L1e:
            return r0
    }

    private static java.util.Map<java.lang.String, java.lang.Object> d() {
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = "ip n"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L66
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L64
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L64
            java.io.InputStream r4 = r1.getInputStream()     // Catch: java.lang.Throwable -> L64
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L64
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L64
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L61
            r3.<init>()     // Catch: java.lang.Throwable -> L61
        L1e:
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L57
            java.lang.String r4 = "lladdr"
            int r4 = r0.indexOf(r4)     // Catch: java.lang.Throwable -> L62
            r5 = -1
            if (r4 <= r5) goto L1e
            java.lang.String r4 = " "
            java.lang.String[] r0 = r0.split(r4)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L1e
            int r4 = r0.length     // Catch: java.lang.Throwable -> L62
            r5 = 5
            if (r4 <= r5) goto L1e
            r4 = 0
            r4 = r0[r4]     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = c(r0)     // Catch: java.lang.Throwable -> L62
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L1e
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto L4d
            goto L1e
        L4d:
            boolean r5 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L1e
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> L62
            goto L1e
        L57:
            r1.waitFor()     // Catch: java.lang.Throwable -> L62
            r2.close()     // Catch: java.lang.Throwable -> L5d
        L5d:
            r1.destroy()
            goto L70
        L61:
            r3 = r0
        L62:
            r0 = r2
            goto L68
        L64:
            r3 = r0
            goto L68
        L66:
            r1 = r0
            r3 = r1
        L68:
            if (r0 == 0) goto L6d
            r0.close()     // Catch: java.lang.Throwable -> L6d
        L6d:
            if (r1 == 0) goto L70
            goto L5d
        L70:
            return r3
    }

    public static boolean d(android.content.Context r1) {
            boolean r0 = i(r1)     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L8
            r1 = 1
            return r1
        L8:
            java.lang.String r0 = "wifi"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> L15
            android.net.wifi.WifiManager r1 = (android.net.wifi.WifiManager) r1     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.isWifiEnabled()     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    public static boolean e(android.content.Context r2) {
            r0 = 0
            android.telephony.TelephonyManager r1 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L8
            a(r2)     // Catch: java.lang.Throwable -> L12
        L8:
            android.telephony.TelephonyManager r2 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> L12
            int r2 = r2.getSimState()     // Catch: java.lang.Throwable -> L12
            r1 = 5
            if (r2 != r1) goto L12
            r0 = 1
        L12:
            return r0
    }

    public static boolean f(android.content.Context r5) {
            r0 = 1
            java.lang.String r1 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r1)     // Catch: java.lang.Throwable -> L24
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch: java.lang.Throwable -> L24
            java.lang.Class<android.net.ConnectivityManager> r1 = android.net.ConnectivityManager.class
            java.lang.String r2 = "getMobileDataEnabled"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.Throwable -> L24
            r1.setAccessible(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L24
            java.lang.Object r5 = r1.invoke(r5, r2)     // Catch: java.lang.Throwable -> L24
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L24
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L24
            return r5
        L24:
            return r0
    }

    public static boolean g(android.content.Context r4) {
            r0 = 17
            r1 = 0
            boolean r0 = com.tendcloud.tenddata.y.a(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "airplane_mode_on"
            r3 = 1
            if (r0 == 0) goto L18
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L23
            int r4 = android.provider.Settings.System.getInt(r4, r2, r1)     // Catch: java.lang.Throwable -> L23
            if (r4 != r3) goto L17
            r1 = r3
        L17:
            return r1
        L18:
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L23
            int r4 = android.provider.Settings.System.getInt(r4, r2, r1)     // Catch: java.lang.Throwable -> L23
            if (r4 != r3) goto L23
            r1 = r3
        L23:
            return r1
    }

    public static boolean h(android.content.Context r2) {
            r0 = 0
            android.telephony.TelephonyManager r1 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L8
            a(r2)     // Catch: java.lang.Throwable -> L14
        L8:
            android.telephony.TelephonyManager r2 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> L14
            int r2 = r2.getSimState()     // Catch: java.lang.Throwable -> L14
            r1 = 1
            if (r1 == r2) goto L14
            if (r2 == 0) goto L14
            r0 = r1
        L14:
            return r0
    }

    public static boolean i(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L9
            android.content.Context r3 = com.tendcloud.tenddata.ab.g
            if (r3 == 0) goto L8
            goto L9
        L8:
            return r0
        L9:
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.tendcloud.tenddata.y.b(r3, r1)     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L4b
            java.lang.String r1 = "connectivity"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> L4b
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L4b
            r1 = 29
            boolean r1 = com.tendcloud.tenddata.y.a(r1)     // Catch: java.lang.Throwable -> L4b
            r2 = 1
            if (r1 == 0) goto L38
            android.net.Network r1 = r3.getActiveNetwork()     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L4b
            android.net.NetworkCapabilities r3 = r3.getNetworkCapabilities(r1)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L37
            boolean r3 = r3.hasTransport(r2)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L37
            r0 = r2
        L37:
            return r0
        L38:
            android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L4b
            int r1 = r3.getType()     // Catch: java.lang.Throwable -> L4b
            if (r2 != r1) goto L4b
            boolean r3 = r3.isConnected()     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L4b
            r0 = r2
        L4b:
            return r0
    }

    public static boolean j(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L9
            android.content.Context r2 = com.tendcloud.tenddata.ab.g
            if (r2 == 0) goto L8
            goto L9
        L8:
            return r0
        L9:
            android.telephony.TelephonyManager r1 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L10
            a(r2)     // Catch: java.lang.Throwable -> L1a
        L10:
            android.telephony.TelephonyManager r2 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> L1a
            int r2 = r2.getDataState()     // Catch: java.lang.Throwable -> L1a
            r1 = 2
            if (r2 != r1) goto L1a
            r0 = 1
        L1a:
            return r0
    }

    public static java.lang.String k(android.content.Context r1) {
            boolean r0 = b(r1)
            if (r0 != 0) goto L9
            java.lang.String r1 = "OFFLINE"
            return r1
        L9:
            boolean r0 = i(r1)
            if (r0 == 0) goto L12
            java.lang.String r1 = "WIFI"
            return r1
        L12:
            int r1 = n(r1)
            java.lang.String r1 = a(r1)
            return r1
    }

    public static java.lang.String l(android.content.Context r1) {
            boolean r0 = b(r1)
            if (r0 != 0) goto L9
            java.lang.String r1 = "offline"
            return r1
        L9:
            boolean r1 = i(r1)
            if (r1 == 0) goto L12
            java.lang.String r1 = "wifi"
            return r1
        L12:
            java.lang.String r1 = "cellular"
            return r1
    }

    public static java.lang.String m(android.content.Context r2) {
            java.lang.String r0 = "UNKNOWN"
            if (r2 != 0) goto La
            android.content.Context r2 = com.tendcloud.tenddata.ab.g
            if (r2 == 0) goto L9
            goto La
        L9:
            return r0
        La:
            boolean r1 = b(r2)
            if (r1 != 0) goto L11
            return r0
        L11:
            boolean r0 = i(r2)
            if (r0 == 0) goto L1a
            java.lang.String r2 = "WIFI"
            return r2
        L1a:
            int r2 = n(r2)
            java.lang.String r2 = b(r2)
            return r2
    }

    public static int n(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L9
            android.content.Context r2 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L8
            goto L9
        L8:
            return r0
        L9:
            android.telephony.TelephonyManager r1 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L10
            a(r2)     // Catch: java.lang.Throwable -> L17
        L10:
            android.telephony.TelephonyManager r2 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> L17
            int r2 = r2.getNetworkType()     // Catch: java.lang.Throwable -> L17
            return r2
        L17:
            return r0
    }

    public static java.lang.String o(android.content.Context r1) {
            android.telephony.TelephonyManager r0 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L7
            a(r1)     // Catch: java.lang.Throwable -> Le
        L7:
            android.telephony.TelephonyManager r1 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r1.getNetworkOperator()     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static java.lang.String p(android.content.Context r1) {
            android.telephony.TelephonyManager r0 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L7
            a(r1)     // Catch: java.lang.Throwable -> Le
        L7:
            android.telephony.TelephonyManager r1 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r1.getSimOperator()     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static java.lang.String q(android.content.Context r3) {
            boolean r0 = com.tendcloud.tenddata.ab.Q
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            com.tendcloud.tenddata.TalkingDataSDKConfig r0 = com.tendcloud.tenddata.ab.T
            boolean r0 = r0.isWiFiEnable()
            if (r0 != 0) goto Lf
            return r1
        Lf:
            android.content.Context r0 = r3.getApplicationContext()
            java.lang.String r2 = "wifi"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0
            if (r0 == 0) goto L2f
            java.lang.String r2 = "android.permission.ACCESS_WIFI_STATE"
            boolean r3 = com.tendcloud.tenddata.y.b(r3, r2)
            if (r3 == 0) goto L2f
            android.net.wifi.WifiInfo r3 = r0.getConnectionInfo()
            if (r3 == 0) goto L2f
            java.lang.String r1 = r3.getBSSID()
        L2f:
            return r1
    }

    public static java.lang.String r(android.content.Context r1) {
            android.telephony.TelephonyManager r0 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L7
            a(r1)     // Catch: java.lang.Throwable -> Le
        L7:
            android.telephony.TelephonyManager r1 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r1.getNetworkCountryIso()     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static java.lang.String s(android.content.Context r1) {
            android.telephony.TelephonyManager r0 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L7
            a(r1)     // Catch: java.lang.Throwable -> Le
        L7:
            android.telephony.TelephonyManager r1 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r1.getNetworkOperatorName()     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static java.lang.String t(android.content.Context r1) {
            android.telephony.TelephonyManager r0 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L7
            a(r1)     // Catch: java.lang.Throwable -> Le
        L7:
            android.telephony.TelephonyManager r1 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r1.getSimOperatorName()     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static void tryGetDoubleSimInfoReCheck(android.content.Context r1) {
            org.json.JSONArray r0 = com.tendcloud.tenddata.o.w     // Catch: java.lang.Throwable -> L12
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L12
            if (r0 > 0) goto L11
            boolean r0 = com.tendcloud.tenddata.o.x     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Ld
            goto L11
        Ld:
            D(r1)     // Catch: java.lang.Throwable -> L12
            goto L16
        L11:
            return
        L12:
            r1 = move-exception
            com.tendcloud.tenddata.h.eForInternal(r1)
        L16:
            return
    }

    public static org.json.JSONArray u(android.content.Context r9) {
            java.lang.String r0 = "scannable"
            java.lang.String r1 = "current"
            java.lang.String r2 = "connected"
            java.lang.String r3 = "available"
            java.lang.String r4 = "type"
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L41
            r6.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r7 = "wifi"
            r6.put(r4, r7)     // Catch: java.lang.Throwable -> L41
            boolean r7 = d(r9)     // Catch: java.lang.Throwable -> L41
            r6.put(r3, r7)     // Catch: java.lang.Throwable -> L41
            boolean r7 = i(r9)     // Catch: java.lang.Throwable -> L41
            r6.put(r2, r7)     // Catch: java.lang.Throwable -> L41
            org.json.JSONArray r7 = y(r9)     // Catch: java.lang.Throwable -> L41
            r6.put(r1, r7)     // Catch: java.lang.Throwable -> L41
            org.json.JSONArray r7 = z(r9)     // Catch: java.lang.Throwable -> L41
            r6.put(r0, r7)     // Catch: java.lang.Throwable -> L41
            java.lang.String r7 = "configured"
            org.json.JSONArray r8 = x(r9)     // Catch: java.lang.Throwable -> L41
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L41
            r5.put(r6)     // Catch: java.lang.Throwable -> L41
        L41:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6b
            r6.<init>()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = "cellular"
            r6.put(r4, r7)     // Catch: java.lang.Throwable -> L6b
            boolean r4 = e(r9)     // Catch: java.lang.Throwable -> L6b
            r6.put(r3, r4)     // Catch: java.lang.Throwable -> L6b
            boolean r3 = j(r9)     // Catch: java.lang.Throwable -> L6b
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L6b
            r2 = 0
            org.json.JSONArray r2 = a(r9, r2)     // Catch: java.lang.Throwable -> L6b
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L6b
            org.json.JSONArray r9 = v(r9)     // Catch: java.lang.Throwable -> L6b
            r6.put(r0, r9)     // Catch: java.lang.Throwable -> L6b
            r5.put(r6)     // Catch: java.lang.Throwable -> L6b
        L6b:
            int r9 = r5.length()
            if (r9 <= 0) goto L72
            goto L73
        L72:
            r5 = 0
        L73:
            return r5
    }

    @android.annotation.TargetApi(18)
    public static org.json.JSONArray v(android.content.Context r13) {
            java.lang.String r0 = "cdmaDbm"
            com.tendcloud.tenddata.TalkingDataSDKConfig r1 = com.tendcloud.tenddata.ab.T
            boolean r1 = r1.isLocationEnabled()
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            boolean r1 = com.tendcloud.tenddata.ab.P
            if (r1 == 0) goto L11
            return r2
        L11:
            if (r13 != 0) goto L19
            android.content.Context r13 = com.tendcloud.tenddata.ab.g
            if (r13 == 0) goto L18
            goto L19
        L18:
            return r2
        L19:
            org.json.JSONArray r1 = com.tendcloud.tenddata.o.n
            if (r1 == 0) goto L2a
            int r1 = r1.length()
            if (r1 > 0) goto L27
            boolean r1 = com.tendcloud.tenddata.o.l
            if (r1 == 0) goto L2a
        L27:
            org.json.JSONArray r13 = com.tendcloud.tenddata.o.n
            return r13
        L2a:
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r1 = com.tendcloud.tenddata.y.b(r13, r1)
            if (r1 != 0) goto L3b
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r1 = com.tendcloud.tenddata.y.b(r13, r1)
            if (r1 != 0) goto L3b
            return r2
        L3b:
            android.telephony.TelephonyManager r1 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> L1a3
            if (r1 != 0) goto L42
            a(r13)     // Catch: java.lang.Throwable -> L1a3
        L42:
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L1a3
            r13.<init>()     // Catch: java.lang.Throwable -> L1a3
            r1 = 17
            boolean r1 = com.tendcloud.tenddata.y.a(r1)     // Catch: java.lang.Throwable -> L1a3
            if (r1 == 0) goto L197
            android.telephony.TelephonyManager r1 = com.tendcloud.tenddata.o.c     // Catch: java.lang.Throwable -> L1a3
            java.util.List r1 = r1.getAllCellInfo()     // Catch: java.lang.Throwable -> L1a3
            if (r1 == 0) goto L197
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1a3
        L5b:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L1a3
            if (r3 == 0) goto L197
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L1a3
            android.telephony.CellInfo r3 = (android.telephony.CellInfo) r3     // Catch: java.lang.Throwable -> L1a3
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5b
            r4.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = "registered"
            boolean r6 = r3.isRegistered()     // Catch: java.lang.Throwable -> L5b
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = "ts"
            long r6 = r3.getTimeStamp()     // Catch: java.lang.Throwable -> L5b
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L5b
            boolean r5 = r3 instanceof android.telephony.CellInfoGsm     // Catch: java.lang.Throwable -> L5b
            r6 = -1
            if (r5 == 0) goto La3
            java.lang.String r5 = "GSM"
            android.telephony.CellInfoGsm r3 = (android.telephony.CellInfoGsm) r3     // Catch: java.lang.Throwable -> L5b
            android.telephony.CellIdentityGsm r7 = r3.getCellIdentity()     // Catch: java.lang.Throwable -> L5b
            int r8 = r7.getLac()     // Catch: java.lang.Throwable -> L5b
            int r9 = r7.getCid()     // Catch: java.lang.Throwable -> L5b
            int r10 = r7.getMcc()     // Catch: java.lang.Throwable -> L5b
            int r7 = r7.getMnc()     // Catch: java.lang.Throwable -> L5b
            android.telephony.CellSignalStrengthGsm r3 = r3.getCellSignalStrength()     // Catch: java.lang.Throwable -> L5b
            r11 = r10
            r10 = r6
            goto L156
        La3:
            boolean r5 = r3 instanceof android.telephony.CellInfoCdma     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L105
            java.lang.String r5 = "CDMA"
            android.telephony.CellInfoCdma r3 = (android.telephony.CellInfoCdma) r3     // Catch: java.lang.Throwable -> L5b
            android.telephony.CellIdentityCdma r7 = r3.getCellIdentity()     // Catch: java.lang.Throwable -> L5b
            int r8 = r7.getSystemId()     // Catch: java.lang.Throwable -> L5b
            int r9 = r7.getNetworkId()     // Catch: java.lang.Throwable -> L5b
            int r10 = r7.getBasestationId()     // Catch: java.lang.Throwable -> L5b
            android.telephony.CellSignalStrengthCdma r3 = r3.getCellSignalStrength()     // Catch: java.lang.Throwable -> L5b
            int r11 = r3.getCdmaDbm()     // Catch: java.lang.Throwable -> L5b
            r4.put(r0, r11)     // Catch: java.lang.Throwable -> L5b
            int r11 = r3.getCdmaDbm()     // Catch: java.lang.Throwable -> L5b
            r4.put(r0, r11)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r11 = "cdmaEcio"
            int r12 = r3.getCdmaEcio()     // Catch: java.lang.Throwable -> L5b
            r4.put(r11, r12)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r11 = "evdoDbm"
            int r12 = r3.getEvdoDbm()     // Catch: java.lang.Throwable -> L5b
            r4.put(r11, r12)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r11 = "evdoEcio"
            int r12 = r3.getEvdoEcio()     // Catch: java.lang.Throwable -> L5b
            r4.put(r11, r12)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r11 = "evdoSnr"
            int r12 = r3.getEvdoSnr()     // Catch: java.lang.Throwable -> L5b
            r4.put(r11, r12)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r11 = "location"
            int r12 = r7.getLatitude()     // Catch: java.lang.Throwable -> L5b
            int r7 = r7.getLongitude()     // Catch: java.lang.Throwable -> L5b
            org.json.JSONObject r7 = a(r12, r7)     // Catch: java.lang.Throwable -> L5b
            r4.put(r11, r7)     // Catch: java.lang.Throwable -> L5b
            r7 = r6
            r11 = r7
            goto L156
        L105:
            boolean r5 = r3 instanceof android.telephony.CellInfoWcdma     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L12a
            java.lang.String r5 = "WCDMA"
            android.telephony.CellInfoWcdma r3 = (android.telephony.CellInfoWcdma) r3     // Catch: java.lang.Throwable -> L5b
            android.telephony.CellIdentityWcdma r7 = r3.getCellIdentity()     // Catch: java.lang.Throwable -> L5b
            int r8 = r7.getLac()     // Catch: java.lang.Throwable -> L5b
            int r9 = r7.getCid()     // Catch: java.lang.Throwable -> L5b
            int r10 = r7.getPsc()     // Catch: java.lang.Throwable -> L5b
            int r11 = r7.getMcc()     // Catch: java.lang.Throwable -> L5b
            int r7 = r7.getMnc()     // Catch: java.lang.Throwable -> L5b
            android.telephony.CellSignalStrengthWcdma r3 = r3.getCellSignalStrength()     // Catch: java.lang.Throwable -> L5b
            goto L156
        L12a:
            boolean r5 = r3 instanceof android.telephony.CellInfoLte     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L14f
            java.lang.String r5 = "LTE"
            android.telephony.CellInfoLte r3 = (android.telephony.CellInfoLte) r3     // Catch: java.lang.Throwable -> L5b
            android.telephony.CellIdentityLte r7 = r3.getCellIdentity()     // Catch: java.lang.Throwable -> L5b
            int r8 = r7.getTac()     // Catch: java.lang.Throwable -> L5b
            int r9 = r7.getPci()     // Catch: java.lang.Throwable -> L5b
            int r10 = r7.getCi()     // Catch: java.lang.Throwable -> L5b
            int r11 = r7.getMcc()     // Catch: java.lang.Throwable -> L5b
            int r7 = r7.getMnc()     // Catch: java.lang.Throwable -> L5b
            android.telephony.CellSignalStrengthLte r3 = r3.getCellSignalStrength()     // Catch: java.lang.Throwable -> L5b
            goto L156
        L14f:
            r3 = r2
            r5 = r3
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
        L156:
            if (r8 == r6) goto L15d
            java.lang.String r12 = "systemId"
            r4.put(r12, r8)     // Catch: java.lang.Throwable -> L5b
        L15d:
            if (r9 == r6) goto L164
            java.lang.String r8 = "networkId"
            r4.put(r8, r9)     // Catch: java.lang.Throwable -> L5b
        L164:
            if (r10 == r6) goto L16b
            java.lang.String r8 = "basestationId"
            r4.put(r8, r10)     // Catch: java.lang.Throwable -> L5b
        L16b:
            if (r11 == r6) goto L172
            java.lang.String r8 = "mcc"
            r4.put(r8, r11)     // Catch: java.lang.Throwable -> L5b
        L172:
            if (r7 == r6) goto L179
            java.lang.String r6 = "mnc"
            r4.put(r6, r7)     // Catch: java.lang.Throwable -> L5b
        L179:
            if (r3 == 0) goto L18d
            java.lang.String r6 = "asuLevel"
            int r7 = r3.getAsuLevel()     // Catch: java.lang.Throwable -> L5b
            r4.put(r6, r7)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = "dbm"
            int r3 = r3.getDbm()     // Catch: java.lang.Throwable -> L5b
            r4.put(r6, r3)     // Catch: java.lang.Throwable -> L5b
        L18d:
            java.lang.String r3 = "type"
            r4.put(r3, r5)     // Catch: java.lang.Throwable -> L5b
            r13.put(r4)     // Catch: java.lang.Throwable -> L5b
            goto L5b
        L197:
            r0 = 1
            com.tendcloud.tenddata.o.l = r0     // Catch: java.lang.Throwable -> L1a3
            r0 = 20
            org.json.JSONArray r13 = a(r13, r0)     // Catch: java.lang.Throwable -> L1a3
            com.tendcloud.tenddata.o.n = r13     // Catch: java.lang.Throwable -> L1a3
            return r13
        L1a3:
            return r2
    }

    public static java.lang.String w(android.content.Context r3) {
            boolean r0 = com.tendcloud.tenddata.ab.Q
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            com.tendcloud.tenddata.TalkingDataSDKConfig r0 = com.tendcloud.tenddata.ab.T
            boolean r0 = r0.isWiFiEnable()
            if (r0 != 0) goto Lf
            return r1
        Lf:
            java.lang.String r0 = "android.permission.ACCESS_WIFI_STATE"
            boolean r0 = com.tendcloud.tenddata.y.b(r3, r0)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L36
            java.lang.String r0 = "wifi"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch: java.lang.Throwable -> L36
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch: java.lang.Throwable -> L36
            boolean r2 = r0.isWifiEnabled()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L36
            boolean r3 = i(r3)     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L36
            android.net.wifi.WifiInfo r3 = r0.getConnectionInfo()     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L36
            java.lang.String r3 = r3.getSSID()     // Catch: java.lang.Throwable -> L36
            r1 = r3
        L36:
            return r1
    }

    public static org.json.JSONArray x(android.content.Context r6) {
            boolean r0 = com.tendcloud.tenddata.ab.Q
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            com.tendcloud.tenddata.TalkingDataSDKConfig r0 = com.tendcloud.tenddata.ab.T
            boolean r0 = r0.isWiFiEnable()
            if (r0 != 0) goto Lf
            return r1
        Lf:
            org.json.JSONArray r0 = com.tendcloud.tenddata.o.s
            if (r0 == 0) goto L20
            int r0 = r0.length()
            if (r0 > 0) goto L1d
            boolean r0 = com.tendcloud.tenddata.o.p
            if (r0 == 0) goto L20
        L1d:
            org.json.JSONArray r6 = com.tendcloud.tenddata.o.s
            return r6
        L20:
            java.lang.String r0 = "android.permission.ACCESS_WIFI_STATE"
            boolean r0 = com.tendcloud.tenddata.y.b(r6, r0)     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L7c
            java.lang.String r0 = "wifi"
            java.lang.Object r6 = r6.getSystemService(r0)     // Catch: java.lang.Throwable -> L7c
            android.net.wifi.WifiManager r6 = (android.net.wifi.WifiManager) r6     // Catch: java.lang.Throwable -> L7c
            java.util.List r6 = r6.getConfiguredNetworks()     // Catch: java.lang.Throwable -> L7c
            if (r6 == 0) goto L7c
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L7c
            r0.<init>()     // Catch: java.lang.Throwable -> L7c
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L7c
        L3f:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L70
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L7c
            android.net.wifi.WifiConfiguration r2 = (android.net.wifi.WifiConfiguration) r2     // Catch: java.lang.Throwable -> L7c
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3f
            r3.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "networkId"
            int r5 = r2.networkId     // Catch: java.lang.Throwable -> L3f
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "priority"
            int r5 = r2.priority     // Catch: java.lang.Throwable -> L3f
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "name"
            java.lang.String r5 = r2.SSID     // Catch: java.lang.Throwable -> L3f
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "id"
            java.lang.String r2 = r2.BSSID     // Catch: java.lang.Throwable -> L3f
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> L3f
            r0.put(r3)     // Catch: java.lang.Throwable -> L3f
            goto L3f
        L70:
            r6 = 1
            com.tendcloud.tenddata.o.p = r6     // Catch: java.lang.Throwable -> L7c
            r6 = 30
            org.json.JSONArray r6 = b(r0, r6)     // Catch: java.lang.Throwable -> L7c
            com.tendcloud.tenddata.o.s = r6     // Catch: java.lang.Throwable -> L7c
            return r6
        L7c:
            return r1
    }

    public static org.json.JSONArray y(android.content.Context r7) {
            java.lang.String r0 = "ip"
            boolean r1 = com.tendcloud.tenddata.ab.Q
            r2 = 0
            if (r1 == 0) goto L8
            return r2
        L8:
            org.json.JSONArray r1 = com.tendcloud.tenddata.o.r
            int r1 = r1.length()
            if (r1 > 0) goto Lc3
            boolean r1 = com.tendcloud.tenddata.o.o
            if (r1 == 0) goto L16
            goto Lc3
        L16:
            java.lang.String r1 = "android.permission.ACCESS_WIFI_STATE"
            boolean r1 = com.tendcloud.tenddata.y.b(r7, r1)     // Catch: java.lang.Throwable -> Lc2
            if (r1 == 0) goto Lc2
            java.lang.String r1 = "wifi"
            java.lang.Object r7 = r7.getSystemService(r1)     // Catch: java.lang.Throwable -> Lc2
            android.net.wifi.WifiManager r7 = (android.net.wifi.WifiManager) r7     // Catch: java.lang.Throwable -> Lc2
            boolean r1 = r7.isWifiEnabled()     // Catch: java.lang.Throwable -> Lc2
            if (r1 == 0) goto Lc2
            android.net.wifi.WifiInfo r1 = r7.getConnectionInfo()     // Catch: java.lang.Throwable -> Lc2
            if (r1 == 0) goto Lc2
            java.lang.String r3 = "bssid"
            java.lang.String r3 = a(r3)     // Catch: java.lang.Throwable -> Lc2
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc2
            r4.<init>()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r5 = "name"
            java.lang.String r6 = "ssid"
            java.lang.String r6 = a(r6)     // Catch: java.lang.Throwable -> Lb7
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r5 = "id"
            r4.put(r5, r3)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = "level"
            int r5 = r1.getRssi()     // Catch: java.lang.Throwable -> Lb7
            r4.put(r3, r5)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = "hidden"
            boolean r5 = r1.getHiddenSSID()     // Catch: java.lang.Throwable -> Lb7
            r4.put(r3, r5)     // Catch: java.lang.Throwable -> Lb7
            int r3 = r1.getIpAddress()     // Catch: java.lang.Throwable -> Lb7
            r4.put(r0, r3)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = "speed"
            int r5 = r1.getLinkSpeed()     // Catch: java.lang.Throwable -> Lb7
            r4.put(r3, r5)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = "networkId"
            int r1 = r1.getNetworkId()     // Catch: java.lang.Throwable -> Lb7
            r4.put(r3, r1)     // Catch: java.lang.Throwable -> Lb7
            android.net.DhcpInfo r7 = r7.getDhcpInfo()     // Catch: java.lang.Throwable -> Lb7
            if (r7 == 0) goto Lb7
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb7
            r1.<init>()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = "dns1"
            int r5 = r7.dns1     // Catch: java.lang.Throwable -> Lb7
            r1.put(r3, r5)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = "dns2"
            int r5 = r7.dns2     // Catch: java.lang.Throwable -> Lb7
            r1.put(r3, r5)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = "gw"
            int r5 = r7.gateway     // Catch: java.lang.Throwable -> Lb7
            r1.put(r3, r5)     // Catch: java.lang.Throwable -> Lb7
            int r3 = r7.ipAddress     // Catch: java.lang.Throwable -> Lb7
            r1.put(r0, r3)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = "mask"
            int r3 = r7.netmask     // Catch: java.lang.Throwable -> Lb7
            r1.put(r0, r3)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = "server"
            int r3 = r7.serverAddress     // Catch: java.lang.Throwable -> Lb7
            r1.put(r0, r3)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = "leaseDuration"
            int r7 = r7.leaseDuration     // Catch: java.lang.Throwable -> Lb7
            r1.put(r0, r7)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r7 = "dhcp"
            r4.put(r7, r1)     // Catch: java.lang.Throwable -> Lb7
        Lb7:
            r7 = 1
            com.tendcloud.tenddata.o.o = r7     // Catch: java.lang.Throwable -> Lc2
            org.json.JSONArray r7 = com.tendcloud.tenddata.o.r     // Catch: java.lang.Throwable -> Lc2
            r7.put(r4)     // Catch: java.lang.Throwable -> Lc2
            org.json.JSONArray r7 = com.tendcloud.tenddata.o.r     // Catch: java.lang.Throwable -> Lc2
            return r7
        Lc2:
            return r2
        Lc3:
            org.json.JSONArray r7 = com.tendcloud.tenddata.o.r
            return r7
    }

    public static synchronized org.json.JSONArray z(android.content.Context r13) {
            java.lang.Class<com.tendcloud.tenddata.o> r0 = com.tendcloud.tenddata.o.class
            monitor-enter(r0)
            boolean r1 = com.tendcloud.tenddata.y.c     // Catch: java.lang.Throwable -> Lec
            r2 = 0
            if (r1 != 0) goto La
            monitor-exit(r0)
            return r2
        La:
            boolean r1 = com.tendcloud.tenddata.ab.Q     // Catch: java.lang.Throwable -> Lec
            if (r1 == 0) goto L10
            monitor-exit(r0)
            return r2
        L10:
            com.tendcloud.tenddata.TalkingDataSDKConfig r1 = com.tendcloud.tenddata.ab.T     // Catch: java.lang.Throwable -> Lec
            boolean r1 = r1.isWiFiEnable()     // Catch: java.lang.Throwable -> Lec
            if (r1 != 0) goto L1a
            monitor-exit(r0)
            return r2
        L1a:
            org.json.JSONArray r1 = com.tendcloud.tenddata.o.t     // Catch: java.lang.Throwable -> Lec
            if (r1 == 0) goto L2c
            int r1 = r1.length()     // Catch: java.lang.Throwable -> Lec
            if (r1 > 0) goto L28
            boolean r1 = com.tendcloud.tenddata.o.q     // Catch: java.lang.Throwable -> Lec
            if (r1 == 0) goto L2c
        L28:
            org.json.JSONArray r13 = com.tendcloud.tenddata.o.t     // Catch: java.lang.Throwable -> Lec
            monitor-exit(r0)
            return r13
        L2c:
            java.lang.String r1 = "android.permission.ACCESS_WIFI_STATE"
            boolean r1 = com.tendcloud.tenddata.y.b(r13, r1)     // Catch: java.lang.Throwable -> Lea
            if (r1 == 0) goto Lea
            android.content.Context r1 = r13.getApplicationContext()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r3 = "wifi"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch: java.lang.Throwable -> Lea
            android.net.wifi.WifiManager r1 = (android.net.wifi.WifiManager) r1     // Catch: java.lang.Throwable -> Lea
            boolean r3 = r1.isWifiEnabled()     // Catch: java.lang.Throwable -> Lea
            if (r3 != 0) goto L4c
            boolean r3 = r1.isScanAlwaysAvailable()     // Catch: java.lang.Throwable -> Lea
            if (r3 == 0) goto Lea
        L4c:
            java.lang.String r3 = "android.permission.CHANGE_WIFI_STATE"
            boolean r3 = com.tendcloud.tenddata.y.b(r13, r3)     // Catch: java.lang.Throwable -> Lea
            r4 = 1
            if (r3 == 0) goto L67
            boolean r3 = com.tendcloud.tenddata.o.u     // Catch: java.lang.Throwable -> Lea
            if (r3 != 0) goto L67
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = "android.net.wifi.SCAN_RESULTS"
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L65
            com.tendcloud.tenddata.o$b r5 = com.tendcloud.tenddata.o.v     // Catch: java.lang.Throwable -> L65
            r13.registerReceiver(r5, r3)     // Catch: java.lang.Throwable -> L65
        L65:
            com.tendcloud.tenddata.o.u = r4     // Catch: java.lang.Throwable -> Lea
        L67:
            r1.startScan()     // Catch: java.lang.Throwable -> Lea
            com.tendcloud.tenddata.o$b r13 = com.tendcloud.tenddata.o.v     // Catch: java.lang.Throwable -> Lea
            r13.await()     // Catch: java.lang.Throwable -> Lea
            java.util.List r13 = r1.getScanResults()     // Catch: java.lang.Throwable -> Lea
            com.tendcloud.tenddata.o$b r1 = com.tendcloud.tenddata.o.v     // Catch: java.lang.Throwable -> Lea
            r1.reset()     // Catch: java.lang.Throwable -> Lea
            if (r13 == 0) goto Lea
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lea
            r1.<init>()     // Catch: java.lang.Throwable -> Lea
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> Lea
        L83:
            boolean r3 = r13.hasNext()     // Catch: java.lang.Throwable -> Lea
            if (r3 == 0) goto Lde
            java.lang.Object r3 = r13.next()     // Catch: java.lang.Throwable -> Lea
            android.net.wifi.ScanResult r3 = (android.net.wifi.ScanResult) r3     // Catch: java.lang.Throwable -> Lea
            int r5 = r3.level     // Catch: java.lang.Throwable -> Lea
            r6 = -85
            if (r5 >= r6) goto L96
            goto L83
        L96:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lea
            r5.<init>()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r6 = "id"
            java.lang.String r7 = r3.BSSID     // Catch: java.lang.Throwable -> L83
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = "name"
            java.lang.String r7 = r3.SSID     // Catch: java.lang.Throwable -> L83
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = "level"
            int r7 = r3.level     // Catch: java.lang.Throwable -> L83
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = "freq"
            int r7 = r3.frequency     // Catch: java.lang.Throwable -> L83
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L83
            r6 = 17
            boolean r6 = com.tendcloud.tenddata.y.a(r6)     // Catch: java.lang.Throwable -> L83
            if (r6 == 0) goto Lda
            java.lang.String r6 = "ts"
            long r7 = r3.timestamp     // Catch: java.lang.Throwable -> L83
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = "scanTs"
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L83
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L83
            long r7 = r7 - r9
            long r9 = r3.timestamp     // Catch: java.lang.Throwable -> L83
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r11
            long r7 = r7 + r9
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L83
        Lda:
            r1.add(r5)     // Catch: java.lang.Throwable -> L83
            goto L83
        Lde:
            com.tendcloud.tenddata.o.q = r4     // Catch: java.lang.Throwable -> Lea
            r13 = 20
            org.json.JSONArray r13 = a(r1, r13)     // Catch: java.lang.Throwable -> Lea
            com.tendcloud.tenddata.o.t = r13     // Catch: java.lang.Throwable -> Lea
            monitor-exit(r0)
            return r13
        Lea:
            monitor-exit(r0)
            return r2
        Lec:
            r13 = move-exception
            monitor-exit(r0)
            throw r13
    }
}
