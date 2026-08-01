package p215;

import p219.C8708;
import p219.C8712;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8685 extends AbstractC8683 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C8712 f21841;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f21842;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f21843;

    public boolean getAllowsGoneWidget() {
        return this.f21841.f22133;
    }

    public int getMargin() {
        return this.f21841.f22132;
    }

    public int getType() {
        return this.f21842;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f21841.f22133 = z;
    }

    public void setDpMargin(int i) {
        this.f21841.f22132 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f21841.f22132 = i;
    }

    public void setType(int i) {
        this.f21842 = i;
    }

    @Override // p215.AbstractC8683
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo4481(C8708 c8708, boolean z) {
        int i = this.f21842;
        this.f21843 = i;
        if (z) {
            if (i == 5) {
                this.f21843 = 1;
            } else if (i == 6) {
                this.f21843 = 0;
            }
        } else if (i == 5) {
            this.f21843 = 0;
        } else if (i == 6) {
            this.f21843 = 1;
        }
        if (c8708 instanceof C8712) {
            ((C8712) c8708).f22134 = this.f21843;
        }
    }
}
