package org.luckypray.dexkit.result;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.AnnotationData;
import org.luckypray.dexkit.schema.AnnotationMeta;
import org.luckypray.dexkit.schema.AnnotationMetaArrayHolder;
import org.luckypray.dexkit.schema.ParametersAnnotationMetaArrayHoler;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class MethodData$paramAnnotations$2 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ int $id;
    final /* synthetic */ MethodData this$0;

    public MethodData$paramAnnotations$2(DexKitBridge r1, MethodData r2, int r3, int r4) {
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
    public final List<List<AnnotationData>> invoke() {
        DexKitBridge r02 = this.$bridge;
        byte[] r1 = DexKitBridge.Companion.access$nativeGetParameterAnnotations(DexKitBridge.Companion, DexKitBridge.access$getSafeToken(r02), MethodData.access$getEncodeId(this.this$0, this.$dexId, this.$id));
        ParametersAnnotationMetaArrayHoler.Companion r2 = ParametersAnnotationMetaArrayHoler.Companion;
        ByteBuffer r12 = ByteBuffer.wrap(r1);
        AbstractC0307g.m702d(r12, "wrap(res)");
        ParametersAnnotationMetaArrayHoler r13 = r2.getRootAsParametersAnnotationMetaArrayHoler(r12);
        ArrayList r22 = new ArrayList();
        int r3 = r13.getAnnotationsArrayLength();
        int r5 = 0;
    L3:
        if (r5 >= r3) goto L8;
        AnnotationMetaArrayHolder r6 = r13.annotationsArray(r5);
        AbstractC0307g.m700b(r6);
        ArrayList r7 = new ArrayList();
        int r8 = r6.getAnnotationsLength();
        int r9 = 0;
    L5:
        if (r9 >= r8) goto L7;
        AnnotationData.Companion r10 = AnnotationData.f4415Companion;
        AnnotationMeta r11 = r6.annotations(r9);
        AbstractC0307g.m700b(r11);
        r7.add(r10.from(r02, r11));
        r9 = r9 + 1;
        goto L5
    L7:
        r22.add(r7);
        r5 = r5 + 1;
        goto L3
    L8:
        return r22;
    }
}
