package p000;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dq2 extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final int f2149a;

    /* JADX INFO: renamed from: b */
    public final float f2150b;

    /* JADX INFO: renamed from: c */
    public final float f2151c;

    /* JADX INFO: renamed from: d */
    public final float f2152d;

    public dq2(int i, float f, float f2, float f3) {
        this.f2149a = i;
        this.f2150b = f;
        this.f2151c = f2;
        this.f2152d = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f2152d, this.f2150b, this.f2151c, this.f2149a);
    }
}
