package org.luckypray.dexkit.result;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.FieldData;
import org.luckypray.dexkit.schema.FieldMeta;
import org.luckypray.dexkit.schema.FieldMetaArrayHolder;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class ClassData$fields$2 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ ClassData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassData$fields$2(DexKitBridge dexKitBridge, ClassData classData, int i2) {
        super(0);
        this.$bridge = dexKitBridge;
        this.this$0 = classData;
        this.$dexId = i2;
    }

    @Override // p029P0.InterfaceC0275a
    public final FieldDataList invoke() {
        DexKitBridge dexKitBridge = this.$bridge;
        List list = this.this$0.fieldIds;
        ClassData classData = this.this$0;
        int i2 = this.$dexId;
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(classData.getEncodeId(i2, ((Number) it.next()).intValue())));
        }
        byte[] bArrNativeGetFieldByIds = DexKitBridge.Companion.nativeGetFieldByIds(dexKitBridge.getSafeToken(), AbstractC0181l.m554z0(arrayList));
        FieldMetaArrayHolder.Companion companion = FieldMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetFieldByIds);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        FieldMetaArrayHolder rootAsFieldMetaArrayHolder = companion.getRootAsFieldMetaArrayHolder(byteBufferWrap);
        FieldDataList fieldDataList = new FieldDataList();
        int fieldsLength = rootAsFieldMetaArrayHolder.getFieldsLength();
        for (int i3 = 0; i3 < fieldsLength; i3++) {
            FieldData.Companion companion2 = FieldData.f4420Companion;
            FieldMeta fieldMetaFields = rootAsFieldMetaArrayHolder.fields(i3);
            AbstractC0307g.m700b(fieldMetaFields);
            fieldDataList.add(companion2.from(dexKitBridge, fieldMetaFields));
        }
        return fieldDataList;
    }
}
