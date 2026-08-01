package defpackage;

/* JADX INFO: renamed from: ᛷᛴᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1266 extends defpackage.AbstractC1350 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f5672;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final /* synthetic */ com.ss.android.ugc.awemes.WardDatabase f5673;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.InterfaceC0598 f5674;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public /* synthetic */ java.lang.Object f5675;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ boolean f5676;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.EnumC0469 f5677;

    public C1266(boolean r1, com.ss.android.ugc.awemes.WardDatabase r2, defpackage.InterfaceC0140 r3, defpackage.InterfaceC0598 r4) {
            r0 = this;
            r0.f5676 = r1
            r0.f5673 = r2
            r0.f5674 = r4
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ᛷᛸᛱ r1 = (defpackage.InterfaceC1324) r1
            ᛱᛸᛲᲀ r2 = (defpackage.InterfaceC0140) r2
            ᛱᛸᛲᲀ r0 = r0.mo389(r2, r1)
            ᛷᛴᲇᲁ r0 = (defpackage.C1266) r0
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            java.lang.Object r0 = r0.mo390(r1)
            return r0
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r4, java.lang.Object r5) {
            r3 = this;
            ᛷᛴᲇᲁ r0 = new ᛷᛴᲇᲁ
            com.ss.android.ugc.awemes.WardDatabase r1 = r3.f5673
            ᛳᲈᲇᛳ r2 = r3.f5674
            boolean r3 = r3.f5676
            r0.<init>(r3, r1, r4, r2)
            r0.f5675 = r5
            return r0
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f5672
            ᛳᲈᲇᛳ r1 = r10.f5674
            com.ss.android.ugc.awemes.WardDatabase r2 = r10.f5673
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            ᛴᛵ r8 = defpackage.EnumC0670.f3246
            if (r0 == 0) goto L41
            if (r0 == r6) goto L37
            if (r0 == r5) goto L2d
            if (r0 == r4) goto L24
            if (r0 != r3) goto L1e
            java.lang.Object r10 = r10.f5675
            defpackage.AbstractC0762.m1680(r11)
            goto La6
        L1e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r10)
            return r7
        L24:
            java.lang.Object r0 = r10.f5675
            ᛷᛸᛱ r0 = (defpackage.InterfaceC1324) r0
            defpackage.AbstractC0762.m1680(r11)
            goto L98
        L2d:
            ᛳᛴᲈᛶ r0 = r10.f5677
            java.lang.Object r5 = r10.f5675
            ᛷᛸᛱ r5 = (defpackage.InterfaceC1324) r5
            defpackage.AbstractC0762.m1680(r11)
            goto L80
        L37:
            ᛳᛴᲈᛶ r0 = r10.f5677
            java.lang.Object r6 = r10.f5675
            ᛷᛸᛱ r6 = (defpackage.InterfaceC1324) r6
            defpackage.AbstractC0762.m1680(r11)
            goto L5e
        L41:
            defpackage.AbstractC0762.m1680(r11)
            java.lang.Object r11 = r10.f5675
            ᛷᛸᛱ r11 = (defpackage.InterfaceC1324) r11
            boolean r0 = r10.f5676
            if (r0 == 0) goto Lbe
            r10.f5675 = r11
            ᛳᛴᲈᛶ r0 = defpackage.EnumC0469.f2347
            r10.f5677 = r0
            r10.f5672 = r6
            java.lang.Boolean r6 = r11.mo1989(r10)
            if (r6 != r8) goto L5b
            goto La2
        L5b:
            r9 = r6
            r6 = r11
            r11 = r9
        L5e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L83
            ᛸᛸᛶᲈ r11 = r2.f439
            if (r11 != 0) goto L6b
            r11 = r7
        L6b:
            r10.f5675 = r6
            r10.f5677 = r0
            r10.f5672 = r5
            ᛶᛲᛵᲀ r11 = r11.f6842
            java.lang.Object r11 = r11.m1978(r10)
            if (r11 != r8) goto L7a
            goto L7c
        L7a:
            ᲁᲀᛱᲁ r11 = defpackage.C1907.f8270
        L7c:
            if (r11 != r8) goto L7f
            goto La2
        L7f:
            r5 = r6
        L80:
            r11 = r0
            r0 = r5
            goto L85
        L83:
            r11 = r0
            r0 = r6
        L85:
            ᛶᛳᲁᛱ r5 = new ᛶᛳᲁᛱ
            r6 = 0
            r5.<init>(r7, r1, r6)
            r10.f5675 = r0
            r10.f5677 = r7
            r10.f5672 = r4
            java.lang.Object r11 = r0.mo1990(r11, r5, r10)
            if (r11 != r8) goto L98
            goto La2
        L98:
            r10.f5675 = r11
            r10.f5672 = r3
            java.lang.Boolean r10 = r0.mo1989(r10)
            if (r10 != r8) goto La3
        La2:
            return r8
        La3:
            r9 = r11
            r11 = r10
            r10 = r9
        La6:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto Lbd
            ᛸᛸᛶᲈ r11 = r2.f439
            if (r11 != 0) goto Lb3
            goto Lb4
        Lb3:
            r7 = r11
        Lb4:
            ᛶᛲᛵᲀ r11 = r7.f6842
            ᛷᛸᛵ r0 = r7.f6846
            ᛷᛸᛵ r1 = r7.f6847
            r11.m1975(r0, r1)
        Lbd:
            return r10
        Lbe:
            ᛵᛱᲁᛳ r11 = (defpackage.InterfaceC0819) r11
            ᲀᛴᛴᛶ r10 = r11.mo1748()
            java.lang.Object r10 = r1.mo617(r10)
            return r10
    }
}
