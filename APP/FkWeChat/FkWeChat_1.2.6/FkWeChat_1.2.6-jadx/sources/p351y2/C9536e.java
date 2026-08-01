package p351y2;

import java.text.BreakIterator;

/* JADX INFO: renamed from: y2.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9536e extends AbstractC9533b {

    /* JADX INFO: renamed from: a */
    public final CharSequence f32527a;

    /* JADX INFO: renamed from: b */
    public final BreakIterator f32528b;

    public C9536e(CharSequence charSequence) {
        this.f32527a = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f32528b = characterInstance;
    }

    @Override // p351y2.AbstractC9533b
    /* JADX INFO: renamed from: e */
    public int mo37323e(int i10) {
        return this.f32528b.following(i10);
    }

    @Override // p351y2.AbstractC9533b
    /* JADX INFO: renamed from: f */
    public int mo37324f(int i10) {
        return this.f32528b.preceding(i10);
    }
}
