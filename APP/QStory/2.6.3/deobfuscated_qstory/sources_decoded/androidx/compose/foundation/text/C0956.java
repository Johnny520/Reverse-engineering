package androidx.compose.foundation.text;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2031;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/飘花落叶言子世苏兰哲楪;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/text/飘花落叶言子世哲苏楪兰;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0956 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f2728;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f2729;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2031 f2730;

    public C0956(int i, int i2, C2031 c2031) {
        this.f2730 = c2031;
        this.f2728 = i;
        this.f2729 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0956)) {
            return false;
        }
        C0956 c0956 = (C0956) obj;
        return AbstractC4395.m8907(this.f2730, c0956.f2730) && this.f2728 == c0956.f2728 && this.f2729 == c0956.f2729;
    }

    public final int hashCode() {
        return (((this.f2730.hashCode() * 31) + this.f2728) * 31) + this.f2729;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C0949 c0949 = (C0949) abstractC2128;
        C2031 c2031 = c0949.f2702;
        C2031 c20312 = this.f2730;
        boolean zM8907 = AbstractC4395.m8907(c2031, c20312);
        int i = this.f2728;
        int i2 = this.f2729;
        if (zM8907 && c0949.f2708 == i && c0949.f2707 == i2) {
            return;
        }
        c0949.f2702 = c20312;
        c0949.f2708 = i;
        c0949.f2707 = i2;
        c0949.f2703 = AbstractC2048.m3772(c20312, AbstractC1785.m3346(c0949).f5100);
        c0949.f2706 = true;
        AbstractC1785.m3350(c0949);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        C0949 c0949 = new C0949();
        c0949.f2702 = this.f2730;
        c0949.f2708 = this.f2728;
        c0949.f2707 = this.f2729;
        c0949.f2705 = -1;
        c0949.f2704 = -1;
        return c0949;
    }
}
