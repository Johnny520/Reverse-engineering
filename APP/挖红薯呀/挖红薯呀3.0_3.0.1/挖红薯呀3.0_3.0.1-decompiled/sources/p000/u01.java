package p000;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class u01 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: d */
    public final float f6094d;

    /* JADX INFO: renamed from: e */
    public final gp0 f6095e = r60.m3419u(new q11(9205357640488583168L));

    /* JADX INFO: renamed from: f */
    public final C0135dn f6096f = r60.m3411m(new C0381k6(12, this));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u01(AbstractC0646qb abstractC0646qb, float f) {
        this.f6094d = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        rd0.m3460S(textPaint, this.f6094d);
        textPaint.setShader((Shader) this.f6096f.getValue());
    }
}
