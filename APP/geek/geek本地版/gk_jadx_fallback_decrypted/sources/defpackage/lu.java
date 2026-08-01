package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lu implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, defpackage.cv {
    public defpackage.c50 a;
    public defpackage.g2 b;
    public defpackage.dr c;

    @Override // defpackage.cv
    public final void a(defpackage.ku r1, boolean r2) {
            r0 = this;
            if (r2 != 0) goto L6
            c50 r2 = r0.a
            if (r1 != r2) goto Ld
        L6:
            g2 r1 = r0.b
            if (r1 == 0) goto Ld
            r1.dismiss()
        Ld:
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r3, int r4) {
            r2 = this;
            c50 r3 = r2.a
            dr r0 = r2.c
            cr r1 = r0.f
            if (r1 != 0) goto Lf
            cr r1 = new cr
            r1.<init>(r0)
            r0.f = r1
        Lf:
            cr r0 = r0.f
            ou r4 = r0.b(r4)
            r0 = 0
            r1 = 0
            r3.q(r4, r1, r0)
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r3) {
            r2 = this;
            dr r3 = r2.c
            c50 r0 = r2.a
            r1 = 1
            r3.a(r0, r1)
            return
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(android.content.DialogInterface r4, int r5, android.view.KeyEvent r6) {
            r3 = this;
            c50 r0 = r3.a
            r1 = 82
            if (r5 == r1) goto L9
            r1 = 4
            if (r5 != r1) goto L5b
        L9:
            int r1 = r6.getAction()
            r2 = 1
            if (r1 != 0) goto L2e
            int r1 = r6.getRepeatCount()
            if (r1 != 0) goto L2e
            g2 r4 = r3.b
            android.view.Window r4 = r4.getWindow()
            if (r4 == 0) goto L5b
            android.view.View r4 = r4.getDecorView()
            if (r4 == 0) goto L5b
            android.view.KeyEvent$DispatcherState r4 = r4.getKeyDispatcherState()
            if (r4 == 0) goto L5b
            r4.startTracking(r6, r3)
            return r2
        L2e:
            int r1 = r6.getAction()
            if (r1 != r2) goto L5b
            boolean r1 = r6.isCanceled()
            if (r1 != 0) goto L5b
            g2 r1 = r3.b
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L5b
            android.view.View r1 = r1.getDecorView()
            if (r1 == 0) goto L5b
            android.view.KeyEvent$DispatcherState r1 = r1.getKeyDispatcherState()
            if (r1 == 0) goto L5b
            boolean r1 = r1.isTracking(r6)
            if (r1 == 0) goto L5b
            r0.c(r2)
            r4.dismiss()
            return r2
        L5b:
            r4 = 0
            boolean r4 = r0.performShortcut(r5, r6, r4)
            return r4
    }

    @Override // defpackage.cv
    public final boolean q(defpackage.ku r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
