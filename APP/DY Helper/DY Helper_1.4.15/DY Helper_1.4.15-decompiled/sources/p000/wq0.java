package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class wq0 extends android.text.style.MetricAffectingSpan {

    /* JADX INFO: renamed from: ε */
    public final float f11800;

    public wq0(float r1) {
            r0 = this;
            r0.<init>()
            r0.f11800 = r1
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
            float r2 = r2.f11800
            float r2 = r2 / r1
            r3.setLetterSpacing(r2)
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
            float r2 = r2.f11800
            float r2 = r2 / r1
            r3.setLetterSpacing(r2)
            return
    }
}
