package androidx.compose.ui.layout;

import androidx.appcompat.widget.C0191;
import androidx.compose.ui.node.AbstractC1754;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.collections.AbstractC4346;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1664 extends AbstractC1708 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f4878;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f4879;

    public /* synthetic */ C1664(Object obj, int i) {
        this.f4878 = i;
        this.f4879 = obj;
    }

    @Override // androidx.compose.ui.layout.AbstractC1708
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int mo3080() {
        int i = this.f4878;
        Object obj = this.f4879;
        switch (i) {
            case 0:
                return ((AbstractC1754) obj).mo3129();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC1884) obj).getRoot().f5131.f5166.f4998;
        }
    }

    @Override // androidx.compose.ui.layout.AbstractC1708
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LayoutDirection mo3081() {
        int i = this.f4878;
        Object obj = this.f4879;
        switch (i) {
            case 0:
                return ((AbstractC1754) obj).getLayoutDirection();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC1884) obj).getLayoutDirection();
        }
    }

    @Override // androidx.compose.ui.layout.AbstractC1708
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC1695 mo3082() {
        int i = this.f4878;
        Object obj = this.f4879;
        switch (i) {
            case 0:
                AbstractC1754 abstractC1754 = (AbstractC1754) obj;
                InterfaceC1695 interfaceC1695Mo3195 = abstractC1754.f5146 ? null : abstractC1754.mo3195();
                if (interfaceC1695Mo3195 == null) {
                    abstractC1754.mo3194().f5131.m3290();
                }
                return interfaceC1695Mo3195;
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC1884) obj).getRoot().f5093.f5284;
        }
    }

    @Override // androidx.compose.ui.layout.AbstractC1708
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float mo3083(AbstractC1720 abstractC1720) {
        int iM8844;
        switch (this.f4878) {
            case 0:
                InterfaceC6553 interfaceC6553 = abstractC1720.f4991;
                if (interfaceC6553 != null) {
                    return ((Number) interfaceC6553.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                AbstractC1754 abstractC1754 = (AbstractC1754) this.f4879;
                if (abstractC1754.f5146) {
                    return Float.NaN;
                }
                AbstractC1754 abstractC17542 = abstractC1754;
                while (true) {
                    C0191 c0191 = abstractC17542.f5144;
                    float f = (c0191 == null || (iM8844 = AbstractC4346.m8844(abstractC1720, (AbstractC1720[]) c0191.f749)) < 0) ? Float.NaN : ((float[]) c0191.f748)[iM8844];
                    if (!Float.isNaN(f)) {
                        abstractC17542.m3282(abstractC1754.mo3194(), abstractC1720);
                        return abstractC1720.mo3108(f, abstractC17542.mo3195(), abstractC1754.mo3195());
                    }
                    AbstractC1754 abstractC1754Mo3190 = abstractC17542.mo3190();
                    if (abstractC1754Mo3190 == null) {
                        abstractC17542.m3282(abstractC1754.mo3194(), abstractC1720);
                        return Float.NaN;
                    }
                    abstractC17542 = abstractC1754Mo3190;
                }
                break;
            default:
                return super.mo3083(abstractC1720);
        }
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1246() {
        int i = this.f4878;
        Object obj = this.f4879;
        switch (i) {
            case 0:
                return ((AbstractC1754) obj).mo1246();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC1884) obj).getDensity().mo1246();
        }
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1247() {
        int i = this.f4878;
        Object obj = this.f4879;
        switch (i) {
            case 0:
                return ((AbstractC1754) obj).mo1247();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC1884) obj).getDensity().mo1247();
        }
    }
}
