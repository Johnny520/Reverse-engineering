package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import p203.C7878;
import p203.C7882;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2162 extends AbstractC2154 {
    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo3879() {
        this.f6359 = null;
        this.f6362.m3869();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo3880() {
        C7878 c7878 = this.f6360;
        if (c7878 instanceof C7882) {
            int i = ((C7882) c7878).f21792;
            C2145 c2145 = this.f6362;
            if (i == 0 || i == 1) {
                c7878.f21761 = c2145.f6327;
            } else {
                c7878.f21758 = c2145.f6327;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3881() {
        C7878 c7878 = this.f6360;
        if (c7878 instanceof C7882) {
            C2145 c2145 = this.f6362;
            c2145.f6324 = true;
            ArrayList arrayList = c2145.f6329;
            C7882 c7882 = (C7882) c7878;
            int i = c7882.f21792;
            boolean z = c7882.f21791;
            int i2 = 0;
            if (i == 0) {
                c2145.f6321 = DependencyNode$Type.LEFT;
                while (i2 < c7882.f21847) {
                    C7878 c78782 = c7882.f21848[i2];
                    if (z || c78782.f21742 != 8) {
                        C2145 c21452 = c78782.f21720.f6362;
                        c21452.f6328.add(c2145);
                        arrayList.add(c21452);
                    }
                    i2++;
                }
                m3910(this.f6360.f21720.f6362);
                m3910(this.f6360.f21720.f6364);
                return;
            }
            if (i == 1) {
                c2145.f6321 = DependencyNode$Type.RIGHT;
                while (i2 < c7882.f21847) {
                    C7878 c78783 = c7882.f21848[i2];
                    if (z || c78783.f21742 != 8) {
                        C2145 c21453 = c78783.f21720.f6364;
                        c21453.f6328.add(c2145);
                        arrayList.add(c21453);
                    }
                    i2++;
                }
                m3910(this.f6360.f21720.f6362);
                m3910(this.f6360.f21720.f6364);
                return;
            }
            if (i == 2) {
                c2145.f6321 = DependencyNode$Type.TOP;
                while (i2 < c7882.f21847) {
                    C7878 c78784 = c7882.f21848[i2];
                    if (z || c78784.f21742 != 8) {
                        C2145 c21454 = c78784.f21719.f6362;
                        c21454.f6328.add(c2145);
                        arrayList.add(c21454);
                    }
                    i2++;
                }
                m3910(this.f6360.f21719.f6362);
                m3910(this.f6360.f21719.f6364);
                return;
            }
            if (i != 3) {
                return;
            }
            c2145.f6321 = DependencyNode$Type.BOTTOM;
            while (i2 < c7882.f21847) {
                C7878 c78785 = c7882.f21848[i2];
                if (z || c78785.f21742 != 8) {
                    C2145 c21455 = c78785.f21719.f6364;
                    c21455.f6328.add(c2145);
                    arrayList.add(c21455);
                }
                i2++;
            }
            m3910(this.f6360.f21719.f6362);
            m3910(this.f6360.f21719.f6364);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC2147
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3871(InterfaceC2147 interfaceC2147) {
        C7882 c7882 = (C7882) this.f6360;
        int i = c7882.f21792;
        C2145 c2145 = this.f6362;
        Iterator it = c2145.f6329.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C2145) it.next()).f6327;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c2145.mo3868(i3 + c7882.f21790);
        } else {
            c2145.mo3868(i2 + c7882.f21790);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m3910(C2145 c2145) {
        C2145 c21452 = this.f6362;
        c21452.f6328.add(c2145);
        c2145.f6329.add(c21452);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo3884() {
        return false;
    }
}
