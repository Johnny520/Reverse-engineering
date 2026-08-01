package androidx.constraintlayout.core.widgets.analyzer;

import p219.C8708;
import p219.C8718;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2994 extends AbstractC2987 {
    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2987
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo4449() {
        this.f6708.m4439();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2987
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo4450() {
        C8708 c8708 = this.f6706;
        int i = ((C8718) c8708).f22194;
        C2978 c2978 = this.f6708;
        if (i == 1) {
            c8708.f22103 = c2978.f6673;
        } else {
            c8708.f22100 = c2978.f6673;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2987
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo4451() {
        C8708 c8708 = this.f6706;
        C8718 c8718 = (C8718) c8708;
        int i = c8718.f22195;
        int i2 = c8718.f22198;
        int i3 = c8718.f22194;
        C2978 c2978 = this.f6708;
        if (i3 == 1) {
            if (i != -1) {
                c2978.f6675.add(c8708.f22036.f22062.f6708);
                this.f6706.f22036.f22062.f6708.f6674.add(c2978);
                c2978.f6666 = i;
            } else if (i2 != -1) {
                c2978.f6675.add(c8708.f22036.f22062.f6710);
                this.f6706.f22036.f22062.f6710.f6674.add(c2978);
                c2978.f6666 = -i2;
            } else {
                c2978.f6670 = true;
                c2978.f6675.add(c8708.f22036.f22062.f6710);
                this.f6706.f22036.f22062.f6710.f6674.add(c2978);
            }
            m4479(this.f6706.f22062.f6708);
            m4479(this.f6706.f22062.f6710);
            return;
        }
        if (i != -1) {
            c2978.f6675.add(c8708.f22036.f22061.f6708);
            this.f6706.f22036.f22061.f6708.f6674.add(c2978);
            c2978.f6666 = i;
        } else if (i2 != -1) {
            c2978.f6675.add(c8708.f22036.f22061.f6710);
            this.f6706.f22036.f22061.f6710.f6674.add(c2978);
            c2978.f6666 = -i2;
        } else {
            c2978.f6670 = true;
            c2978.f6675.add(c8708.f22036.f22061.f6710);
            this.f6706.f22036.f22061.f6710.f6674.add(c2978);
        }
        m4479(this.f6706.f22061.f6708);
        m4479(this.f6706.f22061.f6710);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC2980
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo4441(InterfaceC2980 interfaceC2980) {
        C2978 c2978 = this.f6708;
        if (c2978.f6669 && !c2978.f6677) {
            c2978.mo4438((int) ((((C2978) c2978.f6675.get(0)).f6673 * ((C8718) this.f6706).f22196) + 0.5f));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m4479(C2978 c2978) {
        C2978 c29782 = this.f6708;
        c29782.f6674.add(c2978);
        c2978.f6675.add(c29782);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2987
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo4454() {
        return false;
    }
}
