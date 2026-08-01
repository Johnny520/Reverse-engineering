package androidx.compose.ui.draw;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.graphics.InterfaceC1583;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1781;
import androidx.compose.ui.node.InterfaceC1791;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.ui.draw.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1436 extends AbstractC2128 implements InterfaceC1791, InterfaceC1437, InterfaceC1781 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C1435 f4117;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC6558 f4118;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C1444 f4119;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f4120;

    public C1436(C1435 c1435, InterfaceC6558 interfaceC6558) {
        this.f4117 = c1435;
        this.f4118 = interfaceC6558;
        c1435.f4116 = this;
        new InterfaceC6543() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl$1
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final InterfaceC1583 invoke() {
                C1436 c1436 = this.this$0;
                C1444 c1444 = c1436.f4119;
                if (c1444 == null) {
                    c1444 = new C1444();
                    c1436.f4119 = c1444;
                }
                if (c1444.f4139 == null) {
                    InterfaceC1583 graphicsContext = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3347(c1436)).getGraphicsContext();
                    c1444.m2579();
                    c1444.f4139 = graphicsContext;
                }
                return c1444;
            }
        };
    }

    @Override // androidx.compose.ui.draw.InterfaceC1437
    public final LayoutDirection getLayoutDirection() {
        return AbstractC1785.m3346(this).f5100;
    }

    @Override // androidx.compose.ui.node.InterfaceC1787
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final void mo1873() {
        m2572();
    }

    @Override // androidx.compose.ui.node.InterfaceC1781
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void mo2571() {
        m2572();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m2572() {
        C1444 c1444 = this.f4119;
        if (c1444 != null) {
            c1444.m2579();
        }
        this.f4120 = false;
        this.f4117.f4115 = null;
        AbstractC1785.m3351(this);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final void mo1119() {
        m2572();
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        C1444 c1444 = this.f4119;
        if (c1444 != null) {
            c1444.m2579();
        }
    }

    @Override // androidx.compose.ui.draw.InterfaceC1437
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7896 mo2573() {
        return AbstractC1785.m3346(this).f5099;
    }

    @Override // androidx.compose.ui.node.InterfaceC1787, androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1296() {
        m2572();
    }

    @Override // androidx.compose.ui.draw.InterfaceC1437
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long mo2574() {
        return AbstractC0455.m1140(AbstractC1785.m3348(this, 4).f4998);
    }

    @Override // androidx.compose.ui.node.InterfaceC1791
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1127() {
        m2572();
    }

    @Override // androidx.compose.ui.node.InterfaceC1781
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1128(InterfaceC1506 interfaceC1506) {
        boolean z = this.f4120;
        final C1435 c1435 = this.f4117;
        if (!z) {
            c1435.f4115 = null;
            AbstractC1785.m3344(this, new InterfaceC6543() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m2569invoke() {
                    this.this$0.f4118.invoke(c1435);
                }

                @Override // p052.InterfaceC6543
                public /* bridge */ /* synthetic */ Object invoke() {
                    m2569invoke();
                    return C5176.f14739;
                }
            });
            if (c1435.f4115 == null) {
                throw AbstractC0053.m139("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f4120 = true;
        }
        C1449 c1449 = c1435.f4115;
        c1449.getClass();
        c1449.f4144.invoke(interfaceC1506);
    }
}
