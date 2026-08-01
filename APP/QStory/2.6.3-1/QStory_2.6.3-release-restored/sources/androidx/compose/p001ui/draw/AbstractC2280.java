package androidx.compose.p001ui.draw;

import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.InterfaceC2951;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.InterfaceC2404;
import androidx.compose.p001ui.graphics.painter.AbstractC2363;
import androidx.compose.p001ui.layout.C2565;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.draw.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2280 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static InterfaceC2962 m3142(InterfaceC2962 interfaceC2962, AbstractC2363 abstractC2363, InterfaceC2951 interfaceC2951, C2565 c2565, float f, C2442 c2442, int i) {
        if ((i & 4) != 0) {
            interfaceC2951 = C2952.f6609;
        }
        InterfaceC2951 interfaceC29512 = interfaceC2951;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return interfaceC2962.mo4426(new C2275(abstractC2363, interfaceC29512, c2565, f, c2442));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC2962 m3143(InterfaceC2962 interfaceC2962, InterfaceC7387 interfaceC7387) {
        return interfaceC2962.mo4426(new C2282(interfaceC7387));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC2962 m3144(InterfaceC2962 interfaceC2962, InterfaceC7387 interfaceC7387) {
        return interfaceC2962.mo4426(new C2285(interfaceC7387));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC2962 m3145(InterfaceC2962 interfaceC2962, InterfaceC7387 interfaceC7387) {
        return interfaceC2962.mo4426(new C2281(interfaceC7387));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC2962 m3146(InterfaceC2962 interfaceC2962) {
        return AbstractC2416.m3453(interfaceC2962, 0.0f, 0.0f, null, true, 520191);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC2962 m3147(InterfaceC2962 interfaceC2962, InterfaceC2404 interfaceC2404) {
        return AbstractC2416.m3453(interfaceC2962, 0.0f, 0.0f, interfaceC2404, true, 518143);
    }
}
