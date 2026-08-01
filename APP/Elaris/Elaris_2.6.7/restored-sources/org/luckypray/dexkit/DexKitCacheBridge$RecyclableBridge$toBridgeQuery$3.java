package org.luckypray.dexkit;

import org.luckypray.dexkit.DexKitCacheBridge;
import org.luckypray.dexkit.result.FieldData;
import p000.AbstractC0245h6;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class DexKitCacheBridge$RecyclableBridge$toBridgeQuery$3 extends AbstractC0245h6 implements InterfaceC0482u5 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexKitCacheBridge$RecyclableBridge$toBridgeQuery$3(Object obj) {
        super(1, obj, DexKitCacheBridge.RecyclableBridge.BridgeFieldBuilder.class, "build", "build(Lorg/luckypray/dexkit/DexKitBridge;)Lorg/luckypray/dexkit/result/FieldData;");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p000.InterfaceC0482u5
    public final FieldData invoke(DexKitBridge dexKitBridge) {
        dexKitBridge.getClass();
        return ((DexKitCacheBridge.RecyclableBridge.BridgeFieldBuilder) this.receiver).build(dexKitBridge);
    }
}
