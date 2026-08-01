package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class i50 extends android.text.style.MetricAffectingSpan {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4920;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f4921;

    public /* synthetic */ i50(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f4920 = r1
            r0.<init>()
            r0.f4921 = r2
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r2) {
            r1 = this;
            int r0 = r1.f4920
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f4921
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            r2.setTypeface(r1)
            return
        Ld:
            java.lang.Object r1 = r1.f4921
            java.lang.String r1 = (java.lang.String) r1
            r2.setFontFeatureSettings(r1)
            return
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint r2) {
            r1 = this;
            int r0 = r1.f4920
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f4921
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            r2.setTypeface(r1)
            return
        Ld:
            java.lang.Object r1 = r1.f4921
            java.lang.String r1 = (java.lang.String) r1
            r2.setFontFeatureSettings(r1)
            return
    }
}
