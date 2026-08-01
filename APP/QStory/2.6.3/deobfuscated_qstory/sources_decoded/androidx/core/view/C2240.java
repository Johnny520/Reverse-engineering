package androidx.core.view;

import android.view.WindowInsets;
import p164.C7665;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2240 extends C2219 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C7665 f6533;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C7665 f6534;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C7665 f6535;

    public C2240(C2225 c2225, WindowInsets windowInsets) {
        super(c2225, windowInsets);
        this.f6533 = null;
        this.f6534 = null;
        this.f6535 = null;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public C7665 mo4134() {
        if (this.f6533 == null) {
            this.f6533 = C7665.m12938(this.f6508.getSystemGestureInsets());
        }
        return this.f6533;
    }

    @Override // androidx.core.view.C2222, androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public C2225 mo4049(int i, int i2, int i3, int i4) {
        return C2225.m4063(null, this.f6508.inset(i, i2, i3, i4));
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public C7665 mo4135() {
        if (this.f6535 == null) {
            this.f6535 = C7665.m12938(this.f6508.getTappableElementInsets());
        }
        return this.f6535;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public C7665 mo4136() {
        if (this.f6534 == null) {
            this.f6534 = C7665.m12938(this.f6508.getMandatorySystemGestureInsets());
        }
        return this.f6534;
    }

    public C2240(C2225 c2225, C2240 c2240) {
        super(c2225, c2240);
        this.f6533 = null;
        this.f6534 = null;
        this.f6535 = null;
    }

    @Override // androidx.core.view.C2218, androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public void mo4016(C7665 c7665) {
    }
}
