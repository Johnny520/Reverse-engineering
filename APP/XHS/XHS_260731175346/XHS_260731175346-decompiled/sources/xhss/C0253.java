package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛳᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0253 implements java.lang.CharSequence {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public char[] f941;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public java.lang.String f942;

    @Override // java.lang.CharSequence
    public final char charAt(int r1) {
            r0 = this;
            char[] r0 = r0.f941
            char r0 = r0[r1]
            return r0
    }

    @Override // java.lang.CharSequence
    public final int length() {
            r0 = this;
            char[] r0 = r0.f941
            int r0 = r0.length
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int r2, int r3) {
            r1 = this;
            java.lang.String r0 = new java.lang.String
            char[] r1 = r1.f941
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.f942
            if (r0 != 0) goto Ld
            java.lang.String r0 = new java.lang.String
            char[] r1 = r2.f941
            r0.<init>(r1)
            r2.f942 = r0
        Ld:
            return r0
    }
}
