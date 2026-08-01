package androidx.compose.ui.window;

import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.C5176;
import kotlin.collections.AbstractC4339;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2092 implements InterfaceC1658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ LayoutDirection f6199;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C2097 f6200;

    public C2092(C2097 c2097, LayoutDirection layoutDirection) {
        this.f6200 = c2097;
        this.f6199 = layoutDirection;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1106(InterfaceC1653 interfaceC1653, List list, long j) {
        this.f6200.setParentLayoutDirection(this.f6199);
        return interfaceC1653.mo1495(0, 0, AbstractC4339.m8776(), new InterfaceC6558() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1$1
            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5176.f14739;
            }

            public final void invoke(AbstractC1708 abstractC1708) {
            }
        });
    }
}
