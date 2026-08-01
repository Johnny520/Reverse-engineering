package androidx.compose.ui.node;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.focus.InterfaceC1476;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1766 implements InterfaceC1476 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Boolean f5189;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1766 f5190 = new C1766();

    @Override // androidx.compose.ui.focus.InterfaceC1476
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2634(boolean z) {
        f5189 = Boolean.valueOf(z);
    }

    @Override // androidx.compose.ui.focus.InterfaceC1476
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo2636() {
        Boolean bool = f5189;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw AbstractC0053.m139("canFocus is read before it is written");
    }
}
