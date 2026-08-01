package p190;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.DialogInterfaceC0104;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC7798 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC7788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public DialogInterfaceC0104 f21216;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C7778 f21217;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public SubMenuC7774 f21218;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        SubMenuC7774 subMenuC7774 = this.f21218;
        C7778 c7778 = this.f21217;
        if (c7778.f21136 == null) {
            c7778.f21136 = new C7779(c7778);
        }
        subMenuC7774.m13134(c7778.f21136.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f21217.mo612(this.f21218, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC7774 subMenuC7774 = this.f21218;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f21216.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f21216.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC7774.m13126(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC7774.performShortcut(i, keyEvent, 0);
    }

    @Override // p190.InterfaceC7788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo189(MenuC7801 menuC7801, boolean z) {
        DialogInterfaceC0104 dialogInterfaceC0104;
        if ((z || menuC7801 == this.f21218) && (dialogInterfaceC0104 = this.f21216) != null) {
            dialogInterfaceC0104.dismiss();
        }
    }

    @Override // p190.InterfaceC7788
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final boolean mo196(MenuC7801 menuC7801) {
        return false;
    }
}
