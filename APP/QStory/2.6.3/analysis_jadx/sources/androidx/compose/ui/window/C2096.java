package androidx.compose.ui.window;

import androidx.compose.ui.InterfaceC2118;
import androidx.compose.ui.unit.LayoutDirection;
import p205.C7905;
import p205.C7908;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2096 implements InterfaceC2100 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f6204;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC2118 f6205;

    public C2096(InterfaceC2118 interfaceC2118, long j) {
        this.f6205 = interfaceC2118;
        this.f6204 = j;
    }

    @Override // androidx.compose.ui.window.InterfaceC2100
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final long mo1626(C7905 c7905, long j, LayoutDirection layoutDirection, long j2) {
        long jMo3859 = this.f6205.mo3859(0L, (((long) (c7905.f21876 - c7905.f21878)) << 32) | (((long) (c7905.f21875 - c7905.f21877)) & 4294967295L), layoutDirection);
        long jMo38592 = this.f6205.mo3859(0L, j2, layoutDirection);
        long j3 = (((long) (-((int) (jMo38592 >> 32)))) << 32) | (((long) (-((int) (jMo38592 & 4294967295L)))) & 4294967295L);
        long j4 = this.f6204;
        return C7908.m13362(C7908.m13362(C7908.m13362(c7905.m13355(), jMo3859), j3), (((long) ((int) (j4 & 4294967295L))) & 4294967295L) | (((long) (((int) (j4 >> 32)) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1))) << 32));
    }
}
