package androidx.compose.material3;

import androidx.activity.AbstractC0900;
import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1145;
import androidx.compose.foundation.interaction.InterfaceC1420;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.AbstractC2620;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/material3/飘花落叶言子哲楪苏世兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/material3/飘花落叶言子哲楪苏兰世;", "material3"}, m152k = 1, m153mv = {2, 0, 0}, m155xi = 48)
final /* data */ class C2007 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f3716;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1145 f3717;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1420 f3718;

    public C2007(InterfaceC1420 interfaceC1420, boolean z, C1145 c1145) {
        this.f3718 = interfaceC1420;
        this.f3716 = z;
        this.f3717 = c1145;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2007)) {
            return false;
        }
        C2007 c2007 = (C2007) obj;
        return AbstractC5227.m9466(this.f3718, c2007.f3718) && this.f3716 == c2007.f3716 && this.f3717.equals(c2007.f3717);
    }

    public final int hashCode() {
        return this.f3717.hashCode() + AbstractC0900.m701(this.f3718.hashCode() * 31, 31, this.f3716);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.f3718 + ", checked=" + this.f3716 + ", animationSpec=" + this.f3717 + ')';
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C2008 c2008 = (C2008) abstractC2961;
        c2008.f3720 = this.f3718;
        boolean z = c2008.f3726;
        boolean z2 = this.f3716;
        if (z != z2) {
            AbstractC2620.m3910(c2008);
        }
        c2008.f3726 = z2;
        c2008.f3725 = this.f3717;
        if (c2008.f3722 == null && !Float.isNaN(c2008.f3719)) {
            c2008.f3722 = AbstractC1176.m1572(c2008.f3719);
        }
        if (c2008.f3723 != null || Float.isNaN(c2008.f3721)) {
            return;
        }
        c2008.f3723 = AbstractC1176.m1572(c2008.f3721);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C2008 c2008 = new C2008();
        c2008.f3720 = this.f3718;
        c2008.f3726 = this.f3716;
        c2008.f3725 = this.f3717;
        c2008.f3721 = Float.NaN;
        c2008.f3719 = Float.NaN;
        return c2008;
    }
}
