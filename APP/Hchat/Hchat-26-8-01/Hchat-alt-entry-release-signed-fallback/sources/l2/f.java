package l2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends android.text.style.MetricAffectingSpan {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f7758g;

    public f(float r1) {
            r0 = this;
            r0.<init>()
            r0.f7758g = r1
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r3) {
            r2 = this;
            float r0 = r3.getTextSize()
            float r1 = r3.getTextScaleX()
            float r1 = r1 * r0
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            return
        Lf:
            float r0 = r2.f7758g
            float r0 = r0 / r1
            r3.setLetterSpacing(r0)
            return
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint r3) {
            r2 = this;
            float r0 = r3.getTextSize()
            float r1 = r3.getTextScaleX()
            float r1 = r1 * r0
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            return
        Lf:
            float r0 = r2.f7758g
            float r0 = r0 / r1
            r3.setLetterSpacing(r0)
            return
    }
}
