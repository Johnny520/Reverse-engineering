package androidx.constraintlayout.core.widgets.analyzer;

import p203.C7879;
import p203.C7889;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2161 extends AbstractC2154 {
    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo3889() {
        this.f6363.m3879();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo3890() {
        C7879 c7879 = this.f6361;
        int i = ((C7889) c7879).f21849;
        C2145 c2145 = this.f6363;
        if (i == 1) {
            c7879.f21758 = c2145.f6328;
        } else {
            c7879.f21755 = c2145.f6328;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3891() {
        C7879 c7879 = this.f6361;
        C7889 c7889 = (C7889) c7879;
        int i = c7889.f21850;
        int i2 = c7889.f21853;
        int i3 = c7889.f21849;
        C2145 c2145 = this.f6363;
        if (i3 == 1) {
            if (i != -1) {
                c2145.f6330.add(c7879.f21691.f21717.f6363);
                this.f6361.f21691.f21717.f6363.f6329.add(c2145);
                c2145.f6321 = i;
            } else if (i2 != -1) {
                c2145.f6330.add(c7879.f21691.f21717.f6365);
                this.f6361.f21691.f21717.f6365.f6329.add(c2145);
                c2145.f6321 = -i2;
            } else {
                c2145.f6325 = true;
                c2145.f6330.add(c7879.f21691.f21717.f6365);
                this.f6361.f21691.f21717.f6365.f6329.add(c2145);
            }
            m3919(this.f6361.f21717.f6363);
            m3919(this.f6361.f21717.f6365);
            return;
        }
        if (i != -1) {
            c2145.f6330.add(c7879.f21691.f21716.f6363);
            this.f6361.f21691.f21716.f6363.f6329.add(c2145);
            c2145.f6321 = i;
        } else if (i2 != -1) {
            c2145.f6330.add(c7879.f21691.f21716.f6365);
            this.f6361.f21691.f21716.f6365.f6329.add(c2145);
            c2145.f6321 = -i2;
        } else {
            c2145.f6325 = true;
            c2145.f6330.add(c7879.f21691.f21716.f6365);
            this.f6361.f21691.f21716.f6365.f6329.add(c2145);
        }
        m3919(this.f6361.f21716.f6363);
        m3919(this.f6361.f21716.f6365);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC2147
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3881(InterfaceC2147 interfaceC2147) {
        C2145 c2145 = this.f6363;
        if (c2145.f6324 && !c2145.f6332) {
            c2145.mo3878((int) ((((C2145) c2145.f6330.get(0)).f6328 * ((C7889) this.f6361).f21851) + 0.5f));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m3919(C2145 c2145) {
        C2145 c21452 = this.f6363;
        c21452.f6329.add(c2145);
        c2145.f6330.add(c21452);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo3894() {
        return false;
    }
}
