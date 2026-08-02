package p000;

import java.text.CharacterIterator;

/* JADX INFO: renamed from: uq */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0782uq implements CharacterIterator {

    /* JADX INFO: renamed from: h */
    public final CharSequence f11412h;

    /* JADX INFO: renamed from: i */
    public final int f11413i;

    /* JADX INFO: renamed from: j */
    public int f11414j = 0;

    public C0782uq(CharSequence charSequence, int i) {
        this.f11412h = charSequence;
        this.f11413i = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.f11414j;
        if (i == this.f11413i) {
            return (char) 65535;
        }
        return this.f11412h.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f11414j = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f11413i;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f11414j;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f11413i;
        if (i == 0) {
            this.f11414j = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f11414j = i2;
        return this.f11412h.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f11414j + 1;
        this.f11414j = i;
        int i2 = this.f11413i;
        if (i < i2) {
            return this.f11412h.charAt(i);
        }
        this.f11414j = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f11414j;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f11414j = i2;
        return this.f11412h.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.f11413i || i < 0) {
            C0676s.m4651j("invalid position");
            return (char) 0;
        }
        this.f11414j = i;
        return current();
    }
}
