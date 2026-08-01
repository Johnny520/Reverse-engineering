package androidx.compose.animation;

import androidx.collection.AbstractC0290;
import androidx.collection.C0236;
import androidx.compose.animation.core.C0355;
import androidx.compose.animation.core.C0364;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.InterfaceC2118;
import androidx.compose.ui.unit.LayoutDirection;
import p205.C7906;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0419 implements InterfaceC0418 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C0355 f1367;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0236 f1368;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC1395 f1369 = AbstractC1367.m2474(new C7906(0));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC2118 f1370;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0364 f1371;

    public C0419(C0364 c0364, InterfaceC2118 interfaceC2118) {
        this.f1371 = c0364;
        this.f1370 = interfaceC2118;
        long[] jArr = AbstractC0290.f1007;
        this.f1368 = new C0236();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long m1117(C0419 c0419) {
        C0355 c0355 = c0419.f1367;
        return c0355 != null ? ((C7906) c0355.getValue()).f21879 : ((C7906) ((AbstractC1347) c0419.f1369).getValue()).f21879;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long m1118(C0419 c0419, long j, long j2) {
        return c0419.f1370.mo3859(j, j2, LayoutDirection.Ltr);
    }

    @Override // androidx.compose.animation.core.InterfaceC0353
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo1056() {
        return this.f1371.m1063().mo1056();
    }

    @Override // androidx.compose.animation.core.InterfaceC0353
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo1057() {
        return this.f1371.m1063().mo1057();
    }
}
