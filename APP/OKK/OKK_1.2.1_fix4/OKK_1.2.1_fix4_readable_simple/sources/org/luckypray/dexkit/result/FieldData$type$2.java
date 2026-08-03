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
public final class FieldData$type$2 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ FieldData this$0;

    public FieldData$type$2(DexKitBridge r1, FieldData r2, int r3) {
        this.$bridge = r1;
        this.this$0 = r2;
        this.$dexId = r3;
        super(0);
    }

    @Override // p029P0.InterfaceC0275a
    public /* bridge */ /* synthetic */ Object invoke() {
        return invoke();
    }

    @Override // p029P0.InterfaceC0275a
    public final ClassData invoke() {
        DexKitBridge r02 = this.$bridge;
        FieldData r1 = this.this$0;
        int r5 = 0;
        byte[] r12 = DexKitBridge.Companion.access$nativeGetClassByIds(DexKitBridge.Companion, DexKitBridge.access$getSafeToken(r02), new long[]{FieldData.access$getEncodeId(r1, this.$dexId, FieldData.access$getTypeId$p(r1))});
        ClassMetaArrayHolder.Companion r2 = ClassMetaArrayHolder.Companion;
        ByteBuffer r13 = ByteBuffer.wrap(r12);
        AbstractC0307g.m702d(r13, "wrap(res)");
        ClassMetaArrayHolder r14 = r2.getRootAsClassMetaArrayHolder(r13);
        ClassDataList r22 = new ClassDataList();
        int r4 = r14.getClassesLength();
    L3:
        if (r5 >= r4) goto L6;
        ClassData.Companion r6 = ClassData.f4419Companion;
        ClassMeta r7 = r14.classes(r5);
        AbstractC0307g.m700b(r7);
        r22.add(r6.from(r02, r7));
        r5 = r5 + 1;
        goto L3
    L6:
        return r22.first();
    }
}
