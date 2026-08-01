package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class lu implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, cv {
    public c50 a;
    public g2 b;
    public dr c;

    @Override // defpackage.cv
    public final void a(ku r1, boolean r2) {
        if (r2 == false) goto L4;
    L5:
        g2 r12 = this.b;
        if (r12 == null) goto L10;
        r12.dismiss();
        return;
    L10:
        return;
    L4:
        if (r1 == this.a) goto L5;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r3, int r4) {
        c50 r32 = this.a;
        dr r0 = this.c;
        if (r0.f != null) goto L5;
        r0.f = new cr(r0);
    L5:
        r32.q(r0.f.b(r4), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface r3) {
        this.c.a(this.a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface r4, int r5, KeyEvent r6) {
        c50 r0 = this.a;
        if (r5 == 82) goto L7;
        if (r5 == 4) goto L7;
    L33:
        return r0.performShortcut(r5, r6, 0);
    L7:
        if (r6.getAction() != 0) goto L19;
        if (r6.getRepeatCount() != 0) goto L19;
        Window r42 = this.b.getWindow();
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
        Window r1 = this.b.getWindow();
        if (r1 == null) goto L33;
        View r12 = r1.getDecorView();
        if (r12 == null) goto L33;
        KeyEvent.DispatcherState r13 = r12.getKeyDispatcherState();
        if (r13 == null) goto L33;
        if (r13.isTracking(r6) == false) goto L33;
        r0.c(true);
        r4.dismiss();
        return true;
    }

    @Override // defpackage.cv
    public final boolean q(ku r1) {
        return false;
    }
}
