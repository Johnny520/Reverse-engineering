package p212;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8669 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f21726;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f21727;

    public /* synthetic */ C8669(float f, int i) {
        this.f21727 = i;
        this.f21726 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.f21727;
        float f = this.f21726;
        switch (i) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * f);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.f21727;
        float f = this.f21726;
        switch (i) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * f);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                break;
        }
    }
}
