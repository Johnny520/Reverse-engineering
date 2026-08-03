package com.bumptech.glide.load.engine.cache;

/* JADX INFO: loaded from: classes.dex */
final class DiskCacheWriteLocker {
    private final java.util.Map<java.lang.String, com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker.WriteLock> locks;
    private final com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker.WriteLockPool writeLockPool;

    public static class WriteLock {
        int interestedThreads;
        final java.util.concurrent.locks.Lock lock;

        public WriteLock() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
                r0.<init>()
                r1.lock = r0
                return
        }
    }

    public static class WriteLockPool {
        private static final int MAX_POOL_SIZE = 10;
        private final java.util.Queue<com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker.WriteLock> pool;

        public WriteLockPool() {
                r1 = this;
                r1.<init>()
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                r0.<init>()
                r1.pool = r0
                return
        }

        public com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker.WriteLock obtain() {
                r2 = this;
                java.util.Queue<com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLock> r0 = r2.pool
                monitor-enter(r0)
                java.util.Queue<com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLock> r1 = r2.pool     // Catch: java.lang.Throwable -> L14
                java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L14
                com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLock r1 = (com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker.WriteLock) r1     // Catch: java.lang.Throwable -> L14
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
                if (r1 != 0) goto L13
                com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLock r1 = new com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLock
                r1.<init>()
            L13:
                return r1
            L14:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
                throw r1
        }

        public void offer(com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker.WriteLock r4) {
                r3 = this;
                java.util.Queue<com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLock> r0 = r3.pool
                monitor-enter(r0)
                java.util.Queue<com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLock> r1 = r3.pool     // Catch: java.lang.Throwable -> L13
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L13
                r2 = 10
                if (r1 >= r2) goto L15
                java.util.Queue<com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLock> r1 = r3.pool     // Catch: java.lang.Throwable -> L13
                r1.offer(r4)     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r4 = move-exception
                goto L17
            L15:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return
            L17:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r4
        }
    }

    public DiskCacheWriteLocker() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.locks = r0
            com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLockPool r0 = new com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLockPool
            r0.<init>()
            r1.writeLockPool = r0
            return
    }

    public void acquire(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.String, com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLock> r0 = r2.locks     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L17
            com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLock r0 = (com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker.WriteLock) r0     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLockPool r0 = r2.writeLockPool     // Catch: java.lang.Throwable -> L17
            com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLock r0 = r0.obtain()     // Catch: java.lang.Throwable -> L17
            java.util.Map<java.lang.String, com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLock> r1 = r2.locks     // Catch: java.lang.Throwable -> L17
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r3 = move-exception
            goto L26
        L19:
            int r3 = r0.interestedThreads     // Catch: java.lang.Throwable -> L17
            int r3 = r3 + 1
            r0.interestedThreads = r3     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.locks.Lock r3 = r0.lock
            r3.lock()
            return
        L26:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    public void release(java.lang.String r6) {
            r5 = this;
            monitor-enter(r5)
            java.util.Map<java.lang.String, com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLock> r0 = r5.locks     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L2d
            com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLock r0 = (com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker.WriteLock) r0     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = com.bumptech.glide.util.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L2d
            com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLock r0 = (com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker.WriteLock) r0     // Catch: java.lang.Throwable -> L2d
            int r1 = r0.interestedThreads     // Catch: java.lang.Throwable -> L2d
            r2 = 1
            if (r1 < r2) goto L5d
            int r1 = r1 - r2
            r0.interestedThreads = r1     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L56
            java.util.Map<java.lang.String, com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLock> r1 = r5.locks     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r1.remove(r6)     // Catch: java.lang.Throwable -> L2d
            com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLock r1 = (com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker.WriteLock) r1     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r1.equals(r0)     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2f
            com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLockPool r6 = r5.writeLockPool     // Catch: java.lang.Throwable -> L2d
            r6.offer(r1)     // Catch: java.lang.Throwable -> L2d
            goto L56
        L2d:
            r6 = move-exception
            goto L7e
        L2f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r3.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = "Removed the wrong lock, expected to remove: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L2d
            r3.append(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = ", but actually removed: "
            r3.append(r0)     // Catch: java.lang.Throwable -> L2d
            r3.append(r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = ", safeKey: "
            r3.append(r0)     // Catch: java.lang.Throwable -> L2d
            r3.append(r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L2d
            throw r2     // Catch: java.lang.Throwable -> L2d
        L56:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.locks.Lock r6 = r0.lock
            r6.unlock()
            return
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r2.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "Cannot release a lock that is not held, safeKey: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L2d
            r2.append(r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = ", interestedThreads: "
            r2.append(r6)     // Catch: java.lang.Throwable -> L2d
            int r6 = r0.interestedThreads     // Catch: java.lang.Throwable -> L2d
            r2.append(r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L2d
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L2d
            throw r1     // Catch: java.lang.Throwable -> L2d
        L7e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
    }
}
