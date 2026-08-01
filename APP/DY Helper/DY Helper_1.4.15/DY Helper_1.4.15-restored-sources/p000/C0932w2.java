package p000;

/* JADX INFO: renamed from: w2 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0932w2 implements p000.o91 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f11532;

    /* JADX INFO: renamed from: β */
    public final p000.w32 f11533;

    /* JADX INFO: renamed from: γ */
    public final java.util.List f11534;

    /* JADX INFO: renamed from: δ */
    public final java.util.List f11535;

    /* JADX INFO: renamed from: ε */
    public final p000.f50 f11536;

    /* JADX INFO: renamed from: ζ */
    public final p000.InterfaceC1031yr f11537;

    /* JADX INFO: renamed from: η */
    public final p000.C0198d3 f11538;

    /* JADX INFO: renamed from: θ */
    public final java.lang.CharSequence f11539;

    /* JADX INFO: renamed from: ι */
    public final p000.pp0 f11540;

    /* JADX INFO: renamed from: κ */
    public p000.C0538m6 f11541;

    /* JADX INFO: renamed from: λ */
    public final boolean f11542;

    /* JADX INFO: renamed from: μ */
    public final int f11543;

    public C0932w2(java.lang.String r41, p000.w32 r42, java.util.List r43, java.util.List r44, p000.f50 r45, p000.InterfaceC1031yr r46) {
            r40 = this;
            r0 = r40
            r1 = r42
            r2 = r43
            r3 = r46
            r0.<init>()
            r4 = r41
            r0.f11532 = r4
            r0.f11533 = r1
            r0.f11534 = r2
            r4 = r44
            r0.f11535 = r4
            r4 = r45
            r0.f11536 = r4
            r0.f11537 = r3
            d3 r4 = new d3
            float r5 = r3.mo586()
            r6 = 1
            r4.<init>(r6)
            r4.density = r5
            c32 r5 = p000.c32.f1958
            r4.f2869 = r5
            r5 = 3
            r4.f2870 = r5
            fv1 r7 = p000.fv1.f4142
            r4.f2871 = r7
            r0.f11538 = r4
            boolean r7 = p000.AbstractC0782s1.m5325(r1)
            ux1 r8 = r1.f11556
            r91 r1 = r1.f11557
            r9 = 0
            if (r7 != 0) goto L43
            r7 = r9
            goto L67
        L43:
            n r7 = p000.C0566my.f7319
            n r7 = p000.C0566my.f7319
            java.lang.Object r10 = r7.f7336
            c02 r10 = (p000.c02) r10
            if (r10 == 0) goto L4e
            goto L5d
        L4e:
            boolean r10 = p000.C0449jy.m3072()
            if (r10 == 0) goto L5b
            c02 r10 = r7.m3928()
            r7.f7336 = r10
            goto L5d
        L5b:
            jl0 r10 = p000.AbstractC0073bd.f1649
        L5d:
            java.lang.Object r7 = r10.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
        L67:
            r0.f11542 = r7
            int r7 = r1.f9302
            av0 r10 = r8.f11006
            r11 = 4
            r13 = 2
            if (r7 != r11) goto L73
        L71:
            r7 = r13
            goto La0
        L73:
            r11 = 5
            if (r7 != r11) goto L78
        L76:
            r7 = r5
            goto La0
        L78:
            if (r7 != r6) goto L7c
            r7 = r9
            goto La0
        L7c:
            if (r7 != r13) goto L80
            r7 = r6
            goto La0
        L80:
            if (r7 != r5) goto L83
            goto L85
        L83:
            if (r7 != 0) goto L8af
        L85:
            if (r10 == 0) goto L93
            java.lang.Object r7 = r10.f1320
            java.lang.Object r7 = r7.get(r9)
            zu0 r7 = (p000.zu0) r7
            java.util.Locale r7 = r7.f13307
            if (r7 != 0) goto L97
        L93:
            java.util.Locale r7 = java.util.Locale.getDefault()
        L97:
            int r7 = android.text.TextUtils.getLayoutDirectionFromLocale(r7)
            if (r7 == 0) goto L71
            if (r7 == r6) goto L76
            goto L71
        La0:
            r0.f11543 = r7
            v2 r7 = new v2
            r7.<init>(r0)
            q32 r1 = r1.f9309
            if (r1 != 0) goto Lad
            q32 r1 = p000.q32.f8846
        Lad:
            boolean r10 = r1.f8849
            if (r10 == 0) goto Lb8
            int r10 = r4.getFlags()
            r10 = r10 | 128(0x80, float:1.8E-43)
            goto Lbe
        Lb8:
            int r10 = r4.getFlags()
            r10 = r10 & (-129(0xffffffffffffff7f, float:NaN))
        Lbe:
            r4.setFlags(r10)
            int r1 = r1.f8848
            if (r1 != r6) goto Ld2
            int r1 = r4.getFlags()
            r1 = r1 | 64
            r4.setFlags(r1)
            r4.setHinting(r9)
            goto Le7
        Ld2:
            if (r1 != r13) goto Ldb
            r4.getFlags()
            r4.setHinting(r6)
            goto Le7
        Ldb:
            if (r1 != r5) goto Le4
            r4.getFlags()
            r4.setHinting(r9)
            goto Le7
        Le4:
            r4.getFlags()
        Le7:
            int r1 = r2.size()
            r5 = r9
        Lec:
            if (r5 >= r1) goto Lff
            java.lang.Object r10 = r2.get(r5)
            r11 = r10
            f4 r11 = (p000.C0272f4) r11
            java.lang.Object r11 = r11.f3745
            boolean r11 = r11 instanceof p000.ux1
            if (r11 == 0) goto Lfc
            goto L100
        Lfc:
            int r5 = r5 + 1
            goto Lec
        Lff:
            r10 = 0
        L100:
            if (r10 == 0) goto L104
            r1 = r6
            goto L105
        L104:
            r1 = r9
        L105:
            long r10 = r8.f10997
            d60 r2 = r8.f10998
            b60 r5 = r8.f10999
            java.lang.String r14 = r8.f11002
            av0 r15 = r8.f11006
            r41 = 0
            f32 r12 = r8.f10996
            r44 = r6
            g32 r6 = r8.f11005
            r43 = r14
            long r13 = r8.f11003
            r16 = r10
            long r9 = p000.y32.m6819(r16)
            r11 = r1
            r18 = r2
            r1 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r19 = p000.z32.m7086(r9, r1)
            if (r19 == 0) goto L139
            r1 = r16
            float r1 = r3.mo595(r1)
            r4.setTextSize(r1)
            goto L150
        L139:
            r1 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r9 = p000.z32.m7086(r9, r1)
            if (r9 == 0) goto L150
            float r1 = r4.getTextSize()
            float r2 = p000.y32.m6820(r16)
            float r2 = r2 * r1
            r4.setTextSize(r2)
        L150:
            br r1 = r8.f11001
            if (r1 != 0) goto L15c
            if (r5 != 0) goto L15c
            if (r18 == 0) goto L159
            goto L15c
        L159:
            r16 = r11
            goto L19e
        L15c:
            if (r18 != 0) goto L161
            d60 r2 = p000.d60.f2921
            goto L163
        L161:
            r2 = r18
        L163:
            if (r5 == 0) goto L168
            int r5 = r5.f1499
            goto L169
        L168:
            r5 = 0
        L169:
            c60 r9 = r8.f11000
            if (r9 == 0) goto L170
            int r9 = r9.f1968
            goto L173
        L170:
            r9 = 65535(0xffff, float:9.1834E-41)
        L173:
            w2 r10 = r7.f11068
            r16 = r11
            f50 r11 = r10.f11536
            g50 r11 = (p000.g50) r11
            n62 r1 = r11.m2231(r1, r2, r5, r9)
            boolean r2 = r1 instanceof p000.n62
            if (r2 != 0) goto L194
            m6 r2 = new m6
            m6 r5 = r10.f11541
            r2.<init>(r1, r5)
            r10.f11541 = r2
            java.lang.Object r1 = r2.f6969
            r1.getClass()
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            goto L19b
        L194:
            java.lang.Object r1 = r1.f7443
            r1.getClass()
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
        L19b:
            r4.setTypeface(r1)
        L19e:
            r1 = 10
            if (r15 == 0) goto L1e7
            av0 r2 = p000.av0.f1319
            av0 r2 = p000.ln0.m3602()
            boolean r2 = r15.equals(r2)
            if (r2 != 0) goto L1e7
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = p000.AbstractC1021yh.m6889(r15, r1)
            r2.<init>(r5)
            java.lang.Object r5 = r15.f1320
            java.util.Iterator r5 = r5.iterator()
        L1bd:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L1cf
            java.lang.Object r9 = r5.next()
            zu0 r9 = (p000.zu0) r9
            java.util.Locale r9 = r9.f13307
            r2.add(r9)
            goto L1bd
        L1cf:
            r9 = 0
            java.util.Locale[] r5 = new java.util.Locale[r9]
            java.lang.Object[] r2 = r2.toArray(r5)
            java.util.Locale[] r2 = (java.util.Locale[]) r2
            int r5 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r5)
            java.util.Locale[] r2 = (java.util.Locale[]) r2
            android.os.LocaleList r5 = new android.os.LocaleList
            r5.<init>(r2)
            r4.setTextLocales(r5)
        L1e7:
            if (r43 == 0) goto L1f6
            java.lang.String r2 = ""
            r5 = r43
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L1f6
            r4.setFontFeatureSettings(r5)
        L1f6:
            if (r6 == 0) goto L214
            g32 r2 = p000.g32.f4224
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L214
            float r2 = r4.getTextScaleX()
            float r5 = r6.f4225
            float r2 = r2 * r5
            r4.setTextScaleX(r2)
            float r2 = r4.getTextSkewX()
            float r5 = r6.f4226
            float r2 = r2 + r5
            r4.setTextSkewX(r2)
        L214:
            long r5 = r12.mo2033()
            r4.m1643(r5)
            kn0 r2 = r12.mo2034()
            r5 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            float r9 = r12.mo2035()
            r4.m1642(r2, r5, r9)
            fv1 r2 = r8.f11009
            r4.m1645(r2)
            c32 r2 = r8.f11008
            r4.m1646(r2)
            kn0 r2 = r8.f11010
            r4.m1644(r2)
            long r5 = p000.y32.m6819(r13)
            r9 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r2 = p000.z32.m7086(r5, r9)
            r5 = 0
            if (r2 == 0) goto L26a
            float r2 = p000.y32.m6820(r13)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L253
            goto L26a
        L253:
            float r2 = r4.getTextSize()
            float r6 = r4.getTextScaleX()
            float r6 = r6 * r2
            float r2 = r3.mo595(r13)
            int r3 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r3 != 0) goto L265
            goto L280
        L265:
            float r2 = r2 / r6
            r4.setLetterSpacing(r2)
            goto L280
        L26a:
            long r2 = p000.y32.m6819(r13)
            r9 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r2 = p000.z32.m7086(r2, r9)
            if (r2 == 0) goto L280
            float r2 = p000.y32.m6820(r13)
            r4.setLetterSpacing(r2)
        L280:
            long r2 = r8.f11007
            r8 r4 = r8.f11004
            if (r16 == 0) goto L2a1
            long r8 = p000.y32.m6819(r13)
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r6 = p000.z32.m7086(r8, r10)
            if (r6 == 0) goto L2a1
            float r6 = p000.y32.m6820(r13)
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 != 0) goto L29e
            goto L2a1
        L29e:
            r6 = r44
            goto L2a2
        L2a1:
            r6 = 0
        L2a2:
            long r8 = p000.C0114ci.f2125
            boolean r10 = p000.C0114ci.m1192(r2, r8)
            if (r10 != 0) goto L2b5
            long r10 = p000.C0114ci.f2124
            boolean r10 = p000.C0114ci.m1192(r2, r10)
            if (r10 != 0) goto L2b5
            r10 = r44
            goto L2b6
        L2b5:
            r10 = 0
        L2b6:
            if (r4 == 0) goto L2c4
            float r11 = r4.f9286
            int r11 = java.lang.Float.compare(r11, r5)
            if (r11 != 0) goto L2c1
            goto L2c4
        L2c1:
            r11 = r44
            goto L2c5
        L2c4:
            r11 = 0
        L2c5:
            if (r6 != 0) goto L2ce
            if (r10 != 0) goto L2ce
            if (r11 != 0) goto L2ce
            r2 = r41
            goto L304
        L2ce:
            if (r6 == 0) goto L2d3
        L2d0:
            r30 = r13
            goto L2d6
        L2d3:
            long r13 = p000.y32.f12441
            goto L2d0
        L2d6:
            if (r10 == 0) goto L2db
            r35 = r2
            goto L2dd
        L2db:
            r35 = r8
        L2dd:
            if (r11 == 0) goto L2e2
            r32 = r4
            goto L2e4
        L2e2:
            r32 = r41
        L2e4:
            ux1 r20 = new ux1
            r38 = 0
            r39 = 63103(0xf67f, float:8.8426E-41)
            r21 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r33 = 0
            r34 = 0
            r37 = 0
            r20.<init>(r21, r23, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r37, r38, r39)
            r2 = r20
        L304:
            java.util.List r3 = r0.f11534
            if (r2 == 0) goto L336
            int r3 = r3.size()
            int r3 = r3 + 1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r6 = 0
        L314:
            if (r6 >= r3) goto L335
            if (r6 != 0) goto L325
            f4 r8 = new f4
            java.lang.String r9 = r0.f11532
            int r9 = r9.length()
            r10 = 0
            r8.<init>(r10, r9, r2)
            goto L32f
        L325:
            java.util.List r8 = r0.f11534
            int r9 = r6 + (-1)
            java.lang.Object r8 = r8.get(r9)
            f4 r8 = (p000.C0272f4) r8
        L32f:
            r4.add(r8)
            int r6 = r6 + 1
            goto L314
        L335:
            r3 = r4
        L336:
            java.lang.String r2 = r0.f11532
            d3 r4 = r0.f11538
            float r4 = r4.getTextSize()
            w32 r6 = r0.f11533
            java.util.List r8 = r0.f11535
            yr r12 = r0.f11537
            boolean r9 = r0.f11542
            t2 r10 = p000.AbstractC0857u2.f10568
            if (r9 == 0) goto L37e
            boolean r9 = p000.C0449jy.m3072()
            if (r9 == 0) goto L37e
            nh1 r9 = r6.f11558
            if (r9 == 0) goto L360
            kh1 r9 = r9.f7627
            if (r9 == 0) goto L360
            int r9 = r9.f5929
            xy r10 = new xy
            r10.<init>(r9)
            goto L362
        L360:
            r10 = r41
        L362:
            if (r10 != 0) goto L366
        L364:
            r9 = 0
            goto L36d
        L366:
            int r9 = r10.f12379
            r10 = 2
            if (r9 != r10) goto L364
            r9 = r44
        L36d:
            jy r10 = p000.C0449jy.m3071()
            int r11 = r2.length()
            r13 = 0
            java.lang.CharSequence r9 = r10.m3076(r13, r11, r9, r2)
            r9.getClass()
            goto L37f
        L37e:
            r9 = r2
        L37f:
            boolean r10 = r3.isEmpty()
            r13 = 0
            r15 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            if (r10 == 0) goto L3a9
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto L3a9
            r91 r10 = r6.f11557
            h32 r10 = r10.f9304
            h32 r11 = p000.h32.f4565
            boolean r10 = p000.ln0.m3626(r10, r11)
            if (r10 == 0) goto L3a9
            r91 r10 = r6.f11557
            long r10 = r10.f9303
            long r10 = r10 & r15
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 != 0) goto L3a9
            goto L899
        L3a9:
            boolean r10 = r9 instanceof android.text.Spannable
            if (r10 == 0) goto L3b0
            android.text.Spannable r9 = (android.text.Spannable) r9
            goto L3b6
        L3b0:
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r9)
            r9 = r10
        L3b6:
            ux1 r10 = r6.f11556
            r91 r11 = r6.f11557
            c32 r10 = r10.f11008
            r42 = r5
            c32 r5 = p000.c32.f1959
            boolean r5 = p000.ln0.m3626(r10, r5)
            r10 = 33
            if (r5 == 0) goto L3d5
            t2 r5 = p000.AbstractC0857u2.f10568
            int r2 = r2.length()
            r17 = r13
            r13 = 0
            r9.setSpan(r5, r13, r2, r10)
            goto L3d7
        L3d5:
            r17 = r13
        L3d7:
            nh1 r2 = r6.f11558
            if (r2 == 0) goto L3e2
            kh1 r2 = r2.f7627
            if (r2 == 0) goto L3e2
            boolean r2 = r2.f5928
            goto L3e3
        L3e2:
            r2 = 0
        L3e3:
            if (r2 == 0) goto L404
            wr0 r2 = r11.f9306
            if (r2 != 0) goto L404
            long r1 = r11.f9303
            float r1 = p000.p91.m4438(r1, r4, r12)
            boolean r2 = java.lang.Float.isNaN(r1)
            if (r2 != 0) goto L402
            sr0 r2 = new sr0
            r2.<init>(r1)
            int r1 = r9.length()
            r13 = 0
            r9.setSpan(r2, r13, r1, r10)
        L402:
            r13 = 0
            goto L45c
        L404:
            wr0 r2 = r11.f9306
            if (r2 != 0) goto L40a
            wr0 r2 = p000.wr0.f11805
        L40a:
            long r13 = r11.f9303
            float r21 = p000.p91.m4438(r13, r4, r12)
            boolean r5 = java.lang.Float.isNaN(r21)
            if (r5 != 0) goto L402
            int r5 = r9.length()
            if (r5 != 0) goto L41d
            goto L423
        L41d:
            char r5 = p000.q02.m4672(r9)
            if (r5 != r1) goto L42c
        L423:
            int r1 = r9.length()
            int r1 = r1 + 1
        L429:
            r22 = r1
            goto L431
        L42c:
            int r1 = r9.length()
            goto L429
        L431:
            xr0 r20 = new xr0
            int r1 = r2.f11807
            r5 = r1 & 1
            if (r5 <= 0) goto L43c
            r23 = r44
            goto L43e
        L43c:
            r23 = 0
        L43e:
            r1 = r1 & 16
            if (r1 <= 0) goto L445
            r24 = r44
            goto L447
        L445:
            r24 = 0
        L447:
            float r1 = r2.f11806
            int r2 = r2.f11808
            r25 = r1
            r26 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r1 = r20
            int r2 = r9.length()
            r13 = 0
            r9.setSpan(r1, r13, r2, r10)
        L45c:
            h32 r1 = r11.f9304
            if (r1 == 0) goto L501
            r45 = r13
            long r13 = r1.f4566
            long r1 = r1.f4567
            r5 = r11
            long r10 = p000.u81.m5807(r45)
            boolean r10 = p000.y32.m6818(r13, r10)
            if (r10 == 0) goto L47b
            long r10 = p000.u81.m5807(r45)
            boolean r10 = p000.y32.m6818(r1, r10)
            if (r10 != 0) goto L481
        L47b:
            long r10 = r13 & r15
            int r10 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r10 != 0) goto L484
        L481:
            r15 = r5
            goto L502
        L484:
            long r10 = r1 & r15
            int r10 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r10 != 0) goto L48b
            goto L481
        L48b:
            long r10 = p000.y32.m6819(r13)
            r46 = r4
            r15 = r5
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r16 = p000.z32.m7086(r10, r4)
            if (r16 == 0) goto L4a7
            float r10 = r12.mo595(r13)
            r4 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L4bb
        L4a7:
            r4 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r10 = p000.z32.m7086(r10, r4)
            if (r10 == 0) goto L4b9
            float r10 = p000.y32.m6820(r13)
            float r10 = r10 * r46
            goto L4bb
        L4b9:
            r10 = r42
        L4bb:
            long r13 = p000.y32.m6819(r1)
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r11 = p000.z32.m7086(r13, r4)
            if (r11 == 0) goto L4cf
            float r1 = r12.mo595(r1)
            goto L4e3
        L4cf:
            r4 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r11 = p000.z32.m7086(r13, r4)
            if (r11 == 0) goto L4e1
            float r1 = p000.y32.m6820(r1)
            float r1 = r1 * r46
            goto L4e3
        L4e1:
            r1 = r42
        L4e3:
            android.text.style.LeadingMarginSpan$Standard r2 = new android.text.style.LeadingMarginSpan$Standard
            double r4 = (double) r10
            double r4 = java.lang.Math.ceil(r4)
            float r4 = (float) r4
            int r4 = (int) r4
            double r10 = (double) r1
            double r10 = java.lang.Math.ceil(r10)
            float r1 = (float) r10
            int r1 = (int) r1
            r2.<init>(r4, r1)
            int r1 = r9.length()
            r4 = 33
            r13 = 0
            r9.setSpan(r2, r13, r1, r4)
            goto L502
        L501:
            r15 = r11
        L502:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r3.size()
            r1.<init>(r2)
            int r2 = r3.size()
            r4 = 0
        L510:
            if (r4 >= r2) goto L540
            java.lang.Object r5 = r3.get(r4)
            f4 r5 = (p000.C0272f4) r5
            java.lang.Object r10 = r5.f3745
            boolean r11 = r10 instanceof p000.ux1
            if (r11 == 0) goto L53d
            r11 = r10
            ux1 r11 = (p000.ux1) r11
            br r13 = r11.f11001
            if (r13 != 0) goto L530
            b60 r13 = r11.f10999
            if (r13 != 0) goto L530
            d60 r11 = r11.f10998
            if (r11 == 0) goto L52e
            goto L530
        L52e:
            r11 = 0
            goto L532
        L530:
            r11 = r44
        L532:
            if (r11 != 0) goto L53a
            ux1 r10 = (p000.ux1) r10
            c60 r10 = r10.f11000
            if (r10 == 0) goto L53d
        L53a:
            r1.add(r5)
        L53d:
            int r4 = r4 + 1
            goto L510
        L540:
            ux1 r2 = r6.f11556
            br r4 = r2.f11001
            if (r4 != 0) goto L551
            b60 r5 = r2.f10999
            if (r5 != 0) goto L551
            d60 r5 = r2.f10998
            if (r5 == 0) goto L54f
            goto L551
        L54f:
            r5 = 0
            goto L553
        L551:
            r5 = r44
        L553:
            if (r5 != 0) goto L55d
            c60 r5 = r2.f11000
            if (r5 == 0) goto L55a
            goto L55d
        L55a:
            r2 = r41
            goto L589
        L55d:
            d60 r5 = r2.f10998
            b60 r6 = r2.f10999
            c60 r2 = r2.f11000
            ux1 r20 = new ux1
            r38 = 0
            r39 = 65475(0xffc3, float:9.175E-41)
            r21 = 0
            r23 = 0
            r29 = 0
            r30 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r37 = 0
            r27 = r2
            r28 = r4
            r25 = r5
            r26 = r6
            r20.<init>(r21, r23, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r37, r38, r39)
            r2 = r20
        L589:
            yx1 r4 = new yx1
            r4.<init>(r9, r7)
            int r5 = r1.size()
            r6 = r44
            if (r5 > r6) goto L5c8
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L657
            r13 = 0
            java.lang.Object r5 = r1.get(r13)
            f4 r5 = (p000.C0272f4) r5
            java.lang.Object r5 = r5.f3745
            ux1 r5 = (p000.ux1) r5
            ux1 r2 = p000.p91.m4431(r2, r5)
            java.lang.Object r5 = r1.get(r13)
            f4 r5 = (p000.C0272f4) r5
            int r5 = r5.f3746
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r1 = r1.get(r13)
            f4 r1 = (p000.C0272f4) r1
            int r1 = r1.f3747
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.mo10(r2, r5, r1)
            goto L657
        L5c8:
            int r5 = r1.size()
            int r6 = r5 * 2
            int[] r7 = new int[r6]
            int r10 = r1.size()
            r11 = 0
        L5d5:
            if (r11 >= r10) goto L5ea
            java.lang.Object r13 = r1.get(r11)
            f4 r13 = (p000.C0272f4) r13
            int r14 = r13.f3746
            r7[r11] = r14
            int r14 = r11 + r5
            int r13 = r13.f3747
            r7[r14] = r13
            int r11 = r11 + 1
            goto L5d5
        L5ea:
            r11 = 1
            if (r6 <= r11) goto L5f0
            java.util.Arrays.sort(r7)
        L5f0:
            if (r6 == 0) goto L8a7
            r13 = 0
            r5 = r7[r13]
            r10 = r5
            r5 = 0
        L5f7:
            if (r5 >= r6) goto L657
            r11 = r7[r5]
            if (r11 != r10) goto L606
            r46 = r1
            r16 = r2
            r17 = r5
            r18 = r6
            goto L64e
        L606:
            int r13 = r1.size()
            r16 = r2
            r14 = 0
        L60d:
            if (r14 >= r13) goto L63a
            java.lang.Object r17 = r1.get(r14)
            r46 = r1
            r1 = r17
            f4 r1 = (p000.C0272f4) r1
            r17 = r5
            int r5 = r1.f3746
            r18 = r6
            int r6 = r1.f3747
            if (r5 == r6) goto L631
            boolean r5 = p000.AbstractC0346h4.m2359(r10, r11, r5, r6)
            if (r5 == 0) goto L631
            java.lang.Object r1 = r1.f3745
            ux1 r1 = (p000.ux1) r1
            ux1 r2 = p000.p91.m4431(r2, r1)
        L631:
            int r14 = r14 + 1
            r1 = r46
            r5 = r17
            r6 = r18
            goto L60d
        L63a:
            r46 = r1
            r17 = r5
            r18 = r6
            if (r2 == 0) goto L64d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r4.mo10(r2, r1, r5)
        L64d:
            r10 = r11
        L64e:
            int r5 = r17 + 1
            r1 = r46
            r2 = r16
            r6 = r18
            goto L5f7
        L657:
            int r1 = r3.size()
            r2 = 0
            r4 = 0
        L65d:
            if (r2 >= r1) goto L7ab
            java.lang.Object r5 = r3.get(r2)
            f4 r5 = (p000.C0272f4) r5
            java.lang.Object r6 = r5.f3745
            boolean r7 = r6 instanceof p000.ux1
            if (r7 == 0) goto L67f
            int r13 = r5.f3746
            int r14 = r5.f3747
            if (r13 < 0) goto L67f
            int r5 = r9.length()
            if (r13 >= r5) goto L67f
            if (r14 <= r13) goto L67f
            int r5 = r9.length()
            if (r14 <= r5) goto L688
        L67f:
            r46 = r1
            r16 = r2
            r43 = r3
            r1 = r12
            goto L7a2
        L688:
            ux1 r6 = (p000.ux1) r6
            long r10 = r6.f11003
            r8 r5 = r6.f11004
            f32 r7 = r6.f10996
            if (r5 == 0) goto L6a4
            float r5 = r5.f9286
            r46 = r1
            s8 r1 = new s8
            r16 = r2
            r2 = 0
            r1.<init>(r2, r5)
            r2 = 33
            r9.setSpan(r1, r13, r14, r2)
            goto L6a8
        L6a4:
            r46 = r1
            r16 = r2
        L6a8:
            long r1 = r7.mo2033()
            p000.p91.m4407(r9, r1, r13, r14)
            kn0 r1 = r7.mo2034()
            float r2 = r7.mo2035()
            if (r1 == 0) goto L6d1
            boolean r5 = r1 instanceof p000.px1
            if (r5 == 0) goto L6c5
            px1 r1 = (p000.px1) r1
            long r1 = r1.f8755
            p000.p91.m4407(r9, r1, r13, r14)
            goto L6d1
        L6c5:
            dv1 r5 = new dv1
            pc r1 = (p000.AbstractC0682pc) r1
            r5.<init>(r1, r2)
            r2 = 33
            r9.setSpan(r5, r13, r14, r2)
        L6d1:
            c32 r1 = r6.f11008
            if (r1 == 0) goto L6f2
            int r1 = r1.f1960
            d32 r2 = new d32
            r5 = r1 | 1
            if (r5 != r1) goto L6df
            r5 = 1
            goto L6e0
        L6df:
            r5 = 0
        L6e0:
            r7 = r1 | 2
            if (r7 != r1) goto L6e6
            r1 = 1
            goto L6e7
        L6e6:
            r1 = 0
        L6e7:
            r2.<init>(r5, r1)
            r1 = 33
            r9.setSpan(r2, r13, r14, r1)
        L6ef:
            r17 = r10
            goto L6f5
        L6f2:
            r1 = 33
            goto L6ef
        L6f5:
            long r10 = r6.f10997
            r2 = r1
            p000.p91.m4408(r9, r10, r12, r13, r14)
            java.lang.String r1 = r6.f11002
            if (r1 == 0) goto L708
            i50 r5 = new i50
            r10 = 0
            r5.<init>(r10, r1)
            r9.setSpan(r5, r13, r14, r2)
        L708:
            g32 r1 = r6.f11005
            if (r1 == 0) goto L722
            android.text.style.ScaleXSpan r5 = new android.text.style.ScaleXSpan
            float r7 = r1.f4225
            r5.<init>(r7)
            r9.setSpan(r5, r13, r14, r2)
            s8 r5 = new s8
            float r1 = r1.f4226
            r11 = 1
            r5.<init>(r11, r1)
            r9.setSpan(r5, r13, r14, r2)
            goto L723
        L722:
            r11 = 1
        L723:
            av0 r1 = r6.f11006
            p000.p91.m4409(r9, r1, r13, r14)
            r1 = r12
            long r11 = r6.f11007
            r20 = 16
            int r5 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r5 == 0) goto L73d
            android.text.style.BackgroundColorSpan r5 = new android.text.style.BackgroundColorSpan
            int r7 = p000.kn0.m3355(r11)
            r5.<init>(r7)
            r9.setSpan(r5, r13, r14, r2)
        L73d:
            fv1 r5 = r6.f11009
            if (r5 == 0) goto L775
            long r10 = r5.f4144
            hv1 r7 = new hv1
            r43 = r3
            long r2 = r5.f4143
            int r2 = p000.kn0.m3355(r2)
            r3 = 32
            r19 = r13
            long r12 = r10 >> r3
            int r3 = (int) r12
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r12
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r5 = r5.f4145
            int r11 = (r5 > r42 ? 1 : (r5 == r42 ? 0 : -1))
            if (r11 != 0) goto L76a
            r5 = 1
        L76a:
            r7.<init>(r3, r10, r5, r2)
            r13 = r19
            r2 = 33
            r9.setSpan(r7, r13, r14, r2)
            goto L777
        L775:
            r43 = r3
        L777:
            kn0 r3 = r6.f11010
            if (r3 == 0) goto L783
            dw r5 = new dw
            r5.<init>(r3)
            r9.setSpan(r5, r13, r14, r2)
        L783:
            long r2 = p000.y32.m6819(r17)
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r2 = p000.z32.m7086(r2, r10)
            if (r2 != 0) goto L7a1
            long r2 = p000.y32.m6819(r17)
            r5 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r2 = p000.z32.m7086(r2, r5)
            if (r2 == 0) goto L7a2
        L7a1:
            r4 = 1
        L7a2:
            int r2 = r16 + 1
            r3 = r43
            r12 = r1
            r1 = r46
            goto L65d
        L7ab:
            r43 = r3
            r1 = r12
            if (r4 == 0) goto L82e
            int r2 = r43.size()
            r3 = 0
        L7b5:
            if (r3 >= r2) goto L82e
            r4 = r43
            java.lang.Object r5 = r4.get(r3)
            f4 r5 = (p000.C0272f4) r5
            java.lang.Object r6 = r5.f3745
            e4 r6 = (p000.InterfaceC0235e4) r6
            boolean r7 = r6 instanceof p000.ux1
            if (r7 == 0) goto L7db
            int r7 = r5.f3746
            int r5 = r5.f3747
            if (r7 < 0) goto L7db
            int r10 = r9.length()
            if (r7 >= r10) goto L7db
            if (r5 <= r7) goto L7db
            int r10 = r9.length()
            if (r5 <= r10) goto L7e1
        L7db:
            r43 = r2
            r12 = 33
            r2 = r1
            goto L826
        L7e1:
            ux1 r6 = (p000.ux1) r6
            long r10 = r6.f11003
            long r13 = p000.y32.m6819(r10)
            r42 = r1
            r43 = r2
            r1 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r6 = p000.z32.m7086(r13, r1)
            if (r6 == 0) goto L804
            wq0 r1 = new wq0
            r2 = r42
            float r6 = r2.mo595(r10)
            r1.<init>(r6)
            goto L81f
        L804:
            r2 = r42
            r16 = r10
            r10 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r1 = p000.z32.m7086(r13, r10)
            if (r1 == 0) goto L81d
            vq0 r1 = new vq0
            float r6 = p000.y32.m6820(r16)
            r1.<init>(r6)
            goto L81f
        L81d:
            r1 = r41
        L81f:
            r12 = 33
            if (r1 == 0) goto L826
            r9.setSpan(r1, r7, r5, r12)
        L826:
            int r3 = r3 + 1
            r1 = r2
            r2 = r43
            r43 = r4
            goto L7b5
        L82e:
            r4 = r43
            r2 = r1
            h32 r1 = r15.f9304
            if (r1 == 0) goto L858
            long r5 = r1.f4566
            long r10 = p000.y32.m6819(r5)
            r12 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r1 = p000.z32.m7086(r10, r12)
            if (r1 == 0) goto L84a
            r2.mo595(r5)
            goto L858
        L84a:
            r1 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r1 = p000.z32.m7086(r10, r1)
            if (r1 == 0) goto L858
            p000.y32.m6820(r5)
        L858:
            int r1 = r4.size()
            r2 = 0
        L85d:
            if (r2 >= r1) goto L86a
            java.lang.Object r3 = r4.get(r2)
            f4 r3 = (p000.C0272f4) r3
            java.lang.Object r3 = r3.f3745
            int r2 = r2 + 1
            goto L85d
        L86a:
            int r1 = r8.size()
            if (r1 <= 0) goto L899
            r13 = 0
            java.lang.Object r0 = r8.get(r13)
            f4 r0 = (p000.C0272f4) r0
            java.lang.Object r1 = r0.f3745
            if (r1 != 0) goto L895
            int r1 = r0.f3746
            int r0 = r0.f3747
            java.lang.Class<l62> r2 = p000.l62.class
            java.lang.Object[] r0 = r9.getSpans(r1, r0, r2)
            int r1 = r0.length
        L886:
            if (r13 >= r1) goto L892
            r2 = r0[r13]
            l62 r2 = (p000.l62) r2
            r9.removeSpan(r2)
            int r13 = r13 + 1
            goto L886
        L892:
            fh1 r0 = new fh1
            throw r41
        L895:
            p000.C1080.m7264()
            throw r41
        L899:
            r0.f11539 = r9
            pp0 r1 = new pp0
            d3 r2 = r0.f11538
            int r3 = r0.f11543
            r1.<init>(r9, r2, r3)
            r0.f11540 = r1
            return
        L8a7:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Array is empty."
            r0.<init>(r1)
            throw r0
        L8af:
            r41 = 0
            java.lang.String r0 = "Invalid TextDirection."
            p000.C1080.m7279(r0)
            throw r41
    }

    @Override // p000.o91
    /* JADX INFO: renamed from: α */
    public final boolean mo807() {
            r2 = this;
            m6 r0 = r2.f11541
            r1 = 0
            if (r0 == 0) goto La
            boolean r0 = r0.m3763()
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 != 0) goto L41
            boolean r0 = r2.f11542
            if (r0 != 0) goto L40
            w32 r2 = r2.f11533
            boolean r2 = p000.AbstractC0782s1.m5325(r2)
            if (r2 == 0) goto L40
            n r2 = p000.C0566my.f7319
            n r2 = p000.C0566my.f7319
            java.lang.Object r0 = r2.f7336
            c02 r0 = (p000.c02) r0
            if (r0 == 0) goto L24
            goto L33
        L24:
            boolean r0 = p000.C0449jy.m3072()
            if (r0 == 0) goto L31
            c02 r0 = r2.m3928()
            r2.f7336 = r0
            goto L33
        L31:
            jl0 r0 = p000.AbstractC0073bd.f1649
        L33:
            java.lang.Object r2 = r0.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L40
            goto L41
        L40:
            return r1
        L41:
            r2 = 1
            return r2
    }

    @Override // p000.o91
    /* JADX INFO: renamed from: β */
    public final float mo808() {
            r0 = this;
            pp0 r0 = r0.f11540
            float r0 = r0.m4565()
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final float m6308() {
            r10 = this;
            pp0 r10 = r10.f11540
            float r0 = r10.f8645
            android.text.TextPaint r1 = r10.f8642
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lf
            float r10 = r10.f8645
            return r10
        Lf:
            java.util.Locale r0 = r1.getTextLocale()
            java.text.BreakIterator r0 = java.text.BreakIterator.getLineInstance(r0)
            lf r2 = new lf
            java.lang.CharSequence r3 = r10.f8641
            int r4 = r3.length()
            r2.<init>(r3, r4)
            r0.setText(r2)
            java.util.PriorityQueue r2 = new java.util.PriorityQueue
            o9 r3 = p000.kn0.f6052
            r4 = 10
            r2.<init>(r4, r3)
            int r3 = r0.next()
            r5 = 0
        L33:
            r6 = -1
            if (r3 == r6) goto L6a
            int r6 = r2.size()
            r7 = 1
            if (r6 >= r4) goto L46
            xm0 r6 = new xm0
            r6.<init>(r5, r3, r7)
            r2.add(r6)
            goto L62
        L46:
            java.lang.Object r6 = r2.peek()
            xm0 r6 = (p000.xm0) r6
            if (r6 == 0) goto L62
            int r8 = r6.f11348
            int r6 = r6.f11347
            int r8 = r8 - r6
            int r6 = r3 - r5
            if (r8 >= r6) goto L62
            r2.poll()
            xm0 r6 = new xm0
            r6.<init>(r5, r3, r7)
            r2.add(r6)
        L62:
            int r5 = r0.next()
            r9 = r5
            r5 = r3
            r3 = r9
            goto L33
        L6a:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L72
            r0 = 0
            goto Lac
        L72:
            java.util.Iterator r0 = r2.iterator()
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r0.next()
            xm0 r2 = (p000.xm0) r2
            int r3 = r2.f11347
            int r2 = r2.f11348
            java.lang.CharSequence r4 = r10.m4564()
            float r2 = android.text.Layout.getDesiredWidth(r4, r3, r2, r1)
        L8e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lab
            java.lang.Object r3 = r0.next()
            xm0 r3 = (p000.xm0) r3
            int r4 = r3.f11347
            int r3 = r3.f11348
            java.lang.CharSequence r5 = r10.m4564()
            float r3 = android.text.Layout.getDesiredWidth(r5, r4, r3, r1)
            float r2 = java.lang.Math.max(r2, r3)
            goto L8e
        Lab:
            r0 = r2
        Lac:
            r10.f8645 = r0
            return r0
        Laf:
            p000.C1080.m7277()
            r10 = 0
            return r10
    }
}
