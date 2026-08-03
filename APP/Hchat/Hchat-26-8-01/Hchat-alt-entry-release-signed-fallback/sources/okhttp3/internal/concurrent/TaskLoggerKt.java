package okhttp3.internal.concurrent;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class TaskLoggerKt {
    public static final /* synthetic */ void access$log(okhttp3.internal.concurrent.Task r0, okhttp3.internal.concurrent.TaskQueue r1, java.lang.String r2) {
            log(r0, r1, r2)
            return
    }

    public static final java.lang.String formatDuration(long r12) {
            r0 = -999500000(0xffffffffc46cd720, double:NaN)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            java.lang.String r1 = " s "
            r2 = 1000000000(0x3b9aca00, float:0.0047237873)
            r3 = 500000000(0x1dcd6500, float:5.436748E-21)
            if (r0 > 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r3 = (long) r3
            long r12 = r12 - r3
            long r2 = (long) r2
            long r12 = r12 / r2
            java.lang.String r12 = eh.a.p(r0, r12, r1)
            goto L8b
        L1d:
            r4 = -999500(0xfffffffffff0bfb4, double:NaN)
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            java.lang.String r4 = " ms"
            r5 = 1000000(0xf4240, float:1.401298E-39)
            r6 = 500000(0x7a120, float:7.00649E-40)
            if (r0 > 0) goto L3a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r6
            long r12 = r12 - r1
            long r1 = (long) r5
            long r12 = r12 / r1
            java.lang.String r12 = eh.a.p(r0, r12, r4)
            goto L8b
        L3a:
            r7 = 0
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            java.lang.String r7 = " µs"
            r8 = 1000(0x3e8, float:1.401E-42)
            r9 = 500(0x1f4, float:7.0E-43)
            if (r0 > 0) goto L54
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r9
            long r12 = r12 - r1
            long r1 = (long) r8
            long r12 = r12 / r1
            java.lang.String r12 = eh.a.p(r0, r12, r7)
            goto L8b
        L54:
            r10 = 999500(0xf404c, double:4.938186E-318)
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 >= 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r9
            long r12 = r12 + r1
            long r1 = (long) r8
            long r12 = r12 / r1
            java.lang.String r12 = eh.a.p(r0, r12, r7)
            goto L8b
        L69:
            r7 = 999500000(0x3b9328e0, double:4.93818613E-315)
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 >= 0) goto L7e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r6
            long r12 = r12 + r1
            long r1 = (long) r5
            long r12 = r12 / r1
            java.lang.String r12 = eh.a.p(r0, r12, r4)
            goto L8b
        L7e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r3 = (long) r3
            long r12 = r12 + r3
            long r2 = (long) r2
            long r12 = r12 / r2
            java.lang.String r12 = eh.a.p(r0, r12, r1)
        L8b:
            r13 = 1
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r13)
            java.lang.String r13 = "%6s"
            java.lang.String r12 = java.lang.String.format(r13, r12)
            return r12
    }

    private static final void log(okhttp3.internal.concurrent.Task r2, okhttp3.internal.concurrent.TaskQueue r3, java.lang.String r4) {
            okhttp3.internal.concurrent.TaskRunner$Companion r0 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r0 = r0.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getName$okhttp()
            r1.append(r3)
            r3 = 32
            r1.append(r3)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)
            java.lang.String r4 = "%-22s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r1.append(r3)
            java.lang.String r3 = ": "
            r1.append(r3)
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.fine(r2)
            return
    }

    public static final <T> T logElapsed(okhttp3.internal.concurrent.Task r5, okhttp3.internal.concurrent.TaskQueue r6, fg.a r7) {
            r5.getClass()
            r6.getClass()
            r7.getClass()
            okhttp3.internal.concurrent.TaskRunner$Companion r0 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r0 = r0.getLogger()
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L29
            okhttp3.internal.concurrent.TaskRunner r1 = r6.getTaskRunner$okhttp()
            okhttp3.internal.concurrent.TaskRunner$Backend r1 = r1.getBackend()
            long r1 = r1.nanoTime()
            java.lang.String r3 = "starting"
            access$log(r5, r6, r3)
            goto L2b
        L29:
            r1 = -1
        L2b:
            java.lang.Object r7 = r7.invoke()     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L53
            okhttp3.internal.concurrent.TaskRunner r0 = r6.getTaskRunner$okhttp()
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r0.getBackend()
            long r3 = r0.nanoTime()
            long r3 = r3 - r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "finished run in "
            r0.<init>(r1)
            java.lang.String r1 = formatDuration(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            access$log(r5, r6, r0)
        L53:
            return r7
        L54:
            r7 = move-exception
            if (r0 == 0) goto L79
            okhttp3.internal.concurrent.TaskRunner r0 = r6.getTaskRunner$okhttp()
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r0.getBackend()
            long r3 = r0.nanoTime()
            long r3 = r3 - r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "failed a run in "
            r0.<init>(r1)
            java.lang.String r1 = formatDuration(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            access$log(r5, r6, r0)
        L79:
            throw r7
    }

    public static final void taskLog(okhttp3.internal.concurrent.Task r2, okhttp3.internal.concurrent.TaskQueue r3, fg.a r4) {
            r2.getClass()
            r3.getClass()
            r4.getClass()
            okhttp3.internal.concurrent.TaskRunner$Companion r0 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r0 = r0.getLogger()
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L20
            java.lang.Object r4 = r4.invoke()
            java.lang.String r4 = (java.lang.String) r4
            access$log(r2, r3, r4)
        L20:
            return
    }
}
