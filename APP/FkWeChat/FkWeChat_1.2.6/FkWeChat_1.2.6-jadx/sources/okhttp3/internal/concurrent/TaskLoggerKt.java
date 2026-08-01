package okhttp3.internal.concurrent;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1057r;
import p024b9.C1062t0;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\u001a5\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u0010\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, m16758d2 = {"Ljava/util/logging/Logger;", "Lokhttp3/internal/concurrent/Task;", "task", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "Lkotlin/Function0;", _UrlKt.FRAGMENT_ENCODE_SET, "messageBlock", "Ll8/i0;", "taskLog", "(Ljava/util/logging/Logger;Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;La9/a;)V", "T", "block", "logElapsed", "(Ljava/util/logging/Logger;Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;La9/a;)Ljava/lang/Object;", "message", "log", "(Ljava/util/logging/Logger;Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;)V", _UrlKt.FRAGMENT_ENCODE_SET, "ns", "formatDuration", "(J)Ljava/lang/String;", "okhttp"}, m16759k = 2, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class TaskLoggerKt {
    public static final String formatDuration(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j10 + ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) + " s ";
        }
        C1062t0 c1062t0 = C1062t0.f3215a;
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Logger logger, Task task, TaskQueue taskQueue, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(taskQueue.getName());
        sb2.append(' ');
        C1062t0 c1062t0 = C1062t0.f3215a;
        sb2.append(String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)));
        sb2.append(": ");
        sb2.append(task.getName());
        logger.fine(sb2.toString());
    }

    public static final <T> T logElapsed(Logger logger, Task task, TaskQueue taskQueue, InterfaceC0173a interfaceC0173a) {
        long jNanoTime;
        logger.getClass();
        task.getClass();
        taskQueue.getClass();
        interfaceC0173a.getClass();
        boolean zIsLoggable = logger.isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = taskQueue.getTaskRunner().getBackend().nanoTime();
            log(logger, task, taskQueue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T t10 = (T) interfaceC0173a.invoke();
            AbstractC1057r.m3834b(1);
            if (zIsLoggable) {
                log(logger, task, taskQueue, "finished run in " + formatDuration(taskQueue.getTaskRunner().getBackend().nanoTime() - jNanoTime));
            }
            AbstractC1057r.m3833a(1);
            return t10;
        } catch (Throwable th) {
            AbstractC1057r.m3834b(1);
            if (zIsLoggable) {
                log(logger, task, taskQueue, "failed a run in " + formatDuration(taskQueue.getTaskRunner().getBackend().nanoTime() - jNanoTime));
            }
            AbstractC1057r.m3833a(1);
            throw th;
        }
    }

    public static final void taskLog(Logger logger, Task task, TaskQueue taskQueue, InterfaceC0173a interfaceC0173a) {
        logger.getClass();
        task.getClass();
        taskQueue.getClass();
        interfaceC0173a.getClass();
        if (logger.isLoggable(Level.FINE)) {
            log(logger, task, taskQueue, (String) interfaceC0173a.invoke());
        }
    }
}
