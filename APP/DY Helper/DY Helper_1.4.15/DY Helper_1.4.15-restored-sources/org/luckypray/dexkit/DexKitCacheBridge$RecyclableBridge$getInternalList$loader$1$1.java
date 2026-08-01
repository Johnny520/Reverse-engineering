package org.luckypray.dexkit;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1 extends p000.bp0 implements p000.p70 {
    final /* synthetic */ p000.e80 $executor;
    final /* synthetic */ p000.a80 $mapper;

    /* JADX INFO: Incorrect field signature: TQ; */
    final /* synthetic */ org.luckypray.dexkit.query.base.BaseFinder $query;
    final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge this$0;

    /* JADX WARN: Incorrect types in method signature: (Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Le80;TQ;La80;)V */
    public DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1, p000.e80 r2, org.luckypray.dexkit.query.base.BaseFinder r3, p000.a80 r4) {
            r0 = this;
            r0.this$0 = r1
            r0.$executor = r2
            r0.$query = r3
            r0.$mapper = r4
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
            r6 = this;
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = r6.this$0
            e80 r1 = r6.$executor
            org.luckypray.dexkit.query.base.BaseFinder r2 = r6.$query
            a80 r6 = r6.$mapper
            org.luckypray.dexkit.cache.CacheBridgeRuntime r0 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.access$getRuntime(r0)
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$beginUse(r0)
            java.lang.Object r3 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getLifecycleLock$p(r0)     // Catch: java.lang.Throwable -> L3a
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3a
            org.luckypray.dexkit.DexKitBridge r4 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getBridge$p(r0)     // Catch: java.lang.Throwable -> L2c
            if (r4 != 0) goto L2e
            p70 r4 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getCreateBridge$p(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L2c
            r5 = r4
            org.luckypray.dexkit.DexKitBridge r5 = (org.luckypray.dexkit.DexKitBridge) r5     // Catch: java.lang.Throwable -> L2c
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$setBridge$p(r0, r5)     // Catch: java.lang.Throwable -> L2c
            org.luckypray.dexkit.DexKitBridge r4 = (org.luckypray.dexkit.DexKitBridge) r4     // Catch: java.lang.Throwable -> L2c
            r5 = 1
            goto L2f
        L2c:
            r6 = move-exception
            goto L67
        L2e:
            r5 = 0
        L2f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L3c
            p70 r3 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getNotifyBridgeCreated$p(r0)     // Catch: java.lang.Throwable -> L3a
            r3.invoke()     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r6 = move-exception
            goto L69
        L3c:
            java.lang.Object r1 = r1.invoke(r4, r2)     // Catch: java.lang.Throwable -> L3a
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L3a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3a
            r3 = 10
            int r3 = p000.AbstractC1021yh.m6889(r1, r3)     // Catch: java.lang.Throwable -> L3a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3a
        L51:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L63
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r3 = r6.invoke(r3)     // Catch: java.lang.Throwable -> L3a
            r2.add(r3)     // Catch: java.lang.Throwable -> L3a
            goto L51
        L63:
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r0)
            return r2
        L67:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3a
            throw r6     // Catch: java.lang.Throwable -> L3a
        L69:
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r0)
            throw r6
    }
}
