package org.luckypray.dexkit;

import Yue.AbstractC5673;
import Yue.C3881;
import Yue.InterfaceC5122;
import Yue.InterfaceC5124;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC7507;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitCacheBridge;
import org.luckypray.dexkit.cache.CacheBridgeRuntime;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m2699d2 = {"<anonymous>", "", "R", "D", "Lorg/luckypray/dexkit/wrap/ISerializable;", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
@InterfaceC7507({"SMAP\nDexKitCacheBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1\n+ 2 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge\n+ 3 CacheBridgeRuntime.kt\norg/luckypray/dexkit/cache/CacheBridgeRuntime\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1819:1\n295#2:1820\n91#3,13:1821\n105#3,2:1838\n1547#4:1834\n1618#4,3:1835\n*S KotlinDebug\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1\n*L\n1798#1:1820\n1798#1:1821,13\n1798#1:1838,2\n1798#1:1834\n1798#1:1835,3\n*E\n"})
public final class C2920x87bd6f8e<R> extends AbstractC5673 implements InterfaceC5122<List<? extends R>> {
    final /* synthetic */ InterfaceC5124<DexKitBridge, List<D>> $executor;
    final /* synthetic */ InterfaceC5124<D, R> $mapper;
    final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۡ۟<? super org.luckypray.dexkit.DexKitBridge, ? extends java.util.List<? extends D>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super D, ? extends R> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2920x87bd6f8e(DexKitCacheBridge.RecyclableBridge recyclableBridge, InterfaceC5124<? super DexKitBridge, ? extends List<? extends D>> interfaceC5124, InterfaceC5124<? super D, ? extends R> interfaceC51242) {
        super(0);
        this.this$0 = recyclableBridge;
        this.$executor = interfaceC5124;
        this.$mapper = interfaceC51242;
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
        InterfaceC5124<DexKitBridge, List<D>> interfaceC5124 = this.$executor;
        InterfaceC5124<D, R> interfaceC51242 = this.$mapper;
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
            Iterable iterable = (Iterable) interfaceC5124.invoke(dexKitBridge);
            ArrayList arrayList = new ArrayList(C3881.m10756(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(interfaceC51242.invoke((D) it.next()));
            }
            runtime.endUse();
            return arrayList;
        } catch (Throwable th) {
            runtime.endUse();
            throw th;
        }
    }
}
