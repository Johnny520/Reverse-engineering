package org.luckypray.dexkit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitCacheBridge;
import org.luckypray.dexkit.cache.CacheBridgeRuntime;
import p000.AbstractC1001ze;
import p000.InterfaceC0298hw;
import p000.InterfaceC0742sw;
import p000.c50;

/* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0570x87bd6f8e extends c50 implements InterfaceC0298hw {
    final /* synthetic */ InterfaceC0742sw $executor;
    final /* synthetic */ InterfaceC0742sw $mapper;
    final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0570x87bd6f8e(DexKitCacheBridge.RecyclableBridge recyclableBridge, InterfaceC0742sw interfaceC0742sw, InterfaceC0742sw interfaceC0742sw2) {
        super(0);
        this.this$0 = recyclableBridge;
        this.$executor = interfaceC0742sw;
        this.$mapper = interfaceC0742sw2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p000.InterfaceC0298hw
    public final List<R> invoke() {
        DexKitBridge dexKitBridge;
        boolean z;
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
            Iterable iterable = (Iterable) interfaceC0742sw.invoke(dexKitBridge);
            ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(iterable));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(interfaceC0742sw2.invoke(it.next()));
            }
            runtime.endUse();
            return arrayList;
        } catch (Throwable th) {
            runtime.endUse();
            throw th;
        }
    }
}
