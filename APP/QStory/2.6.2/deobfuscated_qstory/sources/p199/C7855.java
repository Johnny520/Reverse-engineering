package p199;

import p203.C7878;
import p203.C7882;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7855 extends AbstractC7853 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C7882 f21499;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f21500;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f21501;

    public boolean getAllowsGoneWidget() {
        return this.f21499.f21791;
    }

    public int getMargin() {
        return this.f21499.f21790;
    }

    public int getType() {
        return this.f21500;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f21499.f21791 = z;
    }

    public void setDpMargin(int i) {
        this.f21499.f21790 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f21499.f21790 = i;
    }

    public void setType(int i) {
        this.f21500 = i;
    }

    @Override // p199.AbstractC7853
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo3911(C7878 c7878, boolean z) {
        int i = this.f21500;
        this.f21501 = i;
        if (z) {
            if (i == 5) {
                this.f21501 = 1;
            } else if (i == 6) {
                this.f21501 = 0;
            }
        } else if (i == 5) {
            this.f21501 = 0;
        } else if (i == 6) {
            this.f21501 = 1;
        }
        if (c7878 instanceof C7882) {
            ((C7882) c7878).f21792 = this.f21501;
        }
    }
}
