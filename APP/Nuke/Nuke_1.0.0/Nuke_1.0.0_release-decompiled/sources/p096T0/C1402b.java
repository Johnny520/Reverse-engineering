package p096T0;

import java.text.CharacterIterator;

/* JADX INFO: renamed from: T0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1402b implements CharacterIterator {

    /* JADX INFO: renamed from: d */
    public final CharSequence f5021d;

    /* JADX INFO: renamed from: e */
    public final int f5022e;

    /* JADX INFO: renamed from: f */
    public int f5023f = 0;

    public C1402b(CharSequence charSequence, int i5) {
        this.f5021d = charSequence;
        this.f5022e = i5;
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
        int i5 = this.f5023f;
        if (i5 == this.f5022e) {
            return (char) 65535;
        }
        return this.f5021d.charAt(i5);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f5023f = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f5022e;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f5023f;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i5 = this.f5022e;
        if (i5 == 0) {
            this.f5023f = i5;
            return (char) 65535;
        }
        int i6 = i5 - 1;
        this.f5023f = i6;
        return this.f5021d.charAt(i6);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i5 = this.f5023f + 1;
        this.f5023f = i5;
        int i6 = this.f5022e;
        if (i5 < i6) {
            return this.f5021d.charAt(i5);
        }
        this.f5023f = i6;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i5 = this.f5023f;
        if (i5 <= 0) {
            return (char) 65535;
        }
        int i6 = i5 - 1;
        this.f5023f = i6;
        return this.f5021d.charAt(i6);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i5) {
        if (i5 > this.f5022e || i5 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f5023f = i5;
        return current();
    }
}
