package androidx.compose.ui.window;

import androidx.compose.ui.InterfaceC2118;
import androidx.compose.ui.unit.LayoutDirection;
import p205.C7904;
import p205.C7907;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2096 implements InterfaceC2100 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f6203;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC2118 f6204;

    public C2096(InterfaceC2118 interfaceC2118, long j) {
        this.f6204 = interfaceC2118;
        this.f6203 = j;
    }

    @Override // androidx.compose.ui.window.InterfaceC2100
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final long mo1616(C7904 c7904, long j, LayoutDirection layoutDirection, long j2) {
        long jMo3849 = this.f6204.mo3849(0L, (((long) (c7904.f21879 - c7904.f21881)) << 32) | (((long) (c7904.f21878 - c7904.f21880)) & 4294967295L), layoutDirection);
        long jMo38492 = this.f6204.mo3849(0L, j2, layoutDirection);
        long j3 = (((long) (-((int) (jMo38492 >> 32)))) << 32) | (((long) (-((int) (jMo38492 & 4294967295L)))) & 4294967295L);
        long j4 = this.f6203;
        return C7907.m13334(C7907.m13334(C7907.m13334(c7904.m13327(), jMo3849), j3), (((long) ((int) (j4 & 4294967295L))) & 4294967295L) | (((long) (((int) (j4 >> 32)) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1))) << 32));
    }
}
