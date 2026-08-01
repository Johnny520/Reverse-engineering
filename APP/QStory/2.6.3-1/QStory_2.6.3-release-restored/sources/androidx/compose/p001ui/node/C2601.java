package androidx.compose.p001ui.node;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.focus.InterfaceC2311;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2601 implements InterfaceC2311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Boolean f5534;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2601 f5535 = new C2601();

    @Override // androidx.compose.p001ui.focus.InterfaceC2311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo3194(boolean z) {
        f5534 = Boolean.valueOf(z);
    }

    @Override // androidx.compose.p001ui.focus.InterfaceC2311
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo3196() {
        Boolean bool = f5534;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw AbstractC0900.m699("canFocus is read before it is written");
    }
}
