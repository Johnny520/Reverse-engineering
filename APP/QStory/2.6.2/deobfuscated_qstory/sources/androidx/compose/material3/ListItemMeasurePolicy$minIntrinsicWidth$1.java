package androidx.compose.material3;

import androidx.compose.ui.layout.InterfaceC1698;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6553;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ListItemMeasurePolicy$minIntrinsicWidth$1 extends FunctionReferenceImpl implements InterfaceC6553 {
    public static final ListItemMeasurePolicy$minIntrinsicWidth$1 INSTANCE = new ListItemMeasurePolicy$minIntrinsicWidth$1();

    public ListItemMeasurePolicy$minIntrinsicWidth$1() {
        super(2, InterfaceC1698.class, "minIntrinsicWidth", "minIntrinsicWidth(I)I", 0);
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((InterfaceC1698) obj, ((Number) obj2).intValue());
    }

    public final Integer invoke(InterfaceC1698 interfaceC1698, int i) {
        return Integer.valueOf(interfaceC1698.mo3049(i));
    }
}
