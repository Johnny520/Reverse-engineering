package defpackage;

/* JADX INFO: renamed from: ᛶᛳᛴᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1033 implements defpackage.InterfaceC1324, defpackage.InterfaceC0819 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public volatile boolean f4599;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1185 f4600;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final boolean f4601;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1500 f4602;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0408 f4603;

    public C1033(defpackage.C1500 r1, defpackage.C0408 r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f4602 = r1
            r0.f4603 = r2
            r0.f4601 = r3
            ᛶᲈᛷᛵ r1 = new ᛶᲈᛷᛵ
            r1.<init>()
            r0.f4600 = r1
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object m1988(defpackage.EnumC0469 r7, defpackage.AbstractC1016 r8) {
            r6 = this;
            ᛶᲈᛷᛵ r0 = r6.f4600
            java.lang.String r1 = "SAVEPOINT '"
            boolean r2 = r8 instanceof defpackage.C0152
            if (r2 == 0) goto L17
            r2 = r8
            ᛱᛸᲁᛳ r2 = (defpackage.C0152) r2
            int r3 = r2.f1116
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f1116 = r3
            goto L1c
        L17:
            ᛱᛸᲁᛳ r2 = new ᛱᛸᲁᛳ
            r2.<init>(r6, r8)
        L1c:
            java.lang.Object r8 = r2.f1114
            int r3 = r2.f1116
            r4 = 1
            ᛳᛱᛸᛳ r6 = r6.f4603
            r5 = 0
            if (r3 == 0) goto L38
            if (r3 != r4) goto L32
            ᛳᛱᛸᛳ r7 = r2.f1118
            ᛳᛴᲈᛶ r2 = r2.f1117
            defpackage.AbstractC0762.m1680(r8)
            r8 = r7
            r7 = r2
            goto L4d
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r6)
            return r5
        L38:
            defpackage.AbstractC0762.m1680(r8)
            r2.f1117 = r7
            r2.f1118 = r6
            r2.f1116 = r4
            ᛵᛱᛳᛶ r8 = r6.f2065
            java.lang.Object r8 = r8.mo1167(r2)
            ᛴᛵ r2 = defpackage.EnumC0670.f3246
            if (r8 != r2) goto L4c
            return r2
        L4c:
            r8 = r6
        L4d:
            int r2 = r0.f5379     // Catch: java.lang.Throwable -> L66
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto L7a
            int r7 = r7.ordinal()     // Catch: java.lang.Throwable -> L66
            if (r7 == 0) goto L74
            if (r7 == r4) goto L6e
            r1 = 2
            if (r7 != r1) goto L68
            java.lang.String r7 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.AbstractC1628.m2943(r6, r7)     // Catch: java.lang.Throwable -> L66
            goto L8e
        L66:
            r6 = move-exception
            goto L9c
        L68:
            ᛸᛵᛳᲀ r6 = new ᛸᛵᛳᲀ     // Catch: java.lang.Throwable -> L66
            r6.<init>()     // Catch: java.lang.Throwable -> L66
            throw r6     // Catch: java.lang.Throwable -> L66
        L6e:
            java.lang.String r7 = "BEGIN IMMEDIATE TRANSACTION"
            defpackage.AbstractC1628.m2943(r6, r7)     // Catch: java.lang.Throwable -> L66
            goto L8e
        L74:
            java.lang.String r7 = "BEGIN DEFERRED TRANSACTION"
            defpackage.AbstractC1628.m2943(r6, r7)     // Catch: java.lang.Throwable -> L66
            goto L8e
        L7a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L66
            r7.append(r2)     // Catch: java.lang.Throwable -> L66
            r1 = 39
            r7.append(r1)     // Catch: java.lang.Throwable -> L66
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L66
            defpackage.AbstractC1628.m2943(r6, r7)     // Catch: java.lang.Throwable -> L66
        L8e:
            ᲁᲁᛴᛲ r6 = new ᲁᲁᛴᛲ     // Catch: java.lang.Throwable -> L66
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L66
            r0.addLast(r6)     // Catch: java.lang.Throwable -> L66
            ᲁᲀᛱᲁ r6 = defpackage.C1907.f8270     // Catch: java.lang.Throwable -> L66
            r8.mo1166(r5)
            return r6
        L9c:
            r8.mo1166(r5)
            throw r6
    }

    @Override // defpackage.InterfaceC1008
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final java.lang.Object mo1906(java.lang.String r7, defpackage.InterfaceC0598 r8, defpackage.AbstractC1016 r9) {
            r6 = this;
            boolean r0 = r9 instanceof defpackage.C1465
            if (r0 == 0) goto L13
            r0 = r9
            ᛸᛳᲈᛴ r0 = (defpackage.C1465) r0
            int r1 = r0.f6491
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6491 = r1
            goto L18
        L13:
            ᛸᛳᲈᛴ r0 = new ᛸᛳᲈᛴ
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f6492
            ᛴᛵ r1 = defpackage.EnumC0670.f3246
            int r2 = r0.f6491
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            ᛳᛱᛸᛳ r7 = r0.f6490
            ᛳᲈᲇᛳ r8 = r0.f6495
            java.lang.String r0 = r0.f6494
            defpackage.AbstractC0762.m1680(r9)
            r9 = r7
            r7 = r0
            goto L62
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r6)
            return r4
        L36:
            defpackage.AbstractC0762.m1680(r9)
            boolean r9 = r6.f4599
            r2 = 21
            if (r9 != 0) goto L8b
            ᛳᛵᲈᛵ r9 = r0.f4527
            ᛸᛶᛱᛵ r5 = r6.f4602
            ᛶᲁᛳᲈ r9 = r9.mo970(r5)
            ᛸᲁᲈᛵ r9 = (defpackage.C1577) r9
            if (r9 == 0) goto L85
            ᛶᛳᛴᛶ r9 = r9.f6990
            if (r9 != r6) goto L85
            ᛳᛱᛸᛳ r9 = r6.f4603
            r0.f6494 = r7
            r0.f6495 = r8
            r0.f6490 = r9
            r0.f6491 = r3
            ᛵᛱᛳᛶ r2 = r9.f2065
            java.lang.Object r0 = r2.mo1167(r0)
            if (r0 != r1) goto L62
            return r1
        L62:
            ᛷᲀᛳᲇ r0 = new ᛷᲀᛳᲇ     // Catch: java.lang.Throwable -> L78
            ᛳᛱᛸᛳ r1 = r6.f4603     // Catch: java.lang.Throwable -> L78
            ᛲᛳᲇᛱ r7 = r1.mo892(r7)     // Catch: java.lang.Throwable -> L78
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L78
            java.lang.Object r6 = r8.mo617(r0)     // Catch: java.lang.Throwable -> L7a
            defpackage.AbstractC0209.m772(r0, r4)     // Catch: java.lang.Throwable -> L78
            r9.mo1166(r4)
            return r6
        L78:
            r6 = move-exception
            goto L81
        L7a:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L7c
        L7c:
            r7 = move-exception
            defpackage.AbstractC0209.m772(r0, r6)     // Catch: java.lang.Throwable -> L78
            throw r7     // Catch: java.lang.Throwable -> L78
        L81:
            r9.mo1166(r4)
            throw r6
        L85:
            java.lang.String r6 = "Attempted to use connection on a different coroutine"
            defpackage.AbstractC1628.m2954(r2, r6)
            throw r4
        L8b:
            java.lang.String r6 = "Connection is recycled"
            defpackage.AbstractC1628.m2954(r2, r6)
            throw r4
    }

    @Override // defpackage.InterfaceC1324
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Boolean mo1989(defpackage.InterfaceC0140 r4) {
            r3 = this;
            boolean r0 = r3.f4599
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L3a
            ᛶᛱᲀᛶ r4 = (defpackage.AbstractC1016) r4
            ᛳᛵᲈᛵ r4 = r4.f4527
            ᛸᛶᛱᛵ r0 = r3.f4602
            ᛶᲁᛳᲈ r4 = r4.mo970(r0)
            ᛸᲁᲈᛵ r4 = (defpackage.C1577) r4
            if (r4 == 0) goto L34
            ᛶᛳᛴᛶ r4 = r4.f6990
            if (r4 != r3) goto L34
            ᛶᲈᛷᛵ r4 = r3.f4600
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L2e
            ᛳᛱᛸᛳ r3 = r3.f4603
            ᲀᛴᛴᛶ r3 = r3.f2066
            boolean r3 = r3.mo893()
            if (r3 == 0) goto L2c
            goto L2e
        L2c:
            r3 = 0
            goto L2f
        L2e:
            r3 = 1
        L2f:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L34:
            java.lang.String r3 = "Attempted to use connection on a different coroutine"
            defpackage.AbstractC1628.m2954(r2, r3)
            throw r1
        L3a:
            java.lang.String r3 = "Connection is recycled"
            defpackage.AbstractC1628.m2954(r2, r3)
            throw r1
    }

    @Override // defpackage.InterfaceC1324
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Object mo1990(defpackage.EnumC0469 r5, defpackage.InterfaceC2087 r6, defpackage.AbstractC1350 r7) {
            r4 = this;
            boolean r0 = r4.f4599
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L22
            ᛳᛵᲈᛵ r0 = r7.f4527
            ᛸᛶᛱᛵ r3 = r4.f4602
            ᛶᲁᛳᲈ r0 = r0.mo970(r3)
            ᛸᲁᲈᛵ r0 = (defpackage.C1577) r0
            if (r0 == 0) goto L1c
            ᛶᛳᛴᛶ r0 = r0.f6990
            if (r0 != r4) goto L1c
            java.lang.Object r4 = r4.m1992(r5, r6, r7)
            return r4
        L1c:
            java.lang.String r4 = "Attempted to use connection on a different coroutine"
            defpackage.AbstractC1628.m2954(r2, r4)
            throw r1
        L22:
            java.lang.String r4 = "Connection is recycled"
            defpackage.AbstractC1628.m2954(r2, r4)
            throw r1
    }

    @Override // defpackage.InterfaceC0819
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final defpackage.InterfaceC1661 mo1748() {
            r0 = this;
            ᛳᛱᛸᛳ r0 = r0.f4603
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.Object m1991(boolean r8, defpackage.AbstractC1016 r9) {
            r7 = this;
            ᛶᲈᛷᛵ r0 = r7.f4600
            java.lang.String r1 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r2 = "RELEASE SAVEPOINT '"
            boolean r3 = r9 instanceof defpackage.C1287
            if (r3 == 0) goto L19
            r3 = r9
            ᛷᛶᛳᛵ r3 = (defpackage.C1287) r3
            int r4 = r3.f5720
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f5720 = r4
            goto L1e
        L19:
            ᛷᛶᛳᛵ r3 = new ᛷᛶᛳᛵ
            r3.<init>(r7, r9)
        L1e:
            java.lang.Object r9 = r3.f5718
            int r4 = r3.f5720
            r5 = 1
            ᛳᛱᛸᛳ r7 = r7.f4603
            r6 = 0
            if (r4 == 0) goto L38
            if (r4 != r5) goto L32
            boolean r8 = r3.f5721
            ᛳᛱᛸᛳ r3 = r3.f5722
            defpackage.AbstractC0762.m1680(r9)
            goto L4d
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r7)
            return r6
        L38:
            defpackage.AbstractC0762.m1680(r9)
            r3.f5722 = r7
            r3.f5721 = r8
            r3.f5720 = r5
            ᛵᛱᛳᛶ r9 = r7.f2065
            java.lang.Object r9 = r9.mo1167(r3)
            ᛴᛵ r3 = defpackage.EnumC0670.f3246
            if (r9 != r3) goto L4c
            return r3
        L4c:
            r3 = r7
        L4d:
            boolean r9 = r0.isEmpty()     // Catch: java.lang.Throwable -> L76
            if (r9 != 0) goto Lbb
            boolean r9 = r0.isEmpty()     // Catch: java.lang.Throwable -> L76
            if (r9 != 0) goto Lb3
            int r9 = defpackage.AbstractC0425.m1184(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.Object r9 = r0.remove(r9)     // Catch: java.lang.Throwable -> L76
            ᲁᲁᛴᛲ r9 = (defpackage.C1924) r9     // Catch: java.lang.Throwable -> L76
            r4 = 39
            if (r8 == 0) goto L8d
            r9.getClass()     // Catch: java.lang.Throwable -> L76
            boolean r8 = r0.isEmpty()     // Catch: java.lang.Throwable -> L76
            if (r8 == 0) goto L78
            java.lang.String r8 = "END TRANSACTION"
            defpackage.AbstractC1628.m2943(r7, r8)     // Catch: java.lang.Throwable -> L76
            goto Lad
        L76:
            r7 = move-exception
            goto Lc3
        L78:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L76
            int r9 = r9.f8364     // Catch: java.lang.Throwable -> L76
            r8.append(r9)     // Catch: java.lang.Throwable -> L76
            r8.append(r4)     // Catch: java.lang.Throwable -> L76
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L76
            defpackage.AbstractC1628.m2943(r7, r8)     // Catch: java.lang.Throwable -> L76
            goto Lad
        L8d:
            boolean r8 = r0.isEmpty()     // Catch: java.lang.Throwable -> L76
            if (r8 == 0) goto L99
            java.lang.String r8 = "ROLLBACK TRANSACTION"
            defpackage.AbstractC1628.m2943(r7, r8)     // Catch: java.lang.Throwable -> L76
            goto Lad
        L99:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L76
            int r9 = r9.f8364     // Catch: java.lang.Throwable -> L76
            r8.append(r9)     // Catch: java.lang.Throwable -> L76
            r8.append(r4)     // Catch: java.lang.Throwable -> L76
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L76
            defpackage.AbstractC1628.m2943(r7, r8)     // Catch: java.lang.Throwable -> L76
        Lad:
            ᲁᲀᛱᲁ r7 = defpackage.C1907.f8270     // Catch: java.lang.Throwable -> L76
            r3.mo1166(r6)
            return r7
        Lb3:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L76
            java.lang.String r8 = "List is empty."
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L76
            throw r7     // Catch: java.lang.Throwable -> L76
        Lbb:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L76
            java.lang.String r8 = "Not in a transaction"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L76
            throw r7     // Catch: java.lang.Throwable -> L76
        Lc3:
            r3.mo1166(r6)
            throw r7
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.lang.Object m1992(defpackage.EnumC0469 r11, defpackage.InterfaceC2087 r12, defpackage.AbstractC1016 r13) {
            r10 = this;
            boolean r0 = r13 instanceof defpackage.C1119
            if (r0 == 0) goto L13
            r0 = r13
            ᛶᛷᲈᛵ r0 = (defpackage.C1119) r0
            int r1 = r0.f4997
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4997 = r1
            goto L18
        L13:
            ᛶᛷᲈᛵ r0 = new ᛶᛷᲈᛵ
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f4998
            int r1 = r0.f4997
            r2 = 0
            r3 = 0
            r4 = 5
            r5 = 3
            r6 = 2
            r7 = 1
            ᛴᛵ r8 = defpackage.EnumC0670.f3246
            if (r1 == 0) goto L5c
            if (r1 == r7) goto L53
            if (r1 == r6) goto L4b
            if (r1 == r5) goto L45
            r10 = 4
            if (r1 == r10) goto L45
            if (r1 == r4) goto L37
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r10)
            return r2
        L37:
            java.lang.Throwable r10 = r0.f5001
            java.lang.Object r11 = r0.f5000
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            defpackage.AbstractC0762.m1680(r13)     // Catch: android.database.SQLException -> L42
            goto Laa
        L42:
            r12 = move-exception
            goto La5
        L45:
            java.lang.Object r10 = r0.f5000
            defpackage.AbstractC0762.m1680(r13)
            return r10
        L4b:
            int r11 = r0.f4996
            defpackage.AbstractC0762.m1680(r13)     // Catch: java.lang.Throwable -> L51
            goto L81
        L51:
            r11 = move-exception
            goto L90
        L53:
            java.lang.Object r11 = r0.f5000
            r12 = r11
            ᲇᛷᛳᲀ r12 = (defpackage.InterfaceC2087) r12
            defpackage.AbstractC0762.m1680(r13)
            goto L6e
        L5c:
            defpackage.AbstractC0762.m1680(r13)
            if (r11 != 0) goto L63
            ᛳᛴᲈᛶ r11 = defpackage.EnumC0469.f2348
        L63:
            r0.f5000 = r12
            r0.f4997 = r7
            java.lang.Object r11 = r10.m1988(r11, r0)
            if (r11 != r8) goto L6e
            goto L9e
        L6e:
            ᛵᲀᛷᛲ r11 = new ᛵᲀᛷᛲ     // Catch: java.lang.Throwable -> L51
            r11.<init>(r7, r10)     // Catch: java.lang.Throwable -> L51
            r0.f5000 = r2     // Catch: java.lang.Throwable -> L51
            r0.f4996 = r7     // Catch: java.lang.Throwable -> L51
            r0.f4997 = r6     // Catch: java.lang.Throwable -> L51
            java.lang.Object r13 = r12.mo388(r11, r0)     // Catch: java.lang.Throwable -> L51
            if (r13 != r8) goto L80
            goto L9e
        L80:
            r11 = r7
        L81:
            if (r11 == 0) goto L84
            r3 = r7
        L84:
            r0.f5000 = r13
            r0.f4997 = r5
            java.lang.Object r10 = r10.m1991(r3, r0)
            if (r10 != r8) goto L8f
            goto L9e
        L8f:
            return r13
        L90:
            throw r11     // Catch: java.lang.Throwable -> L91
        L91:
            r12 = move-exception
            r0.f5000 = r11     // Catch: android.database.SQLException -> La1
            r0.f5001 = r12     // Catch: android.database.SQLException -> La1
            r0.f4997 = r4     // Catch: android.database.SQLException -> La1
            java.lang.Object r10 = r10.m1991(r3, r0)     // Catch: android.database.SQLException -> La1
            if (r10 != r8) goto L9f
        L9e:
            return r8
        L9f:
            r10 = r12
            goto Laa
        La1:
            r10 = move-exception
            r9 = r12
            r12 = r10
            r10 = r9
        La5:
            if (r11 == 0) goto Lab
            defpackage.AbstractC2193.m3595(r11, r12)
        Laa:
            throw r10
        Lab:
            throw r12
    }
}
