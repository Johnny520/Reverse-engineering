package p196;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7838 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f21382;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f21383;

    public /* synthetic */ C7838(Object obj, int i) {
        this.f21383 = i;
        this.f21382 = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.f21383;
        Object obj = this.f21382;
        switch (i) {
            case 0:
                textPaint.setFontFeatureSettings((String) obj);
                break;
            default:
                textPaint.setTypeface((Typeface) obj);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.f21383;
        Object obj = this.f21382;
        switch (i) {
            case 0:
                textPaint.setFontFeatureSettings((String) obj);
                break;
            default:
                textPaint.setTypeface((Typeface) obj);
                break;
        }
    }
}
