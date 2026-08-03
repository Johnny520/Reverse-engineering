package org.luckypray.dexkit;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0006\"\u0004\b\u0001\u0010\u0007\"\b\b\u0002\u0010\u0004*\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "", "", "R", "Q", "Lorg/luckypray/dexkit/query/base/BaseFinder;", "D", "Lorg/luckypray/dexkit/wrap/ISerializable;", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
@Yue.InterfaceC5840({"SMAP\nDexKitCacheBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1\n+ 2 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge\n+ 3 CacheBridgeRuntime.kt\norg/luckypray/dexkit/cache/CacheBridgeRuntime\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1819:1\n295#2:1820\n91#3,13:1821\n105#3,2:1843\n436#4:1834\n386#4:1835\n1236#5,2:1836\n1547#5:1838\n1618#5,3:1839\n1239#5:1842\n*S KotlinDebug\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1\n*L\n1727#1:1820\n1727#1:1821,13\n1727#1:1843,2\n1727#1:1834\n1727#1:1835\n1727#1:1836,2\n1727#1:1838\n1727#1:1839,3\n1727#1:1842\n*E\n"})
public final class DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1<R> extends Yue.AbstractC3560 implements Yue.InterfaceC2823<java.util.Map<java.lang.String, ? extends java.util.List<? extends R>>> {
    final /* synthetic */ Yue.InterfaceC2839<org.luckypray.dexkit.DexKitBridge, Q, java.util.Map<java.lang.String, java.util.List<D>>> $executor;
    final /* synthetic */ Yue.InterfaceC2825<D, R> $mapper;

    /* JADX INFO: Incorrect field signature: TQ; */
    final /* synthetic */ org.luckypray.dexkit.query.base.BaseFinder $query;
    final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge this$0;

    /* JADX WARN: Incorrect types in method signature: (Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;LYue/ۥۣ۠ۢۢ<-Lorg/luckypray/dexkit/DexKitBridge;-TQ;+Ljava/util/Map<Ljava/lang/String;+Ljava/util/List<+TD;>;>;>;TQ;LYue/ۥۣ۠ۡ۟<-TD;+TR;>;)V */
    public DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1, Yue.InterfaceC2839 r2, org.luckypray.dexkit.query.base.BaseFinder r3, Yue.InterfaceC2825 r4) {
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
            java.util.Map r0 = r1.invoke()
            return r0
    }

    @Override // Yue.InterfaceC2823
    @Yue.InterfaceC4418
    public final java.util.Map<java.lang.String, java.util.List<R>> invoke() {
            r8 = this;
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = r8.this$0
            Yue.ۥۣ۠ۢۢ<org.luckypray.dexkit.DexKitBridge, Q, java.util.Map<java.lang.String, java.util.List<D>>> r1 = r8.$executor
            org.luckypray.dexkit.query.base.BaseFinder r2 = r8.$query
            Yue.ۥۣ۠ۡ۟<D, R> r3 = r8.$mapper
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
            goto L99
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
            goto L9b
        L3c:
            java.lang.Object r1 = r1.invoke(r5, r2)     // Catch: java.lang.Throwable -> L3a
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L3a
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L3a
            int r4 = r1.size()     // Catch: java.lang.Throwable -> L3a
            int r4 = Yue.C3900.m15722(r4)     // Catch: java.lang.Throwable -> L3a
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L3a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3a
        L57:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L95
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L3a
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> L3a
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L3a
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L3a
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3a
            r7 = 10
            int r7 = Yue.C1210.m6231(r4, r7)     // Catch: java.lang.Throwable -> L3a
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L3a
        L7f:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r7 == 0) goto L91
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r7 = r3.invoke(r7)     // Catch: java.lang.Throwable -> L3a
            r6.add(r7)     // Catch: java.lang.Throwable -> L3a
            goto L7f
        L91:
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L3a
            goto L57
        L95:
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r0)
            return r2
        L99:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            throw r1     // Catch: java.lang.Throwable -> L3a
        L9b:
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r0)
            throw r1
    }
}
