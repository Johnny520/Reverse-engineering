package a;

/* JADX INFO: renamed from: a.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0237l0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f552a;

    public /* synthetic */ RunnableC0237l0(int r1) {
            r0 = this;
            r0.f552a = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r12 = this;
            r0 = 2
            r1 = 1
            int r2 = r12.f552a
            switch(r2) {
                case 0: goto L158;
                case 1: goto L150;
                case 2: goto La5;
                case 3: goto L8b;
                case 4: goto L2e;
                case 5: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r0 = a.C0279n6.f595a
            a.C0279n6.q = r1
            return
        Lc:
            a.hd r0 = a.C0179hd.f499a     // Catch: java.lang.Throwable -> L17
            r0.getClass()     // Catch: java.lang.Throwable -> L17
            a.C0179hd.b()     // Catch: java.lang.Throwable -> L17
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L17
            goto L1c
        L17:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L1c:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L2d
            java.lang.String r1 = "ResolverBypass"
            java.lang.String r2 = "diagnostic failed"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r2, r0}
            a.C0453x1.a(r0)
        L2d:
            return
        L2e:
            java.lang.String r2 = "LOCATE_FAILED"
            java.lang.String r3 = "[BlockHotUpdate] async locate OK: loader="
            a.jf r4 = a.C0216jf.f536a     // Catch: java.lang.Throwable -> L69
            r4.getClass()     // Catch: java.lang.Throwable -> L69
            a.kf r4 = a.C0216jf.b()     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L6b
            java.lang.String r5 = "LOCATE_OK"
            a.Cif.b = r5     // Catch: java.lang.Throwable -> L69
            java.lang.String r5 = r4.f550a     // Catch: java.lang.Throwable -> L69
            java.util.List<java.lang.String> r4 = r4.j     // Catch: java.lang.Throwable -> L69
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L69
            r6.append(r5)     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = " pathSegments="
            r6.append(r3)     // Catch: java.lang.Throwable -> L69
            r6.append(r4)     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L69
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L69
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)     // Catch: java.lang.Throwable -> L69
            a.C0453x1.b(r1)     // Catch: java.lang.Throwable -> L69
            goto L8a
        L69:
            r1 = move-exception
            goto L7b
        L6b:
            a.Cif.b = r2     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "[BlockHotUpdate] async locate FAILED"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L69
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)     // Catch: java.lang.Throwable -> L69
            a.C0453x1.a(r1)     // Catch: java.lang.Throwable -> L69
            goto L8a
        L7b:
            a.Cif.b = r2
            java.lang.String r2 = "[BlockHotUpdate] async locate error"
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            a.C0453x1.a(r0)
        L8a:
            return
        L8b:
            a.Y7 r0 = a.Y7.c
            if (r0 == 0) goto L92
            android.app.Activity r0 = r0.f353a
            goto L93
        L92:
            r0 = 0
        L93:
            if (r0 == 0) goto La4
            a.ra r1 = new a.ra     // Catch: java.lang.Throwable -> La0
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La0
            r1.l()     // Catch: java.lang.Throwable -> La0
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> La0
            goto La4
        La0:
            r0 = move-exception
            a.C0465xd.a(r0)
        La4:
            return
        La5:
            r2 = 0
            r3 = r2
        La7:
            java.lang.String[] r4 = a.Yc.f358a
            r4 = 3
            if (r3 >= r4) goto Lbd
            boolean r4 = a.Yc.a()
            if (r4 == 0) goto Lb4
            goto L145
        Lb4:
            if (r3 >= r0) goto Lbb
            r4 = 3000(0xbb8, double:1.482E-320)
            java.lang.Thread.sleep(r4)     // Catch: java.lang.InterruptedException -> Lbd
        Lbb:
            int r3 = r3 + r1
            goto La7
        Lbd:
            android.content.SharedPreferences r0 = a.Yc.e
            if (r0 == 0) goto Lc8
            java.lang.String r3 = "remote_disabled"
            boolean r0 = r0.getBoolean(r3, r2)
            goto Lc9
        Lc8:
            r0 = r2
        Lc9:
            android.content.SharedPreferences r3 = a.Yc.e
            r4 = 0
            if (r3 == 0) goto Ld6
            java.lang.String r6 = "last_fetch_ts"
            long r6 = r3.getLong(r6, r4)
            goto Ld7
        Ld6:
            r6 = r4
        Ld7:
            long r8 = java.lang.System.currentTimeMillis()
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 == 0) goto Lea
            long r3 = r8 - r6
            r10 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 <= 0) goto Leb
        Lea:
            r2 = r1
        Leb:
            r3 = 86400000(0x5265c00, float:7.82218E-36)
            java.lang.String r4 = "fc-remote-killswitch"
            if (r0 == 0) goto L122
            if (r2 != 0) goto L122
            a.Yc.b = r1
            android.content.SharedPreferences r0 = a.Yc.e
            java.lang.String r1 = ""
            if (r0 == 0) goto L106
            java.lang.String r2 = "remote_message"
            java.lang.String r0 = r0.getString(r2, r1)
            if (r0 != 0) goto L105
            goto L106
        L105:
            r1 = r0
        L106:
            a.Yc.c = r1
            long r8 = r8 - r6
            long r0 = (long) r3
            long r8 = r8 / r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "network failed, SP disabled=true (fetched "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = "d ago) → keep disabled"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r4, r0)
            goto L145
        L122:
            if (r0 == 0) goto L140
            if (r2 == 0) goto L140
            long r8 = r8 - r6
            long r0 = (long) r3
            long r8 = r8 / r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "network failed, SP disabled=true but stale ("
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = "d) → ignore, stay running"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r4, r0)
            goto L145
        L140:
            java.lang.String r0 = "network failed, SP not disabled → stay running (fail-open)"
            android.util.Log.i(r4, r0)
        L145:
            r0 = 1800000(0x1b7740, double:8.89318E-318)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L14f
            a.Yc.a()
            goto L145
        L14f:
            return
        L150:
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            return
        L158:
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            return
    }
}
