package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class zz implements com.tendcloud.tenddata.ao {
    public static java.lang.String a = null;
    public static volatile boolean b = false;
    public static volatile boolean c = false;
    public static boolean d = false;
    public static com.tendcloud.tenddata.b e = null;
    public static final int f = 102;
    private static volatile com.tendcloud.tenddata.zz g = null;
    private static final java.lang.String h = "Function startA was not executed correctly!";
    private static java.lang.String i = null;
    private static java.lang.String j = null;
    private static java.lang.String k = null;
    private static boolean l = false;
    private static final int m = 101;
    private static final int n = 103;
    private static android.os.Handler o;
    private static final android.os.HandlerThread p = null;
    private static android.os.Handler q;
    private static final android.os.HandlerThread r = null;




































    public static class a {
        public java.util.HashMap<java.lang.String, java.lang.Object> paraMap;

        public a() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.paraMap = r0
                return
        }
    }

    static {
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "ProcessingThread"
            r2 = 10
            r0.<init>(r1, r2)
            com.tendcloud.tenddata.zz.p = r0
            r1 = 0
            com.tendcloud.tenddata.zz.q = r1
            android.os.HandlerThread r1 = new android.os.HandlerThread
            java.lang.String r3 = "PauseEventThread"
            r1.<init>(r3, r2)
            com.tendcloud.tenddata.zz.r = r1
            r0.start()
            com.tendcloud.tenddata.zz$1 r2 = new com.tendcloud.tenddata.zz$1
            android.os.Looper r0 = r0.getLooper()
            r2.<init>(r0)
            com.tendcloud.tenddata.zz.o = r2
            r1.start()
            com.tendcloud.tenddata.zz$12 r0 = new com.tendcloud.tenddata.zz$12
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r1)
            com.tendcloud.tenddata.zz.q = r0
            return
    }

    public zz() {
            r0 = this;
            r0.<init>()
            com.tendcloud.tenddata.zz.g = r0
            return
    }

    public static synchronized com.tendcloud.tenddata.zz a() {
            java.lang.Class<com.tendcloud.tenddata.zz> r0 = com.tendcloud.tenddata.zz.class
            monitor-enter(r0)
            com.tendcloud.tenddata.zz r1 = com.tendcloud.tenddata.zz.g     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L18
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L1c
            com.tendcloud.tenddata.zz r1 = com.tendcloud.tenddata.zz.g     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L13
            com.tendcloud.tenddata.zz r1 = new com.tendcloud.tenddata.zz     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            com.tendcloud.tenddata.zz.g = r1     // Catch: java.lang.Throwable -> L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1     // Catch: java.lang.Throwable -> L1c
        L18:
            com.tendcloud.tenddata.zz r1 = com.tendcloud.tenddata.zz.g     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return r1
        L1c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    private void a(android.content.Context r5) {
            r4 = this;
            r0 = 14
            boolean r0 = com.tendcloud.tenddata.y.a(r0)
            r1 = 1
            if (r0 == 0) goto L31
            r5 = 0
            android.content.Context r0 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L5b
            boolean r2 = r0 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L17
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> L5b
            android.app.Application r5 = r0.getApplication()     // Catch: java.lang.Throwable -> L5b
            goto L1e
        L17:
            boolean r2 = r0 instanceof android.app.Application     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L1e
            r5 = r0
            android.app.Application r5 = (android.app.Application) r5     // Catch: java.lang.Throwable -> L5b
        L1e:
            if (r5 == 0) goto L5b
            boolean r0 = com.tendcloud.tenddata.zz.l     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L5b
            com.tendcloud.tenddata.b r0 = new com.tendcloud.tenddata.b     // Catch: java.lang.Throwable -> L5b
            r0.<init>()     // Catch: java.lang.Throwable -> L5b
            com.tendcloud.tenddata.zz.e = r0     // Catch: java.lang.Throwable -> L5b
            r5.registerActivityLifecycleCallbacks(r0)     // Catch: java.lang.Throwable -> L5b
            com.tendcloud.tenddata.zz.l = r1     // Catch: java.lang.Throwable -> L5b
            goto L5b
        L31:
            com.tendcloud.tenddata.zz$24 r0 = new com.tendcloud.tenddata.zz$24
            r0.<init>(r4, r5)
            java.lang.String r5 = "android.app.ActivityManagerNative"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = "gDefault"
            java.lang.String r3 = "android.app.IActivityManager"
            com.tendcloud.tenddata.y.a(r5, r0, r2, r3)     // Catch: java.lang.Throwable -> L46
            com.tendcloud.tenddata.zz.l = r1     // Catch: java.lang.Throwable -> L46
            goto L5b
        L46:
            r5 = move-exception
            java.lang.String r0 = "registerActivityLifecycleListener "
            java.lang.StringBuilder r0 = p000.c4.m108(r0)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.tendcloud.tenddata.h.eForDeveloper(r5)
        L5b:
            return
    }

    private void a(android.content.Context r1, java.lang.String r2, int r3, com.tendcloud.tenddata.a r4) {
            r0 = this;
            com.tendcloud.tenddata.zz$30 r1 = new com.tendcloud.tenddata.zz$30
            r1.<init>(r0, r3, r2, r4)
            com.tendcloud.tenddata.y.execute(r1)
            return
    }

    public static android.os.Handler b() {
            android.os.Handler r0 = com.tendcloud.tenddata.zz.q
            return r0
    }

    public static android.os.Handler c() {
            android.os.Handler r0 = com.tendcloud.tenddata.zz.o
            return r0
    }

    public static /* synthetic */ java.lang.String f() {
            java.lang.String r0 = com.tendcloud.tenddata.zz.i
            return r0
    }

    public static /* synthetic */ java.lang.String g() {
            java.lang.String r0 = com.tendcloud.tenddata.zz.k
            return r0
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(android.app.Activity r2, com.tendcloud.tenddata.a r3) {
            r1 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto La
            java.lang.String r2 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r2)     // Catch: java.lang.Throwable -> L1c
            return
        La:
            boolean r0 = com.tendcloud.tenddata.zz.l     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L13
            boolean r0 = com.tendcloud.tenddata.ab.J     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L13
            return
        L13:
            r1.a(r2)     // Catch: java.lang.Throwable -> L1c
            com.tendcloud.tenddata.c.a(r2, r3)     // Catch: java.lang.Throwable -> L1c
            r2 = 1
            com.tendcloud.tenddata.ab.J = r2     // Catch: java.lang.Throwable -> L1c
        L1c:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(android.app.Activity r1, java.lang.String r2, java.lang.String r3, com.tendcloud.tenddata.a r4) {
            r0 = this;
            boolean r2 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto La
            java.lang.String r1 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r1)     // Catch: java.lang.Throwable -> L10
            return
        La:
            r0.a(r1)     // Catch: java.lang.Throwable -> L10
            r0.a(r1, r4)     // Catch: java.lang.Throwable -> L10
        L10:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(android.content.Context r2, com.tendcloud.tenddata.a r3) {
            r1 = this;
            r0 = 0
            r1.a(r2, r0, r0, r3)
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(android.content.Context r2, java.lang.String r3, com.tendcloud.tenddata.a r4) {
            r1 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto La
            java.lang.String r2 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r2)     // Catch: java.lang.Throwable -> L27
            return
        La:
            boolean r0 = com.tendcloud.tenddata.zz.d     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L12
            r2 = 0
            com.tendcloud.tenddata.zz.d = r2     // Catch: java.lang.Throwable -> L27
            return
        L12:
            boolean r0 = com.tendcloud.tenddata.y.b(r3)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L23
            boolean r0 = r2 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L23
            r3 = r2
            android.app.Activity r3 = (android.app.Activity) r3     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = r3.getLocalClassName()     // Catch: java.lang.Throwable -> L27
        L23:
            r0 = 4
            r1.a(r2, r3, r0, r4)     // Catch: java.lang.Throwable -> L27
        L27:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(android.content.Context r7, java.lang.String r8, java.lang.String r9, com.tendcloud.tenddata.a r10) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.a(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(android.content.Context r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, com.tendcloud.tenddata.a r6) {
            r1 = this;
            if (r2 != 0) goto L8
            java.lang.String r2 = "start SDK failed Context is null"
            com.tendcloud.tenddata.h.iForDeveloper(r2)     // Catch: java.lang.Throwable -> Lac
            return
        L8:
            java.lang.String r0 = "android.permission.INTERNET"
            boolean r0 = com.tendcloud.tenddata.y.b(r2, r0)     // Catch: java.lang.Throwable -> Lac
            if (r0 != 0) goto L16
            java.lang.String r2 = "[startA] Permission \"android.permission.INTERNET\" is needed."
            com.tendcloud.tenddata.h.eForDeveloper(r2)     // Catch: java.lang.Throwable -> Lac
            return
        L16:
            if (r6 != 0) goto L1e
            java.lang.String r2 = "Failed to start SDK!"
            com.tendcloud.tenddata.h.eForDeveloper(r2)     // Catch: java.lang.Throwable -> Lac
            return
        L1e:
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> La6
            if (r0 != 0) goto Lac
            android.content.Context r0 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> La6
            com.tendcloud.tenddata.ab.g = r0     // Catch: java.lang.Throwable -> La6
            com.tendcloud.tenddata.zz.i = r3     // Catch: java.lang.Throwable -> La6
            com.tendcloud.tenddata.zz.k = r4     // Catch: java.lang.Throwable -> La6
            com.tendcloud.tenddata.zz.a = r5     // Catch: java.lang.Throwable -> La6
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch: java.lang.Throwable -> La6
            java.lang.String r4 = r2.getPackageName()     // Catch: java.lang.Throwable -> La6
            r5 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r4, r5)     // Catch: java.lang.Throwable -> La6
            android.os.Bundle r3 = r3.metaData     // Catch: java.lang.Throwable -> La6
            java.lang.String r4 = "TD_APP_ID"
            java.lang.String r4 = com.tendcloud.tenddata.y.a(r3, r4)     // Catch: java.lang.Throwable -> La6
            java.lang.String r5 = "TD_CHANNEL_ID"
            java.lang.String r3 = com.tendcloud.tenddata.y.a(r3, r5)     // Catch: java.lang.Throwable -> La6
            boolean r5 = com.tendcloud.tenddata.y.b(r4)     // Catch: java.lang.Throwable -> La6
            if (r5 != 0) goto L51
            goto L53
        L51:
            java.lang.String r4 = com.tendcloud.tenddata.zz.i     // Catch: java.lang.Throwable -> La6
        L53:
            com.tendcloud.tenddata.zz.i = r4     // Catch: java.lang.Throwable -> La6
            boolean r4 = com.tendcloud.tenddata.y.b(r3)     // Catch: java.lang.Throwable -> La6
            if (r4 != 0) goto L5c
            goto L5e
        L5c:
            java.lang.String r3 = com.tendcloud.tenddata.zz.k     // Catch: java.lang.Throwable -> La6
        L5e:
            com.tendcloud.tenddata.zz.k = r3     // Catch: java.lang.Throwable -> La6
            java.lang.String r3 = com.tendcloud.tenddata.zz.a     // Catch: java.lang.Throwable -> La6
            com.tendcloud.tenddata.ab.c(r3, r6)     // Catch: java.lang.Throwable -> La6
            java.lang.String r3 = "ChannelConfig.json"
            java.lang.String r3 = com.tendcloud.tenddata.y.a(r2, r3)     // Catch: java.lang.Throwable -> La6
            boolean r4 = com.tendcloud.tenddata.y.b(r3)     // Catch: java.lang.Throwable -> La6
            if (r4 != 0) goto L72
            goto L74
        L72:
            java.lang.String r3 = com.tendcloud.tenddata.zz.k     // Catch: java.lang.Throwable -> La6
        L74:
            com.tendcloud.tenddata.zz.k = r3     // Catch: java.lang.Throwable -> La6
            java.lang.String r3 = com.tendcloud.tenddata.zz.i     // Catch: java.lang.Throwable -> La6
            boolean r3 = com.tendcloud.tenddata.y.b(r3)     // Catch: java.lang.Throwable -> La6
            if (r3 == 0) goto L84
            java.lang.String r2 = "[startA] TD AppId is null"
            com.tendcloud.tenddata.h.eForDeveloper(r2)     // Catch: java.lang.Throwable -> La6
            return
        L84:
            java.lang.String r3 = com.tendcloud.tenddata.zz.i     // Catch: java.lang.Throwable -> La6
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> La6
            com.tendcloud.tenddata.zz.i = r3     // Catch: java.lang.Throwable -> La6
            java.lang.String r4 = com.tendcloud.tenddata.zz.k     // Catch: java.lang.Throwable -> La6
            com.tendcloud.tenddata.ab.a(r3, r4, r6)     // Catch: java.lang.Throwable -> La6
            com.tendcloud.tenddata.bi.a()     // Catch: java.lang.Throwable -> La6
            r1.a(r2)     // Catch: java.lang.Throwable -> La6
            com.tendcloud.tenddata.bh.a()     // Catch: java.lang.Throwable -> La6
            com.tendcloud.tenddata.zz$23 r2 = new com.tendcloud.tenddata.zz$23     // Catch: java.lang.Throwable -> La6
            r2.<init>(r1, r6)     // Catch: java.lang.Throwable -> La6
            com.tendcloud.tenddata.y.execute(r2)     // Catch: java.lang.Throwable -> La6
            r2 = 1
            com.tendcloud.tenddata.zz.b = r2     // Catch: java.lang.Throwable -> La6
            goto Lac
        La6:
            r2 = move-exception
            java.lang.String r3 = "[startA] Failed to start SDK!"
            com.tendcloud.tenddata.h.a(r3, r2)     // Catch: java.lang.Throwable -> Lac
        Lac:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.Object> r12, double r13, com.tendcloud.tenddata.a r15) {
            r8 = this;
            boolean r9 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L66
            if (r9 != 0) goto La
            java.lang.String r9 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r9)     // Catch: java.lang.Throwable -> L66
            return
        La:
            boolean r9 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L66
            if (r9 == 0) goto L16
            java.lang.String r9 = "onEvent()# event id is empty."
            com.tendcloud.tenddata.h.eForDeveloper(r9)     // Catch: java.lang.Throwable -> L66
            return
        L16:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r9.<init>()     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = "onEvent being called! eventId: "
            r9.append(r0)     // Catch: java.lang.Throwable -> L66
            r9.append(r10)     // Catch: java.lang.Throwable -> L66
            int r0 = r15.index()     // Catch: java.lang.Throwable -> L66
            r1 = 3
            java.lang.String r2 = "null"
            if (r0 == r1) goto L39
            java.lang.String r0 = ", eventLabel: "
            r9.append(r0)     // Catch: java.lang.Throwable -> L66
            if (r11 != 0) goto L35
            r0 = r2
            goto L36
        L35:
            r0 = r11
        L36:
            r9.append(r0)     // Catch: java.lang.Throwable -> L66
        L39:
            java.lang.String r0 = ", eventMap: "
            r9.append(r0)     // Catch: java.lang.Throwable -> L66
            if (r12 != 0) goto L41
            goto L45
        L41:
            java.lang.String r2 = r12.toString()     // Catch: java.lang.Throwable -> L66
        L45:
            r9.append(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = ", value: "
            r9.append(r0)     // Catch: java.lang.Throwable -> L66
            r9.append(r13)     // Catch: java.lang.Throwable -> L66
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L66
            com.tendcloud.tenddata.h.iForDeveloper(r9)     // Catch: java.lang.Throwable -> L66
            com.tendcloud.tenddata.zz$32 r9 = new com.tendcloud.tenddata.zz$32     // Catch: java.lang.Throwable -> L66
            r0 = r9
            r1 = r8
            r2 = r15
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L66
            com.tendcloud.tenddata.y.execute(r9)     // Catch: java.lang.Throwable -> L66
        L66:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.Object> r11, com.tendcloud.tenddata.a r12) {
            r7 = this;
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r0.a(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.Object> r11, java.util.Map<java.lang.String, java.lang.Object> r12, com.tendcloud.tenddata.a r13) {
            r7 = this;
            boolean r8 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L72
            if (r8 != 0) goto La
            java.lang.String r8 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r8)     // Catch: java.lang.Throwable -> L72
            return
        La:
            boolean r8 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L72
            if (r8 == 0) goto L16
            java.lang.String r8 = "onEvent()# event id is empty."
            com.tendcloud.tenddata.h.eForDeveloper(r8)     // Catch: java.lang.Throwable -> L72
            return
        L16:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
            r8.<init>()     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = "onEvent being called! eventId: "
            r8.append(r0)     // Catch: java.lang.Throwable -> L72
            r8.append(r9)     // Catch: java.lang.Throwable -> L72
            int r0 = r13.index()     // Catch: java.lang.Throwable -> L72
            r1 = 3
            java.lang.String r2 = "null"
            if (r0 == r1) goto L39
            java.lang.String r0 = ", eventLabel: "
            r8.append(r0)     // Catch: java.lang.Throwable -> L72
            if (r10 != 0) goto L35
            r0 = r2
            goto L36
        L35:
            r0 = r10
        L36:
            r8.append(r0)     // Catch: java.lang.Throwable -> L72
        L39:
            java.lang.String r0 = ", eventMap: "
            r8.append(r0)     // Catch: java.lang.Throwable -> L72
            if (r11 != 0) goto L41
            goto L45
        L41:
            java.lang.String r2 = r11.toString()     // Catch: java.lang.Throwable -> L72
        L45:
            r8.append(r2)     // Catch: java.lang.Throwable -> L72
            if (r12 == 0) goto L5c
            boolean r0 = r12.isEmpty()     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L5c
            java.lang.String r0 = ", eventValue: "
            r8.append(r0)     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = r12.toString()     // Catch: java.lang.Throwable -> L72
            r8.append(r0)     // Catch: java.lang.Throwable -> L72
        L5c:
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L72
            com.tendcloud.tenddata.h.iForDeveloper(r8)     // Catch: java.lang.Throwable -> L72
            com.tendcloud.tenddata.zz$31 r8 = new com.tendcloud.tenddata.zz$31     // Catch: java.lang.Throwable -> L72
            r0 = r8
            r1 = r7
            r2 = r13
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L72
            com.tendcloud.tenddata.y.execute(r8)     // Catch: java.lang.Throwable -> L72
        L72:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(android.content.Context r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.Object> r10, double r11, com.tendcloud.tenddata.a r13) {
            r7 = this;
            boolean r8 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L51
            if (r8 != 0) goto La
            java.lang.String r8 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r8)     // Catch: java.lang.Throwable -> L51
            return
        La:
            boolean r8 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L51
            if (r8 == 0) goto L16
            java.lang.String r8 = "onEvent()# event id is empty."
            com.tendcloud.tenddata.h.eForDeveloper(r8)     // Catch: java.lang.Throwable -> L51
            return
        L16:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r8.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = "onEvent being called! eventId: "
            r8.append(r0)     // Catch: java.lang.Throwable -> L51
            r8.append(r9)     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = ", eventMap: "
            r8.append(r0)     // Catch: java.lang.Throwable -> L51
            if (r10 != 0) goto L2d
            java.lang.String r0 = "null"
            goto L31
        L2d:
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L51
        L31:
            r8.append(r0)     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = ", value: "
            r8.append(r0)     // Catch: java.lang.Throwable -> L51
            r8.append(r11)     // Catch: java.lang.Throwable -> L51
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L51
            com.tendcloud.tenddata.h.iForDeveloper(r8)     // Catch: java.lang.Throwable -> L51
            com.tendcloud.tenddata.zz$33 r8 = new com.tendcloud.tenddata.zz$33     // Catch: java.lang.Throwable -> L51
            r0 = r8
            r1 = r7
            r2 = r13
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L51
            com.tendcloud.tenddata.y.execute(r8)     // Catch: java.lang.Throwable -> L51
        L51:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(android.content.Context r1, java.lang.Throwable r2, com.tendcloud.tenddata.a r3) {
            r0 = this;
            boolean r1 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto La
            java.lang.String r1 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r1)     // Catch: java.lang.Throwable -> L15
            return
        La:
            if (r2 != 0) goto Ld
            return
        Ld:
            com.tendcloud.tenddata.zz$34 r1 = new com.tendcloud.tenddata.zz$34     // Catch: java.lang.Throwable -> L15
            r1.<init>(r0, r2, r3)     // Catch: java.lang.Throwable -> L15
            com.tendcloud.tenddata.y.execute(r1)     // Catch: java.lang.Throwable -> L15
        L15:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(com.tendcloud.tenddata.TalkingDataOrder r3, com.tendcloud.tenddata.a r4) {
            r2 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto La
            java.lang.String r3 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r3)     // Catch: java.lang.Throwable -> L3f
            return
        La:
            if (r3 == 0) goto L3a
            java.lang.String r0 = "keyOrderId"
            java.lang.String r0 = r3.optString(r0)     // Catch: java.lang.Throwable -> L3f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L19
            goto L3a
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r0.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "onCancelOrder called --> order: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L3f
            r0.append(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3f
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L3f
            com.tendcloud.tenddata.zz$20 r0 = new com.tendcloud.tenddata.zz$20     // Catch: java.lang.Throwable -> L3f
            r0.<init>(r2, r4, r3)     // Catch: java.lang.Throwable -> L3f
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L3f
            goto L3f
        L3a:
            java.lang.String r3 = "onCancelOrder: order or orderID could not be null or empty"
            com.tendcloud.tenddata.h.eForDeveloper(r3)     // Catch: java.lang.Throwable -> L3f
        L3f:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(com.tendcloud.tenddata.TalkingDataOrder r2, java.lang.String r3, com.tendcloud.tenddata.a r4) {
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a(r2, r3, r0, r4)
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(com.tendcloud.tenddata.TalkingDataOrder r8, java.lang.String r9, java.lang.String r10, com.tendcloud.tenddata.a r11) {
            r7 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto La
            java.lang.String r8 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r8)     // Catch: java.lang.Throwable -> L48
            return
        La:
            if (r8 != 0) goto L12
            java.lang.String r8 = "onPay: order could not be null or empty"
            com.tendcloud.tenddata.h.eForDeveloper(r8)     // Catch: java.lang.Throwable -> L48
            return
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r0.<init>()     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "onOrderPaySucc called --> order: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L48
            r0.append(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = " ,paymentType: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L48
            r0.append(r9)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = " ,profileId: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L48
            r0.append(r10)     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L48
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L48
            com.tendcloud.tenddata.zz$13 r0 = new com.tendcloud.tenddata.zz$13     // Catch: java.lang.Throwable -> L48
            r1 = r0
            r2 = r7
            r3 = r11
            r4 = r10
            r5 = r8
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L48
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L48
        L48:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(com.tendcloud.tenddata.TalkingDataOrder r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.Object> r10, com.tendcloud.tenddata.a r11) {
            r7 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto La
            java.lang.String r8 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r8)     // Catch: java.lang.Throwable -> L70
            return
        La:
            if (r8 == 0) goto L6b
            java.lang.String r0 = "keyOrderId"
            java.lang.String r0 = r8.optString(r0)     // Catch: java.lang.Throwable -> L70
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L19
            goto L6b
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "onPlaceOrder called --> order: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L70
            r0.append(r1)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = ", profileId: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L70
            r0.append(r9)     // Catch: java.lang.Throwable -> L70
            if (r10 == 0) goto L50
            boolean r1 = r10.isEmpty()     // Catch: java.lang.Throwable -> L70
            if (r1 != 0) goto L50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r1.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = ", eventValue: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = r10.toString()     // Catch: java.lang.Throwable -> L70
            r1.append(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L70
            goto L52
        L50:
            java.lang.String r1 = ""
        L52:
            r0.append(r1)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L70
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L70
            com.tendcloud.tenddata.zz$18 r0 = new com.tendcloud.tenddata.zz$18     // Catch: java.lang.Throwable -> L70
            r1 = r0
            r2 = r7
            r3 = r11
            r4 = r9
            r5 = r8
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L70
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L70
            goto L70
        L6b:
            java.lang.String r8 = "onPlaceOrder: order or orderID could not be null or empty"
            com.tendcloud.tenddata.h.eForDeveloper(r8)     // Catch: java.lang.Throwable -> L70
        L70:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(com.tendcloud.tenddata.TalkingDataProfile r3, com.tendcloud.tenddata.a r4) {
            r2 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto La
            java.lang.String r3 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r3)     // Catch: java.lang.Throwable -> L2e
            return
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "onProfileUpdate called --> profile is "
            r0.append(r1)     // Catch: java.lang.Throwable -> L2e
            java.util.Map r1 = com.tendcloud.tenddata.y.a(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2e
            r0.append(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2e
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L2e
            com.tendcloud.tenddata.zz$6 r0 = new com.tendcloud.tenddata.zz$6     // Catch: java.lang.Throwable -> L2e
            r0.<init>(r2, r4, r3)     // Catch: java.lang.Throwable -> L2e
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L2e
        L2e:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(com.tendcloud.tenddata.TalkingDataSearch r3, com.tendcloud.tenddata.a r4) {
            r2 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto La
            java.lang.String r3 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r3)     // Catch: java.lang.Throwable -> L2e
            return
        La:
            if (r3 != 0) goto L12
            java.lang.String r3 = "TDSearch cannot be null "
            com.tendcloud.tenddata.h.eForDeveloper(r3)     // Catch: java.lang.Throwable -> L2e
            return
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "onSearch called --> search: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L2e
            r0.append(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2e
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L2e
            com.tendcloud.tenddata.zz$26 r0 = new com.tendcloud.tenddata.zz$26     // Catch: java.lang.Throwable -> L2e
            r0.<init>(r2, r4, r3)     // Catch: java.lang.Throwable -> L2e
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L2e
        L2e:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(com.tendcloud.tenddata.TalkingDataShoppingCart r3, com.tendcloud.tenddata.a r4) {
            r2 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto La
            java.lang.String r3 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r3)     // Catch: java.lang.Throwable -> L35
            return
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "onViewShoppingCart called --> shoppingCart: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L35
            r0.append(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L35
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L30
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L35
            if (r0 > 0) goto L27
            goto L30
        L27:
            com.tendcloud.tenddata.zz$22 r0 = new com.tendcloud.tenddata.zz$22     // Catch: java.lang.Throwable -> L35
            r0.<init>(r2, r4, r3)     // Catch: java.lang.Throwable -> L35
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L35
            goto L35
        L30:
            java.lang.String r3 = "viewShoppingCart# shoppingCart can't be null or empty"
            com.tendcloud.tenddata.h.eForDeveloper(r3)     // Catch: java.lang.Throwable -> L35
        L35:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r7, int r8, java.lang.String r9, com.tendcloud.tenddata.a r10) {
            r6 = this;
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.a(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r10, int r11, java.lang.String r12, java.lang.String r13, com.tendcloud.tenddata.a r14) {
            r9 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto La
            java.lang.String r10 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r10)     // Catch: java.lang.Throwable -> L68
            return
        La:
            if (r10 == 0) goto L63
            boolean r0 = r10.isEmpty()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L13
            goto L63
        L13:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r0.<init>()     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = "onOrderPaySucc called --> orderid: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L68
            r0.append(r10)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = " ,amount: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L68
            r0.append(r11)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = " ,currencyType: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L68
            r0.append(r12)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = " ,payType: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L68
            r0.append(r13)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L68
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L68
            if (r12 == 0) goto L5d
            java.lang.String r0 = r12.trim()     // Catch: java.lang.Throwable -> L68
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L68
            r1 = 3
            if (r0 == r1) goto L4d
            goto L5d
        L4d:
            com.tendcloud.tenddata.zz$11 r0 = new com.tendcloud.tenddata.zz$11     // Catch: java.lang.Throwable -> L68
            r2 = r0
            r3 = r9
            r4 = r14
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L68
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L68
            goto L68
        L5d:
            java.lang.String r10 = "currencyType length must be 3 likes CNY so so"
            com.tendcloud.tenddata.h.eForDeveloper(r10)     // Catch: java.lang.Throwable -> L68
            return
        L63:
            java.lang.String r10 = "onOrderPaySucc: orderId could not be null or empty"
            com.tendcloud.tenddata.h.eForDeveloper(r10)     // Catch: java.lang.Throwable -> L68
        L68:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r10, int r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.Object> r13, com.tendcloud.tenddata.a r14) {
            r9 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L84
            if (r0 != 0) goto La
            java.lang.String r10 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r10)     // Catch: java.lang.Throwable -> L84
            return
        La:
            if (r10 == 0) goto L7f
            boolean r0 = r10.isEmpty()     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L14
            goto L7f
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r0.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = "onPlaceOrder called --> orderId: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L84
            r0.append(r10)     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = " ,amount: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L84
            r0.append(r11)     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = " ,currencyType: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L84
            r0.append(r12)     // Catch: java.lang.Throwable -> L84
            if (r13 == 0) goto L4f
            boolean r1 = r13.isEmpty()     // Catch: java.lang.Throwable -> L84
            if (r1 != 0) goto L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r1.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = ", eventValue: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = r13.toString()     // Catch: java.lang.Throwable -> L84
            r1.append(r2)     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L84
            goto L51
        L4f:
            java.lang.String r1 = ""
        L51:
            r0.append(r1)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L84
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L84
            if (r12 == 0) goto L79
            java.lang.String r0 = r12.trim()     // Catch: java.lang.Throwable -> L84
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L84
            r1 = 3
            if (r0 == r1) goto L69
            goto L79
        L69:
            com.tendcloud.tenddata.zz$17 r0 = new com.tendcloud.tenddata.zz$17     // Catch: java.lang.Throwable -> L84
            r2 = r0
            r3 = r9
            r4 = r14
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L84
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L84
            goto L84
        L79:
            java.lang.String r10 = "currencyType length must be 3 likes CNY so so"
            com.tendcloud.tenddata.h.eForDeveloper(r10)     // Catch: java.lang.Throwable -> L84
            return
        L7f:
            java.lang.String r10 = "onPlaceOrder: orderId could not be null or empty"
            com.tendcloud.tenddata.h.eForDeveloper(r10)     // Catch: java.lang.Throwable -> L84
        L84:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r2, com.tendcloud.tenddata.TalkingDataProfile r3, com.tendcloud.tenddata.a r4) {
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a(r2, r3, r0, r4)
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r7, com.tendcloud.tenddata.TalkingDataProfile r8, java.lang.String r9, com.tendcloud.tenddata.a r10) {
            r6 = this;
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.a(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r9, com.tendcloud.tenddata.TalkingDataProfile r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.Object> r12, com.tendcloud.tenddata.a r13) {
            r8 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> La6
            if (r0 != 0) goto La
            java.lang.String r9 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r9)     // Catch: java.lang.Throwable -> La6
            return
        La:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L16
            java.lang.String r9 = "onRegister: profileId could not be null or empty"
            com.tendcloud.tenddata.h.eForDeveloper(r9)     // Catch: java.lang.Throwable -> La6
            return
        L16:
            java.lang.String r0 = ", eventValue: "
            java.lang.String r1 = ""
            java.lang.String r2 = " , invitationCode is "
            java.lang.String r3 = "onRegister called --> profileId is "
            if (r10 == 0) goto L67
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r4.<init>()     // Catch: java.lang.Throwable -> La6
            r4.append(r3)     // Catch: java.lang.Throwable -> La6
            r4.append(r9)     // Catch: java.lang.Throwable -> La6
            java.lang.String r3 = " , profile is "
            r4.append(r3)     // Catch: java.lang.Throwable -> La6
            java.util.Map r3 = com.tendcloud.tenddata.y.a(r10)     // Catch: java.lang.Throwable -> La6
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> La6
            r4.append(r3)     // Catch: java.lang.Throwable -> La6
            r4.append(r2)     // Catch: java.lang.Throwable -> La6
            r4.append(r11)     // Catch: java.lang.Throwable -> La6
            if (r12 == 0) goto L5c
            boolean r2 = r12.isEmpty()     // Catch: java.lang.Throwable -> La6
            if (r2 != 0) goto L5c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r1.<init>()     // Catch: java.lang.Throwable -> La6
            r1.append(r0)     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = r12.toString()     // Catch: java.lang.Throwable -> La6
            r1.append(r0)     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La6
        L5c:
            r4.append(r1)     // Catch: java.lang.Throwable -> La6
        L5f:
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> La6
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> La6
            goto L97
        L67:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r4.<init>()     // Catch: java.lang.Throwable -> La6
            r4.append(r3)     // Catch: java.lang.Throwable -> La6
            r4.append(r9)     // Catch: java.lang.Throwable -> La6
            r4.append(r2)     // Catch: java.lang.Throwable -> La6
            r4.append(r11)     // Catch: java.lang.Throwable -> La6
            if (r12 == 0) goto L93
            boolean r2 = r12.isEmpty()     // Catch: java.lang.Throwable -> La6
            if (r2 != 0) goto L93
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r1.<init>()     // Catch: java.lang.Throwable -> La6
            r1.append(r0)     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = r12.toString()     // Catch: java.lang.Throwable -> La6
            r1.append(r0)     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La6
        L93:
            r4.append(r1)     // Catch: java.lang.Throwable -> La6
            goto L5f
        L97:
            com.tendcloud.tenddata.zz$3 r0 = new com.tendcloud.tenddata.zz$3     // Catch: java.lang.Throwable -> La6
            r1 = r0
            r2 = r8
            r3 = r13
            r4 = r9
            r5 = r11
            r6 = r10
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> La6
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> La6
        La6:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r8, com.tendcloud.tenddata.TalkingDataProfile r9, java.util.Map<java.lang.String, java.lang.Object> r10, com.tendcloud.tenddata.a r11) {
            r7 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L97
            if (r0 != 0) goto La
            java.lang.String r8 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r8)     // Catch: java.lang.Throwable -> L97
            return
        La:
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L16
            java.lang.String r8 = "onLogin: profileId could not be null or empty"
            com.tendcloud.tenddata.h.eForDeveloper(r8)     // Catch: java.lang.Throwable -> L97
            return
        L16:
            java.lang.String r0 = ", eventValue: "
            java.lang.String r1 = ""
            java.lang.String r2 = "onLogin called --> profileId is "
            if (r9 == 0) goto L5f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r3.<init>()     // Catch: java.lang.Throwable -> L97
            r3.append(r2)     // Catch: java.lang.Throwable -> L97
            r3.append(r8)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = " ，profile is "
            r3.append(r2)     // Catch: java.lang.Throwable -> L97
            java.util.Map r2 = com.tendcloud.tenddata.y.a(r9)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L97
            r3.append(r2)     // Catch: java.lang.Throwable -> L97
            if (r10 == 0) goto L54
            boolean r2 = r10.isEmpty()     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L54
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r1.<init>()     // Catch: java.lang.Throwable -> L97
            r1.append(r0)     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L97
            r1.append(r0)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L97
        L54:
            r3.append(r1)     // Catch: java.lang.Throwable -> L97
        L57:
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L97
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L97
            goto L89
        L5f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r3.<init>()     // Catch: java.lang.Throwable -> L97
            r3.append(r2)     // Catch: java.lang.Throwable -> L97
            r3.append(r8)     // Catch: java.lang.Throwable -> L97
            if (r10 == 0) goto L85
            boolean r2 = r10.isEmpty()     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L85
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r1.<init>()     // Catch: java.lang.Throwable -> L97
            r1.append(r0)     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L97
            r1.append(r0)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L97
        L85:
            r3.append(r1)     // Catch: java.lang.Throwable -> L97
            goto L57
        L89:
            com.tendcloud.tenddata.zz$5 r0 = new com.tendcloud.tenddata.zz$5     // Catch: java.lang.Throwable -> L97
            r1 = r0
            r2 = r7
            r3 = r11
            r4 = r8
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L97
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L97
        L97:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r2, com.tendcloud.tenddata.a r3) {
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a(r2, r0, r3)
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r7, com.tendcloud.tenddata.af.ProfileType r8, java.lang.String r9, com.tendcloud.tenddata.a r10) {
            r6 = this;
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.a(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r9, com.tendcloud.tenddata.af.ProfileType r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.Object> r12, com.tendcloud.tenddata.a r13) {
            r8 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto La
            java.lang.String r9 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r9)     // Catch: java.lang.Throwable -> L6c
            return
        La:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L16
            java.lang.String r9 = "onRegister: profileId could not be null or empty"
            com.tendcloud.tenddata.h.eForDeveloper(r9)     // Catch: java.lang.Throwable -> L6c
            return
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r0.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = "onRegister called --> profileId is "
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            r0.append(r9)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = " ，type is "
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            r0.append(r10)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = " , name is "
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            r0.append(r11)     // Catch: java.lang.Throwable -> L6c
            if (r12 == 0) goto L51
            boolean r1 = r12.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r1 != 0) goto L51
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r1.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = ", eventValue: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = r12.toString()     // Catch: java.lang.Throwable -> L6c
            r1.append(r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L6c
            goto L53
        L51:
            java.lang.String r1 = ""
        L53:
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6c
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L6c
            com.tendcloud.tenddata.zz$2 r0 = new com.tendcloud.tenddata.zz$2     // Catch: java.lang.Throwable -> L6c
            r1 = r0
            r2 = r8
            r3 = r13
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L6c
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L6c
        L6c:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b
            if (r0 != 0) goto La
            java.lang.String r3 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r3)
            return
        La:
            if (r3 == 0) goto L2e
            if (r4 == 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setGlobalKV# key:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " value:"
            r0.append(r1)
            java.lang.String r1 = r4.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tendcloud.tenddata.h.iForDeveloper(r0)
        L2e:
            java.util.Map<java.lang.String, java.lang.Object> r0 = com.tendcloud.tenddata.ab.d
            r0.put(r3, r4)
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r10, java.lang.String r11, int r12, java.lang.String r13, java.lang.String r14, com.tendcloud.tenddata.a r15) {
            r9 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto La
            java.lang.String r0 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r0)     // Catch: java.lang.Throwable -> L75
            return
        La:
            if (r10 == 0) goto L70
            java.lang.String r0 = r10.trim()     // Catch: java.lang.Throwable -> L75
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L75
            if (r0 > 0) goto L17
            goto L70
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r0.<init>()     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "onOrderPaySucc called --> profileId: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L75
            r0.append(r10)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = " ,orderid: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L75
            r0.append(r11)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = " ,amount: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L75
            r0.append(r12)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = " ,currencyType: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L75
            r0.append(r13)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = " ,payType: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L75
            r0.append(r14)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L75
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L75
            if (r13 == 0) goto L6a
            java.lang.String r0 = r13.trim()     // Catch: java.lang.Throwable -> L75
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L75
            r1 = 3
            if (r0 == r1) goto L59
            goto L6a
        L59:
            com.tendcloud.tenddata.zz$14 r8 = new com.tendcloud.tenddata.zz$14     // Catch: java.lang.Throwable -> L75
            r0 = r8
            r1 = r9
            r2 = r15
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L75
            com.tendcloud.tenddata.y.execute(r8)     // Catch: java.lang.Throwable -> L75
            goto L75
        L6a:
            java.lang.String r0 = "currencyType length must be 3 likes CNY so so"
            com.tendcloud.tenddata.h.eForDeveloper(r0)     // Catch: java.lang.Throwable -> L75
            return
        L70:
            java.lang.String r0 = "onOrderPaySucc: profileId could not be null or empty"
            com.tendcloud.tenddata.h.eForDeveloper(r0)     // Catch: java.lang.Throwable -> L75
        L75:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r12, java.lang.String r13, int r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, com.tendcloud.tenddata.a r19) {
            r11 = this;
            r4 = r13
            r6 = r15
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto Lc
            java.lang.String r0 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r0)     // Catch: java.lang.Throwable -> L96
            return
        Lc:
            if (r4 == 0) goto L91
            java.lang.String r0 = r13.trim()     // Catch: java.lang.Throwable -> L96
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L96
            if (r0 > 0) goto L1a
            goto L91
        L1a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96
            r0.<init>()     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = "onPay called --> profileId: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L96
            r3 = r12
            r0.append(r12)     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = " ,orderid: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L96
            r0.append(r13)     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = " ,amount: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L96
            r5 = r14
            r0.append(r14)     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = " ,currencyType: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L96
            r0.append(r15)     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = " ,payType: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L96
            r7 = r16
            r0.append(r7)     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = " ,itemId: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L96
            r8 = r17
            r0.append(r8)     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = " ,itemCount: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L96
            r9 = r18
            r0.append(r9)     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L96
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L96
            if (r6 == 0) goto L8b
            java.lang.String r0 = r15.trim()     // Catch: java.lang.Throwable -> L96
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L96
            r1 = 3
            if (r0 == r1) goto L74
            goto L8b
        L74:
            com.tendcloud.tenddata.zz$16 r10 = new com.tendcloud.tenddata.zz$16     // Catch: java.lang.Throwable -> L96
            r0 = r10
            r1 = r11
            r2 = r19
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L96
            com.tendcloud.tenddata.y.execute(r10)     // Catch: java.lang.Throwable -> L96
            goto L96
        L8b:
            java.lang.String r0 = "currencyType length must be 3 likes CNY so so"
            com.tendcloud.tenddata.h.eForDeveloper(r0)     // Catch: java.lang.Throwable -> L96
            return
        L91:
            java.lang.String r0 = "onPay: orderId could not be null or empty"
            com.tendcloud.tenddata.h.eForDeveloper(r0)     // Catch: java.lang.Throwable -> L96
        L96:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r2, java.lang.String r3, com.tendcloud.tenddata.a r4) {
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a(r2, r3, r0, r4)
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, int r13, com.tendcloud.tenddata.a r14) {
            r8 = this;
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r14
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, int r16, java.util.Map<java.lang.String, java.lang.Object> r17, com.tendcloud.tenddata.a r18) {
            r11 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L7b
            if (r0 != 0) goto La
            java.lang.String r0 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r0)     // Catch: java.lang.Throwable -> L7b
            return
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r0.<init>()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = "onAddItemToShoppingCart called --> itemId: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L7b
            r1 = r12
            r0.append(r12)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = " ,category: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L7b
            r6 = r13
            r0.append(r13)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = " ,name: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L7b
            r7 = r14
            r0.append(r14)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = " ,unitPrice: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L7b
            r8 = r15
            r0.append(r15)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = " ,amount: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L7b
            r9 = r16
            r0.append(r9)     // Catch: java.lang.Throwable -> L7b
            if (r17 == 0) goto L5b
            boolean r2 = r17.isEmpty()     // Catch: java.lang.Throwable -> L7b
            if (r2 != 0) goto L5b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r2.<init>()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = ", eventValue: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = r17.toString()     // Catch: java.lang.Throwable -> L7b
            r2.append(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7b
            goto L5d
        L5b:
            java.lang.String r2 = ""
        L5d:
            r0.append(r2)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7b
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L7b
            com.tendcloud.tenddata.zz$10 r0 = new com.tendcloud.tenddata.zz$10     // Catch: java.lang.Throwable -> L7b
            r2 = r0
            r3 = r11
            r4 = r18
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L7b
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L7b
        L7b:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, com.tendcloud.tenddata.a r12) {
            r7 = this;
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r0.a(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, java.util.Map<java.lang.String, java.lang.Object> r14, com.tendcloud.tenddata.a r15) {
            r9 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto La
            java.lang.String r10 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r10)     // Catch: java.lang.Throwable -> L69
            return
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = "onViewItem called --> itemId: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            r0.append(r10)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = " ,category: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            r0.append(r11)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = " ,name: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            r0.append(r12)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = " ,unitPrice: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            r0.append(r13)     // Catch: java.lang.Throwable -> L69
            if (r14 == 0) goto L4d
            boolean r1 = r14.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r1 != 0) goto L4d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r1.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = ", eventValue: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r14.toString()     // Catch: java.lang.Throwable -> L69
            r1.append(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L69
            goto L4f
        L4d:
            java.lang.String r1 = ""
        L4f:
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L69
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L69
            com.tendcloud.tenddata.zz$21 r0 = new com.tendcloud.tenddata.zz$21     // Catch: java.lang.Throwable -> L69
            r1 = r0
            r2 = r9
            r3 = r15
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L69
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L69
        L69:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r8, java.lang.String r9, java.lang.String r10, com.tendcloud.tenddata.a r11) {
            r7 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto La
            java.lang.String r8 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r8)     // Catch: java.lang.Throwable -> L3c
            return
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r0.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "onCreateCard called --> profileId: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L3c
            r0.append(r8)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = " method: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L3c
            r0.append(r9)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "  content: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L3c
            r0.append(r10)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3c
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L3c
            com.tendcloud.tenddata.zz$9 r0 = new com.tendcloud.tenddata.zz$9     // Catch: java.lang.Throwable -> L3c
            r1 = r0
            r2 = r7
            r3 = r11
            r4 = r8
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3c
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L3c
        L3c:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.Object> r10, com.tendcloud.tenddata.a r11) {
            r7 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto La
            java.lang.String r8 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r8)     // Catch: java.lang.Throwable -> L63
            return
        La:
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L16
            java.lang.String r8 = "onRegister: profileId could not be null or empty"
            com.tendcloud.tenddata.h.eForDeveloper(r8)     // Catch: java.lang.Throwable -> L63
            return
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = "onRegister called --> profileId is "
            r0.append(r1)     // Catch: java.lang.Throwable -> L63
            r0.append(r8)     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = " invitationCode: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L63
            r0.append(r9)     // Catch: java.lang.Throwable -> L63
            if (r10 == 0) goto L49
            boolean r1 = r10.isEmpty()     // Catch: java.lang.Throwable -> L63
            if (r1 != 0) goto L49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r1.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = ", eventValue: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = r10.toString()     // Catch: java.lang.Throwable -> L63
            r1.append(r2)     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L63
            goto L4b
        L49:
            java.lang.String r1 = ""
        L4b:
            r0.append(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L63
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L63
            com.tendcloud.tenddata.zz$8 r0 = new com.tendcloud.tenddata.zz$8     // Catch: java.lang.Throwable -> L63
            r1 = r0
            r2 = r7
            r3 = r11
            r4 = r8
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L63
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L63
        L63:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.lang.String r4, java.util.Map<java.lang.String, java.lang.Object> r5, com.tendcloud.tenddata.a r6) {
            r3 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L55
            if (r0 != 0) goto La
            java.lang.String r4 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r4)     // Catch: java.lang.Throwable -> L55
            return
        La:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L16
            java.lang.String r4 = "onLogin: profileId could not be null or empty"
            com.tendcloud.tenddata.h.eForDeveloper(r4)     // Catch: java.lang.Throwable -> L55
            return
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r0.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = "onLogin called --> profileId is "
            r0.append(r1)     // Catch: java.lang.Throwable -> L55
            r0.append(r4)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L41
            boolean r1 = r5.isEmpty()     // Catch: java.lang.Throwable -> L55
            if (r1 != 0) goto L41
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r1.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = ", eventValue: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L55
            r1.append(r2)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L55
            goto L43
        L41:
            java.lang.String r1 = ""
        L43:
            r0.append(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L55
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L55
            com.tendcloud.tenddata.zz$35 r0 = new com.tendcloud.tenddata.zz$35     // Catch: java.lang.Throwable -> L55
            r0.<init>(r3, r6, r4, r5)     // Catch: java.lang.Throwable -> L55
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L55
        L55:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(java.util.Map<java.lang.String, java.lang.Object> r2, com.tendcloud.tenddata.TDGenerateUrl r3) {
            r1 = this;
            com.tendcloud.tenddata.bc r0 = com.tendcloud.tenddata.bc.a()
            com.tendcloud.tenddata.bc r2 = r0.a(r2)
            r2.getShortUrl(r3)
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public java.lang.String b(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = com.tendcloud.tenddata.j.a(r1)     // Catch: java.lang.Throwable -> L5
            return r1
        L5:
            r1 = 0
            return r1
    }

    @Override // com.tendcloud.tenddata.ao
    public java.lang.String b(android.content.Context r1, com.tendcloud.tenddata.a r2) {
            r0 = this;
            if (r1 == 0) goto Lb
            boolean r2 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto Lb
            java.lang.String r2 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.iForDeveloper(r2)     // Catch: java.lang.Throwable -> L10
        Lb:
            java.lang.String r1 = com.tendcloud.tenddata.j.a(r1)     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // com.tendcloud.tenddata.ao
    public void b(android.app.Activity r2, com.tendcloud.tenddata.a r3) {
            r1 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto La
            java.lang.String r2 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r2)     // Catch: java.lang.Throwable -> L15
            return
        La:
            boolean r0 = com.tendcloud.tenddata.zz.l     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto Lf
            return
        Lf:
            r1.a(r2)     // Catch: java.lang.Throwable -> L15
            com.tendcloud.tenddata.c.b(r2, r3)     // Catch: java.lang.Throwable -> L15
        L15:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void b(android.content.Context r3, java.lang.String r4, com.tendcloud.tenddata.a r5) {
            r2 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto La
            java.lang.String r3 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r3)     // Catch: java.lang.Throwable -> L2c
            return
        La:
            boolean r0 = r3 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L28
            r0 = r3
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> L2c
            boolean r1 = com.tendcloud.tenddata.y.b(r4)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L1b
            java.lang.String r4 = r0.getLocalClassName()     // Catch: java.lang.Throwable -> L2c
        L1b:
            int r0 = r0.getChangingConfigurations()     // Catch: java.lang.Throwable -> L2c
            r1 = 128(0x80, float:1.8E-43)
            r0 = r0 & r1
            if (r0 != r1) goto L28
            r3 = 1
            com.tendcloud.tenddata.zz.d = r3     // Catch: java.lang.Throwable -> L2c
            return
        L28:
            r0 = 5
            r2.a(r3, r4, r0, r5)     // Catch: java.lang.Throwable -> L2c
        L2c:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void b(java.lang.String r9, int r10, java.lang.String r11, com.tendcloud.tenddata.a r12) {
            r8 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto La
            java.lang.String r9 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r9)     // Catch: java.lang.Throwable -> L5f
            return
        La:
            if (r9 == 0) goto L5a
            boolean r0 = r9.isEmpty()     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L13
            goto L5a
        L13:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r0.<init>()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = "onCancelOrder called --> orderId: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L5f
            r0.append(r9)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = " ,amount: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L5f
            r0.append(r10)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = " ,currencyType: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L5f
            r0.append(r11)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5f
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L5f
            if (r11 == 0) goto L54
            java.lang.String r0 = r11.trim()     // Catch: java.lang.Throwable -> L5f
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L5f
            r1 = 3
            if (r0 == r1) goto L45
            goto L54
        L45:
            com.tendcloud.tenddata.zz$19 r0 = new com.tendcloud.tenddata.zz$19     // Catch: java.lang.Throwable -> L5f
            r2 = r0
            r3 = r8
            r4 = r12
            r5 = r9
            r6 = r10
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L5f
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L5f
            goto L5f
        L54:
            java.lang.String r9 = "currencyType length must be 3 likes CNY so so"
            com.tendcloud.tenddata.h.eForDeveloper(r9)     // Catch: java.lang.Throwable -> L5f
            return
        L5a:
            java.lang.String r9 = "onCancelOrder: orderId could not be null or empty"
            com.tendcloud.tenddata.h.eForDeveloper(r9)     // Catch: java.lang.Throwable -> L5f
        L5f:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void b(java.lang.String r2, com.tendcloud.tenddata.a r3) {
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b(r2, r0, r3)
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void b(java.lang.String r7, com.tendcloud.tenddata.af.ProfileType r8, java.lang.String r9, com.tendcloud.tenddata.a r10) {
            r6 = this;
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.b(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void b(java.lang.String r9, com.tendcloud.tenddata.af.ProfileType r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.Object> r12, com.tendcloud.tenddata.a r13) {
            r8 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto La
            java.lang.String r9 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r9)     // Catch: java.lang.Throwable -> L6c
            return
        La:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L16
            java.lang.String r9 = "onLogin: profileId could not be null or empty"
            com.tendcloud.tenddata.h.eForDeveloper(r9)     // Catch: java.lang.Throwable -> L6c
            return
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r0.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = "onLogin called --> profileId is "
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            r0.append(r9)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = " ，profile is "
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            r0.append(r10)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = " , name is "
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            r0.append(r11)     // Catch: java.lang.Throwable -> L6c
            if (r12 == 0) goto L51
            boolean r1 = r12.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r1 != 0) goto L51
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r1.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = ", eventValue: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = r12.toString()     // Catch: java.lang.Throwable -> L6c
            r1.append(r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L6c
            goto L53
        L51:
            java.lang.String r1 = ""
        L53:
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6c
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L6c
            com.tendcloud.tenddata.zz$4 r0 = new com.tendcloud.tenddata.zz$4     // Catch: java.lang.Throwable -> L6c
            r1 = r0
            r2 = r8
            r3 = r13
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L6c
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L6c
        L6c:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void b(java.lang.String r10, java.lang.String r11, int r12, java.lang.String r13, java.lang.String r14, com.tendcloud.tenddata.a r15) {
            r9 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto La
            java.lang.String r0 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r0)     // Catch: java.lang.Throwable -> L75
            return
        La:
            if (r10 == 0) goto L70
            java.lang.String r0 = r10.trim()     // Catch: java.lang.Throwable -> L75
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L75
            if (r0 > 0) goto L17
            goto L70
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r0.<init>()     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "onPay called --> profileId: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L75
            r0.append(r10)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = " ,orderid: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L75
            r0.append(r11)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = " ,amount: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L75
            r0.append(r12)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = " ,currencyType: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L75
            r0.append(r13)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = " ,payType: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L75
            r0.append(r14)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L75
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L75
            if (r13 == 0) goto L6a
            java.lang.String r0 = r13.trim()     // Catch: java.lang.Throwable -> L75
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L75
            r1 = 3
            if (r0 == r1) goto L59
            goto L6a
        L59:
            com.tendcloud.tenddata.zz$15 r8 = new com.tendcloud.tenddata.zz$15     // Catch: java.lang.Throwable -> L75
            r0 = r8
            r1 = r9
            r2 = r15
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L75
            com.tendcloud.tenddata.y.execute(r8)     // Catch: java.lang.Throwable -> L75
            goto L75
        L6a:
            java.lang.String r0 = "currencyType length must be 3 likes CNY so so"
            com.tendcloud.tenddata.h.eForDeveloper(r0)     // Catch: java.lang.Throwable -> L75
            return
        L70:
            java.lang.String r0 = "onPay: profileId could not be null or empty"
            com.tendcloud.tenddata.h.eForDeveloper(r0)     // Catch: java.lang.Throwable -> L75
        L75:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void b(java.lang.String r2, java.lang.String r3, com.tendcloud.tenddata.a r4) {
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b(r2, r3, r0, r4)
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void b(java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.Object> r10, com.tendcloud.tenddata.a r11) {
            r7 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto La
            java.lang.String r8 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r8)     // Catch: java.lang.Throwable -> L57
            return
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r0.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "onFavorite called --> category: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L57
            r0.append(r8)     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = ", content: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L57
            r0.append(r9)     // Catch: java.lang.Throwable -> L57
            if (r10 == 0) goto L3d
            boolean r1 = r10.isEmpty()     // Catch: java.lang.Throwable -> L57
            if (r1 != 0) goto L3d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r1.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = ", eventValue: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = r10.toString()     // Catch: java.lang.Throwable -> L57
            r1.append(r2)     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L57
            goto L3f
        L3d:
            java.lang.String r1 = ""
        L3f:
            r0.append(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L57
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L57
            com.tendcloud.tenddata.zz$27 r0 = new com.tendcloud.tenddata.zz$27     // Catch: java.lang.Throwable -> L57
            r1 = r0
            r2 = r7
            r3 = r11
            r4 = r8
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L57
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L57
        L57:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void b(java.lang.String r4, java.util.Map<java.lang.String, java.lang.Object> r5, com.tendcloud.tenddata.a r6) {
            r3 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L55
            if (r0 != 0) goto La
            java.lang.String r4 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r4)     // Catch: java.lang.Throwable -> L55
            return
        La:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L16
            java.lang.String r4 = "onRegister: profileId could not be null or empty"
            com.tendcloud.tenddata.h.eForDeveloper(r4)     // Catch: java.lang.Throwable -> L55
            return
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r0.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = "onRegister called --> profileId is "
            r0.append(r1)     // Catch: java.lang.Throwable -> L55
            r0.append(r4)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L41
            boolean r1 = r5.isEmpty()     // Catch: java.lang.Throwable -> L55
            if (r1 != 0) goto L41
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r1.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = ", eventValue: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L55
            r1.append(r2)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L55
            goto L43
        L41:
            java.lang.String r1 = ""
        L43:
            r0.append(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L55
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L55
            com.tendcloud.tenddata.zz$7 r0 = new com.tendcloud.tenddata.zz$7     // Catch: java.lang.Throwable -> L55
            r0.<init>(r3, r6, r4, r5)     // Catch: java.lang.Throwable -> L55
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L55
        L55:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public java.lang.String c(android.content.Context r1, com.tendcloud.tenddata.a r2) {
            r0 = this;
            java.lang.String r1 = com.tendcloud.tenddata.ab.a(r1, r2)
            return r1
    }

    @Override // com.tendcloud.tenddata.ao
    public void c(java.lang.String r3, com.tendcloud.tenddata.a r4) {
            r2 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto La
            java.lang.String r3 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r3)     // Catch: java.lang.Throwable -> L32
            return
        La:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L16
            java.lang.String r3 = "onReceiveDeepLink: url could not be null or empty"
            com.tendcloud.tenddata.h.eForDeveloper(r3)     // Catch: java.lang.Throwable -> L32
            return
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r0.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "onReceiveDeepLink --> link: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L32
            r0.append(r3)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L32
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L32
            com.tendcloud.tenddata.zz$25 r0 = new com.tendcloud.tenddata.zz$25     // Catch: java.lang.Throwable -> L32
            r0.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L32
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L32
        L32:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void c(java.lang.String r2, java.lang.String r3, com.tendcloud.tenddata.a r4) {
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.c(r2, r3, r0, r4)
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void c(java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.Object> r10, com.tendcloud.tenddata.a r11) {
            r7 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto La
            java.lang.String r8 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r8)     // Catch: java.lang.Throwable -> L57
            return
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r0.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "onShare called --> profileId: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L57
            r0.append(r8)     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = ", content: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L57
            r0.append(r9)     // Catch: java.lang.Throwable -> L57
            if (r10 == 0) goto L3d
            boolean r1 = r10.isEmpty()     // Catch: java.lang.Throwable -> L57
            if (r1 != 0) goto L3d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r1.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = ", eventValue: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = r10.toString()     // Catch: java.lang.Throwable -> L57
            r1.append(r2)     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L57
            goto L3f
        L3d:
            java.lang.String r1 = ""
        L3f:
            r0.append(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L57
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L57
            com.tendcloud.tenddata.zz$28 r0 = new com.tendcloud.tenddata.zz$28     // Catch: java.lang.Throwable -> L57
            r1 = r0
            r2 = r7
            r3 = r11
            r4 = r8
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L57
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L57
        L57:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void c(boolean r3) {
            r2 = this;
            com.tendcloud.tenddata.ab.e = r3     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r0.<init>()     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = " setReportUncaughtExceptions: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L16
            r0.append(r3)     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L16
            com.tendcloud.tenddata.h.iForDeveloper(r3)     // Catch: java.lang.Throwable -> L16
        L16:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public android.content.Context d() {
            r1 = this;
            android.content.Context r0 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L3
            return r0
        L3:
            r0 = 0
            return r0
    }

    @Override // com.tendcloud.tenddata.ao
    public java.lang.String d(android.content.Context r1, com.tendcloud.tenddata.a r2) {
            r0 = this;
            java.lang.String r1 = com.tendcloud.tenddata.ab.b(r1, r2)
            return r1
    }

    @Override // com.tendcloud.tenddata.ao
    public void d(java.lang.String r3, java.lang.String r4, com.tendcloud.tenddata.a r5) {
            r2 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto La
            java.lang.String r3 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r3)     // Catch: java.lang.Throwable -> L2e
            return
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "onPunch called --> profileId: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L2e
            r0.append(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = " punchId: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L2e
            r0.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2e
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L2e
            com.tendcloud.tenddata.zz$29 r0 = new com.tendcloud.tenddata.zz$29     // Catch: java.lang.Throwable -> L2e
            r0.<init>(r2, r5, r3, r4)     // Catch: java.lang.Throwable -> L2e
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L2e
        L2e:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public java.lang.String e(android.content.Context r1, com.tendcloud.tenddata.a r2) {
            r0 = this;
            boolean r1 = com.tendcloud.tenddata.zz.b     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L9
            java.lang.String r1 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r1)     // Catch: java.lang.Throwable -> L12
        L9:
            com.tendcloud.tenddata.df r1 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.c()     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            r1 = 0
            return r1
    }

    @Override // com.tendcloud.tenddata.ao
    public void e() {
            r1 = this;
            r0 = 0
            com.tendcloud.tenddata.h.a = r0     // Catch: java.lang.Throwable -> L3
        L3:
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void removeGlobalKV(java.lang.String r3) {
            r2 = this;
            boolean r0 = com.tendcloud.tenddata.zz.b
            if (r0 != 0) goto La
            java.lang.String r3 = "Function startA was not executed correctly!"
            com.tendcloud.tenddata.h.eForDeveloper(r3)
            return
        La:
            if (r3 == 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "removeGlobalKV# key:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tendcloud.tenddata.h.iForDeveloper(r0)
        L20:
            java.util.Map<java.lang.String, java.lang.Object> r0 = com.tendcloud.tenddata.ab.d
            r0.remove(r3)
            return
    }

    @Override // com.tendcloud.tenddata.ao
    public void setCustomDataSwitch(com.tendcloud.tenddata.TalkingDataSharingFilter r1) {
            r0 = this;
            com.tendcloud.tenddata.ab.u = r1
            return
    }
}
