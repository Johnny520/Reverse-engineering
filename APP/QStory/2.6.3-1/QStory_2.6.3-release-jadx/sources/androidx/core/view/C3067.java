package androidx.core.view;

import android.view.WindowInsets;
import p180.C8494;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3067 extends AbstractC3056 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final WindowInsets.Builder f6874;

    public C3067(C3058 c3058) {
        super(c3058);
        WindowInsets windowInsetsM4629 = c3058.m4629();
        this.f6874 = windowInsetsM4629 != null ? AbstractC3063.m4688(windowInsetsM4629) : AbstractC3063.m4669();
    }

    @Override // androidx.core.view.AbstractC3056
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo4614(C8494 c8494) {
        this.f6874.setStableInsets(c8494.m13501());
    }

    @Override // androidx.core.view.AbstractC3056
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo4615(C8494 c8494) {
        this.f6874.setMandatorySystemGestureInsets(c8494.m13501());
    }

    @Override // androidx.core.view.AbstractC3056
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C3058 mo4616() {
        m4617();
        C3058 c3058M4623 = C3058.m4623(null, this.f6874.build());
        C8494[] c8494Arr = this.f6863;
        C3071 c3071 = c3058M4623.f6866;
        c3071.mo4603(c8494Arr);
        c3071.mo4606(null);
        c3071.mo4595(this.f6862);
        c3071.mo4594(this.f6861);
        return c3058M4623;
    }

    @Override // androidx.core.view.AbstractC3056
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo4618(C8494 c8494) {
        this.f6874.setSystemWindowInsets(c8494.m13501());
    }

    @Override // androidx.core.view.AbstractC3056
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public void mo4619(C8494 c8494) {
        this.f6874.setSystemGestureInsets(c8494.m13501());
    }

    @Override // androidx.core.view.AbstractC3056
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public void mo4620(C8494 c8494) {
        this.f6874.setTappableElementInsets(c8494.m13501());
    }

    public C3067() {
        this.f6874 = AbstractC3063.m4669();
    }
}
