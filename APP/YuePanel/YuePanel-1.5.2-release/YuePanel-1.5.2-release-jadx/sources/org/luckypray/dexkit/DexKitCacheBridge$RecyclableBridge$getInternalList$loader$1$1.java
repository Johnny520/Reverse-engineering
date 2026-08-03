package org.luckypray.dexkit;

import Yue.AbstractC5673;
import Yue.C3881;
import Yue.InterfaceC5122;
import Yue.InterfaceC5124;
import Yue.InterfaceC5138;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC7507;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitCacheBridge;
import org.luckypray.dexkit.cache.CacheBridgeRuntime;
import org.luckypray.dexkit.query.base.BaseFinder;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\u0004\b\u0001\u0010\u0005\"\b\b\u0002\u0010\u0002*\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m2699d2 = {"<anonymous>", "", "R", "Q", "Lorg/luckypray/dexkit/query/base/BaseFinder;", "D", "Lorg/luckypray/dexkit/wrap/ISerializable;", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
@InterfaceC7507({"SMAP\nDexKitCacheBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1\n+ 2 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge\n+ 3 CacheBridgeRuntime.kt\norg/luckypray/dexkit/cache/CacheBridgeRuntime\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1819:1\n295#2:1820\n91#3,13:1821\n105#3,2:1838\n1547#4:1834\n1618#4,3:1835\n*S KotlinDebug\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1\n*L\n1698#1:1820\n1698#1:1821,13\n1698#1:1838,2\n1698#1:1834\n1698#1:1835,3\n*E\n"})
public final class DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1<R> extends AbstractC5673 implements InterfaceC5122<List<? extends R>> {
    final /* synthetic */ InterfaceC5138<DexKitBridge, Q, List<D>> $executor;
    final /* synthetic */ InterfaceC5124<D, R> $mapper;

    /* JADX INFO: Incorrect field signature: TQ; */
    final /* synthetic */ BaseFinder $query;
    final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;LYue/ۥۣ۠ۢۢ<-Lorg/luckypray/dexkit/DexKitBridge;-TQ;+Ljava/util/List<+TD;>;>;TQ;LYue/ۥۣ۠ۡ۟<-TD;+TR;>;)V */
    public DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1(DexKitCacheBridge.RecyclableBridge recyclableBridge, InterfaceC5138 interfaceC5138, BaseFinder baseFinder, InterfaceC5124 interfaceC5124) {
        super(0);
        this.this$0 = recyclableBridge;
        this.$executor = interfaceC5138;
        this.$query = baseFinder;
        this.$mapper = interfaceC5124;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // Yue.InterfaceC5122
    @InterfaceC6399
    public final List<R> invoke() {
        DexKitBridge dexKitBridge;
        boolean z;
        DexKitCacheBridge.RecyclableBridge recyclableBridge = this.this$0;
        InterfaceC5138<DexKitBridge, Q, List<D>> interfaceC5138 = this.$executor;
        BaseFinder baseFinder = this.$query;
        InterfaceC5124<D, R> interfaceC5124 = this.$mapper;
        CacheBridgeRuntime runtime = recyclableBridge.getRuntime();
        runtime.beginUse();
        try {
            synchronized (runtime.lifecycleLock) {
                dexKitBridge = runtime.bridge;
                if (dexKitBridge == null) {
                    Object objInvoke = runtime.createBridge.invoke();
                    runtime.bridge = (DexKitBridge) objInvoke;
                    dexKitBridge = (DexKitBridge) objInvoke;
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                runtime.notifyBridgeCreated.invoke();
            }
            Iterable iterable = (Iterable) interfaceC5138.invoke(dexKitBridge, (Q) baseFinder);
            ArrayList arrayList = new ArrayList(C3881.m10756(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(interfaceC5124.invoke((D) it.next()));
            }
            runtime.endUse();
            return arrayList;
        } catch (Throwable th) {
            runtime.endUse();
            throw th;
        }
    }
}
