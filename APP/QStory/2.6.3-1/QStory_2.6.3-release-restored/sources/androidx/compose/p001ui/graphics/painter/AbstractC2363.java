package androidx.compose.p001ui.graphics.painter;

import androidx.appcompat.app.C0960;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.C2444;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import androidx.compose.p001ui.node.C2593;
import androidx.compose.p001ui.unit.LayoutDirection;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.painter.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2363 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2442 f4767;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2444 f4768;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f4766 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public LayoutDirection f4765 = LayoutDirection.Ltr;

    public AbstractC2363() {
        new InterfaceC7387() { // from class: androidx.compose.ui.graphics.painter.Painter$drawLambda$1
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC2339) obj);
                return C6008.f15084;
            }

            public final void invoke(InterfaceC2339 interfaceC2339) {
                this.this$0.mo3367(interfaceC2339);
            }
        };
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract void mo3367(InterfaceC2339 interfaceC2339);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract long mo3368();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3369(C2593 c2593, long j, float f, C2442 c2442) {
        C2342 c2342 = c2593.f5521;
        if (this.f4766 != f) {
            mo3371(f);
            this.f4766 = f;
        }
        if (!AbstractC5227.m9466(this.f4767, c2442)) {
            mo3370(c2442);
            this.f4767 = c2442;
        }
        LayoutDirection layoutDirection = c2593.getLayoutDirection();
        if (this.f4765 != layoutDirection) {
            this.f4765 = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c2342.mo3265() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c2342.mo3265() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((C0960) c2342.f4629.f664).m989(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    mo3367(c2593);
                }
            } finally {
                ((C0960) c2342.f4629.f664).m989(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public abstract void mo3370(C2442 c2442);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract void mo3371(float f);
}
