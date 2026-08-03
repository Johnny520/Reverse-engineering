package j2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements java.text.CharacterIterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.CharSequence f6676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6678i;

    public c(java.lang.CharSequence r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f6676g = r1
            r0.f6677h = r2
            r1 = 0
            r0.f6678i = r1
            return
    }

    @Override // java.text.CharacterIterator
    public final java.lang.Object clone() {
            r1 = this;
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
            int r0 = r2.f6678i
            int r1 = r2.f6677h
            if (r0 != r1) goto La
            r0 = 65535(0xffff, float:9.1834E-41)
            return r0
        La:
            java.lang.CharSequence r1 = r2.f6676g
            char r0 = r1.charAt(r0)
            return r0
    }

    @Override // java.text.CharacterIterator
    public final char first() {
            r1 = this;
            r0 = 0
            r1.f6678i = r0
            char r0 = r1.current()
            return r0
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
            r1 = this;
            int r0 = r1.f6677h
            return r0
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
            r1 = this;
            int r0 = r1.f6678i
            return r0
    }

    @Override // java.text.CharacterIterator
    public final char last() {
            r2 = this;
            int r0 = r2.f6677h
            if (r0 != 0) goto La
            r2.f6678i = r0
            r0 = 65535(0xffff, float:9.1834E-41)
            return r0
        La:
            int r0 = r0 + (-1)
            r2.f6678i = r0
            java.lang.CharSequence r1 = r2.f6676g
            char r0 = r1.charAt(r0)
            return r0
    }

    @Override // java.text.CharacterIterator
    public final char next() {
            r2 = this;
            int r0 = r2.f6678i
            int r0 = r0 + 1
            r2.f6678i = r0
            int r1 = r2.f6677h
            if (r0 < r1) goto L10
            r2.f6678i = r1
            r0 = 65535(0xffff, float:9.1834E-41)
            return r0
        L10:
            java.lang.CharSequence r1 = r2.f6676g
            char r0 = r1.charAt(r0)
            return r0
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
            r2 = this;
            int r0 = r2.f6678i
            if (r0 > 0) goto L8
            r0 = 65535(0xffff, float:9.1834E-41)
            return r0
        L8:
            int r0 = r0 + (-1)
            r2.f6678i = r0
            java.lang.CharSequence r1 = r2.f6676g
            char r0 = r1.charAt(r0)
            return r0
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int r2) {
            r1 = this;
            int r0 = r1.f6677h
            if (r2 > r0) goto Ld
            if (r2 < 0) goto Ld
            r1.f6678i = r2
            char r2 = r1.current()
            return r2
        Ld:
            java.lang.String r2 = "invalid position"
            j8.o.t(r2)
            r2 = 0
            return r2
    }
}
