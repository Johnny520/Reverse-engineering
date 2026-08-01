package androidx.compose.p001ui.graphics;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.node.InterfaceC2596;
import androidx.compose.p001ui.node.InterfaceC2608;
import androidx.compose.p001ui.semantics.AbstractC2781;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2407 extends AbstractC2961 implements InterfaceC2608, InterfaceC2596 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public InterfaceC7387 f4966;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public long f4967;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f4968;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public int f4969;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public long f4970;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public float f4971;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public InterfaceC2404 f4972;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public long f4973;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public float f4974;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public float f4975;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public float f4976;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public float f4977;

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f4971);
        sb.append(", scaleY=");
        sb.append(this.f4977);
        sb.append(", alpha = ");
        sb.append(this.f4976);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f4975);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.f4974);
        sb.append(", transformOrigin=");
        sb.append((Object) C2450.m3544(this.f4973));
        sb.append(", shape=");
        sb.append(this.f4972);
        sb.append(", clip=");
        sb.append(this.f4968);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC0900.m698(this.f4967, sb, ", spotShadowColor=");
        AbstractC0900.m698(this.f4970, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) AbstractC2416.m3438(this.f4969));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1853() {
        return false;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1854(InterfaceC2779 interfaceC2779) {
        if (this.f4968) {
            AbstractC2781.m4204(interfaceC2779, this.f4972);
        }
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        final AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(j);
        return interfaceC2488.mo2055(abstractC2559Mo3615.f5344, abstractC2559Mo3615.f5342, AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(AbstractC2543 abstractC2543) {
                AbstractC2543.m3690(abstractC2543, abstractC2559Mo3615, 0, 0, this.f4966, 4);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC2543) obj);
                return C6008.f15084;
            }
        });
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo2534() {
        return false;
    }
}
