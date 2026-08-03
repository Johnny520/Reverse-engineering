package l2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends android.text.style.MetricAffectingSpan {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f7757g;

    public e(float r1) {
            r0 = this;
            r0.<init>()
            r0.f7757g = r1
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r2) {
            r1 = this;
            float r0 = r1.f7757g
            r2.setLetterSpacing(r0)
            return
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint r2) {
            r1 = this;
            float r0 = r1.f7757g
            r2.setLetterSpacing(r0)
            return
    }
}
