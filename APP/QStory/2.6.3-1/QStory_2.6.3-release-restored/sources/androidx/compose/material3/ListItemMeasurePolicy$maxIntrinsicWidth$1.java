package androidx.compose.material3;

import androidx.compose.p001ui.layout.InterfaceC2533;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7383;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final /* synthetic */ class ListItemMeasurePolicy$maxIntrinsicWidth$1 extends FunctionReferenceImpl implements InterfaceC7383 {
    public static final ListItemMeasurePolicy$maxIntrinsicWidth$1 INSTANCE = new ListItemMeasurePolicy$maxIntrinsicWidth$1();

    public ListItemMeasurePolicy$maxIntrinsicWidth$1() {
        super(2, InterfaceC2533.class, "maxIntrinsicWidth", "maxIntrinsicWidth(I)I", 0);
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((InterfaceC2533) obj, ((Number) obj2).intValue());
    }

    public final Integer invoke(InterfaceC2533 interfaceC2533, int i) {
        return Integer.valueOf(interfaceC2533.mo3618(i));
    }
}
