package kotlinx.serialization.protobuf.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p052.InterfaceC6553;
import p091.C7197;
import p091.InterfaceC7190;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class ProtobufDecoder$elementMarker$1 extends FunctionReferenceImpl implements InterfaceC6553 {
    public ProtobufDecoder$elementMarker$1(Object obj) {
        super(2, obj, C5520.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    public final Boolean invoke(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        C5520 c5520 = (C5520) this.receiver;
        c5520.getClass();
        boolean z = false;
        if (!interfaceC7190.mo12358(i)) {
            InterfaceC7190 interfaceC7190Mo12356 = interfaceC7190.mo12356(i);
            AbstractC4921 kind = interfaceC7190Mo12356.getKind();
            if (AbstractC4394.m8917(kind, C7197.f19215) || AbstractC4394.m8917(kind, C7197.f19212)) {
                c5520.f15260 = false;
            } else if (interfaceC7190Mo12356.mo12383()) {
                c5520.f15260 = true;
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((InterfaceC7190) obj, ((Number) obj2).intValue());
    }
}
