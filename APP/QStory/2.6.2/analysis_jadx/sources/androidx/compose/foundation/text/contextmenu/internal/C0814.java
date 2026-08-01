package androidx.compose.foundation.text.contextmenu.internal;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.foundation.C1087;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0834;
import androidx.compose.runtime.snapshots.C1275;
import kotlin.C5175;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6542;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0814 implements InterfaceC0834 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6542 f2322;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6557 f2323;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f2324;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public ActionMode f2325;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public RunnableC0809 f2327;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Runnable f2328;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1087 f2321 = new C1087();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1275 f2320 = new C1275(new C0796(this, 0));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0796 f2319 = new C0796(this, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0796 f2326 = new C0796(this, 2);

    public C0814(View view, InterfaceC6557 interfaceC6557, InterfaceC6542 interfaceC6542) {
        this.f2324 = view;
        this.f2323 = interfaceC6557;
        this.f2322 = interfaceC6542;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC0834
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object mo1626(InterfaceC0827 interfaceC0827, SuspendLambda suspendLambda) {
        Object objM1991 = C1087.m1991(this.f2321, new AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(this, interfaceC0827, null), suspendLambda);
        return objM1991 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1991 : C5175.f14739;
    }
}
