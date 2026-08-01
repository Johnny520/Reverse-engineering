package org.luckypray.dexkit.result;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import p000.AbstractC0960ye;
import p000.AbstractC1001ze;
import p000.InterfaceC0298hw;
import p000.c50;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class MethodData$paramTypes$2 extends c50 implements InterfaceC0298hw {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ MethodData this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodData$paramTypes$2(DexKitBridge dexKitBridge, MethodData methodData, int i) {
        super(0);
        this.$bridge = dexKitBridge;
        this.this$0 = methodData;
        this.$dexId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p000.InterfaceC0298hw
    public final ClassDataList invoke() {
        DexKitBridge dexKitBridge = this.$bridge;
        List list = this.this$0.paramTypeIds;
        MethodData methodData = this.this$0;
        int i = this.$dexId;
        ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(methodData.getEncodeId(i, ((Number) it.next()).intValue())));
        }
        return dexKitBridge.getTypeByIds$dexkit_android_release(AbstractC0960ye.m5254X(arrayList));
    }
}
