package p206;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.DialogInterfaceC0951;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC8628 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC8618 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public DialogInterfaceC0951 f21558;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C8608 f21559;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public SubMenuC8604 f21560;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        SubMenuC8604 subMenuC8604 = this.f21560;
        C8608 c8608 = this.f21559;
        if (c8608.f21478 == null) {
            c8608.f21478 = new C8609(c8608);
        }
        subMenuC8604.m13721(c8608.f21478.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f21559.mo1173(this.f21560, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC8604 subMenuC8604 = this.f21560;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f21558.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f21558.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC8604.m13713(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC8604.performShortcut(i, keyEvent, 0);
    }

    @Override // p206.InterfaceC8618
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo750(MenuC8631 menuC8631, boolean z) {
        DialogInterfaceC0951 dialogInterfaceC0951;
        if ((z || menuC8631 == this.f21560) && (dialogInterfaceC0951 = this.f21558) != null) {
            dialogInterfaceC0951.dismiss();
        }
    }

    @Override // p206.InterfaceC8618
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final boolean mo757(MenuC8631 menuC8631) {
        return false;
    }
}
