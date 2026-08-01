package androidx.compose.material3;

import androidx.activity.AbstractC0053;
import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0299;
import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/飘花落叶言子哲楪苏世兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/material3/飘花落叶言子哲楪苏兰世;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class C1172 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f3371;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0299 f3372;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC0579 f3373;

    public C1172(InterfaceC0579 interfaceC0579, boolean z, C0299 c0299) {
        this.f3373 = interfaceC0579;
        this.f3371 = z;
        this.f3372 = c0299;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1172)) {
            return false;
        }
        C1172 c1172 = (C1172) obj;
        return AbstractC4395.m8907(this.f3373, c1172.f3373) && this.f3371 == c1172.f3371 && this.f3372.equals(c1172.f3372);
    }

    public final int hashCode() {
        return this.f3372.hashCode() + AbstractC0053.m141(this.f3373.hashCode() * 31, 31, this.f3371);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.f3373 + ", checked=" + this.f3371 + ", animationSpec=" + this.f3372 + ')';
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C1173 c1173 = (C1173) abstractC2128;
        c1173.f3375 = this.f3373;
        boolean z = c1173.f3381;
        boolean z2 = this.f3371;
        if (z != z2) {
            AbstractC1785.m3350(c1173);
        }
        c1173.f3381 = z2;
        c1173.f3380 = this.f3372;
        if (c1173.f3377 == null && !Float.isNaN(c1173.f3374)) {
            c1173.f3377 = AbstractC0330.m1012(c1173.f3374);
        }
        if (c1173.f3378 != null || Float.isNaN(c1173.f3376)) {
            return;
        }
        c1173.f3378 = AbstractC0330.m1012(c1173.f3376);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        C1173 c1173 = new C1173();
        c1173.f3375 = this.f3373;
        c1173.f3381 = this.f3371;
        c1173.f3380 = this.f3372;
        c1173.f3376 = Float.NaN;
        c1173.f3374 = Float.NaN;
        return c1173;
    }
}
