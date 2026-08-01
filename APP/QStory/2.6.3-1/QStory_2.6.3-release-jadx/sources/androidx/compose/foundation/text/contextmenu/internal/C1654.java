package androidx.compose.foundation.text.contextmenu.internal;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.foundation.C1925;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC1667;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC1674;
import androidx.compose.runtime.snapshots.C2110;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7372;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1654 implements InterfaceC1674 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7372 f2668;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7387 f2669;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f2670;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public ActionMode f2671;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public RunnableC1649 f2673;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Runnable f2674;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1925 f2667 = new C1925();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2110 f2666 = new C2110(new C1636(this, 0));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1636 f2665 = new C1636(this, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C1636 f2672 = new C1636(this, 2);

    public C1654(View view, InterfaceC7387 interfaceC7387, InterfaceC7372 interfaceC7372) {
        this.f2670 = view;
        this.f2669 = interfaceC7387;
        this.f2668 = interfaceC7372;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC1674
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object mo2196(InterfaceC1667 interfaceC1667, SuspendLambda suspendLambda) {
        Object objM2561 = C1925.m2561(this.f2667, new AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(this, interfaceC1667, null), suspendLambda);
        return objM2561 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2561 : C6008.f15084;
    }
}
