package androidx.core.util;

/* JADX INFO: loaded from: classes2.dex */
public final class Pools {

    public interface Pool<T> {
        T acquire();

        boolean release(T r1);
    }

    public static class SimplePool<T> implements androidx.core.util.Pools.Pool<T> {
        private final java.lang.Object[] mPool;
        private int mPoolSize;

        public SimplePool(int r3) {
                r2 = this;
                r2.<init>()
                if (r3 <= 0) goto La
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r2.mPool = r0
                return
            La:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "The max pool size must be > 0"
                r0.<init>(r1)
                throw r0
        }

        private boolean isInPool(T r3) {
                r2 = this;
                r0 = 0
            L1:
                int r1 = r2.mPoolSize
                if (r0 >= r1) goto L10
                java.lang.Object[] r1 = r2.mPool
                r1 = r1[r0]
                if (r1 != r3) goto Ld
                r1 = 1
                return r1
            Ld:
                int r0 = r0 + 1
                goto L1
            L10:
                r0 = 0
                return r0
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
                r4 = this;
                int r0 = r4.mPoolSize
                r1 = 0
                if (r0 <= 0) goto L18
                int r0 = r4.mPoolSize
                int r0 = r0 + (-1)
                java.lang.Object[] r2 = r4.mPool
                r2 = r2[r0]
                java.lang.Object[] r3 = r4.mPool
                r3[r0] = r1
                int r1 = r4.mPoolSize
                int r1 = r1 + (-1)
                r4.mPoolSize = r1
                return r2
            L18:
                return r1
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(T r3) {
                r2 = this;
                boolean r0 = r2.isInPool(r3)
                if (r0 != 0) goto L1c
                int r0 = r2.mPoolSize
                java.lang.Object[] r1 = r2.mPool
                int r1 = r1.length
                if (r0 >= r1) goto L1a
                java.lang.Object[] r0 = r2.mPool
                int r1 = r2.mPoolSize
                r0[r1] = r3
                int r0 = r2.mPoolSize
                r1 = 1
                int r0 = r0 + r1
                r2.mPoolSize = r0
                return r1
            L1a:
                r0 = 0
                return r0
            L1c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Already in the pool!"
                r0.<init>(r1)
                throw r0
        }
    }

    public static class SynchronizedPool<T> extends androidx.core.util.Pools.SimplePool<T> {
        private final java.lang.Object mLock;

        public SynchronizedPool(int r2) {
                r1 = this;
                r1.<init>(r2)
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.mLock = r0
                return
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public T acquire() {
                r2 = this;
                java.lang.Object r0 = r2.mLock
                monitor-enter(r0)
                java.lang.Object r1 = super.acquire()     // Catch: java.lang.Throwable -> L9
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                return r1
            L9:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                throw r1
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(T r3) {
                r2 = this;
                java.lang.Object r0 = r2.mLock
                monitor-enter(r0)
                boolean r1 = super.release(r3)     // Catch: java.lang.Throwable -> L9
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                return r1
            L9:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                throw r1
        }
    }

    private Pools() {
            r0 = this;
            r0.<init>()
            return
    }
}
