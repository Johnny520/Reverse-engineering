package org.luckypray.dexkit.result;

import Yue.AbstractC5673;
import Yue.InterfaceC5122;
import Yue.InterfaceC6211;
import Yue.InterfaceC6489;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m2699d2 = {"<anonymous>", "", "", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class MethodData$paramNames$2 extends AbstractC5673 implements InterfaceC5122<List<? extends String>> {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ int $id;
    final /* synthetic */ MethodData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodData$paramNames$2(DexKitBridge dexKitBridge, MethodData methodData, int i, int i2) {
        super(0);
        this.$bridge = dexKitBridge;
        this.this$0 = methodData;
        this.$dexId = i;
        this.$id = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    /* JADX DEBUG: Return type fixed from 'java.util.List<java.lang.String>' to match base method */
    @Override // Yue.InterfaceC5122
    @InterfaceC6489
    public final List<? extends String> invoke() {
        return this.$bridge.getParameterNames$dexkit_android_release(this.this$0.getEncodeId(this.$dexId, this.$id));
    }
}
