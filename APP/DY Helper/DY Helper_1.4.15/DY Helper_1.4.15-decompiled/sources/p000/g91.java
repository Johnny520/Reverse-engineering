package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class g91 extends android.text.method.SingleLineTransformationMethod {

    /* JADX INFO: renamed from: ε */
    public java.util.Locale f4289;

    @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
    public final java.lang.CharSequence getTransformation(java.lang.CharSequence r1, android.view.View r2) {
            r0 = this;
            java.lang.CharSequence r1 = super.getTransformation(r1, r2)
            if (r1 == 0) goto L11
            java.lang.String r1 = r1.toString()
            java.util.Locale r0 = r0.f4289
            java.lang.String r0 = r1.toUpperCase(r0)
            return r0
        L11:
            r0 = 0
            return r0
    }
}
