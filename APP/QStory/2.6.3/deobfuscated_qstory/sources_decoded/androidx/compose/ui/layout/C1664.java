package androidx.compose.ui.layout;

import androidx.appcompat.widget.C0191;
import androidx.compose.ui.node.AbstractC1754;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.collections.AbstractC4347;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1664 extends AbstractC1708 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f4879;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f4880;

    public /* synthetic */ C1664(Object obj, int i) {
        this.f4879 = i;
        this.f4880 = obj;
    }

    @Override // androidx.compose.ui.layout.AbstractC1708
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int mo3090() {
        int i = this.f4879;
        Object obj = this.f4880;
        switch (i) {
            case 0:
                return ((AbstractC1754) obj).mo3139();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC1884) obj).getRoot().f5132.f5167.f4999;
        }
    }

    @Override // androidx.compose.ui.layout.AbstractC1708
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LayoutDirection mo3091() {
        int i = this.f4879;
        Object obj = this.f4880;
        switch (i) {
            case 0:
                return ((AbstractC1754) obj).getLayoutDirection();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC1884) obj).getLayoutDirection();
        }
    }

    @Override // androidx.compose.ui.layout.AbstractC1708
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC1695 mo3092() {
        int i = this.f4879;
        Object obj = this.f4880;
        switch (i) {
            case 0:
                AbstractC1754 abstractC1754 = (AbstractC1754) obj;
                InterfaceC1695 interfaceC1695Mo3205 = abstractC1754.f5147 ? null : abstractC1754.mo3205();
                if (interfaceC1695Mo3205 == null) {
                    abstractC1754.mo3204().f5132.m3300();
                }
                return interfaceC1695Mo3205;
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC1884) obj).getRoot().f5094.f5285;
        }
    }

    @Override // androidx.compose.ui.layout.AbstractC1708
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float mo3093(AbstractC1720 abstractC1720) {
        int iM8852;
        switch (this.f4879) {
            case 0:
                InterfaceC6554 interfaceC6554 = abstractC1720.f4992;
                if (interfaceC6554 != null) {
                    return ((Number) interfaceC6554.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                AbstractC1754 abstractC1754 = (AbstractC1754) this.f4880;
                if (abstractC1754.f5147) {
                    return Float.NaN;
                }
                AbstractC1754 abstractC17542 = abstractC1754;
                while (true) {
                    C0191 c0191 = abstractC17542.f5145;
                    float f = (c0191 == null || (iM8852 = AbstractC4347.m8852(abstractC1720, (AbstractC1720[]) c0191.f749)) < 0) ? Float.NaN : ((float[]) c0191.f748)[iM8852];
                    if (!Float.isNaN(f)) {
                        abstractC17542.m3292(abstractC1754.mo3204(), abstractC1720);
                        return abstractC1720.mo3118(f, abstractC17542.mo3205(), abstractC1754.mo3205());
                    }
                    AbstractC1754 abstractC1754Mo3200 = abstractC17542.mo3200();
                    if (abstractC1754Mo3200 == null) {
                        abstractC17542.m3292(abstractC1754.mo3204(), abstractC1720);
                        return Float.NaN;
                    }
                    abstractC17542 = abstractC1754Mo3200;
                }
                break;
            default:
                return super.mo3093(abstractC1720);
        }
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1256() {
        int i = this.f4879;
        Object obj = this.f4880;
        switch (i) {
            case 0:
                return ((AbstractC1754) obj).mo1256();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC1884) obj).getDensity().mo1256();
        }
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1257() {
        int i = this.f4879;
        Object obj = this.f4880;
        switch (i) {
            case 0:
                return ((AbstractC1754) obj).mo1257();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC1884) obj).getDensity().mo1257();
        }
    }
}
