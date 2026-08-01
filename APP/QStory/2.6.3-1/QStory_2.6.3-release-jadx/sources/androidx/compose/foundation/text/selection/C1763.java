package androidx.compose.foundation.text.selection;

import androidx.compose.p001ui.InterfaceC2951;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.p001ui.window.InterfaceC2933;
import p221.C8734;
import p221.C8737;
import p269.AbstractC9019;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1763 implements InterfaceC2933 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC1756 f2976;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f2977 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC2951 f2978;

    public C1763(InterfaceC2951 interfaceC2951, InterfaceC1756 interfaceC1756) {
        this.f2978 = interfaceC2951;
        this.f2976 = interfaceC1756;
    }

    @Override // androidx.compose.p001ui.window.InterfaceC2933
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final long mo2186(C8734 c8734, long j, LayoutDirection layoutDirection, long j2) {
        long jMo2382 = this.f2976.mo2382();
        if ((9223372034707292159L & jMo2382) == 9205357640488583168L) {
            jMo2382 = this.f2977;
        }
        this.f2977 = jMo2382;
        return C8737.m13921(C8737.m13921(c8734.m13914(), AbstractC9019.m14240(jMo2382)), this.f2978.mo4419(j2, 0L, layoutDirection));
    }
}
