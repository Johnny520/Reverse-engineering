package androidx.compose.foundation.text.contextmenu.internal;

import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0813 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2318;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2319;

    public /* synthetic */ RunnableC0813(Object obj, int i) {
        this.f2319 = i;
        this.f2318 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2319;
        Object obj = this.f2318;
        switch (i) {
            case 0:
                AndroidTextContextMenuToolbarProvider$showTextContextMenu$2.invokeSuspend$lambda$2((C0814) obj);
                break;
            default:
                ((InterfaceC6543) obj).invoke();
                break;
        }
    }
}
