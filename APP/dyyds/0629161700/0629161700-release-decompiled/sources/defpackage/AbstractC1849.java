package defpackage;

/* JADX INFO: renamed from: ᲁᛴᲀᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1849 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C1403 f8080 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C1654 f8081 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1654 f8082 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C1934 f8083;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static boolean f8084;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static java.lang.reflect.Method f8085;

    static {
            ᲀᛴᛱᛱ r0 = new ᲀᛴᛱᛱ
            r1 = 29
            r0.<init>(r1)
            defpackage.AbstractC1849.f8082 = r0
            ᲀᛴᛱᛱ r0 = new ᲀᛴᛱᛱ
            r1 = 28
            r0.<init>(r1)
            defpackage.AbstractC1849.f8081 = r0
            ᛷᲈᲀ r0 = new ᛷᲈᲀ
            r1 = 27
            r0.<init>(r1)
            defpackage.AbstractC1849.f8080 = r0
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static boolean m3239(java.lang.String r3) {
            int r0 = r3.length()
            r1 = 3
            r2 = 0
            if (r0 >= r1) goto L9
            return r2
        L9:
            char r0 = r3.charAt(r2)
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 != r1) goto L18
            java.lang.String r0 = "null"
            boolean r3 = r3.equals(r0)
            return r3
        L18:
            r1 = 116(0x74, float:1.63E-43)
            if (r0 != r1) goto L23
            java.lang.String r0 = "true"
            boolean r3 = r3.equals(r0)
            return r3
        L23:
            r1 = 102(0x66, float:1.43E-43)
            if (r0 != r1) goto L2e
            java.lang.String r0 = "false"
            boolean r3 = r3.equals(r0)
            return r3
        L2e:
            r1 = 78
            if (r0 != r1) goto L39
            java.lang.String r0 = "NaN"
            boolean r3 = r3.equals(r0)
            return r3
        L39:
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static boolean m3240(char r1) {
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L23
            r0 = 91
            if (r1 == r0) goto L23
            r0 = 44
            if (r1 == r0) goto L23
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L23
            r0 = 93
            if (r1 == r0) goto L23
            r0 = 58
            if (r1 == r0) goto L23
            r0 = 39
            if (r1 == r0) goto L23
            r0 = 34
            if (r1 != r0) goto L21
            goto L23
        L21:
            r1 = 0
            return r1
        L23:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static com.bumptech.glide.load.ImageHeaderParser$ImageType m3241(java.util.ArrayList r3, java.io.InputStream r4, defpackage.C2063 r5) {
            if (r4 != 0) goto L5
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
            return r3
        L5:
            boolean r0 = r4.markSupported()
            if (r0 != 0) goto L11
            ᲈᛵᲈᛲ r0 = new ᲈᛵᲈᛲ
            r0.<init>(r4, r5)
            r4 = r0
        L11:
            r5 = 5242880(0x500000, float:7.34684E-39)
            r4.mark(r5)
            int r5 = r3.size()
            r0 = 0
        L1b:
            if (r0 >= r5) goto L37
            java.lang.Object r1 = r3.get(r0)
            ᛷᛱᲇᛴ r1 = (defpackage.InterfaceC1215) r1
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = r1.mo805(r4)     // Catch: java.lang.Throwable -> L32
            r4.reset()
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
            if (r1 == r2) goto L2f
            return r1
        L2f:
            int r0 = r0 + 1
            goto L1b
        L32:
            r3 = move-exception
            r4.reset()
            throw r3
        L37:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
            return r3
    }

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public static java.lang.String m3242(java.lang.String r11) {
            if (r11 != 0) goto L4
            r11 = 0
            return r11
        L4:
            int r0 = r11.length()
            java.io.StringWriter r1 = new java.io.StringWriter
            r1.<init>(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 4
            r2.<init>(r3)
            r4 = 0
            r5 = r4
            r6 = r5
            r7 = r6
        L17:
            r8 = 92
            if (r5 >= r0) goto Lb6
            char r9 = r11.charAt(r5)
            if (r7 == 0) goto L54
            r2.append(r9)
            int r8 = r2.length()
            if (r8 != r3) goto Lb2
            java.lang.String r6 = r2.toString()     // Catch: java.lang.NumberFormatException -> L3f
            r7 = 16
            int r6 = java.lang.Integer.parseInt(r6, r7)     // Catch: java.lang.NumberFormatException -> L3f
            char r6 = (char) r6     // Catch: java.lang.NumberFormatException -> L3f
            r1.write(r6)     // Catch: java.lang.NumberFormatException -> L3f
            r2.setLength(r4)     // Catch: java.lang.NumberFormatException -> L3f
            r6 = r4
            r7 = r6
            goto Lb2
        L3f:
            r11 = move-exception
            ᛸᛵᛳᲀ r0 = new ᛸᛵᛳᲀ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to parse unicode value: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r11)
            throw r0
        L54:
            r10 = 1
            if (r6 == 0) goto Lab
            r6 = 34
            if (r9 == r6) goto La6
            r6 = 39
            if (r9 == r6) goto La2
            if (r9 == r8) goto L9e
            r6 = 98
            if (r9 == r6) goto L98
            r6 = 102(0x66, float:1.43E-43)
            if (r9 == r6) goto L92
            r6 = 110(0x6e, float:1.54E-43)
            if (r9 == r6) goto L8c
            r6 = 114(0x72, float:1.6E-43)
            if (r9 == r6) goto L86
            r6 = 116(0x74, float:1.63E-43)
            if (r9 == r6) goto L80
            r6 = 117(0x75, float:1.64E-43)
            if (r9 == r6) goto L7d
            r1.write(r9)
            goto La9
        L7d:
            r6 = r4
            r7 = r10
            goto Lb2
        L80:
            r6 = 9
            r1.write(r6)
            goto La9
        L86:
            r6 = 13
            r1.write(r6)
            goto La9
        L8c:
            r6 = 10
            r1.write(r6)
            goto La9
        L92:
            r6 = 12
            r1.write(r6)
            goto La9
        L98:
            r6 = 8
            r1.write(r6)
            goto La9
        L9e:
            r1.write(r8)
            goto La9
        La2:
            r1.write(r6)
            goto La9
        La6:
            r1.write(r6)
        La9:
            r6 = r4
            goto Lb2
        Lab:
            if (r9 != r8) goto Laf
            r6 = r10
            goto Lb2
        Laf:
            r1.write(r9)
        Lb2:
            int r5 = r5 + 1
            goto L17
        Lb6:
            if (r6 == 0) goto Lbb
            r1.write(r8)
        Lbb:
            java.lang.String r11 = r1.toString()
            return r11
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public static defpackage.C1063[] m3243(int r3) {
            ᛶᛴᲀᲇ[] r0 = new defpackage.C1063[r3]
            r1 = 0
        L3:
            if (r1 >= r3) goto Lf
            ᛶᛴᲀᲇ r2 = new ᛶᛴᲀᲇ
            r2.<init>()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L3
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public static final java.lang.Object m3244(java.lang.Object r1) {
            boolean r0 = r1 instanceof defpackage.C0142
            if (r0 == 0) goto Le
            ᛱᛸᛳᛱ r1 = (defpackage.C0142) r1
            java.lang.Throwable r1 = r1.f1092
            ᛴᛸᛲᲀ r0 = new ᛴᛸᛲᲀ
            r0.<init>(r1)
            return r0
        Le:
            return r1
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static java.lang.String m3245(long r7) {
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L10
            r7 = -158390088539694(0xffff6ff1ef0961d2, double:NaN)
            java.lang.String r7 = "0 B"
            return r7
        L10:
            r0 = -158407268408878(0xffff6fedef0961d2, double:NaN)
            java.lang.String r0 = "B"
            r1 = -158415858343470(0xffff6febef0961d2, double:NaN)
            java.lang.String r1 = "KB"
            r2 = -158428743245358(0xffff6fe8ef0961d2, double:NaN)
            java.lang.String r2 = "MB"
            r3 = -158441628147246(0xffff6fe5ef0961d2, double:NaN)
            java.lang.String r3 = "GB"
            r4 = -158454513049134(0xffff6fe2ef0961d2, double:NaN)
            java.lang.String r4 = "TB"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4}
            double r1 = (double) r7
            r3 = 0
        L43:
            r4 = 4652218415073722368(0x4090000000000000, double:1024.0)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 < 0) goto L50
            r6 = 4
            if (r3 >= r6) goto L50
            double r1 = r1 / r4
            int r3 = r3 + 1
            goto L43
        L50:
            if (r3 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r7 = -158467397951022(0xffff6fdfef0961d2, double:NaN)
            java.lang.String r7 = " B"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            return r7
        L6b:
            java.util.Locale r7 = java.util.Locale.getDefault()
            r4 = -158480282852910(0xffff6fdcef0961d2, double:NaN)
            java.lang.String r8 = "%.2f %s"
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0 = r0[r3]
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            r1 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r7 = java.lang.String.format(r7, r8, r0)
            r0 = -158514642591278(0xffff6fd4ef0961d2, double:NaN)
            return r7
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static boolean m3246(char r1) {
            if (r1 < 0) goto L6
            r0 = 31
            if (r1 <= r0) goto L16
        L6:
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 < r0) goto Le
            r0 = 159(0x9f, float:2.23E-43)
            if (r1 <= r0) goto L16
        Le:
            r0 = 8192(0x2000, float:1.148E-41)
            if (r1 < r0) goto L18
            r0 = 8447(0x20ff, float:1.1837E-41)
            if (r1 > r0) goto L18
        L16:
            r1 = 1
            return r1
        L18:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static java.lang.String m3247(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r0 = -405952003481134(0xfffe8ec9ef0961d2, double:NaN)
            r0 = -405994953154094(0xfffe8ebfef0961d2, double:NaN)
            r0 = -406037902827054(0xfffe8eb5ef0961d2, double:NaN)
            java.lang.reflect.Method r0 = defpackage.AbstractC1849.f8085
            r1 = 0
            if (r0 != 0) goto L5a
            r4 = -406072262565422(0xfffe8eadef0961d2, double:NaN)
            java.lang.String r4 = "encodeMotionPhoto: encodeMethod is not initialized"
            r5 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r2 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r5 = defpackage.AbstractC0225.m818(r5, r4, r2)
            if (r5 != 0) goto L38
            goto L115
        L38:
            int r5 = r4.length()
            r6 = 0
        L3d:
            if (r6 >= r5) goto L115
            int r0 = r6 + 2000
            if (r0 <= r5) goto L44
            r0 = r5
        L44:
            java.lang.String r6 = r4.substring(r6, r0)
            r2 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1040(r6)
            r6 = r0
            goto L3d
        L5a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = -406291305897518(0xfffe8e7aef0961d2, double:NaN)
            java.lang.String r2 = "encodeMotionPhoto: imagePath = "
            r0.<init>(r2)
            r0.append(r4)
            r2 = -406428744850990(0xfffe8e5aef0961d2, double:NaN)
            java.lang.String r2 = ", videoPath = "
            r0.append(r2)
            r0.append(r5)
            r2 = -406493169360430(0xfffe8e4bef0961d2, double:NaN)
            java.lang.String r2 = ", outPath = "
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            defpackage.AbstractC1592.m2872(r0)
            java.lang.reflect.Method r0 = defpackage.AbstractC1849.f8085
            if (r0 == 0) goto L95
            goto L9e
        L95:
            r2 = -405861809167918(0xfffe8edeef0961d2, double:NaN)
            r0 = r1
        L9e:
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6}
            java.lang.Object r4 = r0.invoke(r1, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r2 = -406549003935278(0xfffe8e3eef0961d2, double:NaN)
            java.lang.String r6 = "invoke = "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            defpackage.AbstractC1592.m2872(r5)
            int r5 = defpackage.AbstractC0233.f1405
            ᛶᲈᛱᲈ r4 = defpackage.AbstractC2279.m3695(r4)
            java.lang.Object r5 = r4.f5356
            ᛷᲇᛱᲈ r5 = (defpackage.C1380) r5
            r6 = 2
            r5.f6021 = r6
            ᛵᛷᛶᲇ r4 = r4.m2300()
            ᛳᛸᲈᲁ r5 = defpackage.EnumC0538.f2659
            ᛳᛸᲈᲁ[] r5 = new defpackage.EnumC0538[]{r5}
            r6 = 1
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)
            ᛳᛸᲈᲁ[] r5 = (defpackage.EnumC0538[]) r5
            java.util.LinkedHashSet r6 = r4.f4428
            defpackage.AbstractC1376.m2543(r6, r5)
            r5 = -406591953608238(0xfffe8e34ef0961d2, double:NaN)
            java.lang.String r5 = "java.util.List"
            r4.f4197 = r5
            java.util.List r4 = r4.mo1885()
            java.lang.Object r4 = defpackage.AbstractC1107.m2124(r4)
            ᲀᛳᲇᲁ r4 = (defpackage.C1652) r4
            if (r4 == 0) goto Lfd
            java.lang.Object r4 = r4.m3036()
            goto Lfe
        Lfd:
            r4 = r1
        Lfe:
            boolean r5 = r4 instanceof java.util.List
            if (r5 == 0) goto L105
            java.util.List r4 = (java.util.List) r4
            goto L106
        L105:
            r4 = r1
        L106:
            if (r4 == 0) goto L10d
            java.lang.Object r4 = defpackage.AbstractC1107.m2122(r4)
            goto L10e
        L10d:
            r4 = r1
        L10e:
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L115
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L115:
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static boolean m3248(java.io.File r6) {
            boolean r0 = r6.isDirectory()
            r1 = 1
            if (r0 == 0) goto L25
            java.io.File[] r6 = r6.listFiles()
            r0 = 0
            if (r6 != 0) goto Lf
            return r0
        Lf:
            int r2 = r6.length
            r3 = r0
            r4 = r1
        L12:
            if (r3 >= r2) goto L24
            r5 = r6[r3]
            boolean r5 = m3248(r5)
            if (r5 == 0) goto L20
            if (r4 == 0) goto L20
            r4 = r1
            goto L21
        L20:
            r4 = r0
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            return r4
        L25:
            r6.delete()
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m3249(defpackage.C1621 r12, defpackage.C2118 r13) {
            int r13 = r13.f9083
            r0 = 12
            if (r13 != r0) goto L8
            r13 = 10
        L8:
            switch(r13) {
                case 1: goto L6e;
                case 2: goto L60;
                case 3: goto L52;
                case 4: goto L44;
                case 5: goto L36;
                case 6: goto L28;
                case 7: goto L1a;
                case 8: goto Lc;
                default: goto Lb;
            }
        Lb:
            return
        Lc:
            java.lang.String r4 = "(D)Ljava/lang/Double;"
            r5 = 0
            r1 = 184(0xb8, float:2.58E-43)
            java.lang.String r2 = "java/lang/Double"
            java.lang.String r3 = "valueOf"
            r0 = r12
            r0.m2916(r1, r2, r3, r4, r5)
            return
        L1a:
            r6 = r12
            java.lang.String r10 = "(J)Ljava/lang/Long;"
            r11 = 0
            r7 = 184(0xb8, float:2.58E-43)
            java.lang.String r8 = "java/lang/Long"
            java.lang.String r9 = "valueOf"
            r6.m2916(r7, r8, r9, r10, r11)
            return
        L28:
            r6 = r12
            java.lang.String r10 = "(F)Ljava/lang/Float;"
            r11 = 0
            r7 = 184(0xb8, float:2.58E-43)
            java.lang.String r8 = "java/lang/Float"
            java.lang.String r9 = "valueOf"
            r6.m2916(r7, r8, r9, r10, r11)
            return
        L36:
            r6 = r12
            java.lang.String r10 = "(I)Ljava/lang/Integer;"
            r11 = 0
            r7 = 184(0xb8, float:2.58E-43)
            java.lang.String r8 = "java/lang/Integer"
            java.lang.String r9 = "valueOf"
            r6.m2916(r7, r8, r9, r10, r11)
            return
        L44:
            r6 = r12
            java.lang.String r10 = "(S)Ljava/lang/Short;"
            r11 = 0
            r7 = 184(0xb8, float:2.58E-43)
            java.lang.String r8 = "java/lang/Short"
            java.lang.String r9 = "valueOf"
            r6.m2916(r7, r8, r9, r10, r11)
            return
        L52:
            r6 = r12
            java.lang.String r10 = "(B)Ljava/lang/Byte;"
            r11 = 0
            r7 = 184(0xb8, float:2.58E-43)
            java.lang.String r8 = "java/lang/Byte"
            java.lang.String r9 = "valueOf"
            r6.m2916(r7, r8, r9, r10, r11)
            return
        L60:
            r6 = r12
            java.lang.String r10 = "(C)Ljava/lang/Character;"
            r11 = 0
            r7 = 184(0xb8, float:2.58E-43)
            java.lang.String r8 = "java/lang/Character"
            java.lang.String r9 = "valueOf"
            r6.m2916(r7, r8, r9, r10, r11)
            return
        L6e:
            r6 = r12
            java.lang.String r10 = "(Z)Ljava/lang/Boolean;"
            r11 = 0
            r7 = 184(0xb8, float:2.58E-43)
            java.lang.String r8 = "java/lang/Boolean"
            java.lang.String r9 = "valueOf"
            r6.m2916(r7, r8, r9, r10, r11)
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static com.bumptech.glide.load.ImageHeaderParser$ImageType m3250(java.util.ArrayList r5, java.nio.ByteBuffer r6) {
            if (r6 != 0) goto L5
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
            return r5
        L5:
            int r0 = r5.size()
            r1 = 0
            r2 = r1
        Lb:
            if (r2 >= r0) goto L31
            java.lang.Object r3 = r5.get(r2)
            ᛷᛱᲇᛴ r3 = (defpackage.InterfaceC1215) r3
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = r3.mo803(r6)     // Catch: java.lang.Throwable -> L27
            java.util.concurrent.atomic.AtomicReference r4 = defpackage.AbstractC0036.f535
            java.nio.Buffer r4 = r6.position(r1)
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
            if (r3 == r4) goto L24
            return r3
        L24:
            int r2 = r2 + 1
            goto Lb
        L27:
            r5 = move-exception
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.AbstractC0036.f535
            java.nio.Buffer r6 = r6.position(r1)
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            throw r5
        L31:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
            return r5
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static java.lang.String m3251(java.lang.String r2, java.lang.String r3, java.lang.Iterable r4) {
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto Ld
            java.lang.String r2 = ""
            return r2
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.Object r1 = r4.next()
            r0.append(r1)
            r0.append(r3)
        L1f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L36
            r0.append(r2)
            r0.append(r3)
            java.lang.Object r1 = r4.next()
            r0.append(r1)
            r0.append(r3)
            goto L1f
        L36:
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public static void m3252(java.lang.CharSequence r0, java.lang.String r1) {
            if (r0 == 0) goto L9
            int r0 = r0.length()
            if (r0 == 0) goto L9
            return
        L9:
            defpackage.C2264.m3684(r1)
            return
    }

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public static void m3253(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            defpackage.C2264.m3684(r1)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.lang.String m3254(java.lang.CharSequence... r7) {
            int r0 = r7.length
            if (r0 != 0) goto L4
            goto L2d
        L4:
            int r0 = r7.length
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L10
            r7 = r7[r2]
            java.lang.String r7 = r7.toString()
            return r7
        L10:
            r0 = -1
            r4 = r0
            r1 = r2
            r3 = r1
        L14:
            int r5 = r7.length
            if (r1 >= r5) goto L2b
            r5 = r7[r1]
            int r5 = r5.length()
            int r3 = r3 + r5
            r6 = -2
            if (r4 == r6) goto L28
            if (r5 <= 0) goto L28
            if (r4 != r0) goto L27
            r4 = r1
            goto L28
        L27:
            r4 = r6
        L28:
            int r1 = r1 + 1
            goto L14
        L2b:
            if (r3 != 0) goto L30
        L2d:
            java.lang.String r7 = ""
            return r7
        L30:
            if (r4 <= 0) goto L39
            r7 = r7[r4]
            java.lang.String r7 = r7.toString()
            return r7
        L39:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            int r1 = r7.length
        L3f:
            if (r2 >= r1) goto L49
            r3 = r7[r2]
            r0.append(r3)
            int r2 = r2 + 1
            goto L3f
        L49:
            java.lang.String r7 = r0.toString()
            return r7
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static java.lang.String m3255(java.lang.String r6) {
            int r0 = r6.length()
            int r1 = r0 + 3
            char[] r1 = new char[r1]
            r2 = 103(0x67, float:1.44E-43)
            r3 = 0
            r1[r3] = r2
            r2 = 101(0x65, float:1.42E-43)
            r4 = 1
            r1[r4] = r2
            r2 = 2
            r5 = 116(0x74, float:1.63E-43)
            r1[r2] = r5
            char r2 = r6.charAt(r3)
            r3 = 97
            if (r2 < r3) goto L26
            r3 = 122(0x7a, float:1.71E-43)
            if (r2 > r3) goto L26
            int r2 = r2 + (-32)
            char r2 = (char) r2
        L26:
            r3 = 3
            r1[r3] = r2
        L29:
            if (r4 >= r0) goto L36
            int r2 = r4 + 3
            char r3 = r6.charAt(r4)
            r1[r2] = r3
            int r4 = r4 + 1
            goto L29
        L36:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1)
            return r6
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static int m3257(java.util.ArrayList r4, java.io.InputStream r5, defpackage.C2063 r6) {
            r0 = -1
            if (r5 != 0) goto L4
            goto L34
        L4:
            boolean r1 = r5.markSupported()
            if (r1 != 0) goto L10
            ᲈᛵᲈᛲ r1 = new ᲈᛵᲈᛲ
            r1.<init>(r5, r6)
            r5 = r1
        L10:
            r1 = 5242880(0x500000, float:7.34684E-39)
            r5.mark(r1)
            int r1 = r4.size()
            r2 = 0
        L1a:
            if (r2 >= r1) goto L34
            java.lang.Object r3 = r4.get(r2)
            ᛷᛱᲇᛴ r3 = (defpackage.InterfaceC1215) r3
            int r3 = r3.mo804(r5, r6)     // Catch: java.lang.Throwable -> L2f
            r5.reset()
            if (r3 == r0) goto L2c
            return r3
        L2c:
            int r2 = r2 + 1
            goto L1a
        L2f:
            r4 = move-exception
            r5.reset()
            throw r4
        L34:
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public abstract java.lang.reflect.Member mo711();

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public /* synthetic */ void m3258() {
            r2 = this;
            java.lang.reflect.Member r0 = r2.mo711()
            boolean r0 = defpackage.AbstractC0399.m1161(r0)
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to make the member \""
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = "\" accessible. Please check if the member is accessible or if the security manager allows it."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }
}
