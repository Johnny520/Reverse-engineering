package org.luckypray.dexkit.cache;

import Yue.C5437;
import Yue.C5499;
import Yue.C8107;
import Yue.InterfaceC5122;
import Yue.InterfaceC5124;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7507;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.DexKitCacheBridge;
import org.luckypray.dexkit.cache.CacheBridgeRuntime;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nCacheBridgeRuntime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheBridgeRuntime.kt\norg/luckypray/dexkit/cache/CacheBridgeRuntime\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0014J\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\r\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0014J-\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\r¢\u0006\u0004\b\"\u0010\u0014J\r\u0010#\u001a\u00020\r¢\u0006\u0004\b#\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010'R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00105\u001a\b\u0012\u0002\b\u0003\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00069"}, d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;", "", "", "appTag", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "bridgeHolder", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "scheduler", "Lkotlin/Function0;", "", "idleTimeoutMillis", "Lorg/luckypray/dexkit/DexKitBridge;", "createBridge", "LYue/ۥۣۢ۠ۤ;", "notifyBridgeCreated", "notifyBridgeReleased", "notifyBridgeDestroyed", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/util/concurrent/ScheduledThreadPoolExecutor;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;)V", "beginUse", "()V", "endUse", "", "releaseBridgeLocked", "()Z", "scheduleRetireLocked", "moveToWeakPoolLocked", "isDestroyed", "ensureUsable", "R", "Lkotlin/Function1;", "block", "acquireBridge", "(LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;", "close", "destroy", "Ljava/lang/String;", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "LYue/ۥۣ۠۠ۨ;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "destroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lifecycleLock", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, "", "activeCalls", "I", "generation", "J", "releaseRequested", "Z", "Ljava/util/concurrent/ScheduledFuture;", "reaperFuture", "Ljava/util/concurrent/ScheduledFuture;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class CacheBridgeRuntime {
    private int activeCalls;

    @InterfaceC6399
    private final String appTag;

    @InterfaceC6489
    private volatile DexKitBridge bridge;

    @InterfaceC6399
    private final DexKitCacheBridge.RecyclableBridge bridgeHolder;

    @InterfaceC6399
    private final InterfaceC5122<DexKitBridge> createBridge;

    @InterfaceC6399
    private final AtomicBoolean destroyed;
    private long generation;

    @InterfaceC6399
    private final InterfaceC5122<Long> idleTimeoutMillis;

    @InterfaceC6399
    private final Object lifecycleLock;

    @InterfaceC6399
    private final InterfaceC5122<C8107> notifyBridgeCreated;

    @InterfaceC6399
    private final InterfaceC5122<C8107> notifyBridgeDestroyed;

    @InterfaceC6399
    private final InterfaceC5122<C8107> notifyBridgeReleased;

    @InterfaceC6489
    private ScheduledFuture<?> reaperFuture;
    private boolean releaseRequested;

    @InterfaceC6399
    private final ScheduledThreadPoolExecutor scheduler;

    public CacheBridgeRuntime(@InterfaceC6399 String str, @InterfaceC6399 DexKitCacheBridge.RecyclableBridge recyclableBridge, @InterfaceC6399 ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, @InterfaceC6399 InterfaceC5122<Long> interfaceC5122, @InterfaceC6399 InterfaceC5122<DexKitBridge> interfaceC51222, @InterfaceC6399 InterfaceC5122<C8107> interfaceC51223, @InterfaceC6399 InterfaceC5122<C8107> interfaceC51224, @InterfaceC6399 InterfaceC5122<C8107> interfaceC51225) {
        C5499.m17103(str, "appTag");
        C5499.m17103(recyclableBridge, "bridgeHolder");
        C5499.m17103(scheduledThreadPoolExecutor, "scheduler");
        C5499.m17103(interfaceC5122, "idleTimeoutMillis");
        C5499.m17103(interfaceC51222, "createBridge");
        C5499.m17103(interfaceC51223, "notifyBridgeCreated");
        C5499.m17103(interfaceC51224, "notifyBridgeReleased");
        C5499.m17103(interfaceC51225, "notifyBridgeDestroyed");
        this.appTag = str;
        this.bridgeHolder = recyclableBridge;
        this.scheduler = scheduledThreadPoolExecutor;
        this.idleTimeoutMillis = interfaceC5122;
        this.createBridge = interfaceC51222;
        this.notifyBridgeCreated = interfaceC51223;
        this.notifyBridgeReleased = interfaceC51224;
        this.notifyBridgeDestroyed = interfaceC51225;
        this.destroyed = new AtomicBoolean(false);
        this.lifecycleLock = new Object();
    }

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

    /* JADX INFO: Access modifiers changed from: private */
    public final void endUse() {
        boolean zReleaseBridgeLocked;
        synchronized (this.lifecycleLock) {
            try {
                int i = this.activeCalls;
                if (i <= 0) {
                    throw new IllegalStateException("activeCalls underflow".toString());
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
                C8107 c8107 = C8107.f3222;
                if (zReleaseBridgeLocked) {
                    this.notifyBridgeReleased.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void moveToWeakPoolLocked() {
        if (isDestroyed()) {
            CacheBridgeRegistry.INSTANCE.removeStrong(this.appTag, this.bridgeHolder);
        } else {
            CacheBridgeRegistry.INSTANCE.moveToWeak(this.appTag, this.bridgeHolder);
        }
    }

    private final boolean releaseBridgeLocked() {
        DexKitBridge dexKitBridge = this.bridge;
        if (dexKitBridge == null) {
            return false;
        }
        dexKitBridge.close();
        this.bridge = null;
        return true;
    }

    private final void scheduleRetireLocked() {
        final long j = this.generation;
        this.reaperFuture = this.scheduler.schedule(new Runnable() { // from class: Yue.ۥۣ۟ۦ
            @Override // java.lang.Runnable
            public final void run() {
                CacheBridgeRuntime.scheduleRetireLocked$lambda$7(this.f6413, j);
            }
        }, this.idleTimeoutMillis.invoke().longValue(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleRetireLocked$lambda$7(CacheBridgeRuntime cacheBridgeRuntime, long j) {
        C5499.m17103(cacheBridgeRuntime, "this$0");
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

    public final <R> R acquireBridge(@InterfaceC6399 InterfaceC5124<? super DexKitBridge, ? extends R> block) {
        DexKitBridge dexKitBridge;
        boolean z;
        C5499.m17103(block, "block");
        beginUse();
        try {
            synchronized (this.lifecycleLock) {
                try {
                    dexKitBridge = this.bridge;
                    if (dexKitBridge == null) {
                        Object objInvoke = this.createBridge.invoke();
                        this.bridge = (DexKitBridge) objInvoke;
                        dexKitBridge = (DexKitBridge) objInvoke;
                        z = true;
                    } else {
                        z = false;
                    }
                    C5437.m16930(1);
                } catch (Throwable th) {
                    C5437.m16930(1);
                    C5437.m16929(1);
                    throw th;
                }
            }
            C5437.m16929(1);
            if (z) {
                this.notifyBridgeCreated.invoke();
            }
            R rInvoke = block.invoke(dexKitBridge);
            C5437.m16930(1);
            endUse();
            C5437.m16929(1);
            return rInvoke;
        } catch (Throwable th2) {
            C5437.m16930(1);
            endUse();
            C5437.m16929(1);
            throw th2;
        }
    }

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
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zReleaseBridgeLocked) {
            this.notifyBridgeReleased.invoke();
        }
    }

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
                    C8107 c8107 = C8107.f3222;
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

    public final void ensureUsable() {
        if (!(!isDestroyed())) {
            throw new IllegalStateException("RecyclableBridge is destroyed".toString());
        }
    }

    public final boolean isDestroyed() {
        return this.destroyed.get();
    }
}
