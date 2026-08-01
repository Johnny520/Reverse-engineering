package androidx.compose.p001ui.window;

import androidx.compose.p001ui.InterfaceC2951;
import androidx.compose.p001ui.unit.LayoutDirection;
import p221.C8734;
import p221.C8737;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2929 implements InterfaceC2933 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f6549;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC2951 f6550;

    public C2929(InterfaceC2951 interfaceC2951, long j) {
        this.f6550 = interfaceC2951;
        this.f6549 = j;
    }

    @Override // androidx.compose.p001ui.window.InterfaceC2933
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final long mo2186(C8734 c8734, long j, LayoutDirection layoutDirection, long j2) {
        long jMo4419 = this.f6550.mo4419(0L, (((long) (c8734.f22221 - c8734.f22223)) << 32) | (((long) (c8734.f22220 - c8734.f22222)) & 4294967295L), layoutDirection);
        long jMo44192 = this.f6550.mo4419(0L, j2, layoutDirection);
        long j3 = (((long) (-((int) (jMo44192 >> 32)))) << 32) | (((long) (-((int) (jMo44192 & 4294967295L)))) & 4294967295L);
        long j4 = this.f6549;
        return C8737.m13921(C8737.m13921(C8737.m13921(c8734.m13914(), jMo4419), j3), (((long) ((int) (j4 & 4294967295L))) & 4294967295L) | (((long) (((int) (j4 >> 32)) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1))) << 32));
    }
}
