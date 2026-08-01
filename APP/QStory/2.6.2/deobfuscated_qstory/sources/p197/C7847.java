package p197;

import android.text.TextPaint;
import io.ktor.client.plugins.AbstractC3932;

/* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7847 extends AbstractC3932 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final TextPaint f21410;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final CharSequence f21411;

    public C7847(CharSequence charSequence, TextPaint textPaint) {
        this.f21411 = charSequence;
        this.f21410 = textPaint;
    }

    @Override // io.ktor.client.plugins.AbstractC3932
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final int mo8326(int i) {
        CharSequence charSequence = this.f21411;
        return this.f21410.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }

    @Override // io.ktor.client.plugins.AbstractC3932
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final int mo8332(int i) {
        CharSequence charSequence = this.f21411;
        return this.f21410.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }
}
