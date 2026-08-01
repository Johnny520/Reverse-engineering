package p033;

import android.content.DialogInterface;
import p040.AbstractC6429;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC6330 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17445;

    public /* synthetic */ DialogInterfaceOnDismissListenerC6330(int i) {
        this.f17445 = i;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f17445) {
            case 0:
                String str = AbstractC6333.f17448;
                break;
            default:
                AbstractC6429.f17612.setVisibility(0);
                break;
        }
    }
}
