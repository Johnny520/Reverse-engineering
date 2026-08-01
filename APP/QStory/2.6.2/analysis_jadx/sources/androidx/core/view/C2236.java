package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;
import p164.C7664;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2236 extends C2237 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C2225 f6529 = C2225.m4053(null, WindowInsets.CONSUMED);

    public C2236(C2225 c2225, WindowInsets windowInsets) {
        super(c2225, windowInsets);
    }

    @Override // androidx.core.view.C2241, androidx.core.view.C2222, androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public boolean mo4035(int i) {
        return this.f6507.isVisible(AbstractC2224.m4051(i));
    }

    @Override // androidx.core.view.C2241, androidx.core.view.C2222, androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public C7664 mo4042(int i) {
        return C7664.m12909(this.f6507.getInsets(AbstractC2224.m4051(i)));
    }

    @Override // androidx.core.view.C2241, androidx.core.view.C2222, androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public C7664 mo4043(int i) {
        return C7664.m12909(this.f6507.getInsetsIgnoringVisibility(AbstractC2224.m4051(i)));
    }

    public C2236(C2225 c2225, C2236 c2236) {
        super(c2225, c2236);
    }

    @Override // androidx.core.view.C2222, androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo4040(View view) {
    }
}
