package org.luckypray.dexkit.result;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.schema.ClassMeta;
import org.luckypray.dexkit.schema.ClassMetaArrayHolder;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class MethodData$paramTypes$2 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ MethodData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodData$paramTypes$2(DexKitBridge dexKitBridge, MethodData methodData, int i2) {
        super(0);
        this.$bridge = dexKitBridge;
        this.this$0 = methodData;
        this.$dexId = i2;
    }

    @Override // p029P0.InterfaceC0275a
    public final ClassDataList invoke() {
        DexKitBridge dexKitBridge = this.$bridge;
        List list = this.this$0.paramTypeIds;
        MethodData methodData = this.this$0;
        int i2 = this.$dexId;
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(methodData.getEncodeId(i2, ((Number) it.next()).intValue())));
        }
        byte[] bArrNativeGetClassByIds = DexKitBridge.Companion.nativeGetClassByIds(dexKitBridge.getSafeToken(), AbstractC0181l.m554z0(arrayList));
        ClassMetaArrayHolder.Companion companion = ClassMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetClassByIds);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        ClassMetaArrayHolder rootAsClassMetaArrayHolder = companion.getRootAsClassMetaArrayHolder(byteBufferWrap);
        ClassDataList classDataList = new ClassDataList();
        int classesLength = rootAsClassMetaArrayHolder.getClassesLength();
        for (int i3 = 0; i3 < classesLength; i3++) {
            ClassData.Companion companion2 = ClassData.f4419Companion;
            ClassMeta classMetaClasses = rootAsClassMetaArrayHolder.classes(i3);
            AbstractC0307g.m700b(classMetaClasses);
            classDataList.add(companion2.from(dexKitBridge, classMetaClasses));
        }
        return classDataList;
    }
}
