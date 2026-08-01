package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子哲苏兰世楪;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子哲兰楪苏世;", "foundation-layout"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1464 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC7383 f2082;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f2083;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Direction f2084;

    public C1464(Direction direction, InterfaceC7383 interfaceC7383, Object obj) {
        this.f2084 = direction;
        this.f2082 = interfaceC7383;
        this.f2083 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1464.class != obj.getClass()) {
            return false;
        }
        C1464 c1464 = (C1464) obj;
        return this.f2084 == c1464.f2084 && this.f2083.equals(c1464.f2083);
    }

    public final int hashCode() {
        return this.f2083.hashCode() + AbstractC0900.m701(this.f2084.hashCode() * 31, 31, false);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1455 c1455 = (C1455) abstractC2961;
        c1455.f2057 = this.f2084;
        c1455.f2058 = this.f2082;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C1455 c1455 = new C1455();
        c1455.f2057 = this.f2084;
        c1455.f2058 = this.f2082;
        return c1455;
    }
}
