package okhttp3.internal.concurrent;

import java.util.Arrays;
import java.util.logging.Level;
import okhttp3.internal.http2.Http2Connection;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class TaskLoggerKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String formatDuration(long j3) {
        return String.format("%6s", Arrays.copyOf(new Object[]{j3 <= -999500000 ? AbstractC0921a.m2253p(new StringBuilder(), (j3 - ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS), " s ") : j3 <= -999500 ? AbstractC0921a.m2253p(new StringBuilder(), (j3 - ((long) 500000)) / ((long) 1000000), " ms") : j3 <= 0 ? AbstractC0921a.m2253p(new StringBuilder(), (j3 - ((long) 500)) / ((long) 1000), " µs") : j3 < 999500 ? AbstractC0921a.m2253p(new StringBuilder(), (j3 + ((long) 500)) / ((long) 1000), " µs") : j3 < 999500000 ? AbstractC0921a.m2253p(new StringBuilder(), (j3 + ((long) 500000)) / ((long) 1000000), " ms") : AbstractC0921a.m2253p(new StringBuilder(), (j3 + ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS), " s ")}, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        TaskRunner.Companion.getLogger().fine(taskQueue.getName$okhttp() + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final <T> T logElapsed(Task task, TaskQueue taskQueue, InterfaceC1220a interfaceC1220a) {
        long jNanoTime;
        task.getClass();
        taskQueue.getClass();
        interfaceC1220a.getClass();
        boolean zIsLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, taskQueue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T t9 = (T) interfaceC1220a.invoke();
            if (zIsLoggable) {
                log(task, taskQueue, "finished run in " + formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            return t9;
        } catch (Throwable th2) {
            if (zIsLoggable) {
                log(task, taskQueue, "failed a run in " + formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void taskLog(Task task, TaskQueue taskQueue, InterfaceC1220a interfaceC1220a) {
        task.getClass();
        taskQueue.getClass();
        interfaceC1220a.getClass();
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, taskQueue, (String) interfaceC1220a.invoke());
        }
    }
}
