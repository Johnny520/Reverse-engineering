package p000;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class aq2 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: h */
    public final zp2 f336h;

    /* JADX INFO: renamed from: i */
    public final float f337i;

    /* JADX INFO: renamed from: j */
    public final nx1 f338j = op0.m3598u(new gr2(9205357640488583168L));

    /* JADX INFO: renamed from: k */
    public final n70 f339k = op0.m3590m(new C0727ta(25, this));

    public aq2(zp2 zp2Var, float f) {
        this.f336h = zp2Var;
        this.f337i = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        sp0.m4943h0(textPaint, this.f337i);
        textPaint.setShader((Shader) this.f339k.getValue());
    }
}
