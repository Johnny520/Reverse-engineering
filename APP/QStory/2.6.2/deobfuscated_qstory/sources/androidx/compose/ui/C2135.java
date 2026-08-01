package androidx.compose.ui;

import androidx.compose.runtime.InterfaceC1366;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/飘花落叶言子楪苏哲兰世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/飘花落叶言子楪苏兰世哲;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C2135 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1366 f6299;

    public C2135(C1253 c1253) {
        this.f6299 = c1253;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2135) && AbstractC4394.m8917(((C2135) obj).f6299, this.f6299);
    }

    public final int hashCode() {
        return this.f6299.hashCode();
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C2132 c2132 = (C2132) abstractC2128;
        InterfaceC1366 interfaceC1366 = this.f6299;
        c2132.f6296 = interfaceC1366;
        AbstractC1785.m3336(c2132).m3264(interfaceC1366);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        C2132 c2132 = new C2132();
        c2132.f6296 = this.f6299;
        return c2132;
    }
}
