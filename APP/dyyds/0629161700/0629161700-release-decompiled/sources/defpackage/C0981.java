package defpackage;

/* JADX INFO: renamed from: ᛵᲇᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0981 implements android.text.TextWatcher {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f4395;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f4396;

    public /* synthetic */ C0981(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f4396 = r1
            r0.f4395 = r2
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    private final void m1922(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    private final void m1923(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    private final void m1924(android.text.Editable r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    private final void m1925(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable r3) {
            r2 = this;
            int r0 = r2.f4396
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r2 = r2.f4395
            ᲀᲀᛲᛴ r2 = (defpackage.C1732) r2
            boolean r0 = r2.f7665
            if (r0 == 0) goto Lf
            goto L4c
        Lf:
            r2.m3114()
            if (r3 == 0) goto L22
            int r0 = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(r3)
            r1 = -1
            if (r0 == r1) goto L22
            int r0 = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(r3)
            if (r0 == r1) goto L22
            goto L4c
        L22:
            if (r3 != 0) goto L27
            java.lang.String r3 = ""
            goto L2b
        L27:
            java.lang.String r3 = r3.toString()
        L2b:
            r2.f7684 = r3
            r2.m3117()
            ᲇᲇᛶᲁ r3 = r2.f7685
            if (r3 == 0) goto L3a
            java.util.List r0 = r2.m3122()
            r3.f9120 = r0
        L3a:
            ᲇᲇᛶᲁ r3 = r2.f7685
            if (r3 == 0) goto L41
            r3.notifyDataSetChanged()
        L41:
            ᛲᛸᛳᛷ r3 = r2.f7673
            if (r3 == 0) goto L49
            r0 = 0
            r3.setSelection(r0)
        L49:
            r2.m3121()
        L4c:
            return
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            int r0 = r0.f4396
            return
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            int r2 = r0.f4396
            switch(r2) {
                case 0: goto L3a;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r0.f4395
            androidx.appcompat.widget.SearchView r0 = (androidx.appcompat.widget.SearchView) r0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r0.f161
            android.text.Editable r2 = r2.getText()
            r0.f129 = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = r2 ^ 1
            r0.m50(r3)
            boolean r3 = r0.f128
            r4 = 8
            if (r3 == 0) goto L2c
            boolean r3 = r0.f144
            if (r3 != 0) goto L2c
            if (r2 == 0) goto L2c
            android.widget.ImageView r2 = r0.f154
            r2.setVisibility(r4)
            r4 = 0
        L2c:
            android.widget.ImageView r2 = r0.f164
            r2.setVisibility(r4)
            r0.m58()
            r0.m52()
            r1.toString()
        L3a:
            return
    }
}
