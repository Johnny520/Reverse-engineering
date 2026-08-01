package androidx.compose.material3;

import androidx.compose.ui.layout.InterfaceC1698;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6554;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ListItemMeasurePolicy$minIntrinsicHeight$1 extends FunctionReferenceImpl implements InterfaceC6554 {
    public static final ListItemMeasurePolicy$minIntrinsicHeight$1 INSTANCE = new ListItemMeasurePolicy$minIntrinsicHeight$1();

    public ListItemMeasurePolicy$minIntrinsicHeight$1() {
        super(2, InterfaceC1698.class, "minIntrinsicHeight", "minIntrinsicHeight(I)I", 0);
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((InterfaceC1698) obj, ((Number) obj2).intValue());
    }

    public final Integer invoke(InterfaceC1698 interfaceC1698, int i) {
        return Integer.valueOf(interfaceC1698.mo3054(i));
    }
}
