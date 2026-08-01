package p366z2;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: z2.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9847o extends MetricAffectingSpan {

    /* JADX INFO: renamed from: q */
    public final Typeface f33266q;

    public C9847o(Typeface typeface) {
        this.f33266q = typeface;
    }

    /* JADX INFO: renamed from: a */
    public final void m38251a(Paint paint) {
        paint.setTypeface(this.f33266q);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        m38251a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        m38251a(textPaint);
    }
}
