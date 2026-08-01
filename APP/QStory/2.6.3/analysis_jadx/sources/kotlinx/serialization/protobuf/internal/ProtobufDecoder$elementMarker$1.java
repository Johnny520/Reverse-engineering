package kotlinx.serialization.protobuf.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6554;
import p091.C7198;
import p091.InterfaceC7191;
import p253.AbstractC8190;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class ProtobufDecoder$elementMarker$1 extends FunctionReferenceImpl implements InterfaceC6554 {
    public ProtobufDecoder$elementMarker$1(Object obj) {
        super(2, obj, C5521.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    public final Boolean invoke(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        C5521 c5521 = (C5521) this.receiver;
        c5521.getClass();
        boolean z = false;
        if (!interfaceC7191.mo12385(i)) {
            InterfaceC7191 interfaceC7191Mo12383 = interfaceC7191.mo12383(i);
            AbstractC8190 kind = interfaceC7191Mo12383.getKind();
            if (AbstractC4395.m8907(kind, C7198.f19208) || AbstractC4395.m8907(kind, C7198.f19210)) {
                c5521.f15260 = false;
            } else if (interfaceC7191Mo12383.mo12410()) {
                c5521.f15260 = true;
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((InterfaceC7191) obj, ((Number) obj2).intValue());
    }
}
