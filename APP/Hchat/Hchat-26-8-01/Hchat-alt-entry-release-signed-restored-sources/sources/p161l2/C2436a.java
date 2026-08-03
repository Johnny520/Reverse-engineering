package p161l2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: l2.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2436a extends MetricAffectingSpan {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8021g;

    /* JADX INFO: renamed from: h */
    public final float f8022h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2436a(int i9, float f3) {
        this.f8021g = i9;
        this.f8022h = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f8021g) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f8022h);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f8022h);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f8021g) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f8022h);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f8022h);
                break;
        }
    }
}
