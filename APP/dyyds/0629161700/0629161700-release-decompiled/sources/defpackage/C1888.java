package defpackage;

/* JADX INFO: renamed from: ᲁᛷᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1888 implements defpackage.InterfaceC2085 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public boolean f8182;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public boolean f8183;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final boolean f8184;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final long f8185;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC2085 f8186;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0703 f8187;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f8188;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public long f8189;

    public C1888(defpackage.C0703 r1, defpackage.InterfaceC2085 r2, long r3, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f8187 = r1
            r0.f8186 = r2
            r0.f8185 = r3
            r0.f8184 = r5
            r0.f8182 = r5
            return
    }

    @Override // defpackage.InterfaceC2085, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r4 = this;
            boolean r0 = r4.f8183
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f8183 = r0
            r0 = -1
            long r2 = r4.f8185
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L1f
            long r0 = r4.f8189
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L17
            goto L1f
        L17:
            java.net.ProtocolException r4 = new java.net.ProtocolException
            java.lang.String r0 = "unexpected end of stream"
            r4.<init>(r0)
            throw r4
        L1f:
            r4.m3319()     // Catch: java.io.IOException -> L27
            r0 = 0
            r4.m3320(r0)     // Catch: java.io.IOException -> L27
            return
        L27:
            r0 = move-exception
            java.io.IOException r4 = r4.m3320(r0)
            throw r4
    }

    @Override // defpackage.InterfaceC2085, java.io.Flushable
    public final void flush() {
            r1 = this;
            r1.m3318()     // Catch: java.io.IOException -> L4
            return
        L4:
            r0 = move-exception
            java.io.IOException r1 = r1.m3320(r0)
            throw r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class<ᲁᛷᛷᛷ> r1 = defpackage.C1888.class
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            r1 = 40
            r0.append(r1)
            ᲇᛷᛲᲁ r2 = r2.f8186
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void m3318() {
            r0 = this;
            ᲇᛷᛲᲁ r0 = r0.f8186
            r0.flush()
            return
    }

    @Override // defpackage.InterfaceC2085
    /* JADX INFO: renamed from: ᛴᛸᲈᲈ */
    public final void mo484(long r5, defpackage.C1569 r7) {
            r4 = this;
            boolean r0 = r4.f8183
            if (r0 != 0) goto L5a
            long r0 = r4.f8185
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L35
            long r2 = r4.f8189
            long r2 = r2 + r5
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L14
            goto L35
        L14:
            java.net.ProtocolException r7 = new java.net.ProtocolException
            long r0 = r4.f8185
            long r2 = r4.f8189
            long r2 = r2 + r5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "expected "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r5 = " bytes but received "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r7.<init>(r4)
            throw r7
        L35:
            boolean r0 = r4.f8182     // Catch: java.io.IOException -> L48
            if (r0 == 0) goto L4a
            r0 = 0
            r4.f8182 = r0     // Catch: java.io.IOException -> L48
            ᛴᛷᛳᲀ r0 = r4.f8187     // Catch: java.io.IOException -> L48
            java.lang.Object r0 = r0.f3356     // Catch: java.io.IOException -> L48
            ᛶᛴᲈ r0 = (defpackage.C1065) r0     // Catch: java.io.IOException -> L48
            ᛳᛳᲀᲁ r0 = r0.f4740     // Catch: java.io.IOException -> L48
            r0.getClass()     // Catch: java.io.IOException -> L48
            goto L4a
        L48:
            r5 = move-exception
            goto L55
        L4a:
            ᲇᛷᛲᲁ r0 = r4.f8186     // Catch: java.io.IOException -> L48
            r0.mo484(r5, r7)     // Catch: java.io.IOException -> L48
            long r0 = r4.f8189     // Catch: java.io.IOException -> L48
            long r0 = r0 + r5
            r4.f8189 = r0     // Catch: java.io.IOException -> L48
            return
        L55:
            java.io.IOException r4 = r4.m3320(r5)
            throw r4
        L5a:
            java.lang.String r4 = "closed"
            defpackage.C2264.m3676(r4)
            return
    }

    @Override // defpackage.InterfaceC2085
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C1077 mo485() {
            r0 = this;
            ᲇᛷᛲᲁ r0 = r0.f8186
            ᛶᛵᛸᛱ r0 = r0.mo485()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3319() {
            r0 = this;
            ᲇᛷᛲᲁ r0 = r0.f8186
            r0.close()
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.io.IOException m3320(java.io.IOException r3) {
            r2 = this;
            boolean r0 = r2.f8188
            if (r0 == 0) goto L5
            return r3
        L5:
            r0 = 1
            r2.f8188 = r0
            boolean r0 = r2.f8184
            r1 = 4
            ᛴᛷᛳᲀ r2 = r2.f8187
            java.io.IOException r2 = defpackage.C0703.m1592(r2, r0, r3, r1)
            return r2
    }
}
