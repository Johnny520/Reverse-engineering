package org.luckypray.dexkit;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\u0004\b\u0001\u0010\u0005\"\b\b\u0002\u0010\u0002*\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "R", "Q", "Lorg/luckypray/dexkit/query/base/BaseFinder;", "D", "Lorg/luckypray/dexkit/wrap/ISerializable;", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
@Yue.InterfaceC5840({"SMAP\nDexKitCacheBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1\n+ 2 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge\n+ 3 CacheBridgeRuntime.kt\norg/luckypray/dexkit/cache/CacheBridgeRuntime\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1819:1\n295#2:1820\n91#3,13:1821\n105#3,2:1838\n1547#4:1834\n1618#4,3:1835\n*S KotlinDebug\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1\n*L\n1698#1:1820\n1698#1:1821,13\n1698#1:1838,2\n1698#1:1834\n1698#1:1835,3\n*E\n"})
public final class DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1<R> extends Yue.AbstractC3560 implements Yue.InterfaceC2823<java.util.List<? extends R>> {
    final /* synthetic */ Yue.InterfaceC2839<org.luckypray.dexkit.DexKitBridge, Q, java.util.List<D>> $executor;
    final /* synthetic */ Yue.InterfaceC2825<D, R> $mapper;

    /* JADX INFO: Incorrect field signature: TQ; */
    final /* synthetic */ org.luckypray.dexkit.query.base.BaseFinder $query;
    final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge this$0;

    /* JADX WARN: Incorrect types in method signature: (Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;LYue/ۥۣ۠ۢۢ<-Lorg/luckypray/dexkit/DexKitBridge;-TQ;+Ljava/util/List<+TD;>;>;TQ;LYue/ۥۣ۠ۡ۟<-TD;+TR;>;)V */
    public DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1, Yue.InterfaceC2839 r2, org.luckypray.dexkit.query.base.BaseFinder r3, Yue.InterfaceC2825 r4) {
            r0 = this;
            r0.this$0 = r1
            r0.$executor = r2
            r0.$query = r3
            r0.$mapper = r4
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // Yue.InterfaceC2823
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            r1 = this;
            java.util.List r0 = r1.invoke()
            return r0
    }

    @Override // Yue.InterfaceC2823
    @Yue.InterfaceC4418
    public final java.util.List<R> invoke() {
            r7 = this;
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = r7.this$0
            Yue.ۥۣ۠ۢۢ<org.luckypray.dexkit.DexKitBridge, Q, java.util.List<D>> r1 = r7.$executor
            org.luckypray.dexkit.query.base.BaseFinder r2 = r7.$query
            Yue.ۥۣ۠ۡ۟<D, R> r3 = r7.$mapper
            org.luckypray.dexkit.cache.CacheBridgeRuntime r0 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.access$getRuntime(r0)
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$beginUse(r0)
            java.lang.Object r4 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getLifecycleLock$p(r0)     // Catch: java.lang.Throwable -> L3a
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L3a
            org.luckypray.dexkit.DexKitBridge r5 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getBridge$p(r0)     // Catch: java.lang.Throwable -> L2c
            if (r5 != 0) goto L2e
            Yue.ۥۣ۠۠ۨ r5 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getCreateBridge$p(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> L2c
            r6 = r5
            org.luckypray.dexkit.DexKitBridge r6 = (org.luckypray.dexkit.DexKitBridge) r6     // Catch: java.lang.Throwable -> L2c
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$setBridge$p(r0, r6)     // Catch: java.lang.Throwable -> L2c
            org.luckypray.dexkit.DexKitBridge r5 = (org.luckypray.dexkit.DexKitBridge) r5     // Catch: java.lang.Throwable -> L2c
            r6 = 1
            goto L2f
        L2c:
            r1 = move-exception
            goto L67
        L2e:
            r6 = 0
        L2f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto L3c
            Yue.ۥۣ۠۠ۨ r4 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getNotifyBridgeCreated$p(r0)     // Catch: java.lang.Throwable -> L3a
            r4.invoke()     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r1 = move-exception
            goto L69
        L3c:
            java.lang.Object r1 = r1.invoke(r5, r2)     // Catch: java.lang.Throwable -> L3a
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L3a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3a
            r4 = 10
            int r4 = Yue.C1210.m6231(r1, r4)     // Catch: java.lang.Throwable -> L3a
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3a
        L51:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L63
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r4 = r3.invoke(r4)     // Catch: java.lang.Throwable -> L3a
            r2.add(r4)     // Catch: java.lang.Throwable -> L3a
            goto L51
        L63:
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r0)
            return r2
        L67:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            throw r1     // Catch: java.lang.Throwable -> L3a
        L69:
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r0)
            throw r1
    }
}
