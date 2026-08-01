package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InterfaceC1420;
import androidx.compose.p001ui.C2967;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.platform.AbstractC2744;
import androidx.compose.runtime.C2193;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1930 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2193 f3566 = new C2193(new C1912(1));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC2962 m2564(InterfaceC2962 interfaceC2962, InterfaceC1420 interfaceC1420, InterfaceC1854 interfaceC1854) {
        if (interfaceC1854 == null) {
            return interfaceC2962;
        }
        if (interfaceC1854 instanceof InterfaceC1933) {
            return interfaceC2962.mo4426(new C1935(interfaceC1420, (InterfaceC1933) interfaceC1854));
        }
        int i = AbstractC2744.f5973;
        return interfaceC2962.mo4426(new C2967(new C1931(interfaceC1854, 0, interfaceC1420)));
    }
}
