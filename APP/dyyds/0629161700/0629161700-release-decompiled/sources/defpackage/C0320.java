package defpackage;

/* JADX INFO: renamed from: ᛲᛷᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0320 extends defpackage.AbstractC1350 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f1652;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public java.lang.Object f1653;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f1654;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1655;

    public /* synthetic */ C0320(java.lang.Object r1, java.lang.Object r2, defpackage.InterfaceC0140 r3, int r4) {
            r0 = this;
            r0.f1655 = r4
            r0.f1653 = r1
            r0.f1654 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public /* synthetic */ C0320(java.lang.Object r1, defpackage.InterfaceC0140 r2, int r3) {
            r0 = this;
            r0.f1655 = r3
            r0.f1654 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    private final java.lang.Object m993(java.lang.Object r12) {
            r11 = this;
            java.lang.Object r0 = r11.f1654
            ᛱᲈᛶᲀ r0 = (defpackage.C0218) r0
            int r1 = r11.f1652
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            ᛴᛵ r6 = defpackage.EnumC0670.f3246
            if (r1 == 0) goto L31
            if (r1 == r4) goto L2d
            if (r1 == r3) goto L26
            if (r1 != r2) goto L19
            defpackage.AbstractC0762.m1680(r12)
            goto Ld0
        L19:
            r11 = -847259893145134(0xfffcfd6bef0961d2, double:NaN)
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r11)
            return r5
        L26:
            defpackage.AbstractC0762.m1680(r12)     // Catch: java.lang.Exception -> L2b
            goto Ld0
        L2b:
            r12 = move-exception
            goto L9b
        L2d:
            defpackage.AbstractC0762.m1680(r12)     // Catch: java.lang.Exception -> L2b
            goto L5b
        L31:
            defpackage.AbstractC0762.m1680(r12)
            java.lang.Object r12 = r11.f1653     // Catch: java.lang.Exception -> L2b
            ᛴᛵᲇᲇ r12 = (defpackage.C0682) r12     // Catch: java.lang.Exception -> L2b
            java.lang.Object r12 = r12.f3286     // Catch: java.lang.Exception -> L2b
            ᛲᛶᛸᛱ r12 = (defpackage.C0312) r12     // Catch: java.lang.Exception -> L2b
            r11.f1652 = r4     // Catch: java.lang.Exception -> L2b
            r12.getClass()     // Catch: java.lang.Exception -> L2b
            r7 = -910185458998830(0xfffcc430ef0961d2, double:NaN)
            java.lang.String r1 = "\n        SELECT authorUid, authorName, authorAvatar, COUNT(*) as count\n        FROM ward_items\n        WHERE authorUid IS NOT NULL AND authorUid != ''\n        GROUP BY authorUid\n        ORDER BY count DESC\n    "     // Catch: java.lang.Exception -> L2b
            com.ss.android.ugc.awemes.WardDatabase r12 = r12.f1645     // Catch: java.lang.Exception -> L2b
            ᛳᲈᛱᛸ r7 = new ᛳᲈᛱᛸ     // Catch: java.lang.Exception -> L2b
            r8 = 17
            r7.<init>(r1, r8)     // Catch: java.lang.Exception -> L2b
            r1 = 0
            java.lang.Object r12 = defpackage.AbstractC2193.m3596(r11, r7, r12, r4, r1)     // Catch: java.lang.Exception -> L2b
            if (r12 != r6) goto L5b
            goto Lcf
        L5b:
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Exception -> L2b
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2b
            int r4 = defpackage.AbstractC0575.m1369(r12)     // Catch: java.lang.Exception -> L2b
            r1.<init>(r4)     // Catch: java.lang.Exception -> L2b
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Exception -> L2b
        L6a:
            boolean r4 = r12.hasNext()     // Catch: java.lang.Exception -> L2b
            if (r4 == 0) goto L87
            java.lang.Object r4 = r12.next()     // Catch: java.lang.Exception -> L2b
            ᲇᲀᲇᛴ r4 = (defpackage.C2124) r4     // Catch: java.lang.Exception -> L2b
            ᛲᛸᛲᛵ r7 = new ᛲᛸᛲᛵ     // Catch: java.lang.Exception -> L2b
            java.lang.String r8 = r4.f9093     // Catch: java.lang.Exception -> L2b
            java.lang.String r9 = r4.f9094     // Catch: java.lang.Exception -> L2b
            java.lang.String r10 = r4.f9092     // Catch: java.lang.Exception -> L2b
            int r4 = r4.f9091     // Catch: java.lang.Exception -> L2b
            r7.<init>(r4, r8, r9, r10)     // Catch: java.lang.Exception -> L2b
            r1.add(r7)     // Catch: java.lang.Exception -> L2b
            goto L6a
        L87:
            ᛶᛸᛳ r12 = defpackage.AbstractC1572.f6948     // Catch: java.lang.Exception -> L2b
            ᛷᲁᛷᛵ r12 = defpackage.AbstractC1497.f6594     // Catch: java.lang.Exception -> L2b
            ᲇᛶᲁᲇ r4 = new ᲇᛶᲁᲇ     // Catch: java.lang.Exception -> L2b
            r7 = 14
            r4.<init>(r0, r1, r5, r7)     // Catch: java.lang.Exception -> L2b
            r11.f1652 = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r11 = defpackage.AbstractC0397.m1144(r12, r4, r11)     // Catch: java.lang.Exception -> L2b
            if (r11 != r6) goto Ld0
            goto Lcf
        L9b:
            r3 = -847238418308654(0xfffcfd70ef0961d2, double:NaN)
            java.lang.String r1 = "执行失败"
            r3 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r3 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r3 = defpackage.C0346.f1773
            r3.getClass()
            defpackage.C0346.m1038(r1, r12)
            ᛶᛸᛳ r12 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r12 = defpackage.AbstractC1497.f6594
            ᛵᛵᲁᛲ r1 = new ᛵᛵᲁᛲ
            r3 = 13
            r1.<init>(r0, r5, r3)
            r11.f1652 = r2
            java.lang.Object r11 = defpackage.AbstractC0397.m1144(r12, r1, r11)
            if (r11 != r6) goto Ld0
        Lcf:
            return r6
        Ld0:
            ᲁᲀᛱᲁ r11 = defpackage.C1907.f8270
            return r11
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f1655
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            switch(r0) {
                case 0: goto L133;
                case 1: goto L124;
                case 2: goto L115;
                case 3: goto L106;
                case 4: goto Lf7;
                case 5: goto Le8;
                case 6: goto Ld9;
                case 7: goto Lca;
                case 8: goto Lbb;
                case 9: goto Lac;
                case 10: goto L9d;
                case 11: goto L8e;
                case 12: goto L7f;
                case 13: goto L70;
                case 14: goto L61;
                case 15: goto L52;
                case 16: goto L43;
                case 17: goto L34;
                case 18: goto L25;
                case 19: goto L16;
                default: goto L7;
            }
        L7:
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L16:
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L25:
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L34:
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L43:
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L52:
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L61:
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L70:
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L7f:
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L8e:
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L9d:
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        Lac:
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        Lbb:
            ᲇᛷᛱᛷ r3 = (defpackage.C2083) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        Lca:
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        Ld9:
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        Le8:
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        Lf7:
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L106:
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L115:
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L124:
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L133:
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛲᛷᛶᛸ r2 = (defpackage.C0320) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f1655
            java.lang.Object r1 = r2.f1654
            switch(r0) {
                case 0: goto L10c;
                case 1: goto Lff;
                case 2: goto Lf6;
                case 3: goto Le9;
                case 4: goto Ldc;
                case 5: goto Lcf;
                case 6: goto Lc2;
                case 7: goto Lb5;
                case 8: goto La9;
                case 9: goto L9b;
                case 10: goto L8d;
                case 11: goto L81;
                case 12: goto L73;
                case 13: goto L65;
                case 14: goto L57;
                case 15: goto L49;
                case 16: goto L3b;
                case 17: goto L2d;
                case 18: goto L1f;
                case 19: goto L11;
                default: goto L7;
            }
        L7:
            ᛲᛷᛶᛸ r2 = new ᛲᛷᛶᛸ
            android.content.Context r1 = (android.content.Context) r1
            r4 = 20
            r2.<init>(r1, r3, r4)
            return r2
        L11:
            ᛲᛷᛶᛸ r4 = new ᛲᛷᛶᛸ
            java.lang.Object r2 = r2.f1653
            ᛴᛵᲇᲇ r2 = (defpackage.C0682) r2
            ᛱᲈᛶᲀ r1 = (defpackage.C0218) r1
            r0 = 19
            r4.<init>(r2, r1, r3, r0)
            return r4
        L1f:
            ᛲᛷᛶᛸ r4 = new ᛲᛷᛶᛸ
            java.lang.Object r2 = r2.f1653
            ᛴᛵᲇᲇ r2 = (defpackage.C0682) r2
            ᲀᛱᲈᛸ r1 = (defpackage.C1623) r1
            r0 = 18
            r4.<init>(r2, r1, r3, r0)
            return r4
        L2d:
            ᛲᛷᛶᛸ r4 = new ᛲᛷᛶᛸ
            java.lang.Object r2 = r2.f1653
            ᛴᛵᲇᲇ r2 = (defpackage.C0682) r2
            ᛷᛶᛵᛶ r1 = (defpackage.C1291) r1
            r0 = 17
            r4.<init>(r2, r1, r3, r0)
            return r4
        L3b:
            ᛲᛷᛶᛸ r4 = new ᛲᛷᛶᛸ
            java.lang.Object r2 = r2.f1653
            ᛴᛵᲇᲇ r2 = (defpackage.C0682) r2
            java.lang.String r1 = (java.lang.String) r1
            r0 = 16
            r4.<init>(r2, r1, r3, r0)
            return r4
        L49:
            ᛲᛷᛶᛸ r4 = new ᛲᛷᛶᛸ
            java.lang.Object r2 = r2.f1653
            ᛴᛵᲇᲇ r2 = (defpackage.C0682) r2
            ᛴᲁᲈᛴ r1 = (defpackage.C0774) r1
            r0 = 15
            r4.<init>(r2, r1, r3, r0)
            return r4
        L57:
            ᛲᛷᛶᛸ r4 = new ᛲᛷᛶᛸ
            java.lang.Object r2 = r2.f1653
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            ᛵᛵᛸᲀ r1 = (defpackage.C0892) r1
            r0 = 14
            r4.<init>(r2, r1, r3, r0)
            return r4
        L65:
            ᛲᛷᛶᛸ r4 = new ᛲᛷᛶᛸ
            java.lang.Object r2 = r2.f1653
            ᛶᛲᛵᲀ r2 = (defpackage.C1023) r2
            ᲀᲈᛵᲇ r1 = (defpackage.InterfaceC1781) r1
            r0 = 13
            r4.<init>(r2, r1, r3, r0)
            return r4
        L73:
            ᛲᛷᛶᛸ r4 = new ᛲᛷᛶᛸ
            java.lang.Object r2 = r2.f1653
            ᛷᲇᲇᲀ r2 = (defpackage.C1394) r2
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            r0 = 12
            r4.<init>(r2, r1, r3, r0)
            return r4
        L81:
            ᛲᛷᛶᛸ r2 = new ᛲᛷᛶᛸ
            ᛳᲈᲇᛳ r1 = (defpackage.InterfaceC0598) r1
            r0 = 11
            r2.<init>(r1, r3, r0)
            r2.f1653 = r4
            return r2
        L8d:
            ᛲᛷᛶᛸ r4 = new ᛲᛷᛶᛸ
            java.lang.Object r2 = r2.f1653
            ᲇᛷᛳᲀ r2 = (defpackage.InterfaceC2087) r2
            ᛸᲈᛱᛷ r1 = (defpackage.C1595) r1
            r0 = 10
            r4.<init>(r2, r1, r3, r0)
            return r4
        L9b:
            ᛲᛷᛶᛸ r4 = new ᛲᛷᛶᛸ
            java.lang.Object r2 = r2.f1653
            java.lang.String[] r2 = (java.lang.String[]) r2
            ᲀᛵᛶᛱ r1 = (defpackage.C1675) r1
            r0 = 9
            r4.<init>(r2, r1, r3, r0)
            return r4
        La9:
            ᛲᛷᛶᛸ r2 = new ᛲᛷᛶᛸ
            ᲁᲈᛳᲀ r1 = (defpackage.C1961) r1
            r0 = 8
            r2.<init>(r1, r3, r0)
            r2.f1653 = r4
            return r2
        Lb5:
            ᛲᛷᛶᛸ r4 = new ᛲᛷᛶᛸ
            java.lang.Object r2 = r2.f1653
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = (com.ss.android.ugc.aweme.base.model.UrlModel) r2
            android.content.Context r1 = (android.content.Context) r1
            r0 = 7
            r4.<init>(r2, r1, r3, r0)
            return r4
        Lc2:
            ᛲᛷᛶᛸ r4 = new ᛲᛷᛶᛸ
            java.lang.Object r2 = r2.f1653
            android.content.Context r2 = (android.content.Context) r2
            ᛱᛲᲈᛲ r1 = (defpackage.C0046) r1
            r0 = 6
            r4.<init>(r2, r1, r3, r0)
            return r4
        Lcf:
            ᛲᛷᛶᛸ r4 = new ᛲᛷᛶᛸ
            java.lang.Object r2 = r2.f1653
            com.ss.android.ugc.awemes.WardDatabase r2 = (com.ss.android.ugc.awemes.WardDatabase) r2
            ᛳᲈᲇᛳ r1 = (defpackage.InterfaceC0598) r1
            r0 = 5
            r4.<init>(r2, r1, r3, r0)
            return r4
        Ldc:
            ᛲᛷᛶᛸ r4 = new ᛲᛷᛶᛸ
            java.lang.Object r2 = r2.f1653
            ᲇᛷᛳᲀ r2 = (defpackage.InterfaceC2087) r2
            ᛸᛱᛴᲁ r1 = (defpackage.C1419) r1
            r0 = 4
            r4.<init>(r2, r1, r3, r0)
            return r4
        Le9:
            ᛲᛷᛶᛸ r4 = new ᛲᛷᛶᛸ
            java.lang.Object r2 = r2.f1653
            ᲇᛷᛳᲀ r2 = (defpackage.InterfaceC2087) r2
            ᛶᛳᛴᛶ r1 = (defpackage.C1033) r1
            r0 = 3
            r4.<init>(r2, r1, r3, r0)
            return r4
        Lf6:
            ᛲᛷᛶᛸ r2 = new ᛲᛷᛶᛸ
            com.ss.android.ugc.aweme.comment.model.Comment r1 = (com.ss.android.ugc.aweme.comment.model.Comment) r1
            r4 = 2
            r2.<init>(r1, r3, r4)
            return r2
        Lff:
            ᛲᛷᛶᛸ r4 = new ᛲᛷᛶᛸ
            java.lang.Object r2 = r2.f1653
            ᛶᛱᛵᛳ r2 = (defpackage.C1006) r2
            ᲁᛷᛵ r1 = (defpackage.C1884) r1
            r0 = 1
            r4.<init>(r2, r1, r3, r0)
            return r4
        L10c:
            ᛲᛷᛶᛸ r4 = new ᛲᛷᛶᛸ
            java.lang.Object r2 = r2.f1653
            ᲀᛲᛶᲈ r2 = (defpackage.C1630) r2
            java.lang.String r1 = (java.lang.String) r1
            r0 = 0
            r4.<init>(r2, r1, r3, r0)
            return r4
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r19) {
            r18 = this;
            r4 = r18
            int r0 = r4.f1655
            r1 = 10
            r2 = 8
            r6 = 3
            r9 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r11 = 2
            r12 = 0
            r3 = 1
            r13 = 0
            switch(r0) {
                case 0: goto L89c;
                case 1: goto L839;
                case 2: goto L7bf;
                case 3: goto L794;
                case 4: goto L767;
                case 5: goto L728;
                case 6: goto L6a3;
                case 7: goto L5b7;
                case 8: goto L57a;
                case 9: goto L4fd;
                case 10: goto L4d2;
                case 11: goto L495;
                case 12: goto L462;
                case 13: goto L42a;
                case 14: goto L3db;
                case 15: goto L33d;
                case 16: goto L2b1;
                case 17: goto L1e7;
                case 18: goto L138;
                case 19: goto L133;
                default: goto L15;
            }
        L15:
            java.lang.Object r0 = r4.f1654
            android.content.Context r0 = (android.content.Context) r0
            ᛴᛵ r1 = defpackage.EnumC0670.f3246
            int r2 = r4.f1652
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r4.f1653
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            defpackage.AbstractC0762.m1680(r19)
            r13 = r0
            r0 = r19
            goto Ld2
        L2d:
            r0 = -371828488314414(0xfffeadd2ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L132
        L3b:
            defpackage.AbstractC0762.m1680(r19)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            ᛴᛶᲁᛲ r5 = defpackage.C0697.f3343
            r5.getClass()
            java.util.ArrayList r5 = defpackage.C0697.m1577(r0)
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L55:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L65
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            r6.put(r7)
            goto L55
        L65:
            r7 = -371416171453998(0xfffeae32ef0961d2, double:NaN)
            java.lang.String r5 = "categories"
            r2.put(r5, r6)
            ᛴᛶᲁᛲ r5 = defpackage.C0697.f3343
            r5.getClass()
            r5 = -194360439643694(0xffff4f3aef0961d2, double:NaN)
            android.content.SharedPreferences r5 = defpackage.C0697.m1578(r0)
            r6 = -194394799382062(0xffff4f32ef0961d2, double:NaN)
            java.lang.String r6 = "last_selected_category"
            java.lang.String r5 = r5.getString(r6, r13)
            r6 = -371463416094254(0xfffeae27ef0961d2, double:NaN)
            java.lang.String r6 = "lastSelectedCategory"
            if (r5 != 0) goto La3
            r7 = -371553610407470(0xfffeae12ef0961d2, double:NaN)
            java.lang.String r5 = ""
        La3:
            r2.put(r6, r5)
            ᛸᛵᛴᛲ r5 = com.ss.android.ugc.awemes.WardDatabase.f425
            com.ss.android.ugc.awemes.WardDatabase r0 = r5.m2696(r0)
            ᛲᛶᛸᛱ r0 = r0.mo309()
            r4.f1653 = r2
            r4.f1652 = r3
            r0.getClass()
            r5 = -885394907766318(0xfffcdabcef0961d2, double:NaN)
            java.lang.String r5 = "SELECT * FROM ward_items ORDER BY saveTime DESC"
            com.ss.android.ugc.awemes.WardDatabase r0 = r0.f1645
            ᛳᲈᛱᛸ r6 = new ᛳᲈᛱᛸ
            r7 = 16
            r6.<init>(r5, r7)
            java.lang.Object r0 = defpackage.AbstractC2193.m3596(r4, r6, r0, r3, r12)
            if (r0 != r1) goto Ld1
            r13 = r1
            goto L132
        Ld1:
            r13 = r2
        Ld2:
            java.util.List r0 = (java.util.List) r0
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        Ldd:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lf1
            java.lang.Object r3 = r2.next()
            ᛷᛶᛷᛲ r3 = (defpackage.C1294) r3
            org.json.JSONObject r3 = r3.m2415()
            r1.put(r3)
            goto Ldd
        Lf1:
            r2 = -371557905374766(0xfffeae11ef0961d2, double:NaN)
            java.lang.String r2 = "wardItems"
            r13.put(r2, r1)
            r1 = -371600855047726(0xfffeae07ef0961d2, double:NaN)
            java.lang.String r1 = "wardItemsCount"
            int r0 = r0.size()
            r13.put(r1, r0)
            r0 = -371665279557166(0xfffeadf8ef0961d2, double:NaN)
            java.lang.String r0 = "backupTime"
            long r1 = java.lang.System.currentTimeMillis()
            r13.put(r0, r1)
            r0 = -371712524197422(0xfffeadedef0961d2, double:NaN)
            java.lang.String r0 = "backupVersion"
            r1 = -371772653739566(0xfffeaddfef0961d2, double:NaN)
            java.lang.String r1 = "260629161700"
            r13.put(r0, r1)
        L132:
            return r13
        L133:
            java.lang.Object r0 = r18.m993(r19)
            return r0
        L138:
            java.lang.Object r0 = r4.f1654
            r5 = r0
            ᲀᛱᲈᛸ r5 = (defpackage.C1623) r5
            ᛴᛵ r14 = defpackage.EnumC0670.f3246
            int r0 = r4.f1652
            if (r0 == 0) goto L173
            if (r0 == r3) goto L168
            if (r0 == r11) goto L15c
            if (r0 != r6) goto L14e
            defpackage.AbstractC0762.m1680(r19)
            goto L1e4
        L14e:
            r0 = -949462934920750(0xfffca077ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L1e6
        L15c:
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Exception -> L161
            goto L1e4
        L161:
            r0 = move-exception
            r16 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            goto L1ba
        L168:
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Exception -> L161
            r0 = r19
            r16 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            goto L1a1
        L173:
            defpackage.AbstractC0762.m1680(r19)
            java.lang.Object r0 = r4.f1653     // Catch: java.lang.Exception -> L161
            ᛴᛵᲇᲇ r0 = (defpackage.C0682) r0     // Catch: java.lang.Exception -> L161
            java.lang.Object r0 = r0.f3286     // Catch: java.lang.Exception -> L161
            ᛲᛶᛸᛱ r0 = (defpackage.C0312) r0     // Catch: java.lang.Exception -> L161
            r4.f1652 = r3     // Catch: java.lang.Exception -> L161
            r0.getClass()     // Catch: java.lang.Exception -> L161
            r15 = -896218225352238(0xfffcd0e4ef0961d2, double:NaN)
            java.lang.String r15 = "SELECT COUNT(*) FROM ward_items"     // Catch: java.lang.Exception -> L161
            com.ss.android.ugc.awemes.WardDatabase r0 = r0.f1645     // Catch: java.lang.Exception -> L161
            r16 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            ᛳᲈᛱᛸ r7 = new ᛳᲈᛱᛸ     // Catch: java.lang.Exception -> L1b9
            r8 = 14
            r7.<init>(r15, r8)     // Catch: java.lang.Exception -> L1b9
            java.lang.Object r0 = defpackage.AbstractC2193.m3596(r4, r7, r0, r3, r12)     // Catch: java.lang.Exception -> L1b9
            if (r0 != r14) goto L1a1
            goto L1e2
        L1a1:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> L1b9
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L1b9
            ᛶᛸᛳ r3 = defpackage.AbstractC1572.f6948     // Catch: java.lang.Exception -> L1b9
            ᛷᲁᛷᛵ r3 = defpackage.AbstractC1497.f6594     // Catch: java.lang.Exception -> L1b9
            ᛱᛶᛵᛸ r7 = new ᛱᛶᛵᛸ     // Catch: java.lang.Exception -> L1b9
            r7.<init>(r5, r0, r13, r2)     // Catch: java.lang.Exception -> L1b9
            r4.f1652 = r11     // Catch: java.lang.Exception -> L1b9
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r3, r7, r4)     // Catch: java.lang.Exception -> L1b9
            if (r0 != r14) goto L1e4
            goto L1e2
        L1b9:
            r0 = move-exception
        L1ba:
            r2 = -949441460084270(0xfffca07cef0961d2, double:NaN)
            java.lang.String r2 = "执行失败"
            ᛲᲀᛱᲁ r3 = defpackage.C0346.f1773
            r3.getClass()
            defpackage.C0346.m1038(r2, r0)
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r0 = defpackage.AbstractC1497.f6594
            ᛵᛵᲁᛲ r2 = new ᛵᛵᲁᛲ
            r2.<init>(r5, r13, r1)
            r4.f1652 = r6
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r0, r2, r4)
            if (r0 != r14) goto L1e4
        L1e2:
            r13 = r14
            goto L1e6
        L1e4:
            ᲁᲀᛱᲁ r13 = defpackage.C1907.f8270
        L1e6:
            return r13
        L1e7:
            r16 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            java.lang.Object r0 = r4.f1654
            r1 = r0
            ᛷᛶᛵᛶ r1 = (defpackage.C1291) r1
            ᛴᛵ r2 = defpackage.EnumC0670.f3246
            int r0 = r4.f1652
            if (r0 == 0) goto L21d
            if (r0 == r3) goto L217
            if (r0 == r11) goto L210
            if (r0 != r6) goto L202
            defpackage.AbstractC0762.m1680(r19)
            goto L2ae
        L202:
            r0 = -3895819935278(0xfffffc74ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L2b0
        L210:
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Exception -> L215
            goto L2ae
        L215:
            r0 = move-exception
            goto L282
        L217:
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Exception -> L215
            r0 = r19
            goto L246
        L21d:
            defpackage.AbstractC0762.m1680(r19)
            java.lang.Object r0 = r4.f1653     // Catch: java.lang.Exception -> L215
            ᛴᛵᲇᲇ r0 = (defpackage.C0682) r0     // Catch: java.lang.Exception -> L215
            java.lang.Object r0 = r0.f3286     // Catch: java.lang.Exception -> L215
            ᛲᛶᛸᛱ r0 = (defpackage.C0312) r0     // Catch: java.lang.Exception -> L215
            r4.f1652 = r3     // Catch: java.lang.Exception -> L215
            r0.getClass()     // Catch: java.lang.Exception -> L215
            r7 = -909639998152238(0xfffcc4afef0961d2, double:NaN)
            java.lang.String r5 = "\n        SELECT category, COUNT(*) as count\n        FROM ward_items\n        GROUP BY category\n        ORDER BY count DESC\n    "     // Catch: java.lang.Exception -> L215
            com.ss.android.ugc.awemes.WardDatabase r0 = r0.f1645     // Catch: java.lang.Exception -> L215
            ᛳᲈᛱᛸ r7 = new ᛳᲈᛱᛸ     // Catch: java.lang.Exception -> L215
            r8 = 18
            r7.<init>(r5, r8)     // Catch: java.lang.Exception -> L215
            java.lang.Object r0 = defpackage.AbstractC2193.m3596(r4, r7, r0, r3, r12)     // Catch: java.lang.Exception -> L215
            if (r0 != r2) goto L246
            goto L2ac
        L246:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L215
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L215
            int r5 = defpackage.AbstractC0575.m1369(r0)     // Catch: java.lang.Exception -> L215
            r3.<init>(r5)     // Catch: java.lang.Exception -> L215
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L215
        L255:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Exception -> L215
            if (r5 == 0) goto L26e
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Exception -> L215
            ᛳᲈᲈᲁ r5 = (defpackage.C0602) r5     // Catch: java.lang.Exception -> L215
            ᛱᲀᛵᛴ r7 = new ᛱᲀᛵᛴ     // Catch: java.lang.Exception -> L215
            java.lang.String r8 = r5.f2985     // Catch: java.lang.Exception -> L215
            int r5 = r5.f2986     // Catch: java.lang.Exception -> L215
            r7.<init>(r8, r5)     // Catch: java.lang.Exception -> L215
            r3.add(r7)     // Catch: java.lang.Exception -> L215
            goto L255
        L26e:
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948     // Catch: java.lang.Exception -> L215
            ᛷᲁᛷᛵ r0 = defpackage.AbstractC1497.f6594     // Catch: java.lang.Exception -> L215
            ᲇᛶᲁᲇ r5 = new ᲇᛶᲁᲇ     // Catch: java.lang.Exception -> L215
            r7 = 12
            r5.<init>(r1, r3, r13, r7)     // Catch: java.lang.Exception -> L215
            r4.f1652 = r11     // Catch: java.lang.Exception -> L215
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r0, r5, r4)     // Catch: java.lang.Exception -> L215
            if (r0 != r2) goto L2ae
            goto L2ac
        L282:
            r7 = -3874345098798(0xfffffc79ef0961d2, double:NaN)
            java.lang.String r3 = "执行失败"
            ᛲᲀᛱᲁ r5 = defpackage.C0346.f1773
            r5.getClass()
            defpackage.C0346.m1038(r3, r0)
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r0 = defpackage.AbstractC1497.f6594
            ᛵᛵᲁᛲ r3 = new ᛵᛵᲁᛲ
            r5 = 9
            r3.<init>(r1, r13, r5)
            r4.f1652 = r6
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r0, r3, r4)
            if (r0 != r2) goto L2ae
        L2ac:
            r13 = r2
            goto L2b0
        L2ae:
            ᲁᲀᛱᲁ r13 = defpackage.C1907.f8270
        L2b0:
            return r13
        L2b1:
            r16 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            ᛴᛵ r0 = defpackage.EnumC0670.f3246
            int r1 = r4.f1652
            if (r1 == 0) goto L2d3
            if (r1 != r3) goto L2c6
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Exception -> L2c4
            r1 = r19
            goto L301
        L2c4:
            r0 = move-exception
            goto L323
        L2c6:
            r0 = -996879373868590(0xfffc7557ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L33c
        L2d3:
            defpackage.AbstractC0762.m1680(r19)
            java.lang.Object r1 = r4.f1653     // Catch: java.lang.Exception -> L2c4
            ᛴᛵᲇᲇ r1 = (defpackage.C0682) r1     // Catch: java.lang.Exception -> L2c4
            java.lang.Object r1 = r1.f3286     // Catch: java.lang.Exception -> L2c4
            ᛲᛶᛸᛱ r1 = (defpackage.C0312) r1     // Catch: java.lang.Exception -> L2c4
            java.lang.Object r2 = r4.f1654     // Catch: java.lang.Exception -> L2c4
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L2c4
            r4.f1652 = r3     // Catch: java.lang.Exception -> L2c4
            r1.getClass()     // Catch: java.lang.Exception -> L2c4
            r5 = -913617137868334(0xfffcc111ef0961d2, double:NaN)
            java.lang.String r5 = "SELECT DISTINCT category FROM ward_items WHERE authorUid = ? AND category IS NOT NULL AND category != '' ORDER BY category ASC"     // Catch: java.lang.Exception -> L2c4
            com.ss.android.ugc.awemes.WardDatabase r1 = r1.f1645     // Catch: java.lang.Exception -> L2c4
            ᛱᲀᛱᛶ r6 = new ᛱᲀᛱᛶ     // Catch: java.lang.Exception -> L2c4
            r7 = 15
            r6.<init>(r5, r7, r2)     // Catch: java.lang.Exception -> L2c4
            java.lang.Object r1 = defpackage.AbstractC2193.m3596(r4, r6, r1, r3, r12)     // Catch: java.lang.Exception -> L2c4
            if (r1 != r0) goto L301
            r13 = r0
            goto L33c
        L301:
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Exception -> L2c4
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2c4
            r13.<init>()     // Catch: java.lang.Exception -> L2c4
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Exception -> L2c4
        L30c:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L2c4
            if (r1 == 0) goto L33c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L2c4
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L2c4
            boolean r2 = defpackage.AbstractC1347.m2524(r2)     // Catch: java.lang.Exception -> L2c4
            if (r2 != 0) goto L30c
            r13.add(r1)     // Catch: java.lang.Exception -> L2c4
            goto L30c
        L323:
            r1 = -996840719162926(0xfffc7560ef0961d2, double:NaN)
            java.lang.String r1 = "获取历史分类失败"
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r0)
            ᲀᛶᲇ r13 = defpackage.C1698.f7558
        L33c:
            return r13
        L33d:
            r16 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            java.lang.Object r0 = r4.f1654
            r1 = r0
            ᛴᲁᲈᛴ r1 = (defpackage.C0774) r1
            ᛴᛵ r2 = defpackage.EnumC0670.f3246
            int r0 = r4.f1652
            if (r0 == 0) goto L36e
            if (r0 == r3) goto L366
            if (r0 != r11) goto L358
            defpackage.AbstractC0762.m1680(r19)
            r0 = r19
            goto L3d6
        L358:
            r0 = -227852594617902(0xffff30c4ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L3da
        L366:
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Exception -> L36c
            r0 = r19
            goto L3a9
        L36c:
            r0 = move-exception
            goto L3ac
        L36e:
            defpackage.AbstractC0762.m1680(r19)
            java.lang.Object r0 = r4.f1653     // Catch: java.lang.Exception -> L36c
            ᛴᛵᲇᲇ r0 = (defpackage.C0682) r0     // Catch: java.lang.Exception -> L36c
            java.lang.Object r0 = r0.f3286     // Catch: java.lang.Exception -> L36c
            ᛲᛶᛸᛱ r0 = (defpackage.C0312) r0     // Catch: java.lang.Exception -> L36c
            r0.getClass()     // Catch: java.lang.Exception -> L36c
            r5 = -914317217537582(0xfffcc06eef0961d2, double:NaN)
            java.lang.String r5 = "DELETE FROM ward_items"     // Catch: java.lang.Exception -> L36c
            com.ss.android.ugc.awemes.WardDatabase r0 = r0.f1645     // Catch: java.lang.Exception -> L36c
            ᛳᲈᛱᛸ r6 = new ᛳᲈᛱᛸ     // Catch: java.lang.Exception -> L36c
            r7 = 11
            r6.<init>(r5, r7)     // Catch: java.lang.Exception -> L36c
            java.lang.Object r0 = defpackage.AbstractC2193.m3592(r0, r6)     // Catch: java.lang.Exception -> L36c
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> L36c
            r0.intValue()     // Catch: java.lang.Exception -> L36c
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948     // Catch: java.lang.Exception -> L36c
            ᛷᲁᛷᛵ r0 = defpackage.AbstractC1497.f6594     // Catch: java.lang.Exception -> L36c
            ᲁᛵᲈᛱ r5 = new ᲁᛵᲈᛱ     // Catch: java.lang.Exception -> L36c
            r5.<init>(r1, r13, r12)     // Catch: java.lang.Exception -> L36c
            r4.f1652 = r3     // Catch: java.lang.Exception -> L36c
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r0, r5, r4)     // Catch: java.lang.Exception -> L36c
            if (r0 != r2) goto L3a9
            goto L3d4
        L3a9:
            ᲁᲀᛱᲁ r0 = (defpackage.C1907) r0     // Catch: java.lang.Exception -> L36c
            goto L3d8
        L3ac:
            r5 = -227831119781422(0xffff30c9ef0961d2, double:NaN)
            java.lang.String r5 = "执行失败"
            ᛲᲀᛱᲁ r6 = defpackage.C0346.f1773
            r6.getClass()
            defpackage.C0346.m1038(r5, r0)
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r0 = defpackage.AbstractC1497.f6594
            ᲁᛵᲈᛱ r5 = new ᲁᛵᲈᛱ
            r5.<init>(r1, r13, r3)
            r4.f1652 = r11
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r0, r5, r4)
            if (r0 != r2) goto L3d6
        L3d4:
            r13 = r2
            goto L3da
        L3d6:
            ᲁᲀᛱᲁ r0 = (defpackage.C1907) r0
        L3d8:
            ᲁᲀᛱᲁ r13 = defpackage.C1907.f8270
        L3da:
            return r13
        L3db:
            ᛴᛵ r0 = defpackage.EnumC0670.f3246
            int r2 = r4.f1652
            if (r2 == 0) goto L3fc
            if (r2 == r3) goto L3f6
            if (r2 != r11) goto L3e9
            defpackage.AbstractC0762.m1680(r19)
            goto L427
        L3e9:
            r0 = -70429158317614(0xffffbff1ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L429
        L3f6:
            defpackage.AbstractC0762.m1680(r19)
            r2 = r19
            goto L40e
        L3fc:
            defpackage.AbstractC0762.m1680(r19)
            java.util.Map r2 = defpackage.C1746.f7729
            java.lang.Object r2 = r4.f1653
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            r4.f1652 = r3
            java.lang.Object r2 = defpackage.C1746.m3129(r2, r4)
            if (r2 != r0) goto L40e
            goto L425
        L40e:
            java.lang.String r2 = (java.lang.String) r2
            ᛶᛸᛳ r3 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r3 = defpackage.AbstractC1497.f6594
            ᲇᛶᲁᲇ r5 = new ᲇᛶᲁᲇ
            java.lang.Object r6 = r4.f1654
            ᛵᛵᛸᲀ r6 = (defpackage.C0892) r6
            r5.<init>(r6, r2, r13, r1)
            r4.f1652 = r11
            java.lang.Object r1 = defpackage.AbstractC0397.m1144(r3, r5, r4)
            if (r1 != r0) goto L427
        L425:
            r13 = r0
            goto L429
        L427:
            ᲁᲀᛱᲁ r13 = defpackage.C1907.f8270
        L429:
            return r13
        L42a:
            java.lang.Object r0 = r4.f1654
            r1 = r0
            ᲀᲈᛵᲇ r1 = (defpackage.InterfaceC1781) r1
            ᛴᛵ r0 = defpackage.EnumC0670.f3246
            int r2 = r4.f1652
            if (r2 == 0) goto L445
            if (r2 != r3) goto L43f
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Throwable -> L43d
            r2 = r19
            goto L456
        L43d:
            r0 = move-exception
            goto L45e
        L43f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L45d
        L445:
            defpackage.AbstractC0762.m1680(r19)
            java.lang.Object r2 = r4.f1653     // Catch: java.lang.Throwable -> L43d
            ᛶᛲᛵᲀ r2 = (defpackage.C1023) r2     // Catch: java.lang.Throwable -> L43d
            r4.f1652 = r3     // Catch: java.lang.Throwable -> L43d
            java.lang.Object r2 = r2.m1977(r4)     // Catch: java.lang.Throwable -> L43d
            if (r2 != r0) goto L456
            r13 = r0
            goto L45d
        L456:
            java.util.Set r2 = (java.util.Set) r2     // Catch: java.lang.Throwable -> L43d
            r1.mo1032()
            ᲁᲀᛱᲁ r13 = defpackage.C1907.f8270
        L45d:
            return r13
        L45e:
            r1.mo1032()
            throw r0
        L462:
            ᛴᛵ r0 = defpackage.EnumC0670.f3246
            int r1 = r4.f1652
            if (r1 == 0) goto L47b
            if (r1 != r3) goto L46e
            defpackage.AbstractC0762.m1680(r19)
            goto L492
        L46e:
            r0 = -81767871979054(0xffffb5a1ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L494
        L47b:
            defpackage.AbstractC0762.m1680(r19)
            java.lang.Object r1 = r4.f1653
            ᛷᲇᲇᲀ r1 = (defpackage.C1394) r1
            android.app.Activity r2 = r1.f6050
            java.lang.Object r5 = r4.f1654
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            r4.f1652 = r3
            java.lang.Object r1 = r1.m2566(r2, r5, r4)
            if (r1 != r0) goto L492
            r13 = r0
            goto L494
        L492:
            ᲁᲀᛱᲁ r13 = defpackage.C1907.f8270
        L494:
            return r13
        L495:
            ᛴᛵ r0 = defpackage.EnumC0670.f3246
            int r1 = r4.f1652
            if (r1 == 0) goto L4a9
            if (r1 != r3) goto L4a3
            defpackage.AbstractC0762.m1680(r19)
            r13 = r19
            goto L4d1
        L4a3:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L4d1
        L4a9:
            defpackage.AbstractC0762.m1680(r19)
            java.lang.Object r1 = r4.f1653
            ᛷᲈᛳᛳ r1 = (defpackage.InterfaceC1399) r1
            ᛳᛵᲈᛵ r1 = r1.mo105()
            ᲁᲁᛷᲈ r2 = defpackage.C2283.f9639
            ᛶᲁᛳᲈ r1 = r1.mo970(r2)
            if (r1 == 0) goto L4cc
            java.lang.Object r1 = r4.f1654
            ᛳᲈᲇᛳ r1 = (defpackage.InterfaceC0598) r1
            r4.f1652 = r3
            java.lang.Object r1 = r1.mo617(r4)
            if (r1 != r0) goto L4ca
            r13 = r0
            goto L4d1
        L4ca:
            r13 = r1
            goto L4d1
        L4cc:
            java.lang.String r0 = "Expected a TransactionElement in the CoroutineContext but none was found."
            defpackage.C2264.m3676(r0)
        L4d1:
            return r13
        L4d2:
            ᛴᛵ r0 = defpackage.EnumC0670.f3246
            int r1 = r4.f1652
            if (r1 == 0) goto L4e7
            if (r1 != r3) goto L4e0
            defpackage.AbstractC0762.m1680(r19)
            r0 = r19
            goto L4fc
        L4e0:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            r0 = r13
            goto L4fc
        L4e7:
            defpackage.AbstractC0762.m1680(r19)
            java.lang.Object r1 = r4.f1653
            ᲇᛷᛳᲀ r1 = (defpackage.InterfaceC2087) r1
            java.lang.Object r2 = r4.f1654
            ᛸᲈᛱᛷ r2 = (defpackage.C1595) r2
            r4.f1652 = r3
            java.lang.Object r1 = r1.mo388(r2, r4)
            if (r1 != r0) goto L4fb
            goto L4fc
        L4fb:
            r0 = r1
        L4fc:
            return r0
        L4fd:
            ᛴᛵ r0 = defpackage.EnumC0670.f3246
            int r1 = r4.f1652
            if (r1 == 0) goto L50f
            if (r1 != r3) goto L509
            defpackage.AbstractC0762.m1680(r19)
            goto L541
        L509:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L571
        L50f:
            defpackage.AbstractC0762.m1680(r19)
            java.lang.Object r1 = r4.f1653
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            defpackage.AbstractC0425.m1195(r1)
            java.lang.Object r1 = r4.f1654
            ᲀᛵᛶᛱ r1 = (defpackage.C1675) r1
            ᛷᛱᲈᛳ r1 = r1.f7467
            r4.f1652 = r3
            ᛱᛸᛲᲀ[] r2 = defpackage.AbstractC0498.f2477
            monitor-enter(r1)
            ᛱᛸᛲᲀ[] r2 = (defpackage.InterfaceC0140[]) r2     // Catch: java.lang.Throwable -> L577
            monitor-exit(r1)
            int r1 = r2.length
        L52d:
            if (r12 >= r1) goto L53b
            r3 = r2[r12]
            if (r3 == 0) goto L538
            ᲁᲀᛱᲁ r5 = defpackage.C1907.f8270
            r3.mo662(r5)
        L538:
            int r12 = r12 + 1
            goto L52d
        L53b:
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            if (r1 != r0) goto L541
            r13 = r0
            goto L571
        L541:
            java.lang.Object r0 = r4.f1654
            ᲀᛵᛶᛱ r0 = (defpackage.C1675) r0
            ᛸᛸᛶᲈ r0 = r0.f7475
            java.util.concurrent.locks.ReentrantLock r1 = r0.f6840
            r1.lock()
            java.util.LinkedHashMap r0 = r0.f6841     // Catch: java.lang.Throwable -> L572
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L572
            java.util.List r0 = defpackage.AbstractC1107.m2113(r0)     // Catch: java.lang.Throwable -> L572
            r1.unlock()
            java.util.Iterator r0 = r0.iterator()
        L55d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L56f
            java.lang.Object r1 = r0.next()
            ᲇᲈᲇᛲ r1 = (defpackage.C2168) r1
            ᛴᛵᲇᲇ r1 = r1.f9240
            r1.getClass()
            goto L55d
        L56f:
            ᲁᲀᛱᲁ r13 = defpackage.C1907.f8270
        L571:
            return r13
        L572:
            r0 = move-exception
            r1.unlock()
            throw r0
        L577:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L57a:
            java.lang.Object r0 = r4.f1653
            ᲇᛷᛱᛷ r0 = (defpackage.C2083) r0
            ᛴᛵ r1 = defpackage.EnumC0670.f3246
            int r2 = r4.f1652
            if (r2 == 0) goto L597
            if (r2 != r3) goto L58a
            defpackage.AbstractC0762.m1680(r19)
            goto L5b4
        L58a:
            r0 = -488720318242350(0xfffe4382ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L5b6
        L597:
            defpackage.AbstractC0762.m1680(r19)
            ᛶᛸᛳ r2 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r2 = defpackage.AbstractC1497.f6594
            ᲇᛶᲁᲇ r5 = new ᲇᛶᲁᲇ
            java.lang.Object r6 = r4.f1654
            ᲁᲈᛳᲀ r6 = (defpackage.C1961) r6
            r7 = 7
            r5.<init>(r6, r0, r13, r7)
            r4.f1653 = r13
            r4.f1652 = r3
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r2, r5, r4)
            if (r0 != r1) goto L5b4
            r13 = r1
            goto L5b6
        L5b4:
            ᲁᲀᛱᲁ r13 = defpackage.C1907.f8270
        L5b6:
            return r13
        L5b7:
            r16 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            ᲁᲀᛱᲁ r6 = defpackage.C1907.f8270
            ᛴᛵ r7 = defpackage.EnumC0670.f3246
            int r0 = r4.f1652
            if (r0 == 0) goto L5dd
            if (r0 != r3) goto L5cf
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Exception -> L5cc
        L5c9:
            r13 = r6
            goto L6a2
        L5cc:
            r0 = move-exception
            goto L65d
        L5cf:
            r0 = -545160483479086(0xfffe102def0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L6a2
        L5dd:
            defpackage.AbstractC0762.m1680(r19)
            java.lang.Object r0 = r4.f1653     // Catch: java.lang.Exception -> L5cc
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = (com.ss.android.ugc.aweme.base.model.UrlModel) r0     // Catch: java.lang.Exception -> L5cc
            java.util.List r0 = r0.urlList     // Catch: java.lang.Exception -> L5cc
            r1 = -544997274721838(0xfffe1053ef0961d2, double:NaN)
            java.lang.Object r0 = defpackage.AbstractC1107.m2122(r0)     // Catch: java.lang.Exception -> L5cc
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L5cc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5cc
            r0.<init>()     // Catch: java.lang.Exception -> L5cc
            r13 = -545031634460206(0xfffe104bef0961d2, double:NaN)
            java.lang.String r2 = "url = "     // Catch: java.lang.Exception -> L5cc
            r0.append(r2)     // Catch: java.lang.Exception -> L5cc
            r0.append(r1)     // Catch: java.lang.Exception -> L5cc
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L5cc
            r13 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r13 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r2 = r0.length()     // Catch: java.lang.Exception -> L5cc
            if (r2 != 0) goto L624
            goto L645
        L624:
            int r2 = r0.length()     // Catch: java.lang.Exception -> L5cc
        L628:
            if (r12 >= r2) goto L645
            int r5 = r12 + 2000
            if (r5 <= r2) goto L62f
            r5 = r2
        L62f:
            java.lang.String r8 = r0.substring(r12, r5)     // Catch: java.lang.Exception -> L5cc
            r11 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r11 = defpackage.C0346.f1773     // Catch: java.lang.Exception -> L5cc
            r11.getClass()     // Catch: java.lang.Exception -> L5cc
            defpackage.C0346.m1040(r8)     // Catch: java.lang.Exception -> L5cc
            r12 = r5
            goto L628
        L645:
            java.lang.Object r0 = r4.f1654     // Catch: java.lang.Exception -> L5cc
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Exception -> L5cc
            r4.f1652 = r3     // Catch: java.lang.Exception -> L5cc
            ᛶᛸᛱᲀ r2 = defpackage.C1121.f5003     // Catch: java.lang.Exception -> L5cc
            r3 = 0
            r5 = 28
            r2 = 0
            java.lang.Object r0 = defpackage.C1121.m2138(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L5cc
            if (r0 != r7) goto L658
            goto L659
        L658:
            r0 = r6
        L659:
            if (r0 != r7) goto L5c9
            r13 = r7
            goto L6a2
        L65d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = -545061699231278(0xfffe1044ef0961d2, double:NaN)
            java.lang.String r2 = "decode error = "
            r1.<init>(r2)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = -545130418708014(0xfffe1034ef0961d2, double:NaN)
            java.lang.String r2 = "保存失败: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.AbstractC0209.m764(r0)
            goto L5c9
        L6a2:
            return r13
        L6a3:
            ᛴᛵ r7 = defpackage.EnumC0670.f3246
            int r0 = r4.f1652
            r8 = 4
            if (r0 == 0) goto L6d2
            if (r0 == r3) goto L6ce
            if (r0 == r11) goto L6ca
            if (r0 == r6) goto L6c4
            if (r0 != r8) goto L6b7
            defpackage.AbstractC0762.m1680(r19)
            goto L725
        L6b7:
            r0 = -97942718815790(0xffffa6ebef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L727
        L6c4:
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Exception -> L6c8
            goto L725
        L6c8:
            r0 = move-exception
            goto L712
        L6ca:
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Exception -> L6c8
            goto L700
        L6ce:
            defpackage.AbstractC0762.m1680(r19)     // Catch: java.lang.Exception -> L6c8
            goto L6e7
        L6d2:
            defpackage.AbstractC0762.m1680(r19)
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948     // Catch: java.lang.Exception -> L6c8
            ᛷᲁᛷᛵ r0 = defpackage.AbstractC1497.f6594     // Catch: java.lang.Exception -> L6c8
            ᛸᛵᛶᛴ r1 = new ᛸᛵᛶᛴ     // Catch: java.lang.Exception -> L6c8
            r1.<init>(r11, r13, r3)     // Catch: java.lang.Exception -> L6c8
            r4.f1652 = r3     // Catch: java.lang.Exception -> L6c8
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r0, r1, r4)     // Catch: java.lang.Exception -> L6c8
            if (r0 != r7) goto L6e7
            goto L723
        L6e7:
            ᛶᛸᛱᲀ r0 = defpackage.C1121.f5003     // Catch: java.lang.Exception -> L6c8
            java.lang.Object r0 = r4.f1653     // Catch: java.lang.Exception -> L6c8
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Exception -> L6c8
            java.lang.Object r1 = r4.f1654     // Catch: java.lang.Exception -> L6c8
            ᛱᛲᲈᛲ r1 = (defpackage.C0046) r1     // Catch: java.lang.Exception -> L6c8
            java.lang.String r1 = r1.f563     // Catch: java.lang.Exception -> L6c8
            r4.f1652 = r11     // Catch: java.lang.Exception -> L6c8
            r2 = 0
            r3 = 0
            r5 = 28
            java.lang.Object r0 = defpackage.C1121.m2138(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L6c8
            if (r0 != r7) goto L700
            goto L723
        L700:
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948     // Catch: java.lang.Exception -> L6c8
            ᛷᲁᛷᛵ r0 = defpackage.AbstractC1497.f6594     // Catch: java.lang.Exception -> L6c8
            ᛸᛵᛶᛴ r1 = new ᛸᛵᛶᛴ     // Catch: java.lang.Exception -> L6c8
            r1.<init>(r11, r13, r11)     // Catch: java.lang.Exception -> L6c8
            r4.f1652 = r6     // Catch: java.lang.Exception -> L6c8
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r0, r1, r4)     // Catch: java.lang.Exception -> L6c8
            if (r0 != r7) goto L725
            goto L723
        L712:
            ᛶᛸᛳ r1 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r1 = defpackage.AbstractC1497.f6594
            ᛴᛷᛷᲁ r2 = new ᛴᛷᛷᲁ
            r2.<init>(r0, r13, r12)
            r4.f1652 = r8
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r1, r2, r4)
            if (r0 != r7) goto L725
        L723:
            r13 = r7
            goto L727
        L725:
            ᲁᲀᛱᲁ r13 = defpackage.C1907.f8270
        L727:
            return r13
        L728:
            java.lang.Object r0 = r4.f1653
            com.ss.android.ugc.awemes.WardDatabase r0 = (com.ss.android.ugc.awemes.WardDatabase) r0
            ᛴᛵ r1 = defpackage.EnumC0670.f3246
            int r2 = r4.f1652
            if (r2 == 0) goto L741
            if (r2 != r3) goto L73a
            defpackage.AbstractC0762.m1680(r19)
            r0 = r19
            goto L766
        L73a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            r0 = r13
            goto L766
        L741:
            defpackage.AbstractC0762.m1680(r19)
            boolean r2 = r0.m299()
            if (r2 == 0) goto L753
            boolean r2 = r0.m302()
            if (r2 != 0) goto L751
            goto L753
        L751:
            r2 = r12
            goto L754
        L753:
            r2 = r3
        L754:
            java.lang.Object r5 = r4.f1654
            ᛳᲈᲇᛳ r5 = (defpackage.InterfaceC0598) r5
            ᛷᛴᲇᲁ r6 = new ᛷᛴᲇᲁ
            r6.<init>(r2, r0, r13, r5)
            r4.f1652 = r3
            java.lang.Object r0 = r0.m304(r12, r6, r4)
            if (r0 != r1) goto L766
            r0 = r1
        L766:
            return r0
        L767:
            ᛴᛵ r0 = defpackage.EnumC0670.f3246
            int r1 = r4.f1652
            if (r1 == 0) goto L77c
            if (r1 != r3) goto L775
            defpackage.AbstractC0762.m1680(r19)
            r0 = r19
            goto L793
        L775:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            r0 = r13
            goto L793
        L77c:
            defpackage.AbstractC0762.m1680(r19)
            java.lang.Object r1 = r4.f1653
            ᲇᛷᛳᲀ r1 = (defpackage.InterfaceC2087) r1
            java.lang.Object r2 = r4.f1654
            ᛸᛱᛴᲁ r2 = (defpackage.C1419) r2
            java.lang.Object r2 = r2.f6211
            r4.f1652 = r3
            java.lang.Object r1 = r1.mo388(r2, r4)
            if (r1 != r0) goto L792
            goto L793
        L792:
            r0 = r1
        L793:
            return r0
        L794:
            ᛴᛵ r0 = defpackage.EnumC0670.f3246
            int r1 = r4.f1652
            if (r1 == 0) goto L7a9
            if (r1 != r3) goto L7a2
            defpackage.AbstractC0762.m1680(r19)
            r0 = r19
            goto L7be
        L7a2:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            r0 = r13
            goto L7be
        L7a9:
            defpackage.AbstractC0762.m1680(r19)
            java.lang.Object r1 = r4.f1653
            ᲇᛷᛳᲀ r1 = (defpackage.InterfaceC2087) r1
            java.lang.Object r2 = r4.f1654
            ᛶᛳᛴᛶ r2 = (defpackage.C1033) r2
            r4.f1652 = r3
            java.lang.Object r1 = r1.mo388(r2, r4)
            if (r1 != r0) goto L7bd
            goto L7be
        L7bd:
            r0 = r1
        L7be:
            return r0
        L7bf:
            ᛴᛵ r0 = defpackage.EnumC0670.f3246
            int r1 = r4.f1652
            if (r1 == 0) goto L7e2
            if (r1 == r3) goto L7da
            if (r1 != r11) goto L7cd
            defpackage.AbstractC0762.m1680(r19)
            goto L836
        L7cd:
            r0 = -677058929139246(0xfffd9837ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L838
        L7da:
            java.lang.Object r1 = r4.f1653
            java.io.File r1 = (java.io.File) r1
            defpackage.AbstractC0762.m1680(r19)
            goto L821
        L7e2:
            defpackage.AbstractC0762.m1680(r19)
            ᛲᲀᛱᲁ r1 = defpackage.C0346.f1773
            ᲈᲈᲁᛶ r2 = defpackage.C2374.f10260
            r5 = -676977324760622(0xfffd984aef0961d2, double:NaN)
            java.lang.String r5 = "comment_data_"
            r6 = -677037454302766(0xfffd983cef0961d2, double:NaN)
            java.lang.String r6 = "json"
            r2.getClass()
            java.lang.String r2 = defpackage.C2374.m3891(r5, r6)
            r1.getClass()
            java.io.File r1 = defpackage.C0346.m1033(r2)
            ᛶᛸᛳ r2 = defpackage.AbstractC1572.f6948
            ᛴᛵᲁᛳ r2 = defpackage.ExecutorC0679.f3269
            ᲇᛶᲁᲇ r5 = new ᲇᛶᲁᲇ
            java.lang.Object r6 = r4.f1654
            com.ss.android.ugc.aweme.comment.model.Comment r6 = (com.ss.android.ugc.aweme.comment.model.Comment) r6
            r5.<init>(r6, r1, r13, r11)
            r4.f1653 = r1
            r4.f1652 = r3
            java.lang.Object r2 = defpackage.AbstractC0397.m1144(r2, r5, r4)
            if (r2 != r0) goto L821
            goto L834
        L821:
            ᛶᛸᛳ r2 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r2 = defpackage.AbstractC1497.f6594
            ᛲᲈᛶᛶ r3 = new ᛲᲈᛶᛶ
            r3.<init>(r1, r13, r12)
            r4.f1653 = r13
            r4.f1652 = r11
            java.lang.Object r1 = defpackage.AbstractC0397.m1144(r2, r3, r4)
            if (r1 != r0) goto L836
        L834:
            r13 = r0
            goto L838
        L836:
            ᲁᲀᛱᲁ r13 = defpackage.C1907.f8270
        L838:
            return r13
        L839:
            ᲁᲀᛱᲁ r0 = defpackage.C1907.f8270
            java.lang.Object r1 = r4.f1653
            ᛶᛱᛵᛳ r1 = (defpackage.C1006) r1
            ᛴᛵ r2 = defpackage.EnumC0670.f3246
            int r5 = r4.f1652
            if (r5 == 0) goto L85b
            if (r5 == r3) goto L857
            if (r5 != r11) goto L84a
            goto L85b
        L84a:
            r0 = -143976178294318(0xffff7d0def0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L89b
        L857:
            defpackage.AbstractC0762.m1680(r19)
            goto L87d
        L85b:
            defpackage.AbstractC0762.m1680(r19)
        L85e:
            int r5 = r1.f4472
            if (r5 <= 0) goto L89a
            ᛷᲈᲀ r5 = defpackage.AbstractC0984.f4413
            r5 = 1000(0x3e8, float:1.401E-42)
            ᛸᛸᲁᛵ r6 = defpackage.EnumC1551.f6875
            long r5 = defpackage.AbstractC0498.m1274(r5, r6)
            r4.f1652 = r3
            long r5 = defpackage.AbstractC0729.m1640(r5)
            java.lang.Object r5 = defpackage.AbstractC0729.m1644(r5, r4)
            if (r5 != r2) goto L879
            goto L87a
        L879:
            r5 = r0
        L87a:
            if (r5 != r2) goto L87d
            goto L898
        L87d:
            int r5 = r1.f4472
            int r5 = r5 + (-1)
            r1.f4472 = r5
            ᛶᛸᛳ r5 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r5 = defpackage.AbstractC1497.f6594
            ᲇᛶᲁᲇ r6 = new ᲇᛶᲁᲇ
            java.lang.Object r7 = r4.f1654
            ᲁᛷᛵ r7 = (defpackage.C1884) r7
            r6.<init>(r1, r7, r13, r3)
            r4.f1652 = r11
            java.lang.Object r5 = defpackage.AbstractC0397.m1144(r5, r6, r4)
            if (r5 != r2) goto L85e
        L898:
            r13 = r2
            goto L89b
        L89a:
            r13 = r0
        L89b:
            return r13
        L89c:
            java.lang.Object r0 = r4.f1654
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r4.f1653
            ᲀᛲᛶᲈ r1 = (defpackage.C1630) r1
            android.widget.TextView r5 = r1.f7271
            android.widget.LinearLayout r6 = r1.f7252
            ᛱᛳᛶᛱ r7 = r1.f7257
            ᛴᛵ r8 = defpackage.EnumC0670.f3246
            int r9 = r4.f1652
            if (r9 == 0) goto L8c6
            if (r9 != r3) goto L8b8
            defpackage.AbstractC0762.m1680(r19)
            r4 = r19
            goto L8dd
        L8b8:
            r0 = -116591466815022(0xffff95f5ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto La04
        L8c6:
            defpackage.AbstractC0762.m1680(r19)
            ᛶᛸᛳ r9 = defpackage.AbstractC1572.f6948
            ᛴᛵᲁᛳ r9 = defpackage.ExecutorC0679.f3269
            ᛴᲇᛶᛳ r10 = new ᛴᲇᛶᛳ
            r10.<init>(r0, r1, r13)
            r4.f1652 = r3
            java.lang.Object r4 = defpackage.AbstractC0397.m1144(r9, r10, r4)
            if (r4 != r8) goto L8dd
            r13 = r8
            goto La04
        L8dd:
            java.util.List r4 = (java.util.List) r4
            r1.f7251 = r4
            android.widget.LinearLayout r8 = r1.f7275
            if (r8 == 0) goto L8e8
            r8.setVisibility(r2)
        L8e8:
            java.io.File r8 = new java.io.File
            r8.<init>(r0)
            if (r4 == 0) goto L8f7
            boolean r9 = r4.isEmpty()
            if (r9 == 0) goto L8f7
            r10 = r12
            goto L915
        L8f7:
            java.util.Iterator r9 = r4.iterator()
            r10 = r12
        L8fc:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L915
            java.lang.Object r14 = r9.next()
            ᛵᛳᲈᲁ r14 = (defpackage.C0860) r14
            boolean r14 = r14.f3916
            if (r14 != 0) goto L8fc
            int r10 = r10 + 1
            if (r10 < 0) goto L911
            goto L8fc
        L911:
            defpackage.AbstractC0425.m1199()
            throw r13
        L915:
            if (r4 == 0) goto L91f
            boolean r9 = r4.isEmpty()
            if (r9 == 0) goto L91f
            r14 = r12
            goto L95a
        L91f:
            java.util.Iterator r9 = r4.iterator()
            r14 = r12
        L924:
            boolean r15 = r9.hasNext()
            if (r15 == 0) goto L95a
            java.lang.Object r15 = r9.next()
            ᛵᛳᲈᲁ r15 = (defpackage.C0860) r15
            r16 = r13
            boolean r13 = r15.f3916
            if (r13 == 0) goto L953
            java.io.File r13 = r15.f3915
            java.lang.String r13 = r13.getAbsolutePath()
            java.io.File r15 = r8.getParentFile()
            if (r15 == 0) goto L947
            java.lang.String r15 = r15.getAbsolutePath()
            goto L949
        L947:
            r15 = r16
        L949:
            boolean r13 = defpackage.AbstractC0498.m1280(r13, r15)
            if (r13 != 0) goto L953
            int r14 = r14 + 1
            if (r14 < 0) goto L956
        L953:
            r13 = r16
            goto L924
        L956:
            defpackage.AbstractC0425.m1199()
            throw r16
        L95a:
            boolean r8 = r4.isEmpty()
            if (r8 == 0) goto L974
            r7.setVisibility(r2)
            r6.setVisibility(r12)
            r0 = -116492682567214(0xffff960cef0961d2, double:NaN)
            java.lang.String r0 = "0个文件"
            r5.setText(r0)
            goto La02
        L974:
            r7.setVisibility(r12)
            r6.setVisibility(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            if (r14 <= 0) goto L99c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r14)
            r8 = -116514157403694(0xffff9607ef0961d2, double:NaN)
            java.lang.String r8 = "个文件夹"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r2.append(r6)
        L99c:
            if (r10 <= 0) goto L9c7
            if (r14 <= 0) goto L9ac
            r8 = -116535632240174(0xffff9602ef0961d2, double:NaN)
            java.lang.String r6 = " · "
            r2.append(r6)
        L9ac:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r10)
            r8 = -116552812109358(0xffff95feef0961d2, double:NaN)
            java.lang.String r8 = "个文件"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r2.append(r6)
        L9c7:
            if (r14 != 0) goto L9d7
            if (r10 != 0) goto L9d7
            r8 = -116569991978542(0xffff95faef0961d2, double:NaN)
            java.lang.String r6 = "0个文件"
            r2.append(r6)
        L9d7:
            java.lang.String r2 = r2.toString()
            r5.setText(r2)
            ᛷᛷᲈᲇ r2 = new ᛷᛷᲈᲇ
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            ᲇᛴᲇᛳ r4 = new ᲇᛴᲇᛳ
            r4.<init>(r1, r3)
            ᲇᛴᲇᛳ r3 = new ᲇᛴᲇᛳ
            r3.<init>(r1, r11)
            r2.<init>(r5, r0, r4, r3)
            r1.f7249 = r2
            r7.setAdapter(r2)
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r7.getContext()
            r0.<init>(r12)
            r7.setLayoutManager(r0)
        La02:
            ᲁᲀᛱᲁ r13 = defpackage.C1907.f8270
        La04:
            return r13
    }
}
