package defpackage;

/* JADX INFO: renamed from: ᲇᛶᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2069 implements defpackage.InterfaceC2182 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.util.zip.Inflater f8885;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C2252 f8886;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public byte f8887;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C1199 f8888;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.util.zip.CRC32 f8889;

    public C2069(defpackage.InterfaceC1810 r3) {
            r2 = this;
            r2.<init>()
            ᲈᛵᲈᛵ r0 = new ᲈᛵᲈᛵ
            r0.<init>(r3)
            r2.f8886 = r0
            java.util.zip.Inflater r3 = new java.util.zip.Inflater
            r1 = 1
            r3.<init>(r1)
            r2.f8885 = r3
            ᛷᛱᛲᛶ r1 = new ᛷᛱᛲᛶ
            r1.<init>(r0, r3)
            r2.f8888 = r1
            java.util.zip.CRC32 r3 = new java.util.zip.CRC32
            r3.<init>()
            r2.f8889 = r3
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m3475(java.lang.String r2, int r3, int r4) {
            if (r4 != r3) goto L3
            return
        L3:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r4 = defpackage.AbstractC1171.m2255(r4)
            java.lang.String r4 = defpackage.AbstractC1347.m2499(r4)
            java.lang.String r3 = defpackage.AbstractC1171.m2255(r3)
            java.lang.String r3 = defpackage.AbstractC1347.m2499(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r2 = ": actual 0x"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " != expected 0x"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            ᛷᛱᛲᛶ r0 = r0.f8888
            r0.close()
            return
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C1077 mo1707() {
            r0 = this;
            ᲈᛵᲈᛵ r0 = r0.f8886
            ᲈᛱᲇᛳ r0 = r0.f9579
            ᛶᛵᛸᛱ r0 = r0.mo1707()
            return r0
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final long mo782(long r21, defpackage.C1569 r23) {
            r20 = this;
            r0 = r20
            r6 = r23
            ᲈᛵᲈᛵ r7 = r0.f8886
            ᛸᲁᛵ r1 = r7.f9578
            byte r2 = r0.f8887
            java.util.zip.CRC32 r8 = r0.f8889
            r9 = 1
            if (r2 != 0) goto L10f
            r2 = 10
            r7.m3644(r2)
            r2 = 3
            byte r12 = r1.m2857(r2)
            int r2 = r12 >> 1
            r2 = r2 & r9
            if (r2 != r9) goto L21
            r13 = r9
            goto L23
        L21:
            r2 = 0
            r13 = r2
        L23:
            if (r13 == 0) goto L2c
            r2 = 0
            r4 = 10
            r0.m3476(r1, r2, r4)
        L2c:
            short r0 = r7.m3642()
            java.lang.String r2 = "ID1ID2"
            r3 = 8075(0x1f8b, float:1.1315E-41)
            m3475(r2, r3, r0)
            r2 = 8
            r7.m3647(r2)
            int r0 = r12 >> 2
            r0 = r0 & r9
            r14 = 65280(0xff00, float:9.1477E-41)
            r2 = 2
            if (r0 != r9) goto L81
            r7.m3644(r2)
            if (r13 == 0) goto L5a
            r4 = r2
            r2 = 0
            r15 = r4
            r4 = 2
            r21 = -1
            r0 = r20
            r10 = r15
            r0.m3476(r1, r2, r4)
            goto L5d
        L5a:
            r10 = r2
            r21 = -1
        L5d:
            short r0 = r1.m2832()
            r2 = r0 & r14
            int r2 = r2 >>> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r0 = r0 | r2
            short r0 = (short) r0
            r2 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r2
            long r4 = (long) r0
            r7.m3644(r4)
            if (r13 == 0) goto L7c
            r2 = 0
            r0 = r20
            r0.m3476(r1, r2, r4)
        L7c:
            r15 = r1
            r7.m3647(r4)
            goto L85
        L81:
            r15 = r1
            r10 = r2
            r21 = -1
        L85:
            int r0 = r12 >> 3
            r0 = r0 & r9
            r16 = 1
            if (r0 != r9) goto Lb5
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1 = 0
            r0 = r7
            long r18 = r0.m3648(r1, r2, r4)
            int r0 = (r18 > r21 ? 1 : (r18 == r21 ? 0 : -1))
            if (r0 == 0) goto Laf
            if (r13 == 0) goto La9
            r2 = 0
            long r4 = r18 + r16
            r0 = r20
            r1 = r15
            r0.m3476(r1, r2, r4)
        La9:
            long r0 = r18 + r16
            r7.m3647(r0)
            goto Lb5
        Laf:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        Lb5:
            int r0 = r12 >> 4
            r0 = r0 & r9
            if (r0 != r9) goto Le7
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1 = 0
            r0 = r7
            long r18 = r0.m3648(r1, r2, r4)
            int r0 = (r18 > r21 ? 1 : (r18 == r21 ? 0 : -1))
            if (r0 == 0) goto Le1
            if (r13 == 0) goto Ld8
            r2 = 0
            long r4 = r18 + r16
            r0 = r20
            r1 = r15
            r0.m3476(r1, r2, r4)
            goto Ldb
        Ld8:
            r0 = r20
            r1 = r15
        Ldb:
            long r2 = r18 + r16
            r7.m3647(r2)
            goto Lea
        Le1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        Le7:
            r0 = r20
            r1 = r15
        Lea:
            if (r13 == 0) goto L10b
            r7.m3644(r10)
            short r1 = r1.m2832()
            r2 = r1 & r14
            int r2 = r2 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r1 = r1 | r2
            short r1 = (short) r1
            long r2 = r8.getValue()
            int r2 = (int) r2
            short r2 = (short) r2
            java.lang.String r3 = "FHCRC"
            m3475(r3, r1, r2)
            r8.reset()
        L10b:
            r0.f8887 = r9
            r2 = r9
            goto L111
        L10f:
            r21 = -1
        L111:
            r10 = 2
            if (r2 != r9) goto L12a
            long r2 = r6.f6928
            ᛷᛱᛲᛶ r1 = r0.f8888
            r4 = 8192(0x2000, double:4.0474E-320)
            long r4 = r1.mo782(r4, r6)
            int r1 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r1 == 0) goto L127
            r1 = r6
            r0.m3476(r1, r2, r4)
            return r4
        L127:
            r0.f8887 = r10
            r2 = r10
        L12a:
            if (r2 != r10) goto L15c
            int r1 = r7.m3643()
            long r2 = r8.getValue()
            int r2 = (int) r2
            java.lang.String r3 = "CRC"
            m3475(r3, r1, r2)
            int r1 = r7.m3643()
            java.util.zip.Inflater r2 = r0.f8885
            long r2 = r2.getBytesWritten()
            int r2 = (int) r2
            java.lang.String r3 = "ISIZE"
            m3475(r3, r1, r2)
            r1 = 3
            r0.f8887 = r1
            boolean r0 = r7.m3645()
            if (r0 == 0) goto L154
            goto L15c
        L154:
            java.lang.String r0 = "gzip finished without exhausting source"
            defpackage.C2264.m3682(r0)
            r0 = 0
            return r0
        L15c:
            return r21
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m3476(defpackage.C1569 r5, long r6, long r8) {
            r4 = this;
            ᲁᲇᛶᛶ r5 = r5.f6929
        L2:
            int r0 = r5.f8466
            int r1 = r5.f8468
            int r0 = r0 - r1
            long r0 = (long) r0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L10
            long r6 = r6 - r0
            ᲁᲇᛶᛶ r5 = r5.f8469
            goto L2
        L10:
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L31
            int r2 = r5.f8468
            long r2 = (long) r2
            long r2 = r2 + r6
            int r6 = (int) r2
            int r7 = r5.f8466
            int r7 = r7 - r6
            long r2 = (long) r7
            long r2 = java.lang.Math.min(r2, r8)
            int r7 = (int) r2
            java.util.zip.CRC32 r2 = r4.f8889
            byte[] r3 = r5.f8467
            r2.update(r3, r6, r7)
            long r6 = (long) r7
            long r8 = r8 - r6
            ᲁᲇᛶᛶ r5 = r5.f8469
            r6 = r0
            goto L10
        L31:
            return
    }
}
