package a;

/* JADX INFO: loaded from: classes.dex */
public final class U5 implements android.text.method.TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.text.method.TransformationMethod f287a;

    public U5(android.text.method.TransformationMethod r1) {
            r0 = this;
            r0.<init>()
            r0.f287a = r1
            return
    }

    @Override // android.text.method.TransformationMethod
    public final java.lang.CharSequence getTransformation(java.lang.CharSequence r3, android.view.View r4) {
            r2 = this;
            boolean r0 = r4.isInEditMode()
            if (r0 == 0) goto L7
            return r3
        L7:
            android.text.method.TransformationMethod r0 = r2.f287a
            if (r0 == 0) goto Lf
            java.lang.CharSequence r3 = r0.getTransformation(r3, r4)
        Lf:
            if (r3 == 0) goto L2d
            androidx.emoji2.text.c r4 = androidx.emoji2.text.c.a()
            int r4 = r4.b()
            r0 = 1
            if (r4 == r0) goto L1d
            goto L2d
        L1d:
            androidx.emoji2.text.c r4 = androidx.emoji2.text.c.a()
            r4.getClass()
            int r0 = r3.length()
            r1 = 0
            java.lang.CharSequence r3 = r4.e(r3, r1, r0)
        L2d:
            return r3
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(android.view.View r7, java.lang.CharSequence r8, boolean r9, int r10, android.graphics.Rect r11) {
            r6 = this;
            android.text.method.TransformationMethod r0 = r6.f287a
            if (r0 == 0) goto Lc
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.onFocusChanged(r1, r2, r3, r4, r5)
        Lc:
            return
    }
}
