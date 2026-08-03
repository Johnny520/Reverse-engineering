package com.bumptech.glide.load.engine;

import Yue.C6702;
import Yue.InterfaceC6391;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;

/* JADX INFO: loaded from: classes.dex */
final class LockedResource<Z> implements Resource<Z>, FactoryPools.Poolable {
    private static final C6702.InterfaceC1067<LockedResource<?>> POOL = FactoryPools.threadSafe(20, new FactoryPools.Factory<LockedResource<?>>() { // from class: com.bumptech.glide.load.engine.LockedResource.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: create()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        public LockedResource<?> create() {
            return new LockedResource<>();
        }
    });
    private boolean isLocked;
    private boolean isRecycled;
    private final StateVerifier stateVerifier = StateVerifier.newInstance();
    private Resource<Z> toWrap;

    private void init(Resource<Z> resource) {
        this.isRecycled = false;
        this.isLocked = true;
        this.toWrap = resource;
    }

    @InterfaceC6391
    public static <Z> LockedResource<Z> obtain(Resource<Z> resource) {
        LockedResource<Z> lockedResource = (LockedResource) Preconditions.checkNotNull(POOL.acquire());
        lockedResource.init(resource);
        return lockedResource;
    }

    private void release() {
        this.toWrap = null;
        POOL.release(this);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @InterfaceC6391
    public Z get() {
        return this.toWrap.get();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @InterfaceC6391
    public Class<Z> getResourceClass() {
        return this.toWrap.getResourceClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
        return this.toWrap.getSize();
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    @InterfaceC6391
    public StateVerifier getVerifier() {
        return this.stateVerifier;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public synchronized void recycle() {
        this.stateVerifier.throwIfRecycled();
        this.isRecycled = true;
        if (!this.isLocked) {
            this.toWrap.recycle();
            release();
        }
    }

    public synchronized void unlock() {
        this.stateVerifier.throwIfRecycled();
        if (!this.isLocked) {
            throw new IllegalStateException("Already unlocked");
        }
        this.isLocked = false;
        if (this.isRecycled) {
            recycle();
        }
    }
}
