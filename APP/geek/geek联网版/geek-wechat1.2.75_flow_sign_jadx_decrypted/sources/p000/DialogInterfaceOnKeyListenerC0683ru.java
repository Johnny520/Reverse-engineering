package p000;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: ru */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0683ru implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0425kv {

    /* JADX INFO: renamed from: a */
    public j50 f4170a;

    /* JADX INFO: renamed from: b */
    public DialogC0246g2 f4171b;

    /* JADX INFO: renamed from: c */
    public C0308hr f4172c;

    @Override // p000.InterfaceC0425kv
    /* JADX INFO: renamed from: a */
    public final void mo1134a(MenuC0646qu menuC0646qu, boolean z) {
        DialogC0246g2 dialogC0246g2;
        if ((z || menuC0646qu == this.f4170a) && (dialogC0246g2 = this.f4171b) != null) {
            dialogC0246g2.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        j50 j50Var = this.f4170a;
        C0308hr c0308hr = this.f4172c;
        if (c0308hr.f2257f == null) {
            c0308hr.f2257f = new C0271gr(c0308hr);
        }
        j50Var.m2173q(c0308hr.f2257f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f4172c.mo972a(this.f4170a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        j50 j50Var = this.f4170a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f4171b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f4171b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                j50Var.m2167c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return j50Var.performShortcut(i, keyEvent, 0);
    }

    @Override // p000.InterfaceC0425kv
    /* JADX INFO: renamed from: q */
    public final boolean mo1135q(MenuC0646qu menuC0646qu) {
        return false;
    }
}
