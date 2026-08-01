package androidx.compose.ui.focus;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/飘花落叶言子楪兰苏世哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/focus/飘花落叶言子楪兰哲世苏;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class C1472 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1468 f4171;

    public C1472(C1468 c1468) {
        this.f4171 = c1468;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1472) && AbstractC4394.m8917(this.f4171, ((C1472) obj).f4171);
    }

    public final int hashCode() {
        return this.f4171.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f4171 + ')';
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C1470 c1470 = (C1470) abstractC2128;
        c1470.f4170.f4169.m2045(c1470);
        C1468 c1468 = this.f4171;
        c1470.f4170 = c1468;
        c1468.f4169.m2037(c1470);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        C1470 c1470 = new C1470();
        c1470.f4170 = this.f4171;
        return c1470;
    }
}
