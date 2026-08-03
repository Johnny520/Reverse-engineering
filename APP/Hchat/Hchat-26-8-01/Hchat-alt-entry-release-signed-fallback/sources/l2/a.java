package l2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends android.text.style.MetricAffectingSpan {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f7753h;

    public /* synthetic */ a(int r1, float r2) {
            r0 = this;
            r0.f7752g = r1
            r0.<init>()
            r0.f7753h = r2
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r4) {
            r3 = this;
            int r0 = r3.f7752g
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            float r0 = r3.f7753h
            float r1 = r4.getTextSkewX()
            float r1 = r1 + r0
            r4.setTextSkewX(r1)
            return
        L10:
            int r0 = r4.baselineShift
            float r1 = r4.ascent()
            float r2 = r3.f7753h
            float r1 = r1 * r2
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            int r0 = r0 + r1
            r4.baselineShift = r0
            return
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint r4) {
            r3 = this;
            int r0 = r3.f7752g
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            float r0 = r3.f7753h
            float r1 = r4.getTextSkewX()
            float r1 = r1 + r0
            r4.setTextSkewX(r1)
            return
        L10:
            int r0 = r4.baselineShift
            float r1 = r4.ascent()
            float r2 = r3.f7753h
            float r1 = r1 * r2
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            int r0 = r0 + r1
            r4.baselineShift = r0
            return
    }
}
