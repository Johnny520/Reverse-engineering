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
import kotlin.C5176;
import p052.InterfaceC6543;
import p112.C7326;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1537 extends AbstractC1528 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC1395 f4465;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C1531 f4466;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f4467;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C1607 f4468;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC1395 f4464 = AbstractC1367.m2474(new C7326(0));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC1395 f4463 = AbstractC1367.m2474(Boolean.FALSE);

    public C1537(C1546 c1546) {
        C1531 c1531 = new C1531(c1546);
        c1531.f4444 = new InterfaceC6543() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2816invoke() {
                ((AbstractC1347) this.this$0.f4465).setValue(C5176.f14739);
            }

            @Override // p052.InterfaceC6543
            public /* bridge */ /* synthetic */ Object invoke() {
                m2816invoke();
                return C5176.f14739;
            }
        };
        this.f4466 = c1531;
        this.f4465 = AbstractC1367.m2475(C5176.f14739, C1353.f3920);
        this.f4467 = 1.0f;
    }

    @Override // androidx.compose.ui.graphics.painter.AbstractC1528
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2807(InterfaceC1504 interfaceC1504) {
        C1607 c1607 = this.f4468;
        C1531 c1531 = this.f4466;
        if (c1607 == null) {
            c1607 = (C1607) ((AbstractC1347) c1531.f4451).getValue();
        }
        if (((Boolean) ((AbstractC1347) this.f4463).getValue()).booleanValue() && interfaceC1504.getLayoutDirection() == LayoutDirection.Rtl) {
            long jMo2708 = interfaceC1504.mo2708();
            C0108 c0108Mo2706 = interfaceC1504.mo2706();
            long jM368 = c0108Mo2706.m368();
            c0108Mo2706.m386().mo2677();
            try {
                ((C0113) c0108Mo2706.f319).m433(-1.0f, 1.0f, jMo2708);
                c1531.m2817(interfaceC1504, this.f4467, c1607);
            } finally {
                c0108Mo2706.m386().mo2689();
                c0108Mo2706.m361(jM368);
            }
        } else {
            c1531.m2817(interfaceC1504, this.f4467, c1607);
        }
        ((AbstractC1347) this.f4465).getValue();
    }

    @Override // androidx.compose.ui.graphics.painter.AbstractC1528
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo2808() {
        return ((C7326) ((AbstractC1347) this.f4464).getValue()).f19527;
    }

    @Override // androidx.compose.ui.graphics.painter.AbstractC1528
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo2810(C1607 c1607) {
        this.f4468 = c1607;
    }

    @Override // androidx.compose.ui.graphics.painter.AbstractC1528
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2811(float f) {
        this.f4467 = f;
    }
}
