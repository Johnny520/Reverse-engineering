package androidx.core.view;

import android.view.WindowInsets;
import p164.C7664;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2218 extends C2222 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C7664 f6498;

    public C2218(C2225 c2225, C2218 c2218) {
        super(c2225, c2218);
        this.f6498 = null;
        this.f6498 = c2218.f6498;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void mo4006(C7664 c7664) {
        this.f6498 = c7664;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C2225 mo4007() {
        return C2225.m4053(null, this.f6507.consumeSystemWindowInsets());
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2225 mo4008() {
        return C2225.m4053(null, this.f6507.consumeStableInsets());
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean mo4009() {
        return this.f6507.isConsumed();
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C7664 mo4010() {
        if (this.f6498 == null) {
            WindowInsets windowInsets = this.f6507;
            this.f6498 = C7664.m12910(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f6498;
    }

    public C2218(C2225 c2225, WindowInsets windowInsets) {
        super(c2225, windowInsets);
        this.f6498 = null;
    }
}
