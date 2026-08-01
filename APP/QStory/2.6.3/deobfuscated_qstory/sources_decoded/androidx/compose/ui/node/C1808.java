package androidx.compose.ui.node;

import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.InterfaceC2124;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1808 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ C1811 f5277;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f5278;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C1224 f5279;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C1224 f5280;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f5281;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC2128 f5282;

    public C1808(C1811 c1811, AbstractC2128 abstractC2128, int i, C1224 c1224, C1224 c12242, boolean z) {
        this.f5277 = c1811;
        this.f5282 = abstractC2128;
        this.f5281 = i;
        this.f5280 = c1224;
        this.f5279 = c12242;
        this.f5278 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m3413(int i, int i2) {
        C1224 c1224 = this.f5280;
        int i3 = this.f5281;
        InterfaceC2124 interfaceC2124 = (InterfaceC2124) c1224.f3521[i + i3];
        InterfaceC2124 interfaceC21242 = (InterfaceC2124) this.f5279.f3521[i3 + i2];
        return AbstractC4395.m8907(interfaceC2124, interfaceC21242) || interfaceC2124.getClass() == interfaceC21242.getClass();
    }
}
