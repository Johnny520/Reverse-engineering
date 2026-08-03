package androidx.appcompat.view.menu;

import Yue.C6898;
import Yue.InterfaceC6391;
import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogInterfaceC8650;
import androidx.appcompat.view.menu.InterfaceC8699;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnKeyListenerC8695 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC8699.InterfaceC1607 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C8694 f26029;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public DialogInterfaceC8650 f26030;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C8692 f26031;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public InterfaceC8699.InterfaceC1607 f26032;

    public DialogInterfaceOnKeyListenerC8695(C8694 c8694) {
        this.f26029 = c8694;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f26029.performItemAction((C8697) this.f26031.m4643().getItem(i), 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699.InterfaceC1607
    public void onCloseMenu(@InterfaceC6391 C8694 c8694, boolean z) {
        if (z || c8694 == this.f26029) {
            m4651();
        }
        InterfaceC8699.InterfaceC1607 interfaceC1607 = this.f26032;
        if (interfaceC1607 != null) {
            interfaceC1607.onCloseMenu(c8694, z);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f26031.onCloseMenu(this.f26029, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f26030.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f26030.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f26029.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f26029.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699.InterfaceC1607
    /* JADX INFO: renamed from: ۥ */
    public boolean mo4617(@InterfaceC6391 C8694 c8694) {
        InterfaceC8699.InterfaceC1607 interfaceC1607 = this.f26032;
        if (interfaceC1607 != null) {
            return interfaceC1607.mo4617(c8694);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m4651() {
        DialogInterfaceC8650 dialogInterfaceC8650 = this.f26030;
        if (dialogInterfaceC8650 != null) {
            dialogInterfaceC8650.dismiss();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m29024(InterfaceC8699.InterfaceC1607 interfaceC1607) {
        this.f26032 = interfaceC1607;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m29025(IBinder iBinder) {
        C8694 c8694 = this.f26029;
        DialogInterfaceC8650.C1585 c1585 = new DialogInterfaceC8650.C1585(c8694.getContext());
        C8692 c8692 = new C8692(c1585.getContext(), C6898.C6906.f18984);
        this.f26031 = c8692;
        c8692.setCallback(this);
        this.f26029.addMenuPresenter(this.f26031);
        c1585.setAdapter(this.f26031.m4643(), this);
        View headerView = c8694.getHeaderView();
        if (headerView != null) {
            c1585.setCustomTitle(headerView);
        } else {
            c1585.setIcon(c8694.getHeaderIcon()).setTitle(c8694.getHeaderTitle());
        }
        c1585.setOnKeyListener(this);
        DialogInterfaceC8650 dialogInterfaceC8650Create = c1585.create();
        this.f26030 = dialogInterfaceC8650Create;
        dialogInterfaceC8650Create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f26030.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f26030.show();
    }
}
