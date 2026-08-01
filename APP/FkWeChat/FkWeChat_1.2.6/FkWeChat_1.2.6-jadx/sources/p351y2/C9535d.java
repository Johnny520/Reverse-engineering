package p351y2;

import android.text.TextPaint;

/* JADX INFO: renamed from: y2.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9535d extends AbstractC9533b {

    /* JADX INFO: renamed from: a */
    public final CharSequence f32525a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f32526b;

    public C9535d(CharSequence charSequence, TextPaint textPaint) {
        this.f32525a = charSequence;
        this.f32526b = textPaint;
    }

    @Override // p351y2.AbstractC9533b
    /* JADX INFO: renamed from: e */
    public int mo37323e(int i10) {
        TextPaint textPaint = this.f32526b;
        CharSequence charSequence = this.f32525a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 0);
    }

    @Override // p351y2.AbstractC9533b
    /* JADX INFO: renamed from: f */
    public int mo37324f(int i10) {
        TextPaint textPaint = this.f32526b;
        CharSequence charSequence = this.f32525a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 2);
    }
}
