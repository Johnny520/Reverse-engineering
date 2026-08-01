package xhss;

/* JADX INFO: renamed from: xhss.ᲈᲇᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1193 implements android.text.InputFilter {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public xhss.C0805 f3849;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.AbstractC0796 f3850;

    public C1193(xhss.AbstractC0796 r1) {
            r0 = this;
            r0.<init>()
            r0.f3850 = r1
            return
    }

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
            r3 = this;
            xhss.ᛸᲀᛲᛴ r0 = r3.f3850
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L9
            goto L48
        L9:
            xhss.ᛵᲁᛱᲁ r1 = xhss.C0514.m921()
            int r1 = r1.m922()
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
            xhss.ᛵᲁᛱᲁ r3 = xhss.C0514.m921()
            int r5 = r4.length()
            r6 = 0
            java.lang.CharSequence r3 = r3.m924(r4, r6, r5)
            return r3
        L48:
            return r4
        L49:
            xhss.ᛵᲁᛱᲁ r5 = xhss.C0514.m921()
            xhss.ᛸᲁᛲᛴ r6 = r3.f3849
            if (r6 != 0) goto L58
            xhss.ᛸᲁᛲᛴ r6 = new xhss.ᛸᲁᛲᛴ
            r6.<init>(r0, r3)
            r3.f3849 = r6
        L58:
            r5.m926(r6)
            return r4
    }
}
