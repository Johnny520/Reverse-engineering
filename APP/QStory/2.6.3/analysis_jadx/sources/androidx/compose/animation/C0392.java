package androidx.compose.animation;

import androidx.compose.animation.core.C0354;
import androidx.compose.animation.core.C0364;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/飘花落叶言子世楪苏哲兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/animation/飘花落叶言子世苏楪兰哲;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0392 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AbstractC0396 f1313;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C0354 f1314;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C0391 f1315;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC0394 f1316;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC6543 f1317;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0354 f1318;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0354 f1319;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0364 f1320;

    public C0392(C0364 c0364, C0354 c0354, C0354 c03542, C0354 c03543, AbstractC0396 abstractC0396, AbstractC0394 abstractC0394, InterfaceC6543 interfaceC6543, C0391 c0391) {
        this.f1320 = c0364;
        this.f1318 = c0354;
        this.f1319 = c03542;
        this.f1314 = c03543;
        this.f1313 = abstractC0396;
        this.f1316 = abstractC0394;
        this.f1317 = interfaceC6543;
        this.f1315 = c0391;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0392)) {
            return false;
        }
        C0392 c0392 = (C0392) obj;
        return AbstractC4395.m8907(c0392.f1320, this.f1320) && AbstractC4395.m8907(c0392.f1318, this.f1318) && AbstractC4395.m8907(c0392.f1319, this.f1319) && AbstractC4395.m8907(c0392.f1314, this.f1314) && c0392.f1313.equals(this.f1313) && AbstractC4395.m8907(c0392.f1316, this.f1316) && c0392.f1317 == this.f1317 && AbstractC4395.m8907(c0392.f1315, this.f1315);
    }

    public final int hashCode() {
        int iHashCode = this.f1320.hashCode() * 31;
        C0354 c0354 = this.f1318;
        int iHashCode2 = (iHashCode + (c0354 != null ? c0354.hashCode() : 0)) * 31;
        C0354 c03542 = this.f1319;
        int iHashCode3 = (iHashCode2 + (c03542 != null ? c03542.hashCode() : 0)) * 31;
        C0354 c03543 = this.f1314;
        return this.f1315.hashCode() + ((this.f1317.hashCode() + ((this.f1316.hashCode() + ((this.f1313.hashCode() + ((iHashCode3 + (c03543 != null ? c03543.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C0397 c0397 = (C0397) abstractC2128;
        c0397.f1331 = this.f1320;
        c0397.f1337 = this.f1318;
        c0397.f1336 = this.f1319;
        c0397.f1335 = this.f1314;
        c0397.f1334 = this.f1313;
        c0397.f1333 = this.f1316;
        c0397.f1332 = this.f1317;
        c0397.f1328 = this.f1315;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC2128 mo1097() {
        return new C0397(this.f1320, this.f1318, this.f1319, this.f1314, this.f1313, this.f1316, this.f1317, this.f1315);
    }
}
