package androidx.compose.foundation.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子哲楪兰苏世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子哲世楪苏兰;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0618 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6557 f1719;

    public C0618(InterfaceC6557 interfaceC6557) {
        this.f1719 = interfaceC6557;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0618) {
            return this.f1719 == ((C0618) obj).f1719;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1719.hashCode();
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C0610 c0610 = (C0610) abstractC2128;
        InterfaceC6557 interfaceC6557 = c0610.f1703;
        InterfaceC6557 interfaceC65572 = this.f1719;
        if (interfaceC6557 != interfaceC65572) {
            c0610.f1703 = interfaceC65572;
            C0625 c0625 = c0610.f1702;
            if (c0625 != null) {
                InterfaceC0608 interfaceC0608 = (InterfaceC0608) interfaceC65572.invoke(c0625);
                if (AbstractC4394.m8917(interfaceC0608, c0610.f1873)) {
                    return;
                }
                c0610.f1873 = interfaceC0608;
                c0610.mo1348();
            }
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        C0610 c0610 = new C0610(AbstractC0628.f1771);
        c0610.f1703 = this.f1719;
        return c0610;
    }
}
