package androidx.compose.ui.node;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.focus.InterfaceC1476;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1766 implements InterfaceC1476 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Boolean f5188;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1766 f5189 = new C1766();

    @Override // androidx.compose.ui.focus.InterfaceC1476
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2624(boolean z) {
        f5188 = Boolean.valueOf(z);
    }

    @Override // androidx.compose.ui.focus.InterfaceC1476
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo2626() {
        Boolean bool = f5188;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw AbstractC0053.m139("canFocus is read before it is written");
    }
}
