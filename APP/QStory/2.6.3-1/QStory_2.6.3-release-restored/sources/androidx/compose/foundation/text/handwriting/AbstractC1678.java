package androidx.compose.foundation.text.handwriting;

import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.input.pointer.C2460;
import androidx.compose.p001ui.node.C2612;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.foundation.text.handwriting.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1678 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2612 f2720 = new C2612();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC2962 m2210(boolean z, boolean z2, InterfaceC7372 interfaceC7372) {
        InterfaceC2962 c2460 = C2958.f6621;
        if (!z || !AbstractC1675.f2715) {
            return c2460;
        }
        if (z2) {
            c2460 = new C2460(f2720);
        }
        return c2460.mo4426(new C1679(interfaceC7372));
    }
}
