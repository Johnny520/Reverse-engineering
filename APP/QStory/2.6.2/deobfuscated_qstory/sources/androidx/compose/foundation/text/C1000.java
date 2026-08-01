package androidx.compose.foundation.text;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.font.InterfaceC1996;
import io.ktor.util.C4210;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import p176.AbstractC7740;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/飘花落叶言子苏兰哲楪世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/text/飘花落叶言子苏兰哲世楪;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C1000 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2031 f2933;

    public C1000(C2031 c2031) {
        this.f2933 = c2031;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1000)) {
            return false;
        }
        return AbstractC4394.m8917(this.f2933, ((C1000) obj).f2933);
    }

    public final int hashCode() {
        return this.f2933.hashCode();
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C0999 c0999 = (C0999) abstractC2128;
        c0999.getClass();
        C2031 c2031M3762 = AbstractC2048.m3762(this.f2933, AbstractC1785.m3336(c0999).f5099);
        c0999.m1910(c2031M3762, (InterfaceC1996) AbstractC1785.m3346(c0999, AbstractC1902.f5589));
        C0997 c0997 = c0999.f2931;
        if (c0997 != null) {
            C0997.m1907(c0997, null, null, c2031M3762, 23);
            AbstractC1785.m3340(c0999);
        } else {
            AbstractC7740.m13068("Min size state is not set.");
            C4210.m8612();
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        return new C0999(this.f2933);
    }
}
