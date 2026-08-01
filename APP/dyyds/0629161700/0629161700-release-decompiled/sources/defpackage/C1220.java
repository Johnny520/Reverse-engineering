package defpackage;

/* JADX INFO: renamed from: ᛷᛲᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1220 implements android.text.InputFilter {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.widget.TextView f5476;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public defpackage.C0424 f5477;

    public C1220(android.widget.TextView r1) {
            r0 = this;
            r0.<init>()
            r0.f5476 = r1
            return
    }

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
            r3 = this;
            android.widget.TextView r0 = r3.f5476
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L9
            goto L48
        L9:
            ᛴᲁᛶᲈ r1 = defpackage.C0766.m1696()
            int r1 = r1.m1700()
            if (r1 == 0) goto L49
            r2 = 1
            if (r1 == r2) goto L1a
            r5 = 3
            if (r1 == r5) goto L49
            goto L48
        L1a:
            if (r9 != 0) goto L2b
            if (r8 != 0) goto L2b
            int r3 = r7.length()
            if (r3 != 0) goto L2b
            java.lang.CharSequence r3 = r0.getText()
            if (r4 != r3) goto L2b
            goto L48
        L2b:
            if (r4 == 0) goto L48
            if (r5 != 0) goto L36
            int r3 = r4.length()
            if (r6 != r3) goto L36
            goto L3a
        L36:
            java.lang.CharSequence r4 = r4.subSequence(r5, r6)
        L3a:
            ᛴᲁᛶᲈ r3 = defpackage.C0766.m1696()
            int r5 = r4.length()
            r6 = 0
            java.lang.CharSequence r3 = r3.m1697(r4, r6, r5)
            return r3
        L48:
            return r4
        L49:
            ᛴᲁᛶᲈ r5 = defpackage.C0766.m1696()
            ᛳᛲᛷᲀ r6 = r3.f5477
            if (r6 != 0) goto L58
            ᛳᛲᛷᲀ r6 = new ᛳᛲᛷᲀ
            r6.<init>(r0, r3)
            r3.f5477 = r6
        L58:
            r5.m1701(r6)
            return r4
    }
}
