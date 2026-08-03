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
    public final void mo193b(MenuC2204lr r1, boolean r2) {
        if (r2 == false) goto L4;
    L5:
        DialogInterfaceC2697x2 r12 = this.f7949b;
        if (r12 == null) goto L10;
        r12.dismiss();
        return;
    L10:
        return;
    L4:
        if (r1 == this.f7948a) goto L5;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r3, int r4) {
        SubMenuC0214Ez r32 = this.f7948a;
        C2768yo r0 = this.f7950c;
        if (r0.f9414f != null) goto L5;
        r0.f9414f = new C2725xo(r0);
    L5:
        r32.m4436q(r0.f9414f.m5289b(r4), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface r3) {
        this.f7950c.mo213b(this.f7948a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface r4, int r5, KeyEvent r6) {
        SubMenuC0214Ez r0 = this.f7948a;
        if (r5 == 82) goto L7;
        if (r5 == 4) goto L7;
    L33:
        return r0.performShortcut(r5, r6, 0);
    L7:
        if (r6.getAction() != 0) goto L19;
        if (r6.getRepeatCount() != 0) goto L19;
        Window r42 = this.f7949b.getWindow();
        if (r42 == null) goto L33;
        View r43 = r42.getDecorView();
        if (r43 == null) goto L33;
        KeyEvent.DispatcherState r44 = r43.getKeyDispatcherState();
        if (r44 == null) goto L33;
        r44.startTracking(r6, this);
        return true;
    L19:
        if (r6.getAction() != 1) goto L33;
        if (r6.isCanceled() == true) goto L33;
        Window r1 = this.f7949b.getWindow();
        if (r1 == null) goto L33;
        View r12 = r1.getDecorView();
        if (r12 == null) goto L33;
        KeyEvent.DispatcherState r13 = r12.getKeyDispatcherState();
        if (r13 == null) goto L33;
        if (r13.isTracking(r6) == false) goto L33;
        r0.m4430c(true);
        r4.dismiss();
        return true;
    }

    @Override // p000.InterfaceC0120Cr
    /* JADX INFO: renamed from: s */
    public final boolean mo194s(MenuC2204lr r1) {
        return false;
    }
}
