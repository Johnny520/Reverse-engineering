package com.example.dyhelper.p002ui;

/* JADX INFO: renamed from: com.example.dyhelper.ui.λ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0168 implements android.text.TextWatcher {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ com.example.dyhelper.p002ui.ColorPickerDialog$ColorPickerView f2654;

    public C0168(com.example.dyhelper.p002ui.ColorPickerDialog$ColorPickerView r1) {
            r0 = this;
            r0.<init>()
            r0.f2654 = r1
            return
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable r5) {
            r4 = this;
            com.example.dyhelper.ui.ColorPickerDialog$ColorPickerView r4 = r4.f2654
            boolean r0 = r4.f2470
            if (r0 == 0) goto L8
            goto L7d
        L8:
            r0 = 0
            if (r5 == 0) goto L10
            java.lang.String r5 = r5.toString()
            goto L11
        L10:
            r5 = r0
        L11:
            if (r5 != 0) goto L15
            java.lang.String r5 = ""
        L15:
            java.lang.CharSequence r5 = p000.q02.m4660(r5)
            java.lang.String r5 = r5.toString()
            boolean r1 = r4.f2463
            if (r1 == 0) goto L24
            ym1 r2 = com.example.dyhelper.p002ui.ColorPickerDialog$ColorPickerView.f2455
            goto L26
        L24:
            ym1 r2 = com.example.dyhelper.p002ui.ColorPickerDialog$ColorPickerView.f2454
        L26:
            boolean r2 = r2.m6942(r5)
            r3 = 0
            if (r2 != 0) goto L31
            r4.m1542(r3)
            return
        L31:
            int r5 = android.graphics.Color.parseColor(r5)     // Catch: java.lang.Throwable -> L3a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L3a
            goto L41
        L3a:
            r5 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r5)
            r5 = r2
        L41:
            boolean r2 = r5 instanceof p000.eo1
            if (r2 == 0) goto L46
            goto L47
        L46:
            r0 = r5
        L47:
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L4f
            r4.m1542(r3)
            goto L7d
        L4f:
            if (r1 == 0) goto L5a
            int r5 = r0.intValue()
            int r5 = android.graphics.Color.alpha(r5)
            goto L5c
        L5a:
            r5 = 255(0xff, float:3.57E-43)
        L5c:
            r4.f2467 = r5
            r5 = 1
            r4.m1542(r5)
            int r5 = r0.intValue()
            int r5 = android.graphics.Color.red(r5)
            int r1 = r0.intValue()
            int r1 = android.graphics.Color.green(r1)
            int r0 = r0.intValue()
            int r0 = android.graphics.Color.blue(r0)
            r4.m1534(r5, r1, r0, r3)
        L7d:
            return
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }
}
