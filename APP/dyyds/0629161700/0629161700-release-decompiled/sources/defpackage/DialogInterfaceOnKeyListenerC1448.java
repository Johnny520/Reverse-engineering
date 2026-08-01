package defpackage;

/* JADX INFO: renamed from: ᛸᛳᛱᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC1448 implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, defpackage.InterfaceC1469 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C0937 f6350;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.DialogC1507 f6351;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.MenuC1701 f6352;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r2, int r3) {
            r1 = this;
            ᲀᛷᛱᲇ r2 = r1.f6352
            ᛵᛷᲇᛱ r1 = r1.f6350
            ᛱᛴᛲᛵ r0 = r1.f4220
            if (r0 != 0) goto Lf
            ᛱᛴᛲᛵ r0 = new ᛱᛴᛲᛵ
            r0.<init>(r1)
            r1.f4220 = r0
        Lf:
            ᛲᛲᛶᲁ r1 = r0.m511(r3)
            r3 = 0
            r0 = 0
            r2.m3085(r1, r0, r3)
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r2) {
            r1 = this;
            ᛵᛷᲇᛱ r2 = r1.f6350
            ᲀᛷᛱᲇ r1 = r1.f6352
            r0 = 1
            r2.mo854(r1, r0)
            return
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(android.content.DialogInterface r4, int r5, android.view.KeyEvent r6) {
            r3 = this;
            ᲀᛷᛱᲇ r0 = r3.f6352
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
            ᛸᛶᛵᲀ r4 = r3.f6351
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
            ᛸᛶᛵᲀ r3 = r3.f6351
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L5b
            android.view.View r3 = r3.getDecorView()
            if (r3 == 0) goto L5b
            android.view.KeyEvent$DispatcherState r3 = r3.getKeyDispatcherState()
            if (r3 == 0) goto L5b
            boolean r3 = r3.isTracking(r6)
            if (r3 == 0) goto L5b
            r0.m3082(r2)
            r4.dismiss()
            return r2
        L5b:
            r3 = 0
            boolean r3 = r0.performShortcut(r5, r6, r3)
            return r3
    }

    @Override // defpackage.InterfaceC1469
    /* JADX INFO: renamed from: ᛳᲁᲈᲁ */
    public final boolean mo2546(defpackage.MenuC1701 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC1469
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo2547(defpackage.MenuC1701 r1, boolean r2) {
            r0 = this;
            if (r2 != 0) goto L6
            ᲀᛷᛱᲇ r2 = r0.f6352
            if (r1 != r2) goto Ld
        L6:
            ᛸᛶᛵᲀ r0 = r0.f6351
            if (r0 == 0) goto Ld
            r0.dismiss()
        Ld:
            return
    }
}
