package defpackage;

/* JADX INFO: renamed from: ᛴᲇᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0786 implements defpackage.InterfaceC2182 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public boolean f3651;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public boolean f3652;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final boolean f3653;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final long f3654;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC2182 f3655;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0703 f3656;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public long f3657;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public boolean f3658;

    public C0786(defpackage.C0703 r1, defpackage.InterfaceC2182 r2, long r3, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f3656 = r1
            r0.f3655 = r2
            r0.f3654 = r3
            r0.f3653 = r5
            r1 = 1
            r0.f3658 = r1
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L18
            r1 = 0
            r0.m1709(r1)
        L18:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.f3652
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.f3652 = r0
            r1.m1708()     // Catch: java.io.IOException -> L10
            r0 = 0
            r1.m1709(r0)     // Catch: java.io.IOException -> L10
            return
        L10:
            r0 = move-exception
            java.io.IOException r1 = r1.m1709(r0)
            throw r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class<ᛴᲇᲀᲇ> r1 = defpackage.C0786.class
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            r1 = 40
            r0.append(r1)
            ᲈᛱᲇᛳ r2 = r2.f3655
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1077 mo1707() {
            r0 = this;
            ᲈᛱᲇᛳ r0 = r0.f3655
            ᛶᛵᛸᛱ r0 = r0.mo1707()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m1708() {
            r0 = this;
            ᲈᛱᲇᛳ r0 = r0.f3655
            r0.close()
            return
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final long mo782(long r9, defpackage.C1569 r11) {
            r8 = this;
            java.lang.String r9 = "expected "
            boolean r10 = r8.f3652
            if (r10 != 0) goto L6f
            ᲈᛱᲇᛳ r10 = r8.f3655     // Catch: java.io.IOException -> L21
            r0 = 8192(0x2000, double:4.0474E-320)
            long r10 = r10.mo782(r0, r11)     // Catch: java.io.IOException -> L21
            boolean r0 = r8.f3658     // Catch: java.io.IOException -> L21
            if (r0 == 0) goto L23
            r0 = 0
            r8.f3658 = r0     // Catch: java.io.IOException -> L21
            ᛴᛷᛳᲀ r0 = r8.f3656     // Catch: java.io.IOException -> L21
            java.lang.Object r0 = r0.f3356     // Catch: java.io.IOException -> L21
            ᛶᛴᲈ r0 = (defpackage.C1065) r0     // Catch: java.io.IOException -> L21
            ᛳᛳᲀᲁ r0 = r0.f4740     // Catch: java.io.IOException -> L21
            r0.getClass()     // Catch: java.io.IOException -> L21
            goto L23
        L21:
            r9 = move-exception
            goto L6a
        L23:
            r0 = -1
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L2e
            r8.m1709(r3)     // Catch: java.io.IOException -> L21
            return r0
        L2e:
            long r4 = r8.f3657     // Catch: java.io.IOException -> L21
            long r4 = r4 + r10
            long r6 = r8.f3654     // Catch: java.io.IOException -> L21
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L58
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L3c
            goto L58
        L3c:
            java.net.ProtocolException r10 = new java.net.ProtocolException     // Catch: java.io.IOException -> L21
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L21
            r11.<init>(r9)     // Catch: java.io.IOException -> L21
            long r0 = r8.f3654     // Catch: java.io.IOException -> L21
            r11.append(r0)     // Catch: java.io.IOException -> L21
            java.lang.String r9 = " bytes but received "
            r11.append(r9)     // Catch: java.io.IOException -> L21
            r11.append(r4)     // Catch: java.io.IOException -> L21
            java.lang.String r9 = r11.toString()     // Catch: java.io.IOException -> L21
            r10.<init>(r9)     // Catch: java.io.IOException -> L21
            throw r10     // Catch: java.io.IOException -> L21
        L58:
            r8.f3657 = r4     // Catch: java.io.IOException -> L21
            ᛴᛷᛳᲀ r9 = r8.f3656     // Catch: java.io.IOException -> L21
            java.lang.Object r9 = r9.f3353     // Catch: java.io.IOException -> L21
            ᛸᲀᛷ r9 = (defpackage.InterfaceC1559) r9     // Catch: java.io.IOException -> L21
            boolean r9 = r9.mo1510()     // Catch: java.io.IOException -> L21
            if (r9 == 0) goto L69
            r8.m1709(r3)     // Catch: java.io.IOException -> L21
        L69:
            return r10
        L6a:
            java.io.IOException r8 = r8.m1709(r9)
            throw r8
        L6f:
            java.lang.String r8 = "closed"
            defpackage.C2264.m3676(r8)
            r8 = 0
            return r8
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.io.IOException m1709(java.io.IOException r3) {
            r2 = this;
            boolean r0 = r2.f3651
            if (r0 == 0) goto L5
            return r3
        L5:
            r0 = 1
            r2.f3651 = r0
            if (r3 != 0) goto L1c
            boolean r0 = r2.f3658
            if (r0 == 0) goto L1c
            r0 = 0
            r2.f3658 = r0
            ᛴᛷᛳᲀ r0 = r2.f3656
            java.lang.Object r0 = r0.f3356
            ᛶᛴᲈ r0 = (defpackage.C1065) r0
            ᛳᛳᲀᲁ r0 = r0.f4740
            r0.getClass()
        L1c:
            ᛴᛷᛳᲀ r0 = r2.f3656
            boolean r2 = r2.f3653
            r1 = 8
            java.io.IOException r2 = defpackage.C0703.m1592(r0, r2, r3, r1)
            return r2
    }
}
