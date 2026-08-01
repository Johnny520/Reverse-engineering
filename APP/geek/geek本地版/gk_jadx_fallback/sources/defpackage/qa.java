package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qa implements android.view.View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ qa(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L76;
                case 1: goto L6e;
                case 2: goto L66;
                case 3: goto L4a;
                case 4: goto L42;
                case 5: goto L39;
                default: goto L5;
            }
        L5:
            java.lang.Object r4 = r3.b
            mx r4 = (defpackage.mx) r4
            android.widget.EditText r0 = r4.f
            if (r0 != 0) goto Le
            goto L38
        Le:
            int r0 = r0.getSelectionEnd()
            android.widget.EditText r1 = r4.f
            if (r1 == 0) goto L25
            android.text.method.TransformationMethod r1 = r1.getTransformationMethod()
            boolean r1 = r1 instanceof android.text.method.PasswordTransformationMethod
            if (r1 == 0) goto L25
            android.widget.EditText r1 = r4.f
            r2 = 0
            r1.setTransformationMethod(r2)
            goto L2e
        L25:
            android.widget.EditText r1 = r4.f
            android.text.method.PasswordTransformationMethod r2 = android.text.method.PasswordTransformationMethod.getInstance()
            r1.setTransformationMethod(r2)
        L2e:
            if (r0 < 0) goto L35
            android.widget.EditText r1 = r4.f
            r1.setSelection(r0)
        L35:
            r4.p()
        L38:
            return
        L39:
            java.lang.Object r4 = r3.b
            bu r4 = (defpackage.bu) r4
            r4.E()
            r4 = 0
            throw r4
        L42:
            java.lang.Object r0 = r3.b
            com.ljx.wechatmod.ui.MainActivity r0 = (com.ljx.wechatmod.ui.MainActivity) r0
            com.ljx.wechatmod.ui.MainActivity.f(r0, r4)
            return
        L4a:
            java.lang.Object r0 = r3.b
            android.widget.TextView r0 = (android.widget.TextView) r0
            gn r1 = defpackage.gn.a
            defpackage.ip.l(r4)
            r1.getClass()
            r1 = 1
            defpackage.gn.i(r4, r1)
            java.lang.String r4 = "2c899JCRHfOG\n"
            java.lang.String r1 = "PHiPEigU+lo=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r1)
            r0.setText(r4)
            return
        L66:
            java.lang.Object r4 = r3.b
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r4.performClick()
            return
        L6e:
            java.lang.Object r4 = r3.b
            ph r4 = (defpackage.ph) r4
            r4.t()
            return
        L76:
            java.lang.Object r4 = r3.b
            ua r4 = (defpackage.ua) r4
            android.widget.EditText r0 = r4.i
            if (r0 != 0) goto L7f
            goto L8b
        L7f:
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L88
            r0.clear()
        L88:
            r4.p()
        L8b:
            return
    }
}
