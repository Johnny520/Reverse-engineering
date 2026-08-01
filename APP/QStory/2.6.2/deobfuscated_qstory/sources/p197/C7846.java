package p197;

import io.ktor.client.plugins.AbstractC3932;
import java.text.BreakIterator;

/* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7846 extends AbstractC3932 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final BreakIterator f21409;

    public C7846(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f21409 = characterInstance;
    }

    @Override // io.ktor.client.plugins.AbstractC3932
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final int mo8326(int i) {
        return this.f21409.preceding(i);
    }

    @Override // io.ktor.client.plugins.AbstractC3932
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final int mo8332(int i) {
        return this.f21409.following(i);
    }
}
