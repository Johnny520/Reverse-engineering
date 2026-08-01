package p213;

import java.text.BreakIterator;
import p034.AbstractC7082;

/* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8676 extends AbstractC7082 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final BreakIterator f21751;

    public C8676(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f21751 = characterInstance;
    }

    @Override // p034.AbstractC7082
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final int mo12318(int i) {
        return this.f21751.preceding(i);
    }

    @Override // p034.AbstractC7082
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo12319(int i) {
        return this.f21751.following(i);
    }
}
