package androidx.compose.ui.draw;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.InterfaceC2118;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.painter.AbstractC1528;
import androidx.compose.ui.layout.C1730;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import p112.C7325;

/* JADX INFO: renamed from: androidx.compose.ui.draw.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/飘花落叶言子楪哲世兰苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class C1440 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C1607 f4120;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final float f4121;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC2118 f4122;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1730 f4123;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC1528 f4124;

    public C1440(AbstractC1528 abstractC1528, InterfaceC2118 interfaceC2118, C1730 c1730, float f, C1607 c1607) {
        this.f4124 = abstractC1528;
        this.f4122 = interfaceC2118;
        this.f4123 = c1730;
        this.f4121 = f;
        this.f4120 = c1607;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1440)) {
            return false;
        }
        C1440 c1440 = (C1440) obj;
        return AbstractC4394.m8917(this.f4124, c1440.f4124) && AbstractC4394.m8917(this.f4122, c1440.f4122) && AbstractC4394.m8917(this.f4123, c1440.f4123) && Float.compare(this.f4121, c1440.f4121) == 0 && AbstractC4394.m8917(this.f4120, c1440.f4120);
    }

    public final int hashCode() {
        int iM144 = AbstractC0053.m144((this.f4123.hashCode() + ((this.f4122.hashCode() + AbstractC0053.m140(this.f4124.hashCode() * 31, 31, true)) * 31)) * 31, this.f4121, 31);
        C1607 c1607 = this.f4120;
        return iM144 + (c1607 == null ? 0 : c1607.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f4124 + ", sizeToIntrinsics=true, alignment=" + this.f4122 + ", contentScale=" + this.f4123 + ", alpha=" + this.f4121 + ", colorFilter=" + this.f4120 + ')';
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C1443 c1443 = (C1443) abstractC2128;
        boolean z = c1443.f4137;
        AbstractC1528 abstractC1528 = this.f4124;
        boolean z2 = (z && C7325.m12488(c1443.f4132.mo2798(), abstractC1528.mo2798())) ? false : true;
        c1443.f4132 = abstractC1528;
        c1443.f4137 = true;
        c1443.f4136 = this.f4122;
        c1443.f4135 = this.f4123;
        c1443.f4134 = this.f4121;
        c1443.f4133 = this.f4120;
        if (z2) {
            AbstractC1785.m3340(c1443);
        }
        AbstractC1785.m3341(c1443);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        C1443 c1443 = new C1443();
        c1443.f4132 = this.f4124;
        c1443.f4137 = true;
        c1443.f4136 = this.f4122;
        c1443.f4135 = this.f4123;
        c1443.f4134 = this.f4121;
        c1443.f4133 = this.f4120;
        return c1443;
    }
}
