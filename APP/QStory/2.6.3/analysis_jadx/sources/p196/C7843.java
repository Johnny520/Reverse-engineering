package p196;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7843 extends CharacterStyle {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f21396;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f21397;

    public C7843(boolean z, boolean z2) {
        this.f21397 = z;
        this.f21396 = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f21397);
        textPaint.setStrikeThruText(this.f21396);
    }
}
