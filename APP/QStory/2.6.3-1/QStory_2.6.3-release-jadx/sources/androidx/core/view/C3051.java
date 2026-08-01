package androidx.core.view;

import android.view.WindowInsets;
import p180.C8494;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3051 extends C3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C8494 f6844;

    public C3051(C3058 c3058, C3051 c3051) {
        super(c3058, c3051);
        this.f6844 = null;
        this.f6844 = c3051.f6844;
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void mo4576(C8494 c8494) {
        this.f6844 = c8494;
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C3058 mo4577() {
        return C3058.m4623(null, this.f6853.consumeSystemWindowInsets());
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C3058 mo4578() {
        return C3058.m4623(null, this.f6853.consumeStableInsets());
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean mo4579() {
        return this.f6853.isConsumed();
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C8494 mo4580() {
        if (this.f6844 == null) {
            WindowInsets windowInsets = this.f6853;
            this.f6844 = C8494.m13498(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f6844;
    }

    public C3051(C3058 c3058, WindowInsets windowInsets) {
        super(c3058, windowInsets);
        this.f6844 = null;
    }
}
