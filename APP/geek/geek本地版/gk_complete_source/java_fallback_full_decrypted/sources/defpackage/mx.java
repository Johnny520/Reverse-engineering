package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mx extends defpackage.fj {
    public final int e;
    public android.widget.EditText f;
    public final defpackage.qa g;

    public mx(defpackage.ej r2, int r3) {
            r1 = this;
            r1.<init>(r2)
            r2 = 2131230853(0x7f080085, float:1.807777E38)
            r1.e = r2
            qa r2 = new qa
            r0 = 6
            r2.<init>(r0, r1)
            r1.g = r2
            if (r3 == 0) goto L14
            r1.e = r3
        L14:
            return
    }

    @Override // defpackage.fj
    public final void b() {
            r0 = this;
            r0.p()
            return
    }

    @Override // defpackage.fj
    public final int c() {
            r1 = this;
            r0 = 2131755156(0x7f100094, float:1.9141183E38)
            return r0
    }

    @Override // defpackage.fj
    public final int d() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    @Override // defpackage.fj
    public final android.view.View.OnClickListener f() {
            r1 = this;
            qa r0 = r1.g
            return r0
    }

    @Override // defpackage.fj
    public final boolean j() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.fj
    public final boolean k() {
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

    @Override // defpackage.fj
    public final void l(android.widget.EditText r1) {
            r0 = this;
            r0.f = r1
            r0.p()
            return
    }

    @Override // defpackage.fj
    public final void q() {
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

    @Override // defpackage.fj
    public final void r() {
            r2 = this;
            android.widget.EditText r0 = r2.f
            if (r0 == 0) goto Lb
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            r0.setTransformationMethod(r1)
        Lb:
            return
    }
}
