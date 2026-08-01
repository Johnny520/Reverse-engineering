package org.luckypray.dexkit;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 extends p000.bp0 implements p000.p70 {
    final /* synthetic */ p000.e80 $executor;
    final /* synthetic */ p000.a80 $mapper;

    /* JADX INFO: Incorrect field signature: TQ; */
    final /* synthetic */ org.luckypray.dexkit.query.base.BaseFinder $query;
    final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge this$0;

    /* JADX WARN: Incorrect types in method signature: (Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Le80;TQ;La80;)V */
    public DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1, p000.e80 r2, org.luckypray.dexkit.query.base.BaseFinder r3, p000.a80 r4) {
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
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome r0 = r0.invoke()
            return r0
    }

    @Override // p000.p70
    public final org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome<R> invoke() {
            r7 = this;
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = r7.this$0
            e80 r1 = r7.$executor
            org.luckypray.dexkit.query.base.BaseFinder r2 = r7.$query
            a80 r7 = r7.$mapper
            org.luckypray.dexkit.cache.CacheBridgeRuntime r0 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.access$getRuntime(r0)
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$beginUse(r0)
            java.lang.Object r3 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getLifecycleLock$p(r0)     // Catch: java.lang.Throwable -> L3b
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3b
            org.luckypray.dexkit.DexKitBridge r4 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getBridge$p(r0)     // Catch: java.lang.Throwable -> L2d
            r5 = 1
            if (r4 != 0) goto L2f
            p70 r4 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getCreateBridge$p(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L2d
            r6 = r4
            org.luckypray.dexkit.DexKitBridge r6 = (org.luckypray.dexkit.DexKitBridge) r6     // Catch: java.lang.Throwable -> L2d
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$setBridge$p(r0, r6)     // Catch: java.lang.Throwable -> L2d
            org.luckypray.dexkit.DexKitBridge r4 = (org.luckypray.dexkit.DexKitBridge) r4     // Catch: java.lang.Throwable -> L2d
            r6 = r5
            goto L30
        L2d:
            r7 = move-exception
            goto L82
        L2f:
            r6 = 0
        L30:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L3d
            p70 r3 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getNotifyBridgeCreated$p(r0)     // Catch: java.lang.Throwable -> L3b
            r3.invoke()     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            r7 = move-exception
            goto L84
        L3d:
            java.lang.Object r1 = r1.invoke(r4, r2)     // Catch: java.lang.Throwable -> L3b
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r2 = p000.AbstractC0984xh.m6640(r1)     // Catch: java.lang.Throwable -> L3b
            if (r2 != 0) goto L50
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult r7 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult     // Catch: java.lang.Throwable -> L3b
            r1 = 0
            r7.<init>(r1, r5, r1)     // Catch: java.lang.Throwable -> L3b
            goto L7e
        L50:
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L3b
        L54:
            if (r5 >= r3) goto L72
            java.lang.Object r4 = r1.get(r5)     // Catch: java.lang.Throwable -> L3b
            boolean r4 = r2.equals(r4)     // Catch: java.lang.Throwable -> L3b
            if (r4 != 0) goto L6f
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NonUnique r7 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NonUnique     // Catch: java.lang.Throwable -> L3b
            org.luckypray.dexkit.exceptions.NonUniqueResultException r2 = new org.luckypray.dexkit.exceptions.NonUniqueResultException     // Catch: java.lang.Throwable -> L3b
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L3b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3b
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L3b
            goto L7e
        L6f:
            int r5 = r5 + 1
            goto L54
        L72:
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value r1 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r7 = r7.invoke(r2)     // Catch: java.lang.Throwable -> L3b
            org.luckypray.dexkit.wrap.ISerializable r7 = (org.luckypray.dexkit.wrap.ISerializable) r7     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L3b
            r7 = r1
        L7e:
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r0)
            return r7
        L82:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            throw r7     // Catch: java.lang.Throwable -> L3b
        L84:
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r0)
            throw r7
    }
}
