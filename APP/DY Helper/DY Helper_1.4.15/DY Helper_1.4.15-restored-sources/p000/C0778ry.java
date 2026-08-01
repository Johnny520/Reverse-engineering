package p000;

/* JADX INFO: renamed from: ry */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0778ry implements android.text.InputFilter {

    /* JADX INFO: renamed from: α */
    public final android.widget.TextView f9570;

    /* JADX INFO: renamed from: β */
    public p000.RunnableC0741qy f9571;

    public C0778ry(android.widget.TextView r1) {
            r0 = this;
            r0.<init>()
            r0.f9570 = r1
            return
    }

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
            r3 = this;
            android.widget.TextView r0 = r3.f9570
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L9
            goto L48
        L9:
            jy r1 = p000.C0449jy.m3071()
            int r1 = r1.m3073()
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
            jy r3 = p000.C0449jy.m3071()
            int r5 = r4.length()
            r6 = 0
            java.lang.CharSequence r3 = r3.m3076(r6, r5, r6, r4)
            return r3
        L48:
            return r4
        L49:
            jy r5 = p000.C0449jy.m3071()
            qy r6 = r3.f9571
            if (r6 != 0) goto L58
            qy r6 = new qy
            r6.<init>(r0, r3)
            r3.f9571 = r6
        L58:
            qy r3 = r3.f9571
            r5.m3077(r3)
            return r4
    }
}
