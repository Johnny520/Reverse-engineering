package org.luckypray.dexkit.result;

import java.nio.ByteBuffer;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.schema.ClassMeta;
import org.luckypray.dexkit.schema.ClassMetaArrayHolder;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class MethodData$returnType$2 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ MethodData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodData$returnType$2(DexKitBridge dexKitBridge, MethodData methodData, int i2) {
        super(0);
        this.$bridge = dexKitBridge;
        this.this$0 = methodData;
        this.$dexId = i2;
    }

    @Override // p029P0.InterfaceC0275a
    public final ClassData invoke() {
        DexKitBridge dexKitBridge = this.$bridge;
        MethodData methodData = this.this$0;
        byte[] bArrNativeGetClassByIds = DexKitBridge.Companion.nativeGetClassByIds(dexKitBridge.getSafeToken(), new long[]{methodData.getEncodeId(this.$dexId, methodData.returnTypeId)});
        ClassMetaArrayHolder.Companion companion = ClassMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetClassByIds);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        ClassMetaArrayHolder rootAsClassMetaArrayHolder = companion.getRootAsClassMetaArrayHolder(byteBufferWrap);
        ClassDataList classDataList = new ClassDataList();
        int classesLength = rootAsClassMetaArrayHolder.getClassesLength();
        for (int i2 = 0; i2 < classesLength; i2++) {
            ClassData.Companion companion2 = ClassData.f4419Companion;
            ClassMeta classMetaClasses = rootAsClassMetaArrayHolder.classes(i2);
            AbstractC0307g.m700b(classMetaClasses);
            classDataList.add(companion2.from(dexKitBridge, classMetaClasses));
        }
        return classDataList.firstOrNull();
    }
}
