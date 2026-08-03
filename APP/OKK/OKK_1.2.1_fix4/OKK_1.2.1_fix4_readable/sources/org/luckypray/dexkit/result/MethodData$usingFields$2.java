package org.luckypray.dexkit.result;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.UsingFieldData;
import org.luckypray.dexkit.schema.UsingFieldMeta;
import org.luckypray.dexkit.schema.UsingFieldMetaArrayHolder;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class MethodData$usingFields$2 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ int $id;
    final /* synthetic */ MethodData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodData$usingFields$2(DexKitBridge dexKitBridge, MethodData methodData, int i2, int i3) {
        super(0);
        this.$bridge = dexKitBridge;
        this.this$0 = methodData;
        this.$dexId = i2;
        this.$id = i3;
    }

    @Override // p029P0.InterfaceC0275a
    public final List<UsingFieldData> invoke() {
        DexKitBridge dexKitBridge = this.$bridge;
        byte[] bArrNativeGetMethodUsingFields = DexKitBridge.Companion.nativeGetMethodUsingFields(dexKitBridge.getSafeToken(), this.this$0.getEncodeId(this.$dexId, this.$id));
        UsingFieldMetaArrayHolder.Companion companion = UsingFieldMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetMethodUsingFields);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        UsingFieldMetaArrayHolder rootAsUsingFieldMetaArrayHolder = companion.getRootAsUsingFieldMetaArrayHolder(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int itemsLength = rootAsUsingFieldMetaArrayHolder.getItemsLength();
        for (int i2 = 0; i2 < itemsLength; i2++) {
            UsingFieldData.Companion companion2 = UsingFieldData.f4422Companion;
            UsingFieldMeta usingFieldMetaItems = rootAsUsingFieldMetaArrayHolder.items(i2);
            AbstractC0307g.m700b(usingFieldMetaItems);
            arrayList.add(companion2.from(dexKitBridge, usingFieldMetaItems));
        }
        return arrayList;
    }
}
