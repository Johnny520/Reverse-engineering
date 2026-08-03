package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/DispatchQueue;", "", "<init>", "()V", "Ljava/lang/Runnable;", "runnable", "LYue/ۥۣۢ۠ۤ;", "enqueue", "(Ljava/lang/Runnable;)V", "pause", "resume", "finish", "drainQueue", "", "canRun", "()Z", "LYue/ۥ۟ۧۦۥ;", "context", "dispatchAndEnqueue", "(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V", "paused", "Z", "finished", "isDraining", "Ljava/util/Queue;", "queue", "Ljava/util/Queue;", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
public final class DispatchQueue {
    private boolean finished;
    private boolean isDraining;
    private boolean paused;

    @Yue.InterfaceC4418
    private final java.util.Queue<java.lang.Runnable> queue;

    public DispatchQueue() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.paused = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.queue = r0
            return
    }

    private static final void dispatchAndEnqueue$lambda$2$lambda$1(androidx.lifecycle.DispatchQueue r1, java.lang.Runnable r2) {
            java.lang.String r0 = "this$0"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "$runnable"
            Yue.C3329.m13906(r2, r0)
            r1.enqueue(r2)
            return
    }

    @Yue.InterfaceC3875
    private final void enqueue(java.lang.Runnable r2) {
            r1 = this;
            java.util.Queue<java.lang.Runnable> r0 = r1.queue
            boolean r2 = r0.offer(r2)
            if (r2 == 0) goto Lc
            r1.drainQueue()
            return
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "cannot enqueue any more runnables"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m29514(androidx.lifecycle.DispatchQueue r0, java.lang.Runnable r1) {
            dispatchAndEnqueue$lambda$2$lambda$1(r0, r1)
            return
    }

    @Yue.InterfaceC3875
    public final boolean canRun() {
            r1 = this;
            boolean r0 = r1.finished
            if (r0 != 0) goto Lb
            boolean r0 = r1.paused
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    @Yue.InterfaceC0412
    public final void dispatchAndEnqueue(@Yue.InterfaceC4418 Yue.InterfaceC1632 r3, @Yue.InterfaceC4418 java.lang.Runnable r4) {
            r2 = this;
            java.lang.String r0 = "context"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "runnable"
            Yue.C3329.m13906(r4, r0)
            Yue.ۥ۠ۨۥۥ r0 = Yue.C1878.m8793()
            Yue.ۥ۠ۨۥۥ r0 = r0.mo12588()
            boolean r1 = r0.isDispatchNeeded(r3)
            if (r1 != 0) goto L23
            boolean r1 = r2.canRun()
            if (r1 == 0) goto L1f
            goto L23
        L1f:
            r2.enqueue(r4)
            goto L2b
        L23:
            Yue.ۥ۠۟ۢ r1 = new Yue.ۥ۠۟ۢ
            r1.<init>(r2, r4)
            r0.dispatch(r3, r1)
        L2b:
            return
    }

    @Yue.InterfaceC3875
    public final void drainQueue() {
            r3 = this;
            boolean r0 = r3.isDraining
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            r1 = 1
            r3.isDraining = r1     // Catch: java.lang.Throwable -> L27
        L9:
            java.util.Queue<java.lang.Runnable> r2 = r3.queue     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L27
            r2 = r2 ^ r1
            if (r2 == 0) goto L29
            boolean r2 = r3.canRun()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L19
            goto L29
        L19:
            java.util.Queue<java.lang.Runnable> r2 = r3.queue     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L27
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L9
            r2.run()     // Catch: java.lang.Throwable -> L27
            goto L9
        L27:
            r1 = move-exception
            goto L2c
        L29:
            r3.isDraining = r0
            return
        L2c:
            r3.isDraining = r0
            throw r1
    }

    @Yue.InterfaceC3875
    public final void finish() {
            r1 = this;
            r0 = 1
            r1.finished = r0
            r1.drainQueue()
            return
    }

    @Yue.InterfaceC3875
    public final void pause() {
            r1 = this;
            r0 = 1
            r1.paused = r0
            return
    }

    @Yue.InterfaceC3875
    public final void resume() {
            r2 = this;
            boolean r0 = r2.paused
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r2.finished
            r0 = r0 ^ 1
            if (r0 == 0) goto L12
            r0 = 0
            r2.paused = r0
            r2.drainQueue()
            return
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot resume a finished dispatcher"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
