package com.bumptech.glide.util.pool;

/* JADX INFO: loaded from: classes.dex */
public final class FactoryPools {
    private static final int DEFAULT_POOL_SIZE = 20;
    private static final com.bumptech.glide.util.pool.FactoryPools.Resetter<java.lang.Object> EMPTY_RESETTER = null;
    private static final java.lang.String TAG = "FactoryPools";




    public interface Factory<T> {
        T create();
    }

    public static final class FactoryPool<T> implements Yue.C4820.InterfaceC4821<T> {
        private final com.bumptech.glide.util.pool.FactoryPools.Factory<T> factory;
        private final Yue.C4820.InterfaceC4821<T> pool;
        private final com.bumptech.glide.util.pool.FactoryPools.Resetter<T> resetter;

        public FactoryPool(@Yue.InterfaceC4410 Yue.C4820.InterfaceC4821<T> r1, @Yue.InterfaceC4410 com.bumptech.glide.util.pool.FactoryPools.Factory<T> r2, @Yue.InterfaceC4410 com.bumptech.glide.util.pool.FactoryPools.Resetter<T> r3) {
                r0 = this;
                r0.<init>()
                r0.pool = r1
                r0.factory = r2
                r0.resetter = r3
                return
        }

        @Override // Yue.C4820.InterfaceC4821
        public T acquire() {
                r4 = this;
                Yue.ۥۡۤۤ۠$ۥ<T> r0 = r4.pool
                java.lang.Object r0 = r0.acquire()
                if (r0 != 0) goto L2f
                com.bumptech.glide.util.pool.FactoryPools$Factory<T> r0 = r4.factory
                java.lang.Object r0 = r0.create()
                r1 = 2
                java.lang.String r2 = "FactoryPools"
                boolean r1 = android.util.Log.isLoggable(r2, r1)
                if (r1 == 0) goto L2f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Created new "
                r1.append(r3)
                java.lang.Class r3 = r0.getClass()
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.util.Log.v(r2, r1)
            L2f:
                boolean r1 = r0 instanceof com.bumptech.glide.util.pool.FactoryPools.Poolable
                if (r1 == 0) goto L3e
                r1 = r0
                com.bumptech.glide.util.pool.FactoryPools$Poolable r1 = (com.bumptech.glide.util.pool.FactoryPools.Poolable) r1
                com.bumptech.glide.util.pool.StateVerifier r1 = r1.getVerifier()
                r2 = 0
                r1.setRecycled(r2)
            L3e:
                return r0
        }

        @Override // Yue.C4820.InterfaceC4821
        public boolean release(@Yue.InterfaceC4410 T r3) {
                r2 = this;
                boolean r0 = r3 instanceof com.bumptech.glide.util.pool.FactoryPools.Poolable
                if (r0 == 0) goto Lf
                r0 = r3
                com.bumptech.glide.util.pool.FactoryPools$Poolable r0 = (com.bumptech.glide.util.pool.FactoryPools.Poolable) r0
                com.bumptech.glide.util.pool.StateVerifier r0 = r0.getVerifier()
                r1 = 1
                r0.setRecycled(r1)
            Lf:
                com.bumptech.glide.util.pool.FactoryPools$Resetter<T> r0 = r2.resetter
                r0.reset(r3)
                Yue.ۥۡۤۤ۠$ۥ<T> r0 = r2.pool
                boolean r3 = r0.release(r3)
                return r3
        }
    }

    public interface Poolable {
        @Yue.InterfaceC4410
        com.bumptech.glide.util.pool.StateVerifier getVerifier();
    }

    public interface Resetter<T> {
        void reset(@Yue.InterfaceC4410 T r1);
    }

    static {
            com.bumptech.glide.util.pool.FactoryPools$1 r0 = new com.bumptech.glide.util.pool.FactoryPools$1
            r0.<init>()
            com.bumptech.glide.util.pool.FactoryPools.EMPTY_RESETTER = r0
            return
    }

