package a;

/* JADX INFO: loaded from: classes.dex */
public final class Mf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.Rf f178a = null;
    public static final a.W9<java.lang.String, android.graphics.Typeface> b = null;

    public static class a extends a.C0435w1 {
        public a.C0340qd.e u;
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            a.Qf r0 = new a.Qf
            r0.<init>()
            a.Mf.f178a = r0
            goto L15
        Le:
            a.Pf r0 = new a.Pf
            r0.<init>()
            a.Mf.f178a = r0
        L15:
            a.W9 r0 = new a.W9
            r1 = 16
            r0.<init>(r1)
            a.Mf.b = r0
            return
    }

    public static android.graphics.Typeface a(android.content.Context r11, a.S6.b r12, android.content.res.Resources r13, int r14, java.lang.String r15, int r16, int r17, a.C0340qd.e r18, boolean r19) {
            r1 = r17
            r0 = r18
            r2 = 14
            r3 = 0
            boolean r4 = r12 instanceof a.S6.e
            r5 = -3
            if (r4 == 0) goto L16b
            a.S6$e r12 = (a.S6.e) r12
            java.lang.String r4 = r12.d
            r6 = 0
            if (r4 == 0) goto L2d
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L1a
            goto L2d
        L1a:
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r3)
            android.graphics.Typeface r7 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r7 = android.graphics.Typeface.create(r7, r3)
            if (r4 == 0) goto L2d
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L2d
            goto L2e
        L2d:
            r4 = r6
        L2e:
            if (r4 == 0) goto L44
            if (r0 == 0) goto L43
            android.os.Handler r11 = new android.os.Handler
            android.os.Looper r12 = android.os.Looper.getMainLooper()
            r11.<init>(r12)
            a.P0 r12 = new a.P0
            r12.<init>(r0, r2, r4)
            r11.post(r12)
        L43:
            return r4
        L44:
            r2 = 1
            if (r19 == 0) goto L4e
            int r4 = r12.c
            if (r4 != 0) goto L4c
            goto L50
        L4c:
            r2 = r3
            goto L50
        L4e:
            if (r0 != 0) goto L4c
        L50:
            r4 = -1
            if (r19 == 0) goto L56
            int r7 = r12.b
            goto L57
        L56:
            r7 = r4
        L57:
            android.os.Handler r8 = new android.os.Handler
            android.os.Looper r9 = android.os.Looper.getMainLooper()
            r8.<init>(r9)
            a.Mf$a r9 = new a.Mf$a
            r9.<init>()
            r9.u = r0
            a.M6 r12 = r12.f261a
            a.H2 r10 = new a.H2
            r10.<init>(r9, r8)
            if (r2 == 0) goto Le8
            a.W9<java.lang.String, android.graphics.Typeface> r0 = a.R6.f242a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r12.e
            r0.append(r2)
            java.lang.String r2 = "-"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a.W9<java.lang.String, android.graphics.Typeface> r2 = a.R6.f242a
            java.lang.Object r2 = r2.a(r0)
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            if (r2 == 0) goto L9d
            a.F2 r11 = new a.F2
            r11.<init>(r9, r2)
            r8.post(r11)
        L9a:
            r6 = r2
            goto L18c
        L9d:
            if (r7 != r4) goto Laa
            a.R6$a r11 = a.R6.a(r0, r11, r12, r1)
            r10.a(r11)
            android.graphics.Typeface r6 = r11.f243a
            goto L18c
        Laa:
            a.N6 r2 = new a.N6
            r2.<init>(r0, r11, r12, r1)
            java.util.concurrent.ThreadPoolExecutor r11 = a.R6.b     // Catch: java.lang.InterruptedException -> Lda
            java.util.concurrent.Future r11 = r11.submit(r2)     // Catch: java.lang.InterruptedException -> Lda
            long r7 = (long) r7
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> Lc5 java.util.concurrent.ExecutionException -> Lc8 java.util.concurrent.TimeoutException -> Lcb
            java.lang.Object r11 = r11.get(r7, r12)     // Catch: java.lang.InterruptedException -> Lc5 java.util.concurrent.ExecutionException -> Lc8 java.util.concurrent.TimeoutException -> Lcb
            a.R6$a r11 = (a.R6.a) r11     // Catch: java.lang.InterruptedException -> Lda
            r10.a(r11)     // Catch: java.lang.InterruptedException -> Lda
            android.graphics.Typeface r6 = r11.f243a     // Catch: java.lang.InterruptedException -> Lda
            goto L18c
        Lc5:
            r0 = move-exception
            r11 = r0
            goto Ld3
        Lc8:
            r0 = move-exception
            r11 = r0
            goto Ld4
        Lcb:
            java.lang.InterruptedException r11 = new java.lang.InterruptedException     // Catch: java.lang.InterruptedException -> Lda
            java.lang.String r12 = "timeout"
            r11.<init>(r12)     // Catch: java.lang.InterruptedException -> Lda
            throw r11     // Catch: java.lang.InterruptedException -> Lda
        Ld3:
            throw r11     // Catch: java.lang.InterruptedException -> Lda
        Ld4:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch: java.lang.InterruptedException -> Lda
            r12.<init>(r11)     // Catch: java.lang.InterruptedException -> Lda
            throw r12     // Catch: java.lang.InterruptedException -> Lda
        Lda:
            a.G2 r11 = new a.G2
            a.Mf$a r12 = r10.f110a
            r11.<init>(r12, r5, r3)
            android.os.Handler r12 = r10.b
            r12.post(r11)
            goto L18c
        Le8:
            a.W9<java.lang.String, android.graphics.Typeface> r0 = a.R6.f242a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r12.e
            r0.append(r2)
            java.lang.String r2 = "-"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a.W9<java.lang.String, android.graphics.Typeface> r2 = a.R6.f242a
            java.lang.Object r2 = r2.a(r0)
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            if (r2 == 0) goto L113
            a.F2 r11 = new a.F2
            r11.<init>(r9, r2)
            r8.post(r11)
            goto L9a
        L113:
            a.O6 r2 = new a.O6
            r2.<init>(r10)
            java.lang.Object r3 = a.R6.c
            monitor-enter(r3)
            a.ge<java.lang.String, java.util.ArrayList<a.Q3<a.R6$a>>> r4 = a.R6.d     // Catch: java.lang.Throwable -> L12a
            java.lang.Object r5 = r4.getOrDefault(r0, r6)     // Catch: java.lang.Throwable -> L12a
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> L12a
            if (r5 == 0) goto L12d
            r5.add(r2)     // Catch: java.lang.Throwable -> L12a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12a
            goto L18c
        L12a:
            r0 = move-exception
            r11 = r0
            goto L169
        L12d:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12a
            r5.<init>()     // Catch: java.lang.Throwable -> L12a
            r5.add(r2)     // Catch: java.lang.Throwable -> L12a
            r4.put(r0, r5)     // Catch: java.lang.Throwable -> L12a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12a
            a.P6 r2 = new a.P6
            r2.<init>(r0, r11, r12, r1)
            java.util.concurrent.ThreadPoolExecutor r11 = a.R6.b
            a.Q6 r12 = new a.Q6
            r12.<init>(r0)
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L155
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r0.<init>(r3)
            goto L15a
        L155:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
        L15a:
            a.ad r3 = new a.ad
            r3.<init>()
            r3.f402a = r2
            r3.b = r12
            r3.c = r0
            r11.execute(r3)
            goto L18c
        L169:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12a
            throw r11
        L16b:
            a.Rf r3 = a.Mf.f178a
            a.S6$c r12 = (a.S6.c) r12
            android.graphics.Typeface r6 = r3.a(r11, r12, r13, r1)
            if (r0 == 0) goto L18c
            if (r6 == 0) goto L189
            android.os.Handler r11 = new android.os.Handler
            android.os.Looper r12 = android.os.Looper.getMainLooper()
            r11.<init>(r12)
            a.P0 r12 = new a.P0
            r12.<init>(r0, r2, r6)
            r11.post(r12)
            goto L18c
        L189:
            r0.a(r5)
        L18c:
            if (r6 == 0) goto L197
            a.W9<java.lang.String, android.graphics.Typeface> r11 = a.Mf.b
            java.lang.String r12 = b(r13, r14, r15, r16, r17)
            r11.b(r12, r6)
        L197:
            return r6
    }

    public static java.lang.String b(android.content.res.Resources r1, int r2, java.lang.String r3, int r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getResourcePackageName(r2)
            r0.append(r1)
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
