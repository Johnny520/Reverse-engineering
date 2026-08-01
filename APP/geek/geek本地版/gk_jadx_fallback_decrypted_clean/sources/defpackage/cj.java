package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cj {
    public final /* synthetic */ defpackage.ej a;

    public cj(defpackage.ej r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final void a(com.google.android.material.textfield.TextInputLayout r5) {
            r4 = this;
            ej r0 = r4.a
            bj r1 = r0.v
            android.widget.EditText r2 = r0.s
            android.widget.EditText r3 = r5.getEditText()
            if (r2 != r3) goto Ld
            return
        Ld:
            android.widget.EditText r2 = r0.s
            if (r2 == 0) goto L2a
            r2.removeTextChangedListener(r1)
            android.widget.EditText r2 = r0.s
            android.view.View$OnFocusChangeListener r2 = r2.getOnFocusChangeListener()
            fj r3 = r0.b()
            android.view.View$OnFocusChangeListener r3 = r3.e()
            if (r2 != r3) goto L2a
            android.widget.EditText r2 = r0.s
            r3 = 0
            r2.setOnFocusChangeListener(r3)
        L2a:
            android.widget.EditText r5 = r5.getEditText()
            r0.s = r5
            if (r5 == 0) goto L35
            r5.addTextChangedListener(r1)
        L35:
            fj r5 = r0.b()
            android.widget.EditText r1 = r0.s
            r5.l(r1)
            fj r5 = r0.b()
            r0.j(r5)
            return
    }
}
