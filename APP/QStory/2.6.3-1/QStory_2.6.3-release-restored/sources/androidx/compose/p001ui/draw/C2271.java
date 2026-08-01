package androidx.compose.p001ui.draw;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.graphics.InterfaceC2418;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.InterfaceC2616;
import androidx.compose.p001ui.node.InterfaceC2626;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.p001ui.unit.LayoutDirection;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.ui.draw.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2271 extends AbstractC2961 implements InterfaceC2626, InterfaceC2272, InterfaceC2616 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C2270 f4462;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC7387 f4463;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C2279 f4464;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f4465;

    public C2271(C2270 c2270, InterfaceC7387 interfaceC7387) {
        this.f4462 = c2270;
        this.f4463 = interfaceC7387;
        c2270.f4461 = this;
        new InterfaceC7372() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl$1
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final InterfaceC2418 invoke() {
                C2271 c2271 = this.this$0;
                C2279 c2279 = c2271.f4464;
                if (c2279 == null) {
                    c2279 = new C2279();
                    c2271.f4464 = c2279;
                }
                if (c2279.f4484 == null) {
                    InterfaceC2418 graphicsContext = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(c2271)).getGraphicsContext();
                    c2279.m3139();
                    c2279.f4484 = graphicsContext;
                }
                return c2279;
            }
        };
    }

    @Override // androidx.compose.p001ui.draw.InterfaceC2272
    public final LayoutDirection getLayoutDirection() {
        return AbstractC2620.m3906(this).f5445;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2622
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final void mo2433() {
        m3132();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2616
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void mo3131() {
        m3132();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m3132() {
        C2279 c2279 = this.f4464;
        if (c2279 != null) {
            c2279.m3139();
        }
        this.f4465 = false;
        this.f4462.f4460 = null;
        AbstractC2620.m3911(this);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final void mo1679() {
        m3132();
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        C2279 c2279 = this.f4464;
        if (c2279 != null) {
            c2279.m3139();
        }
    }

    @Override // androidx.compose.p001ui.draw.InterfaceC2272
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8725 mo3133() {
        return AbstractC2620.m3906(this).f5444;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2622, androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1856() {
        m3132();
    }

    @Override // androidx.compose.p001ui.draw.InterfaceC2272
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long mo3134() {
        return AbstractC1298.m1700(AbstractC2620.m3908(this, 4).f5343);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2626
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1687() {
        m3132();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2616
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1688(InterfaceC2341 interfaceC2341) {
        boolean z = this.f4465;
        final C2270 c2270 = this.f4462;
        if (!z) {
            c2270.f4460 = null;
            AbstractC2620.m3904(this, new InterfaceC7372() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m3129invoke() {
                    this.this$0.f4463.invoke(c2270);
                }

                @Override // p068.InterfaceC7372
                public /* bridge */ /* synthetic */ Object invoke() {
                    m3129invoke();
                    return C6008.f15084;
                }
            });
            if (c2270.f4460 == null) {
                throw AbstractC0900.m699("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f4465 = true;
        }
        C2284 c2284 = c2270.f4460;
        c2284.getClass();
        c2284.f4489.invoke(interfaceC2341);
    }
}
