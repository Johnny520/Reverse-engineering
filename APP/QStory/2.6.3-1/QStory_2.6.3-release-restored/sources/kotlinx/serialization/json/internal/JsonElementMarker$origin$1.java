package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7383;
import p107.InterfaceC8020;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 48)
final /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements InterfaceC7383 {
    public JsonElementMarker$origin$1(Object obj) {
        super(2, obj, C6342.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    public final Boolean invoke(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        C6342 c6342 = (C6342) this.receiver;
        c6342.getClass();
        boolean z = !interfaceC8020.mo12944(i) && interfaceC8020.mo12942(i).mo12969();
        c6342.f15580 = z;
        return Boolean.valueOf(z);
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((InterfaceC8020) obj, ((Number) obj2).intValue());
    }
}
