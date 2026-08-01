package androidx.compose.ui.window;

import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.C5175;
import kotlin.collections.AbstractC4338;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2092 implements InterfaceC1658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ LayoutDirection f6198;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C2097 f6199;

    public C2092(C2097 c2097, LayoutDirection layoutDirection) {
        this.f6199 = c2097;
        this.f6198 = layoutDirection;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1105(InterfaceC1653 interfaceC1653, List list, long j) {
        this.f6199.setParentLayoutDirection(this.f6198);
        return interfaceC1653.mo1485(0, 0, AbstractC4338.m8781(), new InterfaceC6557() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1$1
            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5175.f14739;
            }

            public final void invoke(AbstractC1708 abstractC1708) {
            }
        });
    }
}
