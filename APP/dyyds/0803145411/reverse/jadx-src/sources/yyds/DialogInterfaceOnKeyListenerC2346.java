package yyds;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: yyds.ᲁᲇᛵᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC2346 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC2407 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C2711 f11523;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public MenuC0836 f11524;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public DialogC0194 f11525;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        MenuC0836 menuC0836 = this.f11524;
        C2711 c2711 = this.f11523;
        C0447 c0447 = c2711.f13324;
        if (c0447 == null) {
            c0447 = new C0447(c2711);
            c2711.f13324 = c0447;
        }
        menuC0836.m1906(c0447.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f11523.mo1504(this.f11524, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        MenuC0836 menuC0836 = this.f11524;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f11525.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f11525.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                menuC0836.m1914(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return menuC0836.performShortcut(i, keyEvent, 0);
    }

    @Override // yyds.InterfaceC2407
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo391(MenuC0836 menuC0836, boolean z) {
        DialogC0194 dialogC0194;
        if ((z || menuC0836 == this.f11524) && (dialogC0194 = this.f11525) != null) {
            dialogC0194.dismiss();
        }
    }

    @Override // yyds.InterfaceC2407
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final boolean mo404(MenuC0836 menuC0836) {
        return false;
    }
}
