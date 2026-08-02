package defpackage;

import java.text.CharacterIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uq implements CharacterIterator {
    public final CharSequence h;
    public final int i;
    public int j = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public uq(CharSequence charSequence, int i) {
        this.h = charSequence;
        this.i = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.j;
        if (i == this.i) {
            return (char) 65535;
        }
        return this.h.charAt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char first() {
        this.j = 0;
        return current();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.i;
        if (i == 0) {
            this.j = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.j = i2;
        return this.h.charAt(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.j + 1;
        this.j = i;
        int i2 = this.i;
        if (i < i2) {
            return this.h.charAt(i);
        }
        this.j = i2;
        return (char) 65535;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.j;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.j = i2;
        return this.h.charAt(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.i || i < 0) {
            s.j("invalid position");
            return (char) 0;
        }
        this.j = i;
        return current();
    }
}
