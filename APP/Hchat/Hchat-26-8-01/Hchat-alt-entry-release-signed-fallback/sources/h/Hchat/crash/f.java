package h.Hchat.crash;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements java.lang.Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Thread.UncaughtExceptionHandler f4580a;

    public f(java.lang.Thread.UncaughtExceptionHandler r1) {
            r0 = this;
            r0.<init>()
            r0.f4580a = r1
            return
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread r9, java.lang.Throwable r10) {
            r8 = this;
            r9.getClass()
            r10.getClass()
            h.Hchat.crash.g r0 = h.Hchat.crash.g.f4581a
            boolean r0 = h.Hchat.crash.g.f4589i
            r1 = 0
            if (r0 != 0) goto Lf
            goto Ldd
        Lf:
            r2 = r10
            r0 = r1
        L11:
            r3 = 1
            r4 = 8
            if (r0 >= r4) goto L35
            if (r2 == 0) goto L35
            boolean r4 = r2 instanceof java.lang.OutOfMemoryError
            if (r4 == 0) goto L2e
            java.lang.String r4 = r2.getMessage()
            if (r4 != 0) goto L24
            java.lang.String r4 = ""
        L24:
            java.lang.String r5 = "Failed to allocate"
            boolean r3 = og.m.h0(r4, r5, r3)
            if (r3 == 0) goto L2e
            goto Ldd
        L2e:
            java.lang.Throwable r2 = r2.getCause()
            int r0 = r0 + 1
            goto L11
        L35:
            java.util.concurrent.atomic.AtomicBoolean r0 = h.Hchat.crash.g.f4584d
            boolean r0 = r0.compareAndSet(r1, r3)
            if (r0 != 0) goto L3f
            goto Ldd
        L3f:
            java.io.File r0 = h.Hchat.crash.g.f4596p     // Catch: java.lang.Throwable -> Ldd
            r2 = 0
            if (r0 == 0) goto Ld7
            r0.mkdirs()     // Catch: java.lang.Throwable -> Ldd
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Ldd
            java.io.File r3 = h.Hchat.crash.g.f4597q     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto Ld1
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> Ldd
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> Lc2
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> Lc2
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> Lc2
            r3.<init>(r0, r4)     // Catch: java.lang.Throwable -> Lc2
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r3 = "Hchat 捕获到 Java 层异常"
            r2.println(r3)     // Catch: java.lang.Throwable -> Lc4
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r3 = h.Hchat.crash.g.f(r3)     // Catch: java.lang.Throwable -> Lc4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            r4.<init>()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r5 = "时间: "
            r4.append(r5)     // Catch: java.lang.Throwable -> Lc4
            r4.append(r3)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> Lc4
            r2.println(r3)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r3 = h.Hchat.crash.g.f4601u     // Catch: java.lang.Throwable -> Lc4
            r2.print(r3)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r3 = r9.getName()     // Catch: java.lang.Throwable -> Lc4
            long r4 = r9.getId()     // Catch: java.lang.Throwable -> Lc4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            r6.<init>()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r7 = "线程: "
            r6.append(r7)     // Catch: java.lang.Throwable -> Lc4
            r6.append(r3)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r3 = " (id="
            r6.append(r3)     // Catch: java.lang.Throwable -> Lc4
            r6.append(r4)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r3 = ")"
            r6.append(r3)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> Lc4
            r2.println(r3)     // Catch: java.lang.Throwable -> Lc4
            r2.println()     // Catch: java.lang.Throwable -> Lc4
            r10.printStackTrace(r2)     // Catch: java.lang.Throwable -> Lc4
            r2.flush()     // Catch: java.lang.Throwable -> Lc4
            java.io.FileDescriptor r3 = r0.getFD()     // Catch: java.lang.Throwable -> Lbb
            r3.sync()     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r2.close()     // Catch: java.lang.Throwable -> Lc2
            r0.close()     // Catch: java.lang.Throwable -> Ldd
            goto Ldd
        Lc2:
            r2 = move-exception
            goto Lcb
        Lc4:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> Lc6
        Lc6:
            r4 = move-exception
            ig.a.i(r2, r3)     // Catch: java.lang.Throwable -> Lc2
            throw r4     // Catch: java.lang.Throwable -> Lc2
        Lcb:
            throw r2     // Catch: java.lang.Throwable -> Lcc
        Lcc:
            r3 = move-exception
            ig.a.i(r0, r2)     // Catch: java.lang.Throwable -> Ldd
            throw r3     // Catch: java.lang.Throwable -> Ldd
        Ld1:
            java.lang.String r0 = "javaPendingFile"
            gg.l.g(r0)     // Catch: java.lang.Throwable -> Ldd
            throw r2     // Catch: java.lang.Throwable -> Ldd
        Ld7:
            java.lang.String r0 = "crashDir"
            gg.l.g(r0)     // Catch: java.lang.Throwable -> Ldd
            throw r2     // Catch: java.lang.Throwable -> Ldd
        Ldd:
            java.lang.Thread$UncaughtExceptionHandler r0 = r8.f4580a
            if (r0 == 0) goto Lf3
            if (r0 == r8) goto Lf3
            r0.uncaughtException(r9, r10)     // Catch: java.lang.Throwable -> Lec
            java.util.concurrent.atomic.AtomicBoolean r9 = h.Hchat.crash.g.f4584d
            r9.set(r1)
            return
        Lec:
            r9 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r10 = h.Hchat.crash.g.f4584d
            r10.set(r1)
            throw r9
        Lf3:
            int r9 = android.os.Process.myPid()
            android.os.Process.killProcess(r9)
            r9 = 10
            java.lang.System.exit(r9)
            java.lang.String r9 = "System.exit returned normally, while it was supposed to halt JVM."
            bsh.j.g(r9)
            return
    }
}
