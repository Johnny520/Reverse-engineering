package org.luckypray.dexkit;

import org.luckypray.dexkit.DexKitCacheBridge;
import org.luckypray.dexkit.cache.CacheBridgeRuntime;
import org.luckypray.dexkit.cache.CacheBridgeStore;
import org.luckypray.dexkit.exceptions.NoResultException;
import org.luckypray.dexkit.exceptions.NonUniqueResultException;
import org.luckypray.dexkit.wrap.ISerializable;
import p000.AbstractC0184d9;
import p000.InterfaceC0279j5;
import p000.InterfaceC0482u5;

/* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0378x95b222e4 extends AbstractC0184d9 implements InterfaceC0279j5 {
    final /* synthetic */ InterfaceC0482u5 $executor;
    final /* synthetic */ InterfaceC0482u5 $mapper;
    final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0378x95b222e4(DexKitCacheBridge.RecyclableBridge recyclableBridge, InterfaceC0482u5 interfaceC0482u5, InterfaceC0482u5 interfaceC0482u52) {
        super(0);
        this.this$0 = recyclableBridge;
        this.$executor = interfaceC0482u5;
        this.$mapper = interfaceC0482u52;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p000.InterfaceC0279j5
    public final CacheBridgeStore.SingleOutcome<R> invoke() {
        DexKitBridge dexKitBridge;
        boolean z;
        try {
            DexKitCacheBridge.RecyclableBridge recyclableBridge = this.this$0;
            InterfaceC0482u5 interfaceC0482u5 = this.$executor;
            InterfaceC0482u5 interfaceC0482u52 = this.$mapper;
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
                Object objInvoke2 = interfaceC0482u5.invoke(dexKitBridge);
                CacheBridgeStore.SingleOutcome noResult = objInvoke2 == null ? new CacheBridgeStore.SingleOutcome.NoResult(null, 1, null) : new CacheBridgeStore.SingleOutcome.Value((ISerializable) interfaceC0482u52.invoke(objInvoke2));
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
