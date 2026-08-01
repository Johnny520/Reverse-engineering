package defpackage;

/* JADX INFO: renamed from: ᛱᛶᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0116 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final long f991;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final long f992;

    public C0116(long r4, long r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L10
            r3.f991 = r0
            r4 = 1
            r3.f992 = r4
            return
        L10:
            r3.f991 = r4
            r3.f992 = r6
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r3.f991
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            long r1 = r3.f992
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
