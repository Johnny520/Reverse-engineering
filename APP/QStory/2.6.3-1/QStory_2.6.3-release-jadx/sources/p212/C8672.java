package p212;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8672 extends CharacterStyle {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f21741;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f21742;

    public C8672(boolean z, boolean z2) {
        this.f21742 = z;
        this.f21741 = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f21742);
        textPaint.setStrikeThruText(this.f21741);
    }
}
