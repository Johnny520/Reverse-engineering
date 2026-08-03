package androidx.appcompat.view.menu;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnKeyListenerC7346 implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public androidx.appcompat.view.menu.C7343 f25439;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public androidx.appcompat.app.DialogInterfaceC7281 f25440;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public androidx.appcompat.view.menu.C7340 f25441;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 f25442;

    public DialogInterfaceOnKeyListenerC7346(androidx.appcompat.view.menu.C7343 r1) {
            r0 = this;
            r0.<init>()
            r0.f25439 = r1
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r2, int r3) {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r2 = r1.f25439
            androidx.appcompat.view.menu.ۥ۟۟ r0 = r1.f25441
            android.widget.ListAdapter r0 = r0.m28189()
            java.lang.Object r3 = r0.getItem(r3)
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r3 = (androidx.appcompat.view.menu.C7348) r3
            r0 = 0
            r2.performItemAction(r3, r0)
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353
    public void onCloseMenu(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r2, boolean r3) {
            r1 = this;
            if (r3 != 0) goto L6
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r1.f25439
            if (r2 != r0) goto L9
        L6:
            r1.m28212()
        L9:
            androidx.appcompat.view.menu.ۥ۟۟۟ۤ$ۥ r0 = r1.f25442
            if (r0 == 0) goto L10
            r0.onCloseMenu(r2, r3)
        L10:
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r3) {
            r2 = this;
            androidx.appcompat.view.menu.ۥ۟۟ r3 = r2.f25441
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r2.f25439
            r1 = 1
            r3.onCloseMenu(r0, r1)
            return
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface r3, int r4, android.view.KeyEvent r5) {
            r2 = this;
            r0 = 82
            if (r4 == r0) goto L7
            r0 = 4
            if (r4 != r0) goto L5b
        L7:
            int r0 = r5.getAction()
            r1 = 1
            if (r0 != 0) goto L2c
            int r0 = r5.getRepeatCount()
            if (r0 != 0) goto L2c
            androidx.appcompat.app.ۥ۟۟ r3 = r2.f25440
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L5b
            android.view.View r3 = r3.getDecorView()
            if (r3 == 0) goto L5b
            android.view.KeyEvent$DispatcherState r3 = r3.getKeyDispatcherState()
            if (r3 == 0) goto L5b
            r3.startTracking(r5, r2)
            return r1
        L2c:
            int r0 = r5.getAction()
            if (r0 != r1) goto L5b
            boolean r0 = r5.isCanceled()
            if (r0 != 0) goto L5b
            androidx.appcompat.app.ۥ۟۟ r0 = r2.f25440
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L5b
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L5b
            android.view.KeyEvent$DispatcherState r0 = r0.getKeyDispatcherState()
            if (r0 == 0) goto L5b
            boolean r0 = r0.isTracking(r5)
            if (r0 == 0) goto L5b
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r4 = r2.f25439
            r4.close(r1)
            r3.dismiss()
            return r1
        L5b:
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r3 = r2.f25439
            r0 = 0
            boolean r3 = r3.performShortcut(r4, r5, r0)
            return r3
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353
    /* JADX INFO: renamed from: ۥ */
    public boolean mo28095(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r2) {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟ۤ$ۥ r0 = r1.f25442
            if (r0 == 0) goto L9
            boolean r2 = r0.mo28095(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m28212() {
            r1 = this;
            androidx.appcompat.app.ۥ۟۟ r0 = r1.f25440
            if (r0 == 0) goto L7
            r0.dismiss()
        L7:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m28213(androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 r1) {
            r0 = this;
            r0.f25442 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m28214(android.os.IBinder r6) {
            r5 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r5.f25439
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = new androidx.appcompat.app.ۥ۟۟$ۥ
            android.content.Context r2 = r0.getContext()
            r1.<init>(r2)
            androidx.appcompat.view.menu.ۥ۟۟ r2 = new androidx.appcompat.view.menu.ۥ۟۟
            android.content.Context r3 = r1.getContext()
            int r4 = Yue.C5058.C5068.f17202
            r2.<init>(r3, r4)
            r5.f25441 = r2
            r2.setCallback(r5)
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r2 = r5.f25439
            androidx.appcompat.view.menu.ۥ۟۟ r3 = r5.f25441
            r2.addMenuPresenter(r3)
            androidx.appcompat.view.menu.ۥ۟۟ r2 = r5.f25441
            android.widget.ListAdapter r2 = r2.m28189()
            r1.setAdapter(r2, r5)
            android.view.View r2 = r0.getHeaderView()
            if (r2 == 0) goto L35
            r1.setCustomTitle(r2)
            goto L44
        L35:
            android.graphics.drawable.Drawable r2 = r0.getHeaderIcon()
            androidx.appcompat.app.ۥ۟۟$ۥ r2 = r1.setIcon(r2)
            java.lang.CharSequence r0 = r0.getHeaderTitle()
            r2.setTitle(r0)
        L44:
            r1.setOnKeyListener(r5)
            androidx.appcompat.app.ۥ۟۟ r0 = r1.create()
            r5.f25440 = r0
            r0.setOnDismissListener(r5)
            androidx.appcompat.app.ۥ۟۟ r0 = r5.f25440
            android.view.Window r0 = r0.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            r1 = 1003(0x3eb, float:1.406E-42)
            r0.type = r1
            if (r6 == 0) goto L62
            r0.token = r6
        L62:
            int r6 = r0.flags
            r1 = 131072(0x20000, float:1.83671E-40)
            r6 = r6 | r1
            r0.flags = r6
            androidx.appcompat.app.ۥ۟۟ r6 = r5.f25440
            r6.show()
            return
    }
}
