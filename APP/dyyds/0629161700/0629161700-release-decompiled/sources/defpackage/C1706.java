package defpackage;

/* JADX INFO: renamed from: ᲀᛷᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1706 extends defpackage.AbstractC2041 {

    /* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
    public boolean f7590;

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public final defpackage.ComponentCallbacks2C2190 f7591;

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public final android.content.Context f7592;

    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public defpackage.C1706 f7593;

    /* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
    public final boolean f7594;

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public final java.lang.Class f7595;

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public final defpackage.C0909 f7596;

    /* JADX INFO: renamed from: ᲁᛱᛲᲈ, reason: contains not printable characters */
    public boolean f7597;

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public defpackage.C1342 f7598;

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public defpackage.C1706 f7599;

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
    public java.util.ArrayList f7600;

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public java.lang.Object f7601;

    static {
            ᛵᲁᛷᲁ r0 = new ᛵᲁᛷᲁ
            r0.<init>()
            ᛸᛶᛵᛲ r1 = defpackage.C1506.f6656
            ᲇᛴᛸᲇ r0 = r0.m3439(r1)
            ᛵᲁᛷᲁ r0 = (defpackage.C0972) r0
            ᲇᛴᛸᲇ r0 = r0.m3434()
            ᛵᲁᛷᲁ r0 = (defpackage.C0972) r0
            ᲇᛴᛸᲇ r0 = r0.m3448()
            ᛵᲁᛷᲁ r0 = (defpackage.C0972) r0
            return
    }

    public C1706(com.bumptech.glide.ComponentCallbacks2C0007 r4, defpackage.ComponentCallbacks2C2190 r5, java.lang.Class r6, android.content.Context r7) {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.f7594 = r0
            r3.f7591 = r5
            r3.f7595 = r6
            r3.f7592 = r7
            com.bumptech.glide.ᛷᲁᛳᛳ r7 = r5.f9291
            ᛵᛶᛳᲇ r7 = r7.f352
            ᛸᛶᛱᛲ r7 = r7.f4135
            java.lang.Object r0 = r7.get(r6)
            ᛷᛸᲁᛴ r0 = (defpackage.C1342) r0
            if (r0 != 0) goto L43
            java.util.Set r7 = r7.entrySet()
            ᛳᛶᛳᛷ r7 = (defpackage.C0499) r7
            java.util.Iterator r7 = r7.iterator()
        L24:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r2 = r2.isAssignableFrom(r6)
            if (r2 == 0) goto L24
            java.lang.Object r0 = r1.getValue()
            ᛷᛸᲁᛴ r0 = (defpackage.C1342) r0
            goto L24
        L43:
            if (r0 != 0) goto L47
            ᛷᛸᲁᛴ r0 = defpackage.C0909.f4133
        L47:
            r3.f7598 = r0
            ᛵᛶᛳᲇ r4 = r4.f352
            r3.f7596 = r4
            java.util.concurrent.CopyOnWriteArrayList r4 = r5.f9286
            java.util.Iterator r4 = r4.iterator()
        L53:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L68
            java.lang.Object r6 = r4.next()
            if (r6 != 0) goto L63
            r3.m3090()
            goto L53
        L63:
            defpackage.C2264.m3679()
            r3 = 0
            throw r3
        L68:
            monitor-enter(r5)
            ᛵᲁᛷᲁ r4 = r5.f9287     // Catch: java.lang.Throwable -> L70
            monitor-exit(r5)
            r3.m3091(r4)
            return
        L70:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L70
            throw r3
    }

    @Override // defpackage.AbstractC2041
    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
            r0 = this;
            ᲀᛷᛴᲀ r0 = r0.m3095()
            return r0
    }

    @Override // defpackage.AbstractC2041
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.C1706
            if (r0 == 0) goto L56
            ᲀᛷᛴᲀ r3 = (defpackage.C1706) r3
            boolean r0 = super.equals(r3)
            if (r0 == 0) goto L56
            java.lang.Class r0 = r2.f7595
            java.lang.Class r1 = r3.f7595
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L56
            ᛷᛸᲁᛴ r0 = r2.f7598
            ᛷᛸᲁᛴ r1 = r3.f7598
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L56
            java.lang.Object r0 = r2.f7601
            java.lang.Object r1 = r3.f7601
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L56
            java.util.ArrayList r0 = r2.f7600
            java.util.ArrayList r1 = r3.f7600
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L56
            ᲀᛷᛴᲀ r0 = r2.f7599
            ᲀᛷᛴᲀ r1 = r3.f7599
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L56
            ᲀᛷᛴᲀ r0 = r2.f7593
            ᲀᛷᛴᲀ r1 = r3.f7593
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L56
            boolean r0 = r2.f7594
            boolean r1 = r3.f7594
            if (r0 != r1) goto L56
            boolean r2 = r2.f7597
            boolean r3 = r3.f7597
            if (r2 != r3) goto L56
            r2 = 1
            return r2
        L56:
            r2 = 0
            return r2
    }

    @Override // defpackage.AbstractC2041
    public final int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            java.lang.Class r1 = r2.f7595
            int r0 = defpackage.AbstractC1754.m3155(r0, r1)
            ᛷᛸᲁᛴ r1 = r2.f7598
            int r0 = defpackage.AbstractC1754.m3155(r0, r1)
            java.lang.Object r1 = r2.f7601
            int r0 = defpackage.AbstractC1754.m3155(r0, r1)
            java.util.ArrayList r1 = r2.f7600
            int r0 = defpackage.AbstractC1754.m3155(r0, r1)
            ᲀᛷᛴᲀ r1 = r2.f7599
            int r0 = defpackage.AbstractC1754.m3155(r0, r1)
            ᲀᛷᛴᲀ r1 = r2.f7593
            int r0 = defpackage.AbstractC1754.m3155(r0, r1)
            r1 = 0
            int r0 = defpackage.AbstractC1754.m3155(r0, r1)
            boolean r1 = r2.f7594
            int r0 = defpackage.AbstractC1754.m3160(r1, r0)
            boolean r2 = r2.f7597
            int r2 = defpackage.AbstractC1754.m3160(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public final defpackage.C1706 m3090() {
            r1 = this;
            boolean r0 = r1.f8801
            if (r0 == 0) goto Ld
            ᲀᛷᛴᲀ r1 = r1.m3095()
            ᲀᛷᛴᲀ r1 = r1.m3090()
            return r1
        Ld:
            r1.m3440()
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public final defpackage.C1706 m3091(defpackage.AbstractC2041 r1) {
            r0 = this;
            defpackage.C0292.m948(r1)
            ᲇᛴᛸᲇ r0 = super.mo3093(r1)
            ᲀᛷᛴᲀ r0 = (defpackage.C1706) r0
            return r0
    }

    @Override // defpackage.AbstractC2041
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ defpackage.AbstractC2041 mo3092() {
            r0 = this;
            ᲀᛷᛴᲀ r0 = r0.m3095()
            return r0
    }

    @Override // defpackage.AbstractC2041
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ defpackage.AbstractC2041 mo3093(defpackage.AbstractC2041 r1) {
            r0 = this;
            ᲀᛷᛴᲀ r0 = r0.m3091(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public final defpackage.InterfaceC2076 m3094(java.lang.Object r21, defpackage.InterfaceC0721 r22, defpackage.InterfaceC1850 r23, defpackage.C1342 r24, defpackage.EnumC1307 r25, int r26, int r27, defpackage.AbstractC2041 r28) {
            r20 = this;
            r0 = r20
            r4 = r21
            r7 = r28
            ᲀᛷᛴᲀ r1 = r0.f7593
            r2 = 0
            if (r1 == 0) goto L15
            ᛷᲁᛱ r1 = new ᛷᲁᛱ
            r3 = r23
            r1.<init>(r4, r3)
            r13 = r1
            r15 = r13
            goto L19
        L15:
            r3 = r23
            r15 = r2
            r13 = r3
        L19:
            ᲀᛷᛴᲀ r1 = r0.f7599
            if (r1 == 0) goto Lcc
            boolean r3 = r0.f7590
            if (r3 != 0) goto Lc6
            ᛷᛸᲁᛴ r3 = r1.f7598
            boolean r5 = r1.f7594
            if (r5 == 0) goto L2a
            r16 = r24
            goto L2c
        L2a:
            r16 = r3
        L2c:
            r3 = 8
            int r1 = r1.f8798
            boolean r1 = defpackage.AbstractC2041.m3432(r1, r3)
            r3 = 1
            if (r1 == 0) goto L3e
            ᲀᛷᛴᲀ r1 = r0.f7599
            ᛷᛷᛱᛴ r1 = r1.f8795
        L3b:
            r17 = r1
            goto L5d
        L3e:
            int r1 = r25.ordinal()
            if (r1 == 0) goto L5a
            if (r1 == r3) goto L5a
            r5 = 2
            if (r1 == r5) goto L57
            r5 = 3
            if (r1 != r5) goto L4f
            ᛷᛷᛱᛴ r1 = defpackage.EnumC1307.f5774
            goto L3b
        L4f:
            java.lang.String r1 = "unknown priority: "
            ᛷᛷᛱᛴ r0 = r0.f8795
            defpackage.C0086.m556(r0, r1)
            return r2
        L57:
            ᛷᛷᛱᛴ r1 = defpackage.EnumC1307.f5775
            goto L3b
        L5a:
            ᛷᛷᛱᛴ r1 = defpackage.EnumC1307.f5776
            goto L3b
        L5d:
            ᲀᛷᛴᲀ r1 = r0.f7599
            int r2 = r1.f8799
            int r1 = r1.f8792
            boolean r5 = defpackage.AbstractC1754.m3156(r26, r27)
            if (r5 == 0) goto L79
            ᲀᛷᛴᲀ r5 = r0.f7599
            int r6 = r5.f8799
            int r5 = r5.f8792
            boolean r5 = defpackage.AbstractC1754.m3156(r6, r5)
            if (r5 != 0) goto L79
            int r2 = r7.f8799
            int r1 = r7.f8792
        L79:
            r18 = r1
            r19 = r2
            ᛲᛴᲈᛷ r1 = new ᛲᛴᲈᛷ
            r1.<init>(r4, r13)
            android.content.Context r2 = r0.f7592
            r5 = r3
            ᛵᛶᛳᲇ r3 = r0.f7596
            r6 = r5
            java.lang.Object r5 = r0.f7601
            r8 = r6
            java.lang.Class r6 = r0.f7595
            java.util.ArrayList r12 = r0.f7600
            ᛵᛲᛵᛴ r14 = r3.f4140
            r24.getClass()
            r13 = r1
            ᲀᛱᲇᛶ r1 = new ᲀᛱᲇᛶ
            r11 = r22
            r10 = r25
            r9 = r27
            r23 = r15
            r15 = r8
            r8 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r10 = r1
            r0.f7590 = r15
            ᲀᛷᛴᲀ r1 = r0.f7599
            r9 = r1
            r2 = r21
            r3 = r22
            r4 = r13
            r5 = r16
            r6 = r17
            r8 = r18
            r7 = r19
            ᲇᛶᲁᛴ r1 = r1.m3094(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = 0
            r0.f7590 = r2
            r13.f1572 = r10
            r13.f1571 = r1
            r7 = r28
            goto Lef
        Lc6:
            java.lang.String r0 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            defpackage.C2264.m3676(r0)
            return r2
        Lcc:
            r23 = r15
            android.content.Context r2 = r0.f7592
            ᛵᛶᛳᲇ r3 = r0.f7596
            java.lang.Object r5 = r0.f7601
            java.lang.Class r6 = r0.f7595
            java.util.ArrayList r12 = r0.f7600
            ᛵᛲᛵᛴ r14 = r3.f4140
            r24.getClass()
            ᲀᛱᲇᛶ r1 = new ᲀᛱᲇᛶ
            r4 = r21
            r11 = r22
            r10 = r25
            r8 = r26
            r9 = r27
            r7 = r28
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r13 = r1
        Lef:
            if (r23 != 0) goto Lf2
            return r13
        Lf2:
            ᲀᛷᛴᲀ r1 = r0.f7593
            int r2 = r1.f8799
            int r1 = r1.f8792
            boolean r3 = defpackage.AbstractC1754.m3156(r26, r27)
            if (r3 == 0) goto L10e
            ᲀᛷᛴᲀ r3 = r0.f7593
            int r4 = r3.f8799
            int r3 = r3.f8792
            boolean r3 = defpackage.AbstractC1754.m3156(r4, r3)
            if (r3 != 0) goto L10e
            int r2 = r7.f8799
            int r1 = r7.f8792
        L10e:
            r7 = r1
            r6 = r2
            ᲀᛷᛴᲀ r0 = r0.f7593
            ᛷᛸᲁᛴ r4 = r0.f7598
            ᛷᛷᛱᛴ r5 = r0.f8795
            r8 = r0
            r1 = r21
            r2 = r22
            r3 = r23
            ᲇᛶᲁᛴ r0 = r0.m3094(r1, r2, r3, r4, r5, r6, r7, r8)
            r3.f5954 = r13
            r3.f5953 = r0
            return r3
    }

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public final defpackage.C1706 m3095() {
            r2 = this;
            ᲇᛴᛸᲇ r2 = super.mo3092()
            ᲀᛷᛴᲀ r2 = (defpackage.C1706) r2
            ᛷᛸᲁᛴ r0 = r2.f7598
            ᛷᛸᲁᛴ r0 = r0.m2493()
            r2.f7598 = r0
            java.util.ArrayList r0 = r2.f7600
            if (r0 == 0) goto L1b
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList r1 = r2.f7600
            r0.<init>(r1)
            r2.f7600 = r0
        L1b:
            ᲀᛷᛴᲀ r0 = r2.f7599
            if (r0 == 0) goto L25
            ᲀᛷᛴᲀ r0 = r0.m3095()
            r2.f7599 = r0
        L25:
            ᲀᛷᛴᲀ r0 = r2.f7593
            if (r0 == 0) goto L2f
            ᲀᛷᛴᲀ r0 = r0.m3095()
            r2.f7593 = r0
        L2f:
            return r2
    }

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public final defpackage.C1706 m3096(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.f8801
            if (r0 == 0) goto Ld
            ᲀᛷᛴᲀ r1 = r1.m3095()
            ᲀᛷᛴᲀ r1 = r1.m3096(r2)
            return r1
        Ld:
            r1.f7601 = r2
            r2 = 1
            r1.f7597 = r2
            r1.m3440()
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
    public final void m3097(android.widget.ImageView r5) {
            r4 = this;
            defpackage.AbstractC1754.m3158()
            defpackage.C0292.m948(r5)
            r0 = 2048(0x800, float:2.87E-42)
            int r1 = r4.f8798
            boolean r0 = defpackage.AbstractC2041.m3432(r1, r0)
            r1 = 1
            if (r0 != 0) goto L6d
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L6d
            int[] r0 = defpackage.AbstractC1574.f6949
            android.widget.ImageView$ScaleType r2 = r5.getScaleType()
            int r2 = r2.ordinal()
            r0 = r0[r2]
            switch(r0) {
                case 1: goto L5d;
                case 2: goto L4b;
                case 3: goto L39;
                case 4: goto L39;
                case 5: goto L39;
                case 6: goto L27;
                default: goto L26;
            }
        L26:
            goto L6d
        L27:
            ᲀᛷᛴᲀ r0 = r4.m3095()
            ᛳᛸᛲᛲ r2 = defpackage.C0521.f2572
            ᛵᛴᛳᛷ r3 = new ᛵᛴᛳᛷ
            r3.<init>()
            ᲇᛴᛸᲇ r0 = r0.m3435(r2, r3)
            r0.f8802 = r1
            goto L6e
        L39:
            ᲀᛷᛴᲀ r0 = r4.m3095()
            ᛳᛸᛲᛲ r2 = defpackage.C0521.f2573
            ᲈᛲᲁᲀ r3 = new ᲈᛲᲁᲀ
            r3.<init>()
            ᲇᛴᛸᲇ r0 = r0.m3435(r2, r3)
            r0.f8802 = r1
            goto L6e
        L4b:
            ᲀᛷᛴᲀ r0 = r4.m3095()
            ᛳᛸᛲᛲ r2 = defpackage.C0521.f2572
            ᛵᛴᛳᛷ r3 = new ᛵᛴᛳᛷ
            r3.<init>()
            ᲇᛴᛸᲇ r0 = r0.m3435(r2, r3)
            r0.f8802 = r1
            goto L6e
        L5d:
            ᲀᛷᛴᲀ r0 = r4.m3095()
            ᛳᛸᛲᛲ r2 = defpackage.C0521.f2571
            ᛷᛸᛱᛳ r3 = new ᛷᛸᛱᛳ
            r3.<init>()
            ᲇᛴᛸᲇ r0 = r0.m3435(r2, r3)
            goto L6e
        L6d:
            r0 = r4
        L6e:
            ᛵᛶᛳᲇ r2 = r4.f7596
            ᛸᛶᛱᛵ r2 = r2.f4137
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            java.lang.Class r3 = r4.f7595
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L83
            ᛲᲈᲇᲁ r1 = new ᛲᲈᲇᲁ
            r2 = 0
            r1.<init>(r5, r2)
            goto L91
        L83:
            java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L95
            ᛲᲈᲇᲁ r2 = new ᛲᲈᲇᲁ
            r2.<init>(r5, r1)
            r1 = r2
        L91:
            r4.m3098(r1, r0)
            return
        L95:
            java.lang.String r4 = "Unhandled class: "
            java.lang.String r5 = ", try .as*(Class).transcode(ResourceTranscoder)"
            defpackage.C0086.m559(r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public final void m3098(defpackage.InterfaceC0721 r11, defpackage.AbstractC2041 r12) {
            r10 = this;
            defpackage.C0292.m948(r11)
            boolean r0 = r10.f7597
            if (r0 == 0) goto L81
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            ᛷᛸᲁᛴ r5 = r10.f7598
            ᛷᛷᛱᛴ r6 = r12.f8795
            int r7 = r12.f8799
            int r8 = r12.f8792
            r4 = 0
            r1 = r10
            r3 = r11
            r9 = r12
            ᲇᛶᲁᛴ r10 = r1.m3094(r2, r3, r4, r5, r6, r7, r8, r9)
            ᲇᛶᲁᛴ r11 = r3.mo736()
            boolean r12 = r10.mo928(r11)
            if (r12 == 0) goto L40
            boolean r12 = r9.f8789
            if (r12 != 0) goto L31
            boolean r12 = r11.mo921()
            if (r12 == 0) goto L31
            goto L40
        L31:
            java.lang.String r10 = "Argument must not be null"
            defpackage.C0292.m944(r11, r10)
            boolean r10 = r11.isRunning()
            if (r10 != 0) goto L3f
            r11.mo927()
        L3f:
            return
        L40:
            ᲈᛲᛵᲀ r11 = r1.f7591
            r11.m3583(r3)
            r3.mo731(r10)
            ᲈᛲᛵᲀ r11 = r1.f7591
            monitor-enter(r11)
            ᛱᛱᛶᛵ r12 = r11.f9285     // Catch: java.lang.Throwable -> L7d
            java.util.Set r12 = r12.f464     // Catch: java.lang.Throwable -> L7d
            r12.add(r3)     // Catch: java.lang.Throwable -> L7d
            ᛳᲀᛴᲈ r12 = r11.f9293     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = "RequestTracker"
            java.lang.Object r1 = r12.f2669     // Catch: java.lang.Throwable -> L7d
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L7d
            r1.add(r10)     // Catch: java.lang.Throwable -> L7d
            boolean r1 = r12.f2670     // Catch: java.lang.Throwable -> L7d
            if (r1 != 0) goto L65
            r10.mo927()     // Catch: java.lang.Throwable -> L7d
            goto L7b
        L65:
            r10.clear()     // Catch: java.lang.Throwable -> L7d
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L74
            java.lang.String r1 = "Paused, delaying request"
            android.util.Log.v(r0, r1)     // Catch: java.lang.Throwable -> L7d
        L74:
            java.lang.Object r12 = r12.f2672     // Catch: java.lang.Throwable -> L7d
            java.util.HashSet r12 = (java.util.HashSet) r12     // Catch: java.lang.Throwable -> L7d
            r12.add(r10)     // Catch: java.lang.Throwable -> L7d
        L7b:
            monitor-exit(r11)
            return
        L7d:
            r0 = move-exception
            r10 = r0
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L7d
            throw r10
        L81:
            java.lang.String r10 = "You must call #load() before calling #into()"
            defpackage.C2264.m3684(r10)
            return
    }
}
