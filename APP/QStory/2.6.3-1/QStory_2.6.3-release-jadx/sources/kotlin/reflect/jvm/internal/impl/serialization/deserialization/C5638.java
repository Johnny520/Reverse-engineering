package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5638 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Modality m10101(ProtoBuf$Modality protoBuf$Modality) {
        int i = protoBuf$Modality == null ? -1 : AbstractC5639.f14361[protoBuf$Modality.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? Modality.FINAL : Modality.SEALED : Modality.ABSTRACT : Modality.OPEN : Modality.FINAL;
    }
}
