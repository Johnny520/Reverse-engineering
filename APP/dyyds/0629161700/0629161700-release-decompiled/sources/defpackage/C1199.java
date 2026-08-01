package defpackage;

/* JADX INFO: renamed from: ᛷᛱᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1199 implements defpackage.InterfaceC2182 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f5404;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.zip.Inflater f5405;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2252 f5406;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f5407;

    public C1199(defpackage.C2252 r1, java.util.zip.Inflater r2) {
            r0 = this;
            r0.<init>()
            r0.f5406 = r1
            r0.f5405 = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.f5407
            if (r0 == 0) goto L5
            return
        L5:
            java.util.zip.Inflater r0 = r1.f5405
            r0.end()
            r0 = 1
            r1.f5407 = r0
            ᲈᛵᲈᛵ r1 = r1.f5406
            r1.close()
            return
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C1077 mo1707() {
            r0 = this;
            ᲈᛵᲈᛵ r0 = r0.f5406
            ᲈᛱᲇᛳ r0 = r0.f9579
            ᛶᛵᛸᛱ r0 = r0.mo1707()
            return r0
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final long mo782(long r8, defpackage.C1569 r10) {
            r7 = this;
            java.util.zip.Inflater r8 = r7.f5405
        L2:
            boolean r9 = r7.f5407
            r0 = 0
            if (r9 != 0) goto L9e
            r9 = 1
            ᲁᲇᛶᛶ r9 = r10.m2846(r9)     // Catch: java.util.zip.DataFormatException -> L97
            int r2 = r9.f8466     // Catch: java.util.zip.DataFormatException -> L97
            int r2 = 8192 - r2
            long r2 = (long) r2     // Catch: java.util.zip.DataFormatException -> L97
            r4 = 8192(0x2000, double:4.0474E-320)
            long r2 = java.lang.Math.min(r4, r2)     // Catch: java.util.zip.DataFormatException -> L97
            int r2 = (int) r2     // Catch: java.util.zip.DataFormatException -> L97
            boolean r3 = r8.needsInput()     // Catch: java.util.zip.DataFormatException -> L97
            ᲈᛵᲈᛵ r4 = r7.f5406
            if (r3 != 0) goto L22
            goto L39
        L22:
            boolean r3 = r4.m3645()     // Catch: java.util.zip.DataFormatException -> L97
            if (r3 == 0) goto L29
            goto L39
        L29:
            ᛸᲁᛵ r3 = r4.f9578     // Catch: java.util.zip.DataFormatException -> L97
            ᲁᲇᛶᛶ r3 = r3.f6929     // Catch: java.util.zip.DataFormatException -> L97
            int r5 = r3.f8466     // Catch: java.util.zip.DataFormatException -> L97
            int r6 = r3.f8468     // Catch: java.util.zip.DataFormatException -> L97
            int r5 = r5 - r6
            r7.f5404 = r5     // Catch: java.util.zip.DataFormatException -> L97
            byte[] r3 = r3.f8467     // Catch: java.util.zip.DataFormatException -> L97
            r8.setInput(r3, r6, r5)     // Catch: java.util.zip.DataFormatException -> L97
        L39:
            byte[] r3 = r9.f8467     // Catch: java.util.zip.DataFormatException -> L97
            int r5 = r9.f8466     // Catch: java.util.zip.DataFormatException -> L97
            int r2 = r8.inflate(r3, r5, r2)     // Catch: java.util.zip.DataFormatException -> L97
            int r3 = r7.f5404     // Catch: java.util.zip.DataFormatException -> L97
            if (r3 != 0) goto L46
            goto L54
        L46:
            int r5 = r8.getRemaining()     // Catch: java.util.zip.DataFormatException -> L97
            int r3 = r3 - r5
            int r5 = r7.f5404     // Catch: java.util.zip.DataFormatException -> L97
            int r5 = r5 - r3
            r7.f5404 = r5     // Catch: java.util.zip.DataFormatException -> L97
            long r5 = (long) r3     // Catch: java.util.zip.DataFormatException -> L97
            r4.m3647(r5)     // Catch: java.util.zip.DataFormatException -> L97
        L54:
            if (r2 <= 0) goto L62
            int r3 = r9.f8466     // Catch: java.util.zip.DataFormatException -> L97
            int r3 = r3 + r2
            r9.f8466 = r3     // Catch: java.util.zip.DataFormatException -> L97
            long r5 = r10.f6928     // Catch: java.util.zip.DataFormatException -> L97
            long r2 = (long) r2     // Catch: java.util.zip.DataFormatException -> L97
            long r5 = r5 + r2
            r10.f6928 = r5     // Catch: java.util.zip.DataFormatException -> L97
            goto L72
        L62:
            int r2 = r9.f8468     // Catch: java.util.zip.DataFormatException -> L97
            int r3 = r9.f8466     // Catch: java.util.zip.DataFormatException -> L97
            if (r2 != r3) goto L71
            ᲁᲇᛶᛶ r2 = r9.m3361()     // Catch: java.util.zip.DataFormatException -> L97
            r10.f6929 = r2     // Catch: java.util.zip.DataFormatException -> L97
            defpackage.AbstractC1590.m2869(r9)     // Catch: java.util.zip.DataFormatException -> L97
        L71:
            r2 = r0
        L72:
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 <= 0) goto L77
            return r2
        L77:
            boolean r9 = r8.finished()
            if (r9 != 0) goto L94
            boolean r9 = r8.needsDictionary()
            if (r9 == 0) goto L84
            goto L94
        L84:
            boolean r9 = r4.m3645()
            if (r9 != 0) goto L8c
            goto L2
        L8c:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r8 = "source exhausted prematurely"
            r7.<init>(r8)
            throw r7
        L94:
            r7 = -1
            return r7
        L97:
            r7 = move-exception
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r7)
            throw r8
        L9e:
            java.lang.String r7 = "closed"
            defpackage.C2264.m3676(r7)
            return r0
    }
}
