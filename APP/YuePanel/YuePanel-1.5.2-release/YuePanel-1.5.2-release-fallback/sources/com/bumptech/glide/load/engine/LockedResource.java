package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
final class LockedResource<Z> implements com.bumptech.glide.load.engine.Resource<Z>, com.bumptech.glide.util.pool.FactoryPools.Poolable {
    private static final Yue.C4820.InterfaceC4821<com.bumptech.glide.load.engine.LockedResource<?>> POOL = null;
    private boolean isLocked;
    private boolean isRecycled;
    private final com.bumptech.glide.util.pool.StateVerifier stateVerifier;
    private com.bumptech.glide.load.engine.Resource<Z> toWrap;


    static {
            com.bumptech.glide.load.engine.LockedResource$1 r0 = new com.bumptech.glide.load.engine.LockedResource$1
            r0.<init>()
            r1 = 20
            Yue.ۥۡۤۤ۠$ۥ r0 = com.bumptech.glide.util.pool.FactoryPools.threadSafe(r1, r0)
            com.bumptech.glide.load.engine.LockedResource.POOL = r0
            return
    }

    public LockedResource() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.util.pool.StateVerifier r0 = com.bumptech.glide.util.pool.StateVerifier.newInstance()
            r1.stateVerifier = r0
            return
    }

    private void init(com.bumptech.glide.load.engine.Resource<Z> r2) {
            r1 = this;
            r0 = 0
            r1.isRecycled = r0
            r0 = 1
            r1.isLocked = r0
            r1.toWrap = r2
            return
    }

    @Yue.InterfaceC4410
    public static <Z> com.bumptech.glide.load.engine.LockedResource<Z> obtain(com.bumptech.glide.load.engine.Resource<Z> r1) {
            Yue.ۥۡۤۤ۠$ۥ<com.bumptech.glide.load.engine.LockedResource<?>> r0 = com.bumptech.glide.load.engine.LockedResource.POOL
            java.lang.Object r0 = r0.acquire()
            com.bumptech.glide.load.engine.LockedResource r0 = (com.bumptech.glide.load.engine.LockedResource) r0
            java.lang.Object r0 = com.bumptech.glide.util.Preconditions.checkNotNull(r0)
            com.bumptech.glide.load.engine.LockedResource r0 = (com.bumptech.glide.load.engine.LockedResource) r0
            r0.init(r1)
            return r0
    }

    private void release() {
            r1 = this;
            r0 = 0
            r1.toWrap = r0
            Yue.ۥۡۤۤ۠$ۥ<com.bumptech.glide.load.engine.LockedResource<?>> r0 = com.bumptech.glide.load.engine.LockedResource.POOL
            r0.release(r1)
            return
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @Yue.InterfaceC4410
    public Z get() {
            r1 = this;
            com.bumptech.glide.load.engine.Resource<Z> r0 = r1.toWrap
            java.lang.Object r0 = r0.get()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @Yue.InterfaceC4410
    public java.lang.Class<Z> getResourceClass() {
            r1 = this;
            com.bumptech.glide.load.engine.Resource<Z> r0 = r1.toWrap
            java.lang.Class r0 = r0.getResourceClass()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
            r1 = this;
            com.bumptech.glide.load.engine.Resource<Z> r0 = r1.toWrap
            int r0 = r0.getSize()
            return r0
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    @Yue.InterfaceC4410
    public com.bumptech.glide.util.pool.StateVerifier getVerifier() {
            r1 = this;
            com.bumptech.glide.util.pool.StateVerifier r0 = r1.stateVerifier
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public synchronized void recycle() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.util.pool.StateVerifier r0 = r1.stateVerifier     // Catch: java.lang.Throwable -> L16
            r0.throwIfRecycled()     // Catch: java.lang.Throwable -> L16
            r0 = 1
            r1.isRecycled = r0     // Catch: java.lang.Throwable -> L16
            boolean r0 = r1.isLocked     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            com.bumptech.glide.load.engine.Resource<Z> r0 = r1.toWrap     // Catch: java.lang.Throwable -> L16
            r0.recycle()     // Catch: java.lang.Throwable -> L16
            r1.release()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r0 = move-exception
            goto L1a
        L18:
            monitor-exit(r1)
            return
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r0
    }

    public synchronized void unlock() {
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.util.pool.StateVerifier r0 = r2.stateVerifier     // Catch: java.lang.Throwable -> L15
            r0.throwIfRecycled()     // Catch: java.lang.Throwable -> L15
            boolean r0 = r2.isLocked     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L19
            r0 = 0
            r2.isLocked = r0     // Catch: java.lang.Throwable -> L15
            boolean r0 = r2.isRecycled     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            r2.recycle()     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r0 = move-exception
            goto L21
        L17:
            monitor-exit(r2)
            return
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "Already unlocked"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L15
        L21:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0
    }
}
