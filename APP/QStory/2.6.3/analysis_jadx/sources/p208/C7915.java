package p208;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1362;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.graphics.AbstractC1574;
import p112.C7326;
import p116.C7342;
import p193.AbstractC7830;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7915 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f21930;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC1574 f21932;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC1395 f21931 = AbstractC1367.m2474(new C7326(9205357640488583168L));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1362 f21929 = AbstractC1367.m2496(new C7342(this, 7));

    public C7915(AbstractC1574 abstractC1574, float f) {
        this.f21932 = abstractC1574;
        this.f21930 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC7830.m13193(textPaint, this.f21930);
        textPaint.setShader((Shader) this.f21929.getValue());
    }
}
