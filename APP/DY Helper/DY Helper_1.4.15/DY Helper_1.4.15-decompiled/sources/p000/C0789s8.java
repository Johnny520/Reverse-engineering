package p000;

/* JADX INFO: renamed from: s8 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0789s8 extends android.text.style.MetricAffectingSpan {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9761;

    /* JADX INFO: renamed from: ζ */
    public final float f9762;

    public /* synthetic */ C0789s8(int r1, float r2) {
            r0 = this;
            r0.f9761 = r1
            r0.<init>()
            r0.f9762 = r2
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r4) {
            r3 = this;
            int r0 = r3.f9761
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            float r3 = r3.f9762
            float r0 = r4.getTextSkewX()
            float r0 = r0 + r3
            r4.setTextSkewX(r0)
            return
        L10:
            int r0 = r4.baselineShift
            float r1 = r4.ascent()
            float r3 = r3.f9762
            float r1 = r1 * r3
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            float r3 = (float) r1
            int r3 = (int) r3
            int r0 = r0 + r3
            r4.baselineShift = r0
            return
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint r4) {
            r3 = this;
            int r0 = r3.f9761
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            float r3 = r3.f9762
            float r0 = r4.getTextSkewX()
            float r0 = r0 + r3
            r4.setTextSkewX(r0)
            return
        L10:
            int r0 = r4.baselineShift
            float r1 = r4.ascent()
            float r3 = r3.f9762
            float r1 = r1 * r3
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            float r3 = (float) r1
            int r3 = (int) r3
            int r0 = r0 + r3
            r4.baselineShift = r0
            return
    }
}
