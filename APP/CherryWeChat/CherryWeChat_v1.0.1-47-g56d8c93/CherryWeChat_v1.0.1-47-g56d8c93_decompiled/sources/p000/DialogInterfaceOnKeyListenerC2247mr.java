package p000;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: mr */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC2247mr implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0120Cr {

    /* JADX INFO: renamed from: a */
    public SubMenuC0214Ez f7948a;

    /* JADX INFO: renamed from: b */
    public DialogInterfaceC2697x2 f7949b;

    /* JADX INFO: renamed from: c */
    public C2768yo f7950c;

    @Override // p000.InterfaceC0120Cr
    /* JADX INFO: renamed from: b */
    public final void mo193b(MenuC2204lr menuC2204lr, boolean z) {
        DialogInterfaceC2697x2 dialogInterfaceC2697x2;
        if ((z || menuC2204lr == this.f7948a) && (dialogInterfaceC2697x2 = this.f7949b) != null) {
            dialogInterfaceC2697x2.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        SubMenuC0214Ez subMenuC0214Ez = this.f7948a;
        C2768yo c2768yo = this.f7950c;
        if (c2768yo.f9414f == null) {
            c2768yo.f9414f = new C2725xo(c2768yo);
        }
        subMenuC0214Ez.m4436q(c2768yo.f9414f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f7950c.mo213b(this.f7948a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0214Ez subMenuC0214Ez = this.f7948a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f7949b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f7949b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0214Ez.m4430c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0214Ez.performShortcut(i, keyEvent, 0);
    }

    @Override // p000.InterfaceC0120Cr
    /* JADX INFO: renamed from: s */
    public final boolean mo194s(MenuC2204lr menuC2204lr) {
        return false;
    }
}
