package p106V0;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: V0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1488b extends MetricAffectingSpan {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5198d;

    /* JADX INFO: renamed from: e */
    public final Object f5199e;

    public /* synthetic */ C1488b(int i5, Object obj) {
        this.f5198d = i5;
        this.f5199e = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f5198d) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f5199e);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f5199e);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f5198d) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f5199e);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f5199e);
                break;
        }
    }
}
