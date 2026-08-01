package kotlinx.serialization.protobuf.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7383;
import p107.C8027;
import p107.InterfaceC8020;
import p269.AbstractC9019;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 48)
final /* synthetic */ class ProtobufDecoder$elementMarker$1 extends FunctionReferenceImpl implements InterfaceC7383 {
    public ProtobufDecoder$elementMarker$1(Object obj) {
        super(2, obj, C6353.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    public final Boolean invoke(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        C6353 c6353 = (C6353) this.receiver;
        c6353.getClass();
        boolean z = false;
        if (!interfaceC8020.mo12944(i)) {
            InterfaceC8020 interfaceC8020Mo12942 = interfaceC8020.mo12942(i);
            AbstractC9019 kind = interfaceC8020Mo12942.getKind();
            if (AbstractC5227.m9466(kind, C8027.f19553) || AbstractC5227.m9466(kind, C8027.f19555)) {
                c6353.f15605 = false;
            } else if (interfaceC8020Mo12942.mo12969()) {
                c6353.f15605 = true;
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((InterfaceC8020) obj, ((Number) obj2).intValue());
    }
}
