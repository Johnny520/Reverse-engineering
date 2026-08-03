package okhttp3.internal.concurrent;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Task {
    private final boolean cancelable;
    private final java.lang.String name;
    private long nextExecuteNanoTime;
    private okhttp3.internal.concurrent.TaskQueue queue;

    public Task(java.lang.String r1, boolean r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.name = r1
            r0.cancelable = r2
            r1 = -1
            r0.nextExecuteNanoTime = r1
            return
    }

    public /* synthetic */ Task(java.lang.String r1, boolean r2, int r3, gg.g r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 1
        L5:
            r0.<init>(r1, r2)
            return
    }

    public final boolean getCancelable() {
            r1 = this;
            boolean r0 = r1.cancelable
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final long getNextExecuteNanoTime$okhttp() {
            r2 = this;
            long r0 = r2.nextExecuteNanoTime
            return r0
    }

    public final okhttp3.internal.concurrent.TaskQueue getQueue$okhttp() {
            r1 = this;
            okhttp3.internal.concurrent.TaskQueue r0 = r1.queue
            return r0
    }

    public final void initQueue$okhttp(okhttp3.internal.concurrent.TaskQueue r2) {
            r1 = this;
            r2.getClass()
            okhttp3.internal.concurrent.TaskQueue r0 = r1.queue
            if (r0 != r2) goto L8
            return
        L8:
            if (r0 != 0) goto Ld
            r1.queue = r2
            return
        Ld:
            java.lang.String r2 = "task is in multiple queues"
            j8.o.A(r2)
            return
    }

    public abstract long runOnce();

    public final void setNextExecuteNanoTime$okhttp(long r1) {
            r0 = this;
            r0.nextExecuteNanoTime = r1
            return
    }

    public final void setQueue$okhttp(okhttp3.internal.concurrent.TaskQueue r1) {
            r0 = this;
            r0.queue = r1
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }
}
