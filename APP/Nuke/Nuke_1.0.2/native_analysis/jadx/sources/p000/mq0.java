package p000;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mq0 extends fg1 {

    /* JADX INFO: renamed from: m */
    public final BreakIterator f6765m;

    public mq0(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f6765m = characterInstance;
    }

    @Override // p000.fg1
    /* JADX INFO: renamed from: B */
    public final int mo1652B(int i) {
        return this.f6765m.following(i);
    }

    @Override // p000.fg1
    /* JADX INFO: renamed from: J */
    public final int mo1653J(int i) {
        return this.f6765m.preceding(i);
    }
}
