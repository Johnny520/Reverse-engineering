package org.luckypray.dexkit.result;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodData;
import org.luckypray.dexkit.schema.MethodMeta;
import org.luckypray.dexkit.schema.MethodMetaArrayHolder;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class ClassData$methods$2 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ ClassData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassData$methods$2(DexKitBridge dexKitBridge, ClassData classData, int i2) {
        super(0);
        this.$bridge = dexKitBridge;
        this.this$0 = classData;
        this.$dexId = i2;
    }

    @Override // p029P0.InterfaceC0275a
    public final MethodDataList invoke() {
        DexKitBridge dexKitBridge = this.$bridge;
        List list = this.this$0.methodIds;
        ClassData classData = this.this$0;
        int i2 = this.$dexId;
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(classData.getEncodeId(i2, ((Number) it.next()).intValue())));
        }
        byte[] bArrNativeGetMethodByIds = DexKitBridge.Companion.nativeGetMethodByIds(dexKitBridge.getSafeToken(), AbstractC0181l.m554z0(arrayList));
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetMethodByIds);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i3 = 0; i3 < methodsLength; i3++) {
            MethodData.Companion companion2 = MethodData.f4421Companion;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i3);
            AbstractC0307g.m700b(methodMetaMethods);
            methodDataList.add(companion2.from(dexKitBridge, methodMetaMethods));
        }
        return methodDataList;
    }
}
