package p000;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: lu */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0461lu implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0128cv {

    /* JADX INFO: renamed from: a */
    public c50 f3104a;

    /* JADX INFO: renamed from: b */
    public DialogC0246g2 f3105b;

    /* JADX INFO: renamed from: c */
    public C0160dr f3106c;

    @Override // p000.InterfaceC0128cv
    /* JADX INFO: renamed from: a */
    public final void mo829a(MenuC0424ku menuC0424ku, boolean z) {
        DialogC0246g2 dialogC0246g2;
        if ((z || menuC0424ku == this.f3104a) && (dialogC0246g2 = this.f3105b) != null) {
            dialogC0246g2.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        c50 c50Var = this.f3104a;
        C0160dr c0160dr = this.f3106c;
        if (c0160dr.f1627f == null) {
            c0160dr.f1627f = new C0124cr(c0160dr);
        }
        c50Var.m1724q(c0160dr.f1627f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f3106c.mo949a(this.f3104a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        c50 c50Var = this.f3104a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f3105b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f3105b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                c50Var.m1718c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return c50Var.performShortcut(i, keyEvent, 0);
    }

    @Override // p000.InterfaceC0128cv
    /* JADX INFO: renamed from: q */
    public final boolean mo830q(MenuC0424ku menuC0424ku) {
        return false;
    }
}
