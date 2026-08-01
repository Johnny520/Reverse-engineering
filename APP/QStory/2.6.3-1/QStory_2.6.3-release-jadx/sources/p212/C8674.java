package p212;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8674 extends CharacterStyle {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f21747;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f21748;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f21749;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f21750;

    public C8674(float f, float f2, float f3, int i) {
        this.f21750 = i;
        this.f21749 = f;
        this.f21748 = f2;
        this.f21747 = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f21747, this.f21749, this.f21748, this.f21750);
    }
}
