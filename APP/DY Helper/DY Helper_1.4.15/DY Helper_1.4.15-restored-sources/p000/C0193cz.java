package p000;

/* JADX INFO: renamed from: cz */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0193cz implements android.text.method.TransformationMethod {

    /* JADX INFO: renamed from: ε */
    public final android.text.method.TransformationMethod f2807;

    public C0193cz(android.text.method.TransformationMethod r1) {
            r0 = this;
            r0.<init>()
            r0.f2807 = r1
            return
    }

    @Override // android.text.method.TransformationMethod
    public final java.lang.CharSequence getTransformation(java.lang.CharSequence r2, android.view.View r3) {
            r1 = this;
            boolean r0 = r3.isInEditMode()
            if (r0 == 0) goto L7
            return r2
        L7:
            android.text.method.TransformationMethod r1 = r1.f2807
            if (r1 == 0) goto Lf
            java.lang.CharSequence r2 = r1.getTransformation(r2, r3)
        Lf:
            if (r2 == 0) goto L2e
            jy r1 = p000.C0449jy.m3071()
            int r1 = r1.m3073()
            r3 = 1
            if (r1 == r3) goto L1d
            goto L2e
        L1d:
            jy r1 = p000.C0449jy.m3071()
            r1.getClass()
            int r3 = r2.length()
            r0 = 0
            java.lang.CharSequence r1 = r1.m3076(r0, r3, r0, r2)
            return r1
        L2e:
            return r2
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(android.view.View r1, java.lang.CharSequence r2, boolean r3, int r4, android.graphics.Rect r5) {
            r0 = this;
            android.text.method.TransformationMethod r0 = r0.f2807
            if (r0 == 0) goto L7
            r0.onFocusChanged(r1, r2, r3, r4, r5)
        L7:
            return
    }
}
