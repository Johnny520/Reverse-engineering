package androidx.compose.p001ui.layout;

import androidx.appcompat.widget.C1038;
import androidx.compose.p001ui.node.AbstractC2589;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.p001ui.unit.LayoutDirection;
import kotlin.collections.AbstractC5179;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2499 extends AbstractC2543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f5224;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f5225;

    public /* synthetic */ C2499(Object obj, int i) {
        this.f5224 = i;
        this.f5225 = obj;
    }

    @Override // androidx.compose.p001ui.layout.AbstractC2543
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int mo3650() {
        int i = this.f5224;
        Object obj = this.f5225;
        switch (i) {
            case 0:
                return ((AbstractC2589) obj).mo3699();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC2719) obj).getRoot().f5477.f5512.f5344;
        }
    }

    @Override // androidx.compose.p001ui.layout.AbstractC2543
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LayoutDirection mo3651() {
        int i = this.f5224;
        Object obj = this.f5225;
        switch (i) {
            case 0:
                return ((AbstractC2589) obj).getLayoutDirection();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC2719) obj).getLayoutDirection();
        }
    }

    @Override // androidx.compose.p001ui.layout.AbstractC2543
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC2530 mo3652() {
        int i = this.f5224;
        Object obj = this.f5225;
        switch (i) {
            case 0:
                AbstractC2589 abstractC2589 = (AbstractC2589) obj;
                InterfaceC2530 interfaceC2530Mo3765 = abstractC2589.f5492 ? null : abstractC2589.mo3765();
                if (interfaceC2530Mo3765 == null) {
                    abstractC2589.mo3764().f5477.m3860();
                }
                return interfaceC2530Mo3765;
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC2719) obj).getRoot().f5439.f5630;
        }
    }

    @Override // androidx.compose.p001ui.layout.AbstractC2543
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float mo3653(AbstractC2555 abstractC2555) {
        int iM9411;
        switch (this.f5224) {
            case 0:
                InterfaceC7383 interfaceC7383 = abstractC2555.f5337;
                if (interfaceC7383 != null) {
                    return ((Number) interfaceC7383.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                AbstractC2589 abstractC2589 = (AbstractC2589) this.f5225;
                if (abstractC2589.f5492) {
                    return Float.NaN;
                }
                AbstractC2589 abstractC25892 = abstractC2589;
                while (true) {
                    C1038 c1038 = abstractC25892.f5490;
                    float f = (c1038 == null || (iM9411 = AbstractC5179.m9411(abstractC2555, (AbstractC2555[]) c1038.f1094)) < 0) ? Float.NaN : ((float[]) c1038.f1093)[iM9411];
                    if (!Float.isNaN(f)) {
                        abstractC25892.m3852(abstractC2589.mo3764(), abstractC2555);
                        return abstractC2555.mo3678(f, abstractC25892.mo3765(), abstractC2589.mo3765());
                    }
                    AbstractC2589 abstractC2589Mo3760 = abstractC25892.mo3760();
                    if (abstractC2589Mo3760 == null) {
                        abstractC25892.m3852(abstractC2589.mo3764(), abstractC2555);
                        return Float.NaN;
                    }
                    abstractC25892 = abstractC2589Mo3760;
                }
                break;
            default:
                return super.mo3653(abstractC2555);
        }
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1816() {
        int i = this.f5224;
        Object obj = this.f5225;
        switch (i) {
            case 0:
                return ((AbstractC2589) obj).mo1816();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC2719) obj).getDensity().mo1816();
        }
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1817() {
        int i = this.f5224;
        Object obj = this.f5225;
        switch (i) {
            case 0:
                return ((AbstractC2589) obj).mo1817();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC2719) obj).getDensity().mo1817();
        }
    }
}
