package org.luckypray.dexkit.result;

import org.luckypray.dexkit.DexKitBridge;
import p000.AbstractC0184d9;
import p000.InterfaceC0279j5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class FieldData$readers$2 extends AbstractC0184d9 implements InterfaceC0279j5 {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ int $id;
    final /* synthetic */ FieldData this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldData$readers$2(DexKitBridge dexKitBridge, FieldData fieldData, int i, int i2) {
        super(0);
        this.$bridge = dexKitBridge;
        this.this$0 = fieldData;
        this.$dexId = i;
        this.$id = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p000.InterfaceC0279j5
    public final MethodDataList invoke() {
        return this.$bridge.readFieldMethods$dexkit_android_release(this.this$0.getEncodeId(this.$dexId, this.$id));
    }
}
