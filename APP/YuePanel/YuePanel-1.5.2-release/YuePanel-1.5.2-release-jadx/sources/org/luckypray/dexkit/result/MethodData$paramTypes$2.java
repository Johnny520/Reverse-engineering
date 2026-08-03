package org.luckypray.dexkit.result;

import Yue.AbstractC5673;
import Yue.C3881;
import Yue.C3888;
import Yue.InterfaceC5122;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC7507;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m2699d2 = {"<anonymous>", "Lorg/luckypray/dexkit/result/ClassDataList;", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
@InterfaceC7507({"SMAP\nMethodData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MethodData.kt\norg/luckypray/dexkit/result/MethodData$paramTypes$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,348:1\n1547#2:349\n1618#2,3:350\n*S KotlinDebug\n*F\n+ 1 MethodData.kt\norg/luckypray/dexkit/result/MethodData$paramTypes$2\n*L\n179#1:349\n179#1:350,3\n*E\n"})
public final class MethodData$paramTypes$2 extends AbstractC5673 implements InterfaceC5122<ClassDataList> {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ MethodData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodData$paramTypes$2(DexKitBridge dexKitBridge, MethodData methodData, int i) {
        super(0);
        this.$bridge = dexKitBridge;
        this.this$0 = methodData;
        this.$dexId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // Yue.InterfaceC5122
    @InterfaceC6399
    public final ClassDataList invoke() {
        DexKitBridge dexKitBridge = this.$bridge;
        List list = this.this$0.paramTypeIds;
        MethodData methodData = this.this$0;
        int i = this.$dexId;
        ArrayList arrayList = new ArrayList(C3881.m10756(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(methodData.getEncodeId(i, ((Number) it.next()).intValue())));
        }
        return dexKitBridge.getTypeByIds$dexkit_android_release(C3888.m11063(arrayList));
    }
}
