package androidx.compose.foundation.text.input.internal;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.text.C0943;
import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.focus.C1468;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.input.C2004;
import androidx.compose.ui.text.input.C2013;
import androidx.compose.ui.text.input.C2025;
import androidx.compose.ui.text.input.InterfaceC2022;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏哲世兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class C0879 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC2022 f2466;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f2467;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C1468 f2468;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C0882 f2469;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C2025 f2470;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2013 f2471;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0943 f2472;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2004 f2473;

    public C0879(C2004 c2004, C2013 c2013, C0943 c0943, boolean z, InterfaceC2022 interfaceC2022, C0882 c0882, C2025 c2025, C1468 c1468) {
        this.f2473 = c2004;
        this.f2471 = c2013;
        this.f2472 = c0943;
        this.f2467 = z;
        this.f2466 = interfaceC2022;
        this.f2469 = c0882;
        this.f2470 = c2025;
        this.f2468 = c1468;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0879) {
            C0879 c0879 = (C0879) obj;
            if (this.f2473.equals(c0879.f2473) && this.f2471.equals(c0879.f2471) && this.f2472 == c0879.f2472 && this.f2467 == c0879.f2467 && this.f2466.equals(c0879.f2466) && this.f2469 == c0879.f2469 && AbstractC4394.m8917(this.f2470, c0879.f2470) && AbstractC4394.m8917(this.f2468, c0879.f2468)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2468.hashCode() + ((this.f2470.hashCode() + ((this.f2469.hashCode() + ((this.f2466.hashCode() + AbstractC0053.m140(AbstractC0053.m140(AbstractC0053.m140((this.f2472.hashCode() + ((this.f2471.hashCode() + (this.f2473.hashCode() * 31)) * 31)) * 31, 31, false), 31, this.f2467), 31, false)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f2473 + ", value=" + this.f2471 + ", state=" + this.f2472 + ", readOnly=false, enabled=" + this.f2467 + ", isPassword=false, offsetMapping=" + this.f2466 + ", manager=" + this.f2469 + ", imeOptions=" + this.f2470 + ", focusRequester=" + this.f2468 + ')';
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C0870 c0870 = (C0870) abstractC2128;
        boolean z = c0870.f2452;
        C2025 c2025 = c0870.f2448;
        C0882 c0882 = c0870.f2449;
        c0870.f2455 = this.f2473;
        C2013 c2013 = this.f2471;
        c0870.f2454 = c2013;
        c0870.f2453 = this.f2472;
        boolean z2 = this.f2467;
        c0870.f2452 = z2;
        c0870.f2451 = this.f2466;
        C0882 c08822 = this.f2469;
        c0870.f2449 = c08822;
        C2025 c20252 = this.f2470;
        c0870.f2448 = c20252;
        c0870.f2450 = this.f2468;
        if (z2 != z || z2 != z || !AbstractC4394.m8917(c20252, c2025) || !C2035.m3742(c2013.f5945)) {
            AbstractC1785.m3344(c0870);
        }
        if (c08822 != c0882) {
            c08822.f2484 = new C0880(c0870, 0);
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        C0870 c0870 = new C0870();
        c0870.f2455 = this.f2473;
        c0870.f2454 = this.f2471;
        c0870.f2453 = this.f2472;
        c0870.f2452 = this.f2467;
        c0870.f2451 = this.f2466;
        C0882 c0882 = this.f2469;
        c0870.f2449 = c0882;
        c0870.f2448 = this.f2470;
        c0870.f2450 = this.f2468;
        c0882.f2484 = new C0880(c0870, 4);
        return c0870;
    }
}
