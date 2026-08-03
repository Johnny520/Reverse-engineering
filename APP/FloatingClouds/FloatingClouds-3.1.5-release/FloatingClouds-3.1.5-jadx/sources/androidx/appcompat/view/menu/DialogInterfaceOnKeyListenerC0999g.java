package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.DialogInterfaceC0989b;
import androidx.appcompat.view.menu.C0996d.a;
import androidx.appcompat.view.menu.InterfaceC1002j;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.g */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0999g implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC1002j.a {

    /* JADX INFO: renamed from: a */
    public SubMenuC1005m f3808a;

    /* JADX INFO: renamed from: b */
    public DialogInterfaceC0989b f3809b;

    /* JADX INFO: renamed from: c */
    public C0996d f3810c;

    @Override // androidx.appcompat.view.menu.InterfaceC1002j.a
    /* JADX INFO: renamed from: a */
    public final void mo818a(C0998f c0998f, boolean z) {
        DialogInterfaceC0989b dialogInterfaceC0989b;
        if ((z || c0998f == this.f3808a) && (dialogInterfaceC0989b = this.f3809b) != null) {
            dialogInterfaceC0989b.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j.a
    /* JADX INFO: renamed from: b */
    public final boolean mo819b(C0998f c0998f) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0996d c0996d = this.f3810c;
        if (c0996d.f3774g == null) {
            c0996d.f3774g = c0996d.new a();
        }
        this.f3808a.m2332q(c0996d.f3774g.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f3810c.mo2306a(this.f3808a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC1005m subMenuC1005m = this.f3808a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f3809b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f3809b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC1005m.m2318c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC1005m.performShortcut(i, keyEvent, 0);
    }
}
