package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vq0 extends android.text.style.MetricAffectingSpan {

    /* JADX INFO: renamed from: ε */
    public final float f11363;

    public vq0(float r1) {
            r0 = this;
            r0.<init>()
            r0.f11363 = r1
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r1) {
            r0 = this;
            float r0 = r0.f11363
            r1.setLetterSpacing(r0)
            return
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint r1) {
            r0 = this;
            float r0 = r0.f11363
            r1.setLetterSpacing(r0)
            return
    }
}
