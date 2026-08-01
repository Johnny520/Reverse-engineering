package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z10 implements android.text.TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ android.view.ViewGroup b;

    public /* synthetic */ z10(android.view.ViewGroup r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    private final void a(android.text.Editable r1) {
            r0 = this;
            return
    }

    private final void b(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    private final void c(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    private final void d(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable r4) {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L1f;
                default: goto L5;
            }
        L5:
            android.view.ViewGroup r0 = r3.b
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            boolean r1 = r0.z0
            r1 = r1 ^ 1
            r2 = 0
            r0.u(r1, r2)
            boolean r1 = r0.k
            if (r1 == 0) goto L18
            r0.n(r4)
        L18:
            boolean r1 = r0.s
            if (r1 == 0) goto L1f
            r0.v(r4)
        L1f:
            return
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            int r1 = r0.a
            return
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence r2, int r3, int r4, int r5) {
            r1 = this;
            int r3 = r1.a
            switch(r3) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            android.view.ViewGroup r3 = r1.b
            androidx.appcompat.widget.SearchView r3 = (androidx.appcompat.widget.SearchView) r3
            androidx.appcompat.widget.SearchView$SearchAutoComplete r4 = r3.p
            android.text.Editable r4 = r4.getText()
            r3.V = r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r5 = r4 ^ 1
            r3.v(r5)
            boolean r5 = r3.U
            r0 = 8
            if (r5 == 0) goto L2d
            boolean r5 = r3.N
            if (r5 != 0) goto L2d
            if (r4 == 0) goto L2d
            android.widget.ImageView r4 = r3.u
            r4.setVisibility(r0)
            r0 = 0
        L2d:
            android.widget.ImageView r4 = r3.w
            r4.setVisibility(r0)
            r3.r()
            r3.u()
            r2.toString()
            return
    }
}
