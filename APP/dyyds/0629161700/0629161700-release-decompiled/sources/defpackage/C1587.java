package defpackage;

/* JADX INFO: renamed from: ᛸᲇᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1587 extends defpackage.AbstractC1350 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f7019;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f7020;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f7021;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f7022;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.InterfaceC0598 f7023;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0682 f7024;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f7025;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final /* synthetic */ int f7026;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f7027;

    public C1587(int r1, int r2, java.lang.String r3, java.lang.String r4, defpackage.C0682 r5, int r6, defpackage.InterfaceC0598 r7, defpackage.InterfaceC0140 r8) {
            r0 = this;
            r0.f7022 = r1
            r0.f7025 = r2
            r0.f7020 = r3
            r0.f7021 = r4
            r0.f7024 = r5
            r0.f7026 = r6
            r0.f7023 = r7
            r1 = 2
            r0.<init>(r1, r8)
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ᛷᲈᛳᛳ r1 = (defpackage.InterfaceC1399) r1
            ᛱᛸᛲᲀ r2 = (defpackage.InterfaceC0140) r2
            ᛱᛸᛲᲀ r0 = r0.mo389(r2, r1)
            ᛸᲇᲀᲇ r0 = (defpackage.C1587) r0
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            java.lang.Object r0 = r0.mo390(r1)
            return r0
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r10, java.lang.Object r11) {
            r9 = this;
            ᛸᲇᲀᲇ r0 = new ᛸᲇᲀᲇ
            int r6 = r9.f7026
            ᛳᲈᲇᛳ r7 = r9.f7023
            int r1 = r9.f7022
            int r2 = r9.f7025
            java.lang.String r3 = r9.f7020
            java.lang.String r4 = r9.f7021
            ᛴᛵᲇᲇ r5 = r9.f7024
            r8 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r19) {
            r18 = this;
            r1 = r18
            ᛴᛵᲇᲇ r0 = r1.f7024
            java.lang.Object r0 = r0.f3286
            ᛲᛶᛸᛱ r0 = (defpackage.C0312) r0
            int r3 = r1.f7025
            int r2 = r1.f7019
            ᛳᲈᲇᛳ r8 = r1.f7023
            r9 = 0
            ᛴᛵ r10 = defpackage.EnumC0670.f3246
            switch(r2) {
                case 0: goto L87;
                case 1: goto L7e;
                case 2: goto L74;
                case 3: goto L6a;
                case 4: goto L60;
                case 5: goto L56;
                case 6: goto L4c;
                case 7: goto L42;
                case 8: goto L38;
                case 9: goto L2e;
                case 10: goto L26;
                case 11: goto L21;
                default: goto L14;
            }
        L14:
            r0 = -1013483717434926(0xfffc663def0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            return r9
        L21:
            defpackage.AbstractC0762.m1680(r19)
            goto L265
        L26:
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Exception -> L2b
            goto L265
        L2b:
            r0 = move-exception
            goto L22e
        L2e:
            int r0 = r1.f7027
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Exception -> L2b
            r4 = r0
            r0 = r19
            goto L1a1
        L38:
            int r0 = r1.f7027
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Exception -> L2b
            r4 = r0
            r0 = r19
            goto L1c9
        L42:
            int r0 = r1.f7027
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Exception -> L2b
            r4 = r0
            r0 = r19
            goto L1ef
        L4c:
            int r0 = r1.f7027
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Exception -> L2b
            r4 = r0
            r0 = r19
            goto L214
        L56:
            int r0 = r1.f7027
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Exception -> L2b
            r4 = r0
            r0 = r19
            goto L109
        L60:
            int r0 = r1.f7027
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Exception -> L2b
            r4 = r0
            r0 = r19
            goto L12d
        L6a:
            int r0 = r1.f7027
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Exception -> L2b
            r4 = r0
            r0 = r19
            goto L150
        L74:
            int r0 = r1.f7027
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Exception -> L2b
            r4 = r0
            r0 = r19
            goto L173
        L7e:
            int r0 = r1.f7027
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Exception -> L2b
            r4 = r0
            r0 = r19
            goto Ld5
        L87:
            defpackage.AbstractC0762.m1680(r19)
            int r2 = r1.f7022     // Catch: java.lang.Exception -> L2b
            int r4 = r2 * r3
            java.lang.String r2 = r1.f7020     // Catch: java.lang.Exception -> L2b
            if (r2 == 0) goto L9c
            java.lang.CharSequence r2 = defpackage.AbstractC1347.m2521(r2)     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L2b
            r13 = r2
            goto L9d
        L9c:
            r13 = r9
        L9d:
            java.lang.String r2 = r1.f7021     // Catch: java.lang.Exception -> L2b
            java.lang.CharSequence r2 = defpackage.AbstractC1347.m2521(r2)     // Catch: java.lang.Exception -> L2b
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Exception -> L2b
            r2 = 0
            r5 = 1
            if (r13 == 0) goto Ld9
            int r14 = r1.f7026     // Catch: java.lang.Exception -> L2b
            int r3 = r1.f7025     // Catch: java.lang.Exception -> L2b
            r1.f7027 = r4     // Catch: java.lang.Exception -> L2b
            r1.f7019 = r5     // Catch: java.lang.Exception -> L2b
            r0.getClass()     // Catch: java.lang.Exception -> L2b
            r11 = -893529575824942(0xfffcd356ef0961d2, double:NaN)
            java.lang.String r12 = "\n        SELECT * FROM ward_items\n        WHERE (? IS NULL OR category = ?)\n          AND (\n            ? = 0\n            OR (? = 1 AND ((cid = '-1' AND (type != 'user' OR type IS NULL)) OR type = 'video'))\n            OR (? = 2 AND ((cid != '-1' AND type != 'user') OR type = 'comment'))\n            OR (? = 3 AND type = 'user')\n          )\n          AND (\n            ? = ''\n            OR category LIKE '%' || ? || '%'\n            OR remark LIKE '%' || ? || '%'\n            OR authorName LIKE '%' || ? || '%'\n            OR text LIKE '%' || ? || '%'\n          )\n        ORDER BY saveTime DESC\n        LIMIT ? OFFSET ?\n    "     // Catch: java.lang.Exception -> L2b
            com.ss.android.ugc.awemes.WardDatabase r0 = r0.f1645     // Catch: java.lang.Exception -> L2b
            ᲇᲈᲁᛲ r11 = new ᲇᲈᲁᛲ     // Catch: java.lang.Exception -> L2b
            r16 = r3
            r17 = r4
            r15 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L2b
            r4 = r17
            java.lang.Object r0 = defpackage.AbstractC2193.m3596(r1, r11, r0, r5, r2)     // Catch: java.lang.Exception -> L2b
            if (r0 != r10) goto Ld5
            goto L264
        Ld5:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L2b
            goto L216
        Ld9:
            boolean r6 = defpackage.AbstractC1347.m2524(r7)     // Catch: java.lang.Exception -> L2b
            r11 = 3
            r12 = 2
            int r13 = r1.f7026
            if (r6 == 0) goto L177
            if (r13 == r5) goto L154
            if (r13 == r12) goto L131
            if (r13 == r11) goto L10d
            r1.f7027 = r4     // Catch: java.lang.Exception -> L2b
            r6 = 5
            r1.f7019 = r6     // Catch: java.lang.Exception -> L2b
            r0.getClass()     // Catch: java.lang.Exception -> L2b
            r6 = -886378455277102(0xfffcd9d7ef0961d2, double:NaN)
            java.lang.String r6 = "SELECT * FROM ward_items ORDER BY saveTime DESC LIMIT ? OFFSET ?"     // Catch: java.lang.Exception -> L2b
            com.ss.android.ugc.awemes.WardDatabase r0 = r0.f1645     // Catch: java.lang.Exception -> L2b
            ᲇᛳᲇᲈ r7 = new ᲇᛳᲇᲈ     // Catch: java.lang.Exception -> L2b
            r7.<init>(r3, r4, r5, r6)     // Catch: java.lang.Exception -> L2b
            java.lang.Object r0 = defpackage.AbstractC2193.m3596(r1, r7, r0, r5, r2)     // Catch: java.lang.Exception -> L2b
            if (r0 != r10) goto L109
            goto L264
        L109:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L2b
            goto L216
        L10d:
            r1.f7027 = r4     // Catch: java.lang.Exception -> L2b
            r6 = 4
            r1.f7019 = r6     // Catch: java.lang.Exception -> L2b
            r0.getClass()     // Catch: java.lang.Exception -> L2b
            r6 = -887787204550190(0xfffcd88fef0961d2, double:NaN)
            java.lang.String r6 = "SELECT * FROM ward_items WHERE type = 'user' ORDER BY saveTime DESC LIMIT ? OFFSET ?"     // Catch: java.lang.Exception -> L2b
            com.ss.android.ugc.awemes.WardDatabase r0 = r0.f1645     // Catch: java.lang.Exception -> L2b
            ᲇᛳᲇᲈ r7 = new ᲇᛳᲇᲈ     // Catch: java.lang.Exception -> L2b
            r7.<init>(r3, r4, r12, r6)     // Catch: java.lang.Exception -> L2b
            java.lang.Object r0 = defpackage.AbstractC2193.m3596(r1, r7, r0, r5, r2)     // Catch: java.lang.Exception -> L2b
            if (r0 != r10) goto L12d
            goto L264
        L12d:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L2b
            goto L216
        L131:
            r1.f7027 = r4     // Catch: java.lang.Exception -> L2b
            r1.f7019 = r11     // Catch: java.lang.Exception -> L2b
            r0.getClass()     // Catch: java.lang.Exception -> L2b
            r6 = -887254628605486(0xfffcd90bef0961d2, double:NaN)
            java.lang.String r6 = "SELECT * FROM ward_items WHERE (cid != '-1' AND type != 'user') OR type = 'comment' ORDER BY saveTime DESC LIMIT ? OFFSET ?"     // Catch: java.lang.Exception -> L2b
            com.ss.android.ugc.awemes.WardDatabase r0 = r0.f1645     // Catch: java.lang.Exception -> L2b
            ᲇᛳᲇᲈ r7 = new ᲇᛳᲇᲈ     // Catch: java.lang.Exception -> L2b
            r7.<init>(r3, r4, r2, r6)     // Catch: java.lang.Exception -> L2b
            java.lang.Object r0 = defpackage.AbstractC2193.m3596(r1, r7, r0, r5, r2)     // Catch: java.lang.Exception -> L2b
            if (r0 != r10) goto L150
            goto L264
        L150:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L2b
            goto L216
        L154:
            r1.f7027 = r4     // Catch: java.lang.Exception -> L2b
            r1.f7019 = r12     // Catch: java.lang.Exception -> L2b
            r0.getClass()     // Catch: java.lang.Exception -> L2b
            r6 = -886657628151342(0xfffcd996ef0961d2, double:NaN)
            java.lang.String r6 = "SELECT * FROM ward_items WHERE (cid = '-1' and (type != 'user' or type is null)) OR type = 'video' ORDER BY saveTime DESC LIMIT ? OFFSET ?"     // Catch: java.lang.Exception -> L2b
            com.ss.android.ugc.awemes.WardDatabase r0 = r0.f1645     // Catch: java.lang.Exception -> L2b
            ᲇᛳᲇᲈ r7 = new ᲇᛳᲇᲈ     // Catch: java.lang.Exception -> L2b
            r7.<init>(r3, r4, r11, r6)     // Catch: java.lang.Exception -> L2b
            java.lang.Object r0 = defpackage.AbstractC2193.m3596(r1, r7, r0, r5, r2)     // Catch: java.lang.Exception -> L2b
            if (r0 != r10) goto L173
            goto L264
        L173:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L2b
            goto L216
        L177:
            if (r13 == r5) goto L1f2
            if (r13 == r12) goto L1cc
            if (r13 == r11) goto L1a5
            r1.f7027 = r4     // Catch: java.lang.Exception -> L2b
            r6 = 9
            r1.f7019 = r6     // Catch: java.lang.Exception -> L2b
            r0.getClass()     // Catch: java.lang.Exception -> L2b
            r11 = -888152276770350(0xfffcd83aef0961d2, double:NaN)
            java.lang.String r6 = "\n        SELECT * FROM ward_items\n        WHERE category LIKE '%' || ? || '%'\n           OR remark LIKE '%' || ? || '%'\n           OR authorName LIKE '%' || ? || '%'\n           OR text LIKE '%' || ? || '%'\n        ORDER BY saveTime DESC\n        LIMIT ? OFFSET ?\n    "     // Catch: java.lang.Exception -> L2b
            com.ss.android.ugc.awemes.WardDatabase r0 = r0.f1645     // Catch: java.lang.Exception -> L2b
            r11 = r2
            ᛲᛳᛳᲈ r2 = new ᛲᛳᛳᲈ     // Catch: java.lang.Exception -> L2b
            r12 = r5
            r5 = 1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2b
            java.lang.Object r0 = defpackage.AbstractC2193.m3596(r1, r2, r0, r12, r11)     // Catch: java.lang.Exception -> L2b
            if (r0 != r10) goto L1a1
            goto L264
        L1a1:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L2b
            goto L216
        L1a5:
            r11 = r2
            r12 = r5
            r1.f7027 = r4     // Catch: java.lang.Exception -> L2b
            r2 = 8
            r1.f7019 = r2     // Catch: java.lang.Exception -> L2b
            r0.getClass()     // Catch: java.lang.Exception -> L2b
            r5 = -892202430930478(0xfffcd48bef0961d2, double:NaN)
            java.lang.String r6 = "\n        SELECT * FROM ward_items\n        WHERE type = 'user'\n          AND (category LIKE '%' || ? || '%'\n               OR remark LIKE '%' || ? || '%'\n               OR authorName LIKE '%' || ? || '%'\n               OR text LIKE '%' || ? || '%')\n        ORDER BY saveTime DESC\n        LIMIT ? OFFSET ?\n    "     // Catch: java.lang.Exception -> L2b
            com.ss.android.ugc.awemes.WardDatabase r0 = r0.f1645     // Catch: java.lang.Exception -> L2b
            ᛲᛳᛳᲈ r2 = new ᛲᛳᛳᲈ     // Catch: java.lang.Exception -> L2b
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2b
            java.lang.Object r0 = defpackage.AbstractC2193.m3596(r1, r2, r0, r12, r11)     // Catch: java.lang.Exception -> L2b
            if (r0 != r10) goto L1c9
            goto L264
        L1c9:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L2b
            goto L216
        L1cc:
            r11 = r2
            r12 = r5
            r1.f7027 = r4     // Catch: java.lang.Exception -> L2b
            r2 = 7
            r1.f7019 = r2     // Catch: java.lang.Exception -> L2b
            r0.getClass()     // Catch: java.lang.Exception -> L2b
            r5 = -890699192376878(0xfffcd5e9ef0961d2, double:NaN)
            java.lang.String r6 = "\n        SELECT * FROM ward_items\n        WHERE ((cid != '-1' AND type != 'user') OR type = 'comment')\n          AND (category LIKE '%' || ? || '%'\n               OR remark LIKE '%' || ? || '%'\n               OR authorName LIKE '%' || ? || '%'\n               OR text LIKE '%' || ? || '%')\n        ORDER BY saveTime DESC\n        LIMIT ? OFFSET ?\n    "     // Catch: java.lang.Exception -> L2b
            com.ss.android.ugc.awemes.WardDatabase r0 = r0.f1645     // Catch: java.lang.Exception -> L2b
            ᛲᛳᛳᲈ r2 = new ᛲᛳᛳᲈ     // Catch: java.lang.Exception -> L2b
            r5 = 3
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2b
            java.lang.Object r0 = defpackage.AbstractC2193.m3596(r1, r2, r0, r12, r11)     // Catch: java.lang.Exception -> L2b
            if (r0 != r10) goto L1ef
            goto L264
        L1ef:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L2b
            goto L216
        L1f2:
            r11 = r2
            r12 = r5
            r1.f7027 = r4     // Catch: java.lang.Exception -> L2b
            r2 = 6
            r1.f7019 = r2     // Catch: java.lang.Exception -> L2b
            r0.getClass()     // Catch: java.lang.Exception -> L2b
            r5 = -889299033038382(0xfffcd72fef0961d2, double:NaN)
            java.lang.String r6 = "\n        SELECT * FROM ward_items\n        WHERE (cid = '-1' OR type = 'video')\n          AND (category LIKE '%' || ? || '%'\n               OR remark LIKE '%' || ? || '%'\n               OR authorName LIKE '%' || ? || '%'\n               OR text LIKE '%' || ? || '%')\n        ORDER BY saveTime DESC\n        LIMIT ? OFFSET ?\n    "     // Catch: java.lang.Exception -> L2b
            com.ss.android.ugc.awemes.WardDatabase r0 = r0.f1645     // Catch: java.lang.Exception -> L2b
            ᛲᛳᛳᲈ r2 = new ᛲᛳᛳᲈ     // Catch: java.lang.Exception -> L2b
            r5 = 2
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2b
            java.lang.Object r0 = defpackage.AbstractC2193.m3596(r1, r2, r0, r12, r11)     // Catch: java.lang.Exception -> L2b
            if (r0 != r10) goto L214
            goto L264
        L214:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L2b
        L216:
            ᛶᛸᛳ r2 = defpackage.AbstractC1572.f6948     // Catch: java.lang.Exception -> L2b
            ᛷᲁᛷᛵ r2 = defpackage.AbstractC1497.f6594     // Catch: java.lang.Exception -> L2b
            ᲇᛶᲁᲇ r3 = new ᲇᛶᲁᲇ     // Catch: java.lang.Exception -> L2b
            r5 = 15
            r3.<init>(r8, r0, r9, r5)     // Catch: java.lang.Exception -> L2b
            r1.f7027 = r4     // Catch: java.lang.Exception -> L2b
            r0 = 10
            r1.f7019 = r0     // Catch: java.lang.Exception -> L2b
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r2, r3, r1)     // Catch: java.lang.Exception -> L2b
            if (r0 != r10) goto L265
            goto L264
        L22e:
            r2 = -1013462242598446(0xfffc6642ef0961d2, double:NaN)
            java.lang.String r2 = "执行失败"
            r3 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r3 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r3 = defpackage.C0346.f1773
            r3.getClass()
            defpackage.C0346.m1038(r2, r0)
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r0 = defpackage.AbstractC1497.f6594
            ᛵᛵᲁᛲ r2 = new ᛵᛵᲁᛲ
            r3 = 14
            r2.<init>(r8, r9, r3)
            r3 = 11
            r1.f7019 = r3
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r0, r2, r1)
            if (r0 != r10) goto L265
        L264:
            return r10
        L265:
            ᲁᲀᛱᲁ r0 = defpackage.C1907.f8270
            return r0
    }
}
