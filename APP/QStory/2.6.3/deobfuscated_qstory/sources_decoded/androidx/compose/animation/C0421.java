package androidx.compose.animation;

import androidx.compose.animation.core.C0354;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/飘花落叶言子楪苏哲世兰;", "S", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/animation/飘花落叶言子楪苏哲兰世;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0421<S> extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC1395 f1374;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0419 f1375;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0354 f1376;

    public C0421(C0354 c0354, InterfaceC1395 interfaceC1395, C0419 c0419) {
        this.f1376 = c0354;
        this.f1374 = interfaceC1395;
        this.f1375 = c0419;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0421)) {
            return false;
        }
        C0421 c0421 = (C0421) obj;
        return AbstractC4395.m8907(c0421.f1376, this.f1376) && c0421.f1374.equals(this.f1374);
    }

    public final int hashCode() {
        int iHashCode = this.f1375.hashCode() * 31;
        C0354 c0354 = this.f1376;
        return this.f1374.hashCode() + ((iHashCode + (c0354 != null ? c0354.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C0422 c0422 = (C0422) abstractC2128;
        c0422.f1377 = this.f1376;
        c0422.f1380 = this.f1374;
        c0422.f1379 = this.f1375;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        C0422 c0422 = new C0422();
        c0422.f1377 = this.f1376;
        c0422.f1380 = this.f1374;
        c0422.f1379 = this.f1375;
        c0422.f1378 = -9223372034707292160L;
        return c0422;
    }
}
