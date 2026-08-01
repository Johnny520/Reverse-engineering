package p208;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1362;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.graphics.AbstractC1574;
import p112.C7325;
import p116.C7341;
import p193.AbstractC7829;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7914 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f21933;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC1574 f21935;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC1395 f21934 = AbstractC1367.m2465(new C7325(9205357640488583168L));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1362 f21932 = AbstractC1367.m2486(new C7341(this, 7));

    public C7914(AbstractC1574 abstractC1574, float f) {
        this.f21935 = abstractC1574;
        this.f21933 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC7829.m13165(textPaint, this.f21933);
        textPaint.setShader((Shader) this.f21932.getValue());
    }
}
