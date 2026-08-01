package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛶᛱᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1046 implements android.text.method.TransformationMethod {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final android.text.method.TransformationMethod f3369;

    public C1046(android.text.method.TransformationMethod r1) {
            r0 = this;
            r0.<init>()
            r0.f3369 = r1
            return
    }

    @Override // android.text.method.TransformationMethod
    public final java.lang.CharSequence getTransformation(java.lang.CharSequence r2, android.view.View r3) {
            r1 = this;
            boolean r0 = r3.isInEditMode()
            if (r0 == 0) goto L7
            return r2
        L7:
            android.text.method.TransformationMethod r1 = r1.f3369
            if (r1 == 0) goto Lf
            java.lang.CharSequence r2 = r1.getTransformation(r2, r3)
        Lf:
            if (r2 == 0) goto L2e
            xhss.ᛵᲁᛱᲁ r1 = xhss.C0514.m921()
            int r1 = r1.m922()
            r3 = 1
            if (r1 == r3) goto L1d
            goto L2e
        L1d:
            xhss.ᛵᲁᛱᲁ r1 = xhss.C0514.m921()
            r1.getClass()
            int r3 = r2.length()
            r0 = 0
            java.lang.CharSequence r1 = r1.m924(r2, r0, r3)
            return r1
        L2e:
            return r2
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(android.view.View r1, java.lang.CharSequence r2, boolean r3, int r4, android.graphics.Rect r5) {
            r0 = this;
            android.text.method.TransformationMethod r0 = r0.f3369
            if (r0 == 0) goto L7
            r0.onFocusChanged(r1, r2, r3, r4, r5)
        L7:
            return
    }
}
