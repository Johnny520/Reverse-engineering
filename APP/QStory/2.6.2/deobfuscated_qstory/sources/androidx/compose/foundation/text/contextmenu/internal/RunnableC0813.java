package androidx.compose.foundation.text.contextmenu.internal;

import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0813 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2317;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2318;

    public /* synthetic */ RunnableC0813(Object obj, int i) {
        this.f2318 = i;
        this.f2317 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2318;
        Object obj = this.f2317;
        switch (i) {
            case 0:
                AndroidTextContextMenuToolbarProvider$showTextContextMenu$2.invokeSuspend$lambda$2((C0814) obj);
                break;
            default:
                ((InterfaceC6542) obj).invoke();
                break;
        }
    }
}
