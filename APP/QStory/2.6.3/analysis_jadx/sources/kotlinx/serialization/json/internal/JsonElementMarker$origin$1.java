package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6554;
import p091.InterfaceC7191;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements InterfaceC6554 {
    public JsonElementMarker$origin$1(Object obj) {
        super(2, obj, C5510.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    public final Boolean invoke(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        C5510 c5510 = (C5510) this.receiver;
        c5510.getClass();
        boolean z = !interfaceC7191.mo12385(i) && interfaceC7191.mo12383(i).mo12410();
        c5510.f15235 = z;
        return Boolean.valueOf(z);
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((InterfaceC7191) obj, ((Number) obj2).intValue());
    }
}
