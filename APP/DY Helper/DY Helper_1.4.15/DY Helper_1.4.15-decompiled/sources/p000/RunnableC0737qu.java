package p000;

/* JADX INFO: renamed from: qu */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0737qu implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9107;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f9108;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.widget.EditText f9109;

    public /* synthetic */ RunnableC0737qu(android.app.Activity r1, android.widget.EditText r2, int r3) {
            r0 = this;
            r0.f9107 = r3
            r0.f9108 = r1
            r0.f9109 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f9107
            switch(r0) {
                case 0: goto Le4;
                case 1: goto Lb8;
                case 2: goto L69;
                default: goto L5;
            }
        L5:
            android.app.Activity r0 = r4.f9108
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L68
            boolean r1 = r0.isDestroyed()
            if (r1 == 0) goto L14
            goto L68
        L14:
            android.app.AlertDialog r1 = p000.bv1.f1854
            if (r1 == 0) goto L29
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L29
            r2 = 131080(0x20008, float:1.83682E-40)
            r1.clearFlags(r2)
            r2 = 16
            r1.setSoftInputMode(r2)
        L29:
            android.widget.EditText r4 = r4.f9109
            r1 = 1
            r4.setEnabled(r1)
            r4.setFocusable(r1)
            r4.setFocusableInTouchMode(r1)
            r4.setCursorVisible(r1)
            r4.requestFocus()
            android.text.Editable r2 = r4.getText()
            if (r2 == 0) goto L46
            int r2 = r2.length()
            goto L47
        L46:
            r2 = 0
        L47:
            r4.setSelection(r2)
            java.lang.String r2 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r2)
            boolean r2 = r0 instanceof android.view.inputmethod.InputMethodManager
            if (r2 == 0) goto L57
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            goto L58
        L57:
            r0 = 0
        L58:
            if (r0 == 0) goto L5d
            r0.showSoftInput(r4, r1)
        L5d:
            wl0 r1 = new wl0
            r2 = 1
            r1.<init>(r0, r4, r2)
            r2 = 80
            r4.postDelayed(r1, r2)
        L68:
            return
        L69:
            android.app.Activity r0 = r4.f9108
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto Lb7
            boolean r1 = r0.isDestroyed()
            if (r1 == 0) goto L78
            goto Lb7
        L78:
            android.widget.EditText r4 = r4.f9109
            r1 = 1
            r4.setEnabled(r1)
            r4.setFocusable(r1)
            r4.setFocusableInTouchMode(r1)
            r4.setCursorVisible(r1)
            r4.requestFocus()
            android.text.Editable r2 = r4.getText()
            if (r2 == 0) goto L95
            int r2 = r2.length()
            goto L96
        L95:
            r2 = 0
        L96:
            r4.setSelection(r2)
            java.lang.String r2 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r2)
            boolean r2 = r0 instanceof android.view.inputmethod.InputMethodManager
            if (r2 == 0) goto La6
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            goto La7
        La6:
            r0 = 0
        La7:
            if (r0 == 0) goto Lac
            r0.showSoftInput(r4, r1)
        Lac:
            wl0 r1 = new wl0
            r2 = 0
            r1.<init>(r0, r4, r2)
            r2 = 80
            r4.postDelayed(r1, r2)
        Lb7:
            return
        Lb8:
            android.app.Activity r0 = r4.f9108
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto Le3
            boolean r1 = r0.isDestroyed()
            if (r1 != 0) goto Le3
            android.widget.EditText r4 = r4.f9109
            boolean r1 = r4.isAttachedToWindow()
            if (r1 != 0) goto Lcf
            goto Le3
        Lcf:
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            boolean r1 = r0 instanceof android.view.inputmethod.InputMethodManager
            if (r1 == 0) goto Ldc
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            goto Ldd
        Ldc:
            r0 = 0
        Ldd:
            if (r0 == 0) goto Le3
            r1 = 1
            r0.showSoftInput(r4, r1)
        Le3:
            return
        Le4:
            android.widget.EditText r0 = r4.f9109
            android.app.Activity r4 = r4.f9108
            boolean r1 = r4.isFinishing()
            if (r1 != 0) goto L11f
            boolean r1 = r4.isDestroyed()
            if (r1 == 0) goto Lf5
            goto L11f
        Lf5:
            r1 = 1
            r0.setFocusable(r1)     // Catch: java.lang.Throwable -> L113
            r0.setFocusableInTouchMode(r1)     // Catch: java.lang.Throwable -> L113
            r0.requestFocus()     // Catch: java.lang.Throwable -> L113
            java.lang.String r2 = "input_method"
            java.lang.Object r4 = r4.getSystemService(r2)     // Catch: java.lang.Throwable -> L113
            boolean r2 = r4 instanceof android.view.inputmethod.InputMethodManager     // Catch: java.lang.Throwable -> L113
            if (r2 == 0) goto L10c
            android.view.inputmethod.InputMethodManager r4 = (android.view.inputmethod.InputMethodManager) r4     // Catch: java.lang.Throwable -> L113
            goto L10d
        L10c:
            r4 = 0
        L10d:
            if (r4 == 0) goto L11f
            r4.showSoftInput(r0, r1)     // Catch: java.lang.Throwable -> L113
            goto L11f
        L113:
            r4 = move-exception
            java.lang.String r0 = r4.getMessage()
            java.lang.String r1 = "拉起键盘失败: "
            java.lang.String r2 = "DYHelper"
            p000.AbstractC0602nx.m4145(r1, r0, r2, r4)
        L11f:
            return
    }
}
