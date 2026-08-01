package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6553;
import p091.InterfaceC7190;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements InterfaceC6553 {
    public JsonElementMarker$origin$1(Object obj) {
        super(2, obj, C5509.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    public final Boolean invoke(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        C5509 c5509 = (C5509) this.receiver;
        c5509.getClass();
        boolean z = !interfaceC7190.mo12358(i) && interfaceC7190.mo12356(i).mo12383();
        c5509.f15235 = z;
        return Boolean.valueOf(z);
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((InterfaceC7190) obj, ((Number) obj2).intValue());
    }
}
