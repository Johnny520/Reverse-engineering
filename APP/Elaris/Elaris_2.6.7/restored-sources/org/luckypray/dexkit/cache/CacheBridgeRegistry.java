package org.luckypray.dexkit.cache;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import org.luckypray.dexkit.DexKitCacheBridge;
import p000.InterfaceC0279j5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class CacheBridgeRegistry {
    public static final CacheBridgeRegistry INSTANCE = new CacheBridgeRegistry();
    private static final ConcurrentHashMap<String, DexKitCacheBridge.RecyclableBridge> strongPool = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, KeyedWeakReference> weakPool = new ConcurrentHashMap<>();
    private static final ReferenceQueue<DexKitCacheBridge.RecyclableBridge> refQueue = new ReferenceQueue<>();

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class KeyedWeakReference extends WeakReference<DexKitCacheBridge.RecyclableBridge> {
        private final String key;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KeyedWeakReference(String str, DexKitCacheBridge.RecyclableBridge recyclableBridge, ReferenceQueue<DexKitCacheBridge.RecyclableBridge> referenceQueue) {
            super(recyclableBridge, referenceQueue);
            str.getClass();
            recyclableBridge.getClass();
            referenceQueue.getClass();
            this.key = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getKey() {
            return this.key;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private CacheBridgeRegistry() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final DexKitCacheBridge.RecyclableBridge tryPromoteFromWeakPool(String str) {
        removeClearedWeakRefs();
        ConcurrentHashMap<String, KeyedWeakReference> concurrentHashMap = weakPool;
        KeyedWeakReference keyedWeakReference = concurrentHashMap.get(str);
        if (keyedWeakReference == null) {
            return null;
        }
        DexKitCacheBridge.RecyclableBridge recyclableBridge = keyedWeakReference.get();
        if (recyclableBridge == null) {
            concurrentHashMap.remove(str, keyedWeakReference);
            return null;
        }
        if (recyclableBridge.isRetired()) {
            concurrentHashMap.remove(str, keyedWeakReference);
            return null;
        }
        ConcurrentHashMap<String, DexKitCacheBridge.RecyclableBridge> concurrentHashMap2 = strongPool;
        DexKitCacheBridge.RecyclableBridge recyclableBridgePutIfAbsent = concurrentHashMap2.putIfAbsent(str, recyclableBridge);
        if (recyclableBridgePutIfAbsent == null) {
            return recyclableBridge;
        }
        if (!recyclableBridgePutIfAbsent.isRetired()) {
            return recyclableBridgePutIfAbsent;
        }
        concurrentHashMap2.remove(str, recyclableBridgePutIfAbsent);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void moveToWeak(String str, DexKitCacheBridge.RecyclableBridge recyclableBridge) {
        str.getClass();
        recyclableBridge.getClass();
        strongPool.remove(str, recyclableBridge);
        putWeak(str, recyclableBridge);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final DexKitCacheBridge.RecyclableBridge obtainBridge(String str, InterfaceC0279j5 interfaceC0279j5) {
        str.getClass();
        interfaceC0279j5.getClass();
        while (true) {
            ConcurrentHashMap<String, DexKitCacheBridge.RecyclableBridge> concurrentHashMap = strongPool;
            DexKitCacheBridge.RecyclableBridge recyclableBridge = concurrentHashMap.get(str);
            if (recyclableBridge != null) {
                if (!recyclableBridge.isRetired()) {
                    return recyclableBridge;
                }
                concurrentHashMap.remove(str, recyclableBridge);
            }
            DexKitCacheBridge.RecyclableBridge recyclableBridgeTryPromoteFromWeakPool = tryPromoteFromWeakPool(str);
            if (recyclableBridgeTryPromoteFromWeakPool != null) {
                return recyclableBridgeTryPromoteFromWeakPool;
            }
            DexKitCacheBridge.RecyclableBridge recyclableBridge2 = (DexKitCacheBridge.RecyclableBridge) interfaceC0279j5.invoke();
            DexKitCacheBridge.RecyclableBridge recyclableBridgePutIfAbsent = concurrentHashMap.putIfAbsent(str, recyclableBridge2);
            if (recyclableBridgePutIfAbsent == null) {
                return recyclableBridge2;
            }
            if (!recyclableBridgePutIfAbsent.isRetired()) {
                return recyclableBridgePutIfAbsent;
            }
            concurrentHashMap.remove(str, recyclableBridgePutIfAbsent);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void putWeak(String str, DexKitCacheBridge.RecyclableBridge recyclableBridge) {
        str.getClass();
        recyclableBridge.getClass();
        removeClearedWeakRefs();
        weakPool.put(str, new KeyedWeakReference(str, recyclableBridge, refQueue));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean removeStrong(String str, DexKitCacheBridge.RecyclableBridge recyclableBridge) {
        str.getClass();
        recyclableBridge.getClass();
        return strongPool.remove(str, recyclableBridge);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeWeak(String str) {
        str.getClass();
        weakPool.remove(str);
    }
}
