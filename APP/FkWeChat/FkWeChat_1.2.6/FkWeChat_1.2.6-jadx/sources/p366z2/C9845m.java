package p366z2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: z2.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C9845m extends MetricAffectingSpan {

    /* JADX INFO: renamed from: q */
    public final float f33263q;

    public C9845m(float f10) {
        this.f33263q = f10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.f33263q + textPaint.getTextSkewX());
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.f33263q + textPaint.getTextSkewX());
    }
}
