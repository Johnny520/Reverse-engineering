package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends defpackage.AbstractC1270 implements defpackage.InterfaceC2256 {

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public boolean f301;

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public final boolean f302;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public boolean f303;

    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public final defpackage.C0903 f304;

    /* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
    public final int f305;

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public boolean f306;

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public final boolean f307;

    /* JADX INFO: renamed from: ᲁᛱᛲᲈ, reason: contains not printable characters */
    public final int[] f308;

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public int f309;

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public final defpackage.C0137 f310;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public defpackage.C0361 f311;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public defpackage.AbstractC2126 f312;

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
    public defpackage.C1602 f313;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public int f314;

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public int f315;

    public LinearLayoutManager(int r4) {
            r3 = this;
            r3.<init>()
            r4 = 1
            r3.f314 = r4
            r0 = 0
            r3.f302 = r0
            r3.f301 = r0
            r3.f306 = r0
            r3.f307 = r4
            r1 = -1
            r3.f309 = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.f315 = r1
            r1 = 0
            r3.f313 = r1
            ᛱᛸᛱ r2 = new ᛱᛸᛱ
            r2.<init>()
            r3.f310 = r2
            ᛵᛵᲈᛸ r2 = new ᛵᛵᲈᛸ
            r2.<init>()
            r3.f304 = r2
            r2 = 2
            r3.f305 = r2
            int[] r2 = new int[r2]
            r3.f308 = r2
            r3.m192(r4)
            r3.mo177(r1)
            boolean r4 = r3.f302
            if (r4 != 0) goto L39
            return
        L39:
            r3.f302 = r0
            r3.m2383()
            return
    }

    public LinearLayoutManager(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f314 = r0
            r1 = 0
            r2.f302 = r1
            r2.f301 = r1
            r2.f306 = r1
            r2.f307 = r0
            r0 = -1
            r2.f309 = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.f315 = r0
            r0 = 0
            r2.f313 = r0
            ᛱᛸᛱ r1 = new ᛱᛸᛱ
            r1.<init>()
            r2.f310 = r1
            ᛵᛵᲈᛸ r1 = new ᛵᛵᲈᛸ
            r1.<init>()
            r2.f304 = r1
            r1 = 2
            r2.f305 = r1
            int[] r1 = new int[r1]
            r2.f308 = r1
            ᲁᲀᛱᛸ r3 = defpackage.AbstractC1270.m2369(r3, r4, r5, r6)
            int r4 = r3.f8268
            r2.m192(r4)
            boolean r4 = r3.f8267
            r2.mo177(r0)
            boolean r5 = r2.f302
            if (r4 != r5) goto L41
            goto L46
        L41:
            r2.f302 = r4
            r2.m2383()
        L46:
            boolean r3 = r3.f8266
            r2.mo114(r3)
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛸᛵ, reason: contains not printable characters */
    public final void m156(int r3, int r4) {
            r2 = this;
            ᛲᲁᛷᲁ r0 = r2.f311
            ᲇᲁᛱᛱ r1 = r2.f312
            int r1 = r1.mo1933()
            int r1 = r1 - r4
            r0.f1861 = r1
            ᛲᲁᛷᲁ r0 = r2.f311
            boolean r2 = r2.f301
            r1 = 1
            if (r2 == 0) goto L14
            r2 = -1
            goto L15
        L14:
            r2 = r1
        L15:
            r0.f1859 = r2
            r0.f1860 = r3
            r0.f1865 = r1
            r0.f1864 = r4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.f1866 = r2
            return
    }

    /* JADX INFO: renamed from: ᛱᛲᛴᲇ, reason: contains not printable characters */
    public final android.view.View m157(int r4, int r5) {
            r3 = this;
            r3.m166()
            if (r5 <= r4) goto L6
            goto L8
        L6:
            if (r5 >= r4) goto L35
        L8:
            ᲇᲁᛱᛱ r0 = r3.f312
            android.view.View r1 = r3.m2382(r4)
            int r0 = r0.mo1943(r1)
            ᲇᲁᛱᛱ r1 = r3.f312
            int r1 = r1.mo1936()
            if (r0 >= r1) goto L1f
            r0 = 16644(0x4104, float:2.3323E-41)
            r1 = 16388(0x4004, float:2.2964E-41)
            goto L23
        L1f:
            r0 = 4161(0x1041, float:5.831E-42)
            r1 = 4097(0x1001, float:5.741E-42)
        L23:
            int r2 = r3.f314
            if (r2 != 0) goto L2e
            ᲁᛷᛵ r3 = r3.f5687
            android.view.View r3 = r3.m3310(r4, r5, r0, r1)
            return r3
        L2e:
            ᲁᛷᛵ r3 = r3.f5686
            android.view.View r3 = r3.m3310(r4, r5, r0, r1)
            return r3
        L35:
            android.view.View r3 = r3.m2382(r4)
            return r3
    }

    /* JADX INFO: renamed from: ᛱᛲᛶᲈ, reason: contains not printable characters */
    public final int m158(defpackage.C1633 r8, defpackage.C0361 r9, defpackage.C1000 r10, boolean r11) {
            r7 = this;
            int r0 = r9.f1861
            int r1 = r9.f1866
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L10
            if (r0 >= 0) goto Ld
            int r1 = r1 + r0
            r9.f1866 = r1
        Ld:
            r7.m176(r8, r9)
        L10:
            int r1 = r9.f1861
            int r3 = r9.f1855
            int r1 = r1 + r3
        L15:
            boolean r3 = r9.f1857
            if (r3 != 0) goto L1b
            if (r1 <= 0) goto L6b
        L1b:
            int r3 = r9.f1860
            if (r3 < 0) goto L6b
            int r4 = r10.m1957()
            if (r3 >= r4) goto L6b
            ᛵᛵᲈᛸ r3 = r7.f304
            r4 = 0
            r3.f4110 = r4
            r3.f4111 = r4
            r3.f4109 = r4
            r3.f4108 = r4
            r7.mo154(r8, r10, r9, r3)
            boolean r4 = r3.f4111
            if (r4 == 0) goto L38
            goto L6b
        L38:
            int r4 = r9.f1864
            int r5 = r3.f4110
            int r6 = r9.f1865
            int r6 = r6 * r5
            int r6 = r6 + r4
            r9.f1864 = r6
            boolean r4 = r3.f4109
            if (r4 == 0) goto L4e
            java.util.List r4 = r9.f1856
            if (r4 != 0) goto L4e
            boolean r4 = r10.f4458
            if (r4 != 0) goto L54
        L4e:
            int r4 = r9.f1861
            int r4 = r4 - r5
            r9.f1861 = r4
            int r1 = r1 - r5
        L54:
            int r4 = r9.f1866
            if (r4 == r2) goto L65
            int r4 = r4 + r5
            r9.f1866 = r4
            int r5 = r9.f1861
            if (r5 >= 0) goto L62
            int r4 = r4 + r5
            r9.f1866 = r4
        L62:
            r7.m176(r8, r9)
        L65:
            if (r11 == 0) goto L15
            boolean r3 = r3.f4108
            if (r3 == 0) goto L15
        L6b:
            int r7 = r9.f1861
            int r0 = r0 - r7
            return r0
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final void mo159(int r2, int r3, defpackage.C1000 r4, defpackage.C0128 r5) {
            r1 = this;
            int r0 = r1.f314
            if (r0 != 0) goto L5
            goto L6
        L5:
            r2 = r3
        L6:
            int r3 = r1.m2393()
            if (r3 == 0) goto L24
            if (r2 != 0) goto Lf
            goto L24
        Lf:
            r1.m166()
            r3 = 1
            if (r2 <= 0) goto L17
            r0 = r3
            goto L18
        L17:
            r0 = -1
        L18:
            int r2 = java.lang.Math.abs(r2)
            r1.m180(r0, r2, r3, r4)
            ᛲᲁᛷᲁ r2 = r1.f311
            r1.mo129(r4, r2, r5)
        L24:
            return
    }

    /* JADX INFO: renamed from: ᛱᲀᛲᛱ */
    public void mo114(boolean r2) {
            r1 = this;
            r0 = 0
            r1.mo177(r0)
            boolean r0 = r1.f306
            if (r0 != r2) goto L9
            return
        L9:
            r1.f306 = r2
            r1.m2383()
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public int mo115(defpackage.C1000 r1) {
            r0 = this;
            int r0 = r0.m189(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛲᲀᛸ, reason: contains not printable characters */
    public final void m160(defpackage.C1633 r2, int r3, int r4) {
            r1 = this;
            if (r3 != r4) goto L3
            goto L25
        L3:
            if (r4 <= r3) goto L16
            int r4 = r4 + (-1)
        L7:
            if (r4 < r3) goto L25
            android.view.View r0 = r1.m2382(r4)
            r1.m2379(r4)
            r2.m2999(r0)
            int r4 = r4 + (-1)
            goto L7
        L16:
            if (r3 <= r4) goto L25
            android.view.View r0 = r1.m2382(r3)
            r1.m2379(r3)
            r2.m2999(r0)
            int r3 = r3 + (-1)
            goto L16
        L25:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public int mo116(defpackage.C1000 r1) {
            r0 = this;
            int r0 = r0.m187(r1)
            return r0
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void mo161(int r6, defpackage.C0128 r7) {
            r5 = this;
            ᛸᲈᛵᛶ r0 = r5.f313
            r1 = -1
            r2 = 0
            if (r0 == 0) goto Ld
            int r3 = r0.f7091
            if (r3 < 0) goto Ld
            boolean r0 = r0.f7089
            goto L1c
        Ld:
            r5.m194()
            boolean r0 = r5.f301
            int r3 = r5.f309
            if (r3 != r1) goto L1c
            if (r0 == 0) goto L1b
            int r3 = r6 + (-1)
            goto L1c
        L1b:
            r3 = r2
        L1c:
            if (r0 == 0) goto L1f
            goto L20
        L1f:
            r1 = 1
        L20:
            r0 = r2
        L21:
            int r4 = r5.f305
            if (r0 >= r4) goto L30
            if (r3 < 0) goto L30
            if (r3 >= r6) goto L30
            r7.m642(r3, r2)
            int r3 = r3 + r1
            int r0 = r0 + 1
            goto L21
        L30:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛲᲈᛸᛲ, reason: contains not printable characters */
    public final void mo162(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.C1602
            if (r0 == 0) goto L12
            ᛸᲈᛵᛶ r3 = (defpackage.C1602) r3
            r2.f313 = r3
            int r0 = r2.f309
            r1 = -1
            if (r0 == r1) goto Lf
            r3.f7091 = r1
        Lf:
            r2.m2383()
        L12:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛳᛳᛵᛲ */
    public int mo119(int r3, defpackage.C1633 r4, defpackage.C1000 r5) {
            r2 = this;
            int r0 = r2.f314
            r1 = 1
            if (r0 != r1) goto L7
            r2 = 0
            return r2
        L7:
            int r2 = r2.m184(r3, r4, r5)
            return r2
    }

    /* JADX INFO: renamed from: ᛳᛴᲈᲁ, reason: contains not printable characters */
    public final android.view.View m163(int r3, int r4, boolean r5) {
            r2 = this;
            r2.m166()
            r0 = 320(0x140, float:4.48E-43)
            if (r5 == 0) goto La
            r5 = 24579(0x6003, float:3.4443E-41)
            goto Lb
        La:
            r5 = r0
        Lb:
            int r1 = r2.f314
            if (r1 != 0) goto L16
            ᲁᛷᛵ r2 = r2.f5687
            android.view.View r2 = r2.m3310(r3, r4, r5, r0)
            return r2
        L16:
            ᲁᛷᛵ r2 = r2.f5686
            android.view.View r2 = r2.m3310(r3, r4, r5, r0)
            return r2
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛳᛸᛱᲇ, reason: contains not printable characters */
    public final boolean mo164() {
            r0 = this;
            boolean r0 = r0.f302
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲈᲇᛷ, reason: contains not printable characters */
    public final android.view.View m165(boolean r3) {
            r2 = this;
            boolean r0 = r2.f301
            if (r0 == 0) goto L10
            int r0 = r2.m2393()
            int r0 = r0 + (-1)
            r1 = -1
            android.view.View r2 = r2.m163(r0, r1, r3)
            return r2
        L10:
            r0 = 0
            int r1 = r2.m2393()
            android.view.View r2 = r2.m163(r0, r1, r3)
            return r2
    }

    /* JADX INFO: renamed from: ᛴᛲᛷᲁ, reason: contains not printable characters */
    public final void m166() {
            r2 = this;
            ᛲᲁᛷᲁ r0 = r2.f311
            if (r0 != 0) goto L16
            ᛲᲁᛷᲁ r0 = new ᛲᲁᛷᲁ
            r0.<init>()
            r1 = 1
            r0.f1862 = r1
            r1 = 0
            r0.f1855 = r1
            r0.f1858 = r1
            r1 = 0
            r0.f1856 = r1
            r2.f311 = r0
        L16:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛴᛵᛸᛴ, reason: contains not printable characters */
    public final void mo167(defpackage.C0055 r2, int r3) {
            r1 = this;
            ᛱᛶᛲ r0 = new ᛱᛶᛲ
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2)
            r0.f948 = r3
            r1.m2390(r0)
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛴᛶᛸᲈ */
    public void mo123(defpackage.C1633 r1, defpackage.C1000 r2, defpackage.C2060 r3) {
            r0 = this;
            super.mo123(r1, r2, r3)
            ᛱᛳᛶᛱ r0 = r0.f5691
            ᛶᲈᲀᲇ r0 = r0.f633
            if (r0 == 0) goto L14
            int r0 = r0.getItemCount()
            if (r0 <= 0) goto L14
            ᛳᛳᛳᲈ r0 = defpackage.C0436.f2138
            r3.m3460(r0)
        L14:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛴᛸᲀ */
    public int mo124(defpackage.C1000 r1) {
            r0 = this;
            int r0 = r0.m187(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛴᛸᲈᛷ */
    public void mo125(defpackage.C1633 r1, defpackage.C1000 r2, defpackage.C0137 r3, int r4) {
            r0 = this;
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛴᲁᲇᛲ, reason: contains not printable characters */
    public final void mo168(int r2) {
            r1 = this;
            r1.f309 = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.f315 = r2
            ᛸᲈᛵᛶ r2 = r1.f313
            if (r2 == 0) goto Ld
            r0 = -1
            r2.f7091 = r0
        Ld:
            r1.m2383()
            return
    }

    /* JADX INFO: renamed from: ᛴᲈᲀᲇ, reason: contains not printable characters */
    public final boolean m169() {
            r1 = this;
            ᛱᛳᛶᛱ r1 = r1.f5691
            int r1 = r1.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto La
            return r0
        La:
            r1 = 0
            return r1
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final boolean mo170() {
            r1 = this;
            int r1 = r1.f314
            r0 = 1
            if (r1 != r0) goto L6
            return r0
        L6:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛵᛴᛴᛳ */
    public void mo129(defpackage.C1000 r1, defpackage.C0361 r2, defpackage.C0128 r3) {
            r0 = this;
            int r0 = r2.f1860
            if (r0 < 0) goto L14
            int r1 = r1.m1957()
            if (r0 >= r1) goto L14
            r1 = 0
            int r2 = r2.f1866
            int r1 = java.lang.Math.max(r1, r2)
            r3.m642(r0, r1)
        L14:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛵᛵᲀᛲ */
    public android.view.View mo130(android.view.View r3, int r4, defpackage.C1633 r5, defpackage.C1000 r6) {
            r2 = this;
            r2.m194()
            int r3 = r2.m2393()
            if (r3 != 0) goto La
            goto L71
        La:
            int r3 = r2.m195(r4)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r4) goto L13
            goto L71
        L13:
            r2.m166()
            ᲇᲁᛱᛱ r0 = r2.f312
            int r0 = r0.mo1939()
            float r0 = (float) r0
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r0 = r0 * r1
            int r0 = (int) r0
            r1 = 0
            r2.m180(r3, r0, r1, r6)
            ᛲᲁᛷᲁ r0 = r2.f311
            r0.f1866 = r4
            r0.f1862 = r1
            r4 = 1
            r2.m158(r5, r0, r6, r4)
            boolean r5 = r2.f301
            r6 = -1
            if (r3 != r6) goto L4a
            if (r5 == 0) goto L41
            int r5 = r2.m2393()
            int r5 = r5 - r4
            android.view.View r4 = r2.m157(r5, r6)
            goto L5e
        L41:
            int r4 = r2.m2393()
            android.view.View r4 = r2.m157(r1, r4)
            goto L5e
        L4a:
            if (r5 == 0) goto L55
            int r4 = r2.m2393()
            android.view.View r4 = r2.m157(r1, r4)
            goto L5e
        L55:
            int r5 = r2.m2393()
            int r5 = r5 - r4
            android.view.View r4 = r2.m157(r5, r6)
        L5e:
            if (r3 != r6) goto L65
            android.view.View r2 = r2.m196()
            goto L69
        L65:
            android.view.View r2 = r2.m182()
        L69:
            boolean r3 = r2.hasFocusable()
            if (r3 == 0) goto L73
            if (r4 != 0) goto L72
        L71:
            r2 = 0
        L72:
            return r2
        L73:
            return r4
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛵᲀᛸᲈ */
    public boolean mo131(int r4, android.os.Bundle r5) {
            r3 = this;
            boolean r0 = super.mo131(r4, r5)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 16908343(0x1020037, float:2.3877383E-38)
            r2 = 0
            if (r4 != r0) goto L4c
            if (r5 == 0) goto L4c
            int r4 = r3.f314
            r0 = -1
            if (r4 != r1) goto L2e
            java.lang.String r4 = "android.view.accessibility.action.ARGUMENT_ROW_INT"
            int r4 = r5.getInt(r4, r0)
            if (r4 >= 0) goto L1e
            return r2
        L1e:
            ᛱᛳᛶᛱ r5 = r3.f5691
            ᲀᛲᲁᛳ r0 = r5.f637
            ᛵᲈᲁᲀ r5 = r5.f623
            int r5 = r3.mo138(r0, r5)
            int r5 = r5 - r1
            int r4 = java.lang.Math.min(r4, r5)
            goto L46
        L2e:
            java.lang.String r4 = "android.view.accessibility.action.ARGUMENT_COLUMN_INT"
            int r4 = r5.getInt(r4, r0)
            if (r4 >= 0) goto L37
            return r2
        L37:
            ᛱᛳᛶᛱ r5 = r3.f5691
            ᲀᛲᲁᛳ r0 = r5.f637
            ᛵᲈᲁᲀ r5 = r5.f623
            int r5 = r3.mo149(r0, r5)
            int r5 = r5 - r1
            int r4 = java.lang.Math.min(r4, r5)
        L46:
            if (r4 < 0) goto L4c
            r3.m190(r4, r2)
            return r1
        L4c:
            return r2
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final int mo171(defpackage.C1000 r1) {
            r0 = this;
            int r0 = r0.m197(r1)
            return r0
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛷᛲᛶᲀ */
    public void mo137(defpackage.C1633 r18, defpackage.C1000 r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            ᛸᲈᛵᛶ r3 = r0.f313
            r4 = -1
            if (r3 != 0) goto Lf
            int r3 = r0.f309
            if (r3 == r4) goto L19
        Lf:
            int r3 = r2.m1957()
            if (r3 != 0) goto L19
            r17.m2398(r18)
            return
        L19:
            ᛸᲈᛵᛶ r3 = r0.f313
            if (r3 == 0) goto L23
            int r3 = r3.f7091
            if (r3 < 0) goto L23
            r0.f309 = r3
        L23:
            r0.m166()
            ᛲᲁᛷᲁ r3 = r0.f311
            r5 = 0
            r3.f1862 = r5
            r0.m194()
            ᛱᛳᛶᛱ r3 = r0.f5691
            if (r3 != 0) goto L33
            goto L45
        L33:
            android.view.View r3 = r3.getFocusedChild()
            if (r3 == 0) goto L45
            ᲈᛷᲀᲀ r7 = r0.f5688
            java.lang.Object r7 = r7.f9714
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            boolean r7 = r7.contains(r3)
            if (r7 == 0) goto L46
        L45:
            r3 = 0
        L46:
            ᛱᛸᛱ r7 = r0.f310
            boolean r8 = r7.f1080
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 1
            if (r8 == 0) goto L7f
            int r8 = r0.f309
            if (r8 != r4) goto L7f
            ᛸᲈᛵᛶ r8 = r0.f313
            if (r8 == 0) goto L58
            goto L7f
        L58:
            if (r3 == 0) goto L258
            ᲇᲁᛱᛱ r8 = r0.f312
            int r8 = r8.mo1943(r3)
            ᲇᲁᛱᛱ r11 = r0.f312
            int r11 = r11.mo1933()
            if (r8 >= r11) goto L76
            ᲇᲁᛱᛱ r8 = r0.f312
            int r8 = r8.mo1937(r3)
            ᲇᲁᛱᛱ r11 = r0.f312
            int r11 = r11.mo1936()
            if (r8 > r11) goto L258
        L76:
            int r8 = defpackage.AbstractC1270.m2371(r3)
            r7.m657(r3, r8)
            goto L258
        L7f:
            r7.m655()
            boolean r3 = r0.f301
            boolean r8 = r0.f306
            r3 = r3 ^ r8
            r7.f1081 = r3
            boolean r3 = r2.f4458
            if (r3 != 0) goto L184
            int r3 = r0.f309
            if (r3 != r4) goto L93
            goto L184
        L93:
            if (r3 < 0) goto L180
            int r8 = r2.m1957()
            if (r3 < r8) goto L9d
            goto L180
        L9d:
            int r3 = r0.f309
            r7.f1084 = r3
            ᛸᲈᛵᛶ r8 = r0.f313
            if (r8 == 0) goto Lcb
            int r11 = r8.f7091
            if (r11 < 0) goto Lcb
            boolean r3 = r8.f7089
            r7.f1081 = r3
            ᲇᲁᛱᛱ r8 = r0.f312
            if (r3 == 0) goto Lbe
            int r3 = r8.mo1933()
            ᛸᲈᛵᛶ r8 = r0.f313
            int r8 = r8.f7090
            int r3 = r3 - r8
            r7.f1082 = r3
            goto L256
        Lbe:
            int r3 = r8.mo1936()
            ᛸᲈᛵᛶ r8 = r0.f313
            int r8 = r8.f7090
            int r3 = r3 + r8
            r7.f1082 = r3
            goto L256
        Lcb:
            int r8 = r0.f315
            if (r8 != r9) goto L162
            android.view.View r3 = r0.mo191(r3)
            if (r3 == 0) goto L13f
            ᲇᲁᛱᛱ r8 = r0.f312
            int r8 = r8.mo1935(r3)
            ᲇᲁᛱᛱ r11 = r0.f312
            int r11 = r11.mo1939()
            if (r8 <= r11) goto Le8
            r7.m656()
            goto L256
        Le8:
            ᲇᲁᛱᛱ r8 = r0.f312
            int r8 = r8.mo1943(r3)
            ᲇᲁᛱᛱ r11 = r0.f312
            int r11 = r11.mo1936()
            int r8 = r8 - r11
            ᲇᲁᛱᛱ r11 = r0.f312
            if (r8 >= 0) goto L103
            int r3 = r11.mo1936()
            r7.f1082 = r3
            r7.f1081 = r5
            goto L256
        L103:
            int r8 = r11.mo1933()
            ᲇᲁᛱᛱ r11 = r0.f312
            int r11 = r11.mo1937(r3)
            int r8 = r8 - r11
            if (r8 >= 0) goto L11c
            ᲇᲁᛱᛱ r3 = r0.f312
            int r3 = r3.mo1933()
            r7.f1082 = r3
            r7.f1081 = r10
            goto L256
        L11c:
            boolean r8 = r7.f1081
            ᲇᲁᛱᛱ r11 = r0.f312
            if (r8 == 0) goto L137
            int r3 = r11.mo1937(r3)
            ᲇᲁᛱᛱ r8 = r0.f312
            int r11 = r8.f9096
            if (r9 != r11) goto L12e
            r11 = r5
            goto L135
        L12e:
            int r11 = r8.mo1939()
            int r8 = r8.f9096
            int r11 = r11 - r8
        L135:
            int r11 = r11 + r3
            goto L13b
        L137:
            int r11 = r11.mo1943(r3)
        L13b:
            r7.f1082 = r11
            goto L256
        L13f:
            int r3 = r0.m2393()
            if (r3 <= 0) goto L15d
            android.view.View r3 = r0.m2382(r5)
            int r3 = defpackage.AbstractC1270.m2371(r3)
            int r8 = r0.f309
            if (r8 >= r3) goto L153
            r3 = r10
            goto L154
        L153:
            r3 = r5
        L154:
            boolean r8 = r0.f301
            if (r3 != r8) goto L15a
            r3 = r10
            goto L15b
        L15a:
            r3 = r5
        L15b:
            r7.f1081 = r3
        L15d:
            r7.m656()
            goto L256
        L162:
            boolean r3 = r0.f301
            r7.f1081 = r3
            ᲇᲁᛱᛱ r8 = r0.f312
            if (r3 == 0) goto L175
            int r3 = r8.mo1933()
            int r8 = r0.f315
            int r3 = r3 - r8
            r7.f1082 = r3
            goto L256
        L175:
            int r3 = r8.mo1936()
            int r8 = r0.f315
            int r3 = r3 + r8
            r7.f1082 = r3
            goto L256
        L180:
            r0.f309 = r4
            r0.f315 = r9
        L184:
            int r3 = r0.m2393()
            if (r3 != 0) goto L18c
            goto L246
        L18c:
            ᛱᛳᛶᛱ r3 = r0.f5691
            if (r3 != 0) goto L191
            goto L1a3
        L191:
            android.view.View r3 = r3.getFocusedChild()
            if (r3 == 0) goto L1a3
            ᲈᛷᲀᲀ r8 = r0.f5688
            java.lang.Object r8 = r8.f9714
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            boolean r8 = r8.contains(r3)
            if (r8 == 0) goto L1a4
        L1a3:
            r3 = 0
        L1a4:
            if (r3 == 0) goto L1d1
            android.view.ViewGroup$LayoutParams r8 = r3.getLayoutParams()
            ᛵᛲᲁᛴ r8 = (defpackage.C0840) r8
            ᲈᛸᲈᛷ r11 = r8.f3863
            boolean r11 = r11.m3785()
            if (r11 != 0) goto L1d1
            ᲈᛸᲈᛷ r11 = r8.f3863
            int r11 = r11.m3782()
            if (r11 < 0) goto L1d1
            ᲈᛸᲈᛷ r8 = r8.f3863
            int r8 = r8.m3782()
            int r11 = r2.m1957()
            if (r8 >= r11) goto L1d1
            int r8 = defpackage.AbstractC1270.m2371(r3)
            r7.m657(r3, r8)
            goto L256
        L1d1:
            boolean r3 = r0.f303
            boolean r8 = r0.f306
            if (r3 == r8) goto L1d9
            goto L246
        L1d9:
            boolean r3 = r7.f1081
            android.view.View r3 = r0.mo142(r1, r2, r3, r8)
            if (r3 == 0) goto L246
            int r8 = defpackage.AbstractC1270.m2371(r3)
            boolean r11 = r7.f1081
            ᲇᲁᛱᛱ r12 = r7.f1083
            if (r11 == 0) goto L202
            int r11 = r12.mo1937(r3)
            ᲇᲁᛱᛱ r12 = r7.f1083
            int r13 = r12.f9096
            if (r9 != r13) goto L1f7
            r13 = r5
            goto L1fe
        L1f7:
            int r13 = r12.mo1939()
            int r12 = r12.f9096
            int r13 = r13 - r12
        L1fe:
            int r13 = r13 + r11
            r7.f1082 = r13
            goto L208
        L202:
            int r11 = r12.mo1943(r3)
            r7.f1082 = r11
        L208:
            r7.f1084 = r8
            boolean r8 = r2.f4458
            if (r8 != 0) goto L256
            boolean r8 = r0.mo145()
            if (r8 == 0) goto L256
            ᲇᲁᛱᛱ r8 = r0.f312
            int r8 = r8.mo1943(r3)
            ᲇᲁᛱᛱ r11 = r0.f312
            int r3 = r11.mo1937(r3)
            ᲇᲁᛱᛱ r11 = r0.f312
            int r11 = r11.mo1936()
            ᲇᲁᛱᛱ r12 = r0.f312
            int r12 = r12.mo1933()
            if (r3 > r11) goto L232
            if (r8 >= r11) goto L232
            r13 = r10
            goto L233
        L232:
            r13 = r5
        L233:
            if (r8 < r12) goto L239
            if (r3 <= r12) goto L239
            r3 = r10
            goto L23a
        L239:
            r3 = r5
        L23a:
            if (r13 != 0) goto L23e
            if (r3 == 0) goto L256
        L23e:
            boolean r3 = r7.f1081
            if (r3 == 0) goto L243
            r11 = r12
        L243:
            r7.f1082 = r11
            goto L256
        L246:
            r7.m656()
            boolean r3 = r0.f306
            if (r3 == 0) goto L253
            int r3 = r2.m1957()
            int r3 = r3 - r10
            goto L254
        L253:
            r3 = r5
        L254:
            r7.f1084 = r3
        L256:
            r7.f1080 = r10
        L258:
            ᛲᲁᛷᲁ r3 = r0.f311
            int r8 = r3.f1863
            if (r8 < 0) goto L260
            r8 = r10
            goto L261
        L260:
            r8 = r4
        L261:
            r3.f1865 = r8
            int[] r3 = r0.f308
            r3[r5] = r5
            r3[r10] = r5
            int r8 = r2.f4453
            if (r8 == r4) goto L274
            ᲇᲁᛱᛱ r8 = r0.f312
            int r8 = r8.mo1939()
            goto L275
        L274:
            r8 = r5
        L275:
            ᛲᲁᛷᲁ r11 = r0.f311
            int r11 = r11.f1865
            if (r11 != r4) goto L27d
            r11 = r5
            goto L27f
        L27d:
            r11 = r8
            r8 = r5
        L27f:
            r3[r5] = r8
            r3[r10] = r11
            int r8 = java.lang.Math.max(r5, r8)
            ᲇᲁᛱᛱ r11 = r0.f312
            int r11 = r11.mo1936()
            int r11 = r11 + r8
            r3 = r3[r10]
            int r3 = java.lang.Math.max(r5, r3)
            ᲇᲁᛱᛱ r8 = r0.f312
            int r8 = r8.mo1938()
            int r8 = r8 + r3
            boolean r3 = r2.f4458
            if (r3 == 0) goto L2d5
            int r3 = r0.f309
            if (r3 == r4) goto L2d5
            int r12 = r0.f315
            if (r12 == r9) goto L2d5
            android.view.View r3 = r0.mo191(r3)
            if (r3 == 0) goto L2d5
            boolean r9 = r0.f301
            ᲇᲁᛱᛱ r12 = r0.f312
            if (r9 == 0) goto L2c2
            int r9 = r12.mo1933()
            ᲇᲁᛱᛱ r12 = r0.f312
            int r3 = r12.mo1937(r3)
            int r9 = r9 - r3
            int r3 = r0.f315
        L2c0:
            int r9 = r9 - r3
            goto L2d0
        L2c2:
            int r3 = r12.mo1943(r3)
            ᲇᲁᛱᛱ r9 = r0.f312
            int r9 = r9.mo1936()
            int r3 = r3 - r9
            int r9 = r0.f315
            goto L2c0
        L2d0:
            if (r9 <= 0) goto L2d4
            int r11 = r11 + r9
            goto L2d5
        L2d4:
            int r8 = r8 - r9
        L2d5:
            boolean r3 = r7.f1081
            boolean r9 = r0.f301
            if (r3 == 0) goto L2df
            if (r9 == 0) goto L2e1
        L2dd:
            r4 = r10
            goto L2e1
        L2df:
            if (r9 == 0) goto L2dd
        L2e1:
            r0.mo125(r1, r2, r7, r4)
            r17.m2400(r18)
            ᛲᲁᛷᲁ r3 = r0.f311
            ᲇᲁᛱᛱ r4 = r0.f312
            int r4 = r4.mo1931()
            if (r4 != 0) goto L2fb
            ᲇᲁᛱᛱ r4 = r0.f312
            int r4 = r4.mo1930()
            if (r4 != 0) goto L2fb
            r4 = r10
            goto L2fc
        L2fb:
            r4 = r5
        L2fc:
            r3.f1857 = r4
            ᛲᲁᛷᲁ r3 = r0.f311
            r3.getClass()
            ᛲᲁᛷᲁ r3 = r0.f311
            r3.f1858 = r5
            boolean r3 = r7.f1081
            int r4 = r7.f1084
            if (r3 == 0) goto L350
            int r3 = r7.f1082
            r0.m183(r4, r3)
            ᛲᲁᛷᲁ r3 = r0.f311
            r3.f1855 = r11
            r0.m158(r1, r3, r2, r5)
            ᛲᲁᛷᲁ r3 = r0.f311
            int r4 = r3.f1864
            int r9 = r3.f1860
            int r3 = r3.f1861
            if (r3 <= 0) goto L324
            int r8 = r8 + r3
        L324:
            int r3 = r7.f1084
            int r11 = r7.f1082
            r0.m156(r3, r11)
            ᛲᲁᛷᲁ r3 = r0.f311
            r3.f1855 = r8
            int r8 = r3.f1860
            int r11 = r3.f1859
            int r8 = r8 + r11
            r3.f1860 = r8
            r0.m158(r1, r3, r2, r5)
            ᛲᲁᛷᲁ r3 = r0.f311
            int r8 = r3.f1864
            int r3 = r3.f1861
            if (r3 <= 0) goto L393
            r0.m183(r9, r4)
            ᛲᲁᛷᲁ r4 = r0.f311
            r4.f1855 = r3
            r0.m158(r1, r4, r2, r5)
            ᛲᲁᛷᲁ r3 = r0.f311
            int r4 = r3.f1864
            goto L393
        L350:
            int r3 = r7.f1082
            r0.m156(r4, r3)
            ᛲᲁᛷᲁ r3 = r0.f311
            r3.f1855 = r8
            r0.m158(r1, r3, r2, r5)
            ᛲᲁᛷᲁ r3 = r0.f311
            int r8 = r3.f1864
            int r4 = r3.f1860
            int r3 = r3.f1861
            if (r3 <= 0) goto L367
            int r11 = r11 + r3
        L367:
            int r3 = r7.f1084
            int r9 = r7.f1082
            r0.m183(r3, r9)
            ᛲᲁᛷᲁ r3 = r0.f311
            r3.f1855 = r11
            int r9 = r3.f1860
            int r11 = r3.f1859
            int r9 = r9 + r11
            r3.f1860 = r9
            r0.m158(r1, r3, r2, r5)
            ᛲᲁᛷᲁ r3 = r0.f311
            int r9 = r3.f1864
            int r3 = r3.f1861
            if (r3 <= 0) goto L392
            r0.m156(r4, r8)
            ᛲᲁᛷᲁ r4 = r0.f311
            r4.f1855 = r3
            r0.m158(r1, r4, r2, r5)
            ᛲᲁᛷᲁ r3 = r0.f311
            int r8 = r3.f1864
        L392:
            r4 = r9
        L393:
            int r3 = r0.m2393()
            if (r3 <= 0) goto L3b8
            boolean r3 = r0.f301
            boolean r9 = r0.f306
            r3 = r3 ^ r9
            if (r3 == 0) goto L3ad
            int r3 = r0.m175(r8, r1, r2, r10)
            int r4 = r4 + r3
            int r8 = r8 + r3
            int r3 = r0.m193(r4, r1, r2, r5)
        L3aa:
            int r4 = r4 + r3
            int r8 = r8 + r3
            goto L3b8
        L3ad:
            int r3 = r0.m193(r4, r1, r2, r10)
            int r4 = r4 + r3
            int r8 = r8 + r3
            int r3 = r0.m175(r8, r1, r2, r5)
            goto L3aa
        L3b8:
            boolean r3 = r2.f4446
            if (r3 == 0) goto L454
            int r3 = r0.m2393()
            if (r3 == 0) goto L454
            boolean r3 = r2.f4458
            if (r3 != 0) goto L454
            boolean r3 = r0.mo145()
            if (r3 != 0) goto L3ce
            goto L454
        L3ce:
            java.util.List r3 = r1.f7311
            int r9 = r3.size()
            android.view.View r11 = r0.m2382(r5)
            int r11 = defpackage.AbstractC1270.m2371(r11)
            r12 = r5
            r13 = r12
            r14 = r13
        L3df:
            if (r12 >= r9) goto L40f
            java.lang.Object r15 = r3.get(r12)
            ᲈᛸᲈᛷ r15 = (defpackage.AbstractC2316) r15
            boolean r16 = r15.m3785()
            android.view.View r10 = r15.f9791
            if (r16 == 0) goto L3f0
            goto L40a
        L3f0:
            int r15 = r15.m3782()
            if (r15 >= r11) goto L3f8
            r15 = 1
            goto L3f9
        L3f8:
            r15 = r5
        L3f9:
            boolean r6 = r0.f301
            ᲇᲁᛱᛱ r5 = r0.f312
            if (r15 == r6) goto L405
            int r5 = r5.mo1935(r10)
            int r13 = r13 + r5
            goto L40a
        L405:
            int r5 = r5.mo1935(r10)
            int r14 = r14 + r5
        L40a:
            int r12 = r12 + 1
            r5 = 0
            r10 = 1
            goto L3df
        L40f:
            ᛲᲁᛷᲁ r5 = r0.f311
            r5.f1856 = r3
            if (r13 <= 0) goto L431
            android.view.View r3 = r0.m196()
            int r3 = defpackage.AbstractC1270.m2371(r3)
            r0.m183(r3, r4)
            ᛲᲁᛷᲁ r3 = r0.f311
            r3.f1855 = r13
            r4 = 0
            r3.f1861 = r4
            r5 = 0
            r3.m1088(r5)
            ᛲᲁᛷᲁ r3 = r0.f311
            r0.m158(r1, r3, r2, r4)
            goto L432
        L431:
            r4 = 0
        L432:
            if (r14 <= 0) goto L44f
            android.view.View r3 = r0.m182()
            int r3 = defpackage.AbstractC1270.m2371(r3)
            r0.m156(r3, r8)
            ᛲᲁᛷᲁ r3 = r0.f311
            r3.f1855 = r14
            r3.f1861 = r4
            r5 = 0
            r3.m1088(r5)
            ᛲᲁᛷᲁ r3 = r0.f311
            r0.m158(r1, r3, r2, r4)
            goto L450
        L44f:
            r5 = 0
        L450:
            ᛲᲁᛷᲁ r1 = r0.f311
            r1.f1856 = r5
        L454:
            boolean r1 = r2.f4458
            if (r1 != 0) goto L461
            ᲇᲁᛱᛱ r1 = r0.f312
            int r2 = r1.mo1939()
            r1.f9096 = r2
            goto L464
        L461:
            r7.m655()
        L464:
            boolean r1 = r0.f306
            r0.f303 = r1
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final boolean mo172() {
            r0 = this;
            int r0 = r0.f314
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛷᛴᲈ, reason: contains not printable characters */
    public final void mo173(defpackage.C0055 r1) {
            r0 = this;
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛷᛷᛱᲁ, reason: contains not printable characters */
    public final android.os.Parcelable mo174() {
            r3 = this;
            ᛸᲈᛵᛶ r0 = r3.f313
            if (r0 == 0) goto L16
            ᛸᲈᛵᛶ r3 = new ᛸᲈᛵᛶ
            r3.<init>()
            int r1 = r0.f7091
            r3.f7091 = r1
            int r1 = r0.f7090
            r3.f7090 = r1
            boolean r0 = r0.f7089
            r3.f7089 = r0
            return r3
        L16:
            ᛸᲈᛵᛶ r0 = new ᛸᲈᛵᛶ
            r0.<init>()
            int r1 = r3.m2393()
            if (r1 <= 0) goto L61
            r3.m166()
            boolean r1 = r3.f303
            boolean r2 = r3.f301
            r1 = r1 ^ r2
            r0.f7089 = r1
            if (r1 == 0) goto L47
            android.view.View r1 = r3.m182()
            ᲇᲁᛱᛱ r2 = r3.f312
            int r2 = r2.mo1933()
            ᲇᲁᛱᛱ r3 = r3.f312
            int r3 = r3.mo1937(r1)
            int r2 = r2 - r3
            r0.f7090 = r2
            int r3 = defpackage.AbstractC1270.m2371(r1)
            r0.f7091 = r3
            return r0
        L47:
            android.view.View r1 = r3.m196()
            int r2 = defpackage.AbstractC1270.m2371(r1)
            r0.f7091 = r2
            ᲇᲁᛱᛱ r2 = r3.f312
            int r1 = r2.mo1943(r1)
            ᲇᲁᛱᛱ r3 = r3.f312
            int r3 = r3.mo1936()
            int r1 = r1 - r3
            r0.f7090 = r1
            return r0
        L61:
            r3 = -1
            r0.f7091 = r3
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛷᛳᛶ, reason: contains not printable characters */
    public final int m175(int r2, defpackage.C1633 r3, defpackage.C1000 r4, boolean r5) {
            r1 = this;
            ᲇᲁᛱᛱ r0 = r1.f312
            int r0 = r0.mo1933()
            int r0 = r0 - r2
            if (r0 <= 0) goto L23
            int r0 = -r0
            int r3 = r1.m184(r0, r3, r4)
            int r3 = -r3
            int r2 = r2 + r3
            if (r5 == 0) goto L22
            ᲇᲁᛱᛱ r4 = r1.f312
            int r4 = r4.mo1933()
            int r4 = r4 - r2
            if (r4 <= 0) goto L22
            ᲇᲁᛱᛱ r1 = r1.f312
            r1.mo1940(r4)
            int r4 = r4 + r3
            return r4
        L22:
            return r3
        L23:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛷᛳᲁ, reason: contains not printable characters */
    public final void m176(defpackage.C1633 r6, defpackage.C0361 r7) {
            r5 = this;
            boolean r0 = r7.f1862
            if (r0 == 0) goto Lb3
            boolean r0 = r7.f1857
            if (r0 == 0) goto La
            goto Lb3
        La:
            int r0 = r7.f1866
            int r1 = r7.f1858
            int r7 = r7.f1865
            r2 = 0
            r3 = -1
            if (r7 != r3) goto L68
            int r7 = r5.m2393()
            if (r0 >= 0) goto L1c
            goto Lb3
        L1c:
            ᲇᲁᛱᛱ r3 = r5.f312
            int r3 = r3.mo1930()
            int r3 = r3 - r0
            int r3 = r3 + r1
            boolean r0 = r5.f301
            if (r0 == 0) goto L47
            r0 = r2
        L29:
            if (r0 >= r7) goto Lb3
            android.view.View r1 = r5.m2382(r0)
            ᲇᲁᛱᛱ r4 = r5.f312
            int r4 = r4.mo1943(r1)
            if (r4 < r3) goto L43
            ᲇᲁᛱᛱ r4 = r5.f312
            int r1 = r4.mo1942(r1)
            if (r1 >= r3) goto L40
            goto L43
        L40:
            int r0 = r0 + 1
            goto L29
        L43:
            r5.m160(r6, r2, r0)
            return
        L47:
            int r7 = r7 + (-1)
            r0 = r7
        L4a:
            if (r0 < 0) goto Lb3
            android.view.View r1 = r5.m2382(r0)
            ᲇᲁᛱᛱ r2 = r5.f312
            int r2 = r2.mo1943(r1)
            if (r2 < r3) goto L64
            ᲇᲁᛱᛱ r2 = r5.f312
            int r1 = r2.mo1942(r1)
            if (r1 >= r3) goto L61
            goto L64
        L61:
            int r0 = r0 + (-1)
            goto L4a
        L64:
            r5.m160(r6, r7, r0)
            return
        L68:
            if (r0 >= 0) goto L6b
            goto Lb3
        L6b:
            int r0 = r0 - r1
            int r7 = r5.m2393()
            boolean r1 = r5.f301
            if (r1 == 0) goto L95
            int r7 = r7 + (-1)
            r1 = r7
        L77:
            if (r1 < 0) goto Lb3
            android.view.View r2 = r5.m2382(r1)
            ᲇᲁᛱᛱ r3 = r5.f312
            int r3 = r3.mo1937(r2)
            if (r3 > r0) goto L91
            ᲇᲁᛱᛱ r3 = r5.f312
            int r2 = r3.mo1934(r2)
            if (r2 <= r0) goto L8e
            goto L91
        L8e:
            int r1 = r1 + (-1)
            goto L77
        L91:
            r5.m160(r6, r7, r1)
            return
        L95:
            r1 = r2
        L96:
            if (r1 >= r7) goto Lb3
            android.view.View r3 = r5.m2382(r1)
            ᲇᲁᛱᛱ r4 = r5.f312
            int r4 = r4.mo1937(r3)
            if (r4 > r0) goto Lb0
            ᲇᲁᛱᛱ r4 = r5.f312
            int r3 = r4.mo1934(r3)
            if (r3 <= r0) goto Lad
            goto Lb0
        Lad:
            int r1 = r1 + 1
            goto L96
        Lb0:
            r5.m160(r6, r2, r1)
        Lb3:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void mo177(java.lang.String r2) {
            r1 = this;
            ᛸᲈᛵᛶ r0 = r1.f313
            if (r0 != 0) goto Lb
            ᛱᛳᛶᛱ r1 = r1.f5691
            if (r1 == 0) goto Lb
            r1.m416(r2)
        Lb:
            return
    }

    @Override // defpackage.InterfaceC2256
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.graphics.PointF mo178(int r4) {
            r3 = this;
            int r0 = r3.m2393()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            r0 = 0
            android.view.View r1 = r3.m2382(r0)
            int r1 = defpackage.AbstractC1270.m2371(r1)
            r2 = 1
            if (r4 >= r1) goto L15
            r0 = r2
        L15:
            boolean r4 = r3.f301
            if (r0 == r4) goto L1a
            r2 = -1
        L1a:
            int r3 = r3.f314
            r4 = 0
            if (r3 != 0) goto L26
            android.graphics.PointF r3 = new android.graphics.PointF
            float r0 = (float) r2
            r3.<init>(r0, r4)
            return r3
        L26:
            android.graphics.PointF r3 = new android.graphics.PointF
            float r0 = (float) r2
            r3.<init>(r4, r0)
            return r3
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛷᲇᛷᛶ, reason: contains not printable characters */
    public final boolean mo179() {
            r0 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛲᛴᛱ, reason: contains not printable characters */
    public final void m180(int r6, int r7, boolean r8, defpackage.C1000 r9) {
            r5 = this;
            ᛲᲁᛷᲁ r0 = r5.f311
            ᲇᲁᛱᛱ r1 = r5.f312
            int r1 = r1.mo1931()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L16
            ᲇᲁᛱᛱ r1 = r5.f312
            int r1 = r1.mo1930()
            if (r1 != 0) goto L16
            r1 = r3
            goto L17
        L16:
            r1 = r2
        L17:
            r0.f1857 = r1
            ᛲᲁᛷᲁ r0 = r5.f311
            r0.f1865 = r6
            int[] r0 = r5.f308
            r0[r2] = r2
            r0[r3] = r2
            int r9 = r9.f4453
            r1 = -1
            if (r9 == r1) goto L2f
            ᲇᲁᛱᛱ r9 = r5.f312
            int r9 = r9.mo1939()
            goto L30
        L2f:
            r9 = r2
        L30:
            ᛲᲁᛷᲁ r4 = r5.f311
            int r4 = r4.f1865
            if (r4 != r1) goto L38
            r4 = r2
            goto L3a
        L38:
            r4 = r9
            r9 = r2
        L3a:
            r0[r2] = r9
            r0[r3] = r4
            int r9 = java.lang.Math.max(r2, r9)
            r0 = r0[r3]
            int r0 = java.lang.Math.max(r2, r0)
            if (r6 != r3) goto L4b
            r2 = r3
        L4b:
            ᛲᲁᛷᲁ r6 = r5.f311
            if (r2 == 0) goto L51
            r4 = r0
            goto L52
        L51:
            r4 = r9
        L52:
            r6.f1855 = r4
            if (r2 == 0) goto L57
            goto L58
        L57:
            r9 = r0
        L58:
            r6.f1858 = r9
            if (r2 == 0) goto L93
            ᲇᲁᛱᛱ r9 = r5.f312
            int r9 = r9.mo1938()
            int r9 = r9 + r4
            r6.f1855 = r9
            android.view.View r6 = r5.m182()
            ᛲᲁᛷᲁ r9 = r5.f311
            boolean r0 = r5.f301
            if (r0 == 0) goto L70
            r3 = r1
        L70:
            r9.f1859 = r3
            int r0 = defpackage.AbstractC1270.m2371(r6)
            ᛲᲁᛷᲁ r1 = r5.f311
            int r2 = r1.f1859
            int r0 = r0 + r2
            r9.f1860 = r0
            ᲇᲁᛱᛱ r9 = r5.f312
            int r9 = r9.mo1937(r6)
            r1.f1864 = r9
            ᲇᲁᛱᛱ r9 = r5.f312
            int r6 = r9.mo1937(r6)
            ᲇᲁᛱᛱ r9 = r5.f312
            int r9 = r9.mo1933()
            int r6 = r6 - r9
            goto Lcf
        L93:
            android.view.View r6 = r5.m196()
            ᛲᲁᛷᲁ r9 = r5.f311
            int r0 = r9.f1855
            ᲇᲁᛱᛱ r2 = r5.f312
            int r2 = r2.mo1936()
            int r2 = r2 + r0
            r9.f1855 = r2
            ᛲᲁᛷᲁ r9 = r5.f311
            boolean r0 = r5.f301
            if (r0 == 0) goto Lab
            goto Lac
        Lab:
            r3 = r1
        Lac:
            r9.f1859 = r3
            int r0 = defpackage.AbstractC1270.m2371(r6)
            ᛲᲁᛷᲁ r1 = r5.f311
            int r2 = r1.f1859
            int r0 = r0 + r2
            r9.f1860 = r0
            ᲇᲁᛱᛱ r9 = r5.f312
            int r9 = r9.mo1943(r6)
            r1.f1864 = r9
            ᲇᲁᛱᛱ r9 = r5.f312
            int r6 = r9.mo1943(r6)
            int r6 = -r6
            ᲇᲁᛱᛱ r9 = r5.f312
            int r9 = r9.mo1936()
            int r6 = r6 + r9
        Lcf:
            ᛲᲁᛷᲁ r5 = r5.f311
            r5.f1861 = r7
            if (r8 == 0) goto Ld8
            int r7 = r7 - r6
            r5.f1861 = r7
        Ld8:
            r5.f1866 = r6
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final int mo181(defpackage.C1000 r1) {
            r0 = this;
            int r0 = r0.m197(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛶᛵᲀ, reason: contains not printable characters */
    public final android.view.View m182() {
            r1 = this;
            boolean r0 = r1.f301
            if (r0 == 0) goto L6
            r0 = 0
            goto Lc
        L6:
            int r0 = r1.m2393()
            int r0 = r0 + (-1)
        Lc:
            android.view.View r1 = r1.m2382(r0)
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛶᲈ, reason: contains not printable characters */
    public final void m183(int r3, int r4) {
            r2 = this;
            ᛲᲁᛷᲁ r0 = r2.f311
            ᲇᲁᛱᛱ r1 = r2.f312
            int r1 = r1.mo1936()
            int r1 = r4 - r1
            r0.f1861 = r1
            ᛲᲁᛷᲁ r0 = r2.f311
            r0.f1860 = r3
            boolean r2 = r2.f301
            r3 = -1
            if (r2 == 0) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = r3
        L18:
            r0.f1859 = r2
            r0.f1865 = r3
            r0.f1864 = r4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.f1866 = r2
            return
    }

    /* JADX INFO: renamed from: ᲀᛲᲈᛵ */
    public android.view.View mo142(defpackage.C1633 r17, defpackage.C1000 r18, boolean r19, boolean r20) {
            r16 = this;
            r0 = r16
            r0.m166()
            int r1 = r0.m2393()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.m2393()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.m1957()
            ᲇᲁᛱᛱ r7 = r0.f312
            int r7 = r7.mo1936()
            ᲇᲁᛱᛱ r8 = r0.f312
            int r8 = r8.mo1933()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.m2382(r1)
            int r13 = defpackage.AbstractC1270.m2371(r12)
            ᲇᲁᛱᛱ r14 = r0.f312
            int r14 = r14.mo1943(r12)
            ᲇᲁᛱᛱ r15 = r0.f312
            int r15 = r15.mo1937(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            ᛵᛲᲁᛴ r13 = (defpackage.C0840) r13
            ᲈᛸᲈᛷ r13 = r13.f3863
            boolean r13 = r13.m3785()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            return r9
        L7f:
            if (r10 == 0) goto L82
            return r10
        L82:
            return r11
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public int mo143(defpackage.C1000 r1) {
            r0 = this;
            int r0 = r0.m189(r1)
            return r0
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲀᛴᲀ */
    public int mo144(int r2, defpackage.C1633 r3, defpackage.C1000 r4) {
            r1 = this;
            int r0 = r1.f314
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            int r1 = r1.m184(r2, r3, r4)
            return r1
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲀᛵᛳᛵ */
    public boolean mo145() {
            r1 = this;
            ᛸᲈᛵᛶ r0 = r1.f313
            if (r0 != 0) goto Lc
            boolean r0 = r1.f303
            boolean r1 = r1.f306
            if (r0 != r1) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲀᛸᛴᛲ, reason: contains not printable characters */
    public final int m184(int r6, defpackage.C1633 r7, defpackage.C1000 r8) {
            r5 = this;
            int r0 = r5.m2393()
            r1 = 0
            if (r0 == 0) goto L39
            if (r6 != 0) goto La
            goto L39
        La:
            r5.m166()
            ᛲᲁᛷᲁ r0 = r5.f311
            r2 = 1
            r0.f1862 = r2
            if (r6 <= 0) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = -1
        L17:
            int r3 = java.lang.Math.abs(r6)
            r5.m180(r0, r3, r2, r8)
            ᛲᲁᛷᲁ r2 = r5.f311
            int r4 = r2.f1866
            int r7 = r5.m158(r7, r2, r8, r1)
            int r7 = r7 + r4
            if (r7 >= 0) goto L2a
            goto L39
        L2a:
            if (r3 <= r7) goto L2e
            int r6 = r0 * r7
        L2e:
            ᲇᲁᛱᛱ r7 = r5.f312
            int r8 = -r6
            r7.mo1940(r8)
            ᛲᲁᛷᲁ r5 = r5.f311
            r5.f1863 = r6
            return r6
        L39:
            return r1
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲀᲀᛲᛸ, reason: contains not printable characters */
    public final void mo185(android.view.accessibility.AccessibilityEvent r4) {
            r3 = this;
            super.mo185(r4)
            int r0 = r3.m2393()
            if (r0 <= 0) goto L32
            int r0 = r3.m2393()
            r1 = 0
            android.view.View r0 = r3.m163(r1, r0, r1)
            r2 = -1
            if (r0 != 0) goto L17
            r0 = r2
            goto L1b
        L17:
            int r0 = defpackage.AbstractC1270.m2371(r0)
        L1b:
            r4.setFromIndex(r0)
            int r0 = r3.m2393()
            int r0 = r0 + (-1)
            android.view.View r3 = r3.m163(r0, r2, r1)
            if (r3 != 0) goto L2b
            goto L2f
        L2b:
            int r2 = defpackage.AbstractC1270.m2371(r3)
        L2f:
            r4.setToIndex(r2)
        L32:
            return
    }

    /* JADX INFO: renamed from: ᲀᲀᛵᛸ, reason: contains not printable characters */
    public final android.view.View m186(boolean r3) {
            r2 = this;
            boolean r0 = r2.f301
            if (r0 == 0) goto Le
            r0 = 0
            int r1 = r2.m2393()
            android.view.View r2 = r2.m163(r0, r1, r3)
            return r2
        Le:
            int r0 = r2.m2393()
            int r0 = r0 + (-1)
            r1 = -1
            android.view.View r2 = r2.m163(r0, r1, r3)
            return r2
    }

    /* JADX INFO: renamed from: ᲀᲇᛶ, reason: contains not printable characters */
    public final int m187(defpackage.C1000 r7) {
            r6 = this;
            int r0 = r6.m2393()
            if (r0 != 0) goto L8
            r6 = 0
            return r6
        L8:
            r6.m166()
            ᲇᲁᛱᛱ r1 = r6.f312
            boolean r0 = r6.f307
            r0 = r0 ^ 1
            android.view.View r2 = r6.m165(r0)
            android.view.View r3 = r6.m186(r0)
            boolean r5 = r6.f307
            r4 = r6
            r0 = r7
            int r6 = defpackage.C0292.m950(r0, r1, r2, r3, r4, r5)
            return r6
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲀᲈᛵᛳ */
    public void mo148(defpackage.C1000 r1) {
            r0 = this;
            r1 = 0
            r0.f313 = r1
            r1 = -1
            r0.f309 = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.f315 = r1
            ᛱᛸᛱ r0 = r0.f310
            r0.m655()
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲁᛲᲇᛲ, reason: contains not printable characters */
    public final boolean mo188() {
            r5 = this;
            int r0 = r5.f5685
            r1 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L27
            int r0 = r5.f5681
            if (r0 == r2) goto L27
            int r0 = r5.m2393()
            r2 = r1
        L10:
            if (r2 >= r0) goto L27
            android.view.View r3 = r5.m2382(r2)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            int r4 = r3.width
            if (r4 >= 0) goto L24
            int r3 = r3.height
            if (r3 >= 0) goto L24
            r5 = 1
            return r5
        L24:
            int r2 = r2 + 1
            goto L10
        L27:
            return r1
    }

    /* JADX INFO: renamed from: ᲁᲀᛵᛳ, reason: contains not printable characters */
    public final int m189(defpackage.C1000 r8) {
            r7 = this;
            int r0 = r7.m2393()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            r7.m166()
            ᲇᲁᛱᛱ r1 = r7.f312
            boolean r0 = r7.f307
            r0 = r0 ^ 1
            android.view.View r2 = r7.m165(r0)
            android.view.View r3 = r7.m186(r0)
            boolean r5 = r7.f307
            boolean r6 = r7.f301
            r4 = r7
            r0 = r8
            int r7 = defpackage.C0292.m949(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    /* JADX INFO: renamed from: ᲁᲇᛱᲈ, reason: contains not printable characters */
    public final void m190(int r1, int r2) {
            r0 = this;
            r0.f309 = r1
            r0.f315 = r2
            ᛸᲈᛵᛶ r1 = r0.f313
            if (r1 == 0) goto Lb
            r2 = -1
            r1.f7091 = r2
        Lb:
            r0.m2383()
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final android.view.View mo191(int r3) {
            r2 = this;
            int r0 = r2.m2393()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            r1 = 0
            android.view.View r1 = r2.m2382(r1)
            int r1 = defpackage.AbstractC1270.m2371(r1)
            int r1 = r3 - r1
            if (r1 < 0) goto L22
            if (r1 >= r0) goto L22
            android.view.View r0 = r2.m2382(r1)
            int r1 = defpackage.AbstractC1270.m2371(r0)
            if (r1 != r3) goto L22
            return r0
        L22:
            android.view.View r2 = super.mo191(r3)
            return r2
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲇᛱᛸᲇ */
    public defpackage.C0840 mo151() {
            r1 = this;
            ᛵᛲᲁᛴ r1 = new ᛵᛲᲁᛴ
            r0 = -2
            r1.<init>(r0, r0)
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛳᛸᲈ, reason: contains not printable characters */
    public final void m192(int r3) {
            r2 = this;
            if (r3 == 0) goto L10
            r0 = 1
            if (r3 != r0) goto L6
            goto L10
        L6:
            java.lang.String r2 = "invalid orientation:"
            java.lang.String r2 = defpackage.AbstractC1124.m2145(r3, r2)
            defpackage.C2264.m3684(r2)
            return
        L10:
            r0 = 0
            r2.mo177(r0)
            int r0 = r2.f314
            if (r3 != r0) goto L1e
            ᲇᲁᛱᛱ r0 = r2.f312
            if (r0 != 0) goto L1d
            goto L1e
        L1d:
            return
        L1e:
            ᲇᲁᛱᛱ r0 = defpackage.AbstractC2126.m3549(r2, r3)
            r2.f312 = r0
            ᛱᛸᛱ r1 = r2.f310
            r1.f1083 = r0
            r2.f314 = r3
            r2.m2383()
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᲀᛸ, reason: contains not printable characters */
    public final int m193(int r2, defpackage.C1633 r3, defpackage.C1000 r4, boolean r5) {
            r1 = this;
            ᲇᲁᛱᛱ r0 = r1.f312
            int r0 = r0.mo1936()
            int r0 = r2 - r0
            if (r0 <= 0) goto L23
            int r3 = r1.m184(r0, r3, r4)
            int r3 = -r3
            int r2 = r2 + r3
            if (r5 == 0) goto L22
            ᲇᲁᛱᛱ r4 = r1.f312
            int r4 = r4.mo1936()
            int r2 = r2 - r4
            if (r2 <= 0) goto L22
            ᲇᲁᛱᛱ r1 = r1.f312
            int r4 = -r2
            r1.mo1940(r4)
            int r3 = r3 - r2
        L22:
            return r3
        L23:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛸᛵᛲ */
    public void mo154(defpackage.C1633 r11, defpackage.C1000 r12, defpackage.C0361 r13, defpackage.C0903 r14) {
            r10 = this;
            android.view.View r11 = r13.m1089(r11)
            r12 = 1
            if (r11 != 0) goto La
            r14.f4111 = r12
            return
        La:
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            ᛵᛲᲁᛴ r0 = (defpackage.C0840) r0
            java.util.List r1 = r13.f1856
            boolean r2 = r10.f301
            int r3 = r13.f1865
            r4 = -1
            r5 = 0
            if (r1 != 0) goto L29
            if (r3 != r4) goto L1e
            r1 = r12
            goto L1f
        L1e:
            r1 = r5
        L1f:
            if (r2 != r1) goto L25
            r10.m2399(r11, r4, r5)
            goto L37
        L25:
            r10.m2399(r11, r5, r5)
            goto L37
        L29:
            if (r3 != r4) goto L2d
            r1 = r12
            goto L2e
        L2d:
            r1 = r5
        L2e:
            if (r2 != r1) goto L34
            r10.m2399(r11, r4, r12)
            goto L37
        L34:
            r10.m2399(r11, r5, r12)
        L37:
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            ᛵᛲᲁᛴ r1 = (defpackage.C0840) r1
            ᛱᛳᛶᛱ r2 = r10.f5691
            android.graphics.Rect r2 = r2.m461(r11)
            int r3 = r2.left
            int r5 = r2.right
            int r3 = r3 + r5
            int r5 = r2.top
            int r2 = r2.bottom
            int r5 = r5 + r2
            int r2 = r10.f5690
            int r6 = r10.f5681
            int r7 = r10.m2380()
            int r8 = r10.m2389()
            int r8 = r8 + r7
            int r7 = r1.leftMargin
            int r8 = r8 + r7
            int r7 = r1.rightMargin
            int r8 = r8 + r7
            int r8 = r8 + r3
            int r3 = r1.width
            boolean r7 = r10.mo172()
            int r2 = defpackage.AbstractC1270.m2373(r7, r2, r6, r8, r3)
            int r3 = r10.f5683
            int r6 = r10.f5685
            int r7 = r10.m2402()
            int r8 = r10.m2397()
            int r8 = r8 + r7
            int r7 = r1.topMargin
            int r8 = r8 + r7
            int r7 = r1.bottomMargin
            int r8 = r8 + r7
            int r8 = r8 + r5
            int r5 = r1.height
            boolean r7 = r10.mo170()
            int r3 = defpackage.AbstractC1270.m2373(r7, r3, r6, r8, r5)
            boolean r1 = r10.m2394(r11, r2, r3, r1)
            if (r1 == 0) goto L92
            r11.measure(r2, r3)
        L92:
            ᲇᲁᛱᛱ r1 = r10.f312
            int r1 = r1.mo1935(r11)
            r14.f4110 = r1
            int r1 = r10.f314
            if (r1 != r12) goto Ld1
            boolean r1 = r10.m169()
            if (r1 == 0) goto Lb4
            int r1 = r10.f5690
            int r2 = r10.m2389()
            int r1 = r1 - r2
            ᲇᲁᛱᛱ r10 = r10.f312
            int r10 = r10.mo1941(r11)
            int r10 = r1 - r10
            goto Lc2
        Lb4:
            int r1 = r10.m2380()
            ᲇᲁᛱᛱ r10 = r10.f312
            int r10 = r10.mo1941(r11)
            int r10 = r10 + r1
            r9 = r1
            r1 = r10
            r10 = r9
        Lc2:
            int r2 = r13.f1865
            int r13 = r13.f1864
            int r3 = r14.f4110
            if (r2 != r4) goto Lcf
            int r2 = r13 - r3
            r3 = r13
            r13 = r2
            goto Lf2
        Lcf:
            int r3 = r3 + r13
            goto Lf2
        Ld1:
            int r1 = r10.m2402()
            ᲇᲁᛱᛱ r10 = r10.f312
            int r10 = r10.mo1941(r11)
            int r10 = r10 + r1
            int r2 = r13.f1865
            int r13 = r13.f1864
            int r3 = r14.f4110
            if (r2 != r4) goto Lec
            int r2 = r13 - r3
            r3 = r1
            r1 = r13
            r13 = r3
            r3 = r10
            r10 = r2
            goto Lf2
        Lec:
            int r2 = r13 + r3
            r3 = r10
            r10 = r13
            r13 = r1
            r1 = r2
        Lf2:
            defpackage.AbstractC1270.m2372(r11, r10, r13, r1, r3)
            ᲈᛸᲈᛷ r10 = r0.f3863
            boolean r10 = r10.m3785()
            if (r10 != 0) goto L105
            ᲈᛸᲈᛷ r10 = r0.f3863
            boolean r10 = r10.m3781()
            if (r10 == 0) goto L107
        L105:
            r14.f4109 = r12
        L107:
            boolean r10 = r11.hasFocusable()
            r14.f4108 = r10
            return
    }

    /* JADX INFO: renamed from: ᲈᛱᲀᛴ, reason: contains not printable characters */
    public final void m194() {
            r2 = this;
            int r0 = r2.f314
            r1 = 1
            if (r0 == r1) goto L12
            boolean r0 = r2.m169()
            if (r0 != 0) goto Lc
            goto L12
        Lc:
            boolean r0 = r2.f302
            r0 = r0 ^ r1
            r2.f301 = r0
            return
        L12:
            boolean r0 = r2.f302
            r2.f301 = r0
            return
    }

    /* JADX INFO: renamed from: ᲈᛳᛳ, reason: contains not printable characters */
    public final int m195(int r5) {
            r4 = this;
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L3f
            r2 = 2
            if (r5 == r2) goto L32
            r2 = 17
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r2) goto L2c
            r2 = 33
            if (r5 == r2) goto L26
            r0 = 66
            if (r5 == r0) goto L20
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L1a
            return r3
        L1a:
            int r4 = r4.f314
            if (r4 != r1) goto L1f
            return r1
        L1f:
            return r3
        L20:
            int r4 = r4.f314
            if (r4 != 0) goto L25
            return r1
        L25:
            return r3
        L26:
            int r4 = r4.f314
            if (r4 != r1) goto L2b
            return r0
        L2b:
            return r3
        L2c:
            int r4 = r4.f314
            if (r4 != 0) goto L31
            return r0
        L31:
            return r3
        L32:
            int r5 = r4.f314
            if (r5 != r1) goto L37
            return r1
        L37:
            boolean r4 = r4.m169()
            if (r4 == 0) goto L3e
            return r0
        L3e:
            return r1
        L3f:
            int r5 = r4.f314
            if (r5 != r1) goto L44
            return r0
        L44:
            boolean r4 = r4.m169()
            if (r4 == 0) goto L4b
            return r1
        L4b:
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛱᛴ, reason: contains not printable characters */
    public final android.view.View m196() {
            r1 = this;
            boolean r0 = r1.f301
            if (r0 == 0) goto Lb
            int r0 = r1.m2393()
            int r0 = r0 + (-1)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            android.view.View r1 = r1.m2382(r0)
            return r1
    }

    /* JADX INFO: renamed from: ᲈᲈᛵᛱ, reason: contains not printable characters */
    public final int m197(defpackage.C1000 r7) {
            r6 = this;
            int r0 = r6.m2393()
            if (r0 != 0) goto L8
            r6 = 0
            return r6
        L8:
            r6.m166()
            ᲇᲁᛱᛱ r1 = r6.f312
            boolean r0 = r6.f307
            r0 = r0 ^ 1
            android.view.View r2 = r6.m165(r0)
            android.view.View r3 = r6.m186(r0)
            boolean r5 = r6.f307
            r4 = r6
            r0 = r7
            int r6 = defpackage.C0292.m941(r0, r1, r2, r3, r4, r5)
            return r6
    }
}
