package androidx.compose.foundation.text;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2031;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/飘花落叶言子世苏兰哲楪;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/text/飘花落叶言子世哲苏楪兰;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0956 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f2727;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f2728;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2031 f2729;

    public C0956(int i, int i2, C2031 c2031) {
        this.f2729 = c2031;
        this.f2727 = i;
        this.f2728 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0956)) {
            return false;
        }
        C0956 c0956 = (C0956) obj;
        return AbstractC4394.m8917(this.f2729, c0956.f2729) && this.f2727 == c0956.f2727 && this.f2728 == c0956.f2728;
    }

    public final int hashCode() {
        return (((this.f2729.hashCode() * 31) + this.f2727) * 31) + this.f2728;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C0949 c0949 = (C0949) abstractC2128;
        C2031 c2031 = c0949.f2701;
        C2031 c20312 = this.f2729;
        boolean zM8917 = AbstractC4394.m8917(c2031, c20312);
        int i = this.f2727;
        int i2 = this.f2728;
        if (zM8917 && c0949.f2707 == i && c0949.f2706 == i2) {
            return;
        }
        c0949.f2701 = c20312;
        c0949.f2707 = i;
        c0949.f2706 = i2;
        c0949.f2702 = AbstractC2048.m3762(c20312, AbstractC1785.m3336(c0949).f5099);
        c0949.f2705 = true;
        AbstractC1785.m3340(c0949);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        C0949 c0949 = new C0949();
        c0949.f2701 = this.f2729;
        c0949.f2707 = this.f2727;
        c0949.f2706 = this.f2728;
        c0949.f2704 = -1;
        c0949.f2703 = -1;
        return c0949;
    }
}
