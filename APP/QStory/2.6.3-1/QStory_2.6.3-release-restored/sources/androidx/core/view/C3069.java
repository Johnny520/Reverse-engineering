package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;
import p180.C8494;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3069 extends C3070 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C3058 f6875 = C3058.m4623(null, WindowInsets.CONSUMED);

    public C3069(C3058 c3058, WindowInsets windowInsets) {
        super(c3058, windowInsets);
    }

    @Override // androidx.core.view.C3074, androidx.core.view.C3055, androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public boolean mo4605(int i) {
        return this.f6853.isVisible(AbstractC3057.m4621(i));
    }

    @Override // androidx.core.view.C3074, androidx.core.view.C3055, androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public C8494 mo4612(int i) {
        return C8494.m13497(this.f6853.getInsets(AbstractC3057.m4621(i)));
    }

    @Override // androidx.core.view.C3074, androidx.core.view.C3055, androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public C8494 mo4613(int i) {
        return C8494.m13497(this.f6853.getInsetsIgnoringVisibility(AbstractC3057.m4621(i)));
    }

    public C3069(C3058 c3058, C3069 c3069) {
        super(c3058, c3069);
    }

    @Override // androidx.core.view.C3055, androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo4610(View view) {
    }
}
