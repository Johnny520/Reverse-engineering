package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;
import p164.C7665;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2236 extends C2237 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C2225 f6530 = C2225.m4063(null, WindowInsets.CONSUMED);

    public C2236(C2225 c2225, WindowInsets windowInsets) {
        super(c2225, windowInsets);
    }

    @Override // androidx.core.view.C2241, androidx.core.view.C2222, androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public boolean mo4045(int i) {
        return this.f6508.isVisible(AbstractC2224.m4061(i));
    }

    @Override // androidx.core.view.C2241, androidx.core.view.C2222, androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public C7665 mo4052(int i) {
        return C7665.m12938(this.f6508.getInsets(AbstractC2224.m4061(i)));
    }

    @Override // androidx.core.view.C2241, androidx.core.view.C2222, androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public C7665 mo4053(int i) {
        return C7665.m12938(this.f6508.getInsetsIgnoringVisibility(AbstractC2224.m4061(i)));
    }

    public C2236(C2225 c2225, C2236 c2236) {
        super(c2225, c2236);
    }

    @Override // androidx.core.view.C2222, androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo4050(View view) {
    }
}
