package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class qf0 extends p000.of0 {

    /* JADX INFO: renamed from: ι */
    public long f8991;

    /* JADX INFO: renamed from: κ */
    public boolean f8992;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ p000.uf0 f8993;

    public qf0(p000.uf0 r1, p000.og0 r2) {
            r0 = this;
            r2.getClass()
            r0.f8993 = r1
            r0.<init>(r1, r2)
            r1 = -1
            r0.f8991 = r1
            r1 = 1
            r0.f8992 = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.f8069
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r1.f8992
            if (r0 == 0) goto L26
            java.util.TimeZone r0 = p000.ud2.f10709
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.getClass()
            r0 = 100
            boolean r0 = p000.ud2.m5848(r1, r0)     // Catch: java.io.IOException -> L17
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L26
            uf0 r0 = r1.f8993
            a00 r0 = r0.f10740
            r0.mo3()
            vc0 r0 = p000.uf0.f10738
            r1.m4229(r0)
        L26:
            r0 = 1
            r1.f8069 = r0
            return
    }

    @Override // p000.of0, p000.rx1
    /* JADX INFO: renamed from: β */
    public final long mo2106(long r17, p000.C0793sc r19) {
            r16 = this;
            r0 = r16
            uf0 r1 = r0.f8993
            m6 r2 = r1.f10741
            r19.getClass()
            boolean r3 = r0.f8069
            if (r3 != 0) goto L118
            boolean r3 = r0.f8992
            r4 = -1
            if (r3 != 0) goto L15
            goto Lc1
        L15:
            long r6 = r0.f8991
            r8 = 0
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 == 0) goto L21
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto Lc2
        L21:
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L31
            java.lang.Object r3 = r2.f6968
            rk1 r3 = (p000.rk1) r3
            r3.mo60(r6)
        L31:
            java.lang.Object r3 = r2.f6968     // Catch: java.lang.NumberFormatException -> L10d
            rk1 r3 = (p000.rk1) r3     // Catch: java.lang.NumberFormatException -> L10d
            sc r10 = r3.f9396     // Catch: java.lang.NumberFormatException -> L10d
            r11 = 1
            r3.mo61(r11)     // Catch: java.lang.NumberFormatException -> L10d
            r11 = 0
            r12 = r11
        L3e:
            int r13 = r12 + 1
            long r14 = (long) r13     // Catch: java.lang.NumberFormatException -> L10d
            boolean r14 = r3.m5112(r14)     // Catch: java.lang.NumberFormatException -> L10d
            if (r14 == 0) goto L82
            long r14 = (long) r12     // Catch: java.lang.NumberFormatException -> L10d
            byte r14 = r10.m5455(r14)     // Catch: java.lang.NumberFormatException -> L10d
            r15 = 48
            if (r14 < r15) goto L54
            r15 = 57
            if (r14 <= r15) goto L65
        L54:
            r15 = 97
            if (r14 < r15) goto L5c
            r15 = 102(0x66, float:1.43E-43)
            if (r14 <= r15) goto L65
        L5c:
            r15 = 65
            if (r14 < r15) goto L67
            r15 = 70
            if (r14 <= r15) goto L65
            goto L67
        L65:
            r12 = r13
            goto L3e
        L67:
            if (r12 == 0) goto L6a
            goto L82
        L6a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException     // Catch: java.lang.NumberFormatException -> L10d
            r1 = 16
            p000.jx0.m3045(r1)     // Catch: java.lang.NumberFormatException -> L10d
            java.lang.String r1 = java.lang.Integer.toString(r14, r1)     // Catch: java.lang.NumberFormatException -> L10d
            r1.getClass()     // Catch: java.lang.NumberFormatException -> L10d
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.NumberFormatException -> L10d
            r0.<init>(r1)     // Catch: java.lang.NumberFormatException -> L10d
            throw r0     // Catch: java.lang.NumberFormatException -> L10d
        L82:
            long r12 = r10.m5458()     // Catch: java.lang.NumberFormatException -> L10d
            r0.f8991 = r12     // Catch: java.lang.NumberFormatException -> L10d
            java.lang.Object r2 = r2.f6968     // Catch: java.lang.NumberFormatException -> L10d
            rk1 r2 = (p000.rk1) r2     // Catch: java.lang.NumberFormatException -> L10d
            java.lang.String r2 = r2.mo60(r6)     // Catch: java.lang.NumberFormatException -> L10d
            java.lang.CharSequence r2 = p000.q02.m4660(r2)     // Catch: java.lang.NumberFormatException -> L10d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.NumberFormatException -> L10d
            long r6 = r0.f8991     // Catch: java.lang.NumberFormatException -> L10d
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 < 0) goto Lec
            int r3 = r2.length()     // Catch: java.lang.NumberFormatException -> L10d
            if (r3 <= 0) goto Lac
            java.lang.String r3 = ";"
            boolean r3 = p000.x02.m6485(r2, r3, r11)     // Catch: java.lang.NumberFormatException -> L10d
            if (r3 == 0) goto Lec
        Lac:
            long r2 = r0.f8991
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto Lbd
            r0.f8992 = r11
            rf r2 = r1.f10743
            vc0 r2 = r2.m5083()
            r0.m4229(r2)
        Lbd:
            boolean r2 = r0.f8992
            if (r2 != 0) goto Lc2
        Lc1:
            return r4
        Lc2:
            long r2 = r0.f8991
            r6 = 8192(0x2000, double:4.0474E-320)
            long r2 = java.lang.Math.min(r6, r2)
            r6 = r19
            long r2 = super.mo2106(r2, r6)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto Lda
            long r4 = r0.f8991
            long r4 = r4 - r2
            r0.f8991 = r4
            return r2
        Lda:
            a00 r1 = r1.f10740
            r1.mo3()
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "unexpected end of stream"
            r1.<init>(r2)
            vc0 r2 = p000.uf0.f10738
            r0.m4229(r2)
            throw r1
        Lec:
            java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> L10d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L10d
            r3.<init>()     // Catch: java.lang.NumberFormatException -> L10d
            java.lang.String r4 = "expected chunk size and optional extensions but was \""
            r3.append(r4)     // Catch: java.lang.NumberFormatException -> L10d
            long r4 = r0.f8991     // Catch: java.lang.NumberFormatException -> L10d
            r3.append(r4)     // Catch: java.lang.NumberFormatException -> L10d
            r3.append(r2)     // Catch: java.lang.NumberFormatException -> L10d
            r0 = 34
            r3.append(r0)     // Catch: java.lang.NumberFormatException -> L10d
            java.lang.String r0 = r3.toString()     // Catch: java.lang.NumberFormatException -> L10d
            r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> L10d
            throw r1     // Catch: java.lang.NumberFormatException -> L10d
        L10d:
            r0 = move-exception
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
        L118:
            java.lang.String r0 = "closed"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
    }
}
