package defpackage;

/* JADX INFO: renamed from: ᛸᛶᛸᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1514 extends defpackage.AbstractC1350 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f6682;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final /* synthetic */ boolean f6683;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final /* synthetic */ com.ss.android.ugc.awemes.WardDatabase f6684;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public /* synthetic */ java.lang.Object f6685;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.InterfaceC0598 f6686;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ boolean f6687;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.EnumC0469 f6688;

    public C1514(defpackage.InterfaceC0140 r1, defpackage.InterfaceC0598 r2, com.ss.android.ugc.awemes.WardDatabase r3, boolean r4, boolean r5) {
            r0 = this;
            r0.f6687 = r4
            r0.f6683 = r5
            r0.f6684 = r3
            r0.f6686 = r2
            r2 = 2
            r0.<init>(r2, r1)
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ᛷᛸᛱ r1 = (defpackage.InterfaceC1324) r1
            ᛱᛸᛲᲀ r2 = (defpackage.InterfaceC0140) r2
            ᛱᛸᛲᲀ r0 = r0.mo389(r2, r1)
            ᛸᛶᛸᛱ r0 = (defpackage.C1514) r0
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            java.lang.Object r0 = r0.mo390(r1)
            return r0
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r7, java.lang.Object r8) {
            r6 = this;
            ᛸᛶᛸᛱ r0 = new ᛸᛶᛸᛱ
            com.ss.android.ugc.awemes.WardDatabase r3 = r6.f6684
            ᛳᲈᲇᛳ r2 = r6.f6686
            boolean r4 = r6.f6687
            boolean r5 = r6.f6683
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0.f6685 = r8
            return r0
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.f6682
            ᛳᲈᲇᛳ r1 = r12.f6686
            com.ss.android.ugc.awemes.WardDatabase r2 = r12.f6684
            boolean r3 = r12.f6683
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            ᛴᛵ r9 = defpackage.EnumC0670.f3246
            if (r0 == 0) goto L43
            if (r0 == r7) goto L39
            if (r0 == r6) goto L2f
            if (r0 == r5) goto L26
            if (r0 != r4) goto L20
            java.lang.Object r12 = r12.f6685
            defpackage.AbstractC0762.m1680(r13)
            goto Lb4
        L20:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r12)
            return r8
        L26:
            java.lang.Object r0 = r12.f6685
            ᛷᛸᛱ r0 = (defpackage.InterfaceC1324) r0
            defpackage.AbstractC0762.m1680(r13)
            goto La4
        L2f:
            ᛳᛴᲈᛶ r0 = r12.f6688
            java.lang.Object r6 = r12.f6685
            ᛷᛸᛱ r6 = (defpackage.InterfaceC1324) r6
            defpackage.AbstractC0762.m1680(r13)
            goto L89
        L39:
            ᛳᛴᲈᛶ r0 = r12.f6688
            java.lang.Object r10 = r12.f6685
            ᛷᛸᛱ r10 = (defpackage.InterfaceC1324) r10
            defpackage.AbstractC0762.m1680(r13)
            goto L67
        L43:
            defpackage.AbstractC0762.m1680(r13)
            java.lang.Object r13 = r12.f6685
            ᛷᛸᛱ r13 = (defpackage.InterfaceC1324) r13
            boolean r0 = r12.f6687
            if (r0 == 0) goto Lcd
            if (r3 == 0) goto L53
            ᛳᛴᲈᛶ r0 = defpackage.EnumC0469.f2348
            goto L55
        L53:
            ᛳᛴᲈᛶ r0 = defpackage.EnumC0469.f2347
        L55:
            if (r3 != 0) goto L8f
            r12.f6685 = r13
            r12.f6688 = r0
            r12.f6682 = r7
            java.lang.Boolean r10 = r13.mo1989(r12)
            if (r10 != r9) goto L64
            goto Lb0
        L64:
            r11 = r10
            r10 = r13
            r13 = r11
        L67:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L8c
            ᛸᛸᛶᲈ r13 = r2.f439
            if (r13 != 0) goto L74
            r13 = r8
        L74:
            r12.f6685 = r10
            r12.f6688 = r0
            r12.f6682 = r6
            ᛶᛲᛵᲀ r13 = r13.f6842
            java.lang.Object r13 = r13.m1978(r12)
            if (r13 != r9) goto L83
            goto L85
        L83:
            ᲁᲀᛱᲁ r13 = defpackage.C1907.f8270
        L85:
            if (r13 != r9) goto L88
            goto Lb0
        L88:
            r6 = r10
        L89:
            r13 = r0
            r0 = r6
            goto L92
        L8c:
            r13 = r0
            r0 = r10
            goto L92
        L8f:
            r11 = r0
            r0 = r13
            r13 = r11
        L92:
            ᛶᛳᲁᛱ r6 = new ᛶᛳᲁᛱ
            r6.<init>(r8, r1, r7)
            r12.f6685 = r0
            r12.f6688 = r8
            r12.f6682 = r5
            java.lang.Object r13 = r0.mo1990(r13, r6, r12)
            if (r13 != r9) goto La4
            goto Lb0
        La4:
            if (r3 != 0) goto Lcc
            r12.f6685 = r13
            r12.f6682 = r4
            java.lang.Boolean r12 = r0.mo1989(r12)
            if (r12 != r9) goto Lb1
        Lb0:
            return r9
        Lb1:
            r11 = r13
            r13 = r12
            r12 = r11
        Lb4:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto Lcb
            ᛸᛸᛶᲈ r13 = r2.f439
            if (r13 != 0) goto Lc1
            goto Lc2
        Lc1:
            r8 = r13
        Lc2:
            ᛶᛲᛵᲀ r13 = r8.f6842
            ᛷᛸᛵ r0 = r8.f6846
            ᛷᛸᛵ r1 = r8.f6847
            r13.m1975(r0, r1)
        Lcb:
            return r12
        Lcc:
            return r13
        Lcd:
            ᛵᛱᲁᛳ r13 = (defpackage.InterfaceC0819) r13
            ᲀᛴᛴᛶ r12 = r13.mo1748()
            java.lang.Object r12 = r1.mo617(r12)
            return r12
    }
}
