package org.luckypray.dexkit;

import java.util.List;
import org.luckypray.dexkit.DexKitCacheBridge;
import org.luckypray.dexkit.cache.CacheBridgeRuntime;
import org.luckypray.dexkit.cache.CacheBridgeStore;
import org.luckypray.dexkit.exceptions.NonUniqueResultException;
import org.luckypray.dexkit.query.base.BaseFinder;
import org.luckypray.dexkit.wrap.ISerializable;
import p000.AbstractC0184d9;
import p000.InterfaceC0279j5;
import p000.InterfaceC0482u5;
import p000.InterfaceC0546y5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 extends AbstractC0184d9 implements InterfaceC0279j5 {
    final /* synthetic */ InterfaceC0546y5 $executor;
    final /* synthetic */ InterfaceC0482u5 $mapper;

    /* JADX INFO: Incorrect field signature: TQ; */
    final /* synthetic */ BaseFinder $query;
    final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ly5;TQ;Lu5;)V */
    public DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1(DexKitCacheBridge.RecyclableBridge recyclableBridge, InterfaceC0546y5 interfaceC0546y5, BaseFinder baseFinder, InterfaceC0482u5 interfaceC0482u5) {
        super(0);
        this.this$0 = recyclableBridge;
        this.$executor = interfaceC0546y5;
        this.$query = baseFinder;
        this.$mapper = interfaceC0482u5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p000.InterfaceC0279j5
    public final CacheBridgeStore.SingleOutcome<R> invoke() {
        DexKitBridge dexKitBridge;
        int i;
        boolean z;
        CacheBridgeStore.SingleOutcome value;
        DexKitCacheBridge.RecyclableBridge recyclableBridge = this.this$0;
        InterfaceC0546y5 interfaceC0546y5 = this.$executor;
        BaseFinder baseFinder = this.$query;
        InterfaceC0482u5 interfaceC0482u5 = this.$mapper;
        CacheBridgeRuntime runtime = recyclableBridge.getRuntime();
        runtime.beginUse();
        try {
            synchronized (runtime.lifecycleLock) {
                dexKitBridge = runtime.bridge;
                i = 1;
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
            List list = (List) interfaceC0546y5.invoke(dexKitBridge, baseFinder);
            list.getClass();
            Object obj = list.isEmpty() ? null : list.get(0);
            if (obj != null) {
                int size = list.size();
                while (true) {
                    if (i >= size) {
                        value = new CacheBridgeStore.SingleOutcome.Value((ISerializable) interfaceC0482u5.invoke(obj));
                        break;
                    }
                    if (!obj.equals(list.get(i))) {
                        value = new CacheBridgeStore.SingleOutcome.NonUnique(new NonUniqueResultException(list.size()));
                        break;
                    }
                    i++;
                }
            } else {
                value = new CacheBridgeStore.SingleOutcome.NoResult(null, 1, null);
            }
            runtime.endUse();
            return value;
        } catch (Throwable th) {
            runtime.endUse();
            throw th;
        }
    }
}
