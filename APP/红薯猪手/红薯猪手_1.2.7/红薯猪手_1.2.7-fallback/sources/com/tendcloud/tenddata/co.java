package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class co {
    private static java.lang.String a = "utf-8";
    private static final java.util.zip.CRC32 b = null;
    private static final int c = 5;
    private static final int d = 30000;
    private static final boolean g = true;
    private static final int h = 65536;
    private static volatile com.tendcloud.tenddata.co i;
    private static android.os.HandlerThread j;
    private long e;
    private boolean f;
    private android.os.Handler k;


    static {
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            com.tendcloud.tenddata.co.b = r0
            r0 = 0
            com.tendcloud.tenddata.co.i = r0
            com.tendcloud.tenddata.z r0 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> L15
            com.tendcloud.tenddata.co r1 = a()     // Catch: java.lang.Throwable -> L15
            r0.register(r1)     // Catch: java.lang.Throwable -> L15
        L15:
            return
    }

    private co() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.e = r0
            r0 = 1
            r3.f = r0
            r0 = 0
            r3.k = r0
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "ModuleDataForward"
            r2 = 10
            r0.<init>(r1, r2)
            com.tendcloud.tenddata.co.j = r0
            r0.start()
            com.tendcloud.tenddata.co$1 r0 = new com.tendcloud.tenddata.co$1
            android.os.HandlerThread r1 = com.tendcloud.tenddata.co.j
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r3, r1)
            r3.k = r0
            r3.b()
            return
    }

    public static com.tendcloud.tenddata.co a() {
            com.tendcloud.tenddata.co r0 = com.tendcloud.tenddata.co.i
            if (r0 != 0) goto L17
            java.lang.Class<com.tendcloud.tenddata.co> r0 = com.tendcloud.tenddata.co.class
            monitor-enter(r0)
            com.tendcloud.tenddata.co r1 = com.tendcloud.tenddata.co.i     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.tendcloud.tenddata.co r1 = new com.tendcloud.tenddata.co     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.tendcloud.tenddata.co.i = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.tendcloud.tenddata.co r0 = com.tendcloud.tenddata.co.i
            return r0
    }

    private static java.lang.String a(java.util.TreeSet<com.tendcloud.tenddata.cq> r3) {
            java.lang.String r0 = "["
            java.lang.StringBuilder r0 = p000.c4.m108(r0)
            java.util.Iterator r3 = r3.iterator()
        La:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r3.next()
            com.tendcloud.tenddata.cq r1 = (com.tendcloud.tenddata.cq) r1
            byte[] r2 = r1.c()
            if (r2 == 0) goto La
            byte[] r2 = r1.c()
            int r2 = r2.length
            if (r2 <= 0) goto La
            java.lang.String r2 = new java.lang.String
            byte[] r1 = r1.c()
            r2.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = ","
            r0.append(r1)
            goto La
        L35:
            int r3 = r0.length()
            int r3 = r3 + (-1)
            r0.deleteCharAt(r3)
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private void a(com.tendcloud.tenddata.a r13) {
            r12 = this;
            java.lang.String r0 = "SDK"
            android.content.Context r1 = com.tendcloud.tenddata.ab.g
            boolean r1 = com.tendcloud.tenddata.o.b(r1)
            if (r1 != 0) goto Lb
            return
        Lb:
            boolean r1 = r13.needToSendData()
            if (r1 != 0) goto L12
            return
        L12:
            r1 = 0
            int r2 = r13.index()     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r2 = com.tendcloud.tenddata.n.b.getFeatureLockFileName(r2)     // Catch: java.lang.Throwable -> L1a4
            boolean r2 = com.tendcloud.tenddata.n.a(r2)     // Catch: java.lang.Throwable -> L1a4
            if (r2 != 0) goto L2f
            if (r2 == 0) goto L2e
            int r13 = r13.index()
            java.lang.String r13 = com.tendcloud.tenddata.n.b.getFeatureLockFileName(r13)
            com.tendcloud.tenddata.n.releaseFileLock(r13)
        L2e:
            return
        L2f:
            com.tendcloud.tenddata.cp r3 = com.tendcloud.tenddata.cp.a()     // Catch: java.lang.Throwable -> L1a3
            java.util.TreeSet r3 = r3.a(r13)     // Catch: java.lang.Throwable -> L1a3
            if (r3 == 0) goto L190
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L1a3
            if (r4 > 0) goto L41
            goto L190
        L41:
            java.lang.String r4 = "New local data found!"
            r12.a(r4, r13, r1)     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r4 = a(r3)     // Catch: java.lang.Throwable -> L1a3
            byte[] r4 = com.tendcloud.tenddata.y.f(r4)     // Catch: java.lang.Throwable -> L1a3
            byte[] r3 = a(r3, r4)     // Catch: java.lang.Throwable -> L1a3
            com.tendcloud.tenddata.ap r4 = new com.tendcloud.tenddata.ap     // Catch: java.lang.Throwable -> L1a3
            r4.<init>()     // Catch: java.lang.Throwable -> L1a3
            r5 = 0
            java.lang.String r6 = r13.name()     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r7 = "PUSH"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L1a3
            if (r6 != 0) goto L6f
            byte[] r5 = com.tendcloud.tenddata.u.a(r3)     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r6 = "decrypt-version"
            java.lang.String r7 = "v1.0.0"
            r4.a(r6, r7)     // Catch: java.lang.Throwable -> L1a3
        L6f:
            if (r5 == 0) goto L72
            r3 = r5
        L72:
            java.util.zip.CRC32 r5 = com.tendcloud.tenddata.co.b     // Catch: java.lang.Throwable -> L1a3
            r5.reset()     // Catch: java.lang.Throwable -> L1a3
            r5.update(r3)     // Catch: java.lang.Throwable -> L1a3
            r6 = 1
            if (r3 == 0) goto L85
            int r7 = r3.length     // Catch: java.lang.Throwable -> L1a3
            if (r7 <= 0) goto L85
            java.lang.String r7 = "Submit local data to collector server ..."
            r12.a(r7, r13, r6)     // Catch: java.lang.Throwable -> L1a3
        L85:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r8 = r13.name()     // Catch: java.lang.Throwable -> L1a3
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r9 = "TD_app_pefercen_profile"
            if (r8 == 0) goto La0
            android.content.Context r8 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r10 = "TD_sdk_last_send_url"
            java.lang.String r11 = r13.getUrl()     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r8 = com.tendcloud.tenddata.s.b(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1a3
            goto La4
        La0:
            java.lang.String r8 = r13.getUrl()     // Catch: java.lang.Throwable -> L1a3
        La4:
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r8 = r13.name()     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r10 = "TRACKING"
            boolean r8 = r8.equals(r10)     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r10 = "/"
            if (r8 == 0) goto Ld5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a3
            r8.<init>()     // Catch: java.lang.Throwable -> L1a3
            r8.append(r10)     // Catch: java.lang.Throwable -> L1a3
            long r10 = r5.getValue()     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r5 = java.lang.Long.toHexString(r10)     // Catch: java.lang.Throwable -> L1a3
            r8.append(r5)     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Throwable -> L1a3
            r7.append(r5)     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r5 = "/1"
        Ld1:
            r7.append(r5)     // Catch: java.lang.Throwable -> L1a3
            goto Led
        Ld5:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a3
            r8.<init>()     // Catch: java.lang.Throwable -> L1a3
            r8.append(r10)     // Catch: java.lang.Throwable -> L1a3
            long r10 = r5.getValue()     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r5 = java.lang.Long.toHexString(r10)     // Catch: java.lang.Throwable -> L1a3
            r8.append(r5)     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Throwable -> L1a3
            goto Ld1
        Led:
            com.tendcloud.tenddata.an$a r5 = com.tendcloud.tenddata.an.a.EMPTY     // Catch: java.lang.Throwable -> L1a3
            com.tendcloud.tenddata.an r8 = new com.tendcloud.tenddata.an     // Catch: java.lang.Throwable -> L1a3
            r8.<init>(r5, r3)     // Catch: java.lang.Throwable -> L1a3
            com.tendcloud.tenddata.am$a r3 = com.tendcloud.tenddata.al.a()     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L1a3
            com.tendcloud.tenddata.am$a r3 = r3.url(r5)     // Catch: java.lang.Throwable -> L1a3
            com.tendcloud.tenddata.am$a r3 = r3.body(r8)     // Catch: java.lang.Throwable -> L1a3
            com.tendcloud.tenddata.aq r5 = com.tendcloud.tenddata.aq.b     // Catch: java.lang.Throwable -> L1a3
            com.tendcloud.tenddata.am$a r3 = r3.method(r5)     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r5 = r13.getCert()     // Catch: java.lang.Throwable -> L1a3
            com.tendcloud.tenddata.am$a r3 = r3.cert(r5)     // Catch: java.lang.Throwable -> L1a3
            com.tendcloud.tenddata.am$a r3 = r3.header(r4)     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r4 = r13.name()     // Catch: java.lang.Throwable -> L1a3
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> L1a3
            if (r0 == 0) goto L12d
            android.content.Context r0 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r4 = "TD_sdk_last_send_host"
            java.lang.String r5 = r13.getHost()     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r0 = com.tendcloud.tenddata.s.b(r0, r9, r4, r5)     // Catch: java.lang.Throwable -> L1a3
            goto L131
        L12d:
            java.lang.String r0 = r13.getHost()     // Catch: java.lang.Throwable -> L1a3
        L131:
            com.tendcloud.tenddata.am$a r0 = r3.host(r0)     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r3 = r13.getIP()     // Catch: java.lang.Throwable -> L1a3
            com.tendcloud.tenddata.am$a r0 = r0.ip(r3)     // Catch: java.lang.Throwable -> L1a3
            com.tendcloud.tenddata.am r0 = r0.build()     // Catch: java.lang.Throwable -> L1a3
            com.tendcloud.tenddata.ar r0 = com.tendcloud.tenddata.al.a(r0, r13)     // Catch: java.lang.Throwable -> L1a3
            int r3 = r0.b()     // Catch: java.lang.Throwable -> L1a3
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L167
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L1a3
            r12.e = r3     // Catch: java.lang.Throwable -> L1a3
            r12.f = r6     // Catch: java.lang.Throwable -> L1a3
            com.tendcloud.tenddata.cp r0 = com.tendcloud.tenddata.cp.a()     // Catch: java.lang.Throwable -> L1a3
            r0.sendMessageSuccess(r13)     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r0 = "Data submitted successfully!"
            r12.a(r0, r13, r6)     // Catch: java.lang.Throwable -> L1a3
            java.util.concurrent.atomic.AtomicInteger r0 = com.tendcloud.tenddata.ab.X     // Catch: java.lang.Throwable -> L1a3
            r0.set(r1)     // Catch: java.lang.Throwable -> L1a3
            goto L18d
        L167:
            java.util.concurrent.atomic.AtomicInteger r3 = com.tendcloud.tenddata.ab.X     // Catch: java.lang.Throwable -> L1a3
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L1a3
            com.tendcloud.tenddata.cp r3 = com.tendcloud.tenddata.cp.a()     // Catch: java.lang.Throwable -> L1a3
            r3.sendMessageFaild(r13)     // Catch: java.lang.Throwable -> L1a3
            r12.f = r1     // Catch: java.lang.Throwable -> L1a3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a3
            r1.<init>()     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r3 = "Failed to submit data! Response code "
            r1.append(r3)     // Catch: java.lang.Throwable -> L1a3
            int r0 = r0.b()     // Catch: java.lang.Throwable -> L1a3
            r1.append(r0)     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L1a3
            r12.a(r0, r13, r6)     // Catch: java.lang.Throwable -> L1a3
        L18d:
            if (r2 == 0) goto L1b1
            goto L1a6
        L190:
            java.lang.String r0 = "No new data found!"
            r12.a(r0, r13, r1)     // Catch: java.lang.Throwable -> L1a3
            if (r2 == 0) goto L1a2
            int r13 = r13.index()
            java.lang.String r13 = com.tendcloud.tenddata.n.b.getFeatureLockFileName(r13)
            com.tendcloud.tenddata.n.releaseFileLock(r13)
        L1a2:
            return
        L1a3:
            r1 = r2
        L1a4:
            if (r1 == 0) goto L1b1
        L1a6:
            int r13 = r13.index()
            java.lang.String r13 = com.tendcloud.tenddata.n.b.getFeatureLockFileName(r13)
            com.tendcloud.tenddata.n.releaseFileLock(r13)
        L1b1:
            return
    }

    public static /* synthetic */ void a(com.tendcloud.tenddata.co r0) {
            r0.b()
            return
    }

    public static /* synthetic */ void a(com.tendcloud.tenddata.co r0, com.tendcloud.tenddata.a r1) {
            r0.a(r1)
            return
    }

    private void a(java.lang.String r4, com.tendcloud.tenddata.a r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "["
            java.lang.StringBuilder r0 = p000.c4.m108(r0)
            java.lang.String r1 = r5.name()
            r0.append(r1)
            java.lang.String r1 = "] "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            int r5 = r5.index()
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L39
            if (r5 == r1) goto L39
            r2 = 3
            if (r5 == r2) goto L39
            r2 = 99
            if (r5 == r2) goto L39
            r2 = 7
            if (r5 == r2) goto L39
            r2 = 8
            if (r5 == r2) goto L39
            java.lang.String[] r5 = new java.lang.String[r1]
            r5[r0] = r4
            com.tendcloud.tenddata.h.iForInternal(r5)
            goto L46
        L39:
            if (r6 == 0) goto L3f
            com.tendcloud.tenddata.h.iForDeveloper(r4)
            goto L46
        L3f:
            java.lang.String[] r5 = new java.lang.String[r1]
            r5[r0] = r4
            com.tendcloud.tenddata.h.dForInternal(r5)
        L46:
            return
    }

    private static byte[] a(java.util.TreeSet<com.tendcloud.tenddata.cq> r3, byte[] r4) {
            int r0 = r4.length     // Catch: java.lang.Throwable -> L25
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 < r1) goto L25
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L25
            r1 = 1
            if (r0 != r1) goto Ld
            return r4
        Ld:
            r1 = 0
        Le:
            int r2 = r0 / 2
            if (r1 >= r2) goto L18
            r3.pollLast()     // Catch: java.lang.Throwable -> L25
            int r1 = r1 + 1
            goto Le
        L18:
            java.lang.String r0 = a(r3)     // Catch: java.lang.Throwable -> L25
            byte[] r0 = com.tendcloud.tenddata.y.f(r0)     // Catch: java.lang.Throwable -> L25
            byte[] r3 = a(r3, r0)     // Catch: java.lang.Throwable -> L25
            r4 = r3
        L25:
            return r4
    }

    public static byte[] a(byte[] r6) {
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r0 = new byte[r0]
            r1 = 0
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L35
            java.util.zip.InflaterInputStream r3 = new java.util.zip.InflaterInputStream     // Catch: java.lang.Exception -> L35
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L35
            r4.<init>(r6)     // Catch: java.lang.Exception -> L35
            java.util.zip.Inflater r6 = new java.util.zip.Inflater     // Catch: java.lang.Exception -> L35
            r5 = 0
            r6.<init>(r5)     // Catch: java.lang.Exception -> L35
            r3.<init>(r4, r6)     // Catch: java.lang.Exception -> L35
            r2.<init>(r3)     // Catch: java.lang.Exception -> L35
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L36
            r6.<init>()     // Catch: java.lang.Exception -> L36
        L1f:
            int r3 = r2.read(r0)     // Catch: java.lang.Exception -> L36
            r4 = -1
            if (r3 == r4) goto L2a
            r6.write(r0, r5, r3)     // Catch: java.lang.Exception -> L36
            goto L1f
        L2a:
            r6.close()     // Catch: java.lang.Exception -> L36
            r2.close()     // Catch: java.lang.Exception -> L36
            byte[] r6 = r6.toByteArray()     // Catch: java.lang.Exception -> L36
            return r6
        L35:
            r2 = r1
        L36:
            if (r2 == 0) goto L40
            r2.close()     // Catch: java.io.IOException -> L3c
            goto L40
        L3c:
            r6 = move-exception
            r6.printStackTrace()
        L40:
            return r1
    }

    private void b() {
            r7 = this;
            android.os.Handler r0 = r7.k
            r1 = 5
            boolean r0 = r0.hasMessages(r1)
            if (r0 != 0) goto L66
            java.security.SecureRandom r0 = com.tendcloud.tenddata.y.b()     // Catch: java.lang.Throwable -> L66
            int[] r2 = com.tendcloud.tenddata.ab.a()     // Catch: java.lang.Throwable -> L66
            android.content.Context r3 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L66
            boolean r3 = com.tendcloud.tenddata.o.i(r3)     // Catch: java.lang.Throwable -> L66
            r4 = 30000(0x7530, float:4.2039E-41)
            r5 = 1
            if (r3 == 0) goto L2c
            boolean r3 = r7.f     // Catch: java.lang.Throwable -> L66
            if (r3 != 0) goto L29
            r2 = r2[r5]     // Catch: java.lang.Throwable -> L66
            int r2 = r2 * r5
            int r0 = r0.nextInt(r4)     // Catch: java.lang.Throwable -> L66
            int r2 = r2 + r0
            goto L41
        L29:
            r2 = r2[r5]     // Catch: java.lang.Throwable -> L66
            goto L41
        L2c:
            boolean r3 = r7.f     // Catch: java.lang.Throwable -> L66
            r6 = 0
            if (r3 != 0) goto L3e
            r2 = r2[r6]     // Catch: java.lang.Throwable -> L66
            int r2 = r2 * r5
            r3 = 60000(0xea60, float:8.4078E-41)
            int r0 = r0.nextInt(r3)     // Catch: java.lang.Throwable -> L66
            int r0 = r0 - r4
            int r0 = r0 + r2
            goto L40
        L3e:
            r0 = r2[r6]     // Catch: java.lang.Throwable -> L66
        L40:
            r2 = r0
        L41:
            r0 = 1800000(0x1b7740, float:2.522337E-39)
            if (r2 <= r0) goto L47
            r2 = r0
        L47:
            java.util.ArrayList r0 = com.tendcloud.tenddata.a.getFeaturesList()     // Catch: java.lang.Throwable -> L66
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L66
        L4f:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto L66
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L66
            com.tendcloud.tenddata.a r3 = (com.tendcloud.tenddata.a) r3     // Catch: java.lang.Throwable -> L66
            android.os.Handler r4 = r7.k     // Catch: java.lang.Throwable -> L66
            android.os.Message r3 = android.os.Message.obtain(r4, r1, r3)     // Catch: java.lang.Throwable -> L66
            long r5 = (long) r2     // Catch: java.lang.Throwable -> L66
            r4.sendMessageDelayed(r3, r5)     // Catch: java.lang.Throwable -> L66
            goto L4f
        L66:
            return
    }

    public final void onTDEBEventForwardRequest(com.tendcloud.tenddata.bu r7) {
            r6 = this;
            if (r7 == 0) goto L65
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L7
            goto L65
        L7:
            com.tendcloud.tenddata.bu$a r0 = r7.b
            com.tendcloud.tenddata.bu$a r1 = com.tendcloud.tenddata.bu.a.IMMEDIATELY
            boolean r0 = r0.equals(r1)
            r1 = 5
            if (r0 == 0) goto L2d
            android.os.Handler r0 = r6.k
            com.tendcloud.tenddata.a r2 = r7.a
            boolean r0 = r0.hasMessages(r1, r2)
            if (r0 == 0) goto L21
            android.os.Handler r0 = r6.k
            r0.removeMessages(r1)
        L21:
            android.os.Handler r0 = r6.k
            com.tendcloud.tenddata.a r7 = r7.a
            android.os.Message r7 = android.os.Message.obtain(r0, r1, r7)
            r7.sendToTarget()
            goto L65
        L2d:
            com.tendcloud.tenddata.bu$a r0 = r7.b
            com.tendcloud.tenddata.bu$a r2 = com.tendcloud.tenddata.bu.a.HIGH
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L65
            android.os.Handler r0 = r6.k
            boolean r0 = r0.hasMessages(r1)
            if (r0 == 0) goto L44
            android.os.Handler r0 = r6.k
            r0.removeMessages(r1)
        L44:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.e
            long r2 = r2 - r4
            r4 = 30000(0x7530, double:1.4822E-319)
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L57
            goto L58
        L57:
            r4 = r2
        L58:
            android.os.Handler r0 = r6.k
            com.tendcloud.tenddata.a r7 = r7.a
            android.os.Message r7 = android.os.Message.obtain(r0, r1, r7)
            android.os.Handler r0 = r6.k
            r0.sendMessageDelayed(r7, r4)
        L65:
            return
    }
}
