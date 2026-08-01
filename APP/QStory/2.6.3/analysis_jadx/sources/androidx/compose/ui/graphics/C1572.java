package androidx.compose.ui.graphics;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.InterfaceC1761;
import androidx.compose.ui.node.InterfaceC1773;
import androidx.compose.ui.semantics.AbstractC1946;
import androidx.compose.ui.semantics.InterfaceC1944;
import kotlin.C5176;
import kotlin.collections.AbstractC4339;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1572 extends AbstractC2128 implements InterfaceC1773, InterfaceC1761 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public InterfaceC6558 f4621;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public long f4622;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f4623;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public int f4624;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public long f4625;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public float f4626;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public InterfaceC1569 f4627;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public long f4628;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public float f4629;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public float f4630;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public float f4631;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public float f4632;

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f4626);
        sb.append(", scaleY=");
        sb.append(this.f4632);
        sb.append(", alpha = ");
        sb.append(this.f4631);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f4630);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.f4629);
        sb.append(", transformOrigin=");
        sb.append((Object) C1615.m2984(this.f4628));
        sb.append(", shape=");
        sb.append(this.f4627);
        sb.append(", clip=");
        sb.append(this.f4623);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC0053.m138(this.f4622, sb, ", spotShadowColor=");
        AbstractC0053.m138(this.f4625, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) AbstractC1581.m2878(this.f4624));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1293() {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1294(InterfaceC1944 interfaceC1944) {
        if (this.f4623) {
            AbstractC1946.m3644(interfaceC1944, this.f4627);
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        final AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(j);
        return interfaceC1653.mo1495(abstractC1724Mo3055.f4999, abstractC1724Mo3055.f4997, AbstractC4339.m8776(), new InterfaceC6558() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(AbstractC1708 abstractC1708) {
                AbstractC1708.m3130(abstractC1708, abstractC1724Mo3055, 0, 0, this.f4621, 4);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5176.f14739;
            }
        });
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo1974() {
        return false;
    }
}
