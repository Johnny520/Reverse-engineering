package org.luckypray.dexkit;

import Yue.C5153;
import Yue.C5499;
import Yue.InterfaceC5124;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import org.luckypray.dexkit.DexKitCacheBridge;
import org.luckypray.dexkit.result.ClassData;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
public /* synthetic */ class DexKitCacheBridge$RecyclableBridge$toBridgeQuery$2 extends C5153 implements InterfaceC5124<DexKitBridge, ClassData> {
    public DexKitCacheBridge$RecyclableBridge$toBridgeQuery$2(Object obj) {
        super(1, obj, DexKitCacheBridge.RecyclableBridge.BridgeClassBuilder.class, "build", "build(Lorg/luckypray/dexkit/DexKitBridge;)Lorg/luckypray/dexkit/result/ClassData;", 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // Yue.InterfaceC5124
    @InterfaceC6399
    public final ClassData invoke(@InterfaceC6399 DexKitBridge dexKitBridge) {
        C5499.m17103(dexKitBridge, "p0");
        return ((DexKitCacheBridge.RecyclableBridge.BridgeClassBuilder) this.receiver).build(dexKitBridge);
    }
}
