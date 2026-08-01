package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class jz0 implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, p000.tz0 {

    /* JADX INFO: renamed from: ε */
    public p000.b12 f5673;

    /* JADX INFO: renamed from: ζ */
    public p000.DialogInterfaceC0929w f5674;

    /* JADX INFO: renamed from: η */
    public p000.cu0 f5675;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r2, int r3) {
            r1 = this;
            b12 r2 = r1.f5673
            cu0 r1 = r1.f5675
            bu0 r0 = r1.f2757
            if (r0 != 0) goto Lf
            bu0 r0 = new bu0
            r0.<init>(r1)
            r1.f2757 = r0
        Lf:
            bu0 r1 = r1.f2757
            lz0 r1 = r1.m1027(r3)
            r3 = 0
            r0 = 0
            r2.m2837(r1, r0, r3)
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r2) {
            r1 = this;
            cu0 r2 = r1.f5675
            b12 r1 = r1.f5673
            r0 = 1
            r2.mo320(r1, r0)
            return
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(android.content.DialogInterface r4, int r5, android.view.KeyEvent r6) {
            r3 = this;
            b12 r0 = r3.f5673
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
            w r4 = r3.f5674
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
            w r3 = r3.f5674
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L5b
            android.view.View r3 = r3.getDecorView()
            if (r3 == 0) goto L5b
            android.view.KeyEvent$DispatcherState r3 = r3.getKeyDispatcherState()
            if (r3 == 0) goto L5b
            boolean r3 = r3.isTracking(r6)
            if (r3 == 0) goto L5b
            r0.m2831(r2)
            r4.dismiss()
            return r2
        L5b:
            r3 = 0
            boolean r3 = r0.performShortcut(r5, r6, r3)
            return r3
    }

    @Override // p000.tz0
    /* JADX INFO: renamed from: α */
    public final void mo3078(p000.iz0 r1, boolean r2) {
            r0 = this;
            if (r2 != 0) goto L6
            b12 r2 = r0.f5673
            if (r1 != r2) goto Ld
        L6:
            w r0 = r0.f5674
            if (r0 == 0) goto Ld
            r0.dismiss()
        Ld:
            return
    }

    @Override // p000.tz0
    /* JADX INFO: renamed from: λ */
    public final boolean mo3079(p000.iz0 r1) {
            r0 = this;
            r0 = 0
            return r0
    }
}
