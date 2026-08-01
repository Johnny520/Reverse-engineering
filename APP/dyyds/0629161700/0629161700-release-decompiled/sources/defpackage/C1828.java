package defpackage;

/* JADX INFO: renamed from: ᲁᛳᛱᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1828 implements defpackage.InterfaceC1645 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final long f7971;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C1500 f7972;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0870 f7973;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0870 f7974;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.ThreadLocal f7975;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public volatile boolean f7976;

    public C1828(defpackage.C0682 r4) {
            r3 = this;
            r3.<init>()
            ᛸᛶᛱᛵ r0 = new ᛸᛶᛱᛵ
            r1 = 16
            r0.<init>(r1)
            r3.f7972 = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r3.f7975 = r0
            ᛷᲈᲀ r0 = defpackage.AbstractC0984.f4413
            r0 = 30
            ᛸᛸᲁᛵ r1 = defpackage.EnumC1551.f6877
            long r0 = defpackage.AbstractC0498.m1274(r0, r1)
            r3.f7971 = r0
            ᛵᛴᛶᛵ r0 = new ᛵᛴᛶᛵ
            ᛲᲀ r1 = new ᛲᲀ
            r2 = 3
            r1.<init>(r2, r4)
            r4 = 1
            r0.<init>(r4, r1)
            r3.f7974 = r0
            r3.f7973 = r0
            return
    }

    public C1828(defpackage.C0682 r4, java.lang.String r5, int r6) {
            r3 = this;
            r3.<init>()
            ᛸᛶᛱᛵ r0 = new ᛸᛶᛱᛵ
            r1 = 16
            r0.<init>(r1)
            r3.f7972 = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r3.f7975 = r0
            ᛷᲈᲀ r0 = defpackage.AbstractC0984.f4413
            r0 = 30
            ᛸᛸᲁᛵ r1 = defpackage.EnumC1551.f6877
            long r0 = defpackage.AbstractC0498.m1274(r0, r1)
            r3.f7971 = r0
            if (r6 <= 0) goto L3c
            ᛵᛴᛶᛵ r0 = new ᛵᛴᛶᛵ
            ᲀᛸᛵ r1 = new ᲀᛸᛵ
            r2 = 0
            r1.<init>(r4, r5, r2)
            r0.<init>(r6, r1)
            r3.f7974 = r0
            ᛵᛴᛶᛵ r6 = new ᛵᛴᛶᛵ
            ᲀᛸᛵ r0 = new ᲀᛸᛵ
            r1 = 1
            r0.<init>(r4, r5, r1)
            r6.<init>(r1, r0)
            r3.f7973 = r6
            return
        L3c:
            java.lang.String r3 = "Maximum number of readers must be greater than 0"
            defpackage.C2264.m3684(r3)
            r3 = 0
            throw r3
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.f7976
            if (r0 != 0) goto L11
            r0 = 1
            r1.f7976 = r0
            ᛵᛴᛶᛵ r0 = r1.f7974
            r0.m1851()
            ᛵᛴᛶᛵ r1 = r1.f7973
            r1.m1851()
        L11:
            return
    }

    @Override // defpackage.InterfaceC1645
    /* JADX INFO: renamed from: ᲇᲀᛲᛱ */
    public final java.lang.Object mo2654(boolean r18, defpackage.InterfaceC2087 r19, defpackage.AbstractC1016 r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            boolean r4 = r3 instanceof defpackage.C2257
            if (r4 == 0) goto L1b
            r4 = r3
            ᲈᛶᛱᲀ r4 = (defpackage.C2257) r4
            int r5 = r4.f9586
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.f9586 = r5
            goto L20
        L1b:
            ᲈᛶᛱᲀ r4 = new ᲈᛶᛱᲀ
            r4.<init>(r0, r3)
        L20:
            java.lang.Object r3 = r4.f9587
            ᛴᛵ r5 = defpackage.EnumC0670.f3246
            int r6 = r4.f9586
            java.lang.String r7 = "ROLLBACK TRANSACTION"
            r8 = 4
            r9 = 3
            r10 = 2
            r11 = 1
            r12 = 0
            if (r6 == 0) goto L7c
            if (r6 == r11) goto L78
            if (r6 == r10) goto L74
            if (r6 == r9) goto L51
            if (r6 != r8) goto L4b
            java.lang.Object r0 = r4.f9582
            r1 = r0
            ᛸᛱᛴᲁ r1 = (defpackage.C1419) r1
            java.lang.Object r0 = r4.f9591
            r2 = r0
            ᛵᛴᛶᛵ r2 = (defpackage.C0870) r2
            defpackage.AbstractC0762.m1680(r3)     // Catch: java.lang.Throwable -> L46
            goto L167
        L46:
            r0 = move-exception
            r6 = r1
            r1 = r0
            goto L19c
        L4b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            return r12
        L51:
            boolean r1 = r4.f9590
            ᛸᛶᛱᛵ r2 = r4.f9584
            ᛸᛱᛴᲁ r6 = r4.f9583
            ᛳᛵᲈᛵ r9 = r4.f9588
            ᛸᛱᛴᲁ r10 = r4.f9585
            java.lang.Object r13 = r4.f9582
            ᛵᛴᛶᛵ r13 = (defpackage.C0870) r13
            java.lang.Object r14 = r4.f9591
            ᲇᛷᛳᲀ r14 = (defpackage.InterfaceC2087) r14
            defpackage.AbstractC0762.m1680(r3)     // Catch: java.lang.Throwable -> L6e
            r16 = r9
            r9 = r6
            r6 = r10
            r10 = r16
            goto L116
        L6e:
            r0 = move-exception
            r1 = r0
            r6 = r10
        L71:
            r2 = r13
            goto L19c
        L74:
            defpackage.AbstractC0762.m1680(r3)
            return r3
        L78:
            defpackage.AbstractC0762.m1680(r3)
            return r3
        L7c:
            defpackage.AbstractC0762.m1680(r3)
            boolean r3 = r0.f7976
            if (r3 != 0) goto L1ca
            java.lang.ThreadLocal r3 = r0.f7975
            java.lang.Object r3 = r3.get()
            ᛶᛳᛴᛶ r3 = (defpackage.C1033) r3
            if (r3 != 0) goto L9d
            ᛳᛵᲈᛵ r3 = r4.f4527
            ᛸᛶᛱᛵ r6 = r0.f7972
            ᛶᲁᛳᲈ r3 = r3.mo970(r6)
            ᛸᲁᲈᛵ r3 = (defpackage.C1577) r3
            if (r3 == 0) goto L9c
            ᛶᛳᛴᛶ r3 = r3.f6990
            goto L9d
        L9c:
            r3 = r12
        L9d:
            if (r3 == 0) goto Le3
            if (r1 != 0) goto Lac
            boolean r1 = r3.f4601
            if (r1 != 0) goto La6
            goto Lac
        La6:
            java.lang.String r0 = "Cannot upgrade connection from reader to writer"
            defpackage.AbstractC1628.m2954(r11, r0)
            throw r12
        Lac:
            ᛳᛵᲈᛵ r1 = r4.f4527
            ᛸᛶᛱᛵ r6 = r0.f7972
            ᛶᲁᛳᲈ r1 = r1.mo970(r6)
            if (r1 != 0) goto Ld8
            ᛸᲁᲈᛵ r1 = new ᛸᲁᲈᛵ
            ᛸᛶᛱᛵ r6 = r0.f7972
            r1.<init>(r6, r3)
            java.lang.ThreadLocal r0 = r0.f7975
            ᛷᲁᛳᲀ r6 = new ᛷᲁᛳᲀ
            r6.<init>(r3, r0)
            ᛳᛵᲈᛵ r0 = defpackage.AbstractC0397.m1146(r1, r6)
            ᛲᛷᛶᛸ r1 = new ᛲᛷᛶᛸ
            r1.<init>(r2, r3, r12, r9)
            r4.f9586 = r11
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r0, r1, r4)
            if (r0 != r5) goto Ld7
            goto L164
        Ld7:
            return r0
        Ld8:
            r4.f9586 = r10
            java.lang.Object r0 = r2.mo388(r3, r4)
            if (r0 != r5) goto Le2
            goto L164
        Le2:
            return r0
        Le3:
            if (r1 == 0) goto Le8
            ᛵᛴᛶᛵ r3 = r0.f7974
            goto Lea
        Le8:
            ᛵᛴᛶᛵ r3 = r0.f7973
        Lea:
            ᛸᛱᛴᲁ r6 = new ᛸᛱᛴᲁ
            r6.<init>()
            ᛳᛵᲈᛵ r10 = r4.f4527     // Catch: java.lang.Throwable -> L199
            ᛸᛶᛱᛵ r13 = r0.f7972     // Catch: java.lang.Throwable -> L199
            long r14 = r0.f7971     // Catch: java.lang.Throwable -> L199
            ᛸᛵᲀᲁ r11 = new ᛸᛵᲀᲁ     // Catch: java.lang.Throwable -> L199
            r11.<init>(r0, r1)     // Catch: java.lang.Throwable -> L199
            r4.f9591 = r2     // Catch: java.lang.Throwable -> L199
            r4.f9582 = r3     // Catch: java.lang.Throwable -> L199
            r4.f9585 = r6     // Catch: java.lang.Throwable -> L199
            r4.f9588 = r10     // Catch: java.lang.Throwable -> L199
            r4.f9583 = r6     // Catch: java.lang.Throwable -> L199
            r4.f9584 = r13     // Catch: java.lang.Throwable -> L199
            r4.f9590 = r1     // Catch: java.lang.Throwable -> L199
            r4.f9586 = r9     // Catch: java.lang.Throwable -> L199
            java.lang.Object r9 = r3.m1853(r14, r11, r4)     // Catch: java.lang.Throwable -> L199
            if (r9 != r5) goto L111
            goto L164
        L111:
            r14 = r2
            r2 = r13
            r13 = r3
            r3 = r9
            r9 = r6
        L116:
            ᛳᛱᛸᛳ r3 = (defpackage.C0408) r3     // Catch: java.lang.Throwable -> L18d
            r3.f2064 = r10     // Catch: java.lang.Throwable -> L18d
            java.lang.Throwable r10 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L18d
            r10.<init>()     // Catch: java.lang.Throwable -> L18d
            r3.f2067 = r10     // Catch: java.lang.Throwable -> L18d
            ᛵᛴᛶᛵ r10 = r0.f7974     // Catch: java.lang.Throwable -> L18d
            ᛵᛴᛶᛵ r11 = r0.f7973     // Catch: java.lang.Throwable -> L18d
            if (r10 == r11) goto L12b
            if (r1 == 0) goto L12b
            r1 = 1
            goto L12c
        L12b:
            r1 = 0
        L12c:
            ᛶᛳᛴᛶ r10 = new ᛶᛳᛴᛶ     // Catch: java.lang.Throwable -> L18d
            r10.<init>(r2, r3, r1)     // Catch: java.lang.Throwable -> L18d
            r9.f6211 = r10     // Catch: java.lang.Throwable -> L18d
            java.lang.Object r1 = r6.f6211     // Catch: java.lang.Throwable -> L18d
            if (r1 == 0) goto L191
            ᛶᛳᛴᛶ r1 = (defpackage.C1033) r1     // Catch: java.lang.Throwable -> L18d
            ᛸᲁᲈᛵ r2 = new ᛸᲁᲈᛵ     // Catch: java.lang.Throwable -> L18d
            ᛸᛶᛱᛵ r3 = r0.f7972     // Catch: java.lang.Throwable -> L18d
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L18d
            java.lang.ThreadLocal r0 = r0.f7975     // Catch: java.lang.Throwable -> L18d
            ᛷᲁᛳᲀ r3 = new ᛷᲁᛳᲀ     // Catch: java.lang.Throwable -> L18d
            r3.<init>(r1, r0)     // Catch: java.lang.Throwable -> L18d
            ᛳᛵᲈᛵ r0 = defpackage.AbstractC0397.m1146(r2, r3)     // Catch: java.lang.Throwable -> L18d
            ᛲᛷᛶᛸ r1 = new ᛲᛷᛶᛸ     // Catch: java.lang.Throwable -> L18d
            r1.<init>(r14, r6, r12, r8)     // Catch: java.lang.Throwable -> L18d
            r4.f9591 = r13     // Catch: java.lang.Throwable -> L18d
            r4.f9582 = r6     // Catch: java.lang.Throwable -> L18d
            r4.f9585 = r12     // Catch: java.lang.Throwable -> L18d
            r4.f9588 = r12     // Catch: java.lang.Throwable -> L18d
            r4.f9583 = r12     // Catch: java.lang.Throwable -> L18d
            r4.f9584 = r12     // Catch: java.lang.Throwable -> L18d
            r4.f9586 = r8     // Catch: java.lang.Throwable -> L18d
            java.lang.Object r3 = defpackage.AbstractC0397.m1144(r0, r1, r4)     // Catch: java.lang.Throwable -> L18d
            if (r3 != r5) goto L165
        L164:
            return r5
        L165:
            r1 = r6
            r2 = r13
        L167:
            java.lang.Object r0 = r1.f6211
            ᛶᛳᛴᛶ r0 = (defpackage.C1033) r0
            if (r0 == 0) goto L18c
            boolean r1 = r0.f4599
            if (r1 != 0) goto L183
            r1 = 1
            r0.f4599 = r1
            ᛳᛱᛸᛳ r1 = r0.f4603
            ᲀᛴᛴᛶ r1 = r1.f2066
            boolean r1 = r1.mo893()
            if (r1 == 0) goto L183
            ᛳᛱᛸᛳ r1 = r0.f4603
            defpackage.AbstractC1628.m2943(r1, r7)
        L183:
            ᛳᛱᛸᛳ r0 = r0.f4603
            r0.f2064 = r12
            r0.f2067 = r12
            r2.m1849(r0)
        L18c:
            return r3
        L18d:
            r0 = move-exception
            r1 = r0
            goto L71
        L191:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L18d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L18d
            throw r1     // Catch: java.lang.Throwable -> L18d
        L199:
            r0 = move-exception
            r1 = r0
            r2 = r3
        L19c:
            throw r1     // Catch: java.lang.Throwable -> L19d
        L19d:
            r0 = move-exception
            r3 = r0
            java.lang.Object r0 = r6.f6211     // Catch: java.lang.Throwable -> L1c5
            ᛶᛳᛴᛶ r0 = (defpackage.C1033) r0     // Catch: java.lang.Throwable -> L1c5
            if (r0 == 0) goto L1c9
            boolean r4 = r0.f4599     // Catch: java.lang.Throwable -> L1c5
            if (r4 != 0) goto L1bb
            r4 = 1
            r0.f4599 = r4     // Catch: java.lang.Throwable -> L1c5
            ᛳᛱᛸᛳ r4 = r0.f4603     // Catch: java.lang.Throwable -> L1c5
            ᲀᛴᛴᛶ r4 = r4.f2066     // Catch: java.lang.Throwable -> L1c5
            boolean r4 = r4.mo893()     // Catch: java.lang.Throwable -> L1c5
            if (r4 == 0) goto L1bb
            ᛳᛱᛸᛳ r4 = r0.f4603     // Catch: java.lang.Throwable -> L1c5
            defpackage.AbstractC1628.m2943(r4, r7)     // Catch: java.lang.Throwable -> L1c5
        L1bb:
            ᛳᛱᛸᛳ r0 = r0.f4603     // Catch: java.lang.Throwable -> L1c5
            r0.f2064 = r12     // Catch: java.lang.Throwable -> L1c5
            r0.f2067 = r12     // Catch: java.lang.Throwable -> L1c5
            r2.m1849(r0)     // Catch: java.lang.Throwable -> L1c5
            goto L1c9
        L1c5:
            r0 = move-exception
            defpackage.AbstractC2193.m3595(r1, r0)
        L1c9:
            throw r3
        L1ca:
            r0 = 21
            java.lang.String r1 = "Connection pool is closed"
            defpackage.AbstractC1628.m2954(r0, r1)
            throw r12
    }
}
