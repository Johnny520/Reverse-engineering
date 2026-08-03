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

    public ClassData$superClass$2(ClassData r1, DexKitBridge r2, int r3) {
        this.this$0 = r1;
        this.$bridge = r2;
        this.$dexId = r3;
        super(0);
    }

    @Override // p029P0.InterfaceC0275a
    public /* bridge */ /* synthetic */ Object invoke() {
        return invoke();
    }

    @Override // p029P0.InterfaceC0275a
    public final ClassData invoke() {
        int r02 = 0;
        Integer r2 = ClassData.access$getSuperClassId$p(this.this$0);
        if (r2 == null) goto L8;
        DexKitBridge r3 = this.$bridge;
        byte[] r22 = DexKitBridge.Companion.access$nativeGetClassByIds(DexKitBridge.Companion, DexKitBridge.access$getSafeToken(r3), new long[]{ClassData.access$getEncodeId(this.this$0, this.$dexId, r2.intValue())});
        ClassMetaArrayHolder.Companion r4 = ClassMetaArrayHolder.Companion;
        ByteBuffer r23 = ByteBuffer.wrap(r22);
        AbstractC0307g.m702d(r23, "wrap(res)");
        ClassMetaArrayHolder r24 = r4.getRootAsClassMetaArrayHolder(r23);
        ClassDataList r42 = new ClassDataList();
        int r5 = r24.getClassesLength();
    L5:
        if (r02 >= r5) goto L11;
        ClassData.Companion r6 = ClassData.f4419Companion;
        ClassMeta r7 = r24.classes(r02);
        AbstractC0307g.m700b(r7);
        r42.add(r6.from(r3, r7));
        r02 = r02 + 1;
        goto L5
    L11:
        return r42.firstOrNull();
    L8:
        return null;
    }
}
