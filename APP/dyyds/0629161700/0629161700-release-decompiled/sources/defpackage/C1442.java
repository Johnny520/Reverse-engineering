package defpackage;

/* JADX INFO: renamed from: ᛸᛲᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1442 extends defpackage.AbstractC1350 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public defpackage.C1023 f6330;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public int f6331;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public int f6332;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public defpackage.InterfaceC1324 f6333;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1023 f6334;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public int f6335;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public int f6336;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.EnumC1523[] f6337;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.InterfaceC1324 f6338;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.EnumC1523[] f6339;

    public C1442(defpackage.EnumC1523[] r1, defpackage.C1023 r2, defpackage.InterfaceC1324 r3, defpackage.InterfaceC0140 r4) {
            r0 = this;
            r0.f6337 = r1
            r0.f6334 = r2
            r0.f6338 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ᛵᲀᛷᛲ r1 = (defpackage.C0959) r1
            ᛱᛸᛲᲀ r2 = (defpackage.InterfaceC0140) r2
            ᛱᛸᛲᲀ r0 = r0.mo389(r2, r1)
            ᛸᛲᲀᛲ r0 = (defpackage.C1442) r0
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            java.lang.Object r0 = r0.mo390(r1)
            return r0
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r3, java.lang.Object r4) {
            r2 = this;
            ᛸᛲᲀᛲ r4 = new ᛸᛲᲀᛲ
            ᛶᛲᛵᲀ r0 = r2.f6334
            ᛷᛸᛱ r1 = r2.f6338
            ᛸᛶᲈᲀ[] r2 = r2.f6337
            r4.<init>(r2, r0, r1, r3)
            return r4
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f6335
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L21
            if (r0 == r2) goto La
            if (r0 != r1) goto L1a
        La:
            int r0 = r10.f6332
            int r3 = r10.f6331
            int r4 = r10.f6336
            ᛷᛸᛱ r5 = r10.f6333
            ᛶᛲᛵᲀ r6 = r10.f6330
            ᛸᛶᲈᲀ[] r7 = r10.f6339
            defpackage.AbstractC0762.m1680(r11)
            goto L57
        L1a:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r10)
            r10 = 0
            return r10
        L21:
            defpackage.AbstractC0762.m1680(r11)
            ᛸᛶᲈᲀ[] r11 = r10.f6337
            int r0 = r11.length
            r3 = 0
            ᛶᛲᛵᲀ r4 = r10.f6334
            ᛷᛸᛱ r5 = r10.f6338
            r7 = r11
            r11 = r3
            r6 = r4
        L2f:
            if (r3 >= r0) goto L77
            r4 = r7[r3]
            int r8 = r11 + 1
            int r4 = r4.ordinal()
            if (r4 == 0) goto L74
            ᛴᛵ r9 = defpackage.EnumC0670.f3246
            if (r4 == r2) goto L5f
            if (r4 != r1) goto L59
            r10.f6339 = r7
            r10.f6330 = r6
            r10.f6333 = r5
            r10.f6336 = r8
            r10.f6331 = r3
            r10.f6332 = r0
            r10.f6335 = r1
            java.lang.Object r11 = r6.m1973(r5, r11, r10)
            if (r11 != r9) goto L56
            goto L73
        L56:
            r4 = r8
        L57:
            r11 = r4
            goto L75
        L59:
            ᛸᛵᛳᲀ r10 = new ᛸᛵᛳᲀ
            r10.<init>()
            throw r10
        L5f:
            r10.f6339 = r7
            r10.f6330 = r6
            r10.f6333 = r5
            r10.f6336 = r8
            r10.f6331 = r3
            r10.f6332 = r0
            r10.f6335 = r2
            java.lang.Object r11 = r6.m1974(r5, r11, r10)
            if (r11 != r9) goto L56
        L73:
            return r9
        L74:
            r11 = r8
        L75:
            int r3 = r3 + r2
            goto L2f
        L77:
            ᲁᲀᛱᲁ r10 = defpackage.C1907.f8270
            return r10
    }
}
