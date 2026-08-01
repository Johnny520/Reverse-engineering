package org.luckypray.dexkit;

/* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0643x95b222e4 extends p000.bp0 implements p000.p70 {
    final /* synthetic */ p000.a80 $executor;
    final /* synthetic */ p000.a80 $mapper;
    final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge this$0;

    public C0643x95b222e4(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1, p000.a80 r2, p000.a80 r3) {
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
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome r0 = r0.invoke()
            return r0
    }

    @Override // p000.p70
    public final org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome<R> invoke() {
            r6 = this;
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = r6.this$0     // Catch: org.luckypray.dexkit.exceptions.NonUniqueResultException -> L5e org.luckypray.dexkit.exceptions.NoResultException -> L65
            a80 r1 = r6.$executor     // Catch: org.luckypray.dexkit.exceptions.NonUniqueResultException -> L5e org.luckypray.dexkit.exceptions.NoResultException -> L65
            a80 r6 = r6.$mapper     // Catch: org.luckypray.dexkit.exceptions.NonUniqueResultException -> L5e org.luckypray.dexkit.exceptions.NoResultException -> L65
            org.luckypray.dexkit.cache.CacheBridgeRuntime r0 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.access$getRuntime(r0)     // Catch: org.luckypray.dexkit.exceptions.NonUniqueResultException -> L5e org.luckypray.dexkit.exceptions.NoResultException -> L65
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$beginUse(r0)     // Catch: org.luckypray.dexkit.exceptions.NonUniqueResultException -> L5e org.luckypray.dexkit.exceptions.NoResultException -> L65
            java.lang.Object r2 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getLifecycleLock$p(r0)     // Catch: java.lang.Throwable -> L39
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L39
            org.luckypray.dexkit.DexKitBridge r3 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getBridge$p(r0)     // Catch: java.lang.Throwable -> L2b
            r4 = 1
            if (r3 != 0) goto L2d
            p70 r3 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getCreateBridge$p(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r3 = r3.invoke()     // Catch: java.lang.Throwable -> L2b
            r5 = r3
            org.luckypray.dexkit.DexKitBridge r5 = (org.luckypray.dexkit.DexKitBridge) r5     // Catch: java.lang.Throwable -> L2b
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$setBridge$p(r0, r5)     // Catch: java.lang.Throwable -> L2b
            org.luckypray.dexkit.DexKitBridge r3 = (org.luckypray.dexkit.DexKitBridge) r3     // Catch: java.lang.Throwable -> L2b
            r5 = r4
            goto L2e
        L2b:
            r6 = move-exception
            goto L58
        L2d:
            r5 = 0
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L39
            if (r5 == 0) goto L3b
            p70 r2 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getNotifyBridgeCreated$p(r0)     // Catch: java.lang.Throwable -> L39
            r2.invoke()     // Catch: java.lang.Throwable -> L39
            goto L3b
        L39:
            r6 = move-exception
            goto L5a
        L3b:
            java.lang.Object r1 = r1.invoke(r3)     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto L48
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult r6 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult     // Catch: java.lang.Throwable -> L39
            r1 = 0
            r6.<init>(r1, r4, r1)     // Catch: java.lang.Throwable -> L39
            goto L54
        L48:
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value r2 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value     // Catch: java.lang.Throwable -> L39
            java.lang.Object r6 = r6.invoke(r1)     // Catch: java.lang.Throwable -> L39
            org.luckypray.dexkit.wrap.ISerializable r6 = (org.luckypray.dexkit.wrap.ISerializable) r6     // Catch: java.lang.Throwable -> L39
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L39
            r6 = r2
        L54:
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r0)     // Catch: org.luckypray.dexkit.exceptions.NonUniqueResultException -> L5e org.luckypray.dexkit.exceptions.NoResultException -> L65
            return r6
        L58:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L39
            throw r6     // Catch: java.lang.Throwable -> L39
        L5a:
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r0)     // Catch: org.luckypray.dexkit.exceptions.NonUniqueResultException -> L5e org.luckypray.dexkit.exceptions.NoResultException -> L65
            throw r6     // Catch: org.luckypray.dexkit.exceptions.NonUniqueResultException -> L5e org.luckypray.dexkit.exceptions.NoResultException -> L65
        L5e:
            r6 = move-exception
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NonUnique r0 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NonUnique
            r0.<init>(r6)
            goto L6b
        L65:
            r6 = move-exception
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult r0 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult
            r0.<init>(r6)
        L6b:
            return r0
    }
}
