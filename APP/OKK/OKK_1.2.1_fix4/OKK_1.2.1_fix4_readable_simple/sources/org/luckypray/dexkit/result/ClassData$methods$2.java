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

    public ClassData$methods$2(DexKitBridge r1, ClassData r2, int r3) {
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
    public final MethodDataList invoke() {
        DexKitBridge r02 = this.$bridge;
        List r1 = ClassData.access$getMethodIds$p(this.this$0);
        ClassData r2 = this.this$0;
        int r3 = this.$dexId;
        ArrayList r4 = new ArrayList(AbstractC0183n.m559k0(r1, 10));
        Iterator r12 = r1.iterator();
    L4:
        if (r12.hasNext() == false) goto L6;
        r4.add(Long.valueOf(ClassData.access$getEncodeId(r2, r3, ((Number) r12.next()).intValue())));
        goto L4
    L6:
        long[] r13 = AbstractC0181l.m554z0(r4);
        byte[] r14 = DexKitBridge.Companion.access$nativeGetMethodByIds(DexKitBridge.Companion, DexKitBridge.access$getSafeToken(r02), r13);
        MethodMetaArrayHolder.Companion r22 = MethodMetaArrayHolder.Companion;
        ByteBuffer r15 = ByteBuffer.wrap(r14);
        AbstractC0307g.m702d(r15, "wrap(res)");
        MethodMetaArrayHolder r16 = r22.getRootAsMethodMetaArrayHolder(r15);
        MethodDataList r23 = new MethodDataList();
        int r32 = r16.getMethodsLength();
        int r42 = 0;
    L7:
        if (r42 >= r32) goto L9;
        MethodData.Companion r5 = MethodData.f4421Companion;
        MethodMeta r6 = r16.methods(r42);
        AbstractC0307g.m700b(r6);
        r23.add(r5.from(r02, r6));
        r42 = r42 + 1;
        goto L7
    L9:
        return r23;
    }
}
