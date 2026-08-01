package org.luckypray.dexkit.cache;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CacheBridgeRegistry {
    public static final org.luckypray.dexkit.cache.CacheBridgeRegistry INSTANCE = null;
    private static final java.lang.ref.ReferenceQueue<org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge> refQueue = null;
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge> strongPool = null;
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, org.luckypray.dexkit.cache.CacheBridgeRegistry.KeyedWeakReference> weakPool = null;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class KeyedWeakReference extends java.lang.ref.WeakReference<org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge> {
        private final java.lang.String key;

        public KeyedWeakReference(java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r2, java.lang.ref.ReferenceQueue<org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge> r3) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                r3.getClass()
                r0.<init>(r2, r3)
                r0.key = r1
                return
        }

        public final java.lang.String getKey() {
                r0 = this;
                java.lang.String r0 = r0.key
                return r0
        }
    }

    static {
            org.luckypray.dexkit.cache.CacheBridgeRegistry r0 = new org.luckypray.dexkit.cache.CacheBridgeRegistry
            r0.<init>()
            org.luckypray.dexkit.cache.CacheBridgeRegistry.INSTANCE = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            org.luckypray.dexkit.cache.CacheBridgeRegistry.strongPool = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            org.luckypray.dexkit.cache.CacheBridgeRegistry.weakPool = r0
            java.lang.ref.ReferenceQueue r0 = new java.lang.ref.ReferenceQueue
            r0.<init>()
            org.luckypray.dexkit.cache.CacheBridgeRegistry.refQueue = r0
            return
    }

    private CacheBridgeRegistry() {
            r0 = this;
            r0.<init>()
            return
    }

    private final org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge tryPromoteFromWeakPool(java.lang.String r5) {
            r4 = this;
            r4.removeClearedWeakRefs()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, org.luckypray.dexkit.cache.CacheBridgeRegistry$KeyedWeakReference> r4 = org.luckypray.dexkit.cache.CacheBridgeRegistry.weakPool
            java.lang.Object r0 = r4.get(r5)
            org.luckypray.dexkit.cache.CacheBridgeRegistry$KeyedWeakReference r0 = (org.luckypray.dexkit.cache.CacheBridgeRegistry.KeyedWeakReference) r0
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            java.lang.Object r2 = r0.get()
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r2 = (org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge) r2
            if (r2 != 0) goto L1b
            r4.remove(r5, r0)
            return r1
        L1b:
            boolean r3 = r2.isRetired()
            if (r3 == 0) goto L25
            r4.remove(r5, r0)
            return r1
        L25:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge> r4 = org.luckypray.dexkit.cache.CacheBridgeRegistry.strongPool
            java.lang.Object r0 = r4.putIfAbsent(r5, r2)
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = (org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge) r0
            if (r0 != 0) goto L30
            return r2
        L30:
            boolean r2 = r0.isRetired()
            if (r2 != 0) goto L37
            return r0
        L37:
            r4.remove(r5, r0)
            return r1
    }

    public final void moveToWeak(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge> r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.strongPool
            r0.remove(r2, r3)
            r1.putWeak(r2, r3)
            return
    }

    public final org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge obtainBridge(java.lang.String r4, p000.p70 r5) {
            r3 = this;
            r4.getClass()
            r5.getClass()
        L6:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge> r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.strongPool
            java.lang.Object r1 = r0.get(r4)
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r1 = (org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge) r1
            if (r1 == 0) goto L1a
            boolean r2 = r1.isRetired()
            if (r2 != 0) goto L17
            return r1
        L17:
            r0.remove(r4, r1)
        L1a:
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r1 = r3.tryPromoteFromWeakPool(r4)
            if (r1 == 0) goto L21
            return r1
        L21:
            java.lang.Object r1 = r5.invoke()
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r1 = (org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge) r1
            java.lang.Object r2 = r0.putIfAbsent(r4, r1)
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r2 = (org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge) r2
            if (r2 != 0) goto L30
            return r1
        L30:
            boolean r1 = r2.isRetired()
            if (r1 != 0) goto L37
            return r2
        L37:
            r0.remove(r4, r2)
            goto L6
    }

    public final void putWeak(java.lang.String r3, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            r2.removeClearedWeakRefs()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, org.luckypray.dexkit.cache.CacheBridgeRegistry$KeyedWeakReference> r2 = org.luckypray.dexkit.cache.CacheBridgeRegistry.weakPool
            org.luckypray.dexkit.cache.CacheBridgeRegistry$KeyedWeakReference r0 = new org.luckypray.dexkit.cache.CacheBridgeRegistry$KeyedWeakReference
            java.lang.ref.ReferenceQueue<org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge> r1 = org.luckypray.dexkit.cache.CacheBridgeRegistry.refQueue
            r0.<init>(r3, r4, r1)
            r2.put(r3, r0)
            return
    }

    public final void removeClearedWeakRefs() {
            r2 = this;
        L0:
            java.lang.ref.ReferenceQueue<org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge> r2 = org.luckypray.dexkit.cache.CacheBridgeRegistry.refQueue
            java.lang.ref.Reference r2 = r2.poll()
            if (r2 != 0) goto L9
            return
        L9:
            boolean r0 = r2 instanceof org.luckypray.dexkit.cache.CacheBridgeRegistry.KeyedWeakReference
            if (r0 == 0) goto L10
            org.luckypray.dexkit.cache.CacheBridgeRegistry$KeyedWeakReference r2 = (org.luckypray.dexkit.cache.CacheBridgeRegistry.KeyedWeakReference) r2
            goto L11
        L10:
            r2 = 0
        L11:
            if (r2 != 0) goto L14
            goto L0
        L14:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, org.luckypray.dexkit.cache.CacheBridgeRegistry$KeyedWeakReference> r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.weakPool
            java.lang.String r1 = r2.getKey()
            r0.remove(r1, r2)
            goto L0
    }

    public final boolean removeStrong(java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge> r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.strongPool
            boolean r0 = r0.remove(r1, r2)
            return r0
    }

    public final void removeWeak(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, org.luckypray.dexkit.cache.CacheBridgeRegistry$KeyedWeakReference> r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.weakPool
            r0.remove(r1)
            return
    }
}
