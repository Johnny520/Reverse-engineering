package io.fastkv;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p000.RunnableC0299hi;

/* JADX INFO: loaded from: classes.dex */
public class TagExecutor {
    private final Set<String> scheduledTags = new HashSet();
    private final Map<String, Runnable> waitingTasks = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(Runnable runnable, String str) {
        try {
            runnable.run();
        } finally {
            scheduleNext(str);
        }
    }

    private synchronized void scheduleNext(String str) {
        try {
            Runnable runnableRemove = this.waitingTasks.remove(str);
            if (runnableRemove != null) {
                start(str, runnableRemove);
            } else {
                this.scheduledTags.remove(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void start(String str, Runnable runnable) {
        FastKVConfig.getExecutor().execute(new RunnableC0299hi(this, runnable, str, 2));
    }

    public synchronized void execute(String str, Runnable runnable) {
        if (runnable == null) {
            return;
        }
        try {
            if (this.scheduledTags.contains(str)) {
                this.waitingTasks.put(str, runnable);
            } else {
                this.scheduledTags.add(str);
                start(str, runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean isEmpty() {
        /*
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
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fastkv.TagExecutor.isEmpty():boolean");
    }
}
