package androidx.core.view;

import android.view.WindowInsets;
import p164.C7664;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2240 extends C2219 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C7664 f6532;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C7664 f6533;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C7664 f6534;

    public C2240(C2225 c2225, WindowInsets windowInsets) {
        super(c2225, windowInsets);
        this.f6532 = null;
        this.f6533 = null;
        this.f6534 = null;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public C7664 mo4124() {
        if (this.f6532 == null) {
            this.f6532 = C7664.m12909(this.f6507.getSystemGestureInsets());
        }
        return this.f6532;
    }

    @Override // androidx.core.view.C2222, androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public C2225 mo4039(int i, int i2, int i3, int i4) {
        return C2225.m4053(null, this.f6507.inset(i, i2, i3, i4));
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public C7664 mo4125() {
        if (this.f6534 == null) {
            this.f6534 = C7664.m12909(this.f6507.getTappableElementInsets());
        }
        return this.f6534;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public C7664 mo4126() {
        if (this.f6533 == null) {
            this.f6533 = C7664.m12909(this.f6507.getMandatorySystemGestureInsets());
        }
        return this.f6533;
    }

    public C2240(C2225 c2225, C2240 c2240) {
        super(c2225, c2240);
        this.f6532 = null;
        this.f6533 = null;
        this.f6534 = null;
    }

    @Override // androidx.core.view.C2218, androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public void mo4006(C7664 c7664) {
    }
}
