package p133j2;

import java.text.CharacterIterator;
import p136j8.C2104o;

/* JADX INFO: renamed from: j2.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2053c implements CharacterIterator {

    /* JADX INFO: renamed from: g */
    public final CharSequence f6896g;

    /* JADX INFO: renamed from: h */
    public final int f6897h;

    /* JADX INFO: renamed from: i */
    public int f6898i = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2053c(CharSequence charSequence, int i9) {
        this.f6896g = charSequence;
        this.f6897h = i9;
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
        int i9 = this.f6898i;
        if (i9 == this.f6897h) {
            return (char) 65535;
        }
        return this.f6896g.charAt(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char first() {
        this.f6898i = 0;
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
        return this.f6897h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f6898i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char last() {
        int i9 = this.f6897h;
        if (i9 == 0) {
            this.f6898i = i9;
            return (char) 65535;
        }
        int i10 = i9 - 1;
        this.f6898i = i10;
        return this.f6896g.charAt(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char next() {
        int i9 = this.f6898i + 1;
        this.f6898i = i9;
        int i10 = this.f6897h;
        if (i9 < i10) {
            return this.f6896g.charAt(i9);
        }
        this.f6898i = i10;
        return (char) 65535;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char previous() {
        int i9 = this.f6898i;
        if (i9 <= 0) {
            return (char) 65535;
        }
        int i10 = i9 - 1;
        this.f6898i = i10;
        return this.f6896g.charAt(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char setIndex(int i9) {
        if (i9 > this.f6897h || i9 < 0) {
            C2104o.m5294t("invalid position");
            return (char) 0;
        }
        this.f6898i = i9;
        return current();
    }
}
