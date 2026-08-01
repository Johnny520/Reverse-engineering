package androidx.compose.foundation.text.input.internal;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.text.C1781;
import androidx.compose.foundation.text.selection.C1720;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.focus.C2303;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.input.C2838;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.p001ui.text.input.C2859;
import androidx.compose.p001ui.text.input.InterfaceC2856;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏哲世兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final /* data */ class C1717 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC2856 f2812;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f2813;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C2303 f2814;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C1720 f2815;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C2859 f2816;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2847 f2817;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1781 f2818;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2838 f2819;

    public C1717(C2838 c2838, C2847 c2847, C1781 c1781, boolean z, InterfaceC2856 interfaceC2856, C1720 c1720, C2859 c2859, C2303 c2303) {
        this.f2819 = c2838;
        this.f2817 = c2847;
        this.f2818 = c1781;
        this.f2813 = z;
        this.f2812 = interfaceC2856;
        this.f2815 = c1720;
        this.f2816 = c2859;
        this.f2814 = c2303;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1717) {
            C1717 c1717 = (C1717) obj;
            if (this.f2819.equals(c1717.f2819) && this.f2817.equals(c1717.f2817) && this.f2818 == c1717.f2818 && this.f2813 == c1717.f2813 && this.f2812.equals(c1717.f2812) && this.f2815 == c1717.f2815 && AbstractC5227.m9466(this.f2816, c1717.f2816) && AbstractC5227.m9466(this.f2814, c1717.f2814)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2814.hashCode() + ((this.f2816.hashCode() + ((this.f2815.hashCode() + ((this.f2812.hashCode() + AbstractC0900.m701(AbstractC0900.m701(AbstractC0900.m701((this.f2818.hashCode() + ((this.f2817.hashCode() + (this.f2819.hashCode() * 31)) * 31)) * 31, 31, false), 31, this.f2813), 31, false)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f2819 + ", value=" + this.f2817 + ", state=" + this.f2818 + ", readOnly=false, enabled=" + this.f2813 + ", isPassword=false, offsetMapping=" + this.f2812 + ", manager=" + this.f2815 + ", imeOptions=" + this.f2816 + ", focusRequester=" + this.f2814 + ')';
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1708 c1708 = (C1708) abstractC2961;
        boolean z = c1708.f2798;
        C2859 c2859 = c1708.f2794;
        C1720 c1720 = c1708.f2795;
        c1708.f2801 = this.f2819;
        C2847 c2847 = this.f2817;
        c1708.f2800 = c2847;
        c1708.f2799 = this.f2818;
        boolean z2 = this.f2813;
        c1708.f2798 = z2;
        c1708.f2797 = this.f2812;
        C1720 c17202 = this.f2815;
        c1708.f2795 = c17202;
        C2859 c28592 = this.f2816;
        c1708.f2794 = c28592;
        c1708.f2796 = this.f2814;
        if (z2 != z || z2 != z || !AbstractC5227.m9466(c28592, c2859) || !C2869.m4312(c2847.f6291)) {
            AbstractC2620.m3914(c1708);
        }
        if (c17202 != c1720) {
            c17202.f2830 = new C1718(c1708, 0);
        }
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C1708 c1708 = new C1708();
        c1708.f2801 = this.f2819;
        c1708.f2800 = this.f2817;
        c1708.f2799 = this.f2818;
        c1708.f2798 = this.f2813;
        c1708.f2797 = this.f2812;
        C1720 c1720 = this.f2815;
        c1708.f2795 = c1720;
        c1708.f2794 = this.f2816;
        c1708.f2796 = this.f2814;
        c1720.f2830 = new C1718(c1708, 4);
        return c1708;
    }
}
