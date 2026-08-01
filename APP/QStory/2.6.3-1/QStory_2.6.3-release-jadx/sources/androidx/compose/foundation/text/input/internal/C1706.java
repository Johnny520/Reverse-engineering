package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.C1781;
import androidx.compose.foundation.text.selection.C1720;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import p192.AbstractC8570;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰苏哲世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰哲世苏;", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final /* data */ class C1706 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1781 f2789;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1720 f2790;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1698 f2791;

    public C1706(C1698 c1698, C1781 c1781, C1720 c1720) {
        this.f2791 = c1698;
        this.f2789 = c1781;
        this.f2790 = c1720;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1706) {
            C1706 c1706 = (C1706) obj;
            return AbstractC5227.m9466(this.f2791, c1706.f2791) && this.f2789 == c1706.f2789 && this.f2790 == c1706.f2790;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2790.hashCode() + ((this.f2789.hashCode() + (this.f2791.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f2791 + ", legacyTextFieldState=" + this.f2789 + ", textFieldSelectionManager=" + this.f2790 + ')';
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) throws Throwable {
        C1703 c1703 = (C1703) abstractC2961;
        if (c1703.f6624) {
            c1703.f2766.mo2242();
            c1703.f2766.m2249(c1703);
        }
        C1698 c1698 = this.f2791;
        c1703.f2766 = c1698;
        if (c1703.f6624) {
            if (c1698.f2761 != null) {
                AbstractC8570.m13654("Expected textInputModifierNode to be null");
            }
            c1698.f2761 = c1703;
        }
        c1703.f2769 = this.f2789;
        c1703.f2768 = this.f2790;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        return new C1703(this.f2791, this.f2789, this.f2790);
    }
}
