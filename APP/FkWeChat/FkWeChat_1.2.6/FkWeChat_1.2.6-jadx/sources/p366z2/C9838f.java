package p366z2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: z2.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9838f extends MetricAffectingSpan {

    /* JADX INFO: renamed from: q */
    public final float f33231q;

    public C9838f(float f10) {
        this.f33231q = f10;
    }

    /* JADX INFO: renamed from: a */
    public final void m38237a(TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.f33231q / textSize);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        m38237a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        m38237a(textPaint);
    }
}
