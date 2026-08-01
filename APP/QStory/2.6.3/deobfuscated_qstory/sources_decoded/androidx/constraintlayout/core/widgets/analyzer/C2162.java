package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import p203.C7879;
import p203.C7883;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2162 extends AbstractC2154 {
    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo3889() {
        this.f6360 = null;
        this.f6363.m3879();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo3890() {
        C7879 c7879 = this.f6361;
        if (c7879 instanceof C7883) {
            int i = ((C7883) c7879).f21789;
            C2145 c2145 = this.f6363;
            if (i == 0 || i == 1) {
                c7879.f21758 = c2145.f6328;
            } else {
                c7879.f21755 = c2145.f6328;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3891() {
        C7879 c7879 = this.f6361;
        if (c7879 instanceof C7883) {
            C2145 c2145 = this.f6363;
            c2145.f6325 = true;
            ArrayList arrayList = c2145.f6330;
            C7883 c7883 = (C7883) c7879;
            int i = c7883.f21789;
            boolean z = c7883.f21788;
            int i2 = 0;
            if (i == 0) {
                c2145.f6322 = DependencyNode$Type.LEFT;
                while (i2 < c7883.f21844) {
                    C7879 c78792 = c7883.f21845[i2];
                    if (z || c78792.f21739 != 8) {
                        C2145 c21452 = c78792.f21717.f6363;
                        c21452.f6329.add(c2145);
                        arrayList.add(c21452);
                    }
                    i2++;
                }
                m3920(this.f6361.f21717.f6363);
                m3920(this.f6361.f21717.f6365);
                return;
            }
            if (i == 1) {
                c2145.f6322 = DependencyNode$Type.RIGHT;
                while (i2 < c7883.f21844) {
                    C7879 c78793 = c7883.f21845[i2];
                    if (z || c78793.f21739 != 8) {
                        C2145 c21453 = c78793.f21717.f6365;
                        c21453.f6329.add(c2145);
                        arrayList.add(c21453);
                    }
                    i2++;
                }
                m3920(this.f6361.f21717.f6363);
                m3920(this.f6361.f21717.f6365);
                return;
            }
            if (i == 2) {
                c2145.f6322 = DependencyNode$Type.TOP;
                while (i2 < c7883.f21844) {
                    C7879 c78794 = c7883.f21845[i2];
                    if (z || c78794.f21739 != 8) {
                        C2145 c21454 = c78794.f21716.f6363;
                        c21454.f6329.add(c2145);
                        arrayList.add(c21454);
                    }
                    i2++;
                }
                m3920(this.f6361.f21716.f6363);
                m3920(this.f6361.f21716.f6365);
                return;
            }
            if (i != 3) {
                return;
            }
            c2145.f6322 = DependencyNode$Type.BOTTOM;
            while (i2 < c7883.f21844) {
                C7879 c78795 = c7883.f21845[i2];
                if (z || c78795.f21739 != 8) {
                    C2145 c21455 = c78795.f21716.f6365;
                    c21455.f6329.add(c2145);
                    arrayList.add(c21455);
                }
                i2++;
            }
            m3920(this.f6361.f21716.f6363);
            m3920(this.f6361.f21716.f6365);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC2147
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3881(InterfaceC2147 interfaceC2147) {
        C7883 c7883 = (C7883) this.f6361;
        int i = c7883.f21789;
        C2145 c2145 = this.f6363;
        Iterator it = c2145.f6330.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C2145) it.next()).f6328;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c2145.mo3878(i3 + c7883.f21787);
        } else {
            c2145.mo3878(i2 + c7883.f21787);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m3920(C2145 c2145) {
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
