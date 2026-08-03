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
public final class MethodData$invokes$2 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ int $id;
    final /* synthetic */ MethodData this$0;

    public MethodData$invokes$2(DexKitBridge r1, MethodData r2, int r3, int r4) {
        this.$bridge = r1;
        this.this$0 = r2;
        this.$dexId = r3;
        this.$id = r4;
        super(0);
    }

    @Override // p029P0.InterfaceC0275a
    public /* bridge */ /* synthetic */ Object invoke() {
        return invoke();
    }

    @Override // p029P0.InterfaceC0275a
    public final MethodDataList invoke() {
        DexKitBridge r02 = this.$bridge;
        long r1 = MethodData.access$getEncodeId(this.this$0, this.$dexId, this.$id);
        byte[] r12 = DexKitBridge.Companion.access$nativeGetInvokeMethods(DexKitBridge.Companion, DexKitBridge.access$getSafeToken(r02), r1);
        MethodMetaArrayHolder.Companion r2 = MethodMetaArrayHolder.Companion;
        ByteBuffer r13 = ByteBuffer.wrap(r12);
        AbstractC0307g.m702d(r13, "wrap(res)");
        MethodMetaArrayHolder r14 = r2.getRootAsMethodMetaArrayHolder(r13);
        MethodDataList r22 = new MethodDataList();
        int r3 = r14.getMethodsLength();
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L5;
        MethodData.Companion r5 = MethodData.f4421Companion;
        MethodMeta r6 = r14.methods(r4);
        AbstractC0307g.m700b(r6);
        r22.add(r5.from(r02, r6));
        r4 = r4 + 1;
        goto L3
    L5:
        return r22;
    }
}
