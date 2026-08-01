package org.luckypray.dexkit.cache;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.DexKitCacheBridge;
import org.luckypray.dexkit.cache.CacheBridgeRuntime;
import p000.C0921xc;
import p000.InterfaceC0298hw;
import p000.InterfaceC0742sw;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class CacheBridgeRuntime {
    private int activeCalls;
    private final String appTag;
    private volatile DexKitBridge bridge;
    private final DexKitCacheBridge.RecyclableBridge bridgeHolder;
    private final InterfaceC0298hw createBridge;
    private final AtomicBoolean destroyed;
    private long generation;
    private final InterfaceC0298hw idleTimeoutMillis;
    private final Object lifecycleLock;
    private final InterfaceC0298hw notifyBridgeCreated;
    private final InterfaceC0298hw notifyBridgeDestroyed;
    private final InterfaceC0298hw notifyBridgeReleased;
    private ScheduledFuture<?> reaperFuture;
    private boolean releaseRequested;
    private final ScheduledThreadPoolExecutor scheduler;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CacheBridgeRuntime(String str, DexKitCacheBridge.RecyclableBridge recyclableBridge, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, InterfaceC0298hw interfaceC0298hw, InterfaceC0298hw interfaceC0298hw2, InterfaceC0298hw interfaceC0298hw3, InterfaceC0298hw interfaceC0298hw4, InterfaceC0298hw interfaceC0298hw5) {
        str.getClass();
        recyclableBridge.getClass();
        scheduledThreadPoolExecutor.getClass();
        interfaceC0298hw.getClass();
        interfaceC0298hw2.getClass();
        interfaceC0298hw3.getClass();
        interfaceC0298hw4.getClass();
        interfaceC0298hw5.getClass();
        this.appTag = str;
        this.bridgeHolder = recyclableBridge;
        this.scheduler = scheduledThreadPoolExecutor;
        this.idleTimeoutMillis = interfaceC0298hw;
        this.createBridge = interfaceC0298hw2;
        this.notifyBridgeCreated = interfaceC0298hw3;
        this.notifyBridgeReleased = interfaceC0298hw4;
        this.notifyBridgeDestroyed = interfaceC0298hw5;
        this.destroyed = new AtomicBoolean(false);
        this.lifecycleLock = new Object();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final void beginUse() {
        synchronized (this.lifecycleLock) {
            try {
                ensureUsable();
                this.generation++;
                ScheduledFuture<?> scheduledFuture = this.reaperFuture;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.reaperFuture = null;
                this.activeCalls++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final void endUse() {
        boolean zReleaseBridgeLocked;
        synchronized (this.lifecycleLock) {
            try {
                int i = this.activeCalls;
                if (i <= 0) {
                    throw new IllegalStateException("activeCalls underflow");
                }
                int i2 = i - 1;
                this.activeCalls = i2;
                if (i2 != 0) {
                    return;
                }
                if (isDestroyed()) {
                    zReleaseBridgeLocked = releaseBridgeLocked();
                } else if (this.releaseRequested) {
                    this.releaseRequested = false;
                    zReleaseBridgeLocked = releaseBridgeLocked();
                    moveToWeakPoolLocked();
                } else {
                    scheduleRetireLocked();
                    zReleaseBridgeLocked = false;
                }
                if (zReleaseBridgeLocked) {
                    this.notifyBridgeReleased.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void moveToWeakPoolLocked() {
        if (isDestroyed()) {
            CacheBridgeRegistry.INSTANCE.removeStrong(this.appTag, this.bridgeHolder);
        } else {
            CacheBridgeRegistry.INSTANCE.moveToWeak(this.appTag, this.bridgeHolder);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean releaseBridgeLocked() {
        DexKitBridge dexKitBridge = this.bridge;
        if (dexKitBridge == null) {
            return false;
        }
        dexKitBridge.close();
        this.bridge = null;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void scheduleRetireLocked() {
        final long j = this.generation;
        this.reaperFuture = this.scheduler.schedule(new Runnable() { // from class: lc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                CacheBridgeRuntime.scheduleRetireLocked$lambda$7(this.f3410d, j);
            }
        }, ((Number) this.idleTimeoutMillis.invoke()).longValue(), TimeUnit.MILLISECONDS);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleRetireLocked$lambda$7(CacheBridgeRuntime cacheBridgeRuntime, long j) {
        cacheBridgeRuntime.getClass();
        synchronized (cacheBridgeRuntime.lifecycleLock) {
            if (cacheBridgeRuntime.isDestroyed()) {
                return;
            }
            if (cacheBridgeRuntime.activeCalls != 0) {
                return;
            }
            if (cacheBridgeRuntime.generation != j) {
                return;
            }
            cacheBridgeRuntime.reaperFuture = null;
            if (cacheBridgeRuntime.releaseRequested) {
                return;
            }
            CacheBridgeRegistry cacheBridgeRegistry = CacheBridgeRegistry.INSTANCE;
            if (cacheBridgeRegistry.removeStrong(cacheBridgeRuntime.appTag, cacheBridgeRuntime.bridgeHolder) && !cacheBridgeRuntime.isDestroyed()) {
                boolean zReleaseBridgeLocked = cacheBridgeRuntime.releaseBridgeLocked();
                cacheBridgeRegistry.putWeak(cacheBridgeRuntime.appTag, cacheBridgeRuntime.bridgeHolder);
                if (zReleaseBridgeLocked) {
                    cacheBridgeRuntime.notifyBridgeReleased.invoke();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final <R> R acquireBridge(InterfaceC0742sw interfaceC0742sw) {
        DexKitBridge dexKitBridge;
        boolean z;
        interfaceC0742sw.getClass();
        beginUse();
        try {
            synchronized (this.lifecycleLock) {
                dexKitBridge = this.bridge;
                if (dexKitBridge == null) {
                    Object objInvoke = this.createBridge.invoke();
                    this.bridge = (DexKitBridge) objInvoke;
                    dexKitBridge = (DexKitBridge) objInvoke;
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                this.notifyBridgeCreated.invoke();
            }
            R r = (R) interfaceC0742sw.invoke(dexKitBridge);
            endUse();
            return r;
        } catch (Throwable th) {
            endUse();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void close() {
        boolean zReleaseBridgeLocked;
        synchronized (this.lifecycleLock) {
            try {
                ensureUsable();
                this.generation++;
                ScheduledFuture<?> scheduledFuture = this.reaperFuture;
                zReleaseBridgeLocked = false;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.reaperFuture = null;
                if (this.activeCalls == 0) {
                    this.releaseRequested = false;
                    zReleaseBridgeLocked = releaseBridgeLocked();
                    moveToWeakPoolLocked();
                } else {
                    this.releaseRequested = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zReleaseBridgeLocked) {
            this.notifyBridgeReleased.invoke();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void destroy() {
        boolean zReleaseBridgeLocked;
        if (this.destroyed.compareAndSet(false, true)) {
            synchronized (this.lifecycleLock) {
                try {
                    this.generation++;
                    this.releaseRequested = false;
                    ScheduledFuture<?> scheduledFuture = this.reaperFuture;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.reaperFuture = null;
                    zReleaseBridgeLocked = this.activeCalls == 0 ? releaseBridgeLocked() : false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            CacheBridgeRegistry cacheBridgeRegistry = CacheBridgeRegistry.INSTANCE;
            cacheBridgeRegistry.removeStrong(this.appTag, this.bridgeHolder);
            cacheBridgeRegistry.removeWeak(this.appTag);
            if (zReleaseBridgeLocked) {
                this.notifyBridgeReleased.invoke();
            }
            this.notifyBridgeDestroyed.invoke();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void ensureUsable() {
        if (isDestroyed()) {
            C0921xc.m5134o("RecyclableBridge is destroyed");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isDestroyed() {
        return this.destroyed.get();
    }
}
