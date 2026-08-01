package p000;

/* JADX INFO: renamed from: bz */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0094bz implements android.text.TextWatcher {

    /* JADX INFO: renamed from: ε */
    public final android.widget.EditText f1892;

    /* JADX INFO: renamed from: ζ */
    public p000.RunnableC0058az f1893;

    /* JADX INFO: renamed from: η */
    public boolean f1894;

    public C0094bz(android.widget.EditText r1) {
            r0 = this;
            r0.<init>()
            r0.f1892 = r1
            r1 = 1
            r0.f1894 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m1085(android.widget.EditText r4, int r5) {
            r0 = 1
            if (r5 != r0) goto L3d
            if (r4 == 0) goto L3d
            boolean r5 = r4.isAttachedToWindow()
            if (r5 == 0) goto L3d
            android.text.Editable r4 = r4.getEditableText()
            int r5 = android.text.Selection.getSelectionStart(r4)
            int r0 = android.text.Selection.getSelectionEnd(r4)
            jy r1 = p000.C0449jy.m3071()
            r2 = 0
            if (r4 != 0) goto L20
            r3 = r2
            goto L27
        L20:
            r1.getClass()
            int r3 = r4.length()
        L27:
            r1.m3076(r2, r3, r2, r4)
            if (r5 < 0) goto L32
            if (r0 < 0) goto L32
            android.text.Selection.setSelection(r4, r5, r0)
            return
        L32:
            if (r5 < 0) goto L38
            android.text.Selection.setSelection(r4, r5)
            return
        L38:
            if (r0 < 0) goto L3d
            android.text.Selection.setSelection(r4, r0)
        L3d:
            return
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable r1) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence r3, int r4, int r5, int r6) {
            r2 = this;
            android.widget.EditText r0 = r2.f1892
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L4a
            boolean r1 = r2.f1894
            if (r1 == 0) goto L4a
            boolean r1 = p000.C0449jy.m3072()
            if (r1 != 0) goto L13
            goto L4a
        L13:
            if (r5 > r6) goto L4a
            boolean r5 = r3 instanceof android.text.Spannable
            if (r5 == 0) goto L4a
            jy r5 = p000.C0449jy.m3071()
            int r5 = r5.m3073()
            if (r5 == 0) goto L36
            r1 = 1
            if (r5 == r1) goto L2a
            r3 = 3
            if (r5 == r3) goto L36
            goto L4a
        L2a:
            android.text.Spannable r3 = (android.text.Spannable) r3
            jy r2 = p000.C0449jy.m3071()
            int r6 = r6 + r4
            r5 = 0
            r2.m3076(r4, r6, r5, r3)
            return
        L36:
            jy r3 = p000.C0449jy.m3071()
            az r4 = r2.f1893
            if (r4 != 0) goto L45
            az r4 = new az
            r4.<init>(r0)
            r2.f1893 = r4
        L45:
            az r2 = r2.f1893
            r3.m3077(r2)
        L4a:
            return
    }
}
