package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yx0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12867;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.EditText f12868;

    public /* synthetic */ yx0(android.widget.EditText r1, int r2) {
            r0 = this;
            r0.f12867 = r2
            r0.f12868 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f12867
            android.widget.EditText r3 = r3.f12868
            switch(r0) {
                case 0: goto L45;
                default: goto L7;
            }
        L7:
            r0 = 1
            r3.setFocusable(r0)     // Catch: java.lang.Throwable -> L38
            r3.setFocusableInTouchMode(r0)     // Catch: java.lang.Throwable -> L38
            r3.requestFocus()     // Catch: java.lang.Throwable -> L38
            android.text.Editable r1 = r3.getText()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L1c
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L38
            goto L1d
        L1c:
            r1 = 0
        L1d:
            r3.setSelection(r1)     // Catch: java.lang.Throwable -> L38
            android.content.Context r1 = r3.getContext()     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L38
            boolean r2 = r1 instanceof android.view.inputmethod.InputMethodManager     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L31
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1     // Catch: java.lang.Throwable -> L38
            goto L32
        L31:
            r1 = 0
        L32:
            if (r1 == 0) goto L44
            r1.showSoftInput(r3, r0)     // Catch: java.lang.Throwable -> L38
            goto L44
        L38:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "显示人员续火消息键盘失败: "
            java.lang.String r1 = "DYHelper"
            p000.AbstractC0602nx.m4143(r0, r3, r1)
        L44:
            return
        L45:
            r3.requestFocus()     // Catch: java.lang.Throwable -> L70
            android.text.Editable r0 = r3.getText()     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L53
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L70
            goto L54
        L53:
            r0 = 0
        L54:
            r3.setSelection(r0)     // Catch: java.lang.Throwable -> L70
            android.content.Context r0 = r3.getContext()     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L70
            boolean r1 = r0 instanceof android.view.inputmethod.InputMethodManager     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L68
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0     // Catch: java.lang.Throwable -> L70
            goto L69
        L68:
            r0 = 0
        L69:
            if (r0 == 0) goto L86
            r1 = 1
            r0.showSoftInput(r3, r1)     // Catch: java.lang.Throwable -> L70
            goto L86
        L70:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DYHelper: 拉起键盘失败: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            p000.C0888ux.m5974(r3)
        L86:
            return
    }
}
