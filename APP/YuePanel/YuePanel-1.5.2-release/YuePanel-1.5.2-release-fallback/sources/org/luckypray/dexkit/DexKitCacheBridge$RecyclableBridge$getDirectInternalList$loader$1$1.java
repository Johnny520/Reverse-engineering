package org.luckypray.dexkit;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "R", "D", "Lorg/luckypray/dexkit/wrap/ISerializable;", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
@Yue.InterfaceC5840({"SMAP\nDexKitCacheBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1\n+ 2 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge\n+ 3 CacheBridgeRuntime.kt\norg/luckypray/dexkit/cache/CacheBridgeRuntime\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1819:1\n295#2:1820\n91#3,13:1821\n105#3,2:1838\n1547#4:1834\n1618#4,3:1835\n*S KotlinDebug\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1\n*L\n1798#1:1820\n1798#1:1821,13\n1798#1:1838,2\n1798#1:1834\n1798#1:1835,3\n*E\n"})
public final class DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1<R> extends Yue.AbstractC3560 implements Yue.InterfaceC2823<java.util.List<? extends R>> {
    final /* synthetic */ Yue.InterfaceC2825<org.luckypray.dexkit.DexKitBridge, java.util.List<D>> $executor;
    final /* synthetic */ Yue.InterfaceC2825<D, R> $mapper;
    final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge this$0;

    public DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1, Yue.InterfaceC2825<? super org.luckypray.dexkit.DexKitBridge, ? extends java.util.List<? extends D>> r2, Yue.InterfaceC2825<? super D, ? extends R> r3) {
            r0 = this;
            r0.this$0 = r1
            r0.$executor = r2
            r0.$mapper = r3
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
            r6 = this;
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = r6.this$0
            Yue.ۥۣ۠ۡ۟<org.luckypray.dexkit.DexKitBridge, java.util.List<D>> r1 = r6.$executor
            Yue.ۥۣ۠ۡ۟<D, R> r2 = r6.$mapper
            org.luckypray.dexkit.cache.CacheBridgeRuntime r0 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.access$getRuntime(r0)
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$beginUse(r0)
            java.lang.Object r3 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getLifecycleLock$p(r0)     // Catch: java.lang.Throwable -> L38
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L38
            org.luckypray.dexkit.DexKitBridge r4 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getBridge$p(r0)     // Catch: java.lang.Throwable -> L2a
            if (r4 != 0) goto L2c
            Yue.ۥۣ۠۠ۨ r4 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getCreateBridge$p(r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L2a
            r5 = r4
            org.luckypray.dexkit.DexKitBridge r5 = (org.luckypray.dexkit.DexKitBridge) r5     // Catch: java.lang.Throwable -> L2a
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$setBridge$p(r0, r5)     // Catch: java.lang.Throwable -> L2a
            org.luckypray.dexkit.DexKitBridge r4 = (org.luckypray.dexkit.DexKitBridge) r4     // Catch: java.lang.Throwable -> L2a
            r5 = 1
            goto L2d
        L2a:
            r1 = move-exception
            goto L65
        L2c:
            r5 = 0
        L2d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L3a
            Yue.ۥۣ۠۠ۨ r3 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getNotifyBridgeCreated$p(r0)     // Catch: java.lang.Throwable -> L38
            r3.invoke()     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r1 = move-exception
            goto L67
        L3a:
            java.lang.Object r1 = r1.invoke(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L38
            r4 = 10
            int r4 = Yue.C1210.m6231(r1, r4)     // Catch: java.lang.Throwable -> L38
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L38
        L4f:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L61
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = r2.invoke(r4)     // Catch: java.lang.Throwable -> L38
            r3.add(r4)     // Catch: java.lang.Throwable -> L38
            goto L4f
        L61:
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r0)
            return r3
        L65:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r1     // Catch: java.lang.Throwable -> L38
        L67:
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r0)
            throw r1
    }
}
