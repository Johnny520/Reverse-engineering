package p196;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7844 extends CharacterStyle {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f21405;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f21406;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f21407;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f21408;

    public C7844(float f, float f2, float f3, int i) {
        this.f21408 = i;
        this.f21407 = f;
        this.f21406 = f2;
        this.f21405 = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f21405, this.f21407, this.f21406, this.f21408);
    }
}
