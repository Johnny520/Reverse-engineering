package a;

/* JADX INFO: renamed from: a.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0169h3 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f491a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ ViewOnClickListenerC0169h3(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f491a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            int r4 = r3.f491a
            switch(r4) {
                case 0: goto L8a;
                case 1: goto L82;
                case 2: goto L78;
                case 3: goto L70;
                case 4: goto L68;
                case 5: goto L60;
                case 6: goto L39;
                default: goto L5;
            }
        L5:
            java.lang.Object r4 = r3.b
            a.qc r4 = (a.C0339qc) r4
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
            r4.q()
        L38:
            return
        L39:
            java.lang.Object r4 = r3.b
            com.google.android.material.datepicker.d r4 = (com.google.android.material.datepicker.d) r4
            android.widget.Button r0 = r4.K0
            a.I4 r1 = r4.H()
            boolean r1 = r1.h()
            r0.setEnabled(r1)
            com.google.android.material.internal.CheckableImageButton r0 = r4.I0
            r0.toggle()
            int r0 = r4.x0
            r1 = 1
            if (r0 != r1) goto L55
            r1 = 0
        L55:
            r4.x0 = r1
            com.google.android.material.internal.CheckableImageButton r0 = r4.I0
            r4.L(r0)
            r4.K()
            return
        L60:
            java.lang.Object r4 = r3.b
            a.A3 r4 = (a.A3) r4
            r4.a()
            return
        L68:
            java.lang.Object r4 = r3.b
            a.da r4 = (a.C0104da) r4
            r4.a()
            return
        L70:
            java.lang.Object r4 = r3.b
            a.s7 r4 = (a.InterfaceC0369s7) r4
            r4.a()
            return
        L78:
            java.lang.Object r4 = r3.b
            a.X9$a$a r4 = (a.X9.a.C0000a) r4
            a.A3 r4 = r4.c
            r4.a()
            return
        L82:
            java.lang.Object r4 = r3.b
            a.F5 r4 = (a.F5) r4
            r4.u()
            return
        L8a:
            java.lang.Object r4 = r3.b
            a.l3 r4 = (a.C0240l3) r4
            android.widget.EditText r0 = r4.i
            if (r0 != 0) goto L93
            goto L9f
        L93:
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L9c
            r0.clear()
        L9c:
            r4.q()
        L9f:
            return
    }
}
