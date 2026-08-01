package p197;

import android.text.TextPaint;
import p018.AbstractC6253;

/* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7848 extends AbstractC6253 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final TextPaint f21407;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final CharSequence f21408;

    public C7848(CharSequence charSequence, TextPaint textPaint) {
        this.f21408 = charSequence;
        this.f21407 = textPaint;
    }

    @Override // p018.AbstractC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final int mo11759(int i) {
        CharSequence charSequence = this.f21408;
        return this.f21407.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }

    @Override // p018.AbstractC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo11760(int i) {
        CharSequence charSequence = this.f21408;
        return this.f21407.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }
}
