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
public final class ClassData$superClass$2 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ ClassData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassData$superClass$2(ClassData classData, DexKitBridge dexKitBridge, int i2) {
        super(0);
        this.this$0 = classData;
        this.$bridge = dexKitBridge;
        this.$dexId = i2;
    }

    @Override // p029P0.InterfaceC0275a
    public final ClassData invoke() {
        Integer num = this.this$0.superClassId;
        if (num == null) {
            return null;
        }
        DexKitBridge dexKitBridge = this.$bridge;
        byte[] bArrNativeGetClassByIds = DexKitBridge.Companion.nativeGetClassByIds(dexKitBridge.getSafeToken(), new long[]{this.this$0.getEncodeId(this.$dexId, num.intValue())});
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
