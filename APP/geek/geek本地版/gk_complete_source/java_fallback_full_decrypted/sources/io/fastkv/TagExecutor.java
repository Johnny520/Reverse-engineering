package io.fastkv;

/* JADX INFO: loaded from: classes.dex */
public class TagExecutor {
    private final java.util.Set<java.lang.String> scheduledTags;
    private final java.util.Map<java.lang.String, java.lang.Runnable> waitingTasks;

    public TagExecutor() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.scheduledTags = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.waitingTasks = r0
            return
    }

    public static /* synthetic */ void a(io.fastkv.TagExecutor r0, java.lang.Runnable r1, java.lang.String r2) {
            r0.lambda$start$0(r1, r2)
            return
    }

    private /* synthetic */ void lambda$start$0(java.lang.Runnable r1, java.lang.String r2) {
            r0 = this;
            r1.run()     // Catch: java.lang.Throwable -> L7
            r0.scheduleNext(r2)
            return
        L7:
            r1 = move-exception
            r0.scheduleNext(r2)
            throw r1
    }

    private synchronized void scheduleNext(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.Runnable> r0 = r1.waitingTasks     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r0 = r0.remove(r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            r1.start(r2, r0)     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r2 = move-exception
            goto L18
        L11:
            java.util.Set<java.lang.String> r0 = r1.scheduledTags     // Catch: java.lang.Throwable -> Lf
            r0.remove(r2)     // Catch: java.lang.Throwable -> Lf
        L16:
            monitor-exit(r1)
            return
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    private void start(java.lang.String r4, java.lang.Runnable r5) {
            r3 = this;
            java.util.concurrent.Executor r0 = io.fastkv.FastKVConfig.getExecutor()
            fi r1 = new fi
            r2 = 2
            r1.<init>(r3, r5, r4, r2)
            r0.execute(r1)
            return
    }

    public synchronized void execute(java.lang.String r2, java.lang.Runnable r3) {
            r1 = this;
            monitor-enter(r1)
            if (r3 != 0) goto L5
            monitor-exit(r1)
            return
        L5:
            java.util.Set<java.lang.String> r0 = r1.scheduledTags     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            java.util.Set<java.lang.String> r0 = r1.scheduledTags     // Catch: java.lang.Throwable -> L16
            r0.add(r2)     // Catch: java.lang.Throwable -> L16
            r1.start(r2, r3)     // Catch: java.lang.Throwable -> L16
            goto L1d
        L16:
            r2 = move-exception
            goto L1f
        L18:
            java.util.Map<java.lang.String, java.lang.Runnable> r0 = r1.waitingTasks     // Catch: java.lang.Throwable -> L16
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L16
        L1d:
            monitor-exit(r1)
            return
        L1f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2
    }

    public synchronized boolean isEmpty() {
            r1 = this;
            monitor-enter(r1)
            java.util.Set<java.lang.String> r0 = r1.scheduledTags     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            java.util.Map<java.lang.String, java.lang.Runnable> r0 = r1.waitingTasks     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L13:
            r0 = move-exception
            goto L18
        L15:
            r0 = 0
        L16:
            monitor-exit(r1)
            return r0
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r0
    }
}
