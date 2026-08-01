package defpackage;

/* JADX INFO: renamed from: ᛴᛱᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0611 implements android.text.TextWatcher {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ android.widget.TextView f3004;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ android.widget.EditText f3005;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1419 f3006;

    public C0611(defpackage.C1419 r1, android.widget.EditText r2, android.widget.TextView r3) {
            r0 = this;
            r0.<init>()
            r0.f3006 = r1
            r0.f3005 = r2
            r0.f3004 = r3
            return
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable r4) {
            r3 = this;
            if (r4 == 0) goto L8
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L11
        L8:
            r0 = -136958201732654(0xffff836fef0961d2, double:NaN)
            java.lang.String r4 = ""
        L11:
            r0 = -136962496699950(0xffff836eef0961d2, double:NaN)
            java.lang.String r0 = "\n"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = 6
            java.util.List r4 = defpackage.AbstractC1347.m2519(r4, r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = defpackage.AbstractC0575.m1369(r4)
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L30:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = defpackage.AbstractC1347.m2521(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto L30
        L48:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L51:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L51
            r4.add(r1)
            goto L51
        L68:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r4)
            ᛸᛱᛴᲁ r4 = r3.f3006
            r4.f6211 = r0
            android.widget.EditText r4 = r3.f3005
            android.widget.TextView r3 = r3.f3004
            defpackage.C1942.m3357(r4, r3)
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
