package org.luckypray.dexkit.cache;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nCacheBridgeRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheBridgeRegistry.kt\norg/luckypray/dexkit/cache/CacheBridgeRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J#\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;", "", "<init>", "()V", "", "appTag", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "tryPromoteFromWeakPool", "(Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "LYue/ۥۣۢ۠ۤ;", "removeClearedWeakRefs", "Lkotlin/Function0;", "factory", "obtainBridge", "(Ljava/lang/String;LYue/ۥۣ۠۠ۨ;)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "bridge", "", "removeStrong", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)Z", "moveToWeak", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)V", "putWeak", "removeWeak", "(Ljava/lang/String;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "strongPool", "Ljava/util/concurrent/ConcurrentHashMap;", "Lorg/luckypray/dexkit/cache/CacheBridgeRegistry$KeyedWeakReference;", "weakPool", "Ljava/lang/ref/ReferenceQueue;", "refQueue", "Ljava/lang/ref/ReferenceQueue;", "KeyedWeakReference", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class CacheBridgeRegistry {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.cache.CacheBridgeRegistry INSTANCE = null;

    @Yue.InterfaceC4418
    private static final java.lang.ref.ReferenceQueue<org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge> refQueue = null;

    @Yue.InterfaceC4418
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge> strongPool = null;

    @Yue.InterfaceC4418
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, org.luckypray.dexkit.cache.CacheBridgeRegistry.KeyedWeakReference> weakPool = null;

    @Yue.InterfaceC4201(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeRegistry$KeyedWeakReference;", "Ljava/lang/ref/WeakReference;", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "key", "", "referent", "q", "Ljava/lang/ref/ReferenceQueue;", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/ref/ReferenceQueue;)V", "getKey", "()Ljava/lang/String;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class KeyedWeakReference extends java.lang.ref.WeakReference<org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge> {

        @Yue.InterfaceC4418
        private final java.lang.String key;

        public KeyedWeakReference(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r3, @Yue.InterfaceC4418 java.lang.ref.ReferenceQueue<org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge> r4) {
                r1 = this;
                java.lang.String r0 = "key"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "referent"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "q"
                Yue.C3329.m13906(r4, r0)
                r1.<init>(r3, r4)
                r1.key = r2
                return
        }

        @Yue.InterfaceC4418
        public final java.lang.String getKey() {
                r1 = this;
                java.lang.String r0 = r1.key
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

    private final org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge tryPromoteFromWeakPool(java.lang.String r6) {
            r5 = this;
            r5.removeClearedWeakRefs()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, org.luckypray.dexkit.cache.CacheBridgeRegistry$KeyedWeakReference> r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.weakPool
            java.lang.Object r1 = r0.get(r6)
            org.luckypray.dexkit.cache.CacheBridgeRegistry$KeyedWeakReference r1 = (org.luckypray.dexkit.cache.CacheBridgeRegistry.KeyedWeakReference) r1
            r2 = 0
            if (r1 != 0) goto Lf
            return r2
        Lf:
            java.lang.Object r3 = r1.get()
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r3 = (org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge) r3
            if (r3 != 0) goto L1b
            r0.remove(r6, r1)
            return r2
        L1b:
            boolean r4 = r3.isRetired()
            if (r4 == 0) goto L25
            r0.remove(r6, r1)
            return r2
        L25:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge> r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.strongPool
            java.lang.Object r1 = r0.putIfAbsent(r6, r3)
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r1 = (org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge) r1
            if (r1 != 0) goto L30
            return r3
        L30:
            boolean r3 = r1.isRetired()
            if (r3 != 0) goto L37
            return r1
        L37:
            r0.remove(r6, r1)
            return r2
    }

    public final void moveToWeak(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r3) {
            r1 = this;
            java.lang.String r0 = "appTag"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "bridge"
            Yue.C3329.m13906(r3, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge> r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.strongPool
            r0.remove(r2, r3)
            r1.putWeak(r2, r3)
            return
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge obtainBridge(@Yue.InterfaceC4418 java.lang.String r4, @Yue.InterfaceC4418 Yue.InterfaceC2823<org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge> r5) {
            r3 = this;
            java.lang.String r0 = "appTag"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "factory"
            Yue.C3329.m13906(r5, r0)
        La:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge> r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.strongPool
            java.lang.Object r1 = r0.get(r4)
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r1 = (org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge) r1
            if (r1 == 0) goto L1e
            boolean r2 = r1.isRetired()
            if (r2 != 0) goto L1b
            return r1
        L1b:
            r0.remove(r4, r1)
        L1e:
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r1 = r3.tryPromoteFromWeakPool(r4)
            if (r1 == 0) goto L25
            return r1
        L25:
            java.lang.Object r1 = r5.invoke()
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r1 = (org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge) r1
            java.lang.Object r2 = r0.putIfAbsent(r4, r1)
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r2 = (org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge) r2
            if (r2 != 0) goto L34
            return r1
        L34:
            boolean r1 = r2.isRetired()
            if (r1 != 0) goto L3b
            return r2
        L3b:
            r0.remove(r4, r2)
            goto La
    }

    public final void putWeak(@Yue.InterfaceC4418 java.lang.String r4, @Yue.InterfaceC4418 org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r5) {
            r3 = this;
            java.lang.String r0 = "appTag"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "bridge"
            Yue.C3329.m13906(r5, r0)
            r3.removeClearedWeakRefs()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, org.luckypray.dexkit.cache.CacheBridgeRegistry$KeyedWeakReference> r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.weakPool
            org.luckypray.dexkit.cache.CacheBridgeRegistry$KeyedWeakReference r1 = new org.luckypray.dexkit.cache.CacheBridgeRegistry$KeyedWeakReference
            java.lang.ref.ReferenceQueue<org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge> r2 = org.luckypray.dexkit.cache.CacheBridgeRegistry.refQueue
            r1.<init>(r4, r5, r2)
            r0.put(r4, r1)
            return
    }

    public final void removeClearedWeakRefs() {
            r3 = this;
        L0:
            java.lang.ref.ReferenceQueue<org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge> r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.refQueue
            java.lang.ref.Reference r0 = r0.poll()
            if (r0 != 0) goto L9
            return
        L9:
            boolean r1 = r0 instanceof org.luckypray.dexkit.cache.CacheBridgeRegistry.KeyedWeakReference
            if (r1 == 0) goto L10
            org.luckypray.dexkit.cache.CacheBridgeRegistry$KeyedWeakReference r0 = (org.luckypray.dexkit.cache.CacheBridgeRegistry.KeyedWeakReference) r0
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 != 0) goto L14
            goto L0
        L14:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, org.luckypray.dexkit.cache.CacheBridgeRegistry$KeyedWeakReference> r1 = org.luckypray.dexkit.cache.CacheBridgeRegistry.weakPool
            java.lang.String r2 = r0.getKey()
            r1.remove(r2, r0)
            goto L0
    }

    public final boolean removeStrong(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r3) {
            r1 = this;
            java.lang.String r0 = "appTag"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "bridge"
            Yue.C3329.m13906(r3, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge> r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.strongPool
            boolean r2 = r0.remove(r2, r3)
            return r2
    }

    public final void removeWeak(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "appTag"
            Yue.C3329.m13906(r2, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, org.luckypray.dexkit.cache.CacheBridgeRegistry$KeyedWeakReference> r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.weakPool
            r0.remove(r2)
            return
    }
}
