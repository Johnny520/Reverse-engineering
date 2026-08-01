package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class mc0 implements p000.rx1 {

    /* JADX INFO: renamed from: ε */
    public byte f7063;

    /* JADX INFO: renamed from: ζ */
    public final p000.rk1 f7064;

    /* JADX INFO: renamed from: η */
    public final java.util.zip.Inflater f7065;

    /* JADX INFO: renamed from: θ */
    public final p000.vl0 f7066;

    /* JADX INFO: renamed from: ι */
    public final java.util.zip.CRC32 f7067;

    public mc0(p000.InterfaceC0014ad r3) {
            r2 = this;
            r3.getClass()
            r2.<init>()
            rk1 r0 = new rk1
            r0.<init>(r3)
            r2.f7064 = r0
            java.util.zip.Inflater r3 = new java.util.zip.Inflater
            r1 = 1
            r3.<init>(r1)
            r2.f7065 = r3
            vl0 r1 = new vl0
            r1.<init>(r0, r3)
            r2.f7066 = r1
            java.util.zip.CRC32 r3 = new java.util.zip.CRC32
            r3.<init>()
            r2.f7067 = r3
            return
    }

    /* JADX INFO: renamed from: δ */
    public static void m3801(int r2, int r3, java.lang.String r4) {
            if (r3 != r2) goto L3
            return
        L3:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r3 = p000.ln0.m3651(r3)
            r1 = 8
            java.lang.String r3 = p000.q02.m4676(r3, r1)
            java.lang.String r2 = p000.ln0.m3651(r2)
            java.lang.String r2 = p000.q02.m4676(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = ": actual 0x"
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = " != expected 0x"
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            vl0 r0 = r0.f7066
            r0.close()
            return
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: α */
    public final p000.m42 mo2105() {
            r0 = this;
            rk1 r0 = r0.f7064
            rx1 r0 = r0.f9395
            m42 r0 = r0.mo2105()
            return r0
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: β */
    public final long mo2106(long r23, p000.C0793sc r25) {
            r22 = this;
            r0 = r22
            r6 = r25
            r6.getClass()
            byte r1 = r0.f7063
            java.util.zip.CRC32 r7 = r0.f7067
            r8 = 1
            rk1 r9 = r0.f7064
            r15 = -1
            if (r1 != 0) goto L108
            r1 = 10
            r9.mo61(r1)
            sc r1 = r9.f9396
            r2 = 3
            byte r17 = r1.m5455(r2)
            int r2 = r17 >> 1
            r2 = r2 & r8
            if (r2 != r8) goto L27
            r18 = r8
            goto L2a
        L27:
            r2 = 0
            r18 = r2
        L2a:
            if (r18 == 0) goto L33
            r2 = 0
            r4 = 10
            r0.m3802(r1, r2, r4)
        L33:
            short r0 = r9.readShort()
            java.lang.String r2 = "ID1ID2"
            r3 = 8075(0x1f8b, float:1.1315E-41)
            m3801(r3, r0, r2)
            r2 = 8
            r9.skip(r2)
            int r0 = r17 >> 2
            r0 = r0 & r8
            r19 = 65280(0xff00, float:9.1477E-41)
            r10 = 2
            if (r0 != r8) goto L7d
            r9.mo61(r10)
            if (r18 == 0) goto L5b
            r2 = 0
            r4 = 2
            r0 = r22
            r0.m3802(r1, r2, r4)
        L5b:
            short r0 = r1.readShort()
            r2 = r0 & r19
            int r2 = r2 >>> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r0 = r0 | r2
            short r0 = (short) r0
            r2 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r2
            long r4 = (long) r0
            r9.mo61(r4)
            if (r18 == 0) goto L7a
            r2 = 0
            r0 = r22
            r0.m3802(r1, r2, r4)
        L7a:
            r9.skip(r4)
        L7d:
            int r0 = r17 >> 3
            r0 = r0 & r8
            r20 = 1
            if (r0 != r8) goto Lb0
            r2 = r10
            r11 = 0
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            long r10 = r9.m5110(r10, r11, r13)
            int r0 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r0 == 0) goto Laa
            if (r18 == 0) goto La3
            r4 = r2
            r2 = 0
            r12 = r4
            long r4 = r10 + r20
            r0 = r22
            r0.m3802(r1, r2, r4)
            goto La4
        La3:
            r12 = r2
        La4:
            long r10 = r10 + r20
            r9.skip(r10)
            goto Lb1
        Laa:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        Lb0:
            r12 = r10
        Lb1:
            int r0 = r17 >> 4
            r0 = r0 & r8
            if (r0 != r8) goto Le3
            r2 = r12
            r11 = 0
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            long r10 = r9.m5110(r10, r11, r13)
            int r0 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r0 == 0) goto Ldd
            if (r18 == 0) goto Ld4
            r12 = r2
            r2 = 0
            long r4 = r10 + r20
            r0 = r22
            r0.m3802(r1, r2, r4)
            goto Ld7
        Ld4:
            r0 = r22
            r12 = r2
        Ld7:
            long r10 = r10 + r20
            r9.skip(r10)
            goto Le5
        Ldd:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        Le3:
            r0 = r22
        Le5:
            if (r18 == 0) goto L106
            r9.mo61(r12)
            short r1 = r1.readShort()
            r2 = r1 & r19
            int r2 = r2 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r1 = r1 | r2
            short r1 = (short) r1
            long r2 = r7.getValue()
            int r2 = (int) r2
            short r2 = (short) r2
            java.lang.String r3 = "FHCRC"
            m3801(r1, r2, r3)
            r7.reset()
        L106:
            r0.f7063 = r8
        L108:
            byte r1 = r0.f7063
            r10 = 2
            if (r1 != r8) goto L122
            long r2 = r6.f9828
            vl0 r1 = r0.f7066
            r4 = 8192(0x2000, double:4.0474E-320)
            long r4 = r1.mo2106(r4, r6)
            int r1 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r1 == 0) goto L120
            r1 = r6
            r0.m3802(r1, r2, r4)
            return r4
        L120:
            r0.f7063 = r10
        L122:
            byte r1 = r0.f7063
            if (r1 != r10) goto L156
            int r1 = r9.m5111()
            long r2 = r7.getValue()
            int r2 = (int) r2
            java.lang.String r3 = "CRC"
            m3801(r1, r2, r3)
            int r1 = r9.m5111()
            java.util.zip.Inflater r2 = r0.f7065
            long r2 = r2.getBytesWritten()
            int r2 = (int) r2
            java.lang.String r3 = "ISIZE"
            m3801(r1, r2, r3)
            r1 = 3
            r0.f7063 = r1
            boolean r0 = r9.m5109()
            if (r0 == 0) goto L14e
            goto L156
        L14e:
            java.lang.String r0 = "gzip finished without exhausting source"
            p000.C1080.m7281(r0)
            r0 = 0
            return r0
        L156:
            return r15
    }

    /* JADX INFO: renamed from: η */
    public final void m3802(p000.C0793sc r5, long r6, long r8) {
            r4 = this;
            rr1 r5 = r5.f9827
            r5.getClass()
        L5:
            int r0 = r5.f9473
            int r1 = r5.f9472
            int r2 = r0 - r1
            long r2 = (long) r2
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 < 0) goto L19
            int r0 = r0 - r1
            long r0 = (long) r0
            long r6 = r6 - r0
            rr1 r5 = r5.f9476
            r5.getClass()
            goto L5
        L19:
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L3d
            int r2 = r5.f9472
            long r2 = (long) r2
            long r2 = r2 + r6
            int r6 = (int) r2
            int r7 = r5.f9473
            int r7 = r7 - r6
            long r2 = (long) r7
            long r2 = java.lang.Math.min(r2, r8)
            int r7 = (int) r2
            java.util.zip.CRC32 r2 = r4.f7067
            byte[] r3 = r5.f9471
            r2.update(r3, r6, r7)
            long r6 = (long) r7
            long r8 = r8 - r6
            rr1 r5 = r5.f9476
            r5.getClass()
            r6 = r0
            goto L19
        L3d:
            return
    }
}
