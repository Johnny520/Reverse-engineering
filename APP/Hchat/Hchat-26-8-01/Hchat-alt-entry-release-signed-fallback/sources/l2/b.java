package l2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends android.text.style.MetricAffectingSpan {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f7755h;

    public /* synthetic */ b(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f7754g = r2
            r0.<init>()
            r0.f7755h = r1
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r2) {
            r1 = this;
            int r0 = r1.f7754g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f7755h
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            r2.setTypeface(r0)
            return
        Ld:
            java.lang.Object r0 = r1.f7755h
            java.lang.String r0 = (java.lang.String) r0
            r2.setFontFeatureSettings(r0)
            return
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint r2) {
            r1 = this;
            int r0 = r1.f7754g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f7755h
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            r2.setTypeface(r0)
            return
        Ld:
            java.lang.Object r0 = r1.f7755h
            java.lang.String r0 = (java.lang.String) r0
            r2.setFontFeatureSettings(r0)
            return
    }
}
