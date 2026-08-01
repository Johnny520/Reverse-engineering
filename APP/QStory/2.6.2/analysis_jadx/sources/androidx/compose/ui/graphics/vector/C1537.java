package androidx.compose.ui.graphics.vector;

import androidx.appcompat.app.C0108;
import androidx.appcompat.app.C0113;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.graphics.painter.AbstractC1528;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.C5175;
import p052.InterfaceC6542;
import p112.C7325;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1537 extends AbstractC1528 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC1395 f4464;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C1531 f4465;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f4466;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C1607 f4467;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC1395 f4463 = AbstractC1367.m2465(new C7325(0));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC1395 f4462 = AbstractC1367.m2465(Boolean.FALSE);

    public C1537(C1546 c1546) {
        C1531 c1531 = new C1531(c1546);
        c1531.f4443 = new InterfaceC6542() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2806invoke() {
                ((AbstractC1347) this.this$0.f4464).setValue(C5175.f14739);
            }

            @Override // p052.InterfaceC6542
            public /* bridge */ /* synthetic */ Object invoke() {
                m2806invoke();
                return C5175.f14739;
            }
        };
        this.f4465 = c1531;
        this.f4464 = AbstractC1367.m2466(C5175.f14739, C1353.f3919);
        this.f4466 = 1.0f;
    }

    @Override // androidx.compose.ui.graphics.painter.AbstractC1528
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2797(InterfaceC1504 interfaceC1504) {
        C1607 c1607 = this.f4467;
        C1531 c1531 = this.f4465;
        if (c1607 == null) {
            c1607 = (C1607) ((AbstractC1347) c1531.f4450).getValue();
        }
        if (((Boolean) ((AbstractC1347) this.f4462).getValue()).booleanValue() && interfaceC1504.getLayoutDirection() == LayoutDirection.Rtl) {
            long jMo2698 = interfaceC1504.mo2698();
            C0108 c0108Mo2696 = interfaceC1504.mo2696();
            long jM367 = c0108Mo2696.m367();
            c0108Mo2696.m385().mo2667();
            try {
                ((C0113) c0108Mo2696.f319).m432(-1.0f, 1.0f, jMo2698);
                c1531.m2807(interfaceC1504, this.f4466, c1607);
            } finally {
                c0108Mo2696.m385().mo2679();
                c0108Mo2696.m360(jM367);
            }
        } else {
            c1531.m2807(interfaceC1504, this.f4466, c1607);
        }
        ((AbstractC1347) this.f4464).getValue();
    }

    @Override // androidx.compose.ui.graphics.painter.AbstractC1528
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo2798() {
        return ((C7325) ((AbstractC1347) this.f4463).getValue()).f19532;
    }

    @Override // androidx.compose.ui.graphics.painter.AbstractC1528
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo2800(C1607 c1607) {
        this.f4467 = c1607;
    }

    @Override // androidx.compose.ui.graphics.painter.AbstractC1528
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2801(float f) {
        this.f4466 = f;
    }
}
