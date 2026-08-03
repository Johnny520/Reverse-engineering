package org.luckypray.dexkit.result;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.AnnotationData;
import org.luckypray.dexkit.schema.AnnotationMeta;
import org.luckypray.dexkit.schema.AnnotationMetaArrayHolder;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class MethodData$annotations$2 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ int $id;
    final /* synthetic */ MethodData this$0;

    public MethodData$annotations$2(DexKitBridge r1, MethodData r2, int r3, int r4) {
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
    public final List<AnnotationData> invoke() {
        DexKitBridge r02 = this.$bridge;
        long r1 = MethodData.access$getEncodeId(this.this$0, this.$dexId, this.$id);
        byte[] r12 = DexKitBridge.Companion.access$nativeGetMethodAnnotations(DexKitBridge.Companion, DexKitBridge.access$getSafeToken(r02), r1);
        AnnotationMetaArrayHolder.Companion r2 = AnnotationMetaArrayHolder.Companion;
        ByteBuffer r13 = ByteBuffer.wrap(r12);
        AbstractC0307g.m702d(r13, "wrap(res)");
        AnnotationMetaArrayHolder r14 = r2.getRootAsAnnotationMetaArrayHolder(r13);
        ArrayList r22 = new ArrayList();
        int r3 = r14.getAnnotationsLength();
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L5;
        AnnotationData.Companion r5 = AnnotationData.f4415Companion;
        AnnotationMeta r6 = r14.annotations(r4);
        AbstractC0307g.m700b(r6);
        r22.add(r5.from(r02, r6));
        r4 = r4 + 1;
        goto L3
    L5:
        return r22;
    }
}
