package androidx.compose.p001ui.window;

import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.unit.LayoutDirection;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2925 implements InterfaceC2493 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ LayoutDirection f6544;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C2930 f6545;

    public C2925(C2930 c2930, LayoutDirection layoutDirection) {
        this.f6545 = c2930;
        this.f6544 = layoutDirection;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC2492 mo1666(InterfaceC2488 interfaceC2488, List list, long j) {
        this.f6545.setParentLayoutDirection(this.f6544);
        return interfaceC2488.mo2055(0, 0, AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1$1
            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC2543) obj);
                return C6008.f15084;
            }

            public final void invoke(AbstractC2543 abstractC2543) {
            }
        });
    }
}
