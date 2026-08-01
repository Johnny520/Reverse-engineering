package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.input.pointer.C1625;
import androidx.compose.ui.node.C1777;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.foundation.text.handwriting.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0838 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1777 f2374 = new C1777();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC2129 m1640(boolean z, boolean z2, InterfaceC6542 interfaceC6542) {
        InterfaceC2129 c1625 = C2125.f6275;
        if (!z || !AbstractC0835.f2369) {
            return c1625;
        }
        if (z2) {
            c1625 = new C1625(f2374);
        }
        return c1625.mo3856(new C0839(interfaceC6542));
    }
}
