package defpackage;

/* JADX INFO: renamed from: ᲈᛷᛸᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2291 extends defpackage.AbstractC1382 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f9697;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final /* synthetic */ int f9698;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final /* synthetic */ java.util.Iterator f9699;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public /* synthetic */ java.lang.Object f9700;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.util.Iterator f9701;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.lang.Object f9702;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f9703;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f9704;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f9705;

    public C2291(int r1, int r2, java.util.Iterator r3, defpackage.InterfaceC0140 r4) {
            r0 = this;
            r0.f9703 = r1
            r0.f9698 = r2
            r0.f9699 = r3
            r0.<init>(r4)
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ᲀᛶᛴᛲ r1 = (defpackage.C1687) r1
            ᛱᛸᛲᲀ r2 = (defpackage.InterfaceC0140) r2
            ᛱᛸᛲᲀ r0 = r0.mo389(r2, r1)
            ᲈᛷᛸᛶ r0 = (defpackage.C2291) r0
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            java.lang.Object r0 = r0.mo390(r1)
            return r0
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r4, java.lang.Object r5) {
            r3 = this;
            ᲈᛷᛸᛶ r0 = new ᲈᛷᛸᛶ
            int r1 = r3.f9698
            java.util.Iterator r2 = r3.f9699
            int r3 = r3.f9703
            r0.<init>(r3, r1, r2, r4)
            r0.f9700 = r5
            return r0
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r20) {
            r19 = this;
            r0 = r19
            java.lang.Object r1 = r0.f9700
            ᲀᛶᛴᛲ r1 = (defpackage.C1687) r1
            int r2 = r0.f9697
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            int r7 = r0.f9698
            r8 = 1
            int r9 = r0.f9703
            r10 = 0
            ᛴᛵ r11 = defpackage.EnumC0670.f3246
            if (r2 == 0) goto L6a
            if (r2 == r8) goto L56
            if (r2 == r6) goto L51
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L29
            java.lang.Object r0 = r0.f9702
            ᲈᛳᛲᲇ r0 = (defpackage.C2202) r0
        L24:
            defpackage.AbstractC0762.m1680(r20)
            goto L16a
        L29:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            return r10
        L2f:
            int r2 = r0.f9705
            int r5 = r0.f9704
            java.lang.Object r6 = r0.f9702
            ᲈᛳᛲᲇ r6 = (defpackage.C2202) r6
            defpackage.AbstractC0762.m1680(r20)
            r6.m3602(r7)
            goto L13a
        L3f:
            int r2 = r0.f9705
            int r6 = r0.f9704
            java.util.Iterator r12 = r0.f9701
            java.lang.Object r13 = r0.f9702
            ᲈᛳᛲᲇ r13 = (defpackage.C2202) r13
            defpackage.AbstractC0762.m1680(r20)
            r13.m3602(r7)
            goto Lce
        L51:
            java.lang.Object r0 = r0.f9702
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            goto L24
        L56:
            int r2 = r0.f9705
            int r3 = r0.f9704
            java.util.Iterator r4 = r0.f9701
            java.lang.Object r5 = r0.f9702
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            defpackage.AbstractC0762.m1680(r20)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r9)
            r12 = r2
            goto L82
        L6a:
            defpackage.AbstractC0762.m1680(r20)
            r2 = 1024(0x400, float:1.435E-42)
            if (r9 <= r2) goto L72
            goto L73
        L72:
            r2 = r9
        L73:
            int r12 = r7 - r9
            java.util.Iterator r13 = r0.f9699
            r14 = 0
            if (r12 < 0) goto Lc0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
            r3 = r2
            r4 = r13
            r2 = r14
        L82:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto Laa
            java.lang.Object r7 = r4.next()
            if (r2 <= 0) goto L91
            int r2 = r2 + (-1)
            goto L82
        L91:
            r5.add(r7)
            int r7 = r5.size()
            if (r7 != r9) goto L82
            r0.f9700 = r1
            r0.f9702 = r5
            r0.f9701 = r4
            r0.f9704 = r3
            r0.f9705 = r12
            r0.f9697 = r8
            r1.m3071(r5, r0)
            return r11
        Laa:
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L16a
            r0.f9700 = r10
            r0.f9702 = r10
            r0.f9701 = r10
            r0.f9704 = r3
            r0.f9705 = r12
            r0.f9697 = r6
            r1.m3071(r5, r0)
            return r11
        Lc0:
            ᲈᛳᛲᲇ r6 = new ᲈᛳᛲᲇ
            java.lang.Object[] r15 = new java.lang.Object[r2]
            r6.<init>(r14, r15)
            r18 = r6
            r6 = r2
            r2 = r12
            r12 = r13
            r13 = r18
        Lce:
            int r14 = r13.f9381
            java.lang.Object[] r15 = r13.f9382
            boolean r16 = r12.hasNext()
            if (r16 == 0) goto L138
            java.lang.Object r16 = r12.next()
            r17 = r8
            int r8 = r13.mo395()
            if (r8 == r14) goto L132
            int r8 = r13.f9380
            int r3 = r13.f9383
            int r8 = r8 + r3
            int r8 = r8 % r14
            r15[r8] = r16
            int r3 = r3 + 1
            r13.f9383 = r3
            int r3 = r13.mo395()
            if (r3 != r14) goto L119
            int r3 = r13.f9383
            if (r3 >= r9) goto L11d
            int r3 = r14 >> 1
            int r14 = r14 + r3
            int r14 = r14 + 1
            if (r14 <= r9) goto L102
            r14 = r9
        L102:
            int r3 = r13.f9380
            if (r3 != 0) goto L10b
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r15, r14)
            goto L111
        L10b:
            java.lang.Object[] r3 = new java.lang.Object[r14]
            java.lang.Object[] r3 = r13.toArray(r3)
        L111:
            ᲈᛳᛲᲇ r8 = new ᲈᛳᛲᲇ
            int r13 = r13.f9383
            r8.<init>(r13, r3)
            r13 = r8
        L119:
            r8 = r17
            r3 = 5
            goto Lce
        L11d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r13)
            r0.f9700 = r1
            r0.f9702 = r13
            r0.f9701 = r12
            r0.f9704 = r6
            r0.f9705 = r2
            r0.f9697 = r5
            r1.m3071(r3, r0)
            return r11
        L132:
            java.lang.String r0 = "ring buffer is full"
            defpackage.C2264.m3676(r0)
            return r10
        L138:
            r5 = r6
            r6 = r13
        L13a:
            int r3 = r6.f9383
            if (r3 <= r7) goto L153
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r6)
            r0.f9700 = r1
            r0.f9702 = r6
            r0.f9701 = r10
            r0.f9704 = r5
            r0.f9705 = r2
            r0.f9697 = r4
            r1.m3071(r3, r0)
            return r11
        L153:
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L16a
            r0.f9700 = r10
            r0.f9702 = r10
            r0.f9701 = r10
            r0.f9704 = r5
            r0.f9705 = r2
            r2 = 5
            r0.f9697 = r2
            r1.m3071(r6, r0)
            return r11
        L16a:
            ᲁᲀᛱᲁ r0 = defpackage.C1907.f8270
            return r0
    }
}
