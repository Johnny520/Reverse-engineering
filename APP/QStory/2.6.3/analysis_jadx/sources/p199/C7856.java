package p199;

import p203.C7879;
import p203.C7883;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7856 extends AbstractC7854 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C7883 f21496;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f21497;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f21498;

    public boolean getAllowsGoneWidget() {
        return this.f21496.f21788;
    }

    public int getMargin() {
        return this.f21496.f21787;
    }

    public int getType() {
        return this.f21497;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f21496.f21788 = z;
    }

    public void setDpMargin(int i) {
        this.f21496.f21787 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f21496.f21787 = i;
    }

    public void setType(int i) {
        this.f21497 = i;
    }

    @Override // p199.AbstractC7854
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo3921(C7879 c7879, boolean z) {
        int i = this.f21497;
        this.f21498 = i;
        if (z) {
            if (i == 5) {
                this.f21498 = 1;
            } else if (i == 6) {
                this.f21498 = 0;
            }
        } else if (i == 5) {
            this.f21498 = 0;
        } else if (i == 6) {
            this.f21498 = 1;
        }
        if (c7879 instanceof C7883) {
            ((C7883) c7879).f21789 = this.f21498;
        }
    }
}
