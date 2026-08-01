package androidx.compose.foundation.text.contextmenu.internal;

import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1653 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2663;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2664;

    public /* synthetic */ RunnableC1653(Object obj, int i) {
        this.f2664 = i;
        this.f2663 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2664;
        Object obj = this.f2663;
        switch (i) {
            case 0:
                AndroidTextContextMenuToolbarProvider$showTextContextMenu$2.invokeSuspend$lambda$2((C1654) obj);
                break;
            default:
                ((InterfaceC7372) obj).invoke();
                break;
        }
    }
}
