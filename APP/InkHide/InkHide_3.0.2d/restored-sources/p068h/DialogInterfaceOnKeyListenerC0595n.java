package p068h;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p061e.DialogInterfaceC0532h;

/* JADX INFO: renamed from: h.n */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0595n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0606y {

    /* JADX INFO: renamed from: b */
    public SubMenuC0581F f2054b;

    /* JADX INFO: renamed from: c */
    public DialogInterfaceC0532h f2055c;

    /* JADX INFO: renamed from: d */
    public C0590i f2056d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0606y
    /* JADX INFO: renamed from: b */
    public final void mo132b(MenuC0594m menuC0594m, boolean z2) {
        DialogInterfaceC0532h dialogInterfaceC0532h;
        if ((z2 || menuC0594m == this.f2054b) && (dialogInterfaceC0532h = this.f2055c) != null) {
            dialogInterfaceC0532h.dismiss();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0606y
    /* JADX INFO: renamed from: m */
    public final boolean mo142m(MenuC0594m menuC0594m) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        C0590i c0590i = this.f2056d;
        if (c0590i.f2022g == null) {
            c0590i.f2022g = new C0589h(c0590i);
        }
        this.f2054b.m1190q(c0590i.f2022g.getItem(i2), null, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f2056d.mo1147b(this.f2054b, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0581F subMenuC0581F = this.f2054b;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2055c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2055c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0581F.m1184c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0581F.performShortcut(i2, keyEvent, 0);
    }
}
