package androidx.core.view;

import android.view.WindowInsets;
import p164.C7665;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2218 extends C2222 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C7665 f6499;

    public C2218(C2225 c2225, C2218 c2218) {
        super(c2225, c2218);
        this.f6499 = null;
        this.f6499 = c2218.f6499;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void mo4016(C7665 c7665) {
        this.f6499 = c7665;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C2225 mo4017() {
        return C2225.m4063(null, this.f6508.consumeSystemWindowInsets());
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2225 mo4018() {
        return C2225.m4063(null, this.f6508.consumeStableInsets());
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean mo4019() {
        return this.f6508.isConsumed();
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C7665 mo4020() {
        if (this.f6499 == null) {
            WindowInsets windowInsets = this.f6508;
            this.f6499 = C7665.m12939(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f6499;
    }

    public C2218(C2225 c2225, WindowInsets windowInsets) {
        super(c2225, windowInsets);
        this.f6499 = null;
    }
}
