package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import p219.C8708;
import p219.C8712;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2995 extends AbstractC2987 {
    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2987
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo4449() {
        this.f6705 = null;
        this.f6708.m4439();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2987
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo4450() {
        C8708 c8708 = this.f6706;
        if (c8708 instanceof C8712) {
            int i = ((C8712) c8708).f22134;
            C2978 c2978 = this.f6708;
            if (i == 0 || i == 1) {
                c8708.f22103 = c2978.f6673;
            } else {
                c8708.f22100 = c2978.f6673;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2987
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo4451() {
        C8708 c8708 = this.f6706;
        if (c8708 instanceof C8712) {
            C2978 c2978 = this.f6708;
            c2978.f6670 = true;
            ArrayList arrayList = c2978.f6675;
            C8712 c8712 = (C8712) c8708;
            int i = c8712.f22134;
            boolean z = c8712.f22133;
            int i2 = 0;
            if (i == 0) {
                c2978.f6667 = DependencyNode$Type.LEFT;
                while (i2 < c8712.f22189) {
                    C8708 c87082 = c8712.f22190[i2];
                    if (z || c87082.f22084 != 8) {
                        C2978 c29782 = c87082.f22062.f6708;
                        c29782.f6674.add(c2978);
                        arrayList.add(c29782);
                    }
                    i2++;
                }
                m4480(this.f6706.f22062.f6708);
                m4480(this.f6706.f22062.f6710);
                return;
            }
            if (i == 1) {
                c2978.f6667 = DependencyNode$Type.RIGHT;
                while (i2 < c8712.f22189) {
                    C8708 c87083 = c8712.f22190[i2];
                    if (z || c87083.f22084 != 8) {
                        C2978 c29783 = c87083.f22062.f6710;
                        c29783.f6674.add(c2978);
                        arrayList.add(c29783);
                    }
                    i2++;
                }
                m4480(this.f6706.f22062.f6708);
                m4480(this.f6706.f22062.f6710);
                return;
            }
            if (i == 2) {
                c2978.f6667 = DependencyNode$Type.TOP;
                while (i2 < c8712.f22189) {
                    C8708 c87084 = c8712.f22190[i2];
                    if (z || c87084.f22084 != 8) {
                        C2978 c29784 = c87084.f22061.f6708;
                        c29784.f6674.add(c2978);
                        arrayList.add(c29784);
                    }
                    i2++;
                }
                m4480(this.f6706.f22061.f6708);
                m4480(this.f6706.f22061.f6710);
                return;
            }
            if (i != 3) {
                return;
            }
            c2978.f6667 = DependencyNode$Type.BOTTOM;
            while (i2 < c8712.f22189) {
                C8708 c87085 = c8712.f22190[i2];
                if (z || c87085.f22084 != 8) {
                    C2978 c29785 = c87085.f22061.f6710;
                    c29785.f6674.add(c2978);
                    arrayList.add(c29785);
                }
                i2++;
            }
            m4480(this.f6706.f22061.f6708);
            m4480(this.f6706.f22061.f6710);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC2980
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo4441(InterfaceC2980 interfaceC2980) {
        C8712 c8712 = (C8712) this.f6706;
        int i = c8712.f22134;
        C2978 c2978 = this.f6708;
        Iterator it = c2978.f6675.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C2978) it.next()).f6673;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c2978.mo4438(i3 + c8712.f22132);
        } else {
            c2978.mo4438(i2 + c8712.f22132);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m4480(C2978 c2978) {
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
