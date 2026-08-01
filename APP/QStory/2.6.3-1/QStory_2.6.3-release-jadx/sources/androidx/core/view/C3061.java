package androidx.core.view;

import android.view.Window;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3061 extends AbstractC3062 {
    @Override // androidx.core.view.AbstractC3049
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo4573(boolean z) {
        if (!z) {
            m4661(8192);
            return;
        }
        Window window = this.f6867;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        m4662(8192);
    }

    @Override // androidx.core.view.AbstractC3049
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo4574(boolean z) {
        if (!z) {
            m4661(16);
            return;
        }
        Window window = this.f6867;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        m4662(16);
    }
}
