package defpackage;

/* JADX INFO: renamed from: ᛱᛶᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0111 implements android.text.TextWatcher {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ android.view.View f970;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0395 f971;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f972;

    public /* synthetic */ C0111(defpackage.C0395 r1, android.view.View r2, int r3) {
            r0 = this;
            r0.f972 = r3
            r0.f971 = r1
            r0.f970 = r2
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    private final void m618(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    private final void m619(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    private final void m620(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    private final void m621(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable r5) {
            r4 = this;
            int r0 = r4.f972
            android.view.View r1 = r4.f970
            ᛲᲈᲀᛱ r4 = r4.f971
            switch(r0) {
                case 0: goto L1b;
                default: goto L9;
            }
        L9:
            boolean r4 = r4.f2031
            if (r4 == 0) goto Le
            goto L1a
        Le:
            if (r5 == 0) goto L1a
            java.lang.String r4 = r5.toString()
            if (r4 != 0) goto L17
            goto L1a
        L17:
            defpackage.C1326.m2455(r1, r4)
        L1a:
            return
        L1b:
            boolean r4 = r4.f2031
            if (r4 == 0) goto L20
            goto L65
        L20:
            if (r5 == 0) goto L65
            java.lang.String r4 = r5.toString()
            if (r4 != 0) goto L29
            goto L65
        L29:
            java.lang.CharSequence r4 = defpackage.AbstractC1347.m2521(r4)
            java.lang.String r4 = r4.toString()
            int r5 = r4.length()
            r0 = 8
            r2 = 0
            if (r5 == r0) goto L3b
            goto L46
        L3b:
            r5 = 16
            long r4 = java.lang.Long.parseLong(r4, r5)     // Catch: java.lang.Exception -> L46
            int r4 = (int) r4     // Catch: java.lang.Exception -> L46
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L46
        L46:
            if (r2 == 0) goto L65
            ᛶᲀᛵ r4 = defpackage.C1141.f5173
            r4.getClass()
            ᲀᲇᛸᛶ r5 = defpackage.C1141.f5194
            ᲁᛷᛶᛶ[] r0 = defpackage.C1141.f5221
            r3 = 49
            r0 = r0[r3]
            r5.m3168(r0, r2)
            r4.getClass()
            int r4 = defpackage.C1141.m2213()
            r1.setBackgroundColor(r4)
            defpackage.C1326.m2461()
        L65:
            return
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            int r0 = r0.f972
            return
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            int r0 = r0.f972
            return
    }
}
