package defpackage;

/* JADX INFO: renamed from: ᲇᛲᛴᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1999 implements java.lang.Comparable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.String f8642;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f8643;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f8644;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.String f8645;

    public C1999(int r1, int r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f8644 = r1
            r0.f8643 = r2
            r0.f8642 = r3
            r0.f8645 = r4
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r3) {
            r2 = this;
            ᲇᛲᛴᛵ r3 = (defpackage.C1999) r3
            int r0 = r2.f8644
            int r1 = r3.f8644
            int r0 = r0 - r1
            if (r0 != 0) goto Lf
            int r2 = r2.f8643
            int r3 = r3.f8643
            int r2 = r2 - r3
            return r2
        Lf:
            return r0
    }
}
