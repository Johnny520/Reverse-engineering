package defpackage;

/* JADX INFO: renamed from: ᲇᛷᛱᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2083 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final long f8929;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final long f8930;

    public C2083(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.f8929 = r1
            r0.f8930 = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.C2083
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᲇᛷᛱᛷ r8 = (defpackage.C2083) r8
            long r3 = r7.f8929
            long r5 = r8.f8929
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            long r3 = r7.f8930
            long r7 = r8.f8930
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.f8929
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.f8930
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -503095573782062(0xfffe366fef0961d2, double:NaN)
            java.lang.String r1 = "DownloadProgress(downloadedBytes="
            r0.<init>(r1)
            long r1 = r3.f8929
            r0.append(r1)
            r1 = -503241602670126(0xfffe364def0961d2, double:NaN)
            java.lang.String r1 = ", totalBytes="
            r0.append(r1)
            long r1 = r3.f8930
            r0.append(r1)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
