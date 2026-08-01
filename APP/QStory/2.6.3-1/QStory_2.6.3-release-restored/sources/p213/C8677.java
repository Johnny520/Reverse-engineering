package p213;

import android.text.TextPaint;
import p034.AbstractC7082;

/* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8677 extends AbstractC7082 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final TextPaint f21752;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final CharSequence f21753;

    public C8677(CharSequence charSequence, TextPaint textPaint) {
        this.f21753 = charSequence;
        this.f21752 = textPaint;
    }

    @Override // p034.AbstractC7082
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final int mo12318(int i) {
        CharSequence charSequence = this.f21753;
        return this.f21752.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }

    @Override // p034.AbstractC7082
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo12319(int i) {
        CharSequence charSequence = this.f21753;
        return this.f21752.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }
}
