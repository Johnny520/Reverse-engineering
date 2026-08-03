package o8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.Handler f9602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f9603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f9604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f9605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f9606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final android.content.Context f9607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final android.app.AlarmManager f9608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f9609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9610i;

    public j(android.content.Context r4, g1.d r5) {
            r3 = this;
            r3.<init>()
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r5.<init>(r0)
            r3.f9602a = r5
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newCachedThreadPool()
            r3.f9603b = r5
            java.util.concurrent.ConcurrentHashMap r5 = new java.util.concurrent.ConcurrentHashMap
            r5.<init>()
            r3.f9604c = r5
            java.util.concurrent.ConcurrentHashMap r5 = new java.util.concurrent.ConcurrentHashMap
            r5.<init>()
            r3.f9605d = r5
            java.util.concurrent.ConcurrentHashMap r5 = new java.util.concurrent.ConcurrentHashMap
            r5.<init>()
            r3.f9606e = r5
            android.content.Context r5 = r4.getApplicationContext()
            if (r5 == 0) goto L30
            r4 = r5
        L30:
            r3.f9607f = r4
            java.lang.Class<android.app.AlarmManager> r5 = android.app.AlarmManager.class
            java.lang.Object r5 = r4.getSystemService(r5)
            android.app.AlarmManager r5 = (android.app.AlarmManager) r5
            r3.f9608g = r5
            java.util.concurrent.atomic.AtomicLong r5 = new java.util.concurrent.atomic.AtomicLong
            long r0 = java.lang.System.currentTimeMillis()
            r5.<init>(r0)
            r3.f9609h = r5
            nb.u r5 = new nb.u
            r0 = 1
            r5.<init>(r3, r0)
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "h.Hchat.action.EXACT_TASK"
            r0.<init>(r1)
            java.lang.String r1 = "hchat-scheduled-task"
            r0.addDataScheme(r1)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L64
            r2 = 33
            if (r1 < r2) goto L66
            r1 = 4
            r4.registerReceiver(r5, r0, r1)     // Catch: java.lang.Throwable -> L64
            goto L69
        L64:
            r4 = move-exception
            goto L6c
        L66:
            r4.registerReceiver(r5, r0)     // Catch: java.lang.Throwable -> L64
        L69:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L64
            goto L72
        L6c:
            sf.f r5 = new sf.f
            r5.<init>(r4)
            r4 = r5
        L72:
            java.lang.Throwable r5 = sf.g.b(r4)
            if (r5 != 0) goto L79
            goto L90
        L79:
            java.lang.String r4 = r5.getMessage()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "精确定时广播注册失败: "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.c(r4)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
        L90:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r3.f9610i = r4
            return
    }

    public final void a(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            goto L36
        L7:
            java.util.concurrent.ConcurrentHashMap r0 = r2.f9604c
            java.util.Map r0 = gg.x.b(r0)
            java.lang.Object r0 = r0.remove(r3)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            android.os.Handler r1 = r2.f9602a
            if (r0 == 0) goto L1a
            r1.removeCallbacks(r0)
        L1a:
            java.util.concurrent.ConcurrentHashMap r0 = r2.f9605d
            java.util.Map r0 = gg.x.b(r0)
            java.lang.Object r3 = r0.remove(r3)
            o8.i r3 = (o8.i) r3
            if (r3 == 0) goto L36
            ca.r r0 = r3.f9600c
            r1.removeCallbacks(r0)
            android.app.AlarmManager r0 = r2.f9608g     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L36
            android.app.PendingIntent r3 = r3.f9599b     // Catch: java.lang.Throwable -> L36
            r0.cancel(r3)     // Catch: java.lang.Throwable -> L36
        L36:
            return
    }

    public final void b(long r5, java.lang.String r7) {
            r4 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r4.f9605d
            java.lang.Object r1 = r0.get(r7)
            o8.i r1 = (o8.i) r1
            if (r1 == 0) goto L2c
            long r2 = r1.f9598a
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L2c
            boolean r5 = r0.remove(r7, r1)
            if (r5 != 0) goto L17
            goto L2c
        L17:
            android.os.Handler r5 = r4.f9602a
            ca.r r6 = r1.f9600c
            r5.removeCallbacks(r6)
            android.app.AlarmManager r5 = r4.f9608g     // Catch: java.lang.Throwable -> L27
            if (r5 == 0) goto L27
            android.app.PendingIntent r6 = r1.f9599b     // Catch: java.lang.Throwable -> L27
            r5.cancel(r6)     // Catch: java.lang.Throwable -> L27
        L27:
            db.d r5 = r1.f9601d
            r4.g(r5)
        L2c:
            return
    }

    public final void c(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "[WeChatTaskApi] "
            java.lang.String r2 = r0.concat(r2)
            i8.i.f(r2)
            return
    }

    public final void d(java.lang.Runnable r3) {
            r2 = this;
            o8.h r0 = new o8.h
            r1 = 0
            r0.<init>(r2, r3, r1)
            java.util.concurrent.ExecutorService r3 = r2.f9603b
            r3.execute(r0)
            return
    }

    public final void e(java.lang.Runnable r3) {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L12
            r2.g(r3)
            return
        L12:
            o8.h r0 = new o8.h
            r1 = 1
            r0.<init>(r2, r3, r1)
            android.os.Handler r3 = r2.f9602a
            r3.post(r0)
            return
    }

    public final void f(java.lang.String r8, long r9, java.lang.Runnable r11) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L12
            int r1 = r8.length()
            if (r1 <= 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto Lf
            goto L10
        Lf:
            r8 = r0
        L10:
            r2 = r8
            goto L13
        L12:
            r2 = r0
        L13:
            gg.u r4 = new gg.u
            r4.<init>()
            b9.c r1 = new b9.c
            r6 = 13
            r3 = r7
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r4.f4564g = r1
            java.lang.String r8 = "wrapped"
            if (r2 == 0) goto L3a
            r7.a(r2)
            java.lang.Object r11 = r4.f4564g
            if (r11 == 0) goto L36
            java.lang.Runnable r11 = (java.lang.Runnable) r11
            java.util.concurrent.ConcurrentHashMap r1 = r3.f9604c
            r1.put(r2, r11)
            goto L3a
        L36:
            gg.l.g(r8)
            throw r0
        L3a:
            java.lang.Object r11 = r4.f4564g
            if (r11 == 0) goto L4d
            java.lang.Runnable r11 = (java.lang.Runnable) r11
            r0 = 0
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 >= 0) goto L47
            r9 = r0
        L47:
            android.os.Handler r8 = r3.f9602a
            r8.postDelayed(r11, r9)
            return
        L4d:
            gg.l.g(r8)
            throw r0
    }

    public final void g(java.lang.Runnable r3) {
            r2 = this;
            r3.run()     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "任务执行失败: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.c(r3)
            return
    }
}
