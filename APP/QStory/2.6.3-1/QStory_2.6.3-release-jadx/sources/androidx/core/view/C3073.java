package androidx.core.view;

import android.view.WindowInsets;
import p180.C8494;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3073 extends C3052 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C8494 f6878;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C8494 f6879;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C8494 f6880;

    public C3073(C3058 c3058, WindowInsets windowInsets) {
        super(c3058, windowInsets);
        this.f6878 = null;
        this.f6879 = null;
        this.f6880 = null;
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public C8494 mo4694() {
        if (this.f6878 == null) {
            this.f6878 = C8494.m13497(this.f6853.getSystemGestureInsets());
        }
        return this.f6878;
    }

    @Override // androidx.core.view.C3055, androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public C3058 mo4609(int i, int i2, int i3, int i4) {
        return C3058.m4623(null, this.f6853.inset(i, i2, i3, i4));
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public C8494 mo4695() {
        if (this.f6880 == null) {
            this.f6880 = C8494.m13497(this.f6853.getTappableElementInsets());
        }
        return this.f6880;
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public C8494 mo4696() {
        if (this.f6879 == null) {
            this.f6879 = C8494.m13497(this.f6853.getMandatorySystemGestureInsets());
        }
        return this.f6879;
    }

    public C3073(C3058 c3058, C3073 c3073) {
        super(c3058, c3073);
        this.f6878 = null;
        this.f6879 = null;
        this.f6880 = null;
    }

    @Override // androidx.core.view.C3051, androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public void mo4576(C8494 c8494) {
    }
}
