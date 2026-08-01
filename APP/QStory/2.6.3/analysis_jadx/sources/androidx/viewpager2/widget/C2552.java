package androidx.viewpager2.widget;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2552 extends AbstractC2554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C2549 f7693;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7694;

    public /* synthetic */ C2552(C2549 c2549, int i) {
        this.f7694 = i;
        this.f7693 = c2549;
    }

    @Override // androidx.viewpager2.widget.AbstractC2554
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo5049(int i) {
        int i2 = this.f7694;
        C2549 c2549 = this.f7693;
        switch (i2) {
            case 0:
                if (c2549.f7684 != i) {
                    c2549.f7684 = i;
                    c2549.f7678.m994();
                }
                break;
            default:
                c2549.clearFocus();
                if (c2549.hasFocus()) {
                    c2549.f7677.requestFocus(2);
                }
                break;
        }
    }

    @Override // androidx.viewpager2.widget.AbstractC2554
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo5051(int i) {
        switch (this.f7694) {
            case 0:
                if (i == 0) {
                    this.f7693.m5053();
                }
                break;
        }
    }
}
