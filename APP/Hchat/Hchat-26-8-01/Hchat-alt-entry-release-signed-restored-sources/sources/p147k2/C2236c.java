package p147k2;

import java.text.BreakIterator;
import p343x6.AbstractC5700d;

/* JADX INFO: renamed from: k2.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2236c extends AbstractC5700d {

    /* JADX INFO: renamed from: g */
    public final BreakIterator f7407g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2236c(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f7407g = characterInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p343x6.AbstractC5700d
    /* JADX INFO: renamed from: P */
    public final int mo5472P(int i9) {
        return this.f7407g.following(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p343x6.AbstractC5700d
    /* JADX INFO: renamed from: V */
    public final int mo5473V(int i9) {
        return this.f7407g.preceding(i9);
    }
}
