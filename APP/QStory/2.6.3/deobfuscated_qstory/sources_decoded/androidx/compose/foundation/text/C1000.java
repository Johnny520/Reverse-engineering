package androidx.compose.foundation.text;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.font.InterfaceC1996;
import io.ktor.util.C4211;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import p176.AbstractC7741;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/飘花落叶言子苏兰哲楪世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/text/飘花落叶言子苏兰哲世楪;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C1000 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2031 f2934;

    public C1000(C2031 c2031) {
        this.f2934 = c2031;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1000)) {
            return false;
        }
        return AbstractC4395.m8907(this.f2934, ((C1000) obj).f2934);
    }

    public final int hashCode() {
        return this.f2934.hashCode();
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C0999 c0999 = (C0999) abstractC2128;
        c0999.getClass();
        C2031 c2031M3772 = AbstractC2048.m3772(this.f2934, AbstractC1785.m3346(c0999).f5100);
        c0999.m1920(c2031M3772, (InterfaceC1996) AbstractC1785.m3356(c0999, AbstractC1902.f5590));
        C0997 c0997 = c0999.f2932;
        if (c0997 != null) {
            C0997.m1917(c0997, null, null, c2031M3772, 23);
            AbstractC1785.m3350(c0999);
        } else {
            AbstractC7741.m13096("Min size state is not set.");
            C4211.m8602();
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        return new C0999(this.f2934);
    }
}
