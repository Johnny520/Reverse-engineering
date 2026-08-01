package xhss;

/* JADX INFO: renamed from: xhss.ᛶᛵᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0564 implements xhss.InterfaceC0807, xhss.InterfaceC0189, xhss.InterfaceC0608, xhss.InterfaceC0825, xhss.InterfaceC1060, xhss.InterfaceC0146, xhss.InterfaceC1168, xhss.InterfaceC0010 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static volatile xhss.C0564 f1993;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static xhss.C0564 f1994;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static xhss.C0564 f1995;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1996;

    public C0564() {
            r1 = this;
            r0 = 24
            r1.f1996 = r0
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            return
    }

    public /* synthetic */ C0564(int r1) {
            r0 = this;
            r0.f1996 = r1
            r0.<init>()
            return
    }

    public C0564(xhss.C0891 r1) {
            r0 = this;
            r1 = 27
            r0.f1996 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static java.util.ArrayList m1027(java.util.List r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r4.next()
            r2 = r1
            xhss.ᲈᛲᛵᛴ r2 = (xhss.EnumC1122) r2
            xhss.ᲈᛲᛵᛴ r3 = xhss.EnumC1122.f3614
            if (r2 == r3) goto L9
            r0.add(r1)
            goto L9
        L1e:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r1 = xhss.AbstractC0249.m554(r0)
            r4.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            xhss.ᲈᛲᛵᛴ r1 = (xhss.EnumC1122) r1
            java.lang.String r1 = r1.f3622
            r4.add(r1)
            goto L2b
        L3d:
            return r4
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static int m1028(android.graphics.fonts.FontStyle r2, android.graphics.fonts.FontStyle r3) {
            int r0 = r2.getWeight()
            int r1 = r3.getWeight()
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 / 100
            int r2 = r2.getSlant()
            int r3 = r3.getSlant()
            if (r2 != r3) goto L1b
            r2 = 0
            goto L1c
        L1b:
            r2 = 2
        L1c:
            int r0 = r0 + r2
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static android.graphics.fonts.Font m1029(android.graphics.fonts.FontFamily r5, int r6) {
            android.graphics.fonts.FontStyle r0 = new android.graphics.fonts.FontStyle
            r1 = r6 & 1
            if (r1 == 0) goto L9
            r1 = 700(0x2bc, float:9.81E-43)
            goto Lb
        L9:
            r1 = 400(0x190, float:5.6E-43)
        Lb:
            r6 = r6 & 2
            r2 = 0
            r3 = 1
            if (r6 == 0) goto L13
            r6 = r3
            goto L14
        L13:
            r6 = r2
        L14:
            r0.<init>(r1, r6)
            android.graphics.fonts.Font r6 = r5.getFont(r2)
            android.graphics.fonts.FontStyle r1 = r6.getStyle()
            int r1 = m1028(r0, r1)
        L23:
            int r2 = r5.getSize()
            if (r3 >= r2) goto L3c
            android.graphics.fonts.Font r2 = r5.getFont(r3)
            android.graphics.fonts.FontStyle r4 = r2.getStyle()
            int r4 = m1028(r0, r4)
            if (r4 >= r1) goto L39
            r6 = r2
            r1 = r4
        L39:
            int r3 = r3 + 1
            goto L23
        L3c:
            return r6
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static byte[] m1030(java.util.List r3) {
            xhss.ᛴᛲᛴᛶ r0 = new xhss.ᛴᛲᛴᛶ
            r0.<init>()
            java.util.ArrayList r3 = m1027(r3)
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r0.m701(r2)
            r0.m686(r1)
            goto Ld
        L24:
            long r1 = r0.f1261
            byte[] r3 = r0.m699(r1)
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    private final void m1031(int r1, java.lang.Object r2) {
            r0 = this;
            return
    }

    @Override // xhss.InterfaceC0146
    public void onScrollLimit(int r1, int r2, int r3, boolean r4) {
            r0 = this;
            return
    }

    @Override // xhss.InterfaceC0146
    public void onScrollProgress(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // xhss.InterfaceC0807
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public void mo583(java.lang.String r5, java.lang.StringBuilder r6) {
            r4 = this;
            int r4 = r5.length()     // Catch: java.io.IOException -> L98
            r0 = 0
        L5:
            if (r0 >= r4) goto L97
            char r1 = r5.charAt(r0)     // Catch: java.io.IOException -> L98
            r2 = 12
            if (r1 == r2) goto L8e
            r2 = 13
            if (r1 == r2) goto L88
            r2 = 34
            if (r1 == r2) goto L82
            r2 = 92
            if (r1 == r2) goto L7c
            switch(r1) {
                case 8: goto L76;
                case 9: goto L70;
                case 10: goto L6a;
                default: goto L1e;
            }     // Catch: java.io.IOException -> L98
        L1e:
            if (r1 < 0) goto L24
            r2 = 31
            if (r1 <= r2) goto L34
        L24:
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 < r2) goto L2c
            r2 = 159(0x9f, float:2.23E-43)
            if (r1 <= r2) goto L34
        L2c:
            r2 = 8192(0x2000, float:1.148E-41)
            if (r1 < r2) goto L66
            r2 = 8447(0x20ff, float:1.1837E-41)
            if (r1 > r2) goto L66
        L34:
            java.lang.String r2 = "\\u"
            r6.append(r2)     // Catch: java.io.IOException -> L98
            java.lang.String r2 = "0123456789ABCDEF"
            int r3 = r1 >> 12
            r3 = r3 & 15
            char r3 = r2.charAt(r3)     // Catch: java.io.IOException -> L98
            r6.append(r3)     // Catch: java.io.IOException -> L98
            int r3 = r1 >> 8
            r3 = r3 & 15
            char r3 = r2.charAt(r3)     // Catch: java.io.IOException -> L98
            r6.append(r3)     // Catch: java.io.IOException -> L98
            int r3 = r1 >> 4
            r3 = r3 & 15
            char r3 = r2.charAt(r3)     // Catch: java.io.IOException -> L98
            r6.append(r3)     // Catch: java.io.IOException -> L98
            r1 = r1 & 15
            char r1 = r2.charAt(r1)     // Catch: java.io.IOException -> L98
            r6.append(r1)     // Catch: java.io.IOException -> L98
            goto L93
        L66:
            r6.append(r1)     // Catch: java.io.IOException -> L98
            goto L93
        L6a:
            java.lang.String r1 = "\\n"
            r6.append(r1)     // Catch: java.io.IOException -> L98
            goto L93
        L70:
            java.lang.String r1 = "\\t"
            r6.append(r1)     // Catch: java.io.IOException -> L98
            goto L93
        L76:
            java.lang.String r1 = "\\b"
            r6.append(r1)     // Catch: java.io.IOException -> L98
            goto L93
        L7c:
            java.lang.String r1 = "\\\\"
            r6.append(r1)     // Catch: java.io.IOException -> L98
            goto L93
        L82:
            java.lang.String r1 = "\\\""
            r6.append(r1)     // Catch: java.io.IOException -> L98
            goto L93
        L88:
            java.lang.String r1 = "\\r"
            r6.append(r1)     // Catch: java.io.IOException -> L98
            goto L93
        L8e:
            java.lang.String r1 = "\\f"
            r6.append(r1)     // Catch: java.io.IOException -> L98
        L93:
            int r0 = r0 + 1
            goto L5
        L97:
            return
        L98:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "Impossible Exception"
            r4.<init>(r5)
            throw r4
    }

    @Override // xhss.InterfaceC0825
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public void mo1032(int r2, java.lang.Object r3) {
            r1 = this;
            int r1 = r1.f1996
            switch(r1) {
                case 13: goto L3a;
                default: goto L5;
            }
        L5:
            switch(r2) {
                case 1: goto L26;
                case 2: goto L23;
                case 3: goto L20;
                case 4: goto L1d;
                case 5: goto L1a;
                case 6: goto L17;
                case 7: goto L14;
                case 8: goto L11;
                case 9: goto L8;
                case 10: goto Le;
                case 11: goto Lb;
                default: goto L8;
            }
        L8:
            java.lang.String r1 = ""
            goto L28
        Lb:
            java.lang.String r1 = "RESULT_DELETE_SKIP_FILE_SUCCESS"
            goto L28
        Le:
            java.lang.String r1 = "RESULT_INSTALL_SKIP_FILE_SUCCESS"
            goto L28
        L11:
            java.lang.String r1 = "RESULT_PARSE_EXCEPTION"
            goto L28
        L14:
            java.lang.String r1 = "RESULT_IO_EXCEPTION"
            goto L28
        L17:
            java.lang.String r1 = "RESULT_BASELINE_PROFILE_NOT_FOUND"
            goto L28
        L1a:
            java.lang.String r1 = "RESULT_DESIRED_FORMAT_UNSUPPORTED"
            goto L28
        L1d:
            java.lang.String r1 = "RESULT_NOT_WRITABLE"
            goto L28
        L20:
            java.lang.String r1 = "RESULT_UNSUPPORTED_ART_VERSION"
            goto L28
        L23:
            java.lang.String r1 = "RESULT_ALREADY_INSTALLED"
            goto L28
        L26:
            java.lang.String r1 = "RESULT_INSTALL_SUCCESS"
        L28:
            r0 = 6
            if (r2 == r0) goto L33
            r0 = 7
            if (r2 == r0) goto L33
            r0 = 8
            if (r2 == r0) goto L33
            goto L3a
        L33:
            java.lang.String r2 = "ProfileInstaller"
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            android.util.Log.e(r2, r1, r3)
        L3a:
            return
    }

    @Override // xhss.InterfaceC0608
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public xhss.InterfaceC0869 mo1033(java.lang.String r1) {
            r0 = this;
            xhss.ᛲᛳᛶᛷ r0 = xhss.C0145.f618
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public android.graphics.Typeface m1034(android.content.Context r6, java.util.List r7, int r8) {
            r5 = this;
            android.content.ContentResolver r6 = r6.getContentResolver()
            r0 = 0
            r1 = 0
            java.lang.Object r0 = r7.get(r0)     // Catch: java.lang.Exception -> L2f
            xhss.ᛵᛶᲈᛳ[] r0 = (xhss.C0486[]) r0     // Catch: java.lang.Exception -> L2f
            android.graphics.fonts.FontFamily r0 = r5.m1036(r0, r6)     // Catch: java.lang.Exception -> L2f
            if (r0 != 0) goto L13
            return r1
        L13:
            android.graphics.Typeface$CustomFallbackBuilder r2 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L2f
            r2.<init>(r0)     // Catch: java.lang.Exception -> L2f
            r3 = 1
        L19:
            int r4 = r7.size()     // Catch: java.lang.Exception -> L2f
            if (r3 >= r4) goto L34
            java.lang.Object r4 = r7.get(r3)     // Catch: java.lang.Exception -> L2f
            xhss.ᛵᛶᲈᛳ[] r4 = (xhss.C0486[]) r4     // Catch: java.lang.Exception -> L2f
            android.graphics.fonts.FontFamily r4 = r5.m1036(r4, r6)     // Catch: java.lang.Exception -> L2f
            if (r4 == 0) goto L31
            r2.addCustomFallback(r4)     // Catch: java.lang.Exception -> L2f
            goto L31
        L2f:
            r5 = move-exception
            goto L45
        L31:
            int r3 = r3 + 1
            goto L19
        L34:
            android.graphics.fonts.Font r5 = m1029(r0, r8)     // Catch: java.lang.Exception -> L2f
            android.graphics.fonts.FontStyle r5 = r5.getStyle()     // Catch: java.lang.Exception -> L2f
            android.graphics.Typeface$CustomFallbackBuilder r5 = r2.setStyle(r5)     // Catch: java.lang.Exception -> L2f
            android.graphics.Typeface r5 = r5.build()     // Catch: java.lang.Exception -> L2f
            return r5
        L45:
            java.lang.String r6 = "TypefaceCompatApi29Impl"
            java.lang.String r7 = "Font load failed"
            android.util.Log.w(r6, r7, r5)
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public boolean m1035(java.lang.String r10) {
            r9 = this;
            int r9 = r9.f1996
            r0 = 45
            r1 = 57
            r2 = 48
            r3 = 0
            r4 = 1
            switch(r9) {
                case 1: goto L67;
                case 2: goto Le;
                default: goto Ld;
            }
        Ld:
            return r4
        Le:
            if (r10 != 0) goto L11
            goto L66
        L11:
            int r9 = r10.length()
            if (r9 != 0) goto L19
        L17:
            r3 = r4
            goto L66
        L19:
            java.lang.String r5 = r10.trim()
            if (r5 == r10) goto L20
            goto L17
        L20:
            char r5 = r10.charAt(r3)
            if (r5 < r2) goto L28
            if (r5 <= r1) goto L17
        L28:
            if (r5 != r0) goto L2b
            goto L17
        L2b:
            r0 = r3
        L2c:
            if (r0 >= r9) goto L5f
            char r1 = r10.charAt(r0)
            r2 = 13
            if (r1 == r2) goto L17
            r2 = 10
            if (r1 == r2) goto L17
            r5 = 9
            if (r1 == r5) goto L17
            r5 = 32
            if (r1 != r5) goto L43
            goto L17
        L43:
            boolean r5 = xhss.AbstractC0060.m194(r1)
            if (r5 == 0) goto L4a
            goto L17
        L4a:
            r5 = 8
            if (r1 == r5) goto L17
            r5 = 12
            if (r1 == r5) goto L17
            if (r1 != r2) goto L55
            goto L17
        L55:
            boolean r1 = xhss.AbstractC0060.m185(r1)
            if (r1 == 0) goto L5c
            goto L17
        L5c:
            int r0 = r0 + 1
            goto L2c
        L5f:
            boolean r9 = xhss.AbstractC0060.m189(r10)
            if (r9 == 0) goto L66
            goto L17
        L66:
            return r3
        L67:
            if (r10 != 0) goto L6b
            goto L118
        L6b:
            int r9 = r10.length()
            if (r9 != 0) goto L74
        L71:
            r3 = r4
            goto L118
        L74:
            java.lang.String r5 = r10.trim()
            if (r5 == r10) goto L7b
            goto L71
        L7b:
            char r5 = r10.charAt(r3)
            boolean r6 = xhss.AbstractC0060.m194(r5)
            if (r6 != 0) goto L71
            boolean r5 = xhss.AbstractC0060.m185(r5)
            if (r5 == 0) goto L8c
            goto L71
        L8c:
            r5 = r4
        L8d:
            if (r5 >= r9) goto Lae
            char r6 = r10.charAt(r5)
            r7 = 125(0x7d, float:1.75E-43)
            if (r6 == r7) goto L71
            r7 = 93
            if (r6 == r7) goto L71
            r7 = 44
            if (r6 == r7) goto L71
            r7 = 58
            if (r6 != r7) goto La4
            goto L71
        La4:
            boolean r6 = xhss.AbstractC0060.m185(r6)
            if (r6 == 0) goto Lab
            goto L71
        Lab:
            int r5 = r5 + 1
            goto L8d
        Lae:
            boolean r5 = xhss.AbstractC0060.m189(r10)
            if (r5 == 0) goto Lb5
            goto L71
        Lb5:
            char r5 = r10.charAt(r3)
            if (r5 < r2) goto Lbd
            if (r5 <= r1) goto Lbf
        Lbd:
            if (r5 != r0) goto L118
        Lbf:
            r6 = r4
        Lc0:
            if (r6 >= r9) goto Lce
            char r5 = r10.charAt(r6)
            if (r5 < r2) goto Lce
            if (r5 <= r1) goto Lcb
            goto Lce
        Lcb:
            int r6 = r6 + 1
            goto Lc0
        Lce:
            if (r6 != r9) goto Ld1
            goto L71
        Ld1:
            r7 = 46
            if (r5 != r7) goto Ld7
        Ld5:
            int r6 = r6 + 1
        Ld7:
            if (r6 >= r9) goto Le1
            char r5 = r10.charAt(r6)
            if (r5 < r2) goto Le1
            if (r5 <= r1) goto Ld5
        Le1:
            if (r6 != r9) goto Le4
            goto L71
        Le4:
            r7 = 69
            if (r5 == r7) goto Lec
            r7 = 101(0x65, float:1.42E-43)
            if (r5 != r7) goto L103
        Lec:
            int r5 = r6 + 1
            if (r5 != r9) goto Lf1
            goto L118
        Lf1:
            char r7 = r10.charAt(r5)
            r8 = 43
            if (r7 == r8) goto Lfe
            if (r7 != r0) goto Lfc
            goto Lfe
        Lfc:
            r6 = r5
            goto L103
        Lfe:
            int r6 = r6 + 2
            r10.charAt(r6)
        L103:
            if (r6 != r9) goto L106
            goto L118
        L106:
            if (r6 >= r9) goto L114
            char r0 = r10.charAt(r6)
            if (r0 < r2) goto L114
            if (r0 <= r1) goto L111
            goto L114
        L111:
            int r6 = r6 + 1
            goto L106
        L114:
            if (r6 != r9) goto L118
            goto L71
        L118:
            return r3
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public android.graphics.fonts.FontFamily m1036(xhss.C0486[] r10, android.content.ContentResolver r11) {
            r9 = this;
            int r0 = r10.length
            r1 = 0
            r2 = 0
            r3 = r1
        L4:
            if (r2 >= r0) goto L7d
            r4 = r10[r2]
            android.net.Uri r5 = r4.f1789
            java.lang.String r5 = r5.getScheme()
            java.lang.String r6 = "systemfont"
            boolean r5 = java.util.Objects.equals(r5, r6)
            if (r5 == 0) goto L1b
            android.graphics.fonts.Font r4 = r9.mo1037(r4)
            goto L6c
        L1b:
            android.net.Uri r5 = r4.f1789     // Catch: java.io.IOException -> L2e
            java.lang.String r6 = r4.f1788     // Catch: java.io.IOException -> L2e
            java.lang.String r7 = "r"
            android.os.ParcelFileDescriptor r5 = r11.openFileDescriptor(r5, r7, r1)     // Catch: java.io.IOException -> L2e
            if (r5 != 0) goto L30
            if (r5 == 0) goto L2c
            r5.close()     // Catch: java.io.IOException -> L2e
        L2c:
            r4 = r1
            goto L6c
        L2e:
            r4 = move-exception
            goto L64
        L30:
            android.graphics.fonts.Font$Builder r7 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Throwable -> L51
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L51
            int r8 = r4.f1787     // Catch: java.lang.Throwable -> L51
            android.graphics.fonts.Font$Builder r7 = r7.setWeight(r8)     // Catch: java.lang.Throwable -> L51
            boolean r8 = r4.f1790     // Catch: java.lang.Throwable -> L51
            android.graphics.fonts.Font$Builder r7 = r7.setSlant(r8)     // Catch: java.lang.Throwable -> L51
            int r4 = r4.f1786     // Catch: java.lang.Throwable -> L51
            android.graphics.fonts.Font$Builder r4 = r7.setTtcIndex(r4)     // Catch: java.lang.Throwable -> L51
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L51
            if (r7 != 0) goto L53
            r4.setFontVariationSettings(r6)     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            r4 = move-exception
            goto L5b
        L53:
            android.graphics.fonts.Font r4 = r4.build()     // Catch: java.lang.Throwable -> L51
            r5.close()     // Catch: java.io.IOException -> L2e
            goto L6c
        L5b:
            r5.close()     // Catch: java.lang.Throwable -> L5f
            goto L63
        L5f:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.io.IOException -> L2e
        L63:
            throw r4     // Catch: java.io.IOException -> L2e
        L64:
            java.lang.String r5 = "TypefaceCompatApi29Impl"
            java.lang.String r6 = "Font load failed"
            android.util.Log.w(r5, r6, r4)
            goto L2c
        L6c:
            if (r4 != 0) goto L6f
            goto L7a
        L6f:
            if (r3 != 0) goto L77
            android.graphics.fonts.FontFamily$Builder r3 = new android.graphics.fonts.FontFamily$Builder
            r3.<init>(r4)
            goto L7a
        L77:
            r3.addFont(r4)
        L7a:
            int r2 = r2 + 1
            goto L4
        L7d:
            if (r3 != 0) goto L80
            return r1
        L80:
            android.graphics.fonts.FontFamily r9 = r3.build()
            return r9
    }

    @Override // xhss.InterfaceC0010
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public void mo107() {
            r0 = this;
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC1069.f3451
            return
    }

    @Override // xhss.InterfaceC1060
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public boolean mo536(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.f1996
            switch(r0) {
                case 20: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public android.graphics.fonts.Font mo1037(xhss.C0486 r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Getting font from Typeface is not supported before API31"
            r0.<init>(r1)
            throw r0
    }
}
