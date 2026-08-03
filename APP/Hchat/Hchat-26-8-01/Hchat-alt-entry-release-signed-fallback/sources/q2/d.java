package q2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements i2.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f10605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2.n0 f10606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f10607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f10608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m2.d f10609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u2.c f10610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q2.f f10611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.CharSequence f10612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j2.f f10613i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b5.c f10614j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f10615k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f10616l;

    public d(java.lang.String r39, i2.n0 r40, java.util.List r41, java.util.List r42, m2.d r43, u2.c r44) {
            r38 = this;
            r0 = r38
            r1 = r40
            r2 = r41
            r3 = r44
            r0.<init>()
            r4 = r39
            r0.f10605a = r4
            r0.f10606b = r1
            r0.f10607c = r2
            r4 = r42
            r0.f10608d = r4
            r4 = r43
            r0.f10609e = r4
            r0.f10610f = r3
            q2.f r4 = new q2.f
            float r5 = r3.d()
            r6 = 1
            r4.<init>(r6)
            r4.density = r5
            t2.l r5 = t2.l.f13015b
            r4.f10621b = r5
            r5 = 3
            r4.f10622c = r5
            f1.q0 r7 = f1.q0.f3108d
            r4.f10623d = r7
            r0.f10611g = r4
            boolean r7 = q2.j.a(r1)
            r8 = 0
            if (r7 != 0) goto L3f
            r7 = r8
            goto L63
        L3f:
            m.a r7 = q2.i.f10632a
            m.a r7 = q2.i.f10632a
            java.lang.Object r9 = r7.f8069h
            i0.l2 r9 = (i0.l2) r9
            if (r9 == 0) goto L4a
            goto L59
        L4a:
            boolean r9 = l3.i.d()
            if (r9 == 0) goto L57
            i0.l2 r9 = r7.o()
            r7.f8069h = r9
            goto L59
        L57:
            q2.k r9 = q2.j.f10633a
        L59:
            java.lang.Object r7 = r9.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
        L63:
            r0.f10615k = r7
            i2.u r7 = r1.f6366b
            int r7 = r7.f6392b
            i2.f0 r9 = r1.f6365a
            p2.b r9 = r9.f6308k
            r10 = 4
            r12 = 2
            if (r7 != r10) goto L73
        L71:
            r7 = r12
            goto La0
        L73:
            r10 = 5
            if (r7 != r10) goto L78
        L76:
            r7 = r5
            goto La0
        L78:
            if (r7 != r6) goto L7c
            r7 = r8
            goto La0
        L7c:
            if (r7 != r12) goto L80
            r7 = r6
            goto La0
        L80:
            if (r7 != r5) goto L83
            goto L85
        L83:
            if (r7 != 0) goto L9d6
        L85:
            if (r9 == 0) goto L93
            java.lang.Object r7 = r9.f10087g
            java.lang.Object r7 = r7.get(r8)
            p2.a r7 = (p2.a) r7
            java.util.Locale r7 = r7.f10085a
            if (r7 != 0) goto L97
        L93:
            java.util.Locale r7 = java.util.Locale.getDefault()
        L97:
            int r7 = android.text.TextUtils.getLayoutDirectionFromLocale(r7)
            if (r7 == 0) goto L71
            if (r7 == r6) goto L76
            goto L71
        La0:
            r0.f10616l = r7
            q2.c r7 = new q2.c
            r7.<init>(r0, r8)
            i2.u r9 = r1.f6366b
            t2.s r9 = r9.f6399i
            if (r9 != 0) goto Laf
            t2.s r9 = t2.s.f13028c
        Laf:
            boolean r10 = r9.f13031b
            if (r10 == 0) goto Lba
            int r10 = r4.getFlags()
            r10 = r10 | 128(0x80, float:1.8E-43)
            goto Lc0
        Lba:
            int r10 = r4.getFlags()
            r10 = r10 & (-129(0xffffffffffffff7f, float:NaN))
        Lc0:
            r4.setFlags(r10)
            int r9 = r9.f13030a
            if (r9 != r6) goto Ld4
            int r5 = r4.getFlags()
            r5 = r5 | 64
            r4.setFlags(r5)
            r4.setHinting(r8)
            goto Le9
        Ld4:
            if (r9 != r12) goto Ldd
            r4.getFlags()
            r4.setHinting(r6)
            goto Le9
        Ldd:
            if (r9 != r5) goto Le6
            r4.getFlags()
            r4.setHinting(r8)
            goto Le9
        Le6:
            r4.getFlags()
        Le9:
            i2.f0 r1 = r1.f6365a
            int r5 = r2.size()
            r9 = r8
        Lf0:
            if (r9 >= r5) goto L103
            java.lang.Object r10 = r2.get(r9)
            r13 = r10
            i2.e r13 = (i2.e) r13
            java.lang.Object r13 = r13.f6288a
            boolean r13 = r13 instanceof i2.f0
            if (r13 == 0) goto L100
            goto L104
        L100:
            int r9 = r9 + 1
            goto Lf0
        L103:
            r10 = 0
        L104:
            if (r10 == 0) goto L108
            r2 = r6
            goto L109
        L108:
            r2 = r8
        L109:
            long r9 = r1.f6299b
            java.lang.String r5 = r1.f6304g
            p2.b r13 = r1.f6308k
            t2.o r14 = r1.f6298a
            t2.p r15 = r1.f6307j
            r39 = 0
            long r11 = r1.f6305h
            r43 = r6
            r16 = r7
            long r6 = u2.o.b(r9)
            r40 = r9
            r8 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r10 = u2.p.a(r6, r8)
            if (r10 == 0) goto L136
            r8 = r40
            float r6 = r3.O0(r8)
            r4.setTextSize(r6)
            goto L14d
        L136:
            r8 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r6 = u2.p.a(r6, r8)
            if (r6 == 0) goto L14d
            float r6 = r4.getTextSize()
            float r7 = u2.o.c(r40)
            float r7 = r7 * r6
            r4.setTextSize(r7)
        L14d:
            m2.p r6 = r1.f6303f
            if (r6 != 0) goto L161
            m2.i r7 = r1.f6301d
            if (r7 != 0) goto L161
            m2.k r7 = r1.f6300c
            if (r7 == 0) goto L15a
            goto L161
        L15a:
            r40 = r2
            r10 = r16
            r16 = r14
            goto L1ab
        L161:
            m2.k r7 = r1.f6300c
            if (r7 != 0) goto L167
            m2.k r7 = m2.k.f8697i
        L167:
            m2.i r8 = r1.f6301d
            if (r8 == 0) goto L16e
            int r8 = r8.f8694a
            goto L16f
        L16e:
            r8 = 0
        L16f:
            m2.j r9 = r1.f6302e
            if (r9 == 0) goto L17a
            int r9 = r9.f8695a
        L175:
            r40 = r2
            r10 = r16
            goto L17e
        L17a:
            r9 = 65535(0xffff, float:9.1834E-41)
            goto L175
        L17e:
            java.lang.Object r2 = r10.f10604h
            q2.d r2 = (q2.d) r2
            r16 = r14
            m2.d r14 = r2.f10609e
            m2.e r14 = (m2.e) r14
            m2.r r6 = r14.b(r6, r7, r8, r9)
            boolean r7 = r6 instanceof m2.r
            if (r7 != 0) goto L1a1
            b5.c r7 = new b5.c
            b5.c r8 = r2.f10614j
            r7.<init>(r6, r8)
            r2.f10614j = r7
            java.lang.Object r2 = r7.f471c
            r2.getClass()
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            goto L1a8
        L1a1:
            java.lang.Object r2 = r6.f8711g
            r2.getClass()
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
        L1a8:
            r4.setTypeface(r2)
        L1ab:
            if (r13 == 0) goto L1f4
            p2.b r2 = p2.b.f10086i
            b5.c r2 = p2.c.f10089a
            p2.b r2 = r2.r()
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L1f4
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = tf.n.e1(r13)
            r2.<init>(r6)
            java.lang.Object r6 = r13.f10087g
            java.util.Iterator r6 = r6.iterator()
        L1ca:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L1dc
            java.lang.Object r7 = r6.next()
            p2.a r7 = (p2.a) r7
            java.util.Locale r7 = r7.f10085a
            r2.add(r7)
            goto L1ca
        L1dc:
            r7 = 0
            java.util.Locale[] r6 = new java.util.Locale[r7]
            java.lang.Object[] r2 = r2.toArray(r6)
            java.util.Locale[] r2 = (java.util.Locale[]) r2
            int r6 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            java.util.Locale[] r2 = (java.util.Locale[]) r2
            android.os.LocaleList r6 = new android.os.LocaleList
            r6.<init>(r2)
            r4.setTextLocales(r6)
        L1f4:
            if (r5 == 0) goto L201
            java.lang.String r2 = ""
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L201
            r4.setFontFeatureSettings(r5)
        L201:
            if (r15 == 0) goto L21f
            t2.p r2 = t2.p.f13021c
            boolean r2 = r15.equals(r2)
            if (r2 != 0) goto L21f
            float r2 = r4.getTextScaleX()
            float r5 = r15.f13022a
            float r2 = r2 * r5
            r4.setTextScaleX(r2)
            float r2 = r4.getTextSkewX()
            float r5 = r15.f13023b
            float r2 = r2 + r5
            r4.setTextSkewX(r2)
        L21f:
            long r5 = r16.b()
            r4.d(r5)
            f1.s r2 = r16.c()
            r5 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            float r7 = r16.a()
            r4.c(r2, r5, r7)
            f1.q0 r2 = r1.f6311n
            r4.f(r2)
            t2.l r2 = r1.f6310m
            r4.g(r2)
            h1.c r2 = r1.f6312o
            r4.e(r2)
            long r5 = u2.o.b(r11)
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r2 = u2.p.a(r5, r7)
            r5 = 0
            if (r2 == 0) goto L275
            float r2 = u2.o.c(r11)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L25e
            goto L275
        L25e:
            float r2 = r4.getTextSize()
            float r6 = r4.getTextScaleX()
            float r6 = r6 * r2
            float r2 = r3.O0(r11)
            int r3 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r3 != 0) goto L270
            goto L28b
        L270:
            float r2 = r2 / r6
            r4.setLetterSpacing(r2)
            goto L28b
        L275:
            long r2 = u2.o.b(r11)
            r8 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r2 = u2.p.a(r2, r8)
            if (r2 == 0) goto L28b
            float r2 = u2.o.c(r11)
            r4.setLetterSpacing(r2)
        L28b:
            long r2 = r1.f6309l
            t2.a r1 = r1.f6306i
            if (r40 == 0) goto L2ac
            long r6 = u2.o.b(r11)
            r8 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r4 = u2.p.a(r6, r8)
            if (r4 == 0) goto L2ac
            float r4 = u2.o.c(r11)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L2a9
            goto L2ac
        L2a9:
            r4 = r43
            goto L2ad
        L2ac:
            r4 = 0
        L2ad:
            long r6 = f1.w.f3131g
            boolean r8 = f1.w.c(r2, r6)
            if (r8 != 0) goto L2c0
            long r8 = f1.w.f3130f
            boolean r8 = f1.w.c(r2, r8)
            if (r8 != 0) goto L2c0
            r8 = r43
            goto L2c1
        L2c0:
            r8 = 0
        L2c1:
            if (r1 == 0) goto L2cf
            float r9 = r1.f12994a
            int r9 = java.lang.Float.compare(r9, r5)
            if (r9 != 0) goto L2cc
            goto L2cf
        L2cc:
            r9 = r43
            goto L2d0
        L2cf:
            r9 = 0
        L2d0:
            if (r4 != 0) goto L2d9
            if (r8 != 0) goto L2d9
            if (r9 != 0) goto L2d9
            r1 = r39
            goto L30f
        L2d9:
            if (r4 == 0) goto L2de
        L2db:
            r28 = r11
            goto L2e1
        L2de:
            long r11 = u2.o.f13359c
            goto L2db
        L2e1:
            if (r8 == 0) goto L2e6
            r33 = r2
            goto L2e8
        L2e6:
            r33 = r6
        L2e8:
            if (r9 == 0) goto L2ed
            r30 = r1
            goto L2ef
        L2ed:
            r30 = r39
        L2ef:
            i2.f0 r18 = new i2.f0
            r36 = 0
            r37 = 63103(0xf67f, float:8.8426E-41)
            r19 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r31 = 0
            r32 = 0
            r35 = 0
            r18.<init>(r19, r21, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r35, r36, r37)
            r1 = r18
        L30f:
            java.util.List r2 = r0.f10607c
            if (r1 == 0) goto L341
            int r2 = r2.size()
            int r2 = r2 + 1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r4 = 0
        L31f:
            if (r4 >= r2) goto L340
            if (r4 != 0) goto L330
            i2.e r6 = new i2.e
            java.lang.String r7 = r0.f10605a
            int r7 = r7.length()
            r8 = 0
            r6.<init>(r8, r7, r1)
            goto L33a
        L330:
            java.util.List r6 = r0.f10607c
            int r7 = r4 + (-1)
            java.lang.Object r6 = r6.get(r7)
            i2.e r6 = (i2.e) r6
        L33a:
            r3.add(r6)
            int r4 = r4 + 1
            goto L31f
        L340:
            r2 = r3
        L341:
            java.lang.String r1 = r0.f10605a
            q2.f r3 = r0.f10611g
            float r3 = r3.getTextSize()
            i2.n0 r4 = r0.f10606b
            java.util.List r6 = r0.f10608d
            u2.c r14 = r0.f10610f
            boolean r7 = r0.f10615k
            q2.a r8 = q2.b.f10602a
            java.lang.Class<l3.v> r8 = l3.v.class
            if (r7 == 0) goto L48f
            boolean r7 = l3.i.d()
            if (r7 == 0) goto L48f
            i2.x r7 = r4.f6367c
            if (r7 == 0) goto L36d
            i2.w r7 = r7.f6404a
            if (r7 == 0) goto L36d
            int r7 = r7.f6403b
            i2.j r9 = new i2.j
            r9.<init>(r7)
            goto L36f
        L36d:
            r9 = r39
        L36f:
            if (r9 != 0) goto L373
        L371:
            r7 = 0
            goto L37a
        L373:
            int r7 = r9.f6333a
            r9 = 2
            if (r7 != r9) goto L371
            r7 = r43
        L37a:
            l3.i r9 = l3.i.a()
            int r11 = r1.length()
            int r12 = r9.c()
            r13 = r43
            if (r12 != r13) goto L38c
            r12 = 1
            goto L38d
        L38c:
            r12 = 0
        L38d:
            if (r12 == 0) goto L489
            if (r11 < 0) goto L483
            if (r11 < 0) goto L395
            r12 = 1
            goto L396
        L395:
            r12 = 0
        L396:
            if (r12 == 0) goto L47d
            int r12 = r1.length()
            if (r12 < 0) goto L3a0
            r12 = 1
            goto L3a1
        L3a0:
            r12 = 0
        L3a1:
            if (r12 == 0) goto L477
            int r12 = r1.length()
            if (r11 > r12) goto L3ab
            r12 = 1
            goto L3ac
        L3ab:
            r12 = 0
        L3ac:
            if (r12 == 0) goto L471
            int r12 = r1.length()
            if (r12 == 0) goto L3b6
            if (r11 != 0) goto L3bc
        L3b6:
            r19 = r1
            r40 = r5
            goto L46b
        L3bc:
            r13 = 1
            if (r7 == r13) goto L3c2
            r23 = 0
            goto L3c4
        L3c2:
            r23 = 1
        L3c4:
            l3.f r7 = r9.f7797e
            b5.c r7 = r7.f7787b
            r7.getClass()
            boolean r9 = r1 instanceof android.text.Spannable
            if (r9 == 0) goto L3d9
            l3.y r9 = new l3.y
            r12 = r1
            android.text.Spannable r12 = (android.text.Spannable) r12
            r9.<init>(r12)
            r12 = 0
            goto L3fc
        L3d9:
            boolean r9 = r1 instanceof android.text.Spanned
            if (r9 == 0) goto L3f9
            r9 = r1
            android.text.Spanned r9 = (android.text.Spanned) r9
            int r12 = r11 + 1
            r13 = -1
            int r9 = r9.nextSpanTransition(r13, r12, r8)
            if (r9 > r11) goto L3f9
            l3.y r9 = new l3.y
            r9.<init>()
            r12 = 0
            r9.f7836g = r12
            android.text.SpannableString r13 = new android.text.SpannableString
            r13.<init>(r1)
            r9.f7837h = r13
            goto L3fc
        L3f9:
            r12 = 0
            r9 = r39
        L3fc:
            if (r9 == 0) goto L43c
            android.text.Spannable r13 = r9.f7837h
            java.lang.Object[] r13 = r13.getSpans(r12, r11, r8)
            l3.v[] r13 = (l3.v[]) r13
            if (r13 == 0) goto L43c
            int r12 = r13.length
            if (r12 <= 0) goto L43c
            int r12 = r13.length
            r40 = r5
            r5 = 0
            r15 = 0
        L410:
            r19 = r1
            if (r15 >= r12) goto L441
            r1 = r13[r15]
            r16 = r12
            android.text.Spannable r12 = r9.f7837h
            int r12 = r12.getSpanStart(r1)
            r41 = r13
            android.text.Spannable r13 = r9.f7837h
            int r13 = r13.getSpanEnd(r1)
            if (r12 == r11) goto L42b
            r9.removeSpan(r1)
        L42b:
            int r5 = java.lang.Math.min(r12, r5)
            int r11 = java.lang.Math.max(r13, r11)
            int r15 = r15 + 1
            r13 = r41
            r12 = r16
            r1 = r19
            goto L410
        L43c:
            r19 = r1
            r40 = r5
            r5 = 0
        L441:
            if (r5 == r11) goto L46b
            int r1 = r19.length()
            if (r5 < r1) goto L44a
            goto L46b
        L44a:
            b.e r1 = new b.e
            java.lang.Object r12 = r7.f469a
            a2.a r12 = (a2.a) r12
            r13 = 21
            r1.<init>(r9, r13, r12)
            r22 = 2147483647(0x7fffffff, float:NaN)
            r24 = r1
            r20 = r5
            r18 = r7
            r21 = r11
            java.lang.Object r1 = r18.G(r19, r20, r21, r22, r23, r24)
            l3.y r1 = (l3.y) r1
            if (r1 == 0) goto L46b
            android.text.Spannable r1 = r1.f7837h
            goto L46d
        L46b:
            r1 = r19
        L46d:
            r1.getClass()
            goto L495
        L471:
            java.lang.String r1 = "end should be < than charSequence length"
            j8.o.t(r1)
            throw r39
        L477:
            java.lang.String r1 = "start should be < than charSequence length"
            j8.o.t(r1)
            throw r39
        L47d:
            java.lang.String r1 = "start should be <= than end"
            j8.o.t(r1)
            throw r39
        L483:
            java.lang.String r1 = "end cannot be negative"
            j8.o.t(r1)
            throw r39
        L489:
            java.lang.String r1 = "Not initialized yet"
            j8.o.A(r1)
            throw r39
        L48f:
            r19 = r1
            r40 = r5
            r1 = r19
        L495:
            boolean r5 = r2.isEmpty()
            r15 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            if (r5 == 0) goto L4bf
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L4bf
            i2.u r5 = r4.f6366b
            t2.q r5 = r5.f6394d
            t2.q r7 = t2.q.f13024c
            boolean r5 = gg.l.a(r5, r7)
            if (r5 == 0) goto L4bf
            i2.u r5 = r4.f6366b
            r20 = 0
            long r11 = r5.f6393c
            long r11 = r11 & r15
            int r5 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r5 != 0) goto L4c1
            goto L9c0
        L4bf:
            r20 = 0
        L4c1:
            boolean r5 = r1 instanceof android.text.Spannable
            if (r5 == 0) goto L4c9
            android.text.Spannable r1 = (android.text.Spannable) r1
            r11 = r1
            goto L4cf
        L4c9:
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r1)
            r11 = r5
        L4cf:
            i2.f0 r1 = r4.f6365a
            t2.l r1 = r1.f6310m
            t2.l r5 = t2.l.f13016c
            boolean r1 = gg.l.a(r1, r5)
            r5 = 33
            if (r1 == 0) goto L4e7
            q2.a r1 = q2.b.f10602a
            int r7 = r19.length()
            r12 = 0
            r11.setSpan(r1, r12, r7, r5)
        L4e7:
            i2.x r1 = r4.f6367c
            if (r1 == 0) goto L4f2
            i2.w r1 = r1.f6404a
            if (r1 == 0) goto L4f2
            boolean r1 = r1.f6402a
            goto L4f3
        L4f2:
            r1 = 0
        L4f3:
            if (r1 == 0) goto L516
            i2.u r1 = r4.f6366b
            t2.i r7 = r1.f6396f
            if (r7 != 0) goto L516
            long r12 = r1.f6393c
            float r1 = f8.i.A0(r12, r3, r14)
            boolean r7 = java.lang.Float.isNaN(r1)
            if (r7 != 0) goto L514
            l2.g r7 = new l2.g
            r7.<init>(r1)
            int r1 = r11.length()
            r12 = 0
            r11.setSpan(r7, r12, r1, r5)
        L514:
            r12 = 0
            goto L572
        L516:
            i2.u r1 = r4.f6366b
            t2.i r7 = r1.f6396f
            if (r7 != 0) goto L51e
            t2.i r7 = t2.i.f13007d
        L51e:
            long r12 = r1.f6393c
            float r23 = f8.i.A0(r12, r3, r14)
            boolean r1 = java.lang.Float.isNaN(r23)
            if (r1 != 0) goto L514
            int r1 = r11.length()
            if (r1 != 0) goto L531
            goto L539
        L531:
            char r1 = og.m.u0(r11)
            r9 = 10
            if (r1 != r9) goto L542
        L539:
            int r1 = r11.length()
            r13 = 1
            int r1 = r1 + r13
        L53f:
            r24 = r1
            goto L547
        L542:
            int r1 = r11.length()
            goto L53f
        L547:
            l2.h r22 = new l2.h
            int r1 = r7.f13009b
            r9 = r1 & 1
            if (r9 <= 0) goto L552
            r25 = 1
            goto L554
        L552:
            r25 = 0
        L554:
            r1 = r1 & 16
            if (r1 <= 0) goto L55b
            r26 = 1
            goto L55d
        L55b:
            r26 = 0
        L55d:
            float r1 = r7.f13008a
            int r7 = r7.f13010c
            r27 = r1
            r28 = r7
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r1 = r22
            int r7 = r11.length()
            r12 = 0
            r11.setSpan(r1, r12, r7, r5)
        L572:
            i2.u r1 = r4.f6366b
            t2.q r1 = r1.f6394d
            if (r1 == 0) goto L619
            r17 = r12
            long r12 = r1.f13025a
            r7 = r6
            long r5 = r1.f13026b
            long r0 = x6.d.D(r17)
            boolean r0 = u2.o.a(r12, r0)
            if (r0 == 0) goto L593
            long r0 = x6.d.D(r17)
            boolean r0 = u2.o.a(r5, r0)
            if (r0 != 0) goto L599
        L593:
            long r0 = r12 & r15
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 != 0) goto L59e
        L599:
            r9 = r7
        L59a:
            r44 = r8
            goto L61c
        L59e:
            long r0 = r5 & r15
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 != 0) goto L5a5
            goto L599
        L5a5:
            long r0 = u2.o.b(r12)
            r9 = r7
            r44 = r8
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r15 = u2.p.a(r0, r7)
            if (r15 == 0) goto L5c1
            float r0 = r14.O0(r12)
            r7 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L5d4
        L5c1:
            r7 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r0 = u2.p.a(r0, r7)
            if (r0 == 0) goto L5d2
            float r0 = u2.o.c(r12)
            float r0 = r0 * r3
            goto L5d4
        L5d2:
            r0 = r40
        L5d4:
            long r12 = u2.o.b(r5)
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r1 = u2.p.a(r12, r7)
            if (r1 == 0) goto L5e8
            float r1 = r14.O0(r5)
            goto L5fb
        L5e8:
            r7 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r1 = u2.p.a(r12, r7)
            if (r1 == 0) goto L5f9
            float r1 = u2.o.c(r5)
            float r1 = r1 * r3
            goto L5fb
        L5f9:
            r1 = r40
        L5fb:
            android.text.style.LeadingMarginSpan$Standard r3 = new android.text.style.LeadingMarginSpan$Standard
            double r5 = (double) r0
            double r5 = java.lang.Math.ceil(r5)
            float r0 = (float) r5
            int r0 = (int) r0
            double r5 = (double) r1
            double r5 = java.lang.Math.ceil(r5)
            float r1 = (float) r5
            int r1 = (int) r1
            r3.<init>(r0, r1)
            int r0 = r11.length()
            r1 = 33
            r12 = 0
            r11.setSpan(r3, r12, r0, r1)
            goto L61c
        L619:
            r9 = r6
            goto L59a
        L61c:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            int r1 = r2.size()
            r3 = 0
        L62a:
            if (r3 >= r1) goto L659
            java.lang.Object r5 = r2.get(r3)
            i2.e r5 = (i2.e) r5
            java.lang.Object r6 = r5.f6288a
            boolean r7 = r6 instanceof i2.f0
            if (r7 == 0) goto L656
            r7 = r6
            i2.f0 r7 = (i2.f0) r7
            m2.p r8 = r7.f6303f
            if (r8 != 0) goto L64a
            m2.i r8 = r7.f6301d
            if (r8 != 0) goto L64a
            m2.k r7 = r7.f6300c
            if (r7 == 0) goto L648
            goto L64a
        L648:
            r7 = 0
            goto L64b
        L64a:
            r7 = 1
        L64b:
            if (r7 != 0) goto L653
            i2.f0 r6 = (i2.f0) r6
            m2.j r6 = r6.f6302e
            if (r6 == 0) goto L656
        L653:
            r0.add(r5)
        L656:
            int r3 = r3 + 1
            goto L62a
        L659:
            i2.f0 r1 = r4.f6365a
            m2.p r3 = r1.f6303f
            if (r3 != 0) goto L66a
            m2.i r5 = r1.f6301d
            if (r5 != 0) goto L66a
            m2.k r5 = r1.f6300c
            if (r5 == 0) goto L668
            goto L66a
        L668:
            r5 = 0
            goto L66b
        L66a:
            r5 = 1
        L66b:
            if (r5 != 0) goto L675
            m2.j r5 = r1.f6302e
            if (r5 == 0) goto L672
            goto L675
        L672:
            r1 = r39
            goto L6a1
        L675:
            m2.k r5 = r1.f6300c
            m2.i r6 = r1.f6301d
            m2.j r1 = r1.f6302e
            i2.f0 r18 = new i2.f0
            r36 = 0
            r37 = 65475(0xffc3, float:9.175E-41)
            r19 = 0
            r21 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 0
            r25 = r1
            r26 = r3
            r23 = r5
            r24 = r6
            r18.<init>(r19, r21, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r35, r36, r37)
            r1 = r18
        L6a1:
            db.f r3 = new db.f
            r5 = 2
            r3.<init>(r11, r5, r10)
            int r5 = r0.size()
            r13 = 1
            if (r5 > r13) goto L6e3
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L774
            r12 = 0
            java.lang.Object r5 = r0.get(r12)
            i2.e r5 = (i2.e) r5
            java.lang.Object r5 = r5.f6288a
            i2.f0 r5 = (i2.f0) r5
            if (r1 != 0) goto L6c2
            goto L6c6
        L6c2:
            i2.f0 r5 = r1.c(r5)
        L6c6:
            java.lang.Object r1 = r0.get(r12)
            i2.e r1 = (i2.e) r1
            int r1 = r1.f6289b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r12)
            i2.e r0 = (i2.e) r0
            int r0 = r0.f6290c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.b(r5, r1, r0)
            goto L774
        L6e3:
            int r5 = r0.size()
            int r6 = r5 * 2
            int[] r7 = new int[r6]
            int r8 = r0.size()
            r10 = 0
        L6f0:
            if (r10 >= r8) goto L705
            java.lang.Object r12 = r0.get(r10)
            i2.e r12 = (i2.e) r12
            int r13 = r12.f6289b
            r7[r10] = r13
            int r13 = r10 + r5
            int r12 = r12.f6290c
            r7[r13] = r12
            int r10 = r10 + 1
            goto L6f0
        L705:
            r13 = 1
            if (r6 <= r13) goto L70b
            java.util.Arrays.sort(r7)
        L70b:
            if (r6 == 0) goto L9ce
            r17 = 0
            r5 = r7[r17]
            r8 = 0
        L712:
            if (r8 >= r6) goto L774
            r10 = r7[r8]
            if (r10 != r5) goto L71f
            r42 = r0
            r16 = r1
            r18 = r6
            goto L76b
        L71f:
            int r12 = r0.size()
            r15 = r1
            r13 = 0
        L725:
            if (r13 >= r12) goto L757
            java.lang.Object r16 = r0.get(r13)
            r42 = r0
            r0 = r16
            i2.e r0 = (i2.e) r0
            r16 = r1
            int r1 = r0.f6289b
            r18 = r6
            int r6 = r0.f6290c
            if (r1 == r6) goto L74e
            boolean r1 = i2.h.b(r5, r10, r1, r6)
            if (r1 == 0) goto L74e
            java.lang.Object r0 = r0.f6288a
            i2.f0 r0 = (i2.f0) r0
            if (r15 != 0) goto L749
        L747:
            r15 = r0
            goto L74e
        L749:
            i2.f0 r0 = r15.c(r0)
            goto L747
        L74e:
            int r13 = r13 + 1
            r0 = r42
            r1 = r16
            r6 = r18
            goto L725
        L757:
            r42 = r0
            r16 = r1
            r18 = r6
            if (r15 == 0) goto L76a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r3.b(r15, r0, r1)
        L76a:
            r5 = r10
        L76b:
            int r8 = r8 + 1
            r0 = r42
            r1 = r16
            r6 = r18
            goto L712
        L774:
            int r0 = r2.size()
            r1 = 0
            r7 = 0
        L77a:
            if (r7 >= r0) goto L8ca
            java.lang.Object r3 = r2.get(r7)
            i2.e r3 = (i2.e) r3
            java.lang.Object r5 = r3.f6288a
            boolean r6 = r5 instanceof i2.f0
            if (r6 == 0) goto L79c
            int r15 = r3.f6289b
            int r3 = r3.f6290c
            if (r15 < 0) goto L79c
            int r6 = r11.length()
            if (r15 >= r6) goto L79c
            if (r3 <= r15) goto L79c
            int r6 = r11.length()
            if (r3 <= r6) goto L7a5
        L79c:
            r42 = r0
            r16 = r7
            r18 = r14
            r14 = r1
            goto L8c1
        L7a5:
            i2.f0 r5 = (i2.f0) r5
            t2.a r6 = r5.f6306i
            t2.o r8 = r5.f6298a
            if (r6 == 0) goto L7ba
            float r6 = r6.f12994a
            l2.a r10 = new l2.a
            r12 = 0
            r10.<init>(r12, r6)
            r6 = 33
            r11.setSpan(r10, r15, r3, r6)
        L7ba:
            long r12 = r8.b()
            f8.i.C0(r11, r12, r15, r3)
            f1.s r6 = r8.c()
            float r8 = r8.a()
            if (r6 == 0) goto L7e3
            boolean r10 = r6 instanceof f1.t0
            if (r10 == 0) goto L7d7
            f1.t0 r6 = (f1.t0) r6
            long r12 = r6.f3121a
            f8.i.C0(r11, r12, r15, r3)
            goto L7e3
        L7d7:
            s2.b r10 = new s2.b
            f1.p0 r6 = (f1.p0) r6
            r10.<init>(r6, r8)
            r6 = 33
            r11.setSpan(r10, r15, r3, r6)
        L7e3:
            t2.l r6 = r5.f6310m
            if (r6 == 0) goto L802
            int r6 = r6.f13018a
            l2.k r8 = new l2.k
            r10 = r6 | 1
            if (r10 != r6) goto L7f1
            r10 = 1
            goto L7f2
        L7f1:
            r10 = 0
        L7f2:
            r12 = r6 | 2
            if (r12 != r6) goto L7f8
            r6 = 1
            goto L7f9
        L7f8:
            r6 = 0
        L7f9:
            r8.<init>(r10, r6)
            r6 = 33
            r11.setSpan(r8, r15, r3, r6)
            goto L804
        L802:
            r6 = 33
        L804:
            long r12 = r5.f6299b
            r16 = r3
            f8.i.D0(r11, r12, r14, r15, r16)
            java.lang.String r8 = r5.f6304g
            if (r8 == 0) goto L818
            l2.b r10 = new l2.b
            r12 = 0
            r10.<init>(r8, r12)
            r11.setSpan(r10, r15, r3, r6)
        L818:
            t2.p r8 = r5.f6307j
            if (r8 == 0) goto L832
            android.text.style.ScaleXSpan r10 = new android.text.style.ScaleXSpan
            float r12 = r8.f13022a
            r10.<init>(r12)
            r11.setSpan(r10, r15, r3, r6)
            l2.a r10 = new l2.a
            float r8 = r8.f13023b
            r13 = 1
            r10.<init>(r13, r8)
            r11.setSpan(r10, r15, r3, r6)
            goto L833
        L832:
            r13 = 1
        L833:
            p2.b r6 = r5.f6308k
            f8.i.E0(r11, r6, r15, r3)
            r6 = r14
            long r13 = r5.f6309l
            r18 = 16
            int r8 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r8 == 0) goto L84f
            android.text.style.BackgroundColorSpan r8 = new android.text.style.BackgroundColorSpan
            int r10 = f1.c0.w(r13)
            r8.<init>(r10)
            r10 = 33
            r11.setSpan(r8, r15, r3, r10)
        L84f:
            f1.q0 r8 = r5.f6311n
            if (r8 == 0) goto L888
            long r12 = r8.f3110b
            l2.j r10 = new l2.j
            r42 = r0
            r14 = r1
            long r0 = r8.f3109a
            int r0 = f1.c0.w(r0)
            r1 = 32
            r18 = r6
            r16 = r7
            long r6 = r12 >> r1
            int r1 = (int) r6
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r12
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r7 = r8.f3111c
            int r8 = (r7 > r40 ? 1 : (r7 == r40 ? 0 : -1))
            if (r8 != 0) goto L87f
            r7 = 1
        L87f:
            r10.<init>(r0, r1, r6, r7)
            r6 = 33
            r11.setSpan(r10, r15, r3, r6)
            goto L891
        L888:
            r42 = r0
            r14 = r1
            r18 = r6
            r16 = r7
            r6 = 33
        L891:
            h1.c r0 = r5.f6312o
            if (r0 == 0) goto L89d
            s2.a r1 = new s2.a
            r1.<init>(r0)
            r11.setSpan(r1, r15, r3, r6)
        L89d:
            long r0 = r5.f6305h
            long r0 = u2.o.b(r0)
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r0 = u2.p.a(r0, r7)
            if (r0 != 0) goto L8bf
            long r0 = r5.f6305h
            long r0 = u2.o.b(r0)
            r7 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r0 = u2.p.a(r0, r7)
            if (r0 == 0) goto L8c1
        L8bf:
            r1 = 1
            goto L8c2
        L8c1:
            r1 = r14
        L8c2:
            int r7 = r16 + 1
            r0 = r42
            r14 = r18
            goto L77a
        L8ca:
            r18 = r14
            r14 = r1
            if (r14 == 0) goto L94c
            int r0 = r2.size()
            r7 = 0
        L8d4:
            if (r7 >= r0) goto L94c
            java.lang.Object r1 = r2.get(r7)
            i2.e r1 = (i2.e) r1
            java.lang.Object r3 = r1.f6288a
            i2.b r3 = (i2.b) r3
            boolean r5 = r3 instanceof i2.f0
            if (r5 == 0) goto L8f8
            int r5 = r1.f6289b
            int r1 = r1.f6290c
            if (r5 < 0) goto L8f8
            int r6 = r11.length()
            if (r5 >= r6) goto L8f8
            if (r1 <= r5) goto L8f8
            int r6 = r11.length()
            if (r1 <= r6) goto L900
        L8f8:
            r3 = r7
            r40 = r9
            r7 = r18
            r10 = 33
            goto L944
        L900:
            i2.f0 r3 = (i2.f0) r3
            long r12 = r3.f6305h
            long r14 = u2.o.b(r12)
            r3 = r7
            r6 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r8 = u2.p.a(r14, r6)
            if (r8 == 0) goto L922
            l2.f r6 = new l2.f
            r7 = r18
            float r8 = r7.O0(r12)
            r6.<init>(r8)
            r40 = r9
            goto L93d
        L922:
            r40 = r9
            r7 = r18
            r8 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r6 = u2.p.a(r14, r8)
            if (r6 == 0) goto L93b
            l2.e r6 = new l2.e
            float r8 = u2.o.c(r12)
            r6.<init>(r8)
            goto L93d
        L93b:
            r6 = r39
        L93d:
            r10 = 33
            if (r6 == 0) goto L944
            r11.setSpan(r6, r5, r1, r10)
        L944:
            int r1 = r3 + 1
            r9 = r40
            r18 = r7
            r7 = r1
            goto L8d4
        L94c:
            r40 = r9
            r7 = r18
            i2.u r0 = r4.f6366b
            t2.q r0 = r0.f6394d
            if (r0 == 0) goto L979
            long r0 = r0.f13025a
            long r3 = u2.o.b(r0)
            r8 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r5 = u2.p.a(r3, r8)
            if (r5 == 0) goto L96b
            r7.O0(r0)
            goto L979
        L96b:
            r7 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r3 = u2.p.a(r3, r7)
            if (r3 == 0) goto L979
            u2.o.c(r0)
        L979:
            int r0 = r2.size()
            r7 = 0
        L97e:
            if (r7 >= r0) goto L98b
            java.lang.Object r1 = r2.get(r7)
            i2.e r1 = (i2.e) r1
            java.lang.Object r1 = r1.f6288a
            int r7 = r7 + 1
            goto L97e
        L98b:
            int r0 = r40.size()
            if (r0 <= 0) goto L9bd
            r9 = r40
            r12 = 0
            java.lang.Object r0 = r9.get(r12)
            i2.e r0 = (i2.e) r0
            java.lang.Object r1 = r0.f6288a
            if (r1 != 0) goto L9b9
            int r1 = r0.f6289b
            int r0 = r0.f6290c
            r2 = r44
            java.lang.Object[] r0 = r11.getSpans(r1, r0, r2)
            int r1 = r0.length
            r8 = r12
        L9aa:
            if (r8 >= r1) goto L9b6
            r2 = r0[r8]
            l3.v r2 = (l3.v) r2
            r11.removeSpan(r2)
            int r8 = r8 + 1
            goto L9aa
        L9b6:
            l2.i r0 = new l2.i
            throw r39
        L9b9:
            ah.a.d()
            throw r39
        L9bd:
            r0 = r38
            r1 = r11
        L9c0:
            r0.f10612h = r1
            j2.f r2 = new j2.f
            q2.f r3 = r0.f10611g
            int r4 = r0.f10616l
            r2.<init>(r1, r3, r4)
            r0.f10613i = r2
            return
        L9ce:
            r0 = r38
            java.lang.String r1 = "Array is empty."
            j8.o.l(r1)
            throw r39
        L9d6:
            r39 = 0
            java.lang.String r1 = "Invalid TextDirection."
            j8.o.A(r1)
            throw r39
    }

    @Override // i2.t
    public final boolean a() {
            r3 = this;
            b5.c r0 = r3.f10614j
            r1 = 0
            if (r0 == 0) goto La
            boolean r0 = r0.D()
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 != 0) goto L41
            boolean r0 = r3.f10615k
            if (r0 != 0) goto L40
            i2.n0 r0 = r3.f10606b
            boolean r0 = q2.j.a(r0)
            if (r0 == 0) goto L40
            m.a r0 = q2.i.f10632a
            m.a r0 = q2.i.f10632a
            java.lang.Object r2 = r0.f8069h
            i0.l2 r2 = (i0.l2) r2
            if (r2 == 0) goto L24
            goto L33
        L24:
            boolean r2 = l3.i.d()
            if (r2 == 0) goto L31
            i0.l2 r2 = r0.o()
            r0.f8069h = r2
            goto L33
        L31:
            q2.k r2 = q2.j.f10633a
        L33:
            java.lang.Object r0 = r2.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L40
            goto L41
        L40:
            return r1
        L41:
            r0 = 1
            return r0
    }

    @Override // i2.t
    public final float b() {
            r11 = this;
            j2.f r0 = r11.f10613i
            float r1 = r0.f6687e
            android.text.TextPaint r2 = r0.f6684b
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto Lf
            float r0 = r0.f6687e
            return r0
        Lf:
            java.util.Locale r1 = r2.getTextLocale()
            java.text.BreakIterator r1 = java.text.BreakIterator.getLineInstance(r1)
            j2.c r3 = new j2.c
            java.lang.CharSequence r4 = r0.f6683a
            int r5 = r4.length()
            r3.<init>(r4, r5)
            r1.setText(r3)
            java.util.PriorityQueue r3 = new java.util.PriorityQueue
            b8.c r4 = j2.g.f6691a
            r5 = 10
            r3.<init>(r5, r4)
            int r4 = r1.next()
            r6 = 0
        L33:
            r7 = -1
            if (r4 == r7) goto L6a
            int r7 = r3.size()
            r8 = 1
            if (r7 >= r5) goto L46
            lg.d r7 = new lg.d
            r7.<init>(r6, r4, r8)
            r3.add(r7)
            goto L62
        L46:
            java.lang.Object r7 = r3.peek()
            lg.d r7 = (lg.d) r7
            if (r7 == 0) goto L62
            int r9 = r7.f8043h
            int r7 = r7.f8042g
            int r9 = r9 - r7
            int r7 = r4 - r6
            if (r9 >= r7) goto L62
            r3.poll()
            lg.d r7 = new lg.d
            r7.<init>(r6, r4, r8)
            r3.add(r7)
        L62:
            int r6 = r1.next()
            r10 = r6
            r6 = r4
            r4 = r10
            goto L33
        L6a:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L72
            r1 = 0
            goto Lac
        L72:
            java.util.Iterator r1 = r3.iterator()
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Laf
            java.lang.Object r3 = r1.next()
            lg.d r3 = (lg.d) r3
            int r4 = r3.f8042g
            int r3 = r3.f8043h
            java.lang.CharSequence r5 = r0.b()
            float r3 = android.text.Layout.getDesiredWidth(r5, r4, r3, r2)
        L8e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lab
            java.lang.Object r4 = r1.next()
            lg.d r4 = (lg.d) r4
            int r5 = r4.f8042g
            int r4 = r4.f8043h
            java.lang.CharSequence r6 = r0.b()
            float r4 = android.text.Layout.getDesiredWidth(r6, r5, r4, r2)
            float r3 = java.lang.Math.max(r3, r4)
            goto L8e
        Lab:
            r1 = r3
        Lac:
            r0.f6687e = r1
            return r1
        Laf:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // i2.t
    public final float c() {
            r1 = this;
            j2.f r0 = r1.f10613i
            float r0 = r0.c()
            return r0
    }
}
