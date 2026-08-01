package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class pd2 {

    /* JADX INFO: renamed from: α */
    public static final p000.C0869ue f8518 = null;

    /* JADX INFO: renamed from: β */
    public static final p000.C0394ig f8519 = null;

    /* JADX INFO: renamed from: γ */
    public static final p000.rk0 f8520 = null;

    /* JADX INFO: renamed from: δ */
    public static final p000.C0538m6 f8521 = null;

    /* JADX INFO: renamed from: ε */
    public static p000.C0538m6 f8522;

    /* JADX INFO: renamed from: ζ */
    public static final java.lang.StackTraceElement[] f8523 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.C0889uy f8524 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.C0889uy f8525 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.hu1 f8526 = null;

    /* JADX INFO: renamed from: κ */
    public static final p000.hu1 f8527 = null;

    /* JADX INFO: renamed from: λ */
    public static final p000.hu1 f8528 = null;

    /* JADX INFO: renamed from: μ */
    public static java.lang.ref.WeakReference f8529;

    static {
            ue r0 = new ue
            r0.<init>()
            p000.pd2.f8518 = r0
            ig r0 = new ig
            r1 = 10
            r0.<init>(r1)
            p000.pd2.f8519 = r0
            rk0 r0 = new rk0
            r1 = 0
            r0.<init>(r1)
            p000.pd2.f8520 = r0
            m6 r0 = new m6
            r1 = 0
            r0.<init>(r1, r1, r1)
            p000.pd2.f8521 = r0
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            p000.pd2.f8523 = r0
            uy r0 = new uy
            java.lang.String r1 = "NO_VALUE"
            r2 = 1
            r0.<init>(r1, r2)
            p000.pd2.f8524 = r0
            uy r0 = new uy
            java.lang.String r1 = "NO_THREAD_ELEMENTS"
            r0.<init>(r1, r2)
            p000.pd2.f8525 = r0
            hu1 r0 = new hu1
            r1 = 5
            r0.<init>(r1)
            p000.pd2.f8526 = r0
            hu1 r0 = new hu1
            r1 = 6
            r0.<init>(r1)
            p000.pd2.f8527 = r0
            hu1 r0 = new hu1
            r1 = 7
            r0.<init>(r1)
            p000.pd2.f8528 = r0
            return
    }

    /* JADX INFO: renamed from: Α */
    public static void m4457(java.lang.Object r9, java.lang.String r10, java.lang.String r11) {
            java.lang.String r0 = "title"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L17
            java.lang.String r0 = "message"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L11
            goto L17
        L11:
            java.lang.String r9 = "不支持的 Dux 文本方法"
            p000.C1080.m7275(r9)
            return
        L17:
            java.lang.Class r0 = r9.getClass()
            java.lang.reflect.Method[] r0 = r0.getMethods()
            r0.getClass()
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r3
        L27:
            if (r2 >= r1) goto L4d
            r6 = r0[r2]
            java.lang.String r7 = r6.getName()
            boolean r7 = p000.ln0.m3626(r7, r10)
            if (r7 == 0) goto L4a
            java.lang.Class[] r7 = r6.getParameterTypes()
            java.lang.Class<java.lang.CharSequence> r8 = java.lang.CharSequence.class
            java.lang.Class[] r8 = new java.lang.Class[]{r8}
            boolean r7 = java.util.Arrays.equals(r7, r8)
            if (r7 == 0) goto L4a
            if (r4 == 0) goto L48
            goto L51
        L48:
            r4 = 1
            r5 = r6
        L4a:
            int r2 = r2 + 1
            goto L27
        L4d:
            if (r4 != 0) goto L50
            goto L51
        L50:
            r3 = r5
        L51:
            if (r3 == 0) goto L5b
            java.lang.Object[] r10 = new java.lang.Object[]{r11}
            r3.invoke(r9, r10)
            return
        L5b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Dux "
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r10 = " 契约不可用"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    /* JADX INFO: renamed from: Β */
    public static p000.C0363hl m4458() {
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r0 = 10
            rz r2 = p000.EnumC0117cl.f2194
            int r0 = p000.AbstractC1021yh.m6889(r2, r0)
            int r0 = p000.ex0.m1970(r0)
            r3 = 16
            if (r0 >= r3) goto L13
            r0 = r3
        L13:
            r1.<init>(r0)
            τ r4 = new τ
            r4.<init>(r2)
        L1b:
            boolean r0 = r4.hasNext()
            r2 = 0
            if (r0 == 0) goto L123
            java.lang.Object r5 = r4.next()
            r0 = r5
            cl r0 = (p000.EnumC0117cl) r0
            java.lang.Object r6 = p000.ui1.f10844
            java.lang.String r6 = r0.f2195
            boolean r0 = p000.ui1.m5900(r6)
            r7 = 0
            if (r0 == 0) goto L10a
            java.lang.String r0 = p000.ui1.m5889(r6)
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            int r8 = r0.length()
            if (r8 != 0) goto L48
            goto L10a
        L48:
            java.lang.String r8 = "#"
            java.lang.String r8 = p000.q02.m4678(r0, r8)
            int r9 = r8.length()
            r10 = 3
            java.lang.String r11 = "FF"
            if (r9 == r10) goto L9e
            r10 = 4
            if (r9 == r10) goto L69
            r2 = 6
            if (r9 == r2) goto L64
            r2 = 8
            if (r9 == r2) goto Ld8
        L61:
            r2 = r7
            goto Le7
        L64:
            java.lang.String r8 = r11.concat(r8)
            goto Ld8
        L69:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = r8.length()
            r9.<init>(r10)
        L72:
            int r10 = r8.length()
            if (r2 >= r10) goto L91
            char r10 = r8.charAt(r2)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.add(r10)
            int r2 = r2 + 1
            goto L72
        L91:
            r14 = 0
            r15 = 62
            java.lang.String r10 = ""
            r11 = 0
            r12 = 0
            r13 = 0
            java.lang.String r8 = p000.AbstractC0984xh.m6644(r9, r10, r11, r12, r13, r14, r15)
            goto Ld8
        L9e:
            java.util.ArrayList r12 = new java.util.ArrayList
            int r9 = r8.length()
            r12.<init>(r9)
        La7:
            int r9 = r8.length()
            if (r2 >= r9) goto Lc6
            char r9 = r8.charAt(r2)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r12.add(r9)
            int r2 = r2 + 1
            goto La7
        Lc6:
            r17 = 0
            r18 = 62
            java.lang.String r13 = ""
            r14 = 0
            r15 = 0
            r16 = 0
            java.lang.String r2 = p000.AbstractC0984xh.m6644(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r8 = r11.concat(r2)
        Ld8:
            java.lang.Long r2 = p000.x02.m6489(r8, r3)
            if (r2 == 0) goto L61
            long r8 = r2.longValue()
            int r2 = (int) r8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        Le7:
            if (r2 == 0) goto Lf2
            int r0 = r2.intValue()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            goto L10a
        Lf2:
            int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Throwable -> Lfb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lfb
            goto L102
        Lfb:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L102:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L107
            goto L108
        L107:
            r7 = r0
        L108:
            java.lang.Integer r7 = (java.lang.Integer) r7
        L10a:
            jl r0 = new jl
            boolean r2 = p000.ui1.m5902(r6)
            float r6 = p000.ui1.m5888(r6)
            r8 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            float r6 = p000.j81.m2905(r6, r8, r9)
            r0.<init>(r2, r6, r7)
            r1.put(r5, r0)
            goto L1b
        L123:
            hl r0 = new hl
            boolean r3 = p000.ui1.m5901()
            java.lang.String r4 = "comment_content_color_skip_mention"
            boolean r2 = p000.ui1.m5887(r4, r2)
            r0.<init>(r3, r2, r1)
            return r0
    }

    /* JADX INFO: renamed from: Γ */
    public static final p000.r01 m4459(p000.v80 r4, p000.r01 r5) {
            r0 = 439770924(0x1a365f2c, float:3.7713597E-23)
            r4.m6082(r0)
            a1 r0 = p000.C0002a1.f27
            boolean r0 = r5.mo4346(r0)
            r1 = 0
            if (r0 == 0) goto L10
            goto L2a
        L10:
            r0 = 1219399079(0x48ae8da7, float:357485.22)
            r2 = 0
            r4.m6079(r0, r2, r1, r2)
            ui r0 = new ui
            r2 = 2
            r3 = 26
            r0.<init>(r2, r3)
            p01 r2 = p000.p01.f8378
            java.lang.Object r5 = r5.mo4344(r0, r2)
            r01 r5 = (p000.r01) r5
            r4.m6100(r1)
        L2a:
            r4.m6100(r1)
            return r5
    }

    /* JADX INFO: renamed from: Δ */
    public static p000.InterfaceC0880up m4460(p000.InterfaceC0806sp r1, p000.InterfaceC0843tp r2) {
            r2.getClass()
            tp r0 = r1.getKey()
            boolean r2 = p000.ln0.m3626(r0, r2)
            if (r2 == 0) goto Lf
            hz r1 = p000.C0377hz.f4846
        Lf:
            return r1
    }

    /* JADX INFO: renamed from: Η */
    public static p000.C0281fd m4461(p000.vc0 r26) {
            r0 = r26
            r0.getClass()
            int r1 = r0.size()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L1d:
            if (r6 >= r1) goto L1bc
            java.lang.String r2 = r0.m6169(r6)
            r22 = 1
            java.lang.String r4 = r0.m6171(r6)
            java.lang.String r5 = "Cache-Control"
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L37
            if (r8 == 0) goto L35
        L33:
            r7 = 0
            goto L40
        L35:
            r8 = r4
            goto L40
        L37:
            java.lang.String r5 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L1b1
            goto L33
        L40:
            r2 = 0
        L41:
            int r5 = r4.length()
            if (r2 >= r5) goto L1b1
            int r5 = r4.length()
            r3 = r2
        L4c:
            if (r3 >= r5) goto L64
            char r0 = r4.charAt(r3)
            r23 = r1
            java.lang.String r1 = "=,;"
            boolean r0 = p000.q02.m4655(r1, r0)
            if (r0 == 0) goto L5d
            goto L6a
        L5d:
            int r3 = r3 + 1
            r0 = r26
            r1 = r23
            goto L4c
        L64:
            r23 = r1
            int r3 = r4.length()
        L6a:
            java.lang.String r0 = r4.substring(r2, r3)
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            int r1 = r4.length()
            if (r3 == r1) goto Lf9
            char r1 = r4.charAt(r3)
            r2 = 44
            if (r1 == r2) goto Lf9
            char r1 = r4.charAt(r3)
            r2 = 59
            if (r1 != r2) goto L8e
            goto Lf9
        L8e:
            int r3 = r3 + 1
            byte[] r1 = p000.sd2.f9867
            int r1 = r4.length()
        L96:
            if (r3 >= r1) goto La8
            char r2 = r4.charAt(r3)
            r5 = 32
            if (r2 == r5) goto La5
            r5 = 9
            if (r2 == r5) goto La5
            goto Lac
        La5:
            int r3 = r3 + 1
            goto L96
        La8:
            int r3 = r4.length()
        Lac:
            int r1 = r4.length()
            if (r3 >= r1) goto Lc8
            char r1 = r4.charAt(r3)
            r2 = 34
            if (r1 != r2) goto Lc8
            int r3 = r3 + 1
            r1 = 4
            int r1 = p000.q02.m4668(r4, r2, r3, r1)
            java.lang.String r2 = r4.substring(r3, r1)
            int r1 = r1 + 1
            goto Lfd
        Lc8:
            int r1 = r4.length()
            r2 = r3
        Lcd:
            if (r2 >= r1) goto Le3
            char r5 = r4.charAt(r2)
            r24 = r1
            java.lang.String r1 = ",;"
            boolean r1 = p000.q02.m4655(r1, r5)
            if (r1 == 0) goto Lde
            goto Le7
        Lde:
            int r2 = r2 + 1
            r1 = r24
            goto Lcd
        Le3:
            int r2 = r4.length()
        Le7:
            java.lang.String r1 = r4.substring(r3, r2)
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            r25 = r2
            r2 = r1
            r1 = r25
            goto Lfd
        Lf9:
            int r3 = r3 + 1
            r1 = r3
            r2 = 0
        Lfd:
            java.lang.String r3 = "no-cache"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L10e
            r0 = r26
            r2 = r1
            r9 = r22
        L10a:
            r1 = r23
            goto L41
        L10e:
            java.lang.String r3 = "no-store"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L11c
            r0 = r26
            r2 = r1
            r10 = r22
            goto L10a
        L11c:
            java.lang.String r3 = "max-age"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L12d
            r3 = -1
            int r11 = p000.sd2.m5483(r2, r3)
        L129:
            r0 = r26
            r2 = r1
            goto L10a
        L12d:
            r3 = -1
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L13b
            int r12 = p000.sd2.m5483(r2, r3)
            goto L129
        L13b:
            java.lang.String r3 = "private"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L149
            r0 = r26
            r2 = r1
            r13 = r22
            goto L10a
        L149:
            java.lang.String r3 = "public"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L157
            r0 = r26
            r2 = r1
            r14 = r22
            goto L10a
        L157:
            java.lang.String r3 = "must-revalidate"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L165
            r0 = r26
            r2 = r1
            r15 = r22
            goto L10a
        L165:
            java.lang.String r3 = "max-stale"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L175
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r16 = p000.sd2.m5483(r2, r0)
            goto L129
        L175:
            java.lang.String r3 = "min-fresh"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L183
            r3 = -1
            int r17 = p000.sd2.m5483(r2, r3)
            goto L129
        L183:
            r3 = -1
            java.lang.String r2 = "only-if-cached"
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 == 0) goto L193
            r0 = r26
            r2 = r1
            r18 = r22
            goto L10a
        L193:
            java.lang.String r2 = "no-transform"
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 == 0) goto L1a2
            r0 = r26
            r2 = r1
            r19 = r22
            goto L10a
        L1a2:
            java.lang.String r2 = "immutable"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L129
            r0 = r26
            r2 = r1
            r20 = r22
            goto L10a
        L1b1:
            r23 = r1
            r3 = -1
            int r6 = r6 + 1
            r0 = r26
            r1 = r23
            goto L1d
        L1bc:
            if (r7 != 0) goto L1c1
            r21 = 0
            goto L1c3
        L1c1:
            r21 = r8
        L1c3:
            fd r8 = new fd
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r8
    }

    /* JADX INFO: renamed from: Θ */
    public static p000.InterfaceC0880up m4462(p000.InterfaceC0806sp r2, p000.InterfaceC0880up r3) {
            r3.getClass()
            hz r0 = p000.C0377hz.f4846
            if (r3 != r0) goto L8
            return r2
        L8:
            ig r0 = new ig
            r1 = 6
            r0.<init>(r1)
            java.lang.Object r2 = r3.mo1787(r0, r2)
            up r2 = (p000.InterfaceC0880up) r2
            return r2
    }

    /* JADX INFO: renamed from: Ι */
    public static final void m4463(p000.rw1 r2, p000.InterfaceC0676p6 r3, int r4) {
        L0:
            int r0 = r2.f9559
            if (r4 <= r0) goto L8
            int r1 = r2.f9558
            if (r4 < r1) goto Lc
        L8:
            if (r0 != 0) goto Ld
            if (r4 != 0) goto Ld
        Lc:
            return
        Ld:
            r2.m5142()
            int r0 = r2.f9559
            boolean r0 = r2.m5129(r0)
            if (r0 == 0) goto L1b
            r3.mo3780()
        L1b:
            r2.m5159()
            goto L0
    }

    /* JADX INFO: renamed from: Κ */
    public static java.lang.String m4464(android.content.Context r1, java.lang.String r2) {
            r1.getClass()
            android.content.res.Resources r1 = m4492(r1, r2)
            android.content.res.AssetManager r1 = r1.getAssets()
            java.lang.String r2 = "region_codes.json"
            java.io.InputStream r1 = r1.open(r2)
            r1.getClass()
            java.nio.charset.Charset r2 = p000.AbstractC0547mf.f7105
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r1, r2)
            java.io.BufferedReader r1 = new java.io.BufferedReader
            r2 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r0, r2)
            java.lang.String r2 = p000.i81.m2672(r1)     // Catch: java.lang.Throwable -> L2a
            r1.close()
            return r2
        L2a:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L2c
        L2c:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r1, r2)
            throw r0
    }

    /* JADX INFO: renamed from: Λ */
    public static java.lang.String m4465(java.lang.Object r1, java.lang.String... r2) {
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.String r1 = m4466(r1, r2)
            if (r1 == 0) goto L34
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L34
            int r2 = r1.length()
            r0 = 5
            if (r2 < r0) goto L34
            r2 = 0
        L1f:
            int r0 = r1.length()
            if (r2 >= r0) goto L33
            char r0 = r1.charAt(r2)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 != 0) goto L30
            goto L34
        L30:
            int r2 = r2 + 1
            goto L1f
        L33:
            return r1
        L34:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: Μ */
    public static java.lang.String m4466(java.lang.Object r5, java.lang.String... r6) {
            r0 = 0
            if (r5 != 0) goto L4
            goto L53
        L4:
            int r1 = r6.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L53
            r3 = r6[r2]
            java.lang.Class r4 = r5.getClass()
            java.lang.reflect.Field r3 = m4495(r4, r3)
            if (r3 != 0) goto L15
            goto L50
        L15:
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r3 = r3.get(r5)     // Catch: java.lang.Throwable -> L1e
            goto L25
        L1e:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L25:
            boolean r4 = r3 instanceof p000.eo1
            if (r4 == 0) goto L2a
            r3 = r0
        L2a:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L3a
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = p000.q02.m4671(r4)
            if (r4 != 0) goto L50
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L3a:
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 == 0) goto L45
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.String r5 = r3.toString()
            return r5
        L45:
            boolean r4 = r3 instanceof java.lang.Enum
            if (r4 == 0) goto L50
            java.lang.Enum r3 = (java.lang.Enum) r3
            java.lang.String r5 = r3.name()
            return r5
        L50:
            int r2 = r2 + 1
            goto L6
        L53:
            return r0
    }

    /* JADX INFO: renamed from: Ν */
    public static java.util.List m4467(java.lang.ClassLoader r21) {
            r0 = r21
            java.lang.String r1 = "~7900D027A3932BB549D3B8B2DD00267041103759ADD6D0A1A70C488FC6B59198F6388B3274"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.Class r1 = m4488(r0, r1)
            if (r1 != 0) goto L11
            jz r0 = p000.C0450jz.f5672
            return r0
        L11:
            java.lang.String r2 = "~7900D027A3932BB549D3B8B2DD00267041103759ADC2C3B0AA2F468AC7A2B682DF1D8F326B"
            java.lang.String r2 = p000.jf0.m2957(r2)
            java.lang.Class r2 = m4488(r0, r2)
            java.lang.String r3 = "~7900D027A3932BB549D3B8B2DD00267041103759ADC2C3B0AA2F468AC7A2B5B9F71D8F326B"
            java.lang.String r3 = p000.jf0.m2957(r3)
            java.lang.Class r3 = m4488(r0, r3)
            java.lang.String r4 = "~7924EBBB26E5F67FFF0E3BFBBADCDA20635AA34941353E9324DD0F29CE2AB2598E4CEDA96265666F373BCC67"
            java.lang.String r4 = p000.jf0.m2957(r4)
            java.lang.Class r0 = m4488(r0, r4)
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()
            r1.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r1.length
            r6 = 0
            r7 = r6
        L3e:
            if (r7 >= r5) goto L12e
            r8 = r1[r7]
            java.lang.Class r9 = r8.getReturnType()
            java.lang.Class r10 = java.lang.Void.TYPE
            boolean r9 = p000.ln0.m3626(r9, r10)
            if (r9 != 0) goto L54
            r20 = r1
            r21 = r6
            goto L126
        L54:
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r10 = r9.length
            r11 = 2
            r12 = 1
            if (r10 != r11) goto L71
            r10 = r9[r6]
            java.lang.Class r13 = java.lang.Integer.TYPE
            boolean r10 = p000.ln0.m3626(r10, r13)
            if (r10 == 0) goto L71
            r10 = r9[r12]
            boolean r10 = p000.ln0.m3626(r10, r13)
            if (r10 == 0) goto L71
            r10 = r12
            goto L72
        L71:
            r10 = r6
        L72:
            if (r2 == 0) goto L81
            int r13 = r9.length
            if (r13 != r12) goto L81
            r13 = r9[r6]
            boolean r13 = p000.ln0.m3626(r13, r2)
            if (r13 == 0) goto L81
            r13 = r12
            goto L82
        L81:
            r13 = r6
        L82:
            if (r0 == 0) goto L91
            int r14 = r9.length
            if (r14 != r12) goto L91
            r14 = r9[r6]
            boolean r14 = p000.ln0.m3626(r14, r0)
            if (r14 == 0) goto L91
            r14 = r12
            goto L92
        L91:
            r14 = r6
        L92:
            int r15 = r9.length
            r16 = 3
            r21 = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            r17 = r11
            r11 = 4
            r18 = r12
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            if (r15 != r11) goto Ld1
            r15 = r9[r21]
            boolean r15 = r15.isArray()
            if (r15 == 0) goto Ld1
            r15 = r9[r21]
            java.lang.Class r15 = r15.getComponentType()
            boolean r15 = p000.ln0.m3626(r15, r12)
            if (r15 == 0) goto Ld1
            r15 = r9[r18]
            boolean r15 = p000.ln0.m3626(r15, r12)
            if (r15 == 0) goto Ld1
            r15 = r9[r17]
            boolean r15 = p000.ln0.m3626(r15, r6)
            if (r15 == 0) goto Ld1
            r15 = r9[r16]
            boolean r15 = p000.ln0.m3626(r15, r12)
            if (r15 == 0) goto Ld1
            r15 = r18
            goto Ld3
        Ld1:
            r15 = r21
        Ld3:
            if (r3 == 0) goto L115
            if (r0 == 0) goto L115
            if (r2 == 0) goto L115
            r19 = r11
            int r11 = r9.length
            r20 = r1
            r1 = 6
            if (r11 != r1) goto L117
            r1 = r9[r21]
            boolean r1 = p000.ln0.m3626(r1, r12)
            if (r1 == 0) goto L117
            r1 = r9[r18]
            boolean r1 = p000.ln0.m3626(r1, r12)
            if (r1 == 0) goto L117
            r1 = r9[r17]
            boolean r1 = p000.ln0.m3626(r1, r6)
            if (r1 == 0) goto L117
            r1 = r9[r16]
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 == 0) goto L117
            r1 = r9[r19]
            boolean r1 = p000.ln0.m3626(r1, r0)
            if (r1 == 0) goto L117
            r1 = 5
            r1 = r9[r1]
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L117
            r12 = r18
            goto L119
        L115:
            r20 = r1
        L117:
            r12 = r21
        L119:
            if (r10 != 0) goto L123
            if (r13 != 0) goto L123
            if (r14 != 0) goto L123
            if (r15 != 0) goto L123
            if (r12 == 0) goto L126
        L123:
            r4.add(r8)
        L126:
            int r7 = r7 + 1
            r6 = r21
            r1 = r20
            goto L3e
        L12e:
            return r4
    }

    /* JADX INFO: renamed from: Ξ */
    public static p000.C0299fv m4468(android.content.Context r28, java.lang.Object r29, p000.EnumC0336gv r30, java.lang.String r31) {
            r1 = r29
            r28.getClass()
            java.lang.String r0 = "download_path_template"
            java.lang.String r2 = ""
            java.lang.String r0 = p000.ui1.m5893(r0, r2)
            int r3 = r30.ordinal()
            r4 = 0
            switch(r3) {
                case 0: goto L68;
                case 1: goto L5c;
                case 2: goto L4f;
                case 3: goto L42;
                case 4: goto L35;
                case 5: goto L28;
                case 6: goto L19;
                default: goto L15;
            }
        L15:
            p000.C1080.m7272()
            return r4
        L19:
            java.lang.String r3 = "emoji_download_path_template"
            java.lang.String r3 = p000.ui1.m5893(r3, r2)
            boolean r5 = p000.q02.m4671(r3)
            if (r5 == 0) goto L26
            goto L68
        L26:
            r0 = r3
            goto L68
        L28:
            java.lang.String r3 = "audio_download_path_template"
            java.lang.String r3 = p000.ui1.m5893(r3, r2)
            boolean r5 = p000.q02.m4671(r3)
            if (r5 == 0) goto L26
            goto L68
        L35:
            java.lang.String r3 = "live_photo_download_path_template"
            java.lang.String r3 = p000.ui1.m5893(r3, r2)
            boolean r5 = p000.q02.m4671(r3)
            if (r5 == 0) goto L26
            goto L68
        L42:
            java.lang.String r3 = "animated_download_path_template"
            java.lang.String r3 = p000.ui1.m5893(r3, r2)
            boolean r5 = p000.q02.m4671(r3)
            if (r5 == 0) goto L26
            goto L68
        L4f:
            java.lang.String r3 = "image_download_path_template"
            java.lang.String r3 = p000.ui1.m5893(r3, r2)
            boolean r5 = p000.q02.m4671(r3)
            if (r5 == 0) goto L26
            goto L68
        L5c:
            java.lang.String r3 = "video_download_path_template"
            java.lang.String r3 = p000.ui1.m5893(r3, r2)
            boolean r5 = p000.q02.m4671(r3)
            if (r5 == 0) goto L26
        L68:
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r3 = r0.toString()
            boolean r0 = p000.q02.m4671(r3)
            r5 = 2
            java.lang.String r6 = "/"
            if (r0 == 0) goto La0
            java.lang.CharSequence r0 = p000.q02.m4660(r2)
            java.lang.String r0 = r0.toString()
            char[] r1 = new char[r5]
            r1 = {x0422: FILL_ARRAY_DATA , data: [47, 92} // fill-array
            java.lang.String r0 = p000.q02.m4661(r0, r1)
            java.lang.String r1 = m4472(r31)
            fv r2 = new fv
            boolean r3 = p000.q02.m4671(r0)
            if (r3 == 0) goto L98
            r3 = r1
            goto L9c
        L98:
            java.lang.String r3 = p000.lz1.m3688(r0, r6, r1)
        L9c:
            r2.<init>(r0, r1, r3)
            return r2
        La0:
            java.lang.String r0 = "download_date_format"
            java.lang.String r7 = "yyyy-MM-dd_HH-mm-ss"
            java.lang.String r0 = p000.ui1.m5893(r0, r7)
            boolean r8 = p000.q02.m4671(r0)
            if (r8 == 0) goto Laf
            goto Lb0
        Laf:
            r7 = r0
        Lb0:
            long r8 = java.lang.System.currentTimeMillis()
            boolean r0 = r1 instanceof p000.C0276f8
            if (r0 == 0) goto Lbd
            r0 = r1
            f8 r0 = (p000.C0276f8) r0
            r10 = r0
            goto Lbe
        Lbd:
            r10 = r4
        Lbe:
            java.lang.String r0 = "authorInfo"
            java.lang.String r11 = "user"
            java.lang.String r12 = "author"
            java.lang.String[] r11 = new java.lang.String[]{r12, r0, r11}
            r14 = 1
            if (r1 != 0) goto Lcc
            goto L106
        Lcc:
            r15 = 0
        Lcd:
            r0 = 3
            if (r15 >= r0) goto L105
            r0 = r11[r15]
            java.lang.Class r4 = r1.getClass()
            java.lang.reflect.Field r0 = m4495(r4, r0)
            if (r0 != 0) goto Ldd
            goto L101
        Ldd:
            r0.setAccessible(r14)     // Catch: java.lang.Throwable -> Le5
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Le5
            goto Lec
        Le5:
            r0 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        Lec:
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto Lf1
            r0 = 0
        Lf1:
            if (r0 == 0) goto L101
            boolean r4 = r0 instanceof java.lang.String
            if (r4 != 0) goto L101
            boolean r4 = r0 instanceof java.lang.Number
            if (r4 != 0) goto L101
            boolean r4 = r0 instanceof java.lang.Enum
            if (r4 != 0) goto L101
            r4 = r0
            goto L106
        L101:
            int r15 = r15 + 1
            r4 = 0
            goto Lcd
        L105:
            r4 = 0
        L106:
            java.lang.String r0 = "createTime"
            java.lang.String r11 = "createTimeStamp"
            java.lang.String[] r11 = new java.lang.String[]{r0, r11}
            r16 = 0
            if (r1 != 0) goto L117
            r14 = r16
            r30 = 0
            goto L179
        L117:
            r30 = 0
            r13 = 0
        L11a:
            if (r13 >= r5) goto L147
            r0 = r11[r13]
            java.lang.Class r5 = r1.getClass()
            java.lang.reflect.Field r0 = m4495(r5, r0)
            if (r0 != 0) goto L129
            goto L174
        L129:
            r0.setAccessible(r14)     // Catch: java.lang.Throwable -> L131
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L131
            goto L138
        L131:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L138:
            boolean r5 = r0 instanceof p000.eo1
            if (r5 == 0) goto L13d
            r0 = 0
        L13d:
            boolean r5 = r0 instanceof java.lang.Long
            if (r5 == 0) goto L14a
            java.lang.Number r0 = (java.lang.Number) r0
            long r16 = r0.longValue()
        L147:
            r14 = r16
            goto L179
        L14a:
            boolean r5 = r0 instanceof java.lang.Integer
            if (r5 == 0) goto L156
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r14 = (long) r0
            goto L179
        L156:
            boolean r14 = r0 instanceof java.lang.Number
            if (r14 == 0) goto L161
            java.lang.Number r0 = (java.lang.Number) r0
            long r16 = r0.longValue()
            goto L147
        L161:
            boolean r14 = r0 instanceof java.lang.String
            if (r14 == 0) goto L174
            java.lang.String r0 = (java.lang.String) r0
            r14 = 10
            java.lang.Long r0 = p000.x02.m6489(r0, r14)
            if (r0 == 0) goto L174
            long r16 = r0.longValue()
            goto L147
        L174:
            int r13 = r13 + 1
            r5 = 2
            r14 = 1
            goto L11a
        L179:
            java.lang.String r0 = m4497(r14, r7)
            l91 r11 = new l91
            java.lang.String r13 = "{createTime}"
            r11.<init>(r13, r0)
            java.lang.String r0 = m4497(r8, r7)
            l91 r7 = new l91
            java.lang.String r8 = "{currentTime}"
            r7.<init>(r8, r0)
            if (r1 != 0) goto L193
        L191:
            r0 = r2
            goto L1a4
        L193:
            java.lang.String r0 = "awemeType"
            java.lang.String r8 = "livePhotoAwemeType"
            java.lang.String r9 = "type"
            java.lang.String[] r0 = new java.lang.String[]{r9, r0, r8}
            java.lang.String r0 = m4466(r1, r0)
            if (r0 != 0) goto L1a4
            goto L191
        L1a4:
            l91 r8 = new l91
            java.lang.String r9 = "{awemeType}"
            r8.<init>(r9, r0)
            java.lang.String r0 = "aid"
            java.lang.String r9 = "id"
            java.lang.String r13 = "awemeId"
            java.lang.String[] r0 = new java.lang.String[]{r13, r0, r9}
            java.lang.String r0 = m4466(r1, r0)
            java.lang.String[] r0 = new java.lang.String[]{r0, r2}
            java.lang.String r0 = m4496(r0)
            l91 r9 = new l91
            java.lang.String r13 = "{aid}"
            r9.<init>(r13, r0)
            java.lang.String r0 = "cid"
            java.lang.String r13 = "commentId"
            java.lang.String[] r0 = new java.lang.String[]{r0, r13}
            java.lang.String r0 = m4466(r1, r0)
            java.lang.String[] r0 = new java.lang.String[]{r0, r2}
            java.lang.String r0 = m4496(r0)
            l91 r13 = new l91
            java.lang.String r14 = "{cid}"
            r13.<init>(r14, r0)
            if (r10 == 0) goto L206
            java.lang.String r0 = r10.f3801
            if (r0 == 0) goto L206
            int r14 = r0.length()
            r15 = 5
            if (r14 < r15) goto L206
            r14 = r30
        L1f2:
            int r15 = r0.length()
            if (r14 >= r15) goto L207
            char r15 = r0.charAt(r14)
            boolean r15 = java.lang.Character.isDigit(r15)
            if (r15 != 0) goto L203
            goto L206
        L203:
            int r14 = r14 + 1
            goto L1f2
        L206:
            r0 = 0
        L207:
            java.lang.String r14 = "authorUid"
            java.lang.String r15 = "uid"
            java.lang.String[] r14 = new java.lang.String[]{r14, r15}
            java.lang.String r14 = m4465(r1, r14)
            java.lang.String r5 = "userId"
            r17 = r3
            java.lang.String r3 = "user_id"
            java.lang.String[] r3 = new java.lang.String[]{r15, r5, r3}
            java.lang.String r3 = m4465(r4, r3)
            java.lang.String[] r0 = new java.lang.String[]{r0, r14, r3, r2}
            java.lang.String r0 = m4496(r0)
            l91 r3 = new l91
            java.lang.String r5 = "{uid}"
            r3.<init>(r5, r0)
            if (r10 == 0) goto L235
            java.lang.String r0 = r10.f3793
            goto L236
        L235:
            r0 = 0
        L236:
            java.lang.String r5 = "authorName"
            java.lang.String r14 = "nickname"
            java.lang.String[] r5 = new java.lang.String[]{r12, r14, r5}
            java.lang.String r5 = m4466(r1, r5)
            java.lang.String r12 = "nick_name"
            java.lang.String r15 = "displayName"
            r23 = r3
            java.lang.String r3 = "nickName"
            java.lang.String[] r3 = new java.lang.String[]{r14, r3, r12, r15}
            java.lang.String r3 = m4466(r4, r3)
            java.lang.String[] r0 = new java.lang.String[]{r0, r5, r3, r2}
            r3 = r30
        L258:
            r5 = 4
            if (r3 >= r5) goto L282
            r5 = r0[r3]
            if (r5 == 0) goto L27f
            boolean r12 = p000.q02.m4671(r5)
            if (r12 == 0) goto L266
            goto L27f
        L266:
            java.lang.String r12 = "null"
            boolean r12 = r5.equalsIgnoreCase(r12)
            if (r12 != 0) goto L27f
            java.lang.String r12 = "未知"
            boolean r12 = r5.equalsIgnoreCase(r12)
            if (r12 != 0) goto L27f
            java.lang.String r12 = "unknown"
            boolean r12 = r5.equalsIgnoreCase(r12)
            if (r12 != 0) goto L27f
            goto L283
        L27f:
            int r3 = r3 + 1
            goto L258
        L282:
            r5 = 0
        L283:
            if (r5 != 0) goto L286
            r5 = r2
        L286:
            l91 r0 = new l91
            java.lang.String r3 = "{nickname}"
            r0.<init>(r3, r5)
            if (r10 == 0) goto L292
            java.lang.String r3 = r10.f3792
            goto L293
        L292:
            r3 = 0
        L293:
            java.lang.String r5 = "authorUniqueId"
            java.lang.String r10 = "uniqueId"
            java.lang.String r12 = "shortId"
            java.lang.String[] r5 = new java.lang.String[]{r5, r10, r12}
            java.lang.String r5 = m4466(r1, r5)
            java.lang.String r14 = "unique_id"
            java.lang.String r15 = "short_id"
            java.lang.String[] r10 = new java.lang.String[]{r10, r14, r12, r15}
            java.lang.String r4 = m4466(r4, r10)
            java.lang.String[] r3 = new java.lang.String[]{r3, r5, r4, r2}
            java.lang.String r3 = m4496(r3)
            l91 r4 = new l91
            java.lang.String r5 = "{uniqueId}"
            r4.<init>(r5, r3)
            java.lang.String r3 = "desc"
            java.lang.String r5 = "description"
            java.lang.String[] r3 = new java.lang.String[]{r3, r5}
            java.lang.String r1 = m4466(r1, r3)
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.lang.String r1 = m4496(r1)
            l91 r3 = new l91
            java.lang.String r5 = "{desc}"
            r3.<init>(r5, r1)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            l91 r5 = new l91
            java.lang.String r10 = "{uuid}"
            r5.<init>(r10, r1)
            r24 = r0
            r26 = r3
            r25 = r4
            r27 = r5
            r19 = r7
            r20 = r8
            r21 = r9
            r18 = r11
            r22 = r13
            l91[] r0 = new p000.l91[]{r18, r19, r20, r21, r22, r23, r24, r25, r26, r27}
            java.util.LinkedHashMap r0 = p000.ex0.m1969(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r3 = r17
        L30a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L327
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r4 = r1.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = p000.x02.m6483(r3, r4, r1)
            goto L30a
        L327:
            r0 = 92
            r1 = 47
            java.lang.String r0 = r3.replace(r0, r1)
            r0.getClass()
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "file:"
            java.lang.String r0 = p000.q02.m4678(r0, r3)
            java.lang.String r3 = "content:"
            java.lang.String r0 = p000.q02.m4678(r0, r3)
            cv r3 = p000.AbstractC0262ev.m1964(r0)
            if (r3 == 0) goto L34e
            java.lang.String r0 = r3.f2777
        L34e:
            r5 = 1
            char[] r4 = new char[r5]
            r4[r30] = r1
            r7 = 6
            r8 = r30
            java.util.List r0 = p000.q02.m4682(r0, r4, r8, r7)
            java.util.ArrayList r4 = new java.util.ArrayList
            r14 = 10
            int r7 = p000.AbstractC1021yh.m6889(r0, r14)
            r4.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L369:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L381
            java.lang.Object r7 = r0.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.CharSequence r7 = p000.q02.m4660(r7)
            java.lang.String r7 = r7.toString()
            r4.add(r7)
            goto L369
        L381:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L38a:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L3a9
            java.lang.Object r7 = r4.next()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            boolean r9 = p000.q02.m4671(r8)
            if (r9 != 0) goto L38a
            java.lang.String r9 = "."
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L38a
            r0.add(r7)
            goto L38a
        L3a9:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L3b9
            java.lang.String r0 = m4472(r31)
            fv r1 = new fv
            r1.<init>(r2, r0, r0)
            goto L40e
        L3b9:
            java.lang.Object r2 = p000.AbstractC0984xh.m6645(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = m4472(r2)
            boolean r4 = p000.q02.m4671(r2)
            if (r4 == 0) goto L3cd
            java.lang.String r2 = m4472(r31)
        L3cd:
            java.util.List r7 = p000.AbstractC0984xh.m6635(r0)
            hm r12 = new hm
            r0 = 22
            r12.<init>(r0)
            r13 = 30
            java.lang.String r8 = "/"
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r7, r8, r9, r10, r11, r12, r13)
            r5 = 1
            char[] r4 = new char[r5]
            r8 = 0
            r4[r8] = r1
            java.lang.String r0 = p000.q02.m4661(r0, r4)
            if (r3 == 0) goto L3fd
            boolean r1 = p000.q02.m4671(r0)
            java.lang.String r3 = r3.f2776
            if (r1 == 0) goto L3f9
            r0 = r3
            goto L3fd
        L3f9:
            java.lang.String r0 = p000.lz1.m3688(r3, r6, r0)
        L3fd:
            fv r1 = new fv
            boolean r3 = p000.q02.m4671(r0)
            if (r3 == 0) goto L407
            r3 = r2
            goto L40b
        L407:
            java.lang.String r3 = p000.lz1.m3688(r0, r6, r2)
        L40b:
            r1.<init>(r0, r2, r3)
        L40e:
            return r1
    }

    /* JADX INFO: renamed from: Ο */
    public static java.util.ArrayList m4469(p000.EnumC0491kx r2, java.lang.ClassLoader r3, boolean r4, int r5, p000.p70 r6, p000.a80 r7) {
            java.lang.Object r0 = p000.C0666ox.f8297
            java.util.List r0 = p000.C0666ox.m4323(r2, r3)
            if (r0 == 0) goto L17
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L17
            java.util.ArrayList r2 = m4493(r0)
            return r2
        L17:
            java.lang.Object r6 = r6.invoke()
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r6 = m4493(r6)
            int r0 = r6.size()
            if (r0 < r5) goto L2d
            if (r4 == 0) goto L50
            p000.C0666ox.m4327(r2, r6)
            return r6
        L2d:
            if (r4 == 0) goto L50
            java.util.concurrent.atomic.AtomicBoolean r4 = p000.C0666ox.f8305
            boolean r4 = r4.get()
            if (r4 != 0) goto L38
            goto L50
        L38:
            java.lang.String r4 = r2.f6297
            wa r5 = new wa
            r0 = 12
            r5.<init>(r6, r0, r7)
            java.util.List r2 = p000.C0666ox.m4316(r2, r3, r4, r5)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L50
            java.util.ArrayList r2 = m4493(r2)
            return r2
        L50:
            return r6
    }

    /* JADX INFO: renamed from: Π */
    public static final void m4470(p000.InterfaceC0880up r3, java.lang.Object r4) {
            uy r0 = p000.pd2.f8525
            if (r4 != r0) goto L5
            goto L27
        L5:
            boolean r0 = r4 instanceof p000.g42
            if (r0 == 0) goto L28
            g42 r4 = (p000.g42) r4
            c42[] r3 = r4.f4233
            int r0 = r3.length
            int r0 = r0 + (-1)
            if (r0 < 0) goto L27
        L12:
            int r1 = r0 + (-1)
            r2 = r3[r0]
            r2.getClass()
            java.lang.Object[] r2 = r4.f4232
            r0 = r2[r0]
            s62 r0 = (p000.s62) r0
            android.os.Trace.endSection()
            if (r1 >= 0) goto L25
            goto L27
        L25:
            r0 = r1
            goto L12
        L27:
            return
        L28:
            r0 = 0
            hu1 r1 = p000.pd2.f8527
            java.lang.Object r3 = r3.mo1787(r1, r0)
            r3.getClass()
            c42 r3 = (p000.c42) r3
            s62 r4 = (p000.s62) r4
            android.os.Trace.endSection()
            return
    }

    /* JADX INFO: renamed from: Ρ */
    public static final p000.ym0 m4471(p000.ml1 r4) {
            ym0 r0 = new ym0
            float r1 = r4.f7200
            int r1 = java.lang.Math.round(r1)
            float r2 = r4.f7201
            int r2 = java.lang.Math.round(r2)
            float r3 = r4.f7202
            int r3 = java.lang.Math.round(r3)
            float r4 = r4.f7203
            int r4 = java.lang.Math.round(r4)
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: Σ */
    public static java.lang.String m4472(java.lang.String r1) {
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            r0 = 46
            boolean r0 = p000.q02.m4655(r1, r0)
            if (r0 == 0) goto L14
            java.lang.String r1 = p000.q02.m4691(r1, r1)
        L14:
            java.lang.String r1 = p000.AbstractC0488ku.m3416(r1)
            return r1
    }

    /* JADX INFO: renamed from: Τ */
    public static void m4473(android.app.Activity r3) {
            r3.getClass()
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1b
            n9 r0 = new n9
            r1 = 3
            r0.<init>(r3, r1)
            r3.runOnUiThread(r0)
            return
        L1b:
            m4477(r3)     // Catch: java.lang.Throwable -> L21
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L21
            goto L28
        L21:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L28:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L4f
            java.lang.String r1 = "r127f77522e175dfe"
            java.lang.String r2 = "打开杂项控件管理菜单失败"
            p000.C0888ux.m5977(r1, r2, r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "杂项控件管理打开失败: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
            r3.show()
        L4f:
            return
    }

    /* JADX INFO: renamed from: Υ */
    public static void m4474(android.app.Activity r11, p000.C0679p9 r12, java.util.ArrayList r13, p000.C1084 r14, p000.C0613o7 r15) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1d
            v8 r1 = new v8
            r7 = 1
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r2.runOnUiThread(r1)
            return
        L1d:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            java.util.concurrent.atomic.AtomicBoolean r11 = new java.util.concurrent.atomic.AtomicBoolean
            r12 = 0
            r11.<init>(r12)
            boolean r13 = r2.isFinishing()
            java.lang.String r14 = "公告弹窗关闭 回调执行失败"
            s62 r15 = p000.s62.f9751
            java.lang.String r1 = "r24de9f070d18b34b"
            r7 = 1
            if (r13 != 0) goto L11f
            boolean r13 = r2.isDestroyed()
            if (r13 != 0) goto L11f
            r13 = 0
            x01 r0 = p000.x01.f11964     // Catch: java.lang.Throwable -> Lcd
            android.view.LayoutInflater r0 = r0.m6477(r2)     // Catch: java.lang.Throwable -> Lcd
            r8 = 2131492893(0x7f0c001d, float:1.860925E38)
            android.view.View r0 = r0.inflate(r8, r13, r12)     // Catch: java.lang.Throwable -> Lcd
            boolean r8 = p000.jx0.m3017(r2)     // Catch: java.lang.Throwable -> Lcd
            xx r9 = p000.jx0.m3049(r2)     // Catch: java.lang.Throwable -> Lcd
            r0.getClass()     // Catch: java.lang.Throwable -> Lcd
            m4482(r2, r0, r8, r9)     // Catch: java.lang.Throwable -> Lcd
            r8 = 2131297030(0x7f090306, float:1.8211993E38)
            android.view.View r8 = r0.findViewById(r8)     // Catch: java.lang.Throwable -> Lcd
            android.widget.TextView r8 = (android.widget.TextView) r8     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r10 = r3.f8457     // Catch: java.lang.Throwable -> Lcd
            r8.setText(r10)     // Catch: java.lang.Throwable -> Lcd
            r8 = 2131297029(0x7f090305, float:1.8211991E38)
            android.view.View r8 = r0.findViewById(r8)     // Catch: java.lang.Throwable -> Lcd
            android.widget.TextView r8 = (android.widget.TextView) r8     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r10 = r3.f8458     // Catch: java.lang.Throwable -> Lcd
            r8.setText(r10)     // Catch: java.lang.Throwable -> Lcd
            m4487(r2, r0, r4, r9)     // Catch: java.lang.Throwable -> Lcd
            android.app.Dialog r4 = new android.app.Dialog     // Catch: java.lang.Throwable -> Lcd
            r4.<init>(r2)     // Catch: java.lang.Throwable -> Lcd
            r4.requestWindowFeature(r7)     // Catch: java.lang.Throwable -> Lcb
            r4.setContentView(r0)     // Catch: java.lang.Throwable -> Lcb
            r4.setCancelable(r7)     // Catch: java.lang.Throwable -> Lcb
            r4.setCanceledOnTouchOutside(r7)     // Catch: java.lang.Throwable -> Lcb
            r8 = 2131296330(0x7f09004a, float:1.8210574E38)
            android.view.View r8 = r0.findViewById(r8)     // Catch: java.lang.Throwable -> Lcb
            k9 r9 = new k9     // Catch: java.lang.Throwable -> Lcb
            r9.<init>(r4, r12)     // Catch: java.lang.Throwable -> Lcb
            r8.setOnClickListener(r9)     // Catch: java.lang.Throwable -> Lcb
            r8 = 2131296334(0x7f09004e, float:1.8210582E38)
            android.view.View r8 = r0.findViewById(r8)     // Catch: java.lang.Throwable -> Lcb
            k9 r9 = new k9     // Catch: java.lang.Throwable -> Lcb
            r9.<init>(r4, r7)     // Catch: java.lang.Throwable -> Lcb
            r8.setOnClickListener(r9)     // Catch: java.lang.Throwable -> Lcb
            r8 = 2131296331(0x7f09004b, float:1.8210576E38)
            android.view.View r8 = r0.findViewById(r8)     // Catch: java.lang.Throwable -> Lcb
            l9 r9 = new l9     // Catch: java.lang.Throwable -> Lcb
            r9.<init>(r2, r12, r3)     // Catch: java.lang.Throwable -> Lcb
            r8.setOnClickListener(r9)     // Catch: java.lang.Throwable -> Lcb
            i9 r3 = new i9     // Catch: java.lang.Throwable -> Lcb
            r3.<init>(r12, r5)     // Catch: java.lang.Throwable -> Lcb
            r4.setOnShowListener(r3)     // Catch: java.lang.Throwable -> Lcb
            j9 r3 = new j9     // Catch: java.lang.Throwable -> Lcb
            r3.<init>(r11, r12, r6)     // Catch: java.lang.Throwable -> Lcb
            r4.setOnDismissListener(r3)     // Catch: java.lang.Throwable -> Lcb
            r4.show()     // Catch: java.lang.Throwable -> Lcb
            m4484(r2, r4, r0)     // Catch: java.lang.Throwable -> Lcb
            return
        Lcb:
            r0 = move-exception
            goto Lcf
        Lcd:
            r0 = move-exception
            r4 = r13
        Lcf:
            java.lang.String r3 = "展示公告弹窗失败"
            p000.C0888ux.m5977(r1, r3, r0)
            if (r4 == 0) goto Le3
            r4.dismiss()     // Catch: java.lang.Throwable -> Ldb
            r13 = r15
            goto Le3
        Ldb:
            r0 = move-exception
            r13 = r0
            eo1 r0 = new eo1
            r0.<init>(r13)
            goto Le4
        Le3:
            r0 = r13
        Le4:
            java.lang.Throwable r13 = p000.fo1.m2190(r0)
            if (r13 == 0) goto Lef
            java.lang.String r0 = "公告弹窗失败回退时关闭窗口失败"
            p000.C0888ux.m5977(r1, r0, r13)
        Lef:
            boolean r11 = r11.compareAndSet(r12, r7)
            if (r11 == 0) goto L109
            r6.invoke()     // Catch: java.lang.Throwable -> Lf9
            goto L100
        Lf9:
            r0 = move-exception
            r11 = r0
            eo1 r15 = new eo1
            r15.<init>(r11)
        L100:
            java.lang.Throwable r11 = p000.fo1.m2190(r15)
            if (r11 == 0) goto L109
            p000.C0888ux.m5977(r1, r14, r11)
        L109:
            boolean r11 = r2.isFinishing()
            if (r11 != 0) goto L139
            boolean r11 = r2.isDestroyed()
            if (r11 != 0) goto L139
            java.lang.String r11 = "公告弹窗打开失败"
            android.widget.Toast r11 = android.widget.Toast.makeText(r2, r11, r12)
            r11.show()
            goto L139
        L11f:
            boolean r11 = r11.compareAndSet(r12, r7)
            if (r11 == 0) goto L139
            r6.invoke()     // Catch: java.lang.Throwable -> L129
            goto L130
        L129:
            r0 = move-exception
            r11 = r0
            eo1 r15 = new eo1
            r15.<init>(r11)
        L130:
            java.lang.Throwable r11 = p000.fo1.m2190(r15)
            if (r11 == 0) goto L139
            p000.C0888ux.m5977(r1, r14, r11)
        L139:
            return
    }

    /* JADX INFO: renamed from: Φ */
    public static boolean m4475(android.app.Activity r12, p000.e71 r13) {
            boolean r0 = r12.isFinishing()
            r1 = 0
            if (r0 != 0) goto Le9
            boolean r0 = r12.isDestroyed()
            if (r0 == 0) goto Lf
            goto Le9
        Lf:
            java.lang.Class r0 = r12.getClass()     // Catch: java.lang.Throwable -> Lc3
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> Lc3
            if (r0 == 0) goto Lbb
            java.lang.String r2 = "~794484269BDCAC7A01EF32C68F405BB418E653C40EAF7F19B8C22A9DA0E837104041147BD148B13B67267066FFCDB88ECE5AD898"
            java.lang.String r2 = p000.jf0.m2957(r2)     // Catch: java.lang.Throwable -> Lc3
            java.lang.Class r0 = java.lang.Class.forName(r2, r1, r0)     // Catch: java.lang.Throwable -> Lc3
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> Lc3
            java.lang.reflect.Constructor r2 = r0.getConstructor(r2)     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object[] r12 = new java.lang.Object[]{r12}     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r12 = r2.newInstance(r12)     // Catch: java.lang.Throwable -> Lc3
            r12.getClass()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r2 = "title"
            java.lang.String r3 = "提示"
            m4457(r12, r2, r3)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r2 = "message"
            java.lang.String r3 = "用户不存在"
            m4457(r12, r2, r3)     // Catch: java.lang.Throwable -> Lc3
            wd0 r2 = new wd0     // Catch: java.lang.Throwable -> Lc3
            r2.<init>(r13)     // Catch: java.lang.Throwable -> Lc3
            java.lang.reflect.Method[] r13 = r0.getMethods()     // Catch: java.lang.Throwable -> Lc3
            r13.getClass()     // Catch: java.lang.Throwable -> Lc3
            int r3 = r13.length     // Catch: java.lang.Throwable -> Lc3
            r4 = 0
            r5 = r1
            r6 = r5
            r7 = r4
        L57:
            if (r5 >= r3) goto L99
            r8 = r13[r5]     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r9 = r8.getName()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r10 = "positiveButton"
            boolean r9 = p000.ln0.m3626(r9, r10)     // Catch: java.lang.Throwable -> Lc3
            if (r9 == 0) goto L96
            java.lang.Class[] r9 = r8.getParameterTypes()     // Catch: java.lang.Throwable -> Lc3
            int r9 = r9.length     // Catch: java.lang.Throwable -> Lc3
            r10 = 2
            if (r9 != r10) goto L96
            java.lang.Class[] r9 = r8.getParameterTypes()     // Catch: java.lang.Throwable -> Lc3
            r9 = r9[r1]     // Catch: java.lang.Throwable -> Lc3
            java.lang.Class<java.lang.CharSequence> r10 = java.lang.CharSequence.class
            boolean r9 = p000.ln0.m3626(r9, r10)     // Catch: java.lang.Throwable -> Lc3
            if (r9 == 0) goto L96
            java.lang.Class[] r9 = r8.getParameterTypes()     // Catch: java.lang.Throwable -> Lc3
            r10 = 1
            r9 = r9[r10]     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r11 = "kotlin.jvm.functions.Function2"
            boolean r9 = r9.equals(r11)     // Catch: java.lang.Throwable -> Lc3
            if (r9 == 0) goto L96
            if (r6 == 0) goto L94
        L92:
            r7 = r4
            goto L9c
        L94:
            r7 = r8
            r6 = r10
        L96:
            int r5 = r5 + 1
            goto L57
        L99:
            if (r6 != 0) goto L9c
            goto L92
        L9c:
            if (r7 == 0) goto Lb3
            java.lang.String r13 = "我知道了"
            java.lang.Object[] r13 = new java.lang.Object[]{r13, r2}     // Catch: java.lang.Throwable -> Lc3
            r7.invoke(r12, r13)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r13 = "show"
            java.lang.reflect.Method r13 = r0.getMethod(r13, r4)     // Catch: java.lang.Throwable -> Lc3
            r13.invoke(r12, r4)     // Catch: java.lang.Throwable -> Lc3
            java.lang.Boolean r12 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lc3
            goto Lca
        Lb3:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r13 = "Dux positiveButton 契约不可用"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> Lc3
            throw r12     // Catch: java.lang.Throwable -> Lc3
        Lbb:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r13 = "宿主 ClassLoader 不可用"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> Lc3
            throw r12     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            r12 = move-exception
            eo1 r13 = new eo1
            r13.<init>(r12)
            r12 = r13
        Lca:
            java.lang.Throwable r13 = p000.fo1.m2190(r12)
            if (r13 == 0) goto Ldb
            java.lang.String r0 = r13.getMessage()
            java.lang.String r1 = "Dux 提醒窗不可用: "
            java.lang.String r2 = "r65a3d6a0829c23aa"
            p000.AbstractC0602nx.m4145(r1, r0, r2, r13)
        Ldb:
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            boolean r0 = r12 instanceof p000.eo1
            if (r0 == 0) goto Le2
            r12 = r13
        Le2:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        Le9:
            return r1
    }

    /* JADX INFO: renamed from: Χ */
    public static void m4476(android.app.Activity r41) {
            r0 = r41
            r1 = 40
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 48
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 18
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r7 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9 = 4
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r11 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            f9 r13 = new f9
            r14 = 1
            r13.<init>(r0, r14)
            at r15 = new at
            java.lang.String r9 = "#52A46A"
            java.lang.String r7 = "#EBF5EE"
            r15.<init>(r9, r7)
            at r7 = new at
            java.lang.String r9 = "#4A90D9"
            r21 = r14
            java.lang.String r14 = "#EBF3FB"
            r7.<init>(r9, r14)
            at r9 = new at
            java.lang.String r14 = "#E07B39"
            java.lang.String r5 = "#FDF0E8"
            r9.<init>(r14, r5)
            r16 = r7
            at r7 = new at
            r17 = r9
            java.lang.String r9 = "#7B68C8"
            r18 = r15
            java.lang.String r15 = "#F0EEFB"
            r7.<init>(r9, r15)
            at r9 = new at
            java.lang.String r15 = "#D95F6A"
            r19 = r7
            java.lang.String r7 = "#FBEDEF"
            r9.<init>(r15, r7)
            at r7 = new at
            java.lang.String r15 = "#3DAB8E"
            r20 = r9
            java.lang.String r9 = "#E8F7F3"
            r7.<init>(r15, r9)
            r15 = r18
            r18 = r19
            r19 = r20
            r20 = r7
            at[] r7 = new p000.C0052at[]{r15, r16, r17, r18, r19, r20}
            java.util.List r7 = p000.AbstractC1021yh.m6897(r7)
            java.util.concurrent.atomic.AtomicInteger r9 = p000.C0187ct.f2739
            java.util.concurrent.atomic.AtomicInteger r9 = p000.C0187ct.f2739
            int r15 = r9.get()
            r16 = r9
            r9 = 6
            if (r15 < 0) goto La1
            if (r15 >= r9) goto La1
            int r15 = r15 + 1
        L9e:
            r18 = r5
            goto La3
        La1:
            r15 = 0
            goto L9e
        La3:
            int r5 = r16.get()
            if (r5 < 0) goto Lb0
            if (r5 >= r9) goto Lb0
            r9 = r21
            r16 = r9
            goto Lb4
        Lb0:
            r9 = r21
            r16 = 0
        Lb4:
            android.widget.LinearLayout r5 = p000.AbstractC0602nx.m4123(r0, r9)
            java.lang.Object r9 = r13.invoke(r12)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r19 = r13.invoke(r12)
            java.lang.Number r19 = (java.lang.Number) r19
            r20 = r14
            int r14 = r19.intValue()
            java.lang.Object r19 = r13.invoke(r12)
            java.lang.Number r19 = (java.lang.Number) r19
            r22 = r6
            int r6 = r19.intValue()
            r19 = r1
            r1 = 0
            r5.setPadding(r9, r1, r14, r6)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            java.lang.String r6 = "#F4F6F4"
            int r6 = android.graphics.Color.parseColor(r6)
            r1.setColor(r6)
            r6 = 22
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r6 = r13.invoke(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            float r6 = (float) r6
            r1.setCornerRadius(r6)
            r5.setBackground(r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r6 = -1
            r9 = -2
            r1.<init>(r6, r9)
            r5.setLayoutParams(r1)
            r1 = 1
            r5.setClipToOutline(r1)
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            r5.setOutlineProvider(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r0)
            r14 = 0
            r1.setOrientation(r14)
            r14 = 16
            r1.setGravity(r14)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r23 = 52
            java.lang.Integer r14 = java.lang.Integer.valueOf(r23)
            java.lang.Object r14 = r13.invoke(r14)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            r9.<init>(r6, r14)
            r1.setLayoutParams(r9)
            java.lang.String r9 = "#FFFFFF"
            int r14 = android.graphics.Color.parseColor(r9)
            r1.setBackgroundColor(r14)
            android.widget.TextView r14 = new android.widget.TextView
            r14.<init>(r0)
            java.lang.String r6 = "关闭"
            r14.setText(r6)
            r6 = 1096810496(0x41600000, float:14.0)
            r14.setTextSize(r6)
            java.lang.String r24 = "#4A5E4D"
            int r6 = android.graphics.Color.parseColor(r24)
            r14.setTextColor(r6)
            r6 = 16
            r14.setGravity(r6)
            xs r6 = new xs
            r25 = r9
            r9 = 0
            r6.<init>(r5, r9)
            r14.setOnClickListener(r6)
            r1.addView(r14)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r0)
            java.lang.String r9 = "骰子控制"
            r6.setText(r9)
            r9 = 1098907648(0x41800000, float:16.0)
            r6.setTextSize(r9)
            java.lang.String r14 = "#1C2B1E"
            int r9 = android.graphics.Color.parseColor(r14)
            r6.setTextColor(r9)
            r9 = 0
            r26 = r14
            r14 = 1
            r6.setTypeface(r9, r14)
            r14 = 17
            r6.setGravity(r14)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r9 = 1065353216(0x3f800000, float:1.0)
            r28 = r2
            r27 = r8
            r2 = -2
            r8 = 0
            r14.<init>(r8, r2, r9)
            r6.setLayoutParams(r14)
            r1.addView(r6)
            java.lang.String r2 = "点"
            if (r16 == 0) goto L1b2
            java.lang.String r6 = p000.lz1.m3686(r2, r15)
            goto L1b4
        L1b2:
            java.lang.String r6 = "随机"
        L1b4:
            if (r16 == 0) goto L1c3
            int r8 = r15 + (-1)
            java.lang.Object r8 = r7.get(r8)
            at r8 = (p000.C0052at) r8
            java.lang.String r8 = r8.f1298
            r14 = r8
            r8 = 0
            goto L1cc
        L1c3:
            r8 = 0
            java.lang.Object r14 = r7.get(r8)
            at r14 = (p000.C0052at) r14
            java.lang.String r14 = r14.f1298
        L1cc:
            if (r16 == 0) goto L1d9
            int r9 = r15 + (-1)
            java.lang.Object r9 = r7.get(r9)
        L1d4:
            at r9 = (p000.C0052at) r9
            java.lang.String r9 = r9.f1299
            goto L1de
        L1d9:
            java.lang.Object r9 = r7.get(r8)
            goto L1d4
        L1de:
            r8 = 1093664768(0x41300000, float:11.0)
            android.widget.TextView r6 = p000.lz1.m3683(r0, r6, r8)
            r29 = r9
            r8 = 0
            r9 = 1
            p000.lz1.m3699(r14, r6, r8, r9)
            java.lang.Object r8 = r13.invoke(r4)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r9 = r13.invoke(r10)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r14 = r13.invoke(r4)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            java.lang.Object r30 = r13.invoke(r10)
            java.lang.Number r30 = (java.lang.Number) r30
            r31 = r10
            int r10 = r30.intValue()
            r6.setPadding(r8, r9, r14, r10)
            android.graphics.drawable.GradientDrawable r8 = new android.graphics.drawable.GradientDrawable
            r8.<init>()
            int r9 = android.graphics.Color.parseColor(r29)
            r8.setColor(r9)
            java.lang.Object r4 = r13.invoke(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            r8.setCornerRadius(r4)
            r6.setBackground(r8)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r8 = -2
            r4.<init>(r8, r8)
            r6.setLayoutParams(r4)
            r1.addView(r6)
            r5.addView(r1)
            android.view.View r1 = new android.view.View
            r1.<init>(r0)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            java.lang.String r6 = "#EFEFEF"
            int r8 = android.graphics.Color.parseColor(r6)
            r4.setColor(r8)
            r1.setBackground(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r8 = -1
            r9 = 1
            r4.<init>(r8, r9)
            r1.setLayoutParams(r4)
            r5.addView(r1)
            android.view.View r1 = new android.view.View
            r1.<init>(r0)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            java.lang.Object r9 = r13.invoke(r11)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r4.<init>(r8, r9)
            r1.setLayoutParams(r4)
            r5.addView(r1)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r0)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            int r8 = android.graphics.Color.parseColor(r25)
            r4.setColor(r8)
            java.lang.Object r8 = r13.invoke(r3)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            float r8 = (float) r8
            r4.setCornerRadius(r8)
            r1.setBackground(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r8 = -2
            r9 = -1
            r4.<init>(r9, r8)
            r1.setLayoutParams(r4)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r0)
            r9 = 1
            r4.setOrientation(r9)
            java.lang.Object r8 = r13.invoke(r12)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r9 = r13.invoke(r11)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r10 = r13.invoke(r12)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            java.lang.Object r14 = r13.invoke(r11)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            r4.setPadding(r8, r9, r10, r14)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r0)
            r9 = 0
            r8.setOrientation(r9)
            r9 = 16
            r8.setGravity(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r10 = r28
            java.lang.Object r14 = r13.invoke(r10)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            r28 = r6
            r6 = -1
            r9.<init>(r6, r14)
            r8.setLayoutParams(r9)
            java.lang.String r6 = "#9EB09F"
            if (r16 == 0) goto L315
            int r9 = r15 + (-1)
            java.lang.Object r9 = r7.get(r9)
            at r9 = (p000.C0052at) r9
            java.lang.String r9 = r9.f1298
            goto L316
        L315:
            r9 = r6
        L316:
            java.lang.String r14 = "#F0F2F0"
            if (r16 == 0) goto L329
            r29 = r6
            int r6 = r15 + (-1)
            java.lang.Object r6 = r7.get(r6)
            at r6 = (p000.C0052at) r6
            java.lang.String r6 = r6.f1299
            r30 = r14
            goto L32e
        L329:
            r29 = r6
            r6 = r14
            r30 = r6
        L32e:
            r14 = 17301569(0x1080041, float:2.4979437E-38)
            android.widget.FrameLayout r6 = m4490(r0, r13, r14, r9, r6)
            r8.addView(r6)
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r0)
            r9 = 1
            r6.setOrientation(r9)
            r9 = 16
            r6.setGravity(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r33 = r2
            r32 = r10
            r2 = -1
            r10 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            r9.<init>(r14, r2, r10)
            java.lang.Object r2 = r13.invoke(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r9.leftMargin = r2
            r6.setLayoutParams(r9)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r0)
            java.lang.String r9 = " 点"
            if (r16 == 0) goto L372
            java.lang.String r10 = "已锁定 "
            java.lang.String r10 = p000.AbstractC0602nx.m4127(r10, r15, r9)
            goto L374
        L372:
            java.lang.String r10 = "随机模式"
        L374:
            r2.setText(r10)
            r10 = 1098907648(0x41800000, float:16.0)
            r2.setTextSize(r10)
            int r10 = android.graphics.Color.parseColor(r26)
            r2.setTextColor(r10)
            r10 = 0
            r14 = 1
            r2.setTypeface(r10, r14)
            r6.addView(r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r0)
            if (r16 == 0) goto L399
            java.lang.String r10 = "下次投骰子将固定出 "
            java.lang.String r9 = p000.AbstractC0602nx.m4127(r10, r15, r9)
            goto L39b
        L399:
            java.lang.String r9 = "骰子结果将正常随机"
        L39b:
            r2.setText(r9)
            r9 = 1095761920(0x41500000, float:13.0)
            r2.setTextSize(r9)
            int r10 = android.graphics.Color.parseColor(r24)
            r2.setTextColor(r10)
            r10 = r27
            java.lang.Object r14 = r13.invoke(r10)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            r9 = 0
            r2.setPadding(r9, r14, r9, r9)
            r6.addView(r2)
            r8.addView(r6)
            r4.addView(r8)
            r1.addView(r4)
            r5.addView(r1)
            android.view.View r1 = new android.view.View
            r1.<init>(r0)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            java.lang.Object r4 = r13.invoke(r11)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r6 = -1
            r2.<init>(r6, r4)
            r1.setLayoutParams(r2)
            r5.addView(r1)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r0)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            int r4 = android.graphics.Color.parseColor(r25)
            r2.setColor(r4)
            java.lang.Object r4 = r13.invoke(r3)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            r2.setCornerRadius(r4)
            r1.setBackground(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r6 = -1
            r8 = -2
            r2.<init>(r6, r8)
            r1.setLayoutParams(r2)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r0)
            r9 = 1
            r2.setOrientation(r9)
            java.lang.Object r4 = r13.invoke(r12)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r6 = r13.invoke(r12)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r8 = r13.invoke(r12)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r9 = r13.invoke(r11)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r2.setPadding(r4, r6, r8, r9)
            java.lang.String r4 = "选择骰子点数"
            r6 = 1095761920(0x41500000, float:13.0)
            android.widget.TextView r4 = p000.lz1.m3683(r0, r4, r6)
            int r6 = android.graphics.Color.parseColor(r24)
            r4.setTextColor(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r8 = -2
            r6.<init>(r8, r8)
            java.lang.Object r8 = r13.invoke(r12)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r6.bottomMargin = r8
            r4.setLayoutParams(r6)
            r2.addView(r4)
            r4 = 0
        L46c:
            java.lang.String r9 = "#18000000"
            r14 = 2
            if (r4 >= r14) goto L62d
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            r14.<init>(r0)
            r6 = 0
            r14.setOrientation(r6)
            r6 = 16
            r14.setGravity(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r34 = r4
            r4 = -1
            r8 = -2
            r6.<init>(r4, r8)
            if (r34 != 0) goto L496
            java.lang.Object r4 = r13.invoke(r11)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r6.bottomMargin = r4
        L496:
            r14.setLayoutParams(r6)
            r4 = 0
        L49a:
            r6 = 3
            if (r4 >= r6) goto L61c
            int r6 = r34 * 3
            int r6 = r6 + r4
            int r8 = r6 + 1
            if (r16 == 0) goto L4a9
            if (r15 != r8) goto L4a9
            r35 = 1
            goto L4ab
        L4a9:
            r35 = 0
        L4ab:
            java.lang.Object r6 = r7.get(r6)
            at r6 = (p000.C0052at) r6
            r36 = r4
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r0)
            r37 = r7
            r7 = 1
            r4.setOrientation(r7)
            r7 = 17
            r4.setGravity(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r38 = r9
            r40 = r12
            r39 = r15
            r9 = 0
            r12 = -2
            r15 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r9, r12, r15)
            r4.setLayoutParams(r7)
            r7 = 1
            r4.setClickable(r7)
            r4.setFocusable(r7)
            int r7 = android.graphics.Color.parseColor(r38)
            android.content.res.ColorStateList r7 = android.content.res.ColorStateList.valueOf(r7)
            android.graphics.drawable.GradientDrawable r12 = p000.lz1.m3681(r9)
            java.lang.Object r9 = r13.invoke(r11)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            float r9 = (float) r9
            r12.setCornerRadius(r9)
            android.graphics.drawable.RippleDrawable r9 = new android.graphics.drawable.RippleDrawable
            r15 = 0
            r9.<init>(r7, r12, r15)
            r4.setBackground(r9)
            r7 = r19
            java.lang.Object r9 = r13.invoke(r7)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            float r12 = (float) r9
            r15 = 1050253722(0x3e99999a, float:0.3)
            float r12 = r12 * r15
            android.widget.FrameLayout r15 = new android.widget.FrameLayout
            r15.<init>(r0)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r9, r9)
            r9 = 17
            r7.gravity = r9
            r15.setLayoutParams(r7)
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
            r7.<init>()
            if (r35 == 0) goto L52b
            r9 = r30
            goto L52d
        L52b:
            java.lang.String r9 = r6.f1299
        L52d:
            int r9 = android.graphics.Color.parseColor(r9)
            r7.setColor(r9)
            r7.setCornerRadius(r12)
            r15.setBackground(r7)
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r0)
            java.lang.String r9 = java.lang.String.valueOf(r8)
            r7.setText(r9)
            r9 = 1098907648(0x41800000, float:16.0)
            r7.setTextSize(r9)
            r9 = 1
            r12 = 0
            r7.setTypeface(r12, r9)
            if (r35 == 0) goto L555
            r6 = r29
            goto L557
        L555:
            java.lang.String r6 = r6.f1298
        L557:
            int r6 = android.graphics.Color.parseColor(r6)
            r7.setTextColor(r6)
            r9 = 17
            r7.setGravity(r9)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r9 = -1
            r6.<init>(r9, r9)
            r7.setLayoutParams(r6)
            r15.addView(r7)
            r4.addView(r15)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            r9 = r33
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            r6.setText(r7)
            r7 = 1094713344(0x41400000, float:12.0)
            r6.setTextSize(r7)
            int r7 = android.graphics.Color.parseColor(r24)
            r6.setTextColor(r7)
            r7 = 17
            r6.setGravity(r7)
            r12 = r22
            java.lang.Object r15 = r13.invoke(r12)
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            r7 = 0
            r6.setPadding(r7, r15, r7, r7)
            r4.addView(r6)
            if (r35 == 0) goto L5e0
            java.lang.String r6 = "已锁定"
            r15 = 1092616192(0x41200000, float:10.0)
            android.widget.TextView r6 = p000.lz1.m3683(r0, r6, r15)
            int r15 = android.graphics.Color.parseColor(r29)
            r6.setTextColor(r15)
            r15 = 17
            r6.setGravity(r15)
            java.lang.Object r15 = r13.invoke(r10)
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            r6.setPadding(r7, r15, r7, r7)
            r4.addView(r6)
            ys r6 = new ys
            r6.<init>(r0, r8)
            r4.setOnClickListener(r6)
            r33 = r9
            goto L60b
        L5e0:
            android.view.View r6 = new android.view.View
            r6.<init>(r0)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r15 = 14
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Object r15 = r13.invoke(r15)
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            r33 = r9
            r9 = -1
            r7.<init>(r9, r15)
            r6.setLayoutParams(r7)
            r4.addView(r6)
            zs r6 = new zs
            r6.<init>(r8, r0, r5)
            r4.setOnClickListener(r6)
        L60b:
            r14.addView(r4)
            int r4 = r36 + 1
            r22 = r12
            r7 = r37
            r9 = r38
            r15 = r39
            r12 = r40
            goto L49a
        L61c:
            r37 = r7
            r40 = r12
            r39 = r15
            r12 = r22
            r2.addView(r14)
            int r4 = r34 + 1
            r12 = r40
            goto L46c
        L62d:
            r38 = r9
            r40 = r12
            r12 = r22
            r1.addView(r2)
            r5.addView(r1)
            android.view.View r1 = new android.view.View
            r1.<init>(r0)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            java.lang.Object r4 = r13.invoke(r11)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r6 = -1
            r2.<init>(r6, r4)
            r1.setLayoutParams(r2)
            r5.addView(r1)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r0)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            int r4 = android.graphics.Color.parseColor(r25)
            r2.setColor(r4)
            java.lang.Object r3 = r13.invoke(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            float r3 = (float) r3
            r2.setCornerRadius(r3)
            r1.setBackground(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r6 = -1
            r8 = -2
            r2.<init>(r6, r8)
            r1.setLayoutParams(r2)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r0)
            r9 = 1
            r2.setOrientation(r9)
            r3 = r31
            java.lang.Object r4 = r13.invoke(r3)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r6 = r13.invoke(r3)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r9 = 0
            r2.setPadding(r9, r4, r9, r6)
            if (r16 == 0) goto L7b0
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r0)
            r4.setOrientation(r9)
            r6 = 16
            r4.setGravity(r6)
            r6 = r40
            java.lang.Object r7 = r13.invoke(r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.Object r8 = r13.invoke(r12)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r9 = r13.invoke(r6)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r12 = r13.invoke(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            r4.setPadding(r7, r8, r9, r12)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = r32
            java.lang.Object r8 = r13.invoke(r8)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r9 = -1
            r7.<init>(r9, r8)
            r4.setLayoutParams(r7)
            r9 = 1
            r4.setClickable(r9)
            r4.setFocusable(r9)
            int r7 = android.graphics.Color.parseColor(r38)
            android.content.res.ColorStateList r7 = android.content.res.ColorStateList.valueOf(r7)
            r17 = 0
            android.graphics.drawable.GradientDrawable r8 = p000.lz1.m3681(r17)
            java.lang.Object r9 = r13.invoke(r11)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            float r9 = (float) r9
            r8.setCornerRadius(r9)
            android.graphics.drawable.RippleDrawable r9 = new android.graphics.drawable.RippleDrawable
            r15 = 0
            r9.<init>(r7, r8, r15)
            r4.setBackground(r9)
            l9 r7 = new l9
            r8 = 4
            r7.<init>(r0, r8, r5)
            r4.setOnClickListener(r7)
            r7 = 17301560(0x1080038, float:2.4979412E-38)
            r9 = r18
            r8 = r20
            android.widget.FrameLayout r7 = m4490(r0, r13, r7, r8, r9)
            r4.addView(r7)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r9 = 1
            r7.setOrientation(r9)
            r9 = 16
            r7.setGravity(r9)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = 0
            r12 = -1
            r15 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r9, r12, r15)
            java.lang.Object r9 = r13.invoke(r6)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r8.leftMargin = r9
            r7.setLayoutParams(r8)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r0)
            java.lang.String r9 = "恢复随机模式"
            r8.setText(r9)
            r9 = 1096810496(0x41600000, float:14.0)
            r8.setTextSize(r9)
            int r9 = android.graphics.Color.parseColor(r26)
            r8.setTextColor(r9)
            r7.addView(r8)
            r4.addView(r7)
            r2.addView(r4)
            android.view.View r4 = new android.view.View
            r4.<init>(r0)
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
            r7.<init>()
            int r8 = android.graphics.Color.parseColor(r28)
            r7.setColor(r8)
            r4.setBackground(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r9 = -1
            r14 = 1
            r7.<init>(r9, r14)
            r8 = 46
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r13.invoke(r8)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r7.leftMargin = r8
            r4.setLayoutParams(r7)
            r2.addView(r4)
            goto L7b2
        L7b0:
            r6 = r40
        L7b2:
            java.lang.String r4 = "选择点数后，在聊天中正常发送骰子即可\n骰子结果将固定为你选择的点数，对方看到的结果与你相同"
            r7 = 1094713344(0x41400000, float:12.0)
            android.widget.TextView r4 = p000.lz1.m3683(r0, r4, r7)
            int r7 = android.graphics.Color.parseColor(r29)
            r4.setTextColor(r7)
            java.lang.Object r7 = r13.invoke(r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.Object r8 = r13.invoke(r6)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r6 = r13.invoke(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r9 = r13.invoke(r11)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r4.setPadding(r7, r8, r6, r9)
            java.lang.Object r6 = r13.invoke(r10)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            float r6 = (float) r6
            r15 = 1065353216(0x3f800000, float:1.0)
            r4.setLineSpacing(r6, r15)
            r2.addView(r4)
            r1.addView(r2)
            r5.addView(r1)
            android.view.View r1 = new android.view.View
            r1.<init>(r0)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            java.lang.Object r4 = r13.invoke(r11)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r6 = -1
            r2.<init>(r6, r4)
            r1.setLayoutParams(r2)
            r5.addView(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r0)
            r9 = 1
            r1.setOrientation(r9)
            r1.setGravity(r9)
            java.lang.Object r2 = r13.invoke(r3)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r9 = 0
            r1.setPadding(r9, r2, r9, r9)
            android.view.View r2 = new android.view.View
            r2.<init>(r0)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            int r6 = android.graphics.Color.parseColor(r28)
            r4.setColor(r6)
            r2.setBackground(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r7 = r19
            java.lang.Object r6 = r13.invoke(r7)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r9 = 1
            r4.<init>(r6, r9)
            r4.gravity = r9
            r2.setLayoutParams(r4)
            r1.addView(r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r0)
            java.lang.String r4 = "选择点数后发送骰子即可固定结果"
            r2.setText(r4)
            r4 = 1093664768(0x41300000, float:11.0)
            r2.setTextSize(r4)
            int r4 = android.graphics.Color.parseColor(r29)
            r2.setTextColor(r4)
            r7 = 17
            r2.setGravity(r7)
            java.lang.Object r4 = r13.invoke(r11)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r9 = 0
            r2.setPadding(r9, r4, r9, r9)
            r1.addView(r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r0)
            java.lang.String r4 = "DyHelper"
            r2.setText(r4)
            r15 = 1092616192(0x41200000, float:10.0)
            r2.setTextSize(r15)
            java.lang.String r4 = "#C5D1C5"
            int r4 = android.graphics.Color.parseColor(r4)
            r2.setTextColor(r4)
            r7 = 17
            r2.setGravity(r7)
            java.lang.Object r3 = r13.invoke(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r9 = 0
            r2.setPadding(r9, r3, r9, r9)
            r1.addView(r2)
            r5.addView(r1)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r0)
            android.app.AlertDialog$Builder r0 = r1.setView(r5)
            r9 = 1
            android.app.AlertDialog$Builder r0 = r0.setCancelable(r9)
            android.app.AlertDialog r0 = r0.create()
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L8ec
            r2 = 17170445(0x106000d, float:2.461195E-38)
            r1.setBackgroundDrawableResource(r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            r1.setDimAmount(r2)
            r14 = 2
            r1.addFlags(r14)
        L8ec:
            r5.setTag(r0)
            r0.show()
            return
    }

    /* JADX INFO: renamed from: Ψ */
    public static void m4477(android.app.Activity r22) {
            r0 = r22
            boolean r1 = p000.ui1.m5867()
            if (r1 != 0) goto Lb
            p000.ui1.m5896(r0)
        Lb:
            java.lang.ref.WeakReference r1 = p000.pd2.f8529
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r1.get()
            android.app.AlertDialog r1 = (android.app.AlertDialog) r1
            if (r1 == 0) goto L1a
            r1.dismiss()
        L1a:
            x01 r1 = p000.x01.f11964
            android.view.LayoutInflater r1 = r1.m6477(r0)
            r2 = 2131492895(0x7f0c001f, float:1.8609255E38)
            r3 = 0
            r4 = 0
            android.view.View r1 = r1.inflate(r2, r3, r4)
            r2 = 2131297059(0x7f090323, float:1.8212052E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r5 = 2131297142(0x7f090376, float:1.821222E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 2131297055(0x7f09031f, float:1.8212044E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131296491(0x7f0900eb, float:1.82109E38)
            android.view.View r7 = r1.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            java.lang.String r8 = "杂项控件管理"
            r5.setText(r8)
            r6.setVisibility(r4)
            xx r5 = p000.jx0.m3049(r0)
            java.lang.String r8 = r5.f12358
            int r8 = android.graphics.Color.parseColor(r8)
            r6.setTextColor(r8)
            java.lang.String r5 = r5.f12359
            r8 = 99
            android.graphics.drawable.GradientDrawable r5 = p000.jx0.m3062(r8, r0, r5)
            r6.setBackground(r5)
            η r5 = new η
            r8 = 6
            r5.<init>(r8, r6)
            zg r6 = new zg
            java.lang.String r8 = "底栏杂项"
            java.lang.String r9 = "Feed 内容区底部的合集、社会榜、娱乐榜、热点等入口；不影响底部导航栏"
            bh r10 = p000.EnumC0077bh.f1711
            r6.<init>(r10, r8, r9)
            zg r8 = new zg
            java.lang.String r9 = "全屏观看"
            java.lang.String r10 = "独立控制横屏/全屏观看入口，同时保留宿主自身显示条件"
            bh r11 = p000.EnumC0077bh.f1712
            r8.<init>(r11, r9, r10)
            zg r9 = new zg
            java.lang.String r10 = "Feed 弹幕按钮"
            java.lang.String r11 = "管理 DanmakuVisibilityFrameLayout 弹幕显示按钮"
            bh r12 = p000.EnumC0077bh.f1713
            r9.<init>(r12, r10, r11)
            zg[] r6 = new p000.C1057zg[]{r6, r8, r9}
            java.util.List r6 = p000.AbstractC1021yh.m6897(r6)
            java.util.Iterator r6 = r6.iterator()
        La0:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L1cf
            java.lang.Object r8 = r6.next()
            zg r8 = (p000.C1057zg) r8
            x01 r9 = p000.x01.f11964
            android.view.LayoutInflater r9 = r9.m6477(r0)
            r10 = 2131492938(0x7f0c004a, float:1.8609342E38)
            android.view.View r9 = r9.inflate(r10, r7, r4)
            r9.getClass()
            bh r10 = r8.f13086
            ch r10 = p000.AbstractC0782s1.m5339(r10)
            boolean r11 = r10.f2110
            r12 = 2131296496(0x7f0900f0, float:1.821091E38)
            android.view.View r12 = r9.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.lang.String r13 = r8.f13087
            r12.setText(r13)
            r12 = 2131296492(0x7f0900ec, float:1.8210902E38)
            android.view.View r12 = r9.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.lang.String r13 = r8.f13088
            r12.setText(r13)
            wa r12 = new wa
            r13 = 3
            r12.<init>(r8, r13, r5)
            wg r13 = new wg
            r13.<init>(r8, r4)
            wg r14 = new wg
            r15 = 1
            r14.<init>(r8, r15)
            r8 = 2131296493(0x7f0900ed, float:1.8210904E38)
            android.view.View r8 = r9.findViewById(r8)
            android.widget.Switch r8 = (android.widget.Switch) r8
            r15 = 2131296490(0x7f0900ea, float:1.8210898E38)
            android.view.View r15 = r9.findViewById(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r3 = 2131296489(0x7f0900e9, float:1.8210896E38)
            android.view.View r16 = r9.findViewById(r3)
            r4 = r16
            android.widget.SeekBar r4 = (android.widget.SeekBar) r4
            android.view.ViewParent r3 = r4.getParent()
            r20 = r5
            boolean r5 = r3 instanceof android.view.ViewGroup
            if (r5 == 0) goto L11b
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L11c
        L11b:
            r3 = 0
        L11c:
            if (r3 != 0) goto L126
            m4489(r4)
            r21 = r6
            r19 = r12
            goto L15b
        L126:
            int r5 = r3.indexOfChild(r4)
            r17 = r4
            android.view.ViewGroup$LayoutParams r4 = r17.getLayoutParams()
            r21 = r6
            android.widget.SeekBar r6 = new android.widget.SeekBar
            r19 = r12
            android.content.Context r12 = r17.getContext()
            r6.<init>(r12)
            r12 = 2131296489(0x7f0900e9, float:1.8210896E38)
            r6.setId(r12)
            java.lang.CharSequence r12 = r17.getContentDescription()
            r6.setContentDescription(r12)
            int r12 = r17.getImportantForAccessibility()
            r6.setImportantForAccessibility(r12)
            r3.removeViewAt(r5)
            m4489(r6)
            r3.addView(r6, r5, r4)
            r4 = r6
        L15b:
            r3 = 2131296494(0x7f0900ee, float:1.8210906E38)
            android.view.View r3 = r9.findViewById(r3)
            android.widget.Switch r3 = (android.widget.Switch) r3
            int r5 = r10.f2111
            r8.setChecked(r11)
            r4.setProgress(r5)
            android.content.Context r6 = r15.getContext()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r12 = 2131689529(0x7f0f0039, float:1.9008076E38)
            java.lang.String r5 = r6.getString(r12, r5)
            r15.setText(r5)
            boolean r5 = r10.f2112
            r3.setChecked(r5)
            r4.setEnabled(r11)
            r15.setEnabled(r11)
            r3.setEnabled(r11)
            if (r11 == 0) goto L195
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L198
        L195:
            r5 = 1055286886(0x3ee66666, float:0.45)
        L198:
            r4.setAlpha(r5)
            r15.setAlpha(r5)
            r3.setAlpha(r5)
            r5 = r14
            xg r14 = new xg
            r18 = r15
            r15 = 0
            r16 = r3
            r17 = r4
            r14.<init>(r15, r16, r17, r18, r19)
            r15 = r18
            r8.setOnCheckedChangeListener(r14)
            ah r6 = new ah
            r8 = 0
            r6.<init>(r15, r8, r13)
            r4.setOnSeekBarChangeListener(r6)
            yg r4 = new yg
            r4.<init>(r5, r8)
            r3.setOnCheckedChangeListener(r4)
            r7.addView(r9)
            r5 = r20
            r6 = r21
            r3 = 0
            r4 = 0
            goto La0
        L1cf:
            r20 = r5
            r20.invoke()
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            r3.<init>(r0)
            android.app.AlertDialog$Builder r1 = r3.setView(r1)
            android.app.AlertDialog r1 = r1.create()
            sa r3 = new sa
            r4 = 2
            r3.<init>(r1, r4)
            r2.setOnClickListener(r3)
            vg r2 = new vg
            r8 = 0
            r2.<init>(r8, r1)
            r1.setOnDismissListener(r2)
            r1.show()
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            p000.pd2.f8529 = r2
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L226
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>(r8)
            r1.setBackgroundDrawable(r2)
            int r2 = r0.widthPixels
            float r2 = (float) r2
            r3 = 1064011039(0x3f6b851f, float:0.92)
            float r2 = r2 * r3
            int r2 = (int) r2
            int r0 = r0.heightPixels
            float r0 = (float) r0
            r3 = 1063004406(0x3f5c28f6, float:0.86)
            float r0 = r0 * r3
            int r0 = (int) r0
            r1.setLayout(r2, r0)
        L226:
            return
    }

    /* JADX INFO: renamed from: Ω */
    public static final java.lang.Object m4478(p000.InterfaceC0880up r2) {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            hu1 r1 = p000.pd2.f8526
            java.lang.Object r2 = r2.mo1787(r1, r0)
            r2.getClass()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public static final p000.C0709q2 m4479() {
            q2 r0 = new q2
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 7
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static final void m4480(java.lang.Object[] r0, long r1, java.lang.Object r3) {
            int r1 = (int) r1
            int r2 = r0.length
            int r2 = r2 + (-1)
            r1 = r1 & r2
            r0[r1] = r3
            return
    }

    /* JADX INFO: renamed from: γ */
    public static p000.C0299fv m4481(p000.C0299fv r5, java.lang.String r6) {
            java.lang.String r0 = r5.f4139
            java.lang.CharSequence r6 = p000.q02.m4660(r6)
            java.lang.String r6 = r6.toString()
            r1 = 2
            char[] r2 = new char[r1]
            r2 = {x0046: FILL_ARRAY_DATA , data: [47, 92} // fill-array
            java.lang.String r6 = p000.q02.m4661(r6, r2)
            java.lang.String r6 = p000.AbstractC0488ku.m3416(r6)
            boolean r2 = p000.q02.m4671(r6)
            r3 = 0
            if (r2 != 0) goto L40
            boolean r2 = p000.q02.m4671(r0)
            java.lang.String r4 = "/"
            if (r2 == 0) goto L28
            goto L35
        L28:
            char[] r2 = new char[r1]
            r2 = {x004c: FILL_ARRAY_DATA , data: [47, 92} // fill-array
            java.lang.String r0 = p000.q02.m4663(r0, r2)
            java.lang.String r6 = p000.lz1.m3688(r0, r4, r6)
        L35:
            java.lang.String r0 = r5.f4140
            java.lang.String r0 = p000.lz1.m3688(r6, r4, r0)
            fv r5 = p000.C0299fv.m2204(r5, r6, r3, r0, r1)
            return r5
        L40:
            java.lang.String r5 = "追加下载子目录不能为空"
            p000.C1080.m7275(r5)
            return r3
    }

    /* JADX INFO: renamed from: δ */
    public static void m4482(android.app.Activity r16, android.view.View r17, boolean r18, p000.C1000xx r19) {
            r0 = r16
            r1 = r17
            r2 = r19
            java.lang.String r3 = r2.f12355
            java.lang.String r4 = r2.f12371
            java.lang.String r5 = r2.f12348
            int r6 = android.graphics.Color.parseColor(r3)
            java.lang.String r7 = r2.f12356
            int r8 = android.graphics.Color.parseColor(r7)
            java.lang.String r9 = r2.f12360
            int r9 = android.graphics.Color.parseColor(r9)
            java.lang.String r10 = r2.f12353
            int r10 = android.graphics.Color.parseColor(r10)
            r11 = 2131296799(0x7f09021f, float:1.8211525E38)
            android.view.View r11 = r1.findViewById(r11)
            java.lang.String r12 = r2.f12351
            r13 = 14
            android.graphics.drawable.GradientDrawable r13 = p000.jx0.m3062(r13, r0, r12)
            r11.setBackground(r13)
            r11 = 2131296797(0x7f09021d, float:1.821152E38)
            android.view.View r11 = r1.findViewById(r11)
            java.lang.String r13 = r2.f12352
            r14 = 10
            android.graphics.drawable.GradientDrawable r15 = p000.jx0.m3062(r14, r0, r13)
            r11.setBackground(r15)
            r11 = 2131296798(0x7f09021e, float:1.8211523E38)
            android.view.View r11 = r1.findViewById(r11)
            android.graphics.drawable.GradientDrawable r13 = p000.jx0.m3062(r14, r0, r13)
            r11.setBackground(r13)
            r11 = 2131297035(0x7f09030b, float:1.8212004E38)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r11.setTextColor(r6)
            r11 = 2131297034(0x7f09030a, float:1.8212002E38)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r11.setTextColor(r6)
            r11 = 2131297029(0x7f090305, float:1.8211991E38)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r11.setTextColor(r6)
            r11 = 2131297033(0x7f090309, float:1.8212E38)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r11.setTextColor(r6)
            r6 = 2131297019(0x7f0902fb, float:1.8211971E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6.setTextColor(r8)
            r6 = 2131297031(0x7f090307, float:1.8211995E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r11 = r2.f12349
            int r11 = android.graphics.Color.parseColor(r11)
            r6.setTextColor(r11)
            r6 = 2131296796(0x7f09021c, float:1.8211519E38)
            android.view.View r6 = r1.findViewById(r6)
            r6.setBackgroundColor(r10)
            r6 = 2131297032(0x7f090308, float:1.8211997E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10 = 2131297030(0x7f090306, float:1.8211993E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 2131297021(0x7f0902fd, float:1.8211975E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer[] r6 = new java.lang.Integer[]{r6, r10, r11}
            java.util.List r6 = p000.AbstractC1021yh.m6897(r6)
            java.util.Iterator r6 = r6.iterator()
        Lcd:
            boolean r10 = r6.hasNext()
            r11 = 99
            if (r10 == 0) goto Lf2
            java.lang.Object r10 = r6.next()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            android.view.View r10 = r1.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r10.setTextColor(r9)
            java.lang.String r13 = r2.f12361
            android.graphics.drawable.GradientDrawable r11 = p000.jx0.m3062(r11, r0, r13)
            r10.setBackground(r11)
            goto Lcd
        Lf2:
            r6 = 2131296330(0x7f09004a, float:1.8210574E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6
            android.content.res.ColorStateList r8 = android.content.res.ColorStateList.valueOf(r8)
            r6.setImageTintList(r8)
            android.graphics.drawable.RippleDrawable r8 = p000.jx0.m3059(r11, r0, r5, r4)
            r6.setBackground(r8)
            r6 = 2131296331(0x7f09004b, float:1.8210576E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            if (r18 == 0) goto L115
            goto L116
        L115:
            r3 = r7
        L116:
            int r3 = android.graphics.Color.parseColor(r3)
            r6.setTextColor(r3)
            android.graphics.drawable.RippleDrawable r3 = p000.jx0.m3059(r14, r0, r5, r4)
            r6.setBackground(r3)
            r3 = 2131296334(0x7f09004e, float:1.8210582E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.Button r1 = (android.widget.Button) r1
            if (r18 == 0) goto L130
            goto L132
        L130:
            java.lang.String r12 = "#FFFFFF"
        L132:
            int r3 = android.graphics.Color.parseColor(r12)
            r1.setTextColor(r3)
            java.lang.String r2 = r2.f12366
            android.graphics.drawable.RippleDrawable r0 = p000.jx0.m3059(r14, r0, r5, r2)
            r1.setBackground(r0)
            return
    }

    /* JADX INFO: renamed from: ε */
    public static final void m4483(p000.C1035yv r13, float r14, float r15, boolean r16, float r17) {
            r13.getClass()
            boolean r0 = p000.p91.m4430()
            if (r0 != 0) goto Lb
            goto Lfd
        Lb:
            r0 = 0
            int r1 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lfd
            int r1 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r1 > 0) goto L16
            goto Lfd
        L16:
            float r1 = r13.f12822
            int r1 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r1 >= 0) goto L1e
            r13.f12822 = r15
        L1e:
            aw r1 = r13.f12817
            kv1 r1 = r1.f1331
            p70 r1 = r1.f6123
            java.lang.Object r1 = r1.invoke()
            iv1 r1 = (p000.iv1) r1
            boolean r2 = r1 instanceof p000.xo1
            r3 = 0
            if (r2 == 0) goto L32
            xo1 r1 = (p000.xo1) r1
            goto L33
        L32:
            r1 = r3
        L33:
            r2 = 0
            r4 = 1
            if (r1 != 0) goto L39
            goto La1
        L39:
            ea1 r3 = r1.f12250
            ea1 r6 = r1.f12249
            ea1 r7 = r1.f12248
            ea1 r1 = r1.f12247
            long r8 = r13.f12820
            float r10 = p000.jw1.m2998(r8)
            r11 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r11
            np0 r11 = r13.f12821
            np0 r12 = p000.np0.f7701
            if (r11 != r12) goto L52
            r11 = r4
            goto L53
        L52:
            r11 = r2
        L53:
            if (r11 == 0) goto L5a
            float r12 = r1.m1890(r8)
            goto L5e
        L5a:
            float r12 = r7.m1890(r8)
        L5e:
            if (r11 == 0) goto L65
            float r1 = r7.m1890(r8)
            goto L69
        L65:
            float r1 = r1.m1890(r8)
        L69:
            if (r11 == 0) goto L70
            float r7 = r6.m1890(r8)
            goto L74
        L70:
            float r7 = r3.m1890(r8)
        L74:
            if (r11 == 0) goto L7b
            float r3 = r3.m1890(r8)
            goto L7f
        L7b:
            float r3 = r6.m1890(r8)
        L7f:
            int r6 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r6 <= 0) goto L84
            r12 = r10
        L84:
            int r6 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r6 <= 0) goto L89
            r1 = r10
        L89:
            int r6 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r6 <= 0) goto L8e
            r7 = r10
        L8e:
            int r6 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r6 <= 0) goto L93
            goto L94
        L93:
            r10 = r3
        L94:
            r3 = 4
            float[] r3 = new float[r3]
            r3[r2] = r12
            r3[r4] = r1
            r1 = 2
            r3[r1] = r7
            r1 = 3
            r3[r1] = r10
        La1:
            if (r3 != 0) goto La5
            goto Lfd
        La5:
            int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lab
            r7 = r4
            goto Lac
        Lab:
            r7 = r2
        Lac:
            if (r7 == 0) goto Lb2
            java.lang.String r0 = "\nuniform shader content;\n\nuniform float2 size;\nuniform float2 offset;\nuniform float4 cornerRadii;\nuniform float refractionHeight;\nuniform float refractionAmount;\nuniform float depthEffect;\nuniform float chromaticAberration;\n\n\nfloat radiusAt(float2 coord, float4 radii) {\n    if (coord.x >= 0.0) {\n        if (coord.y <= 0.0) return radii.y;\n        else return radii.z;\n    } else {\n        if (coord.y <= 0.0) return radii.x;\n        else return radii.w;\n    }\n}\n\nfloat sdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    float outside = length(max(cornerCoord, 0.0)) - radius;\n    float inside = min(max(cornerCoord.x, cornerCoord.y), 0.0);\n    return outside + inside;\n}\n\nfloat2 gradSdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    if (cornerCoord.x >= 0.0 || cornerCoord.y >= 0.0) {\n        return sign(coord) * normalize(max(cornerCoord, 0.0));\n    } else {\n        float gradX = step(cornerCoord.y, cornerCoord.x);\n        return sign(coord) * float2(gradX, 1.0 - gradX);\n    }\n}\n\n\nfloat circleMap(float x) {\n    return 1.0 - sqrt(1.0 - x * x);\n}\n\nhalf4 main(float2 coord) {\n    float2 halfSize = size * 0.5;\n    float2 centeredCoord = (coord + offset) - halfSize;\n    float radius = radiusAt(coord, cornerRadii);\n\n    float sd = sdRoundedRect(centeredCoord, halfSize, radius);\n    if (-sd >= refractionHeight) {\n        return content.eval(coord);\n    }\n    sd = min(sd, 0.0);\n\n    float d = circleMap(1.0 - -sd / refractionHeight) * refractionAmount;\n    float gradRadius = min(radius * 1.5, min(halfSize.x, halfSize.y));\n    float2 grad = normalize(\n        gradSdRoundedRect(centeredCoord, halfSize, gradRadius) +\n            depthEffect * normalize(centeredCoord)\n    );\n\n    float2 refractedCoord = coord + d * grad;\n    float dispersionIntensity =\n        chromaticAberration * ((centeredCoord.x * centeredCoord.y) / (halfSize.x * halfSize.y));\n    float2 dispersedCoord = d * grad * dispersionIntensity;\n    half4 color = half4(0.0);\n\n    half4 red = content.eval(refractedCoord + dispersedCoord);\n    color.r += red.r / 3.5;\n    color.a += red.a / 7.0;\n\n    half4 orange = content.eval(refractedCoord + dispersedCoord * (2.0 / 3.0));\n    color.r += orange.r / 3.5;\n    color.g += orange.g / 7.0;\n    color.a += orange.a / 7.0;\n\n    half4 yellow = content.eval(refractedCoord + dispersedCoord * (1.0 / 3.0));\n    color.r += yellow.r / 3.5;\n    color.g += yellow.g / 3.5;\n    color.a += yellow.a / 7.0;\n\n    half4 green = content.eval(refractedCoord);\n    color.g += green.g / 3.5;\n    color.a += green.a / 7.0;\n\n    half4 cyan = content.eval(refractedCoord - dispersedCoord * (1.0 / 3.0));\n    color.g += cyan.g / 3.5;\n    color.b += cyan.b / 3.0;\n    color.a += cyan.a / 7.0;\n\n    half4 blue = content.eval(refractedCoord - dispersedCoord * (2.0 / 3.0));\n    color.b += blue.b / 3.0;\n    color.a += blue.a / 7.0;\n\n    half4 purple = content.eval(refractedCoord - dispersedCoord);\n    color.r += purple.r / 7.0;\n    color.b += purple.b / 3.0;\n    color.a += purple.a / 7.0;\n\n    return color;\n}\n"
        Lb0:
            r9 = r0
            goto Lb5
        Lb2:
            java.lang.String r0 = "\nuniform shader content;\n\nuniform float2 size;\nuniform float2 offset;\nuniform float4 cornerRadii;\nuniform float refractionHeight;\nuniform float refractionAmount;\nuniform float depthEffect;\n\n\nfloat radiusAt(float2 coord, float4 radii) {\n    if (coord.x >= 0.0) {\n        if (coord.y <= 0.0) return radii.y;\n        else return radii.z;\n    } else {\n        if (coord.y <= 0.0) return radii.x;\n        else return radii.w;\n    }\n}\n\nfloat sdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    float outside = length(max(cornerCoord, 0.0)) - radius;\n    float inside = min(max(cornerCoord.x, cornerCoord.y), 0.0);\n    return outside + inside;\n}\n\nfloat2 gradSdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    if (cornerCoord.x >= 0.0 || cornerCoord.y >= 0.0) {\n        return sign(coord) * normalize(max(cornerCoord, 0.0));\n    } else {\n        float gradX = step(cornerCoord.y, cornerCoord.x);\n        return sign(coord) * float2(gradX, 1.0 - gradX);\n    }\n}\n\n\nfloat circleMap(float x) {\n    return 1.0 - sqrt(1.0 - x * x);\n}\n\nhalf4 main(float2 coord) {\n    float2 halfSize = size * 0.5;\n    float2 centeredCoord = (coord + offset) - halfSize;\n    float radius = radiusAt(coord, cornerRadii);\n\n    float sd = sdRoundedRect(centeredCoord, halfSize, radius);\n    if (-sd >= refractionHeight) {\n        return content.eval(coord);\n    }\n    sd = min(sd, 0.0);\n\n    float d = circleMap(1.0 - -sd / refractionHeight) * refractionAmount;\n    float gradRadius = min(radius * 1.5, min(halfSize.x, halfSize.y));\n    float2 grad = normalize(\n        gradSdRoundedRect(centeredCoord, halfSize, gradRadius) +\n            depthEffect * normalize(centeredCoord)\n    );\n\n    return content.eval(coord + d * grad);\n}\n"
            goto Lb0
        Lb5:
            if (r7 == 0) goto Lbb
            java.lang.String r0 = "DYHelperLiquidGlassLensDispersion"
        Lb9:
            r10 = r0
            goto Lbe
        Lbb:
            java.lang.String r0 = "DYHelperLiquidGlassLens"
            goto Lb9
        Lbe:
            int r0 = r13.f12824
            if (r0 >= r4) goto Lc3
            goto Lc4
        Lc3:
            r4 = r0
        Lc4:
            float r0 = (float) r4
            int r1 = r3.length
            r4 = r3
            float[] r3 = new float[r1]
        Lc9:
            if (r2 >= r1) goto Ld3
            r6 = r4[r2]
            float r6 = r6 / r0
            r3[r2] = r6
            int r2 = r2 + 1
            goto Lc9
        Ld3:
            rt0 r1 = new rt0
            r4 = r14
            r5 = r15
            r6 = r16
            r8 = r17
            r2 = r0
            r0 = r1
            r1 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r14 = p000.p91.m4430()
            if (r14 != 0) goto Le8
            goto Lfd
        Le8:
            b3 r14 = r13.mo2978(r10, r9)
            r0.invoke(r14)
            java.lang.String r0 = "content"
            a3 r14 = p000.g81.m2284(r14, r0)
            in r0 = r13.f12823
            in r14 = p000.g81.m2270(r0, r14)
            r13.f12823 = r14
        Lfd:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static void m4484(android.app.Activity r6, android.app.Dialog r7, android.view.View r8) {
            android.view.Window r4 = r7.getWindow()
            if (r4 != 0) goto L7
            return
        L7:
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r1 = 0
            r0.<init>(r1)
            r4.setBackgroundDrawable(r0)
            r0 = 2
            r4.addFlags(r0)
            android.view.WindowManager$LayoutParams r0 = r4.getAttributes()
            r1 = 1058306785(0x3f147ae1, float:0.58)
            r0.dimAmount = r1
            r4.setAttributes(r0)
            android.content.res.Resources r0 = r6.getResources()
            android.util.DisplayMetrics r2 = r0.getDisplayMetrics()
            int r0 = r2.widthPixels
            float r0 = (float) r0
            r1 = 1064011039(0x3f6b851f, float:0.92)
            float r0 = r0 * r1
            int r0 = (int) r0
            r1 = 430(0x1ae, float:6.03E-43)
            float r1 = (float) r1
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r1 = r1 * r6
            r6 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r6
            int r6 = (int) r1
            int r5 = java.lang.Math.min(r0, r6)
            r6 = -2
            r4.setLayout(r5, r6)
            r6 = 2131296800(0x7f090220, float:1.8211527E38)
            android.view.View r3 = r8.findViewById(r6)
            m9 r0 = new m9
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r3.post(r0)
            return
    }

    /* JADX INFO: renamed from: η */
    public static final java.lang.Object m4485(p000.d22 r7, p000.wh1 r8, p000.AbstractC0715q8 r9) {
            boolean r0 = r9 instanceof p000.g60
            if (r0 == 0) goto L13
            r0 = r9
            g60 r0 = (p000.g60) r0
            int r1 = r0.f4260
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4260 = r1
            goto L18
        L13:
            g60 r0 = new g60
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f4259
            int r1 = r0.f4260
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            wh1 r7 = r0.f4258
            d22 r8 = r0.f4257
            p000.i81.m2649(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L5d
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r7)
            r7 = 0
            return r7
        L34:
            p000.i81.m2649(r9)
            e22 r9 = r7.f2867
            vh1 r9 = r9.f3388
            java.lang.Object r9 = r9.f11293
            int r1 = r9.size()
            r4 = r2
        L42:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            ai1 r5 = (p000.ai1) r5
            boolean r5 = r5.f262
            if (r5 == 0) goto L76
        L4e:
            r0.f4257 = r7
            r0.f4258 = r8
            r0.f4260 = r3
            java.lang.Object r9 = r7.m1638(r8, r0)
            cq r1 = p000.EnumC0184cq.f2716
            if (r9 != r1) goto L5d
            return r1
        L5d:
            vh1 r9 = (p000.vh1) r9
            java.lang.Object r9 = r9.f11293
            int r1 = r9.size()
            r4 = r2
        L66:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            ai1 r5 = (p000.ai1) r5
            boolean r5 = r5.f262
            if (r5 == 0) goto L73
            goto L4e
        L73:
            int r4 = r4 + 1
            goto L66
        L76:
            int r4 = r4 + 1
            goto L42
        L79:
            s62 r7 = p000.s62.f9751
            return r7
    }

    /* JADX INFO: renamed from: θ */
    public static final java.lang.Object m4486(p000.ei1 r3, p000.e80 r4, p000.InterfaceC0631op r5) {
            up r0 = r5.mo72()
            h60 r1 = new h60
            r2 = 0
            r1.<init>(r0, r4, r2)
            e22 r3 = (p000.e22) r3
            r3.getClass()
            ae r4 = new ae
            op r5 = p000.AbstractC0978xb.m6563(r5)
            r0 = 1
            r4.<init>(r0, r5)
            r4.m87()
            d22 r5 = new d22
            r5.<init>(r3, r4)
            k21 r0 = r3.f3380
            monitor-enter(r0)
            k21 r3 = r3.f3389     // Catch: java.lang.Throwable -> L50
            r3.m3127(r5)     // Catch: java.lang.Throwable -> L50
            pp1 r3 = new pp1     // Catch: java.lang.Throwable -> L50
            op r1 = p000.AbstractC0978xb.m6590(r5, r5, r1)     // Catch: java.lang.Throwable -> L50
            op r1 = p000.AbstractC0978xb.m6563(r1)     // Catch: java.lang.Throwable -> L50
            cq r2 = p000.EnumC0184cq.f2716     // Catch: java.lang.Throwable -> L50
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L50
            s62 r1 = p000.s62.f9751     // Catch: java.lang.Throwable -> L50
            r3.mo75(r1)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)
            b0 r3 = new b0
            r0 = 22
            r3.<init>(r0, r5)
            r4.m89(r3)
            java.lang.Object r3 = r4.m86()
            if (r3 != r2) goto L4f
            return r3
        L4f:
            return r1
        L50:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ι */
    public static void m4487(android.app.Activity r10, android.view.View r11, java.util.ArrayList r12, p000.C1000xx r13) {
            x01 r0 = p000.x01.f11964
            android.view.LayoutInflater r0 = r0.m6477(r10)
            r1 = 2131296643(0x7f090183, float:1.8211208E38)
            android.view.View r1 = r11.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2 = 2131297019(0x7f0902fb, float:1.8211971E38)
            android.view.View r2 = r11.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2131297021(0x7f0902fd, float:1.8211975E38)
            android.view.View r11 = r11.findViewById(r3)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r1.removeAllViews()
            boolean r3 = r12.isEmpty()
            r4 = 8
            r5 = 0
            if (r3 == 0) goto L39
            r1.setVisibility(r4)
            r2.setVisibility(r5)
            java.lang.String r10 = "暂无"
            r11.setText(r10)
            return
        L39:
            r3 = 5
            java.util.List r3 = p000.AbstractC0984xh.m6662(r12, r3)
            int r6 = r3.size()
            int r12 = r12.size()
            java.lang.String r7 = " 条"
            if (r12 <= r6) goto L53
            java.lang.String r8 = "最近 "
            java.lang.String r9 = "/"
            java.lang.String r12 = p000.AbstractC0602nx.m4128(r8, r6, r9, r12, r7)
            goto L57
        L53:
            java.lang.String r12 = p000.lz1.m3686(r7, r12)
        L57:
            r11.setText(r12)
            r1.setVisibility(r5)
            r2.setVisibility(r4)
            java.util.Iterator r11 = r3.iterator()
        L64:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Ld2
            java.lang.Object r12 = r11.next()
            p9 r12 = (p000.C0679p9) r12
            r2 = 2131492937(0x7f0c0049, float:1.860934E38)
            android.view.View r2 = r0.inflate(r2, r1, r5)
            r3 = 2131297022(0x7f0902fe, float:1.8211977E38)
            android.view.View r4 = r2.findViewById(r3)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r6 = r12.f8457
            r4.setText(r6)
            r4 = 2131297020(0x7f0902fc, float:1.8211973E38)
            android.view.View r6 = r2.findViewById(r4)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r12 = r12.f8458
            r6.setText(r12)
            r12 = 2131296644(0x7f090184, float:1.821121E38)
            android.view.View r12 = r2.findViewById(r12)
            java.lang.String r6 = r13.f12352
            r7 = 10
            android.graphics.drawable.GradientDrawable r6 = p000.jx0.m3062(r7, r10, r6)
            r12.setBackground(r6)
            android.view.View r12 = r2.findViewById(r3)
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.lang.String r3 = r13.f12360
            int r3 = android.graphics.Color.parseColor(r3)
            r12.setTextColor(r3)
            java.lang.String r3 = r13.f12361
            r6 = 99
            android.graphics.drawable.GradientDrawable r3 = p000.jx0.m3062(r6, r10, r3)
            r12.setBackground(r3)
            android.view.View r12 = r2.findViewById(r4)
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.lang.String r3 = r13.f12355
            int r3 = android.graphics.Color.parseColor(r3)
            r12.setTextColor(r3)
            r1.addView(r2)
            goto L64
        Ld2:
            return
    }

    /* JADX INFO: renamed from: κ */
    public static java.lang.Class m4488(java.lang.ClassLoader r3, java.lang.String r4) {
            r0 = 0
            java.lang.Class r0 = java.lang.Class.forName(r4, r0, r3)     // Catch: java.lang.Throwable -> L6
            goto Ld
        L6:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Ld:
            boolean r1 = r0 instanceof p000.eo1
            r2 = 0
            if (r1 == 0) goto L13
            r0 = r2
        L13:
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L2c
            java.lang.Class r3 = r3.loadClass(r4)     // Catch: java.lang.Throwable -> L1c
            goto L23
        L1c:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L23:
            boolean r4 = r3 instanceof p000.eo1
            if (r4 == 0) goto L28
            goto L29
        L28:
            r2 = r3
        L29:
            r0 = r2
            java.lang.Class r0 = (java.lang.Class) r0
        L2c:
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public static void m4489(android.widget.SeekBar r3) {
            android.content.Context r0 = r3.getContext()
            r0.getClass()
            xx r0 = p000.jx0.m3049(r0)
            r1 = 100
            r3.setMax(r1)
            java.lang.String r1 = r0.f12358
            int r2 = android.graphics.Color.parseColor(r1)
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r3.setProgressTintList(r2)
            java.lang.String r0 = r0.f12353
            int r0 = android.graphics.Color.parseColor(r0)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r3.setProgressBackgroundTintList(r0)
            int r0 = android.graphics.Color.parseColor(r1)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r3.setThumbTintList(r0)
            r0 = 0
            r3.setSplitTrack(r0)
            return
    }

    /* JADX INFO: renamed from: μ */
    public static android.widget.FrameLayout m4490(android.app.Activity r4, p000.C0277f9 r5, int r6, java.lang.String r7, java.lang.String r8) {
            r0 = 34
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r5 = r5.invoke(r0)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            float r0 = (float) r5
            r1 = 1046562734(0x3e6147ae, float:0.22)
            float r1 = r1 * r0
            int r1 = (int) r1
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r4)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r5, r5)
            r5 = 16
            r3.gravity = r5
            r2.setLayoutParams(r3)
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            int r8 = android.graphics.Color.parseColor(r8)
            r5.setColor(r8)
            r8 = 1050253722(0x3e99999a, float:0.3)
            float r0 = r0 * r8
            r5.setCornerRadius(r0)
            r2.setBackground(r5)
            android.widget.ImageView r5 = new android.widget.ImageView
            r5.<init>(r4)
            r5.setImageResource(r6)
            int r4 = android.graphics.Color.parseColor(r7)
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
            r5.setImageTintList(r4)
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_CENTER
            r5.setScaleType(r4)
            r5.setPadding(r1, r1, r1, r1)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r6 = -1
            r4.<init>(r6, r6)
            r5.setLayoutParams(r4)
            r2.addView(r5)
            return r2
    }

    /* JADX INFO: renamed from: ν */
    public static p000.xi0 m4491(java.lang.String r11, long r12, java.lang.String r14, java.lang.String r15, boolean r16, long r17, java.lang.Integer r19, java.lang.Integer r20) {
            nj0 r0 = p000.nj0.f7642
            if (r16 == 0) goto L6
        L4:
            r6 = r0
            goto L56
        L6:
            nj0 r1 = p000.nj0.f7643
            if (r19 != 0) goto Lb
            goto L14
        Lb:
            int r4 = r19.intValue()
            r5 = 2
            if (r4 != r5) goto L14
        L12:
            r6 = r1
            goto L56
        L14:
            r4 = 1
            if (r19 != 0) goto L18
            goto L28
        L18:
            int r5 = r19.intValue()
            if (r5 != r4) goto L28
            if (r20 != 0) goto L21
            goto L28
        L21:
            int r5 = r20.intValue()
            if (r5 != r4) goto L28
            goto L12
        L28:
            if (r19 != 0) goto L2b
            goto L34
        L2b:
            int r1 = r19.intValue()
            if (r1 != r4) goto L34
            nj0 r0 = p000.nj0.f7644
            goto L4
        L34:
            if (r20 != 0) goto L37
            goto L40
        L37:
            int r1 = r20.intValue()
            if (r1 != r4) goto L40
            nj0 r0 = p000.nj0.f7645
            goto L4
        L40:
            if (r19 != 0) goto L43
            goto L53
        L43:
            int r1 = r19.intValue()
            if (r1 != 0) goto L53
            if (r20 != 0) goto L4c
            goto L53
        L4c:
            int r1 = r20.intValue()
            if (r1 != 0) goto L53
            goto L4
        L53:
            nj0 r0 = p000.nj0.f7646
            goto L4
        L56:
            st r0 = p000.C0810st.f10010
            java.lang.String r0 = p000.C0810st.m5548(r12, r14)
            java.lang.String r1 = ""
            if (r0 != 0) goto L62
            r4 = r1
            goto L63
        L62:
            r4 = r0
        L63:
            java.lang.String r0 = p000.C0810st.m5548(r12, r15)
            if (r0 != 0) goto L6b
            r5 = r1
            goto L6c
        L6b:
            r5 = r0
        L6c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r1 = 32
            r0.append(r1)
            r0.append(r5)
            r0.append(r1)
            java.lang.String r7 = r6.f7648
            r0.append(r7)
            r0.append(r1)
            r0.append(r11)
            r0.append(r1)
            r8 = 0
            int r1 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r1 <= 0) goto L96
            r0.append(r12)
        L96:
            java.lang.String r0 = r0.toString()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r10 = p000.AbstractC0602nx.m4134(r1, r0, r1)
            xi0 r0 = new xi0
            r1 = r11
            r2 = r12
            r7 = r16
            r8 = r17
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r10)
            return r0
    }

    /* JADX INFO: renamed from: ξ */
    public static android.content.res.Resources m4492(android.content.Context r4, java.lang.String r5) {
            r5.getClass()
            r4.getClass()
            java.lang.Class<android.content.res.AssetManager> r0 = android.content.res.AssetManager.class
            r1 = 0
            java.lang.reflect.Constructor r2 = r0.getDeclaredConstructor(r1)
            java.lang.Object r1 = r2.newInstance(r1)
            android.content.res.AssetManager r1 = (android.content.res.AssetManager) r1
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}
            java.lang.String r3 = "addAssetPath"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r2)
            r2 = 1
            r0.setAccessible(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r5}
            java.lang.Object r0 = r0.invoke(r1, r2)
            r0.getClass()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L4c
            android.content.res.Resources r5 = new android.content.res.Resources
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            r5.<init>(r1, r0, r4)
            return r5
        L4c:
            java.lang.String r4 = "addAssetPath 返回 0，apkPath="
            java.lang.String r4 = r4.concat(r5)
            p000.C1080.m7279(r4)
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ο */
    public static java.util.ArrayList m4493(java.util.List r17) {
            java.util.Iterator r0 = r17.iterator()
        L4:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L15
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.setAccessible(r2)
            goto L4
        L15:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r17.iterator()
        L23:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.String r6 = p000.lz1.m3694(r5)
            java.lang.String r7 = r5.getName()
            java.lang.String r8 = p000.lz1.m3690(r7, r5)
            java.lang.Class[] r9 = r5.getParameterTypes()
            r9.getClass()
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r9.length
            r10.<init>(r11)
            int r11 = r9.length
            r12 = 0
        L4b:
            if (r12 >= r11) goto L54
            r13 = r9[r12]
            int r12 = p000.lz1.m3679(r13, r10, r12, r2)
            goto L4b
        L54:
            int r5 = r5.getModifiers()
            java.lang.reflect.Modifier.isStatic(r5)
            r15 = 0
            r16 = 62
            java.lang.String r11 = ","
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r5 = p000.AbstractC0984xh.m6644(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r9 = "#"
            java.lang.String r10 = "("
            java.lang.StringBuilder r5 = p000.AbstractC0602nx.m4138(r6, r9, r7, r10, r5)
            java.lang.String r6 = "):"
            boolean r5 = p000.lz1.m3673(r5, r6, r8, r0)
            if (r5 == 0) goto L23
            r1.add(r4)
            goto L23
        L7b:
            return r1
    }

    /* JADX INFO: renamed from: π */
    public static p000.r01 m4494(p000.ep0 r9, p000.p70 r10, p000.a80 r11, p000.a80 r12, p000.a80 r13, p000.a80 r14, int r15) {
            r15 = r15 & 16
            if (r15 == 0) goto L5
            r13 = 0
        L5:
            r5 = r13
            r9.getClass()
            r10.getClass()
            r11.getClass()
            boolean r8 = p000.p91.m4430()
            p01 r13 = p000.p01.f8378
            if (r5 == 0) goto L1b
            r01 r13 = p000.h62.m2426(r13, r5)
        L1b:
            tv r0 = new tv
            ig r6 = p000.pd2.f8519
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r01 r9 = r13.mo4345(r0)
            return r9
    }

    /* JADX INFO: renamed from: ρ */
    public static java.lang.reflect.Field m4495(java.lang.Class r2, java.lang.String r3) {
        L0:
            if (r2 == 0) goto L18
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L18
            java.lang.reflect.Field r0 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L13
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L13
            return r0
        L13:
            java.lang.Class r2 = r2.getSuperclass()
            goto L0
        L18:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: σ */
    public static java.lang.String m4496(java.lang.String... r4) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L13
            r2 = r4[r1]
            if (r2 == 0) goto L10
            boolean r3 = p000.q02.m4671(r2)
            if (r3 == 0) goto Lf
            goto L10
        Lf:
            return r2
        L10:
            int r1 = r1 + 1
            goto L2
        L13:
            java.lang.String r4 = ""
            return r4
    }

    /* JADX INFO: renamed from: τ */
    public static java.lang.String m4497(long r2, java.lang.String r4) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L9
            java.lang.String r2 = ""
            return r2
        L9:
            r0 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L15
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
        L15:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L2b
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L2b
            java.util.Date r4 = new java.util.Date     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r0.format(r4)     // Catch: java.lang.Throwable -> L2b
            r4.getClass()     // Catch: java.lang.Throwable -> L2b
            return r4
        L2b:
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.lang.String r0 = "yyyy-MM-dd_HH-mm-ss"
            java.util.Locale r1 = java.util.Locale.getDefault()
            r4.<init>(r0, r1)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            java.lang.String r2 = r4.format(r0)
            r2.getClass()
            return r2
    }

    /* JADX INFO: renamed from: υ */
    public static p000.InterfaceC0806sp m4498(p000.InterfaceC0806sp r1, p000.InterfaceC0843tp r2) {
            r2.getClass()
            tp r0 = r1.getKey()
            boolean r2 = p000.ln0.m3626(r0, r2)
            if (r2 == 0) goto Le
            return r1
        Le:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: φ */
    public static final int m4499(android.text.Layout r2, int r3, boolean r4) {
            if (r3 > 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.CharSequence r0 = r2.getText()
            int r0 = r0.length()
            if (r3 < r0) goto L15
            int r2 = r2.getLineCount()
            int r2 = r2 + (-1)
            return r2
        L15:
            int r0 = r2.getLineForOffset(r3)
            int r1 = r2.getLineStart(r0)
            int r2 = r2.getLineEnd(r0)
            if (r1 == r3) goto L26
            if (r2 == r3) goto L26
            goto L2f
        L26:
            if (r1 != r3) goto L2d
            if (r4 == 0) goto L2f
            int r0 = r0 + (-1)
            return r0
        L2d:
            if (r4 == 0) goto L30
        L2f:
            return r0
        L30:
            int r0 = r0 + 1
            return r0
    }

    /* JADX INFO: renamed from: χ */
    public static final android.graphics.Paint m4500(p000.C0709q2 r2) {
            if (r2 != 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received "
            r0.<init>(r1)
            java.lang.Class r1 = r2.getClass()
            wf r1 = p000.vm1.m6272(r1)
            java.lang.String r1 = r1.m6377()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p000.zl0.m7163(r0)
        L1f:
            java.lang.Object r2 = r2.f8800
            android.graphics.Paint r2 = (android.graphics.Paint) r2
            return r2
    }

    /* JADX INFO: renamed from: ψ */
    public static final p000.fw0 m4501(p000.fw0 r2) {
            q31 r2 = r2.f4149
            yp0 r2 = r2.f8839
        L4:
            yp0 r0 = r2.m7005()
            r1 = 0
            if (r0 == 0) goto Le
            yp0 r0 = r0.f12750
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L29
            yp0 r0 = r2.m7005()
            if (r0 == 0) goto L19
            yp0 r1 = r0.f12750
        L19:
            r1.getClass()
            yp0 r2 = r2.m7005()
            r2.getClass()
            yp0 r2 = r2.f12750
            r2.getClass()
            goto L4
        L29:
            k31 r2 = r2.f12733
            q31 r2 = r2.f5727
            fw0 r2 = r2.mo2314()
            r2.getClass()
            return r2
    }

    /* JADX INFO: renamed from: ω */
    public static final int m4502(p000.C0202d7 r4, java.lang.Object r5, int r6) {
            int r0 = r4.f2931
            if (r0 != 0) goto L6
            r4 = -1
            return r4
        L6:
            int[] r1 = r4.f2929     // Catch: java.lang.IndexOutOfBoundsException -> L4c
            int r1 = p000.AbstractC1021yh.m6880(r0, r6, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L4c
            if (r1 >= 0) goto Lf
            goto L19
        Lf:
            java.lang.Object[] r2 = r4.f2930
            r2 = r2[r1]
            boolean r2 = p000.ln0.m3626(r5, r2)
            if (r2 == 0) goto L1a
        L19:
            return r1
        L1a:
            int r2 = r1 + 1
        L1c:
            if (r2 >= r0) goto L32
            int[] r3 = r4.f2929
            r3 = r3[r2]
            if (r3 != r6) goto L32
            java.lang.Object[] r3 = r4.f2930
            r3 = r3[r2]
            boolean r3 = p000.ln0.m3626(r5, r3)
            if (r3 == 0) goto L2f
            return r2
        L2f:
            int r2 = r2 + 1
            goto L1c
        L32:
            int r1 = r1 + (-1)
        L34:
            if (r1 < 0) goto L4a
            int[] r0 = r4.f2929
            r0 = r0[r1]
            if (r0 != r6) goto L4a
            java.lang.Object[] r0 = r4.f2930
            r0 = r0[r1]
            boolean r0 = p000.ln0.m3626(r5, r0)
            if (r0 == 0) goto L47
            return r1
        L47:
            int r1 = r1 + (-1)
            goto L34
        L4a:
            int r4 = ~r2
            return r4
        L4c:
            java.util.ConcurrentModificationException r4 = new java.util.ConcurrentModificationException
            r4.<init>()
            throw r4
    }

    /* JADX INFO: renamed from: а */
    public static java.lang.reflect.Method m4503(org.luckypray.dexkit.result.MethodData r7, java.lang.ClassLoader r8) {
            r0 = 0
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.Throwable -> L27
            java.lang.reflect.Method[] r1 = r1.getMethods()     // Catch: java.lang.Throwable -> L27
            r1.getClass()     // Catch: java.lang.Throwable -> L27
            int r2 = r1.length     // Catch: java.lang.Throwable -> L27
            r3 = 0
        Le:
            if (r3 >= r2) goto L2c
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = r4.getName()     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = "getMethodInstance"
            boolean r5 = p000.ln0.m3626(r5, r6)     // Catch: java.lang.Throwable -> L27
            if (r5 == 0) goto L29
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L27
            int r5 = r5.length     // Catch: java.lang.Throwable -> L27
            r6 = 1
            if (r5 != r6) goto L29
            goto L2d
        L27:
            r7 = move-exception
            goto L40
        L29:
            int r3 = r3 + 1
            goto Le
        L2c:
            r4 = r0
        L2d:
            if (r4 != 0) goto L31
        L2f:
            r7 = r0
            goto L46
        L31:
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r4.invoke(r7, r8)     // Catch: java.lang.Throwable -> L27
            boolean r8 = r7 instanceof java.lang.reflect.Method     // Catch: java.lang.Throwable -> L27
            if (r8 == 0) goto L2f
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.Throwable -> L27
            goto L46
        L40:
            eo1 r8 = new eo1
            r8.<init>(r7)
            r7 = r8
        L46:
            boolean r8 = r7 instanceof p000.eo1
            if (r8 == 0) goto L4b
            goto L4c
        L4b:
            r0 = r7
        L4c:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
    }

    /* JADX INFO: renamed from: б */
    public static final java.lang.Object m4504(p000.InterfaceC0880up r1, java.lang.Object r2) {
            if (r2 != 0) goto L6
            java.lang.Object r2 = m4478(r1)
        L6:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r2 != r0) goto L10
            uy r1 = p000.pd2.f8525
            return r1
        L10:
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L26
            g42 r0 = new g42
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.<init>(r2, r1)
            hu1 r2 = p000.pd2.f8528
            java.lang.Object r1 = r1.mo1787(r2, r0)
            return r1
        L26:
            c42 r2 = (p000.c42) r2
            java.lang.String r1 = "Compose:LaunchedEffect"
            android.os.Trace.beginSection(r1)
            s62 r1 = p000.s62.f9751
            return r1
    }

    /* JADX INFO: renamed from: Ε */
    public abstract void mo1978(java.lang.Throwable r1);

    /* JADX INFO: renamed from: Ζ */
    public abstract void mo1979(p000.C0379i0 r1);
}
