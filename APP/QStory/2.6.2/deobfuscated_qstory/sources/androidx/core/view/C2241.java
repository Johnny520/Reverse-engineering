package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;
import p164.C7664;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2241 extends C2240 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C2225 f6535 = C2225.m4053(null, WindowInsets.CONSUMED);

    public C2241(C2225 c2225, WindowInsets windowInsets) {
        super(c2225, windowInsets);
    }

    @Override // androidx.core.view.C2222, androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public boolean mo4035(int i) {
        return this.f6507.isVisible(AbstractC2227.m4090(i));
    }

    @Override // androidx.core.view.C2222, androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public C7664 mo4042(int i) {
        return C7664.m12909(this.f6507.getInsets(AbstractC2227.m4090(i)));
    }

    @Override // androidx.core.view.C2222, androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public C7664 mo4043(int i) {
        return C7664.m12909(this.f6507.getInsetsIgnoringVisibility(AbstractC2227.m4090(i)));
    }

    public C2241(C2225 c2225, C2241 c2241) {
        super(c2225, c2241);
    }

    @Override // androidx.core.view.C2222, androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo4031(View view) {
    }
}
