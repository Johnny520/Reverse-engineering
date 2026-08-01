package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class b80 {
    public static final defpackage.ct a = null;
    public static final defpackage.ds b = null;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            e80 r0 = new e80
            r0.<init>()
            defpackage.b80.a = r0
            goto L21
        Le:
            r1 = 28
            if (r0 < r1) goto L1a
            d80 r0 = new d80
            r0.<init>()
            defpackage.b80.a = r0
            goto L21
        L1a:
            c80 r0 = new c80
            r0.<init>()
            defpackage.b80.a = r0
        L21:
            ds r0 = new ds
            r1 = 16
            r0.<init>(r1)
            defpackage.b80.b = r0
            return
    }

    public static android.graphics.Typeface a(android.content.Context r12, defpackage.cl r13, android.content.res.Resources r14, int r15, java.lang.String r16, int r17, int r18, defpackage.zt r19, boolean r20) {
            r4 = r18
            r0 = r19
            boolean r1 = r13 instanceof defpackage.fl
            r2 = 9
            r6 = -3
            if (r1 == 0) goto L182
            fl r13 = (defpackage.fl) r13
            java.lang.String r1 = r13.d
            r7 = 0
            r8 = 0
            if (r1 == 0) goto L2d
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L1a
            goto L2d
        L1a:
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r8)
            android.graphics.Typeface r3 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r8)
            if (r1 == 0) goto L2d
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L2d
            goto L2e
        L2d:
            r1 = r7
        L2e:
            if (r1 == 0) goto L44
            if (r0 == 0) goto L43
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r13 = android.os.Looper.getMainLooper()
            r12.<init>(r13)
            t5 r13 = new t5
            r13.<init>(r0, r2, r1)
            r12.post(r13)
        L43:
            return r1
        L44:
            r9 = 1
            if (r20 == 0) goto L4f
            int r1 = r13.c
            if (r1 != 0) goto L4d
        L4b:
            r1 = r9
            goto L52
        L4d:
            r1 = r8
            goto L52
        L4f:
            if (r0 != 0) goto L4d
            goto L4b
        L52:
            r2 = -1
            if (r20 == 0) goto L59
            int r3 = r13.b
            r10 = r3
            goto L5a
        L59:
            r10 = r2
        L5a:
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r3.<init>(r5)
            l0 r5 = new l0
            r11 = 28
            r5.<init>(r11)
            r5.b = r0
            y1 r13 = r13.a
            d4 r11 = new d4
            r0 = 6
            r11.<init>(r5, r3, r0, r8)
            r0 = 4
            if (r1 == 0) goto Lf8
            ds r1 = defpackage.al.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r9 = r13.f
            java.lang.String r9 = (java.lang.String) r9
            r1.append(r9)
            java.lang.String r9 = "-"
            r1.append(r9)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            ds r9 = defpackage.al.a
            java.lang.Object r9 = r9.a(r1)
            android.graphics.Typeface r9 = (android.graphics.Typeface) r9
            if (r9 == 0) goto La6
            h1 r12 = new h1
            r12.<init>(r5, r9, r0, r8)
            r3.post(r12)
            r7 = r9
            goto L1a3
        La6:
            if (r10 != r2) goto Lb3
            zk r12 = defpackage.al.a(r1, r12, r13, r4)
            r11.F(r12)
            android.graphics.Typeface r7 = r12.a
            goto L1a3
        Lb3:
            xk r0 = new xk
            r5 = 0
            r2 = r12
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ThreadPoolExecutor r12 = defpackage.al.b     // Catch: java.lang.InterruptedException -> Le6
            java.util.concurrent.Future r12 = r12.submit(r0)     // Catch: java.lang.InterruptedException -> Le6
            long r0 = (long) r10
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> Ld1 java.util.concurrent.ExecutionException -> Ld4 java.util.concurrent.TimeoutException -> Ld7
            java.lang.Object r12 = r12.get(r0, r13)     // Catch: java.lang.InterruptedException -> Ld1 java.util.concurrent.ExecutionException -> Ld4 java.util.concurrent.TimeoutException -> Ld7
            zk r12 = (defpackage.zk) r12     // Catch: java.lang.InterruptedException -> Le6
            r11.F(r12)     // Catch: java.lang.InterruptedException -> Le6
            android.graphics.Typeface r7 = r12.a     // Catch: java.lang.InterruptedException -> Le6
            goto L1a3
        Ld1:
            r0 = move-exception
            r12 = r0
            goto Ldf
        Ld4:
            r0 = move-exception
            r12 = r0
            goto Le0
        Ld7:
            java.lang.InterruptedException r12 = new java.lang.InterruptedException     // Catch: java.lang.InterruptedException -> Le6
            java.lang.String r13 = "timeout"
            r12.<init>(r13)     // Catch: java.lang.InterruptedException -> Le6
            throw r12     // Catch: java.lang.InterruptedException -> Le6
        Ldf:
            throw r12     // Catch: java.lang.InterruptedException -> Le6
        Le0:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch: java.lang.InterruptedException -> Le6
            r13.<init>(r12)     // Catch: java.lang.InterruptedException -> Le6
            throw r13     // Catch: java.lang.InterruptedException -> Le6
        Le6:
            java.lang.Object r12 = r11.c
            android.os.Handler r12 = (android.os.Handler) r12
            java.lang.Object r13 = r11.b
            l0 r13 = (defpackage.l0) r13
            e8 r0 = new e8
            r0.<init>(r13, r6, r8)
            r12.post(r0)
            goto L1a3
        Lf8:
            ds r1 = defpackage.al.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r2 = r13.f
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            ds r2 = defpackage.al.a
            java.lang.Object r2 = r2.a(r1)
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            if (r2 == 0) goto L127
            h1 r12 = new h1
            r12.<init>(r5, r2, r0, r8)
            r3.post(r12)
            r7 = r2
            goto L1a3
        L127:
            yk r0 = new yk
            r0.<init>(r8, r11)
            java.lang.Object r3 = defpackage.al.c
            monitor-enter(r3)
            u30 r2 = defpackage.al.d     // Catch: java.lang.Throwable -> L13e
            java.lang.Object r5 = r2.getOrDefault(r1, r7)     // Catch: java.lang.Throwable -> L13e
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> L13e
            if (r5 == 0) goto L141
            r5.add(r0)     // Catch: java.lang.Throwable -> L13e
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13e
            goto L1a3
        L13e:
            r0 = move-exception
            r12 = r0
            goto L180
        L141:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L13e
            r5.<init>()     // Catch: java.lang.Throwable -> L13e
            r5.add(r0)     // Catch: java.lang.Throwable -> L13e
            r2.put(r1, r5)     // Catch: java.lang.Throwable -> L13e
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13e
            xk r0 = new xk
            r5 = 1
            r2 = r12
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ThreadPoolExecutor r12 = defpackage.al.b
            yk r13 = new yk
            r13.<init>(r9, r1)
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto L16c
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            goto L171
        L16c:
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
        L171:
            s00 r2 = new s00
            r2.<init>()
            r2.b = r0
            r2.c = r13
            r2.d = r1
            r12.execute(r2)
            goto L1a3
        L180:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13e
            throw r12
        L182:
            ct r3 = defpackage.b80.a
            dl r13 = (defpackage.dl) r13
            android.graphics.Typeface r7 = r3.g(r12, r13, r14, r4)
            if (r0 == 0) goto L1a3
            if (r7 == 0) goto L1a0
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r13 = android.os.Looper.getMainLooper()
            r12.<init>(r13)
            t5 r13 = new t5
            r13.<init>(r0, r2, r7)
            r12.post(r13)
            goto L1a3
        L1a0:
            r0.c(r6)
        L1a3:
            if (r7 == 0) goto L1ae
            ds r12 = defpackage.b80.b
            java.lang.String r13 = b(r14, r15, r16, r17, r18)
            r12.b(r13, r7)
        L1ae:
            return r7
    }

    public static java.lang.String b(android.content.res.Resources r1, int r2, java.lang.String r3, int r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r1.getResourcePackageName(r2)
            r0.<init>(r1)
            r1 = 45
            r0.append(r1)
            r0.append(r3)
            r0.append(r1)
            r0.append(r4)
            r0.append(r1)
            r0.append(r2)
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = r0.toString()
            return r1
    }
}
