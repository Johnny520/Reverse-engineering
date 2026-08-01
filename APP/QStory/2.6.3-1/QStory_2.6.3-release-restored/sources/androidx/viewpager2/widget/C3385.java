package androidx.viewpager2.widget;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3385 extends AbstractC3387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C3382 f8038;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f8039;

    public /* synthetic */ C3385(C3382 c3382, int i) {
        this.f8039 = i;
        this.f8038 = c3382;
    }

    @Override // androidx.viewpager2.widget.AbstractC3387
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo5609(int i) {
        int i2 = this.f8039;
        C3382 c3382 = this.f8038;
        switch (i2) {
            case 0:
                if (c3382.f8029 != i) {
                    c3382.f8029 = i;
                    c3382.f8023.m1554();
                }
                break;
            default:
                c3382.clearFocus();
                if (c3382.hasFocus()) {
                    c3382.f8022.requestFocus(2);
                }
                break;
        }
    }

    @Override // androidx.viewpager2.widget.AbstractC3387
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo5611(int i) {
        switch (this.f8039) {
            case 0:
                if (i == 0) {
                    this.f8038.m5613();
                }
                break;
        }
    }
}