    private FactoryPools() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    private static <T extends com.bumptech.glide.util.pool.FactoryPools.Poolable> Yue.C4820.InterfaceC4821<T> build(@Yue.InterfaceC4410 Yue.C4820.InterfaceC4821<T> r1, @Yue.InterfaceC4410 com.bumptech.glide.util.pool.FactoryPools.Factory<T> r2) {
            com.bumptech.glide.util.pool.FactoryPools$Resetter r0 = emptyResetter()
            Yue.ۥۡۤۤ۠$ۥ r1 = build(r1, r2, r0)
            return r1
    }

    @Yue.InterfaceC4410
    private static <T> Yue.C4820.InterfaceC4821<T> build(@Yue.InterfaceC4410 Yue.C4820.InterfaceC4821<T> r1, @Yue.InterfaceC4410 com.bumptech.glide.util.pool.FactoryPools.Factory<T> r2, @Yue.InterfaceC4410 com.bumptech.glide.util.pool.FactoryPools.Resetter<T> r3) {
            com.bumptech.glide.util.pool.FactoryPools$FactoryPool r0 = new com.bumptech.glide.util.pool.FactoryPools$FactoryPool
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4410
    private static <T> com.bumptech.glide.util.pool.FactoryPools.Resetter<T> emptyResetter() {
            com.bumptech.glide.util.pool.FactoryPools$Resetter<java.lang.Object> r0 = com.bumptech.glide.util.pool.FactoryPools.EMPTY_RESETTER
            return r0
    }

    @Yue.InterfaceC4410
    public static <T extends com.bumptech.glide.util.pool.FactoryPools.Poolable> Yue.C4820.InterfaceC4821<T> simple(int r1, @Yue.InterfaceC4410 com.bumptech.glide.util.pool.FactoryPools.Factory<T> r2) {
            Yue.ۥۡۤۤ۠$ۥ۟ r0 = new Yue.ۥۡۤۤ۠$ۥ۟
            r0.<init>(r1)
            Yue.ۥۡۤۤ۠$ۥ r1 = build(r0, r2)
            return r1
    }

    @Yue.InterfaceC4410
    public static <T extends com.bumptech.glide.util.pool.FactoryPools.Poolable> Yue.C4820.InterfaceC4821<T> threadSafe(int r1, @Yue.InterfaceC4410 com.bumptech.glide.util.pool.FactoryPools.Factory<T> r2) {
            Yue.ۥۡۤۤ۠$ۥ۟۟ r0 = new Yue.ۥۡۤۤ۠$ۥ۟۟
            r0.<init>(r1)
            Yue.ۥۡۤۤ۠$ۥ r1 = build(r0, r2)
            return r1
    }

    @Yue.InterfaceC4410
    public static <T extends com.bumptech.glide.util.pool.FactoryPools.Poolable> Yue.C4820.InterfaceC4821<T> threadSafe(int r1, @Yue.InterfaceC4410 com.bumptech.glide.util.pool.FactoryPools.Factory<T> r2, @Yue.InterfaceC4410 com.bumptech.glide.util.pool.FactoryPools.Resetter<T> r3) {
            Yue.ۥۡۤۤ۠$ۥ۟۟ r0 = new Yue.ۥۡۤۤ۠$ۥ۟۟
            r0.<init>(r1)
            Yue.ۥۡۤۤ۠$ۥ r1 = build(r0, r2, r3)
            return r1
    }

    @Yue.InterfaceC4410
    public static <T> Yue.C4820.InterfaceC4821<java.util.List<T>> threadSafeList() {
            r0 = 20
            Yue.ۥۡۤۤ۠$ۥ r0 = threadSafeList(r0)
            return r0
    }

    @Yue.InterfaceC4410
    public static <T> Yue.C4820.InterfaceC4821<java.util.List<T>> threadSafeList(int r2) {
            Yue.ۥۡۤۤ۠$ۥ۟۟ r0 = new Yue.ۥۡۤۤ۠$ۥ۟۟
            r0.<init>(r2)
            com.bumptech.glide.util.pool.FactoryPools$2 r2 = new com.bumptech.glide.util.pool.FactoryPools$2
            r2.<init>()
            com.bumptech.glide.util.pool.FactoryPools$3 r1 = new com.bumptech.glide.util.pool.FactoryPools$3
            r1.<init>()
            Yue.ۥۡۤۤ۠$ۥ r2 = build(r0, r2, r1)
            return r2
    }
}
