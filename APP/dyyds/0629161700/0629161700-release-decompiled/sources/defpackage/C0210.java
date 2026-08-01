package defpackage;

/* JADX INFO: renamed from: ᛱᲈᛱᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0210 extends defpackage.AbstractC1947 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public boolean f1318;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0669 f1319;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public long f1320;

    public C0210(defpackage.C0669 r1, defpackage.C0520 r2) {
            r0 = this;
            r0.f1319 = r1
            r0.<init>(r1, r2)
            r1 = -1
            r0.f1320 = r1
            r1 = 1
            r0.f1318 = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.f8471
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r1.f1318
            if (r0 == 0) goto L1f
            r0 = 100
            boolean r0 = defpackage.AbstractC0508.m1299(r1, r0)     // Catch: java.io.IOException -> L10
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 != 0) goto L1f
            ᛴᛴᲈᛷ r0 = r1.f1319
            ᛳᲁᲀᲇ r0 = r0.f3244
            r0.mo1355()
            ᛱᛱᛷᛳ r0 = defpackage.C0669.f3239
            r1.m3363(r0)
        L1f:
            r0 = 1
            r1.f8471 = r0
            return
    }

    @Override // defpackage.AbstractC1947, defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final long mo782(long r17, defpackage.C1569 r19) {
            r16 = this;
            r0 = r16
            ᛴᛴᲈᛷ r1 = r0.f1319
            ᛷᛸᛱᛸ r2 = r1.f3242
            boolean r3 = r0.f8471
            r4 = 0
            if (r3 != 0) goto L112
            boolean r3 = r0.f1318
            r6 = -1
            if (r3 != 0) goto L14
            goto Lbb
        L14:
            long r8 = r0.f1320
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 == 0) goto L1e
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 != 0) goto Lbc
        L1e:
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r2.f5857
            ᲈᛵᲈᛵ r3 = (defpackage.C2252) r3
            r3.m3646(r8)
        L2e:
            java.lang.Object r3 = r2.f5857     // Catch: java.lang.NumberFormatException -> L107
            ᲈᛵᲈᛵ r3 = (defpackage.C2252) r3     // Catch: java.lang.NumberFormatException -> L107
            ᛸᲁᛵ r10 = r3.f9578     // Catch: java.lang.NumberFormatException -> L107
            r11 = 1
            r3.m3644(r11)     // Catch: java.lang.NumberFormatException -> L107
            r11 = 0
            r12 = r11
        L3b:
            int r13 = r12 + 1
            long r14 = (long) r13     // Catch: java.lang.NumberFormatException -> L107
            boolean r14 = r3.m3639(r14)     // Catch: java.lang.NumberFormatException -> L107
            if (r14 == 0) goto L7c
            long r14 = (long) r12     // Catch: java.lang.NumberFormatException -> L107
            byte r14 = r10.m2857(r14)     // Catch: java.lang.NumberFormatException -> L107
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
            defpackage.AbstractC0729.m1643(r1)     // Catch: java.lang.NumberFormatException -> L107
            java.lang.String r1 = java.lang.Integer.toString(r14, r1)     // Catch: java.lang.NumberFormatException -> L107
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.NumberFormatException -> L107
            r0.<init>(r1)     // Catch: java.lang.NumberFormatException -> L107
            throw r0     // Catch: java.lang.NumberFormatException -> L107
        L7c:
            long r12 = r10.m2837()     // Catch: java.lang.NumberFormatException -> L107
            r0.f1320 = r12     // Catch: java.lang.NumberFormatException -> L107
            java.lang.Object r2 = r2.f5857     // Catch: java.lang.NumberFormatException -> L107
            ᲈᛵᲈᛵ r2 = (defpackage.C2252) r2     // Catch: java.lang.NumberFormatException -> L107
            java.lang.String r2 = r2.m3646(r8)     // Catch: java.lang.NumberFormatException -> L107
            java.lang.CharSequence r2 = defpackage.AbstractC1347.m2521(r2)     // Catch: java.lang.NumberFormatException -> L107
            java.lang.String r2 = r2.toString()     // Catch: java.lang.NumberFormatException -> L107
            long r8 = r0.f1320     // Catch: java.lang.NumberFormatException -> L107
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 < 0) goto Le6
            int r3 = r2.length()     // Catch: java.lang.NumberFormatException -> L107
            if (r3 <= 0) goto La6
            java.lang.String r3 = ";"
            boolean r3 = r2.startsWith(r3)     // Catch: java.lang.NumberFormatException -> L107
            if (r3 == 0) goto Le6
        La6:
            long r2 = r0.f1320
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lb7
            r0.f1318 = r11
            ᛱᲀᛸᛴ r2 = r1.f3240
            ᛱᛱᛷᛳ r2 = r2.m703()
            r0.m3363(r2)
        Lb7:
            boolean r2 = r0.f1318
            if (r2 != 0) goto Lbc
        Lbb:
            return r6
        Lbc:
            long r2 = r0.f1320
            r4 = 8192(0x2000, double:4.0474E-320)
            long r2 = java.lang.Math.min(r4, r2)
            r4 = r19
            long r2 = super.mo782(r2, r4)
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto Ld4
            long r4 = r0.f1320
            long r4 = r4 - r2
            r0.f1320 = r4
            return r2
        Ld4:
            ᛳᲁᲀᲇ r1 = r1.f3244
            r1.mo1355()
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "unexpected end of stream"
            r1.<init>(r2)
            ᛱᛱᛷᛳ r2 = defpackage.C0669.f3239
            r0.m3363(r2)
            throw r1
        Le6:
            java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> L107
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L107
            r3.<init>()     // Catch: java.lang.NumberFormatException -> L107
            java.lang.String r4 = "expected chunk size and optional extensions but was \""
            r3.append(r4)     // Catch: java.lang.NumberFormatException -> L107
            long r4 = r0.f1320     // Catch: java.lang.NumberFormatException -> L107
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
            defpackage.C2264.m3676(r0)
            return r4
    }
}
