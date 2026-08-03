package org.luckypray.dexkit.result;

import Yue.AbstractC5673;
import Yue.InterfaceC5122;
import Yue.InterfaceC6211;
import Yue.InterfaceC6489;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m2699d2 = {"<anonymous>", "Lorg/luckypray/dexkit/result/ClassData;", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class ClassData$superClass$2 extends AbstractC5673 implements InterfaceC5122<ClassData> {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ ClassData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassData$superClass$2(ClassData classData, DexKitBridge dexKitBridge, int i) {
        super(0);
        this.this$0 = classData;
        this.$bridge = dexKitBridge;
        this.$dexId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // Yue.InterfaceC5122
    @InterfaceC6489
    public final ClassData invoke() {
        Integer num = this.this$0.superClassId;
        if (num != null) {
            return this.$bridge.getTypeByIds$dexkit_android_release(new long[]{this.this$0.getEncodeId(this.$dexId, num.intValue())}).firstOrNull();
        }
        return null;
    }
}
