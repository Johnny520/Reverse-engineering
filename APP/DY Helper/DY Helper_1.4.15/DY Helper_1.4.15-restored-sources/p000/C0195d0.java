package p000;

/* JADX INFO: renamed from: d0 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0195d0 implements android.text.method.TransformationMethod {

    /* JADX INFO: renamed from: ε */
    public java.util.Locale f2828;

    @Override // android.text.method.TransformationMethod
    public final java.lang.CharSequence getTransformation(java.lang.CharSequence r1, android.view.View r2) {
            r0 = this;
            if (r1 == 0) goto Ld
            java.lang.String r1 = r1.toString()
            java.util.Locale r0 = r0.f2828
            java.lang.String r0 = r1.toUpperCase(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(android.view.View r1, java.lang.CharSequence r2, boolean r3, int r4, android.graphics.Rect r5) {
            r0 = this;
            return
    }
}
