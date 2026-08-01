package androidx.compose.ui.draw;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.graphics.InterfaceC1583;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1781;
import androidx.compose.ui.node.InterfaceC1791;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p205.InterfaceC7895;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.ui.draw.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1436 extends AbstractC2128 implements InterfaceC1791, InterfaceC1437, InterfaceC1781 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C1435 f4116;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC6557 f4117;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C1444 f4118;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f4119;

    public C1436(C1435 c1435, InterfaceC6557 interfaceC6557) {
        this.f4116 = c1435;
        this.f4117 = interfaceC6557;
        c1435.f4115 = this;
        new InterfaceC6542() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl$1
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final InterfaceC1583 invoke() {
                C1436 c1436 = this.this$0;
                C1444 c1444 = c1436.f4118;
                if (c1444 == null) {
                    c1444 = new C1444();
                    c1436.f4118 = c1444;
                }
                if (c1444.f4138 == null) {
                    InterfaceC1583 graphicsContext = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(c1436)).getGraphicsContext();
                    c1444.m2569();
                    c1444.f4138 = graphicsContext;
                }
                return c1444;
            }
        };
    }

    @Override // androidx.compose.ui.draw.InterfaceC1437
    public final LayoutDirection getLayoutDirection() {
        return AbstractC1785.m3336(this).f5099;
    }

    @Override // androidx.compose.ui.node.InterfaceC1787
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final void mo1863() {
        m2562();
    }

    @Override // androidx.compose.ui.node.InterfaceC1781
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void mo2561() {
        m2562();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m2562() {
        C1444 c1444 = this.f4118;
        if (c1444 != null) {
            c1444.m2569();
        }
        this.f4119 = false;
        this.f4116.f4114 = null;
        AbstractC1785.m3341(this);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final void mo1118() {
        m2562();
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        C1444 c1444 = this.f4118;
        if (c1444 != null) {
            c1444.m2569();
        }
    }

    @Override // androidx.compose.ui.draw.InterfaceC1437
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7895 mo2563() {
        return AbstractC1785.m3336(this).f5098;
    }

    @Override // androidx.compose.ui.node.InterfaceC1787, androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1286() {
        m2562();
    }

    @Override // androidx.compose.ui.draw.InterfaceC1437
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long mo2564() {
        return AbstractC8189.m13654(AbstractC1785.m3338(this, 4).f4997);
    }

    @Override // androidx.compose.ui.node.InterfaceC1791
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1126() {
        m2562();
    }

    @Override // androidx.compose.ui.node.InterfaceC1781
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1127(InterfaceC1506 interfaceC1506) {
        boolean z = this.f4119;
        final C1435 c1435 = this.f4116;
        if (!z) {
            c1435.f4114 = null;
            AbstractC1785.m3334(this, new InterfaceC6542() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m2559invoke() {
                    this.this$0.f4117.invoke(c1435);
                }

                @Override // p052.InterfaceC6542
                public /* bridge */ /* synthetic */ Object invoke() {
                    m2559invoke();
                    return C5175.f14739;
                }
            });
            if (c1435.f4114 == null) {
                throw AbstractC0053.m139("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f4119 = true;
        }
        C1449 c1449 = c1435.f4114;
        c1449.getClass();
        c1449.f4143.invoke(interfaceC1506);
    }
}
