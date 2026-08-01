package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.C0943;
import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import p176.AbstractC7741;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰苏哲世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰哲世苏;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class C0868 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0943 f2444;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0882 f2445;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0860 f2446;

    public C0868(C0860 c0860, C0943 c0943, C0882 c0882) {
        this.f2446 = c0860;
        this.f2444 = c0943;
        this.f2445 = c0882;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0868) {
            C0868 c0868 = (C0868) obj;
            return AbstractC4395.m8907(this.f2446, c0868.f2446) && this.f2444 == c0868.f2444 && this.f2445 == c0868.f2445;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2445.hashCode() + ((this.f2444.hashCode() + (this.f2446.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f2446 + ", legacyTextFieldState=" + this.f2444 + ", textFieldSelectionManager=" + this.f2445 + ')';
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) throws Throwable {
        C0865 c0865 = (C0865) abstractC2128;
        if (c0865.f6279) {
            c0865.f2421.mo1682();
            c0865.f2421.m1689(c0865);
        }
        C0860 c0860 = this.f2446;
        c0865.f2421 = c0860;
        if (c0865.f6279) {
            if (c0860.f2416 != null) {
                AbstractC7741.m13095("Expected textInputModifierNode to be null");
            }
            c0860.f2416 = c0865;
        }
        c0865.f2424 = this.f2444;
        c0865.f2423 = this.f2445;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        return new C0865(this.f2446, this.f2444, this.f2445);
    }
}
