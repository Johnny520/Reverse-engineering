package io.fastkv;

/* JADX INFO: loaded from: classes.dex */
final class WeakCache {
    private final java.util.Map<java.lang.String, io.fastkv.WeakCache.ValueReference> cache;
    private final java.lang.ref.ReferenceQueue<java.lang.Object> queue;

    public static class ValueReference extends java.lang.ref.WeakReference<java.lang.Object> {
        private final java.lang.String key;

        public ValueReference(java.lang.String r1, java.lang.Object r2, java.lang.ref.ReferenceQueue<java.lang.Object> r3) {
                r0 = this;
                r0.<init>(r2, r3)
                r0.key = r1
                return
        }

        public static /* synthetic */ java.lang.String access$000(io.fastkv.WeakCache.ValueReference r0) {
                java.lang.String r0 = r0.key
                return r0
        }
    }

    public WeakCache() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.cache = r0
            java.lang.ref.ReferenceQueue r0 = new java.lang.ref.ReferenceQueue
            r0.<init>()
            r1.queue = r0
            return
    }

    private void cleanQueue() {
            r3 = this;
            java.lang.ref.ReferenceQueue<java.lang.Object> r0 = r3.queue
            java.lang.ref.Reference r0 = r0.poll()
            io.fastkv.WeakCache$ValueReference r0 = (io.fastkv.WeakCache.ValueReference) r0
        L8:
            if (r0 == 0) goto L30
            java.util.Map<java.lang.String, io.fastkv.WeakCache$ValueReference> r1 = r3.cache
            java.lang.String r2 = io.fastkv.WeakCache.ValueReference.access$000(r0)
            java.lang.Object r1 = r1.get(r2)
            io.fastkv.WeakCache$ValueReference r1 = (io.fastkv.WeakCache.ValueReference) r1
            if (r1 == 0) goto L27
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto L27
            java.util.Map<java.lang.String, io.fastkv.WeakCache$ValueReference> r1 = r3.cache
            java.lang.String r0 = io.fastkv.WeakCache.ValueReference.access$000(r0)
            r1.remove(r0)
        L27:
            java.lang.ref.ReferenceQueue<java.lang.Object> r0 = r3.queue
            java.lang.ref.Reference r0 = r0.poll()
            io.fastkv.WeakCache$ValueReference r0 = (io.fastkv.WeakCache.ValueReference) r0
            goto L8
        L30:
            return
    }

    public synchronized void clear() {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, io.fastkv.WeakCache$ValueReference> r0 = r1.cache     // Catch: java.lang.Throwable -> Lb
            r0.clear()     // Catch: java.lang.Throwable -> Lb
            r1.cleanQueue()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public synchronized java.lang.Object get(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            r1.cleanQueue()     // Catch: java.lang.Throwable -> L13
            java.util.Map<java.lang.String, io.fastkv.WeakCache$ValueReference> r0 = r1.cache     // Catch: java.lang.Throwable -> L13
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L13
            io.fastkv.WeakCache$ValueReference r2 = (io.fastkv.WeakCache.ValueReference) r2     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L15
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r2 = move-exception
            goto L18
        L15:
            r2 = 0
        L16:
            monitor-exit(r1)
            return r2
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    public synchronized void put(java.lang.String r4, java.lang.Object r5) {
            r3 = this;
            monitor-enter(r3)
            r3.cleanQueue()     // Catch: java.lang.Throwable -> L17
            if (r5 == 0) goto L25
            java.util.Map<java.lang.String, io.fastkv.WeakCache$ValueReference> r0 = r3.cache     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L17
            io.fastkv.WeakCache$ValueReference r0 = (io.fastkv.WeakCache.ValueReference) r0     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L17
            if (r0 == r5) goto L25
            goto L19
        L17:
            r4 = move-exception
            goto L27
        L19:
            java.util.Map<java.lang.String, io.fastkv.WeakCache$ValueReference> r0 = r3.cache     // Catch: java.lang.Throwable -> L17
            io.fastkv.WeakCache$ValueReference r1 = new io.fastkv.WeakCache$ValueReference     // Catch: java.lang.Throwable -> L17
            java.lang.ref.ReferenceQueue<java.lang.Object> r2 = r3.queue     // Catch: java.lang.Throwable -> L17
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L17
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L17
        L25:
            monitor-exit(r3)
            return
        L27:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
            throw r4
    }

    public synchronized void remove(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, io.fastkv.WeakCache$ValueReference> r0 = r1.cache     // Catch: java.lang.Throwable -> L8
            r0.remove(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }
}
