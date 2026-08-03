package com.bumptech.glide.load.engine;

import Yue.C6702;
import Yue.InterfaceC5225;
import Yue.InterfaceC6391;
import Yue.InterfaceC8392;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.EngineResource;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.Executors;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
class EngineJob<R> implements DecodeJob.Callback<R>, FactoryPools.Poolable {
    private static final EngineResourceFactory DEFAULT_FACTORY = new EngineResourceFactory();
    private final GlideExecutor animationExecutor;
    final ResourceCallbacksAndExecutors cbs;
    DataSource dataSource;
    private DecodeJob<R> decodeJob;
    private final GlideExecutor diskCacheExecutor;
    private final EngineJobListener engineJobListener;
    EngineResource<?> engineResource;
    private final EngineResourceFactory engineResourceFactory;
    GlideException exception;
    private boolean hasLoadFailed;
    private boolean hasResource;
    private boolean isCacheable;
    private volatile boolean isCancelled;
    private boolean isLoadedFromAlternateCacheKey;
    private Key key;
    private boolean onlyRetrieveFromCache;
    private final AtomicInteger pendingCallbacks;
    private final C6702.InterfaceC1067<EngineJob<?>> pool;
    private Resource<?> resource;
    private final EngineResource.ResourceListener resourceListener;
    private final GlideExecutor sourceExecutor;
    private final GlideExecutor sourceUnlimitedExecutor;
    private final StateVerifier stateVerifier;
    private boolean useAnimationPool;
    private boolean useUnlimitedSourceGeneratorPool;

    public class CallLoadFailed implements Runnable {

        /* JADX INFO: renamed from: cb */
        private final ResourceCallback f4048cb;

