package org.luckypray.dexkit.result;

import java.nio.ByteBuffer;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodData;
import org.luckypray.dexkit.schema.MethodMeta;
import org.luckypray.dexkit.schema.MethodMetaArrayHolder;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class FieldData$writers$2 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ int $id;
    final /* synthetic */ FieldData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldData$writers$2(DexKitBridge dexKitBridge, FieldData fieldData, int i2, int i3) {
        super(0);
        this.$bridge = dexKitBridge;
        this.this$0 = fieldData;
        this.$dexId = i2;
        this.$id = i3;
    }

    @Override // p029P0.InterfaceC0275a
    public final MethodDataList invoke() {
        DexKitBridge dexKitBridge = this.$bridge;
        byte[] bArrNativeFieldPutMethods = DexKitBridge.Companion.nativeFieldPutMethods(dexKitBridge.getSafeToken(), this.this$0.getEncodeId(this.$dexId, this.$id));
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFieldPutMethods);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i2 = 0; i2 < methodsLength; i2++) {
            MethodData.Companion companion2 = MethodData.f4421Companion;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i2);
            AbstractC0307g.m700b(methodMetaMethods);
            methodDataList.add(companion2.from(dexKitBridge, methodMetaMethods));
        }
        return methodDataList;
    }
}
