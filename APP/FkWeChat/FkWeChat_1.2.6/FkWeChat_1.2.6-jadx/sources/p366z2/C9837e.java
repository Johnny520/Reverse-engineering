package p366z2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: z2.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9837e extends MetricAffectingSpan {

    /* JADX INFO: renamed from: q */
    public final float f33230q;

    public C9837e(float f10) {
        this.f33230q = f10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f33230q);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f33230q);
    }
}
