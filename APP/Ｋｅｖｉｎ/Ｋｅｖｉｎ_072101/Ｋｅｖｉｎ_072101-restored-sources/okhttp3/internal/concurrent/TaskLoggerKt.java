package okhttp3.internal.concurrent;

/* JADX INFO: compiled from: TaskLogger.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0002\u001a5\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a*\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, m115d2 = {"formatDuration", "", "ns", "", "log", "", "task", "Lokhttp3/internal/concurrent/Task;", "queue", "Lokhttp3/internal/concurrent/TaskQueue;", "message", "logElapsed", "T", "block", "Lkotlin/Function0;", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "taskLog", "messageBlock", "okhttp"}, m116k = 2, m117mv = {1, 8, 0}, m119xi = 48)
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
            if (r0 > 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r3 = (long) r3
            long r3 = r12 - r3
            long r5 = (long) r2
            long r3 = r3 / r5
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto Lc0
        L28:
            r4 = -999500(0xfffffffffff0bfb4, double:NaN)
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            java.lang.String r4 = " ms"
            r5 = 1000000(0xf4240, float:1.401298E-39)
            r6 = 500000(0x7a120, float:7.00649E-40)
            if (r0 > 0) goto L4e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r6
            long r1 = r12 - r1
            long r5 = (long) r5
            long r1 = r1 / r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            goto Lc0
        L4e:
            r7 = 0
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            java.lang.String r7 = " µs"
            r8 = 1000(0x3e8, float:1.401E-42)
            r9 = 500(0x1f4, float:7.0E-43)
            if (r0 > 0) goto L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r9
            long r1 = r12 - r1
            long r3 = (long) r8
            long r1 = r1 / r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r0 = r0.toString()
            goto Lc0
        L71:
            r10 = 999500(0xf404c, double:4.938186E-318)
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 >= 0) goto L8e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r9
            long r1 = r1 + r12
            long r3 = (long) r8
            long r1 = r1 / r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r0 = r0.toString()
            goto Lc0
        L8e:
            r7 = 999500000(0x3b9328e0, double:4.93818613E-315)
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 >= 0) goto Lab
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r6
            long r1 = r1 + r12
            long r5 = (long) r5
            long r1 = r1 / r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            goto Lc0
        Lab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r3 = (long) r3
            long r3 = r3 + r12
            long r5 = (long) r2
            long r3 = r3 / r5
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        Lc0:
            kotlin.jvm.internal.StringCompanionObject r1 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r2 = "%6s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.String r2 = "format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    private static final void log(okhttp3.internal.concurrent.Task r4, okhttp3.internal.concurrent.TaskQueue r5, java.lang.String r6) {
            okhttp3.internal.concurrent.TaskRunner$Companion r0 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r0 = r0.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.getName$okhttp()
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 32
            java.lang.StringBuilder r1 = r1.append(r2)
            kotlin.jvm.internal.StringCompanionObject r2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[]{r6}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2)
            java.lang.String r3 = "%-22s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ": "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r4.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.fine(r1)
            return
    }

    public static final <T> T logElapsed(okhttp3.internal.concurrent.Task r11, okhttp3.internal.concurrent.TaskQueue r12, kotlin.jvm.functions.Function0<? extends T> r13) {
            java.lang.String r0 = "finished run in "
            java.lang.String r1 = "task"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            java.lang.String r1 = "queue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            java.lang.String r1 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            r1 = 0
            r2 = -1
            okhttp3.internal.concurrent.TaskRunner$Companion r4 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r4 = r4.getLogger()
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            boolean r4 = r4.isLoggable(r5)
            if (r4 == 0) goto L33
            okhttp3.internal.concurrent.TaskRunner r5 = r12.getTaskRunner$okhttp()
            okhttp3.internal.concurrent.TaskRunner$Backend r5 = r5.getBackend()
            long r2 = r5.nanoTime()
            java.lang.String r5 = "starting"
            access$log(r11, r12, r5)
        L33:
            r5 = 0
            r6 = 1
            java.lang.Object r7 = r13.invoke()     // Catch: java.lang.Throwable -> L6c
            r5 = 1
            kotlin.jvm.internal.InlineMarker.finallyStart(r6)
            if (r4 == 0) goto L67
            okhttp3.internal.concurrent.TaskRunner r8 = r12.getTaskRunner$okhttp()
            okhttp3.internal.concurrent.TaskRunner$Backend r8 = r8.getBackend()
            long r8 = r8.nanoTime()
            long r8 = r8 - r2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r0 = r10.append(r0)
            java.lang.String r10 = formatDuration(r8)
            java.lang.StringBuilder r0 = r0.append(r10)
            java.lang.String r0 = r0.toString()
            access$log(r11, r12, r0)
        L67:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r6)
            r0 = r7
            return r7
        L6c:
            r7 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r6)
            if (r4 == 0) goto Lb4
            okhttp3.internal.concurrent.TaskRunner r8 = r12.getTaskRunner$okhttp()
            okhttp3.internal.concurrent.TaskRunner$Backend r8 = r8.getBackend()
            long r8 = r8.nanoTime()
            long r8 = r8 - r2
            if (r5 == 0) goto L9a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r0 = r10.append(r0)
            java.lang.String r10 = formatDuration(r8)
            java.lang.StringBuilder r0 = r0.append(r10)
            java.lang.String r0 = r0.toString()
            access$log(r11, r12, r0)
            goto Lb4
        L9a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "failed a run in "
            java.lang.StringBuilder r0 = r0.append(r10)
            java.lang.String r10 = formatDuration(r8)
            java.lang.StringBuilder r0 = r0.append(r10)
            java.lang.String r0 = r0.toString()
            access$log(r11, r12, r0)
        Lb4:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r6)
            throw r7
    }

    public static final void taskLog(okhttp3.internal.concurrent.Task r3, okhttp3.internal.concurrent.TaskQueue r4, kotlin.jvm.functions.Function0<java.lang.String> r5) {
            java.lang.String r0 = "task"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "queue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "messageBlock"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            okhttp3.internal.concurrent.TaskRunner$Companion r1 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r1 = r1.getLogger()
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            boolean r1 = r1.isLoggable(r2)
            if (r1 == 0) goto L27
            java.lang.Object r1 = r5.invoke()
            java.lang.String r1 = (java.lang.String) r1
            access$log(r3, r4, r1)
        L27:
            return
    }
}
