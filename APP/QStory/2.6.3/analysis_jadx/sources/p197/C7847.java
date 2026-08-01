package p197;

import java.text.BreakIterator;
import p018.AbstractC6253;

/* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7847 extends AbstractC6253 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final BreakIterator f21406;

    public C7847(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f21406 = characterInstance;
    }

    @Override // p018.AbstractC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final int mo11759(int i) {
        return this.f21406.preceding(i);
    }

    @Override // p018.AbstractC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo11760(int i) {
        return this.f21406.following(i);
    }
}
