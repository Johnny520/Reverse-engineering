package io.fastkv;

import defpackage.fi;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class TagExecutor {
    private final Set<String> scheduledTags;
    private final Map<String, Runnable> waitingTasks;

    public TagExecutor() {
        this.scheduledTags = new HashSet();
        this.waitingTasks = new HashMap();
    }

    public static /* synthetic */ void a(TagExecutor r0, Runnable r1, String r2) {
        r0.lambda$start$0(r1, r2);
    }

    private /* synthetic */ void lambda$start$0(Runnable r1, String r2) {
        r1.run();     // Catch: Throwable -> L5
        scheduleNext(r2);
        return;
    L5:
        th = move-exception;
        scheduleNext(r2);
        throw th;
    }

    private synchronized void scheduleNext(String r2) {
        monitor-enter(this);
        Runnable r0 = this.waitingTasks.remove(r2);     // Catch: Throwable -> L6
        if (r0 == null) goto L8;
        start(r2, r0);     // Catch: Throwable -> L6
    L9:
        monitor-exit(this);
        return;
    L8:
        this.scheduledTags.remove(r2);     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        throw th;
    }

    private void start(String r4, Runnable r5) {
        FastKVConfig.getExecutor().execute(new fi(this, r5, r4, 2));
    }

    public synchronized void execute(String r2, Runnable r3) {
        monitor-enter(this);
        if (r3 != null) goto L16;
        monitor-exit(this);
        return;
    L16:
    L9:
        th = move-exception;
        throw th;
    L7:
        if (this.scheduledTags.contains(r2) == true) goto L11;
        this.scheduledTags.add(r2);     // Catch: Throwable -> L9
        start(r2, r3);     // Catch: Throwable -> L9
    L12:
        monitor-exit(this);
        return;
    L11:
        this.waitingTasks.put(r2, r3);     // Catch: Throwable -> L9
        goto L12
    }

    public synchronized boolean isEmpty() {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.scheduledTags.isEmpty() == false) goto L10;
        if (this.waitingTasks.isEmpty() == false) goto L10;
        boolean r0 = true;
    L11:
        monitor-exit(this);
        return r0;
    L10:
        r0 = false;
        goto L11
    }
}
