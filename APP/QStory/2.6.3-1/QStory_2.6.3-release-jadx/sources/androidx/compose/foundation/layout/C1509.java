package androidx.compose.foundation.layout;

import androidx.activity.compose.C0849;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.node.InterfaceC2608;
import kotlin.collections.AbstractC5171;
import p221.AbstractC8726;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1509 extends AbstractC2961 implements InterfaceC2608 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public float f2200;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f2201;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public float f2202;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public float f2203;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public float f2204;

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        int iMo1903 = interfaceC2488.mo1903(this.f2203) + interfaceC2488.mo1903(this.f2200);
        int iMo19032 = interfaceC2488.mo1903(this.f2202) + interfaceC2488.mo1903(this.f2204);
        AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(AbstractC8726.m13888(-iMo1903, -iMo19032, j));
        return interfaceC2488.mo2055(AbstractC8726.m13886(abstractC2559Mo3615.f5344 + iMo1903, j), AbstractC8726.m13879(abstractC2559Mo3615.f5342 + iMo19032, j), AbstractC5171.m9335(), new C0849(this, 8, abstractC2559Mo3615));
    }
}
