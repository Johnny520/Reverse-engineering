package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
class EngineResource<Z> implements com.bumptech.glide.load.engine.Resource<Z> {
    private int acquired;
    private final boolean isMemoryCacheable;
    private final boolean isRecyclable;
    private boolean isRecycled;
    private final com.bumptech.glide.load.Key key;
    private final com.bumptech.glide.load.engine.EngineResource.ResourceListener listener;
    private final com.bumptech.glide.load.engine.Resource<Z> resource;

    public interface ResourceListener {
        void onResourceReleased(com.bumptech.glide.load.Key r1, com.bumptech.glide.load.engine.EngineResource<?> r2);
    }

    public EngineResource(com.bumptech.glide.load.engine.Resource<Z> r1, boolean r2, boolean r3, com.bumptech.glide.load.Key r4, com.bumptech.glide.load.engine.EngineResource.ResourceListener r5) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
            com.bumptech.glide.load.engine.Resource r1 = (com.bumptech.glide.load.engine.Resource) r1
            r0.resource = r1
            r0.isMemoryCacheable = r2
            r0.isRecyclable = r3
            r0.key = r4
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r5)
            com.bumptech.glide.load.engine.EngineResource$ResourceListener r1 = (com.bumptech.glide.load.engine.EngineResource.ResourceListener) r1
            r0.listener = r1
            return
    }

    public synchronized void acquire() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isRecycled     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            int r0 = r2.acquired     // Catch: java.lang.Throwable -> Ld
            int r0 = r0 + 1
            r2.acquired = r0     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        Ld:
            r0 = move-exception
            goto L17
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = "Cannot acquire a recycled resource"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0     // Catch: java.lang.Throwable -> Ld
        L17:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @Yue.InterfaceC4410
    public Z get() {
            r1 = this;
            com.bumptech.glide.load.engine.Resource<Z> r0 = r1.resource
            java.lang.Object r0 = r0.get()
            return r0
    }

    public com.bumptech.glide.load.engine.Resource<Z> getResource() {
            r1 = this;
            com.bumptech.glide.load.engine.Resource<Z> r0 = r1.resource
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @Yue.InterfaceC4410
    public java.lang.Class<Z> getResourceClass() {
            r1 = this;
            com.bumptech.glide.load.engine.Resource<Z> r0 = r1.resource
            java.lang.Class r0 = r0.getResourceClass()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
            r1 = this;
            com.bumptech.glide.load.engine.Resource<Z> r0 = r1.resource
            int r0 = r0.getSize()
            return r0
    }

    public boolean isMemoryCacheable() {
            r1 = this;
            boolean r0 = r1.isMemoryCacheable
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public synchronized void recycle() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.acquired     // Catch: java.lang.Throwable -> L16
            if (r0 > 0) goto L22
            boolean r0 = r2.isRecycled     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L1a
            r0 = 1
            r2.isRecycled = r0     // Catch: java.lang.Throwable -> L16
            boolean r0 = r2.isRecyclable     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L18
            com.bumptech.glide.load.engine.Resource<Z> r0 = r2.resource     // Catch: java.lang.Throwable -> L16
            r0.recycle()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r0 = move-exception
            goto L2a
        L18:
            monitor-exit(r2)
            return
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "Cannot recycle a resource that has already been recycled"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "Cannot recycle a resource while it is still acquired"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        L2a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r0
    }

    public void release() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.acquired     // Catch: java.lang.Throwable -> L18
            if (r0 <= 0) goto L1a
            r1 = 1
            int r0 = r0 - r1
            r2.acquired = r0     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L17
            com.bumptech.glide.load.engine.EngineResource$ResourceListener r0 = r2.listener
            com.bumptech.glide.load.Key r1 = r2.key
            r0.onResourceReleased(r1, r2)
        L17:
            return
        L18:
            r0 = move-exception
            goto L22
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "Cannot release a recycled or not yet acquired resource"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r0     // Catch: java.lang.Throwable -> L18
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    public synchronized java.lang.String toString() {
            r2 = this;
            monitor-enter(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r0.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "EngineResource{isMemoryCacheable="
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            boolean r1 = r2.isMemoryCacheable     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = ", listener="
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            com.bumptech.glide.load.engine.EngineResource$ResourceListener r1 = r2.listener     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = ", key="
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            com.bumptech.glide.load.Key r1 = r2.key     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = ", acquired="
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            int r1 = r2.acquired     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = ", isRecycled="
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            boolean r1 = r2.isRecycled     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = ", resource="
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            com.bumptech.glide.load.engine.Resource<Z> r1 = r2.resource     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r2)
            return r0
        L4d:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            throw r0
    }
}
