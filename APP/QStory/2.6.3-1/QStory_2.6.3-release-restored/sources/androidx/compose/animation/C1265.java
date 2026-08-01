package androidx.compose.animation;

import androidx.collection.AbstractC1137;
import androidx.collection.C1083;
import androidx.compose.animation.core.C1201;
import androidx.compose.animation.core.C1210;
import androidx.compose.p001ui.InterfaceC2951;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2230;
import p221.C8735;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1265 implements InterfaceC1264 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C1201 f1712;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1083 f1713;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC2230 f1714 = AbstractC2202.m3034(new C8735(0));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC2951 f1715;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1210 f1716;

    public C1265(C1210 c1210, InterfaceC2951 interfaceC2951) {
        this.f1716 = c1210;
        this.f1715 = interfaceC2951;
        long[] jArr = AbstractC1137.f1352;
        this.f1713 = new C1083();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long m1677(C1265 c1265) {
        C1201 c1201 = c1265.f1712;
        return c1201 != null ? ((C8735) c1201.getValue()).f22224 : ((C8735) ((AbstractC2182) c1265.f1714).getValue()).f22224;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long m1678(C1265 c1265, long j, long j2) {
        return c1265.f1715.mo4419(j, j2, LayoutDirection.Ltr);
    }

    @Override // androidx.compose.animation.core.InterfaceC1199
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo1616() {
        return this.f1716.m1623().mo1616();
    }

    @Override // androidx.compose.animation.core.InterfaceC1199
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo1617() {
        return this.f1716.m1623().mo1617();
    }
}
