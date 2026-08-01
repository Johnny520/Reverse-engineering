package p000;

import java.text.CharacterIterator;

/* JADX INFO: renamed from: xd */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0922xd implements CharacterIterator {

    /* JADX INFO: renamed from: d */
    public final CharSequence f7331d;

    /* JADX INFO: renamed from: e */
    public final int f7332e;

    /* JADX INFO: renamed from: f */
    public int f7333f = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0922xd(CharSequence charSequence, int i) {
        this.f7331d = charSequence;
        this.f7332e = i;
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
        int i = this.f7333f;
        if (i == this.f7332e) {
            return (char) 65535;
        }
        return this.f7331d.charAt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char first() {
        this.f7333f = 0;
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
        return this.f7332e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f7333f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f7332e;
        if (i == 0) {
            this.f7333f = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f7333f = i2;
        return this.f7331d.charAt(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f7333f + 1;
        this.f7333f = i;
        int i2 = this.f7332e;
        if (i < i2) {
            return this.f7331d.charAt(i);
        }
        this.f7333f = i2;
        return (char) 65535;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f7333f;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f7333f = i2;
        return this.f7331d.charAt(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.f7332e || i < 0) {
            C0921xc.m5131l("invalid position");
            return (char) 0;
        }
        this.f7333f = i;
        return current();
    }
}
