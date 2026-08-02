package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class aq2 extends CharacterStyle implements UpdateAppearance {
    public final zp2 h;
    public final float i;
    public final nx1 j = op0.u(new gr2(9205357640488583168L));
    public final n70 k = op0.m(new ta(25, this));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public aq2(zp2 zp2Var, float f) {
        this.h = zp2Var;
        this.i = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        sp0.h0(textPaint, this.i);
        textPaint.setShader((Shader) this.k.getValue());
    }
}
