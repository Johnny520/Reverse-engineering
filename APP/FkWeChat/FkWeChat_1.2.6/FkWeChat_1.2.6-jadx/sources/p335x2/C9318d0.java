package p335x2;

import java.text.CharacterIterator;
import p376zd.C9987e;

/* JADX INFO: renamed from: x2.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9318d0 implements CharacterIterator {

    /* JADX INFO: renamed from: q */
    public final CharSequence f31868q;

    /* JADX INFO: renamed from: r */
    public final int f31869r;

    /* JADX INFO: renamed from: s */
    public final int f31870s;

    /* JADX INFO: renamed from: t */
    public int f31871t;

    public C9318d0(CharSequence charSequence, int i10, int i11) {
        this.f31868q = charSequence;
        this.f31869r = i10;
        this.f31870s = i11;
        this.f31871t = i10;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i10 = this.f31871t;
        if (i10 == this.f31870s) {
            return (char) 65535;
        }
        return this.f31868q.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f31871t = this.f31869r;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f31869r;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f31870s;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f31871t;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i10 = this.f31869r;
        int i11 = this.f31870s;
        if (i10 == i11) {
            this.f31871t = i11;
            return (char) 65535;
        }
        int i12 = i11 - 1;
        this.f31871t = i12;
        return this.f31868q.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i10 = this.f31871t + 1;
        this.f31871t = i10;
        int i11 = this.f31870s;
        if (i10 < i11) {
            return this.f31868q.charAt(i10);
        }
        this.f31871t = i11;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i10 = this.f31871t;
        if (i10 <= this.f31869r) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f31871t = i11;
        return this.f31868q.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i10) {
        int i11 = this.f31869r;
        if (i10 > this.f31870s || i11 > i10) {
            C9987e.m38645a("invalid position");
            return (char) 0;
        }
        this.f31871t = i10;
        return current();
    }
}
