package org.luckypray.dexkit;

import java.util.List;
import org.luckypray.dexkit.DexKitCacheBridge;
import org.luckypray.dexkit.cache.CacheBridgeRuntime;
import org.luckypray.dexkit.cache.CacheBridgeStore;
import org.luckypray.dexkit.exceptions.NonUniqueResultException;
import org.luckypray.dexkit.query.base.BaseFinder;
import org.luckypray.dexkit.wrap.ISerializable;
import p000.AbstractC0960ye;
import p000.InterfaceC0298hw;
import p000.InterfaceC0742sw;
import p000.InterfaceC0904ww;
import p000.c50;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 extends c50 implements InterfaceC0298hw {
    final /* synthetic */ InterfaceC0904ww $executor;
    final /* synthetic */ InterfaceC0742sw $mapper;

    /* JADX INFO: Incorrect field signature: TQ; */
    final /* synthetic */ BaseFinder $query;
    final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lww;TQ;Lsw;)V */
    public DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1(DexKitCacheBridge.RecyclableBridge recyclableBridge, InterfaceC0904ww interfaceC0904ww, BaseFinder baseFinder, InterfaceC0742sw interfaceC0742sw) {
        super(0);
        this.this$0 = recyclableBridge;
        this.$executor = interfaceC0904ww;
        this.$query = baseFinder;
        this.$mapper = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p000.InterfaceC0298hw
    public final CacheBridgeStore.SingleOutcome<R> invoke() {
        DexKitBridge dexKitBridge;
        int i;
        boolean z;
        CacheBridgeStore.SingleOutcome value;
        DexKitCacheBridge.RecyclableBridge recyclableBridge = this.this$0;
        InterfaceC0904ww interfaceC0904ww = this.$executor;
        BaseFinder baseFinder = this.$query;
        InterfaceC0742sw interfaceC0742sw = this.$mapper;
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
            List list = (List) interfaceC0904ww.invoke(dexKitBridge, baseFinder);
            Object objM5241K = AbstractC0960ye.m5241K(list);
            if (objM5241K != null) {
                int size = list.size();
                while (true) {
                    if (i >= size) {
                        value = new CacheBridgeStore.SingleOutcome.Value((ISerializable) interfaceC0742sw.invoke(objM5241K));
                        break;
                    }
                    if (!objM5241K.equals(list.get(i))) {
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
