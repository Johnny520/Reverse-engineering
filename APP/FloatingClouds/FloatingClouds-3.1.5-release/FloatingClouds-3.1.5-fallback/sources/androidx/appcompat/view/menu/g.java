package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public final class g implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, androidx.appcompat.view.menu.j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.appcompat.view.menu.m f823a;
    public androidx.appcompat.app.b b;
    public androidx.appcompat.view.menu.d c;

    @Override // androidx.appcompat.view.menu.j.a
    public final void a(androidx.appcompat.view.menu.f r1, boolean r2) {
            r0 = this;
            if (r2 != 0) goto L6
            androidx.appcompat.view.menu.m r2 = r0.f823a
            if (r1 != r2) goto Ld
        L6:
            androidx.appcompat.app.b r1 = r0.b
            if (r1 == 0) goto Ld
            r1.dismiss()
        Ld:
            return
    }

    @Override // androidx.appcompat.view.menu.j.a
    public final boolean b(androidx.appcompat.view.menu.f r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r3, int r4) {
            r2 = this;
            androidx.appcompat.view.menu.d r3 = r2.c
            androidx.appcompat.view.menu.d$a r0 = r3.g
            if (r0 != 0) goto Ld
            androidx.appcompat.view.menu.d$a r0 = new androidx.appcompat.view.menu.d$a
            r0.<init>(r3)
            r3.g = r0
        Ld:
            androidx.appcompat.view.menu.d$a r3 = r3.g
            androidx.appcompat.view.menu.h r3 = r3.c(r4)
            androidx.appcompat.view.menu.m r4 = r2.f823a
            r0 = 0
            r1 = 0
            r4.q(r3, r1, r0)
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r3) {
            r2 = this;
            androidx.appcompat.view.menu.d r3 = r2.c
            androidx.appcompat.view.menu.m r0 = r2.f823a
            r1 = 1
            r3.a(r0, r1)
            return
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(android.content.DialogInterface r4, int r5, android.view.KeyEvent r6) {
            r3 = this;
            androidx.appcompat.view.menu.m r0 = r3.f823a
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
            androidx.appcompat.app.b r4 = r3.b
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
            androidx.appcompat.app.b r1 = r3.b
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
}
