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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodData$paramAnnotations$2(DexKitBridge dexKitBridge, MethodData methodData, int i2, int i3) {
        super(0);
        this.$bridge = dexKitBridge;
        this.this$0 = methodData;
        this.$dexId = i2;
        this.$id = i3;
    }

    @Override // p029P0.InterfaceC0275a
    public final List<List<AnnotationData>> invoke() {
        DexKitBridge dexKitBridge = this.$bridge;
        byte[] bArrNativeGetParameterAnnotations = DexKitBridge.Companion.nativeGetParameterAnnotations(dexKitBridge.getSafeToken(), this.this$0.getEncodeId(this.$dexId, this.$id));
        ParametersAnnotationMetaArrayHoler.Companion companion = ParametersAnnotationMetaArrayHoler.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetParameterAnnotations);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        ParametersAnnotationMetaArrayHoler rootAsParametersAnnotationMetaArrayHoler = companion.getRootAsParametersAnnotationMetaArrayHoler(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int annotationsArrayLength = rootAsParametersAnnotationMetaArrayHoler.getAnnotationsArrayLength();
        for (int i2 = 0; i2 < annotationsArrayLength; i2++) {
            AnnotationMetaArrayHolder annotationMetaArrayHolderAnnotationsArray = rootAsParametersAnnotationMetaArrayHoler.annotationsArray(i2);
            AbstractC0307g.m700b(annotationMetaArrayHolderAnnotationsArray);
            ArrayList arrayList2 = new ArrayList();
            int annotationsLength = annotationMetaArrayHolderAnnotationsArray.getAnnotationsLength();
            for (int i3 = 0; i3 < annotationsLength; i3++) {
                AnnotationData.Companion companion2 = AnnotationData.f4415Companion;
                AnnotationMeta annotationMetaAnnotations = annotationMetaArrayHolderAnnotationsArray.annotations(i3);
                AbstractC0307g.m700b(annotationMetaAnnotations);
                arrayList2.add(companion2.from(dexKitBridge, annotationMetaAnnotations));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }
}