        public CallLoadFailed(ResourceCallback resourceCallback) {
            this.f4048cb = resourceCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f4048cb.getLock()) {
                synchronized (EngineJob.this) {
                    try {
                        if (EngineJob.this.cbs.contains(this.f4048cb)) {
                            EngineJob.this.callCallbackOnLoadFailed(this.f4048cb);
                        }
                        EngineJob.this.decrementPendingCallbacks();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public class CallResourceReady implements Runnable {

        /* JADX INFO: renamed from: cb */
        private final ResourceCallback f4049cb;

        public CallResourceReady(ResourceCallback resourceCallback) {
            this.f4049cb = resourceCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f4049cb.getLock()) {
                synchronized (EngineJob.this) {
                    try {
                        if (EngineJob.this.cbs.contains(this.f4049cb)) {
                            EngineJob.this.engineResource.acquire();
                            EngineJob.this.callCallbackOnResourceReady(this.f4049cb);
                            EngineJob.this.removeCallback(this.f4049cb);
                        }
                        EngineJob.this.decrementPendingCallbacks();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    @InterfaceC8392
    public static class EngineResourceFactory {
        public <R> EngineResource<R> build(Resource<R> resource, boolean z, Key key, EngineResource.ResourceListener resourceListener) {
            return new EngineResource<>(resource, z, true, key, resourceListener);
        }
    }

    public static final class ResourceCallbackAndExecutor {

        /* JADX INFO: renamed from: cb */
        final ResourceCallback f4050cb;
        final Executor executor;

        public ResourceCallbackAndExecutor(ResourceCallback resourceCallback, Executor executor) {
            this.f4050cb = resourceCallback;
            this.executor = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ResourceCallbackAndExecutor) {
                return this.f4050cb.equals(((ResourceCallbackAndExecutor) obj).f4050cb);
            }
            return false;
        }

        public int hashCode() {
            return this.f4050cb.hashCode();
        }
    }

    public static final class ResourceCallbacksAndExecutors implements Iterable<ResourceCallbackAndExecutor> {
        private final List<ResourceCallbackAndExecutor> callbacksAndExecutors;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ResourceCallbacksAndExecutors() {
            this(new ArrayList(2));
        }

        private static ResourceCallbackAndExecutor defaultCallbackAndExecutor(ResourceCallback resourceCallback) {
            return new ResourceCallbackAndExecutor(resourceCallback, Executors.directExecutor());
        }

        public void add(ResourceCallback resourceCallback, Executor executor) {
            this.callbacksAndExecutors.add(new ResourceCallbackAndExecutor(resourceCallback, executor));
        }

        public void clear() {
            this.callbacksAndExecutors.clear();
        }

        public boolean contains(ResourceCallback resourceCallback) {
            return this.callbacksAndExecutors.contains(defaultCallbackAndExecutor(resourceCallback));
        }

        public ResourceCallbacksAndExecutors copy() {
            return new ResourceCallbacksAndExecutors(new ArrayList(this.callbacksAndExecutors));
        }

        public boolean isEmpty() {
            return this.callbacksAndExecutors.isEmpty();
        }

        @Override // java.lang.Iterable
        @InterfaceC6391
        public Iterator<ResourceCallbackAndExecutor> iterator() {
            return this.callbacksAndExecutors.iterator();
        }

        public void remove(ResourceCallback resourceCallback) {
            this.callbacksAndExecutors.remove(defaultCallbackAndExecutor(resourceCallback));
        }

        public int size() {
            return this.callbacksAndExecutors.size();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public ResourceCallbacksAndExecutors(List<ResourceCallbackAndExecutor> list) {
            this.callbacksAndExecutors = list;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EngineJob(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, EngineJobListener engineJobListener, EngineResource.ResourceListener resourceListener, C6702.InterfaceC1067<EngineJob<?>> interfaceC1067) {
        this(glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, engineJobListener, resourceListener, interfaceC1067, DEFAULT_FACTORY);
    }

    private GlideExecutor getActiveSourceExecutor() {
        return this.useUnlimitedSourceGeneratorPool ? this.sourceUnlimitedExecutor : this.useAnimationPool ? this.animationExecutor : this.sourceExecutor;
    }

    private boolean isDone() {
        return this.hasLoadFailed || this.hasResource || this.isCancelled;
    }

    private synchronized void release() {
        if (this.key == null) {
            throw new IllegalArgumentException();
        }
        this.cbs.clear();
        this.key = null;
        this.engineResource = null;
        this.resource = null;
        this.hasLoadFailed = false;
        this.isCancelled = false;
        this.hasResource = false;
        this.isLoadedFromAlternateCacheKey = false;
        this.decodeJob.release(false);
        this.decodeJob = null;
        this.exception = null;
        this.dataSource = null;
        this.pool.release(this);
    }

    public synchronized void addCallback(ResourceCallback resourceCallback, Executor executor) {
        try {
            this.stateVerifier.throwIfRecycled();
            this.cbs.add(resourceCallback, executor);
            if (this.hasResource) {
                incrementPendingCallbacks(1);
                executor.execute(new CallResourceReady(resourceCallback));
            } else if (this.hasLoadFailed) {
                incrementPendingCallbacks(1);
                executor.execute(new CallLoadFailed(resourceCallback));
            } else {
                Preconditions.checkArgument(!this.isCancelled, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @InterfaceC5225("this")
    public void callCallbackOnLoadFailed(ResourceCallback resourceCallback) {
        try {
            resourceCallback.onLoadFailed(this.exception);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    @InterfaceC5225("this")
    public void callCallbackOnResourceReady(ResourceCallback resourceCallback) {
        try {
            resourceCallback.onResourceReady(this.engineResource, this.dataSource, this.isLoadedFromAlternateCacheKey);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    public void cancel() {
        if (isDone()) {
            return;
        }
        this.isCancelled = true;
        this.decodeJob.cancel();
        this.engineJobListener.onEngineJobCancelled(this, this.key);
    }

    public void decrementPendingCallbacks() {
        EngineResource<?> engineResource;
        synchronized (this) {
            try {
                this.stateVerifier.throwIfRecycled();
                Preconditions.checkArgument(isDone(), "Not yet complete!");
                int iDecrementAndGet = this.pendingCallbacks.decrementAndGet();
                Preconditions.checkArgument(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    engineResource = this.engineResource;
                    release();
                } else {
                    engineResource = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (engineResource != null) {
            engineResource.release();
        }
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    @InterfaceC6391
    public StateVerifier getVerifier() {
        return this.stateVerifier;
    }

    public synchronized void incrementPendingCallbacks(int i) {
        EngineResource<?> engineResource;
        Preconditions.checkArgument(isDone(), "Not yet complete!");
        if (this.pendingCallbacks.getAndAdd(i) == 0 && (engineResource = this.engineResource) != null) {
            engineResource.acquire();
        }
    }

    @InterfaceC8392
    public synchronized EngineJob<R> init(Key key, boolean z, boolean z2, boolean z3, boolean z4) {
        this.key = key;
        this.isCacheable = z;
        this.useUnlimitedSourceGeneratorPool = z2;
        this.useAnimationPool = z3;
        this.onlyRetrieveFromCache = z4;
        return this;
    }

    public synchronized boolean isCancelled() {
        return this.isCancelled;
    }

    public void notifyCallbacksOfException() {
        synchronized (this) {
            try {
                this.stateVerifier.throwIfRecycled();
                if (this.isCancelled) {
                    release();
                    return;
                }
                if (this.cbs.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.hasLoadFailed) {
                    throw new IllegalStateException("Already failed once");
                }
                this.hasLoadFailed = true;
                Key key = this.key;
                ResourceCallbacksAndExecutors resourceCallbacksAndExecutorsCopy = this.cbs.copy();
                incrementPendingCallbacks(resourceCallbacksAndExecutorsCopy.size() + 1);
                this.engineJobListener.onEngineJobComplete(this, key, null);
                for (ResourceCallbackAndExecutor resourceCallbackAndExecutor : resourceCallbacksAndExecutorsCopy) {
                    resourceCallbackAndExecutor.executor.execute(new CallLoadFailed(resourceCallbackAndExecutor.f4050cb));
                }
                decrementPendingCallbacks();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void notifyCallbacksOfResult() {
        synchronized (this) {
            try {
                this.stateVerifier.throwIfRecycled();
                if (this.isCancelled) {
                    this.resource.recycle();
                    release();
                    return;
                }
                if (this.cbs.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.hasResource) {
                    throw new IllegalStateException("Already have resource");
                }
                this.engineResource = this.engineResourceFactory.build(this.resource, this.isCacheable, this.key, this.resourceListener);
                this.hasResource = true;
                ResourceCallbacksAndExecutors resourceCallbacksAndExecutorsCopy = this.cbs.copy();
                incrementPendingCallbacks(resourceCallbacksAndExecutorsCopy.size() + 1);
                this.engineJobListener.onEngineJobComplete(this, this.key, this.engineResource);
                for (ResourceCallbackAndExecutor resourceCallbackAndExecutor : resourceCallbacksAndExecutorsCopy) {
                    resourceCallbackAndExecutor.executor.execute(new CallResourceReady(resourceCallbackAndExecutor.f4050cb));
                }
                decrementPendingCallbacks();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.Callback
    public void onLoadFailed(GlideException glideException) {
        synchronized (this) {
            this.exception = glideException;
        }
        notifyCallbacksOfException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bumptech.glide.load.engine.Resource<R> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.DecodeJob.Callback
    public void onResourceReady(Resource<R> resource, DataSource dataSource, boolean z) {
        synchronized (this) {
            this.resource = resource;
            this.dataSource = dataSource;
            this.isLoadedFromAlternateCacheKey = z;
        }
        notifyCallbacksOfResult();
    }

    public boolean onlyRetrieveFromCache() {
        return this.onlyRetrieveFromCache;
    }

    public synchronized void removeCallback(ResourceCallback resourceCallback) {
        try {
            this.stateVerifier.throwIfRecycled();
            this.cbs.remove(resourceCallback);
            if (this.cbs.isEmpty()) {
                cancel();
                if (this.hasResource || this.hasLoadFailed) {
                    if (this.pendingCallbacks.get() == 0) {
                        release();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.Callback
    public void reschedule(DecodeJob<?> decodeJob) {
        getActiveSourceExecutor().execute(decodeJob);
    }

    public synchronized void start(DecodeJob<R> decodeJob) {
        try {
            this.decodeJob = decodeJob;
            (decodeJob.willDecodeFromCache() ? this.diskCacheExecutor : getActiveSourceExecutor()).execute(decodeJob);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC8392
    public EngineJob(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, EngineJobListener engineJobListener, EngineResource.ResourceListener resourceListener, C6702.InterfaceC1067<EngineJob<?>> interfaceC1067, EngineResourceFactory engineResourceFactory) {
        this.cbs = new ResourceCallbacksAndExecutors();
        this.stateVerifier = StateVerifier.newInstance();
        this.pendingCallbacks = new AtomicInteger();
        this.diskCacheExecutor = glideExecutor;
        this.sourceExecutor = glideExecutor2;
        this.sourceUnlimitedExecutor = glideExecutor3;
        this.animationExecutor = glideExecutor4;
        this.engineJobListener = engineJobListener;
        this.resourceListener = resourceListener;
        this.pool = interfaceC1067;
        this.engineResourceFactory = engineResourceFactory;
    }
}
