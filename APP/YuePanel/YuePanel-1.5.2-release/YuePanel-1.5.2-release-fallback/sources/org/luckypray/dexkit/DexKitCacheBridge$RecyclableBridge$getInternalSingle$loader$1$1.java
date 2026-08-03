package org.luckypray.dexkit;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\u0004\b\u0001\u0010\u0005\"\b\b\u0002\u0010\u0002*\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;", "R", "Q", "Lorg/luckypray/dexkit/query/base/BaseFinder;", "D", "Lorg/luckypray/dexkit/wrap/ISerializable;", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
@Yue.InterfaceC5840({"SMAP\nDexKitCacheBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1\n+ 2 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge\n+ 3 CacheBridgeRuntime.kt\norg/luckypray/dexkit/cache/CacheBridgeRuntime\n*L\n1#1,1819:1\n295#2:1820\n91#3,16:1821\n*S KotlinDebug\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1\n*L\n1650#1:1820\n1650#1:1821,16\n*E\n"})
public final class DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1<R> extends Yue.AbstractC3560 implements Yue.InterfaceC2823<org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome<? extends R>> {
    final /* synthetic */ Yue.InterfaceC2839<org.luckypray.dexkit.DexKitBridge, Q, java.util.List<D>> $executor;
    final /* synthetic */ Yue.InterfaceC2825<D, R> $mapper;

    /* JADX INFO: Incorrect field signature: TQ; */
    final /* synthetic */ org.luckypray.dexkit.query.base.BaseFinder $query;
    final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge this$0;

    /* JADX WARN: Incorrect types in method signature: (Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;LYue/ۥۣ۠ۢۢ<-Lorg/luckypray/dexkit/DexKitBridge;-TQ;+Ljava/util/List<+TD;>;>;TQ;LYue/ۥۣ۠ۡ۟<-TD;+TR;>;)V */
    public DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1, Yue.InterfaceC2839 r2, org.luckypray.dexkit.query.base.BaseFinder r3, Yue.InterfaceC2825 r4) {
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
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome r0 = r1.invoke()
            return r0
    }

    @Override // Yue.InterfaceC2823
    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome<R> invoke() {
            r8 = this;
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = r8.this$0
            Yue.ۥۣ۠ۢۢ<org.luckypray.dexkit.DexKitBridge, Q, java.util.List<D>> r1 = r8.$executor
            org.luckypray.dexkit.query.base.BaseFinder r2 = r8.$query
            Yue.ۥۣ۠ۡ۟<D, R> r3 = r8.$mapper
            org.luckypray.dexkit.cache.CacheBridgeRuntime r0 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.access$getRuntime(r0)
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$beginUse(r0)
            java.lang.Object r4 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getLifecycleLock$p(r0)     // Catch: java.lang.Throwable -> L3b
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L3b
            org.luckypray.dexkit.DexKitBridge r5 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getBridge$p(r0)     // Catch: java.lang.Throwable -> L2d
            r6 = 1
            if (r5 != 0) goto L2f
            Yue.ۥۣ۠۠ۨ r5 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getCreateBridge$p(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> L2d
            r7 = r5
            org.luckypray.dexkit.DexKitBridge r7 = (org.luckypray.dexkit.DexKitBridge) r7     // Catch: java.lang.Throwable -> L2d
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$setBridge$p(r0, r7)     // Catch: java.lang.Throwable -> L2d
            org.luckypray.dexkit.DexKitBridge r5 = (org.luckypray.dexkit.DexKitBridge) r5     // Catch: java.lang.Throwable -> L2d
            r7 = r6
            goto L30
        L2d:
            r1 = move-exception
            goto L82
        L2f:
            r7 = 0
        L30:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3b
            if (r7 == 0) goto L3d
            Yue.ۥۣ۠۠ۨ r4 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getNotifyBridgeCreated$p(r0)     // Catch: java.lang.Throwable -> L3b
            r4.invoke()     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            r1 = move-exception
            goto L84
        L3d:
            java.lang.Object r1 = r1.invoke(r5, r2)     // Catch: java.lang.Throwable -> L3b
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r2 = Yue.C1219.m6366(r1)     // Catch: java.lang.Throwable -> L3b
            if (r2 != 0) goto L50
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult r1 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            r1.<init>(r2, r6, r2)     // Catch: java.lang.Throwable -> L3b
            goto L7e
        L50:
            int r4 = r1.size()     // Catch: java.lang.Throwable -> L3b
        L54:
            if (r6 >= r4) goto L73
            java.lang.Object r5 = r1.get(r6)     // Catch: java.lang.Throwable -> L3b
            boolean r5 = Yue.C3329.m13897(r2, r5)     // Catch: java.lang.Throwable -> L3b
            if (r5 != 0) goto L70
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NonUnique r2 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NonUnique     // Catch: java.lang.Throwable -> L3b
            org.luckypray.dexkit.exceptions.NonUniqueResultException r3 = new org.luckypray.dexkit.exceptions.NonUniqueResultException     // Catch: java.lang.Throwable -> L3b
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L3b
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L3b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3b
            r1 = r2
            goto L7e
        L70:
            int r6 = r6 + 1
            goto L54
        L73:
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value r1 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r2 = r3.invoke(r2)     // Catch: java.lang.Throwable -> L3b
            org.luckypray.dexkit.wrap.ISerializable r2 = (org.luckypray.dexkit.wrap.ISerializable) r2     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3b
        L7e:
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r0)
            return r1
        L82:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3b
            throw r1     // Catch: java.lang.Throwable -> L3b
        L84:
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r0)
            throw r1
    }
}
