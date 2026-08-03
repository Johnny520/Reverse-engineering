package okhttp3.internal.concurrent;

import gg.AbstractC1411g;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Task {
    private final boolean cancelable;
    private final String name;
    private long nextExecuteNanoTime;
    private TaskQueue queue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Task(String str, boolean z9) {
        str.getClass();
        this.name = str;
        this.cancelable = z9;
        this.nextExecuteNanoTime = -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getCancelable() {
        return this.cancelable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getNextExecuteNanoTime$okhttp() {
        return this.nextExecuteNanoTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final TaskQueue getQueue$okhttp() {
        return this.queue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void initQueue$okhttp(TaskQueue taskQueue) {
        taskQueue.getClass();
        TaskQueue taskQueue2 = this.queue;
        if (taskQueue2 == taskQueue) {
            return;
        }
        if (taskQueue2 == null) {
            this.queue = taskQueue;
        } else {
            C2104o.m5276A("task is in multiple queues");
        }
    }

    public abstract long runOnce();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setNextExecuteNanoTime$okhttp(long j3) {
        this.nextExecuteNanoTime = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setQueue$okhttp(TaskQueue taskQueue) {
        this.queue = taskQueue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return this.name;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:16) call: okhttp3.internal.concurrent.Task.<init>(java.lang.String, boolean):void type: THIS */
    public /* synthetic */ Task(String str, boolean z9, int i9, AbstractC1411g abstractC1411g) {
        this(str, (i9 & 2) != 0 ? true : z9);
    }
}
