package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class u5 implements Executor {
    public final Object a;
    public final ArrayDeque b;
    public final v5 c;
    public Runnable d;

    public u5(v5 r2) {
        this.a = new Object();
        this.b = new ArrayDeque();
        this.c = r2;
    }

    public final void a() {
        Object r0 = this.a;
        monitor-enter(r0);
        Runnable r1 = (Runnable) this.b.poll();     // Catch: Throwable -> L7
        this.d = r1;     // Catch: Throwable -> L7
        if (r1 == null) goto L9;
        this.c.execute(r1);     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r5) {
        Object r0 = this.a;
        monitor-enter(r0);
        this.b.add(new t5(this, 0, r5));     // Catch: Throwable -> L7
        if (this.d != null) goto L9;
        a();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
