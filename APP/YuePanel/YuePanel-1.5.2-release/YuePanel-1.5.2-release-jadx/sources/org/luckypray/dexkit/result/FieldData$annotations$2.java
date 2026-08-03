package org.luckypray.dexkit.result;

import Yue.AbstractC5673;
import Yue.InterfaceC5122;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m2699d2 = {"<anonymous>", "", "Lorg/luckypray/dexkit/result/AnnotationData;", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class FieldData$annotations$2 extends AbstractC5673 implements InterfaceC5122<List<? extends AnnotationData>> {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ int $id;
    final /* synthetic */ FieldData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldData$annotations$2(DexKitBridge dexKitBridge, FieldData fieldData, int i, int i2) {
        super(0);
        this.$bridge = dexKitBridge;
        this.this$0 = fieldData;
        this.$dexId = i;
        this.$id = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    /* JADX DEBUG: Return type fixed from 'java.util.List<org.luckypray.dexkit.result.AnnotationData>' to match base method */
    @Override // Yue.InterfaceC5122
    @InterfaceC6399
    public final List<? extends AnnotationData> invoke() {
        return this.$bridge.getFieldAnnotations$dexkit_android_release(this.this$0.getEncodeId(this.$dexId, this.$id));
    }
}
