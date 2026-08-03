package a;

/* JADX INFO: renamed from: a.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0309p0 implements android.text.method.TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.Locale f629a;

    @Override // android.text.method.TransformationMethod
    public final java.lang.CharSequence getTransformation(java.lang.CharSequence r1, android.view.View r2) {
            r0 = this;
            if (r1 == 0) goto Ld
            java.lang.String r1 = r1.toString()
            java.util.Locale r2 = r0.f629a
            java.lang.String r1 = r1.toUpperCase(r2)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(android.view.View r1, java.lang.CharSequence r2, boolean r3, int r4, android.graphics.Rect r5) {
            r0 = this;
            return
    }
}
