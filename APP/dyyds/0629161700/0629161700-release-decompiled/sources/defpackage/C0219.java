package defpackage;

/* JADX INFO: renamed from: ᛱᲈᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0219 implements android.text.method.TransformationMethod {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.text.method.TransformationMethod f1343;

    public C0219(android.text.method.TransformationMethod r1) {
            r0 = this;
            r0.<init>()
            r0.f1343 = r1
            return
    }

    @Override // android.text.method.TransformationMethod
    public final java.lang.CharSequence getTransformation(java.lang.CharSequence r2, android.view.View r3) {
            r1 = this;
            boolean r0 = r3.isInEditMode()
            if (r0 == 0) goto L7
            return r2
        L7:
            android.text.method.TransformationMethod r1 = r1.f1343
            if (r1 == 0) goto Lf
            java.lang.CharSequence r2 = r1.getTransformation(r2, r3)
        Lf:
            if (r2 == 0) goto L2e
            ᛴᲁᛶᲈ r1 = defpackage.C0766.m1696()
            int r1 = r1.m1700()
            r3 = 1
            if (r1 == r3) goto L1d
            goto L2e
        L1d:
            ᛴᲁᛶᲈ r1 = defpackage.C0766.m1696()
            r1.getClass()
            int r3 = r2.length()
            r0 = 0
            java.lang.CharSequence r1 = r1.m1697(r2, r0, r3)
            return r1
        L2e:
            return r2
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(android.view.View r1, java.lang.CharSequence r2, boolean r3, int r4, android.graphics.Rect r5) {
            r0 = this;
            android.text.method.TransformationMethod r0 = r0.f1343
            if (r0 == 0) goto L7
            r0.onFocusChanged(r1, r2, r3, r4, r5)
        L7:
            return
    }
}
