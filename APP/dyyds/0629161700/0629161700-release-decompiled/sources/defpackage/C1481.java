package defpackage;

/* JADX INFO: renamed from: ᛸᛴᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1481 implements java.lang.CharSequence {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.lang.String f6566;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public char[] f6567;

    @Override // java.lang.CharSequence
    public final char charAt(int r1) {
            r0 = this;
            char[] r0 = r0.f6567
            char r0 = r0[r1]
            return r0
    }

    @Override // java.lang.CharSequence
    public final int length() {
            r0 = this;
            char[] r0 = r0.f6567
            int r0 = r0.length
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int r2, int r3) {
            r1 = this;
            java.lang.String r0 = new java.lang.String
            char[] r1 = r1.f6567
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.f6566
            if (r0 != 0) goto Ld
            java.lang.String r0 = new java.lang.String
            char[] r1 = r2.f6567
            r0.<init>(r1)
            r2.f6566 = r0
        Ld:
            return r0
    }
}
