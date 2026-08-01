package androidx.viewpager2.widget;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2552 extends AbstractC2554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C2549 f7692;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7693;

    public /* synthetic */ C2552(C2549 c2549, int i) {
        this.f7693 = i;
        this.f7692 = c2549;
    }

    @Override // androidx.viewpager2.widget.AbstractC2554
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo5039(int i) {
        int i2 = this.f7693;
        C2549 c2549 = this.f7692;
        switch (i2) {
            case 0:
                if (c2549.f7683 != i) {
                    c2549.f7683 = i;
                    c2549.f7677.m993();
                }
                break;
            default:
                c2549.clearFocus();
                if (c2549.hasFocus()) {
                    c2549.f7676.requestFocus(2);
                }
                break;
        }
    }

    @Override // androidx.viewpager2.widget.AbstractC2554
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo5041(int i) {
        switch (this.f7693) {
            case 0:
                if (i == 0) {
                    this.f7692.m5043();
                }
                break;
        }
    }
}
