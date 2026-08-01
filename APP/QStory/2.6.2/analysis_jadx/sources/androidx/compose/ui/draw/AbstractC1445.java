package androidx.compose.ui.draw;

import androidx.compose.ui.C2119;
import androidx.compose.ui.InterfaceC2118;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.InterfaceC1569;
import androidx.compose.ui.graphics.painter.AbstractC1528;
import androidx.compose.ui.layout.C1730;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.draw.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1445 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static InterfaceC2129 m2572(InterfaceC2129 interfaceC2129, AbstractC1528 abstractC1528, InterfaceC2118 interfaceC2118, C1730 c1730, float f, C1607 c1607, int i) {
        if ((i & 4) != 0) {
            interfaceC2118 = C2119.f6263;
        }
        InterfaceC2118 interfaceC21182 = interfaceC2118;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return interfaceC2129.mo3856(new C1440(abstractC1528, interfaceC21182, c1730, f, c1607));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC2129 m2573(InterfaceC2129 interfaceC2129, InterfaceC6557 interfaceC6557) {
        return interfaceC2129.mo3856(new C1447(interfaceC6557));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC2129 m2574(InterfaceC2129 interfaceC2129, InterfaceC6557 interfaceC6557) {
        return interfaceC2129.mo3856(new C1450(interfaceC6557));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC2129 m2575(InterfaceC2129 interfaceC2129, InterfaceC6557 interfaceC6557) {
        return interfaceC2129.mo3856(new C1446(interfaceC6557));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC2129 m2576(InterfaceC2129 interfaceC2129) {
        return AbstractC1581.m2883(interfaceC2129, 0.0f, 0.0f, null, true, 520191);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC2129 m2577(InterfaceC2129 interfaceC2129, InterfaceC1569 interfaceC1569) {
        return AbstractC1581.m2883(interfaceC2129, 0.0f, 0.0f, interfaceC1569, true, 518143);
    }
}
