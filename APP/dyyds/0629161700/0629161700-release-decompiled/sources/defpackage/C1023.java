package defpackage;

/* JADX INFO: renamed from: ᛶᛲᛵᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1023 {

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static final java.lang.String[] f4569 = null;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final defpackage.C1844 f4570;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public defpackage.InterfaceC1781 f4571;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final defpackage.C1180 f4572;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C1823 f4573;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final boolean f4574;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.LinkedHashMap f4575;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final com.ss.android.ugc.awemes.WardDatabase_Impl f4576;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicBoolean f4577;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.util.LinkedHashMap f4578;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.util.LinkedHashMap f4579;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.lang.String[] f4580;

    static {
            java.lang.String r0 = "UPDATE"
            java.lang.String r1 = "DELETE"
            java.lang.String r2 = "INSERT"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            defpackage.C1023.f4569 = r0
            return
    }

    public native C1023(com.ss.android.ugc.awemes.WardDatabase_Impl r1, java.util.LinkedHashMap r2, java.util.LinkedHashMap r3, java.lang.String[] r4, boolean r5, defpackage.C1823 r6);

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object m1973(defpackage.InterfaceC1324 r8, int r9, defpackage.AbstractC1016 r10) {
            r7 = this;
            boolean r0 = r10 instanceof defpackage.C0743
            if (r0 == 0) goto L13
            r0 = r10
            ᛴᲀᛱᛳ r0 = (defpackage.C0743) r0
            int r1 = r0.f3501
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3501 = r1
            goto L18
        L13:
            ᛴᲀᛱᛳ r0 = new ᛴᲀᛱᛳ
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f3498
            int r1 = r0.f3501
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            int r7 = r0.f3502
            int r8 = r0.f3500
            java.lang.String[] r9 = r0.f3497
            java.lang.String r1 = r0.f3504
            ᛶᛱᛵᛸ r3 = r0.f3503
            defpackage.AbstractC0762.m1680(r10)
            r10 = r9
            r9 = r3
            goto L8c
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r7)
            r7 = 0
            return r7
        L38:
            defpackage.AbstractC0762.m1680(r10)
            java.lang.String[] r7 = r7.f4580
            r7 = r7[r9]
            java.lang.String[] r9 = defpackage.C1023.f4569
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4a:
            if (r8 >= r7) goto L8e
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r4.<init>(r5)
            r4.append(r3)
            r3 = 96
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.f3503 = r9
            r0.f3504 = r1
            r0.f3497 = r10
            r0.f3500 = r8
            r0.f3502 = r7
            r0.f3501 = r2
            java.lang.Object r3 = defpackage.AbstractC1592.m2882(r9, r3, r0)
            ᛴᛵ r4 = defpackage.EnumC0670.f3246
            if (r3 != r4) goto L8c
            return r4
        L8c:
            int r8 = r8 + r2
            goto L4a
        L8e:
            ᲁᲀᛱᲁ r7 = defpackage.C1907.f8270
            return r7
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Object m1974(defpackage.InterfaceC1324 r13, int r14, defpackage.AbstractC1016 r15) {
            r12 = this;
            boolean r0 = r15 instanceof defpackage.C0593
            if (r0 == 0) goto L13
            r0 = r15
            ᛳᲈᛶᛷ r0 = (defpackage.C0593) r0
            int r1 = r0.f2966
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2966 = r1
            goto L18
        L13:
            ᛳᲈᛶᛷ r0 = new ᛳᲈᛶᛷ
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f2962
            int r1 = r0.f2966
            r2 = 2
            r3 = 1
            ᛴᛵ r4 = defpackage.EnumC0670.f3246
            if (r1 == 0) goto L46
            if (r1 == r3) goto L3e
            if (r1 != r2) goto L37
            int r13 = r0.f2961
            int r14 = r0.f2965
            int r1 = r0.f2963
            java.lang.String[] r5 = r0.f2960
            java.lang.String r6 = r0.f2968
            ᛶᛱᛵᛸ r7 = r0.f2967
            defpackage.AbstractC0762.m1680(r15)
            goto Le4
        L37:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r12)
            r12 = 0
            return r12
        L3e:
            int r14 = r0.f2963
            ᛶᛱᛵᛸ r13 = r0.f2967
            defpackage.AbstractC0762.m1680(r15)
            goto L6a
        L46:
            defpackage.AbstractC0762.m1680(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "INSERT OR IGNORE INTO room_table_modification_log VALUES("
            r15.<init>(r1)
            r15.append(r14)
            java.lang.String r1 = ", 0)"
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            r0.f2967 = r13
            r0.f2963 = r14
            r0.f2966 = r3
            java.lang.Object r15 = defpackage.AbstractC1592.m2882(r13, r15, r0)
            if (r15 != r4) goto L6a
            goto Le3
        L6a:
            java.lang.String[] r15 = r12.f4580
            r15 = r15[r14]
            java.lang.String[] r1 = defpackage.C1023.f4569
            r5 = 0
            r6 = 3
            r7 = r1
            r1 = r14
            r14 = r5
            r5 = r7
            r7 = r13
            r13 = r6
            r6 = r15
        L79:
            if (r14 >= r13) goto Le6
            r15 = r5[r14]
            boolean r8 = r12.f4574
            if (r8 == 0) goto L84
            java.lang.String r8 = "TEMP"
            goto L86
        L84:
            java.lang.String r8 = ""
        L86:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "room_table_modification_trigger_"
            r9.<init>(r10)
            r9.append(r6)
            r10 = 95
            r9.append(r10)
            r9.append(r15)
            java.lang.String r9 = r9.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "CREATE "
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r8 = " TRIGGER IF NOT EXISTS `"
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = "` AFTER "
            r10.append(r8)
            r10.append(r15)
            java.lang.String r15 = " ON `"
            r10.append(r15)
            r10.append(r6)
            java.lang.String r15 = "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = "
            r10.append(r15)
            r10.append(r1)
            java.lang.String r15 = " AND invalidated = 0; END"
            r10.append(r15)
            java.lang.String r15 = r10.toString()
            r0.f2967 = r7
            r0.f2968 = r6
            r0.f2960 = r5
            r0.f2963 = r1
            r0.f2965 = r14
            r0.f2961 = r13
            r0.f2966 = r2
            java.lang.Object r15 = defpackage.AbstractC1592.m2882(r7, r15, r0)
            if (r15 != r4) goto Le4
        Le3:
            return r4
        Le4:
            int r14 = r14 + r3
            goto L79
        Le6:
            ᲁᲀᛱᲁ r12 = defpackage.C1907.f8270
            return r12
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m1975(defpackage.InterfaceC1781 r5, defpackage.InterfaceC1781 r6) {
            r4 = this;
            r0 = 0
            r1 = 1
            java.util.concurrent.atomic.AtomicBoolean r2 = r4.f4577
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L27
            r5.mo1032()
            com.ss.android.ugc.awemes.WardDatabase_Impl r5 = r4.f4576
            ᛳᲁᛳᛴ r5 = r5.f436
            r0 = 0
            if (r5 != 0) goto L15
            r5 = r0
        L15:
            ᲈᛷᲀᛶ r1 = new ᲈᛷᲀᛶ
            ᛷᲈᲀ r2 = defpackage.C2293.f9707
            r1.<init>(r2)
            ᛲᛷᛶᛸ r2 = new ᛲᛷᛶᛸ
            r3 = 13
            r2.<init>(r4, r6, r0, r3)
            r4 = 2
            defpackage.AbstractC0397.m1149(r5, r1, r2, r4)
        L27:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Object m1976(defpackage.InterfaceC1008 r5, defpackage.AbstractC1016 r6) {
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C0970
            if (r0 == 0) goto L13
            r0 = r6
            ᛵᲁᛵᛵ r0 = (defpackage.C0970) r0
            int r1 = r0.f4328
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4328 = r1
            goto L18
        L13:
            ᛵᲁᛵᛵ r0 = new ᛵᲁᛵᛵ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.f4330
            int r6 = r0.f4328
            r1 = 2
            r2 = 1
            ᛴᛵ r3 = defpackage.EnumC0670.f3246
            if (r6 == 0) goto L3d
            if (r6 == r2) goto L35
            if (r6 != r1) goto L2e
            java.lang.Object r5 = r0.f4329
            java.util.Set r5 = (java.util.Set) r5
            defpackage.AbstractC0762.m1680(r4)
            return r5
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r4)
            r4 = 0
            return r4
        L35:
            java.lang.Object r5 = r0.f4329
            ᛶᛱᛵᛸ r5 = (defpackage.InterfaceC1008) r5
            defpackage.AbstractC0762.m1680(r4)
            goto L54
        L3d:
            defpackage.AbstractC0762.m1680(r4)
            ᛴᛳᛷᛸ r4 = new ᛴᛳᛷᛸ
            r6 = 22
            r4.<init>(r6)
            r0.f4329 = r5
            r0.f4328 = r2
            java.lang.String r6 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.mo1906(r6, r4, r0)
            if (r4 != r3) goto L54
            goto L68
        L54:
            java.util.Set r4 = (java.util.Set) r4
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L69
            r0.f4329 = r4
            r0.f4328 = r1
            java.lang.String r6 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = defpackage.AbstractC1592.m2882(r5, r6, r0)
            if (r5 != r3) goto L69
        L68:
            return r3
        L69:
            return r4
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object m1977(defpackage.AbstractC1016 r8) {
            r7 = this;
            boolean r0 = r8 instanceof defpackage.C0851
            if (r0 == 0) goto L13
            r0 = r8
            ᛵᛳᛸ r0 = (defpackage.C0851) r0
            int r1 = r0.f3888
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3888 = r1
            goto L18
        L13:
            ᛵᛳᛸ r0 = new ᛵᛳᛸ
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f3890
            int r1 = r0.f3888
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            ᛴᛵᲇᲇ r0 = r0.f3889
            defpackage.AbstractC0762.m1680(r8)     // Catch: java.lang.Throwable -> L28
            goto L71
        L28:
            r7 = move-exception
            goto L89
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r7)
            return r2
        L30:
            defpackage.AbstractC0762.m1680(r8)
            com.ss.android.ugc.awemes.WardDatabase_Impl r8 = r7.f4576
            ᛴᛵᲇᲇ r1 = r8.f440
            boolean r4 = r1.m1563()
            ᛵᲈᛳᲀ r5 = defpackage.C0993.f4434
            if (r4 == 0) goto L8d
            java.util.concurrent.atomic.AtomicBoolean r4 = r7.f4577     // Catch: java.lang.Throwable -> L87
            r6 = 0
            boolean r4 = r4.compareAndSet(r3, r6)     // Catch: java.lang.Throwable -> L87
            if (r4 != 0) goto L4c
            r1.m1544()
            return r5
        L4c:
            ᲀᲈᛵᲇ r4 = r7.f4571     // Catch: java.lang.Throwable -> L87
            java.lang.Object r4 = r4.mo1032()     // Catch: java.lang.Throwable -> L87
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L87
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L87
            if (r4 != 0) goto L5e
            r1.m1544()
            return r5
        L5e:
            ᛸᲀᛶᲁ r4 = new ᛸᲀᛶᲁ     // Catch: java.lang.Throwable -> L87
            r4.<init>(r7, r2, r3)     // Catch: java.lang.Throwable -> L87
            r0.f3889 = r1     // Catch: java.lang.Throwable -> L87
            r0.f3888 = r3     // Catch: java.lang.Throwable -> L87
            java.lang.Object r8 = r8.m304(r6, r4, r0)     // Catch: java.lang.Throwable -> L87
            ᛴᛵ r0 = defpackage.EnumC0670.f3246
            if (r8 != r0) goto L70
            return r0
        L70:
            r0 = r1
        L71:
            java.util.Set r8 = (java.util.Set) r8     // Catch: java.lang.Throwable -> L28
            boolean r1 = r8.isEmpty()     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L83
            ᛶᲈᛱᲈ r1 = r7.f4572     // Catch: java.lang.Throwable -> L28
            r1.m2297(r8)     // Catch: java.lang.Throwable -> L28
            ᲁᛲᲇᛲ r7 = r7.f4573     // Catch: java.lang.Throwable -> L28
            r7.mo617(r8)     // Catch: java.lang.Throwable -> L28
        L83:
            r0.m1544()
            return r8
        L87:
            r7 = move-exception
            r0 = r1
        L89:
            r0.m1544()
            throw r7
        L8d:
            return r5
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.Object m1978(defpackage.AbstractC1016 r6) {
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C1996
            if (r0 == 0) goto L13
            r0 = r6
            ᲇᛲᛳᛵ r0 = (defpackage.C1996) r0
            int r1 = r0.f8635
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8635 = r1
            goto L18
        L13:
            ᲇᛲᛳᛵ r0 = new ᲇᛲᛳᛵ
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f8637
            int r1 = r0.f8635
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            ᛴᛵᲇᲇ r5 = r0.f8636
            defpackage.AbstractC0762.m1680(r6)     // Catch: java.lang.Throwable -> L28
            goto L51
        L28:
            r6 = move-exception
            goto L57
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r5)
            return r2
        L30:
            defpackage.AbstractC0762.m1680(r6)
            com.ss.android.ugc.awemes.WardDatabase_Impl r6 = r5.f4576
            ᛴᛵᲇᲇ r1 = r6.f440
            boolean r4 = r1.m1563()
            if (r4 == 0) goto L5b
            ᲁᲀᲇᛱ r4 = new ᲁᲀᲇᛱ     // Catch: java.lang.Throwable -> L55
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> L55
            r0.f8636 = r1     // Catch: java.lang.Throwable -> L55
            r0.f8635 = r3     // Catch: java.lang.Throwable -> L55
            r5 = 0
            java.lang.Object r5 = r6.m304(r5, r4, r0)     // Catch: java.lang.Throwable -> L55
            ᛴᛵ r6 = defpackage.EnumC0670.f3246
            if (r5 != r6) goto L50
            return r6
        L50:
            r5 = r1
        L51:
            r5.m1544()
            goto L5b
        L55:
            r6 = move-exception
            r5 = r1
        L57:
            r5.m1544()
            throw r6
        L5b:
            ᲁᲀᛱᲁ r5 = defpackage.C1907.f8270
            return r5
    }
}
