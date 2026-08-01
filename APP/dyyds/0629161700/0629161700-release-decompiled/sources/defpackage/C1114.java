package defpackage;

/* JADX INFO: renamed from: ᛶᛷᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1114 implements defpackage.InterfaceC2182 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1077 f4985;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.io.InputStream f4986;

    public C1114(java.io.InputStream r1, defpackage.C1077 r2) {
            r0 = this;
            r0.<init>()
            r0.f4986 = r1
            r0.f4985 = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            java.io.InputStream r0 = r0.f4986
            r0.close()
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "source("
            r0.<init>(r1)
            java.io.InputStream r2 = r2.f4986
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C1077 mo1707() {
            r0 = this;
            ᛶᛵᛸᛱ r0 = r0.f4985
            return r0
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final long mo782(long r5, defpackage.C1569 r7) {
            r4 = this;
            ᛶᛵᛸᛱ r5 = r4.f4985     // Catch: java.lang.AssertionError -> L41
            r5.mo1364()     // Catch: java.lang.AssertionError -> L41
            r5 = 1
            ᲁᲇᛶᛶ r5 = r7.m2846(r5)     // Catch: java.lang.AssertionError -> L41
            int r6 = r5.f8466     // Catch: java.lang.AssertionError -> L41
            int r6 = 8192 - r6
            long r0 = (long) r6     // Catch: java.lang.AssertionError -> L41
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = java.lang.Math.min(r2, r0)     // Catch: java.lang.AssertionError -> L41
            int r6 = (int) r0     // Catch: java.lang.AssertionError -> L41
            java.io.InputStream r4 = r4.f4986     // Catch: java.lang.AssertionError -> L41
            byte[] r0 = r5.f8467     // Catch: java.lang.AssertionError -> L41
            int r1 = r5.f8466     // Catch: java.lang.AssertionError -> L41
            int r4 = r4.read(r0, r1, r6)     // Catch: java.lang.AssertionError -> L41
            r6 = -1
            if (r4 != r6) goto L35
            int r4 = r5.f8468     // Catch: java.lang.AssertionError -> L41
            int r6 = r5.f8466     // Catch: java.lang.AssertionError -> L41
            if (r4 != r6) goto L32
            ᲁᲇᛶᛶ r4 = r5.m3361()     // Catch: java.lang.AssertionError -> L41
            r7.f6929 = r4     // Catch: java.lang.AssertionError -> L41
            defpackage.AbstractC1590.m2869(r5)     // Catch: java.lang.AssertionError -> L41
        L32:
            r4 = -1
            return r4
        L35:
            int r6 = r5.f8466     // Catch: java.lang.AssertionError -> L41
            int r6 = r6 + r4
            r5.f8466 = r6     // Catch: java.lang.AssertionError -> L41
            long r5 = r7.f6928     // Catch: java.lang.AssertionError -> L41
            long r0 = (long) r4     // Catch: java.lang.AssertionError -> L41
            long r5 = r5 + r0
            r7.f6928 = r5     // Catch: java.lang.AssertionError -> L41
            return r0
        L41:
            r4 = move-exception
            boolean r5 = defpackage.AbstractC1607.m2906(r4)
            if (r5 == 0) goto L4e
            java.io.IOException r5 = new java.io.IOException
            r5.<init>(r4)
            throw r5
        L4e:
            throw r4
    }
}
