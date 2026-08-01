package io.fastkv;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class WeakCache {
    private final Map<String, ValueReference> cache;
    private final ReferenceQueue<Object> queue;

    public static class ValueReference extends WeakReference<Object> {
        private final String key;

        public ValueReference(String r1, Object r2, ReferenceQueue<Object> r3) {
            super(r2, r3);
            this.key = r1;
        }

        public static /* synthetic */ String access$000(ValueReference r0) {
            return r0.key;
        }
    }

    public WeakCache() {
        this.cache = new HashMap();
        this.queue = new ReferenceQueue();
    }

    private void cleanQueue() {
        ValueReference r0 = (ValueReference) this.queue.poll();
    L3:
        if (r0 == null) goto L10;
        ValueReference r1 = this.cache.get(ValueReference.access$000(r0));
        if (r1 == null) goto L9;
        if (r1.get() != null) goto L9;
        this.cache.remove(ValueReference.access$000(r0));
    L9:
        r0 = (ValueReference) this.queue.poll();
        goto L3
    }

    public synchronized void clear() {
        monitor-enter(this);
        this.cache.clear();     // Catch: Throwable -> L6
        cleanQueue();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized Object get(String r2) {
        monitor-enter(this);
        cleanQueue();     // Catch: Throwable -> L7
        ValueReference r22 = this.cache.get(r2);     // Catch: Throwable -> L7
        if (r22 == null) goto L9;
        Object r23 = r22.get();     // Catch: Throwable -> L7
    L10:
        monitor-exit(this);
        return r23;
    L9:
        r23 = null;
    L7:
        th = move-exception;
        throw th;
    }

    public synchronized void put(String r4, Object r5) {
        monitor-enter(this);
        cleanQueue();     // Catch: Throwable -> L10
        if (r5 == null) goto L13;
        ValueReference r0 = this.cache.get(r4);     // Catch: Throwable -> L10
        if (r0 != null) goto L8;
    L12:
        this.cache.put(r4, new ValueReference(r4, r5, this.queue));     // Catch: Throwable -> L10
        goto L13
    L8:
        if (r0.get() != r5) goto L12;
    L13:
        monitor-exit(this);
        return;
    L10:
        th = move-exception;
        throw th;
    }

    public synchronized void remove(String r2) {
        monitor-enter(this);
        this.cache.remove(r2);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }
}
