package org.luckypray.dexkit.result;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import p000.AbstractC0184d9;
import p000.AbstractC0241h2;
import p000.AbstractC0276j2;
import p000.InterfaceC0279j5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ClassData$interfaces$2 extends AbstractC0184d9 implements InterfaceC0279j5 {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ ClassData this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassData$interfaces$2(DexKitBridge dexKitBridge, ClassData classData, int i) {
        super(0);
        this.$bridge = dexKitBridge;
        this.this$0 = classData;
        this.$dexId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p000.InterfaceC0279j5
    public final ClassDataList invoke() {
        DexKitBridge dexKitBridge = this.$bridge;
        List list = this.this$0.interfaceIds;
        ClassData classData = this.this$0;
        int i = this.$dexId;
        ArrayList arrayList = new ArrayList(AbstractC0276j2.m703i2(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(classData.getEncodeId(i, ((Number) it.next()).intValue())));
        }
        return dexKitBridge.getTypeByIds$dexkit_android_release(AbstractC0241h2.m470m2(arrayList));
    }
}
