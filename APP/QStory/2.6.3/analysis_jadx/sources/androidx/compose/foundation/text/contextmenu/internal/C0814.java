package androidx.compose.foundation.text.contextmenu.internal;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.foundation.C1087;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0834;
import androidx.compose.runtime.snapshots.C1275;
import kotlin.C5176;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6543;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0814 implements InterfaceC0834 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6543 f2323;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6558 f2324;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f2325;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public ActionMode f2326;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public RunnableC0809 f2328;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Runnable f2329;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1087 f2322 = new C1087();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1275 f2321 = new C1275(new C0796(this, 0));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0796 f2320 = new C0796(this, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0796 f2327 = new C0796(this, 2);

    public C0814(View view, InterfaceC6558 interfaceC6558, InterfaceC6543 interfaceC6543) {
        this.f2325 = view;
        this.f2324 = interfaceC6558;
        this.f2323 = interfaceC6543;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC0834
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object mo1636(InterfaceC0827 interfaceC0827, SuspendLambda suspendLambda) {
        Object objM2001 = C1087.m2001(this.f2322, new AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(this, interfaceC0827, null), suspendLambda);
        return objM2001 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2001 : C5176.f14739;
    }
}
