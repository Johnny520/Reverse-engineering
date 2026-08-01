package defpackage;

/* JADX INFO: renamed from: ᛸᲈᛱᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1595 implements defpackage.InterfaceC1324, defpackage.InterfaceC0819 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.EnumC0469 f7046;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicInteger f7047;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.InterfaceC2087 f7048;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1661 f7049;

    public C1595(defpackage.InterfaceC2087 r1, defpackage.InterfaceC1661 r2) {
            r0 = this;
            r0.<init>()
            r0.f7048 = r1
            r0.f7049 = r2
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r2 = 0
            r1.<init>(r2)
            r0.f7047 = r1
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object m2889(defpackage.EnumC0469 r8, defpackage.InterfaceC2087 r9, defpackage.AbstractC1016 r10) {
            r7 = this;
            boolean r0 = r10 instanceof defpackage.C0161
            if (r0 == 0) goto L13
            r0 = r10
            ᛱᲀᛳᛷ r0 = (defpackage.C0161) r0
            int r1 = r0.f1132
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1132 = r1
            goto L18
        L13:
            ᛱᲀᛳᛷ r0 = new ᛱᲀᛳᛷ
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f1134
            int r1 = r0.f1132
            java.lang.String r2 = "ROLLBACK TRANSACTION"
            r3 = 0
            java.util.concurrent.atomic.AtomicInteger r4 = r7.f7047
            r5 = 1
            ᲀᛴᛴᛶ r6 = r7.f7049
            if (r1 == 0) goto L36
            if (r1 != r5) goto L30
            int r5 = r0.f1133
            defpackage.AbstractC0762.m1680(r10)     // Catch: java.lang.Throwable -> L2e
            goto L76
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r7)
            return r3
        L36:
            defpackage.AbstractC0762.m1680(r10)
            int r10 = r8.ordinal()
            if (r10 == 0) goto L56
            if (r10 == r5) goto L50
            r1 = 2
            if (r10 != r1) goto L4a
            java.lang.String r10 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.AbstractC1628.m2943(r6, r10)
            goto L5b
        L4a:
            ᛸᛵᛳᲀ r7 = new ᛸᛵᛳᲀ
            r7.<init>()
            throw r7
        L50:
            java.lang.String r10 = "BEGIN IMMEDIATE TRANSACTION"
            defpackage.AbstractC1628.m2943(r6, r10)
            goto L5b
        L56:
            java.lang.String r10 = "BEGIN DEFERRED TRANSACTION"
            defpackage.AbstractC1628.m2943(r6, r10)
        L5b:
            int r10 = r4.incrementAndGet()
            if (r10 <= 0) goto L63
            r7.f7046 = r8
        L63:
            ᛵᲀᛷᛲ r8 = new ᛵᲀᛷᛲ     // Catch: java.lang.Throwable -> L2e
            r10 = 0
            r8.<init>(r10, r7)     // Catch: java.lang.Throwable -> L2e
            r0.f1133 = r5     // Catch: java.lang.Throwable -> L2e
            r0.f1132 = r5     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = r9.mo388(r8, r0)     // Catch: java.lang.Throwable -> L2e
            ᛴᛵ r8 = defpackage.EnumC0670.f3246
            if (r10 != r8) goto L76
            return r8
        L76:
            int r8 = r4.decrementAndGet()
            if (r8 != 0) goto L7e
            r7.f7046 = r3
        L7e:
            if (r5 == 0) goto L86
            java.lang.String r7 = "END TRANSACTION"
            defpackage.AbstractC1628.m2943(r6, r7)
            return r10
        L86:
            defpackage.AbstractC1628.m2943(r6, r2)
            return r10
        L8a:
            throw r8     // Catch: java.lang.Throwable -> L8b
        L8b:
            r9 = move-exception
            int r10 = r4.decrementAndGet()     // Catch: android.database.SQLException -> L95
            if (r10 != 0) goto L97
            r7.f7046 = r3     // Catch: android.database.SQLException -> L95
            goto L97
        L95:
            r7 = move-exception
            goto L9b
        L97:
            defpackage.AbstractC1628.m2943(r6, r2)     // Catch: android.database.SQLException -> L95
            goto L9e
        L9b:
            defpackage.AbstractC2193.m3595(r8, r7)
        L9e:
            throw r9
    }

    @Override // defpackage.InterfaceC1008
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final java.lang.Object mo1906(java.lang.String r7, defpackage.InterfaceC0598 r8, defpackage.AbstractC1016 r9) {
            r6 = this;
            boolean r0 = r9 instanceof defpackage.C2284
            if (r0 == 0) goto L13
            r0 = r9
            ᲈᛷᛵᲈ r0 = (defpackage.C2284) r0
            int r1 = r0.f9643
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9643 = r1
            goto L18
        L13:
            ᲈᛷᛵᲈ r0 = new ᲈᛷᛵᲈ
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f9641
            int r1 = r0.f9643
            r2 = 2
            r3 = 1
            r4 = 0
            ᛴᛵ r5 = defpackage.EnumC0670.f3246
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.AbstractC0762.m1680(r9)
            return r9
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r6)
            return r4
        L31:
            ᛳᲈᲇᛳ r8 = r0.f9645
            java.lang.String r7 = r0.f9644
            defpackage.AbstractC0762.m1680(r9)
            goto L49
        L39:
            defpackage.AbstractC0762.m1680(r9)
            r0.f9644 = r7
            r0.f9645 = r8
            r0.f9643 = r3
            java.lang.Boolean r9 = r6.mo1989(r0)
            if (r9 != r5) goto L49
            goto L64
        L49:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L66
            ᛳᲁᛱᛶ r9 = new ᛳᲁᛱᛶ
            r9.<init>(r6, r7, r8, r4)
            r0.f9644 = r4
            r0.f9645 = r4
            r0.f9643 = r2
            ᲇᛷᛳᲀ r6 = r6.f7048
            java.lang.Object r6 = r6.mo388(r9, r0)
            if (r6 != r5) goto L65
        L64:
            return r5
        L65:
            return r6
        L66:
            ᲀᛴᛴᛶ r6 = r6.f7049
            ᛲᛳᲇᛱ r6 = r6.mo892(r7)
            java.lang.Object r7 = r8.mo617(r6)     // Catch: java.lang.Throwable -> L74
            defpackage.AbstractC0209.m772(r6, r4)
            return r7
        L74:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L76
        L76:
            r8 = move-exception
            defpackage.AbstractC0209.m772(r6, r7)
            throw r8
    }

    @Override // defpackage.InterfaceC1324
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final java.lang.Boolean mo1989(defpackage.InterfaceC0140 r1) {
            r0 = this;
            ᛳᛴᲈᛶ r1 = r0.f7046
            if (r1 != 0) goto Lf
            ᲀᛴᛴᛶ r0 = r0.f7049
            boolean r0 = r0.mo893()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    @Override // defpackage.InterfaceC1324
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.Object mo1990(defpackage.EnumC0469 r3, defpackage.InterfaceC2087 r4, defpackage.AbstractC1350 r5) {
            r2 = this;
            ᛴᲈᛴᛲ r0 = new ᛴᲈᛴᛲ
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            ᲇᛷᛳᲀ r2 = r2.f7048
            java.lang.Object r2 = r2.mo388(r0, r5)
            return r2
    }

    @Override // defpackage.InterfaceC0819
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final defpackage.InterfaceC1661 mo1748() {
            r0 = this;
            ᲀᛴᛴᛶ r0 = r0.f7049
            return r0
    }
}
