package org.luckypray.dexkit;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;", "R", "D", "Lorg/luckypray/dexkit/wrap/ISerializable;", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
@Yue.InterfaceC5840({"SMAP\nDexKitCacheBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1\n+ 2 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge\n+ 3 CacheBridgeRuntime.kt\norg/luckypray/dexkit/cache/CacheBridgeRuntime\n*L\n1#1,1819:1\n295#2:1820\n91#3,16:1821\n*S KotlinDebug\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1\n*L\n1756#1:1820\n1756#1:1821,16\n*E\n"})
public final class DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1<R> extends Yue.AbstractC3560 implements Yue.InterfaceC2823<org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome<? extends R>> {
    final /* synthetic */ Yue.InterfaceC2825<org.luckypray.dexkit.DexKitBridge, D> $executor;
    final /* synthetic */ Yue.InterfaceC2825<D, R> $mapper;
    final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge this$0;

    public DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1, Yue.InterfaceC2825<? super org.luckypray.dexkit.DexKitBridge, ? extends D> r2, Yue.InterfaceC2825<? super D, ? extends R> r3) {
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
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome r0 = r1.invoke()
            return r0
    }

    @Override // Yue.InterfaceC2823
    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome<R> invoke() {
            r7 = this;
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = r7.this$0     // Catch: org.luckypray.dexkit.exceptions.NonUniqueResultException -> L58 org.luckypray.dexkit.exceptions.NoResultException -> L5a
            Yue.ۥۣ۠ۡ۟<org.luckypray.dexkit.DexKitBridge, D> r1 = r7.$executor     // Catch: org.luckypray.dexkit.exceptions.NonUniqueResultException -> L58 org.luckypray.dexkit.exceptions.NoResultException -> L5a
            Yue.ۥۣ۠ۡ۟<D, R> r2 = r7.$mapper     // Catch: org.luckypray.dexkit.exceptions.NonUniqueResultException -> L58 org.luckypray.dexkit.exceptions.NoResultException -> L5a
            org.luckypray.dexkit.cache.CacheBridgeRuntime r0 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.access$getRuntime(r0)     // Catch: org.luckypray.dexkit.exceptions.NonUniqueResultException -> L58 org.luckypray.dexkit.exceptions.NoResultException -> L5a
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$beginUse(r0)     // Catch: org.luckypray.dexkit.exceptions.NonUniqueResultException -> L58 org.luckypray.dexkit.exceptions.NoResultException -> L5a
            java.lang.Object r3 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getLifecycleLock$p(r0)     // Catch: java.lang.Throwable -> L39
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L39
            org.luckypray.dexkit.DexKitBridge r4 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getBridge$p(r0)     // Catch: java.lang.Throwable -> L2b
            r5 = 1
            if (r4 != 0) goto L2d
            Yue.ۥۣ۠۠ۨ r4 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getCreateBridge$p(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L2b
            r6 = r4
            org.luckypray.dexkit.DexKitBridge r6 = (org.luckypray.dexkit.DexKitBridge) r6     // Catch: java.lang.Throwable -> L2b
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$setBridge$p(r0, r6)     // Catch: java.lang.Throwable -> L2b
            org.luckypray.dexkit.DexKitBridge r4 = (org.luckypray.dexkit.DexKitBridge) r4     // Catch: java.lang.Throwable -> L2b
            r6 = r5
            goto L2e
        L2b:
            r1 = move-exception
            goto L5c
        L2d:
            r6 = 0
        L2e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            if (r6 == 0) goto L3b
            Yue.ۥۣ۠۠ۨ r3 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getNotifyBridgeCreated$p(r0)     // Catch: java.lang.Throwable -> L39
            r3.invoke()     // Catch: java.lang.Throwable -> L39
            goto L3b
        L39:
            r1 = move-exception
            goto L5e
        L3b:
            java.lang.Object r1 = r1.invoke(r4)     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto L48
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult r1 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult     // Catch: java.lang.Throwable -> L39
            r2 = 0
            r1.<init>(r2, r5, r2)     // Catch: java.lang.Throwable -> L39
            goto L54
        L48:
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value r3 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value     // Catch: java.lang.Throwable -> L39
            java.lang.Object r1 = r2.invoke(r1)     // Catch: java.lang.Throwable -> L39
            org.luckypray.dexkit.wrap.ISerializable r1 = (org.luckypray.dexkit.wrap.ISerializable) r1     // Catch: java.lang.Throwable -> L39
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L39
            r1 = r3
        L54:
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r0)     // Catch: org.luckypray.dexkit.exceptions.NonUniqueResultException -> L58 org.luckypray.dexkit.exceptions.NoResultException -> L5a
            goto L6d
        L58:
            r0 = move-exception
            goto L62
        L5a:
            r0 = move-exception
            goto L68
        L5c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            throw r1     // Catch: java.lang.Throwable -> L39
        L5e:
            org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r0)     // Catch: org.luckypray.dexkit.exceptions.NonUniqueResultException -> L58 org.luckypray.dexkit.exceptions.NoResultException -> L5a
            throw r1     // Catch: org.luckypray.dexkit.exceptions.NonUniqueResultException -> L58 org.luckypray.dexkit.exceptions.NoResultException -> L5a
        L62:
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NonUnique r1 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NonUnique
            r1.<init>(r0)
            goto L6d
        L68:
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult r1 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult
            r1.<init>(r0)
        L6d:
            return r1
    }
}
