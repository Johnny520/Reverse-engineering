package a;

/* JADX INFO: renamed from: a.qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0339qc extends a.AbstractC0082c6 {
    public final int e;
    public android.widget.EditText f;
    public final a.ViewOnClickListenerC0169h3 g;

    public C0339qc(com.google.android.material.textfield.a r2, int r3) {
            r1 = this;
            r1.<init>(r2)
            int r2 = com.google.android.material.R.drawable.design_password_eye
            r1.e = r2
            a.h3 r2 = new a.h3
            r0 = 7
            r2.<init>(r0, r1)
            r1.g = r2
            if (r3 == 0) goto L13
            r1.e = r3
        L13:
            return
    }

    @Override // a.AbstractC0082c6
    public final void b() {
            r0 = this;
            r0.q()
            return
    }

    @Override // a.AbstractC0082c6
    public final int c() {
            r1 = this;
            int r0 = com.google.android.material.R.string.password_toggle_content_description
            return r0
    }

    @Override // a.AbstractC0082c6
    public final int d() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    @Override // a.AbstractC0082c6
    public final android.view.View.OnClickListener f() {
            r1 = this;
            a.h3 r0 = r1.g
            return r0
    }

    @Override // a.AbstractC0082c6
    public final boolean k() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // a.AbstractC0082c6
    public final boolean l() {
            r2 = this;
            android.widget.EditText r0 = r2.f
            r1 = 1
            if (r0 == 0) goto Lf
            android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            if (r0 == 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = 0
        L10:
            r0 = r0 ^ r1
            return r0
    }

    @Override // a.AbstractC0082c6
    public final void m(android.widget.EditText r1) {
            r0 = this;
            r0.f = r1
            r0.q()
            return
    }

    @Override // a.AbstractC0082c6
    public final void r() {
            r3 = this;
            android.widget.EditText r0 = r3.f
            if (r0 == 0) goto L2d
            int r1 = r0.getInputType()
            r2 = 16
            if (r1 == r2) goto L24
            int r1 = r0.getInputType()
            r2 = 128(0x80, float:1.8E-43)
            if (r1 == r2) goto L24
            int r1 = r0.getInputType()
            r2 = 144(0x90, float:2.02E-43)
            if (r1 == r2) goto L24
            int r0 = r0.getInputType()
            r1 = 224(0xe0, float:3.14E-43)
            if (r0 != r1) goto L2d
        L24:
            android.widget.EditText r0 = r3.f
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            r0.setTransformationMethod(r1)
        L2d:
            return
    }

    @Override // a.AbstractC0082c6
    public final void s() {
            r2 = this;
            android.widget.EditText r0 = r2.f
            if (r0 == 0) goto Lb
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            r0.setTransformationMethod(r1)
        Lb:
            return
    }
}
