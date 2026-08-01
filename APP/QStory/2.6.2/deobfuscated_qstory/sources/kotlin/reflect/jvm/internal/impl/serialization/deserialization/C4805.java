package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4805 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Modality m9552(ProtoBuf$Modality protoBuf$Modality) {
        int i = protoBuf$Modality == null ? -1 : AbstractC4806.f14012[protoBuf$Modality.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? Modality.FINAL : Modality.SEALED : Modality.ABSTRACT : Modality.OPEN : Modality.FINAL;
    }
}
