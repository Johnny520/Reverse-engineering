package org.luckypray.dexkit;

import org.luckypray.dexkit.DexKitCacheBridge;
import org.luckypray.dexkit.cache.CacheBridgeRuntime;
import org.luckypray.dexkit.cache.CacheBridgeStore;
import org.luckypray.dexkit.exceptions.NoResultException;
import org.luckypray.dexkit.exceptions.NonUniqueResultException;
import org.luckypray.dexkit.wrap.ISerializable;
import p000.InterfaceC0298hw;
import p000.InterfaceC0742sw;
import p000.c50;

/* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0571x95b222e4 extends c50 implements InterfaceC0298hw {
    final /* synthetic */ InterfaceC0742sw $executor;
    final /* synthetic */ InterfaceC0742sw $mapper;
    final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0571x95b222e4(DexKitCacheBridge.RecyclableBridge recyclableBridge, InterfaceC0742sw interfaceC0742sw, InterfaceC0742sw interfaceC0742sw2) {
        super(0);
        this.this$0 = recyclableBridge;
        this.$executor = interfaceC0742sw;
        this.$mapper = interfaceC0742sw2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p000.InterfaceC0298hw
    public final CacheBridgeStore.SingleOutcome<R> invoke() {
        DexKitBridge dexKitBridge;
        boolean z;
        try {
            DexKitCacheBridge.RecyclableBridge recyclableBridge = this.this$0;
            InterfaceC0742sw interfaceC0742sw = this.$executor;
            InterfaceC0742sw interfaceC0742sw2 = this.$mapper;
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
                Object objInvoke2 = interfaceC0742sw.invoke(dexKitBridge);
                CacheBridgeStore.SingleOutcome noResult = objInvoke2 == null ? new CacheBridgeStore.SingleOutcome.NoResult(null, 1, null) : new CacheBridgeStore.SingleOutcome.Value((ISerializable) interfaceC0742sw2.invoke(objInvoke2));
                runtime.endUse();
                return noResult;
            } catch (Throwable th) {
                runtime.endUse();
                throw th;
            }
        } catch (NoResultException e) {
            return new CacheBridgeStore.SingleOutcome.NoResult(e);
        } catch (NonUniqueResultException e2) {
            return new CacheBridgeStore.SingleOutcome.NonUnique(e2);
        }
    }
}
