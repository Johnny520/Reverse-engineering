package p000;

/* JADX INFO: renamed from: lf */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0510lf implements java.text.CharacterIterator {

    /* JADX INFO: renamed from: ε */
    public final java.lang.CharSequence f6592;

    /* JADX INFO: renamed from: ζ */
    public final int f6593;

    /* JADX INFO: renamed from: η */
    public int f6594;

    public C0510lf(java.lang.CharSequence r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f6592 = r1
            r0.f6593 = r2
            r1 = 0
            r0.f6594 = r1
            return
    }

    @Override // java.text.CharacterIterator
    public final java.lang.Object clone() {
            r0 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L5
            return r0
        L5:
            java.lang.InternalError r0 = new java.lang.InternalError
            r0.<init>()
            throw r0
    }

    @Override // java.text.CharacterIterator
    public final char current() {
            r2 = this;
            int r0 = r2.f6594
            int r1 = r2.f6593
            if (r0 != r1) goto La
            r2 = 65535(0xffff, float:9.1834E-41)
            return r2
        La:
            java.lang.CharSequence r2 = r2.f6592
            char r2 = r2.charAt(r0)
            return r2
    }

    @Override // java.text.CharacterIterator
    public final char first() {
            r1 = this;
            r0 = 0
            r1.f6594 = r0
            char r1 = r1.current()
            return r1
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
            r0 = this;
            int r0 = r0.f6593
            return r0
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
            r0 = this;
            int r0 = r0.f6594
            return r0
    }

    @Override // java.text.CharacterIterator
    public final char last() {
            r1 = this;
            int r0 = r1.f6593
            if (r0 != 0) goto La
            r1.f6594 = r0
            r1 = 65535(0xffff, float:9.1834E-41)
            return r1
        La:
            int r0 = r0 + (-1)
            r1.f6594 = r0
            java.lang.CharSequence r1 = r1.f6592
            char r1 = r1.charAt(r0)
            return r1
    }

    @Override // java.text.CharacterIterator
    public final char next() {
            r2 = this;
            int r0 = r2.f6594
            int r0 = r0 + 1
            r2.f6594 = r0
            int r1 = r2.f6593
            if (r0 < r1) goto L10
            r2.f6594 = r1
            r2 = 65535(0xffff, float:9.1834E-41)
            return r2
        L10:
            java.lang.CharSequence r2 = r2.f6592
            char r2 = r2.charAt(r0)
            return r2
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
            r1 = this;
            int r0 = r1.f6594
            if (r0 > 0) goto L8
            r1 = 65535(0xffff, float:9.1834E-41)
            return r1
        L8:
            int r0 = r0 + (-1)
            r1.f6594 = r0
            java.lang.CharSequence r1 = r1.f6592
            char r1 = r1.charAt(r0)
            return r1
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int r2) {
            r1 = this;
            int r0 = r1.f6593
            if (r2 > r0) goto Ld
            if (r2 < 0) goto Ld
            r1.f6594 = r2
            char r1 = r1.current()
            return r1
        Ld:
            java.lang.String r1 = "invalid position"
            p000.C1080.m7275(r1)
            r1 = 0
            return r1
    }
}
