package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: o3 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC2303o3 implements Executor {

    /* JADX INFO: renamed from: a */
    public final Object f8063a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f8064b;

    /* JADX INFO: renamed from: c */
    public final ExecutorC2346p3 f8065c;

    /* JADX INFO: renamed from: d */
    public Runnable f8066d;

    public ExecutorC2303o3(ExecutorC2346p3 r2) {
        this.f8063a = new Object();
        this.f8064b = new ArrayDeque();
        this.f8065c = r2;
    }

    /* JADX INFO: renamed from: a */
    public final void m4680a() {
        Object r0 = this.f8063a;
        monitor-enter(r0);
        Runnable r1 = (Runnable) this.f8064b.poll();     // Catch: Throwable -> L7
        this.f8066d = r1;     // Catch: Throwable -> L7
        if (r1 == null) goto L9;
        this.f8065c.execute(r1);     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r5) {
        Object r0 = this.f8063a;
        monitor-enter(r0);
        this.f8064b.add(new RunnableC2260n3(0, this, r5));     // Catch: Throwable -> L7
        if (this.f8066d != null) goto L9;
        m4680a();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
