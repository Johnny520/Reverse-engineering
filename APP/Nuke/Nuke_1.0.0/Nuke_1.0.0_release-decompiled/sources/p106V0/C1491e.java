package p106V0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: V0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1491e extends MetricAffectingSpan {

    /* JADX INFO: renamed from: d */
    public final float f5201d;

    public C1491e(float f2) {
        this.f5201d = f2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f5201d);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f5201d);
    }
}
