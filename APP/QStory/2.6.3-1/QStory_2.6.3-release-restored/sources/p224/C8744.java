package p224;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.p001ui.graphics.AbstractC2409;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2197;
import androidx.compose.runtime.InterfaceC2230;
import p128.C8155;
import p132.C8171;
import p209.AbstractC8659;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8744 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f22275;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC2409 f22277;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC2230 f22276 = AbstractC2202.m3034(new C8155(9205357640488583168L));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C2197 f22274 = AbstractC2202.m3056(new C8171(this, 7));

    public C8744(AbstractC2409 abstractC2409, float f) {
        this.f22277 = abstractC2409;
        this.f22275 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC8659.m13752(textPaint, this.f22275);
        textPaint.setShader((Shader) this.f22274.getValue());
    }
}
