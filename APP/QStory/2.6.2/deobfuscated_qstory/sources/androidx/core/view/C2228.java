package androidx.core.view;

import android.view.Window;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2228 extends AbstractC2229 {
    @Override // androidx.core.view.AbstractC2216
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo4003(boolean z) {
        if (!z) {
            m4091(8192);
            return;
        }
        Window window = this.f6521;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        m4092(8192);
    }

    @Override // androidx.core.view.AbstractC2216
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo4004(boolean z) {
        if (!z) {
            m4091(16);
            return;
        }
        Window window = this.f6521;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        m4092(16);
    }
}
