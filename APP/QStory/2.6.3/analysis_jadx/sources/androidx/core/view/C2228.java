package androidx.core.view;

import android.view.Window;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2228 extends AbstractC2229 {
    @Override // androidx.core.view.AbstractC2216
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo4013(boolean z) {
        if (!z) {
            m4101(8192);
            return;
        }
        Window window = this.f6522;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        m4102(8192);
    }

    @Override // androidx.core.view.AbstractC2216
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo4014(boolean z) {
        if (!z) {
            m4101(16);
            return;
        }
        Window window = this.f6522;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        m4102(16);
    }
}
