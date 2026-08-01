package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛳᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0255 extends xhss.AbstractC1133 {

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0323 f943;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public boolean f944;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public long f945;

    public C0255(xhss.C0323 r1, xhss.C0669 r2) {
            r0 = this;
            r0.f943 = r1
            r0.<init>(r1, r2)
            r1 = -1
            r0.f945 = r1
            r1 = 1
            r0.f944 = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.f3660
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r1.f944
            if (r0 == 0) goto L1f
            r0 = 100
            boolean r0 = xhss.AbstractC0559.m995(r1, r0)     // Catch: java.io.IOException -> L10
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 != 0) goto L1f
            xhss.ᛳᲇᲁᲈ r0 = r1.f943
            xhss.ᲀᲀᲁᛱ r0 = r0.f1232
            r0.mo593()
            xhss.ᲁᛸᛱᛵ r0 = xhss.C0323.f1231
            r1.m1826(r0)
        L1f:
            r0 = 1
            r1.f3660 = r0
            return
    }

    @Override // xhss.AbstractC1133, xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final long mo235(long r17, xhss.C0338 r19) {
            r16 = this;
            r0 = r16
            xhss.ᛳᲇᲁᲈ r1 = r0.f943
            xhss.ᛷᛱᛳᲁ r2 = r1.f1233
            boolean r3 = r0.f3660
            r4 = 0
            if (r3 != 0) goto L112
            boolean r3 = r0.f944
            r6 = -1
            if (r3 != 0) goto L14
            goto Lbb
        L14:
            long r8 = r0.f945
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 == 0) goto L1e
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 != 0) goto Lbc
        L1e:
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r2.f2153
            xhss.ᲁᛸᛵᛳ r3 = (xhss.C0976) r3
            r3.m1616(r8)
        L2e:
            java.lang.Object r3 = r2.f2153     // Catch: java.lang.NumberFormatException -> L107
            xhss.ᲁᛸᛵᛳ r3 = (xhss.C0976) r3     // Catch: java.lang.NumberFormatException -> L107
            xhss.ᛴᛲᛴᛶ r10 = r3.f3178     // Catch: java.lang.NumberFormatException -> L107
            r11 = 1
            r3.m1609(r11)     // Catch: java.lang.NumberFormatException -> L107
            r11 = 0
            r12 = r11
        L3b:
            int r13 = r12 + 1
            long r14 = (long) r13     // Catch: java.lang.NumberFormatException -> L107
            boolean r14 = r3.m1608(r14)     // Catch: java.lang.NumberFormatException -> L107
            if (r14 == 0) goto L7c
            long r14 = (long) r12     // Catch: java.lang.NumberFormatException -> L107
            byte r14 = r10.m689(r14)     // Catch: java.lang.NumberFormatException -> L107
            r15 = 48
            if (r14 < r15) goto L51
            r15 = 57
            if (r14 <= r15) goto L62
        L51:
            r15 = 97
            if (r14 < r15) goto L59
            r15 = 102(0x66, float:1.43E-43)
            if (r14 <= r15) goto L62
        L59:
            r15 = 65
            if (r14 < r15) goto L64
            r15 = 70
            if (r14 <= r15) goto L62
            goto L64
        L62:
            r12 = r13
            goto L3b
        L64:
            if (r12 == 0) goto L67
            goto L7c
        L67:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException     // Catch: java.lang.NumberFormatException -> L107
            r1 = 16
            xhss.AbstractC0955.m1551(r1)     // Catch: java.lang.NumberFormatException -> L107
            java.lang.String r1 = java.lang.Integer.toString(r14, r1)     // Catch: java.lang.NumberFormatException -> L107
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.NumberFormatException -> L107
            r0.<init>(r1)     // Catch: java.lang.NumberFormatException -> L107
            throw r0     // Catch: java.lang.NumberFormatException -> L107
        L7c:
            long r12 = r10.m693()     // Catch: java.lang.NumberFormatException -> L107
            r0.f945 = r12     // Catch: java.lang.NumberFormatException -> L107
            java.lang.Object r2 = r2.f2153     // Catch: java.lang.NumberFormatException -> L107
            xhss.ᲁᛸᛵᛳ r2 = (xhss.C0976) r2     // Catch: java.lang.NumberFormatException -> L107
            java.lang.String r2 = r2.m1616(r8)     // Catch: java.lang.NumberFormatException -> L107
            java.lang.CharSequence r2 = xhss.AbstractC0120.m346(r2)     // Catch: java.lang.NumberFormatException -> L107
            java.lang.String r2 = r2.toString()     // Catch: java.lang.NumberFormatException -> L107
            long r8 = r0.f945     // Catch: java.lang.NumberFormatException -> L107
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 < 0) goto Le6
            int r3 = r2.length()     // Catch: java.lang.NumberFormatException -> L107
            if (r3 <= 0) goto La6
            java.lang.String r3 = ";"
            boolean r3 = xhss.AbstractC0226.m492(r2, r3, r11)     // Catch: java.lang.NumberFormatException -> L107
            if (r3 == 0) goto Le6
        La6:
            long r2 = r0.f945
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lb7
            r0.f944 = r11
            xhss.ᛱᛷᲇᲁ r2 = r1.f1234
            xhss.ᲁᛸᛱᛵ r2 = r2.m214()
            r0.m1826(r2)
        Lb7:
            boolean r2 = r0.f944
            if (r2 != 0) goto Lbc
        Lbb:
            return r6
        Lbc:
            long r2 = r0.f945
            r4 = 8192(0x2000, double:4.0474E-320)
            long r2 = java.lang.Math.min(r4, r2)
            r4 = r19
            long r2 = super.mo235(r2, r4)
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto Ld4
            long r4 = r0.f945
            long r4 = r4 - r2
            r0.f945 = r4
            return r2
        Ld4:
            xhss.ᲀᲀᲁᛱ r1 = r1.f1232
            r1.mo593()
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "unexpected end of stream"
            r1.<init>(r2)
            xhss.ᲁᛸᛱᛵ r2 = xhss.C0323.f1231
            r0.m1826(r2)
            throw r1
        Le6:
            java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> L107
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L107
            r3.<init>()     // Catch: java.lang.NumberFormatException -> L107
            java.lang.String r4 = "expected chunk size and optional extensions but was \""
            r3.append(r4)     // Catch: java.lang.NumberFormatException -> L107
            long r4 = r0.f945     // Catch: java.lang.NumberFormatException -> L107
            r3.append(r4)     // Catch: java.lang.NumberFormatException -> L107
            r3.append(r2)     // Catch: java.lang.NumberFormatException -> L107
            r0 = 34
            r3.append(r0)     // Catch: java.lang.NumberFormatException -> L107
            java.lang.String r0 = r3.toString()     // Catch: java.lang.NumberFormatException -> L107
            r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> L107
            throw r1     // Catch: java.lang.NumberFormatException -> L107
        L107:
            r0 = move-exception
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
        L112:
            java.lang.String r0 = "closed"
            xhss.C0532.m950(r0)
            return r4
    }
}
