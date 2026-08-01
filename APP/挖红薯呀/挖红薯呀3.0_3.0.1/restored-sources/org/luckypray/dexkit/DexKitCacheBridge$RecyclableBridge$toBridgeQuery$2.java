package org.luckypray.dexkit;

import org.luckypray.dexkit.DexKitCacheBridge;
import org.luckypray.dexkit.result.ClassData;
import p000.C0299hx;
import p000.InterfaceC0742sw;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class DexKitCacheBridge$RecyclableBridge$toBridgeQuery$2 extends C0299hx implements InterfaceC0742sw {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexKitCacheBridge$RecyclableBridge$toBridgeQuery$2(Object obj) {
        super(1, 0, DexKitCacheBridge.RecyclableBridge.BridgeClassBuilder.class, obj, "build", "build(Lorg/luckypray/dexkit/DexKitBridge;)Lorg/luckypray/dexkit/result/ClassData;");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p000.InterfaceC0742sw
    public final ClassData invoke(DexKitBridge dexKitBridge) {
        dexKitBridge.getClass();
        return ((DexKitCacheBridge.RecyclableBridge.BridgeClassBuilder) this.receiver).build(dexKitBridge);
    }
}
