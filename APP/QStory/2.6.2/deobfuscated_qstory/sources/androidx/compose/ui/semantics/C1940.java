package androidx.compose.ui.semantics;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/飘花落叶言子楪世苏兰哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/semantics/飘花落叶言子楪世哲兰苏;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C1940 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6557 f5703;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f5704;

    public C1940(InterfaceC6557 interfaceC6557, boolean z) {
        this.f5704 = z;
        this.f5703 = interfaceC6557;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1940)) {
            return false;
        }
        C1940 c1940 = (C1940) obj;
        return this.f5704 == c1940.f5704 && this.f5703 == c1940.f5703;
    }

    public final int hashCode() {
        return this.f5703.hashCode() + (Boolean.hashCode(this.f5704) * 31);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C1938 c1938 = (C1938) abstractC2128;
        c1938.f5699 = this.f5704;
        c1938.f5700 = this.f5703;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        C1938 c1938 = new C1938();
        c1938.f5699 = this.f5704;
        c1938.f5700 = this.f5703;
        return c1938;
    }
}
