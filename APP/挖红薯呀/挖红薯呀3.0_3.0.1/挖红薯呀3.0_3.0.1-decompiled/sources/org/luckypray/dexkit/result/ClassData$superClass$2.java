package org.luckypray.dexkit.result;

import org.luckypray.dexkit.DexKitBridge;
import p000.InterfaceC0298hw;
import p000.c50;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ClassData$superClass$2 extends c50 implements InterfaceC0298hw {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ ClassData this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassData$superClass$2(ClassData classData, DexKitBridge dexKitBridge, int i) {
        super(0);
        this.this$0 = classData;
        this.$bridge = dexKitBridge;
        this.$dexId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p000.InterfaceC0298hw
    public final ClassData invoke() {
        Integer num = this.this$0.superClassId;
        if (num != null) {
            return this.$bridge.getTypeByIds$dexkit_android_release(new long[]{this.this$0.getEncodeId(this.$dexId, num.intValue())}).firstOrNull();
        }
        return null;
    }
}
