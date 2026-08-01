package defpackage;

/* JADX INFO: renamed from: ᛴᛴᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0661 extends defpackage.AbstractC1350 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f3212;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0682 f3213;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f3214;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public int f3215;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public int f3216;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f3217;

    public C0661(defpackage.C0682 r1, java.lang.String r2, defpackage.InterfaceC0140 r3) {
            r0 = this;
            r0.f3213 = r1
            r0.f3214 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ᛷᲈᛳᛳ r1 = (defpackage.InterfaceC1399) r1
            ᛱᛸᛲᲀ r2 = (defpackage.InterfaceC0140) r2
            ᛱᛸᛲᲀ r0 = r0.mo389(r2, r1)
            ᛴᛴᲀᛷ r0 = (defpackage.C0661) r0
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            java.lang.Object r0 = r0.mo390(r1)
            return r0
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r2, java.lang.Object r3) {
            r1 = this;
            ᛴᛴᲀᛷ r3 = new ᛴᛴᲀᛷ
            ᛴᛵᲇᲇ r0 = r1.f3213
            java.lang.String r1 = r1.f3214
            r3.<init>(r0, r1, r2)
            return r3
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r13) {
            r12 = this;
            ᛴᛵᲇᲇ r0 = r12.f3213
            java.lang.Object r0 = r0.f3286
            ᛲᛶᛸᛱ r0 = (defpackage.C0312) r0
            int r1 = r12.f3216
            r2 = 4
            r3 = 3
            r4 = 2
            java.lang.String r5 = r12.f3214
            r6 = 1
            r7 = 0
            ᛴᛵ r8 = defpackage.EnumC0670.f3246
            if (r1 == 0) goto L4d
            if (r1 == r6) goto L49
            if (r1 == r4) goto L43
            if (r1 == r3) goto L37
            if (r1 != r2) goto L29
            int r0 = r12.f3215
            int r1 = r12.f3212
            int r12 = r12.f3217
            defpackage.AbstractC0762.m1680(r13)     // Catch: java.lang.Exception -> L26
            goto Lee
        L26:
            r12 = move-exception
            goto L111
        L29:
            r12 = -934851456179758(0xfffcadc1ef0961d2, double:NaN)
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r12)
            r12 = 0
            return r12
        L37:
            int r1 = r12.f3212
            int r3 = r12.f3217
            defpackage.AbstractC0762.m1680(r13)     // Catch: java.lang.Exception -> L26
            r11 = r3
            r3 = r1
            r1 = r11
            goto Lc0
        L43:
            int r1 = r12.f3217
            defpackage.AbstractC0762.m1680(r13)     // Catch: java.lang.Exception -> L26
            goto L95
        L49:
            defpackage.AbstractC0762.m1680(r13)     // Catch: java.lang.Exception -> L26
            goto L6f
        L4d:
            defpackage.AbstractC0762.m1680(r13)
            r12.f3216 = r6     // Catch: java.lang.Exception -> L26
            r0.getClass()     // Catch: java.lang.Exception -> L26
            r9 = -911362280037934(0xfffcc31eef0961d2, double:NaN)
            java.lang.String r13 = "SELECT COUNT(*) FROM ward_items WHERE authorUid = ? AND authorUid IS NOT NULL AND authorUid != ''"     // Catch: java.lang.Exception -> L26
            com.ss.android.ugc.awemes.WardDatabase r1 = r0.f1645     // Catch: java.lang.Exception -> L26
            ᛱᲀᛱᛶ r9 = new ᛱᲀᛱᛶ     // Catch: java.lang.Exception -> L26
            r10 = 12
            r9.<init>(r13, r10, r5)     // Catch: java.lang.Exception -> L26
            java.lang.Object r13 = defpackage.AbstractC2193.m3596(r12, r9, r1, r6, r7)     // Catch: java.lang.Exception -> L26
            if (r13 != r8) goto L6f
            goto Le9
        L6f:
            java.lang.Number r13 = (java.lang.Number) r13     // Catch: java.lang.Exception -> L26
            int r1 = r13.intValue()     // Catch: java.lang.Exception -> L26
            r12.f3217 = r1     // Catch: java.lang.Exception -> L26
            r12.f3216 = r4     // Catch: java.lang.Exception -> L26
            r0.getClass()     // Catch: java.lang.Exception -> L26
            r9 = -911783186832942(0xfffcc2bcef0961d2, double:NaN)
            java.lang.String r13 = "SELECT COUNT(*) FROM ward_items WHERE authorUid = ? AND (type = 'video') AND authorUid IS NOT NULL AND authorUid != ''"     // Catch: java.lang.Exception -> L26
            com.ss.android.ugc.awemes.WardDatabase r4 = r0.f1645     // Catch: java.lang.Exception -> L26
            ᛱᲀᛱᛶ r9 = new ᛱᲀᛱᛶ     // Catch: java.lang.Exception -> L26
            r10 = 16
            r9.<init>(r13, r10, r5)     // Catch: java.lang.Exception -> L26
            java.lang.Object r13 = defpackage.AbstractC2193.m3596(r12, r9, r4, r6, r7)     // Catch: java.lang.Exception -> L26
            if (r13 != r8) goto L95
            goto Le9
        L95:
            java.lang.Number r13 = (java.lang.Number) r13     // Catch: java.lang.Exception -> L26
            int r13 = r13.intValue()     // Catch: java.lang.Exception -> L26
            r12.f3217 = r1     // Catch: java.lang.Exception -> L26
            r12.f3212 = r13     // Catch: java.lang.Exception -> L26
            r12.f3216 = r3     // Catch: java.lang.Exception -> L26
            r0.getClass()     // Catch: java.lang.Exception -> L26
            r3 = -912294287941166(0xfffcc245ef0961d2, double:NaN)
            java.lang.String r3 = "SELECT COUNT(*) FROM ward_items WHERE authorUid = ? AND (type = 'comment') AND authorUid IS NOT NULL AND authorUid != ''"     // Catch: java.lang.Exception -> L26
            com.ss.android.ugc.awemes.WardDatabase r4 = r0.f1645     // Catch: java.lang.Exception -> L26
            ᛱᲀᛱᛶ r9 = new ᛱᲀᛱᛶ     // Catch: java.lang.Exception -> L26
            r10 = 14
            r9.<init>(r3, r10, r5)     // Catch: java.lang.Exception -> L26
            java.lang.Object r3 = defpackage.AbstractC2193.m3596(r12, r9, r4, r6, r7)     // Catch: java.lang.Exception -> L26
            if (r3 != r8) goto Lbd
            goto Le9
        Lbd:
            r11 = r3
            r3 = r13
            r13 = r11
        Lc0:
            java.lang.Number r13 = (java.lang.Number) r13     // Catch: java.lang.Exception -> L26
            int r13 = r13.intValue()     // Catch: java.lang.Exception -> L26
            r12.f3217 = r1     // Catch: java.lang.Exception -> L26
            r12.f3212 = r3     // Catch: java.lang.Exception -> L26
            r12.f3215 = r13     // Catch: java.lang.Exception -> L26
            r12.f3216 = r2     // Catch: java.lang.Exception -> L26
            r0.getClass()     // Catch: java.lang.Exception -> L26
            r9 = -912813978983982(0xfffcc1ccef0961d2, double:NaN)
            java.lang.String r2 = "SELECT COUNT(*) FROM ward_items WHERE authorUid = ? AND type = 'user' AND authorUid IS NOT NULL AND authorUid != ''"     // Catch: java.lang.Exception -> L26
            com.ss.android.ugc.awemes.WardDatabase r0 = r0.f1645     // Catch: java.lang.Exception -> L26
            ᛱᲀᛱᛶ r4 = new ᛱᲀᛱᛶ     // Catch: java.lang.Exception -> L26
            r9 = 13
            r4.<init>(r2, r9, r5)     // Catch: java.lang.Exception -> L26
            java.lang.Object r12 = defpackage.AbstractC2193.m3596(r12, r4, r0, r6, r7)     // Catch: java.lang.Exception -> L26
            if (r12 != r8) goto Lea
        Le9:
            return r8
        Lea:
            r0 = r13
            r13 = r12
            r12 = r1
            r1 = r3
        Lee:
            java.lang.Number r13 = (java.lang.Number) r13     // Catch: java.lang.Exception -> L26
            int r13 = r13.intValue()     // Catch: java.lang.Exception -> L26
            java.lang.Integer r2 = new java.lang.Integer     // Catch: java.lang.Exception -> L26
            r2.<init>(r12)     // Catch: java.lang.Exception -> L26
            java.lang.Integer r12 = new java.lang.Integer     // Catch: java.lang.Exception -> L26
            r12.<init>(r1)     // Catch: java.lang.Exception -> L26
            java.lang.Integer r1 = new java.lang.Integer     // Catch: java.lang.Exception -> L26
            r1.<init>(r0)     // Catch: java.lang.Exception -> L26
            java.lang.Integer r0 = new java.lang.Integer     // Catch: java.lang.Exception -> L26
            r0.<init>(r13)     // Catch: java.lang.Exception -> L26
            java.lang.Integer[] r12 = new java.lang.Integer[]{r2, r12, r1, r0}     // Catch: java.lang.Exception -> L26
            java.util.List r12 = defpackage.AbstractC0425.m1186(r12)     // Catch: java.lang.Exception -> L26
            return r12
        L111:
            r0 = -934829981343278(0xfffcadc6ef0961d2, double:NaN)
            java.lang.String r13 = "执行失败"
            r0 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r0 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r0 = defpackage.C0346.f1773
            r0.getClass()
            defpackage.C0346.m1038(r13, r12)
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r7)
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r7)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r7)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r7)
            java.lang.Integer[] r12 = new java.lang.Integer[]{r12, r13, r0, r1}
            java.util.List r12 = defpackage.AbstractC0425.m1186(r12)
            return r12
    }
}
