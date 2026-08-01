package p106V0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: V0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1487a extends MetricAffectingSpan {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5196d;

    /* JADX INFO: renamed from: e */
    public final float f5197e;

    public /* synthetic */ C1487a(float f2, int i5) {
        this.f5196d = i5;
        this.f5197e = f2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f5196d) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f5197e);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f5197e);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f5196d) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f5197e);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f5197e);
                break;
        }
    }
}
