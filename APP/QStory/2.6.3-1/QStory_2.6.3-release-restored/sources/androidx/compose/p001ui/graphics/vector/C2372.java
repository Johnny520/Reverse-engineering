package androidx.compose.p001ui.graphics.vector;

import androidx.appcompat.app.C0955;
import androidx.appcompat.app.C0960;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import androidx.compose.p001ui.graphics.painter.AbstractC2363;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.C6008;
import p068.InterfaceC7372;
import p128.C8155;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2372 extends AbstractC2363 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC2230 f4810;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C2366 f4811;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f4812;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C2442 f4813;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC2230 f4809 = AbstractC2202.m3034(new C8155(0));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC2230 f4808 = AbstractC2202.m3034(Boolean.FALSE);

    public C2372(C2381 c2381) {
        C2366 c2366 = new C2366(c2381);
        c2366.f4789 = new InterfaceC7372() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3376invoke() {
                ((AbstractC2182) this.this$0.f4810).setValue(C6008.f15084);
            }

            @Override // p068.InterfaceC7372
            public /* bridge */ /* synthetic */ Object invoke() {
                m3376invoke();
                return C6008.f15084;
            }
        };
        this.f4811 = c2366;
        this.f4810 = AbstractC2202.m3035(C6008.f15084, C2188.f4265);
        this.f4812 = 1.0f;
    }

    @Override // androidx.compose.p001ui.graphics.painter.AbstractC2363
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo3367(InterfaceC2339 interfaceC2339) {
        C2442 c2442 = this.f4813;
        C2366 c2366 = this.f4811;
        if (c2442 == null) {
            c2442 = (C2442) ((AbstractC2182) c2366.f4796).getValue();
        }
        if (((Boolean) ((AbstractC2182) this.f4808).getValue()).booleanValue() && interfaceC2339.getLayoutDirection() == LayoutDirection.Rtl) {
            long jMo3268 = interfaceC2339.mo3268();
            C0955 c0955Mo3266 = interfaceC2339.mo3266();
            long jM928 = c0955Mo3266.m928();
            c0955Mo3266.m946().mo3237();
            try {
                ((C0960) c0955Mo3266.f664).m993(-1.0f, 1.0f, jMo3268);
                c2366.m3377(interfaceC2339, this.f4812, c2442);
            } finally {
                c0955Mo3266.m946().mo3249();
                c0955Mo3266.m921(jM928);
            }
        } else {
            c2366.m3377(interfaceC2339, this.f4812, c2442);
        }
        ((AbstractC2182) this.f4810).getValue();
    }

    @Override // androidx.compose.p001ui.graphics.painter.AbstractC2363
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo3368() {
        return ((C8155) ((AbstractC2182) this.f4809).getValue()).f19872;
    }

    @Override // androidx.compose.p001ui.graphics.painter.AbstractC2363
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo3370(C2442 c2442) {
        this.f4813 = c2442;
    }

    @Override // androidx.compose.p001ui.graphics.painter.AbstractC2363
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3371(float f) {
        this.f4812 = f;
    }
}
