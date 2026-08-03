package org.luckypray.dexkit.cache;

import Yue.C5499;
import Yue.C6659;
import Yue.InterfaceC5122;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC7507;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.DexKitCacheBridge;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nCacheBridgeRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheBridgeRegistry.kt\norg/luckypray/dexkit/cache/CacheBridgeRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J#\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "appTag", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "tryPromoteFromWeakPool", "(Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "LYue/ۥۣۢ۠ۤ;", "removeClearedWeakRefs", "Lkotlin/Function0;", "factory", "obtainBridge", "(Ljava/lang/String;LYue/ۥۣ۠۠ۨ;)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "bridge", "", "removeStrong", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)Z", "moveToWeak", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)V", "putWeak", "removeWeak", "(Ljava/lang/String;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "strongPool", "Ljava/util/concurrent/ConcurrentHashMap;", "Lorg/luckypray/dexkit/cache/CacheBridgeRegistry$KeyedWeakReference;", "weakPool", "Ljava/lang/ref/ReferenceQueue;", "refQueue", "Ljava/lang/ref/ReferenceQueue;", "KeyedWeakReference", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class CacheBridgeRegistry {

    @InterfaceC6399
    public static final CacheBridgeRegistry INSTANCE = new CacheBridgeRegistry();

    @InterfaceC6399
    private static final ConcurrentHashMap<String, DexKitCacheBridge.RecyclableBridge> strongPool = new ConcurrentHashMap<>();

    @InterfaceC6399
    private static final ConcurrentHashMap<String, KeyedWeakReference> weakPool = new ConcurrentHashMap<>();

    @InterfaceC6399
    private static final ReferenceQueue<DexKitCacheBridge.RecyclableBridge> refQueue = new ReferenceQueue<>();

    @InterfaceC6211(m2698d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m2699d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeRegistry$KeyedWeakReference;", "Ljava/lang/ref/WeakReference;", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", C6659.f17103, "", "referent", "q", "Ljava/lang/ref/ReferenceQueue;", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/ref/ReferenceQueue;)V", "getKey", "()Ljava/lang/String;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class KeyedWeakReference extends WeakReference<DexKitCacheBridge.RecyclableBridge> {

        @InterfaceC6399
        private final String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KeyedWeakReference(@InterfaceC6399 String str, @InterfaceC6399 DexKitCacheBridge.RecyclableBridge recyclableBridge, @InterfaceC6399 ReferenceQueue<DexKitCacheBridge.RecyclableBridge> referenceQueue) {
            super(recyclableBridge, referenceQueue);
            C5499.m17103(str, C6659.f17103);
            C5499.m17103(recyclableBridge, "referent");
            C5499.m17103(referenceQueue, "q");
            this.key = str;
        }

        @InterfaceC6399
        public final String getKey() {
            return this.key;
        }
    }

    private CacheBridgeRegistry() {
    }

    private final DexKitCacheBridge.RecyclableBridge tryPromoteFromWeakPool(String appTag) {
        removeClearedWeakRefs();
        ConcurrentHashMap<String, KeyedWeakReference> concurrentHashMap = weakPool;
        KeyedWeakReference keyedWeakReference = concurrentHashMap.get(appTag);
        if (keyedWeakReference == null) {
            return null;
        }
        DexKitCacheBridge.RecyclableBridge recyclableBridge = keyedWeakReference.get();
        if (recyclableBridge == null) {
            concurrentHashMap.remove(appTag, keyedWeakReference);
            return null;
        }
        if (recyclableBridge.isRetired()) {
            concurrentHashMap.remove(appTag, keyedWeakReference);
            return null;
        }
        ConcurrentHashMap<String, DexKitCacheBridge.RecyclableBridge> concurrentHashMap2 = strongPool;
        DexKitCacheBridge.RecyclableBridge recyclableBridgePutIfAbsent = concurrentHashMap2.putIfAbsent(appTag, recyclableBridge);
        if (recyclableBridgePutIfAbsent == null) {
            return recyclableBridge;
        }
        if (!recyclableBridgePutIfAbsent.isRetired()) {
            return recyclableBridgePutIfAbsent;
        }
        concurrentHashMap2.remove(appTag, recyclableBridgePutIfAbsent);
        return null;
    }

    public final void moveToWeak(@InterfaceC6399 String appTag, @InterfaceC6399 DexKitCacheBridge.RecyclableBridge bridge) {
        C5499.m17103(appTag, "appTag");
        C5499.m17103(bridge, "bridge");
        strongPool.remove(appTag, bridge);
        putWeak(appTag, bridge);
    }

    @InterfaceC6399
    public final DexKitCacheBridge.RecyclableBridge obtainBridge(@InterfaceC6399 String appTag, @InterfaceC6399 InterfaceC5122<DexKitCacheBridge.RecyclableBridge> factory) {
        C5499.m17103(appTag, "appTag");
        C5499.m17103(factory, "factory");
        while (true) {
            ConcurrentHashMap<String, DexKitCacheBridge.RecyclableBridge> concurrentHashMap = strongPool;
            DexKitCacheBridge.RecyclableBridge recyclableBridge = concurrentHashMap.get(appTag);
            if (recyclableBridge != null) {
                if (!recyclableBridge.isRetired()) {
                    return recyclableBridge;
                }
                concurrentHashMap.remove(appTag, recyclableBridge);
            }
            DexKitCacheBridge.RecyclableBridge recyclableBridgeTryPromoteFromWeakPool = tryPromoteFromWeakPool(appTag);
            if (recyclableBridgeTryPromoteFromWeakPool != null) {
                return recyclableBridgeTryPromoteFromWeakPool;
            }
            DexKitCacheBridge.RecyclableBridge recyclableBridgeInvoke = factory.invoke();
            DexKitCacheBridge.RecyclableBridge recyclableBridgePutIfAbsent = concurrentHashMap.putIfAbsent(appTag, recyclableBridgeInvoke);
            if (recyclableBridgePutIfAbsent == null) {
                return recyclableBridgeInvoke;
            }
            if (!recyclableBridgePutIfAbsent.isRetired()) {
                return recyclableBridgePutIfAbsent;
            }
            concurrentHashMap.remove(appTag, recyclableBridgePutIfAbsent);
        }
    }

    public final void putWeak(@InterfaceC6399 String appTag, @InterfaceC6399 DexKitCacheBridge.RecyclableBridge bridge) {
        C5499.m17103(appTag, "appTag");
        C5499.m17103(bridge, "bridge");
        removeClearedWeakRefs();
        weakPool.put(appTag, new KeyedWeakReference(appTag, bridge, refQueue));
    }

    public final void removeClearedWeakRefs() {
        while (true) {
            Reference<? extends DexKitCacheBridge.RecyclableBridge> referencePoll = refQueue.poll();
            if (referencePoll == null) {
                return;
            }
            KeyedWeakReference keyedWeakReference = referencePoll instanceof KeyedWeakReference ? (KeyedWeakReference) referencePoll : null;
            if (keyedWeakReference != null) {
                weakPool.remove(keyedWeakReference.getKey(), keyedWeakReference);
            }
        }
    }

    public final boolean removeStrong(@InterfaceC6399 String appTag, @InterfaceC6399 DexKitCacheBridge.RecyclableBridge bridge) {
        C5499.m17103(appTag, "appTag");
        C5499.m17103(bridge, "bridge");
        return strongPool.remove(appTag, bridge);
    }

    public final void removeWeak(@InterfaceC6399 String appTag) {
        C5499.m17103(appTag, "appTag");
        weakPool.remove(appTag);
    }
}
