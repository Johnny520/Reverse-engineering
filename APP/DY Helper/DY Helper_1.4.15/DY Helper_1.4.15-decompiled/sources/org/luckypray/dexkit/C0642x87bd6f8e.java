package org.luckypray.dexkit;

/* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0642x87bd6f8e extends p000.bp0 implements p000.p70 {
    final /* synthetic */ p000.a80 $executor;
    final /* synthetic */ p000.a80 $mapper;
    final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge this$0;

    public C0642x87bd6f8e(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1, p000.a80 r2, p000.a80 r3) {
            r0 = this;
            r0.this$0 = r1
            r0.$executor = r2
            r0.$mapper = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // p000.p70
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            r0 = this;
            java.util.List r0 = r0.invoke()
            return r0
    }

    @Override // p000.p70
    public final java.util.List<R> invoke() {
            r5 = this;
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = r5.this$0
            a80 r1 = r5.$executor
            a80 r5 = r5.$mapper
            org.luckypray.dexkit.cache.CacheBridgeRuntime r0 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.access$getRuntime(r0)
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$beginUse(r0)
            java.lang.Object r2 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getLifecycleLock$p(r0)     // Catch: java.lang.Throwable -> L38
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L38
            org.luckypray.dexkit.DexKitBridge r3 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getBridge$p(r0)     // Catch: java.lang.Throwable -> L2a
            if (r3 != 0) goto L2c
            p70 r3 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getCreateBridge$p(r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r3 = r3.invoke()     // Catch: java.lang.Throwable -> L2a
            r4 = r3
            org.luckypray.dexkit.DexKitBridge r4 = (org.luckypray.dexkit.DexKitBridge) r4     // Catch: java.lang.Throwable -> L2a
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$setBridge$p(r0, r4)     // Catch: java.lang.Throwable -> L2a
            org.luckypray.dexkit.DexKitBridge r3 = (org.luckypray.dexkit.DexKitBridge) r3     // Catch: java.lang.Throwable -> L2a
            r4 = 1
            goto L2d
        L2a:
            r5 = move-exception
            goto L65
        L2c:
            r4 = 0
        L2d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L3a
            p70 r2 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getNotifyBridgeCreated$p(r0)     // Catch: java.lang.Throwable -> L38
            r2.invoke()     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r5 = move-exception
            goto L67
        L3a:
            java.lang.Object r1 = r1.invoke(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L38
            r3 = 10
            int r3 = p000.AbstractC1021yh.m6889(r1, r3)     // Catch: java.lang.Throwable -> L38
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L38
        L4f:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L61
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r3 = r5.invoke(r3)     // Catch: java.lang.Throwable -> L38
            r2.add(r3)     // Catch: java.lang.Throwable -> L38
            goto L4f
        L61:
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r0)
            return r2
        L65:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L38
            throw r5     // Catch: java.lang.Throwable -> L38
        L67:
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r0)
            throw r5
    }
}
