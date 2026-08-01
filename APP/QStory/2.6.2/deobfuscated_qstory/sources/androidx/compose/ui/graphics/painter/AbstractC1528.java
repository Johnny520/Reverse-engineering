package androidx.compose.ui.graphics.painter;

import androidx.appcompat.app.C0113;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.C1609;
import androidx.compose.ui.graphics.drawscope.C1507;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.node.C1758;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.painter.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1528 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C1607 f4421;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C1609 f4422;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f4420 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public LayoutDirection f4419 = LayoutDirection.Ltr;

    public AbstractC1528() {
        new InterfaceC6557() { // from class: androidx.compose.ui.graphics.painter.Painter$drawLambda$1
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1504) obj);
                return C5175.f14739;
            }

            public final void invoke(InterfaceC1504 interfaceC1504) {
                this.this$0.mo2797(interfaceC1504);
            }
        };
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract void mo2797(InterfaceC1504 interfaceC1504);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract long mo2798();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2799(C1758 c1758, long j, float f, C1607 c1607) {
        C1507 c1507 = c1758.f5175;
        if (this.f4420 != f) {
            mo2801(f);
            this.f4420 = f;
        }
        if (!AbstractC4394.m8917(this.f4421, c1607)) {
            mo2800(c1607);
            this.f4421 = c1607;
        }
        LayoutDirection layoutDirection = c1758.getLayoutDirection();
        if (this.f4419 != layoutDirection) {
            this.f4419 = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c1507.mo2695() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c1507.mo2695() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((C0113) c1507.f4283.f319).m428(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    mo2797(c1758);
                }
            } finally {
                ((C0113) c1507.f4283.f319).m428(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public abstract void mo2800(C1607 c1607);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract void mo2801(float f);
}
