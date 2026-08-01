package defpackage;

/* JADX INFO: renamed from: ᛱᛷᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0135 implements android.text.TextWatcher {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1630 f1075;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1076;

    public /* synthetic */ C0135(defpackage.C1630 r1, int r2) {
            r0 = this;
            r0.f1076 = r2
            r0.f1075 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    private final void m651(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    private final void m652(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    private final void m653(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    private final void m654(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable r5) {
            r4 = this;
            int r0 = r4.f1076
            r1 = 0
            ᲀᛲᛶᲈ r4 = r4.f1075
            switch(r0) {
                case 0: goto L2c;
                default: goto L8;
            }
        L8:
            android.widget.TextView r4 = r4.f7266
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r5 == 0) goto L15
            int r1 = r5.length()
        L15:
            r0.append(r1)
            r1 = -125022487617070(0xffff8e4aef0961d2, double:NaN)
            java.lang.String r5 = "/500"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.setText(r5)
            return
        L2c:
            if (r5 == 0) goto L3e
            java.lang.String r5 = r5.toString()
            if (r5 == 0) goto L3e
            java.lang.CharSequence r5 = defpackage.AbstractC1347.m2521(r5)
            java.lang.String r5 = r5.toString()
            if (r5 != 0) goto L47
        L3e:
            r2 = -105768149229102(0xffff9fcdef0961d2, double:NaN)
            java.lang.String r5 = ""
        L47:
            android.widget.ImageView r0 = r4.f7240
            if (r0 == 0) goto L57
            int r2 = r5.length()
            if (r2 <= 0) goto L52
            goto L54
        L52:
            r1 = 8
        L54:
            r0.setVisibility(r1)
        L57:
            r4.m2986(r5)
            return
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            int r0 = r0.f1076
            return
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            int r0 = r0.f1076
            return
    }
}
