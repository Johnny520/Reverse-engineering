package org.luckypray.dexkit.result;

import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import p000.InterfaceC0298hw;
import p000.c50;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class MethodData$usingStrings$2 extends c50 implements InterfaceC0298hw {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ int $id;
    final /* synthetic */ MethodData this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodData$usingStrings$2(DexKitBridge dexKitBridge, MethodData methodData, int i, int i2) {
        super(0);
        this.$bridge = dexKitBridge;
        this.this$0 = methodData;
        this.$dexId = i;
        this.$id = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p000.InterfaceC0298hw
    public final List<String> invoke() {
        return this.$bridge.getMethodUsingStrings$dexkit_android_release(this.this$0.getEncodeId(this.$dexId, this.$id));
    }
}
