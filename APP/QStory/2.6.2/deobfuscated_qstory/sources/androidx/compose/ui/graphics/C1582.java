package androidx.compose.ui.graphics;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1794;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.jar.asm.Opcodes;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class C1582 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f4663;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC1569 f4664;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long f4665;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final long f4666;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f4667;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final long f4668;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f4669;

    public C1582(float f, float f2, long j, InterfaceC1569 interfaceC1569, boolean z, long j2, long j3) {
        this.f4669 = f;
        this.f4667 = f2;
        this.f4668 = j;
        this.f4664 = interfaceC1569;
        this.f4663 = z;
        this.f4665 = j2;
        this.f4666 = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1582)) {
            return false;
        }
        C1582 c1582 = (C1582) obj;
        return Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.f4669, c1582.f4669) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f4667, c1582.f4667) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && C1615.m2975(this.f4668, c1582.f4668) && AbstractC4394.m8917(this.f4664, c1582.f4664) && this.f4663 == c1582.f4663 && C1599.m2939(this.f4665, c1582.f4665) && C1599.m2939(this.f4666, c1582.f4666);
    }

    public final int hashCode() {
        int iM144 = AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(Float.hashCode(1.0f) * 31, 1.0f, 31), this.f4669, 31), 0.0f, 31), 0.0f, 31), this.f4667, 31), 0.0f, 31), 0.0f, 31), 0.0f, 31), 8.0f, 31);
        int i = C1615.f4725;
        int iM140 = AbstractC0053.m140((this.f4664.hashCode() + AbstractC0053.m141(iM144, 31, this.f4668)) * 31, 961, this.f4663);
        int i2 = C1599.f4698;
        return AbstractC0053.m143(3, AbstractC0053.m143(0, AbstractC0053.m141(AbstractC0053.m141(iM140, 31, this.f4665), 31, this.f4666), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=");
        sb.append(this.f4669);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f4667);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) C1615.m2974(this.f4668));
        sb.append(", shape=");
        sb.append(this.f4664);
        sb.append(", clip=");
        sb.append(this.f4663);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC0053.m138(this.f4665, sb, ", spotShadowColor=");
        sb.append((Object) C1599.m2944(this.f4666));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) AbstractC1581.m2868(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        AbstractC1794 abstractC1794;
        C1572 c1572 = (C1572) abstractC2128;
        c1572.f4625 = 1.0f;
        c1572.f4631 = 1.0f;
        c1572.f4630 = this.f4669;
        c1572.f4629 = this.f4667;
        c1572.f4628 = 8.0f;
        c1572.f4627 = this.f4668;
        c1572.f4626 = this.f4664;
        c1572.f4622 = this.f4663;
        c1572.f4621 = this.f4665;
        c1572.f4624 = this.f4666;
        c1572.f4623 = 3;
        InterfaceC6557 interfaceC6557 = c1572.f4620;
        if (c1572.f6291.f6278 && (abstractC1794 = AbstractC1785.m3338(c1572, 2).f5256) != null) {
            abstractC1794.m3401(interfaceC6557, true);
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        final C1572 c1572 = new C1572();
        c1572.f4625 = 1.0f;
        c1572.f4631 = 1.0f;
        c1572.f4630 = this.f4669;
        c1572.f4629 = this.f4667;
        c1572.f4628 = 8.0f;
        c1572.f4627 = this.f4668;
        c1572.f4626 = this.f4664;
        c1572.f4622 = this.f4663;
        c1572.f4621 = this.f4665;
        c1572.f4624 = this.f4666;
        c1572.f4623 = 3;
        c1572.f4620 = new InterfaceC6557() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$layerBlock$1
            {
                super(1);
            }

            public final void invoke(InterfaceC1580 interfaceC1580) {
                C1573 c1573 = (C1573) interfaceC1580;
                c1573.m2855(c1572.f4625);
                c1573.m2856(c1572.f4631);
                c1573.m2845(c1572.f4630);
                c1572.getClass();
                c1573.m2847(0.0f);
                c1572.getClass();
                c1573.m2848(0.0f);
                c1573.m2849(c1572.f4629);
                c1572.getClass();
                c1573.m2853(0.0f);
                c1572.getClass();
                c1573.m2857(0.0f);
                c1572.getClass();
                c1573.m2843(c1572.f4628);
                c1573.m2851(c1572.f4627);
                c1573.m2852(c1572.f4626);
                c1573.m2842(c1572.f4622);
                c1572.getClass();
                c1573.m2854(null);
                c1573.m2844(c1572.f4621);
                c1573.m2850(c1572.f4624);
                c1572.getClass();
                C1572 c15722 = c1572;
                int i = c15722.f4623;
                if (c1573.f4639 != i) {
                    c1573.f4652 |= Opcodes.ASM8;
                    c1573.f4639 = i;
                }
                c15722.getClass();
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1580) obj);
                return C5175.f14739;
            }
        };
        return c1572;
    }
}
