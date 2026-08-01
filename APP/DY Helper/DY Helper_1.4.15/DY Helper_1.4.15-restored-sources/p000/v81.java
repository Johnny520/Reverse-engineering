package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class v81 {
    /* JADX INFO: renamed from: α */
    public static final java.lang.Object m6119(p000.d22 r8, p000.wh1 r9, p000.AbstractC0715q8 r10) {
            boolean r0 = r10 instanceof p000.r22
            if (r0 == 0) goto L13
            r0 = r10
            r22 r0 = (p000.r22) r0
            int r1 = r0.f9241
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9241 = r1
            goto L18
        L13:
            r22 r0 = new r22
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f9240
            int r1 = r0.f9241
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            wh1 r8 = r0.f9239
            d22 r9 = r0.f9238
            p000.i81.m2649(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L45
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r8)
            r8 = 0
            return r8
        L33:
            p000.i81.m2649(r10)
        L36:
            r0.f9238 = r8
            r0.f9239 = r9
            r0.f9241 = r2
            java.lang.Object r10 = r8.m1638(r9, r0)
            cq r1 = p000.EnumC0184cq.f2716
            if (r10 != r1) goto L45
            return r1
        L45:
            vh1 r10 = (p000.vh1) r10
            java.lang.Object r1 = r10.f11293
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L4f:
            if (r5 >= r3) goto L61
            java.lang.Object r6 = r1.get(r5)
            ai1 r6 = (p000.ai1) r6
            boolean r6 = p000.j81.m2901(r6)
            if (r6 != 0) goto L5e
            goto L36
        L5e:
            int r5 = r5 + 1
            goto L4f
        L61:
            java.lang.Object r8 = r10.f11293
            java.lang.Object r8 = r8.get(r4)
            return r8
    }

    /* JADX INFO: renamed from: β */
    public static final void m6120(p000.uc0 r0, java.lang.String r1, java.lang.String r2) {
            r0.getClass()
            r2.getClass()
            java.util.ArrayList r0 = r0.f10691
            r0.add(r1)
            java.lang.CharSequence r1 = p000.q02.m4660(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            return
    }

    /* JADX INFO: renamed from: γ */
    public static int m6121(android.content.Context r0, int r1) {
            float r1 = (float) r1
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static final java.lang.Object m6122(p000.xr1 r0, p000.is1 r1) {
            b21 r0 = r0.f12268
            java.lang.Object r0 = r0.m695(r1)
            if (r0 != 0) goto L9
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static final p000.gi1 m6123(android.view.View r2) {
            r0 = 2131296856(0x7f090258, float:1.821164E38)
            java.lang.Object r1 = r2.getTag(r0)
            gi1 r1 = (p000.gi1) r1
            if (r1 != 0) goto L13
            gi1 r1 = new gi1
            r1.<init>()
            r2.setTag(r0, r1)
        L13:
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static final void m6124(java.lang.String r5) {
            r5.getClass()
            int r0 = r5.length()
            if (r0 <= 0) goto L61
            int r0 = r5.length()
            r1 = 0
        Le:
            if (r1 >= r0) goto L60
            char r2 = r5.charAt(r1)
            r3 = 33
            if (r3 > r2) goto L1f
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 >= r3) goto L1f
            int r1 = r1 + 1
            goto Le
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected char 0x"
            r0.<init>(r3)
            r3 = 16
            p000.jx0.m3045(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            r2.getClass()
            int r3 = r2.length()
            r4 = 2
            if (r3 >= r4) goto L3f
            java.lang.String r3 = "0"
            java.lang.String r2 = r3.concat(r2)
        L3f:
            r0.append(r2)
            java.lang.String r2 = " at "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " in header name: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L60:
            return
        L61:
            java.lang.String r5 = "name is empty"
            p000.C1080.m7275(r5)
            return
    }

    /* JADX INFO: renamed from: η */
    public static final void m6125(java.lang.String r5, java.lang.String r6) {
            r5.getClass()
            int r0 = r5.length()
            r1 = 0
        L8:
            if (r1 >= r0) goto L76
            char r2 = r5.charAt(r1)
            r3 = 9
            if (r2 == r3) goto L73
            r3 = 32
            if (r3 > r2) goto L1b
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 >= r3) goto L1b
            goto L73
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected char 0x"
            r0.<init>(r3)
            r3 = 16
            p000.jx0.m3045(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            r2.getClass()
            int r3 = r2.length()
            r4 = 2
            if (r3 >= r4) goto L3b
            java.lang.String r3 = "0"
            java.lang.String r2 = r3.concat(r2)
        L3b:
            r0.append(r2)
            java.lang.String r2 = " at "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " value"
            r0.append(r1)
            boolean r6 = p000.sd2.m5480(r6)
            if (r6 == 0) goto L5c
            java.lang.String r5 = ""
            goto L62
        L5c:
            java.lang.String r6 = ": "
            java.lang.String r5 = r6.concat(r5)
        L62:
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L73:
            int r1 = r1 + 1
            goto L8
        L76:
            return
    }

    /* JADX INFO: renamed from: θ */
    public static java.util.Map m6126() {
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L9
            kz r0 = p000.C0493kz.f6332
            return r0
        L9:
            java.lang.String r0 = "pet_elf_camp_person_rules_v2"
            java.lang.String r1 = ""
            java.lang.String r0 = p000.ui1.m5893(r0, r1)
            boolean r1 = p000.q02.m4671(r0)
            jz r2 = p000.C0450jz.f5672
            if (r1 == 0) goto L1b
            goto Lbb
        L1b:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lad
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lad
            int r0 = r1.length()     // Catch: java.lang.Throwable -> Lad
            r3 = 0
            xm0 r0 = p000.j81.m2893(r3, r0)     // Catch: java.lang.Throwable -> Lad
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lad
            r3.<init>()     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> Lad
        L32:
            r0 = r4
            wm0 r0 = (p000.wm0) r0     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r0.f11765     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto Lb3
            r0 = r4
            wm0 r0 = (p000.wm0) r0     // Catch: java.lang.Throwable -> Lad
            int r0 = r0.nextInt()     // Catch: java.lang.Throwable -> Lad
            org.json.JSONObject r5 = r1.optJSONObject(r0)     // Catch: java.lang.Throwable -> Lad
            r0 = 0
            if (r5 != 0) goto L48
            goto La7
        L48:
            java.lang.String r6 = "conversation_short_id"
            r7 = 0
            long r10 = r5.optLong(r6, r7)     // Catch: java.lang.Throwable -> Lad
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 > 0) goto L55
            goto La7
        L55:
            java.lang.String r6 = "seed_id"
            int r6 = r5.optInt(r6)     // Catch: java.lang.Throwable -> Lad
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lad
            if (r6 <= 0) goto L63
            r15 = r7
            goto L64
        L63:
            r15 = r0
        L64:
            sd r9 = new sd     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "harvest"
            ip1 r12 = m6130(r0, r5)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "plant"
            ip1 r13 = m6130(r0, r5)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "water"
            ip1 r14 = m6130(r0, r5)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "seed_mode"
            java.lang.String r0 = r5.optString(r0)     // Catch: java.lang.Throwable -> L86
            r0.getClass()     // Catch: java.lang.Throwable -> L86
            td r0 = p000.EnumC0831td.valueOf(r0)     // Catch: java.lang.Throwable -> L86
            goto L8d
        L86:
            r0 = move-exception
            eo1 r6 = new eo1     // Catch: java.lang.Throwable -> Lad
            r6.<init>(r0)     // Catch: java.lang.Throwable -> Lad
            r0 = r6
        L8d:
            java.lang.Throwable r6 = p000.fo1.m2190(r0)     // Catch: java.lang.Throwable -> Lad
            if (r6 != 0) goto L94
            goto L9b
        L94:
            if (r15 == 0) goto L99
            td r0 = p000.EnumC0831td.f10319     // Catch: java.lang.Throwable -> Lad
            goto L9b
        L99:
            td r0 = p000.EnumC0831td.f10317     // Catch: java.lang.Throwable -> Lad
        L9b:
            r16 = r0
            td r16 = (p000.EnumC0831td) r16     // Catch: java.lang.Throwable -> Lad
            java.util.SortedSet r17 = m6131(r5)     // Catch: java.lang.Throwable -> Lad
            r9.<init>(r10, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Lad
            r0 = r9
        La7:
            if (r0 == 0) goto L32
            r3.add(r0)     // Catch: java.lang.Throwable -> Lad
            goto L32
        Lad:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
        Lb3:
            boolean r0 = r3 instanceof p000.eo1
            if (r0 == 0) goto Lb8
            goto Lb9
        Lb8:
            r2 = r3
        Lb9:
            java.util.List r2 = (java.util.List) r2
        Lbb:
            r0 = 10
            int r0 = p000.AbstractC1021yh.m6889(r2, r0)
            int r0 = p000.ex0.m1970(r0)
            r1 = 16
            if (r0 >= r1) goto Lca
            r0 = r1
        Lca:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.Iterator r0 = r2.iterator()
        Ld3:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lea
            java.lang.Object r2 = r0.next()
            r3 = r2
            sd r3 = (p000.C0794sd) r3
            long r3 = r3.f9836
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.put(r3, r2)
            goto Ld3
        Lea:
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public static p000.C0720qd m6127() {
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L12
            qd r1 = new qd
            r4 = 0
            r7 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L12:
            java.lang.String r0 = "pet_elf_camp_auto_harvest"
            r1 = 0
            boolean r3 = p000.ui1.m5887(r0, r1)
            java.lang.String r0 = "pet_elf_camp_auto_plant"
            boolean r4 = p000.ui1.m5887(r0, r1)
            java.lang.String r0 = "pet_elf_camp_auto_water"
            boolean r5 = p000.ui1.m5887(r0, r1)
            java.lang.String r0 = "pet_elf_camp_global_plant_seed_mode"
            java.lang.String r2 = ""
            java.lang.String r0 = p000.ui1.m5893(r0, r2)
            java.lang.CharSequence r0 = p000.q02.m4660(r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3a
            td r0 = p000.EnumC0831td.valueOf(r0)     // Catch: java.lang.Throwable -> L3a
            goto L41
        L3a:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L41:
            boolean r2 = r0 instanceof p000.eo1
            r6 = 0
            if (r2 == 0) goto L47
            r0 = r6
        L47:
            td r0 = (p000.EnumC0831td) r0
            if (r0 == 0) goto L54
            td r2 = p000.EnumC0831td.f10318
            if (r0 == r2) goto L55
            td r2 = p000.EnumC0831td.f10319
            if (r0 != r2) goto L54
            goto L55
        L54:
            r0 = r6
        L55:
            java.lang.String r2 = "pet_elf_camp_global_plant_seed_id"
            android.content.SharedPreferences r7 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L60
            int r2 = r7.getInt(r2, r1)     // Catch: java.lang.Throwable -> L60
            goto L61
        L60:
            r2 = r1
        L61:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            if (r2 <= 0) goto L68
            goto L69
        L68:
            r7 = r6
        L69:
            java.lang.String r2 = "pet_elf_camp_smart_seed_max_price"
            android.content.SharedPreferences r6 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L74
            int r2 = r6.getInt(r2, r1)     // Catch: java.lang.Throwable -> L74
            goto L75
        L74:
            r2 = r1
        L75:
            r6 = 1000000(0xf4240, float:1.401298E-39)
            int r8 = p000.j81.m2906(r2, r1, r6)
            qd r2 = new qd
            r6 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
    }

    /* JADX INFO: renamed from: κ */
    public static p000.qx0 m6128(p000.dp1 r22, int r23, int r24, int r25, int r26, int r27, p000.rx0 r28, java.util.List r29, p000.ch1[] r30, int r31) {
            r0 = r22
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r29
            r5 = r31
            long r6 = (long) r3
            int[] r8 = new int[r5]
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L17:
            r17 = 0
            if (r11 >= r5) goto L89
            java.lang.Object r18 = r4.get(r11)
            r9 = r18
            kx0 r9 = (p000.kx0) r9
            r19 = r6
            java.lang.Object r6 = r9.mo1183()
            boolean r7 = r6 instanceof p000.ep1
            if (r7 == 0) goto L31
            r17 = r6
            ep1 r17 = (p000.ep1) r17
        L31:
            r6 = r17
            if (r6 == 0) goto L38
            float r6 = r6.f3629
            goto L3a
        L38:
            r6 = r16
        L3a:
            int r7 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r7 <= 0) goto L42
            float r15 = r15 + r6
            int r12 = r12 + 1
            goto L84
        L42:
            int r6 = r1 - r13
            r7 = r30[r11]
            if (r7 != 0) goto L67
            r14 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r14) goto L54
            r17 = r6
            r7 = 2147483647(0x7fffffff, float:NaN)
        L52:
            r14 = 0
            goto L5e
        L54:
            if (r6 >= 0) goto L5a
            r17 = r6
            r7 = 0
            goto L52
        L5a:
            r7 = r6
            r17 = r7
            goto L52
        L5e:
            long r6 = r0.mo1791(r14, r7, r2, r14)
            ch1 r7 = r9.mo2146(r6)
            goto L69
        L67:
            r17 = r6
        L69:
            int r6 = r0.mo1793(r7)
            int r9 = r0.mo1792(r7)
            r8[r11] = r6
            int r14 = r17 - r6
            if (r14 >= 0) goto L78
            r14 = 0
        L78:
            int r14 = java.lang.Math.min(r3, r14)
            int r6 = r6 + r14
            int r13 = r13 + r6
            int r10 = java.lang.Math.max(r10, r9)
            r30[r11] = r7
        L84:
            int r11 = r11 + 1
            r6 = r19
            goto L17
        L89:
            r19 = r6
            if (r12 != 0) goto L91
            int r13 = r13 - r14
            r14 = 0
            goto L164
        L91:
            r14 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r14) goto L98
            r3 = r1
            goto L9a
        L98:
            r3 = r23
        L9a:
            r6 = 1
            int r12 = r12 - r6
            long r11 = (long) r12
            long r11 = r11 * r19
            int r3 = r3 - r13
            long r6 = (long) r3
            long r6 = r6 - r11
            r19 = 0
            int r3 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r3 >= 0) goto Laa
            r6 = r19
        Laa:
            float r3 = (float) r6
            float r3 = r3 / r15
            r9 = 0
        Lad:
            if (r9 >= r5) goto Ld3
            java.lang.Object r14 = r4.get(r9)
            kx0 r14 = (p000.kx0) r14
            java.lang.Object r14 = r14.mo1183()
            boolean r15 = r14 instanceof p000.ep1
            if (r15 == 0) goto Lc0
            ep1 r14 = (p000.ep1) r14
            goto Lc2
        Lc0:
            r14 = r17
        Lc2:
            if (r14 == 0) goto Lc7
            float r14 = r14.f3629
            goto Lc9
        Lc7:
            r14 = r16
        Lc9:
            float r14 = r14 * r3
            int r14 = java.lang.Math.round(r14)
            long r14 = (long) r14
            long r6 = r6 - r14
            int r9 = r9 + 1
            goto Lad
        Ld3:
            r9 = 0
            r14 = 0
        Ld5:
            if (r14 >= r5) goto L159
            r15 = r30[r14]
            if (r15 != 0) goto L14a
            java.lang.Object r15 = r4.get(r14)
            kx0 r15 = (p000.kx0) r15
            java.lang.Object r1 = r15.mo1183()
            r18 = r3
            boolean r3 = r1 instanceof p000.ep1
            if (r3 == 0) goto Lee
            ep1 r1 = (p000.ep1) r1
            goto Lf0
        Lee:
            r1 = r17
        Lf0:
            if (r1 == 0) goto Lf5
            float r3 = r1.f3629
            goto Lf7
        Lf5:
            r3 = r16
        Lf7:
            int r19 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r19 <= 0) goto Lfe
        Lfb:
            r19 = r3
            goto L104
        Lfe:
            java.lang.String r19 = "All weights <= 0 should have placeables"
            p000.yl0.m6939(r19)
            goto Lfb
        L104:
            int r3 = java.lang.Long.signum(r6)
            r20 = r6
            long r6 = (long) r3
            long r6 = r20 - r6
            float r19 = r19 * r18
            int r19 = java.lang.Math.round(r19)
            int r3 = r19 + r3
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
            if (r1 == 0) goto L11f
            boolean r1 = r1.f3630
            goto L120
        L11f:
            r1 = 1
        L120:
            if (r1 == 0) goto L12a
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r1) goto L12d
            r4 = r3
        L128:
            r1 = 1
            goto L12f
        L12a:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L12d:
            r4 = 0
            goto L128
        L12f:
            long r3 = r0.mo1791(r4, r3, r2, r1)
            ch1 r3 = r15.mo2146(r3)
            int r4 = r0.mo1793(r3)
            int r15 = r0.mo1792(r3)
            r8[r14] = r4
            int r9 = r9 + r4
            int r4 = java.lang.Math.max(r10, r15)
            r30[r14] = r3
            r10 = r4
            goto L14f
        L14a:
            r18 = r3
            r20 = r6
            r1 = 1
        L14f:
            int r14 = r14 + 1
            r1 = r25
            r4 = r29
            r3 = r18
            goto Ld5
        L159:
            long r1 = (long) r9
            long r1 = r1 + r11
            int r14 = (int) r1
            int r1 = r25 - r13
            if (r14 >= 0) goto L161
            r14 = 0
        L161:
            if (r14 <= r1) goto L164
            r14 = r1
        L164:
            int r14 = r14 + r13
            if (r14 >= 0) goto L168
            r14 = 0
        L168:
            r1 = r23
            int r4 = java.lang.Math.max(r14, r1)
            r1 = r24
            r14 = 0
            int r1 = java.lang.Math.max(r1, r14)
            int r1 = java.lang.Math.max(r10, r1)
            int[] r3 = new int[r5]
            r2 = r28
            r0.mo1790(r4, r2, r8, r3)
            r5 = r1
            r1 = r30
            qx0 r0 = r0.mo1789(r1, r2, r3, r4, r5)
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public static java.util.ArrayList m6129(java.util.ArrayList r9, p000.eu1 r10) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r9, r1)
            r0.<init>(r1)
            java.util.Iterator r9 = r9.iterator()
        Lf:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r9.next()
            n71 r1 = (p000.n71) r1
            mv1 r2 = new mv1
            java.util.List r3 = p000.w71.f11592
            java.lang.String r3 = r1.f7446
            java.lang.String r3 = p000.w71.m6326(r3)
            java.lang.String r4 = r1.f7448
            int r5 = r1.f7450
            java.lang.String r6 = r1.f7451
            z61 r8 = new z61
            r7 = 7
            r8.<init>(r10, r7, r1)
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.add(r2)
            goto Lf
        L39:
            return r0
    }

    /* JADX INFO: renamed from: μ */
    public static p000.ip1 m6130(java.lang.String r0, org.json.JSONObject r1) {
            java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Throwable -> Lc
            r0.getClass()     // Catch: java.lang.Throwable -> Lc
            ip1 r0 = p000.ip1.valueOf(r0)     // Catch: java.lang.Throwable -> Lc
            goto L13
        Lc:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L13:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L19
            ip1 r0 = p000.ip1.f5162
        L19:
            ip1 r0 = (p000.ip1) r0
            return r0
    }

    /* JADX INFO: renamed from: ν */
    public static java.util.SortedSet m6131(org.json.JSONObject r4) {
            java.lang.String r0 = "excluded_seed_ids"
            org.json.JSONArray r4 = r4.optJSONArray(r0)
            if (r4 == 0) goto L37
            r0 = 0
            int r1 = r4.length()
            xm0 r0 = p000.j81.m2893(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1a:
            r2 = r0
            wm0 r2 = (p000.wm0) r2
            boolean r3 = r2.f11765
            if (r3 == 0) goto L39
            int r2 = r2.nextInt()
            int r2 = r4.optInt(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            if (r2 <= 0) goto L30
            goto L31
        L30:
            r3 = 0
        L31:
            if (r3 == 0) goto L1a
            r1.add(r3)
            goto L1a
        L37:
            jz r1 = p000.C0450jz.f5672
        L39:
            java.util.TreeSet r4 = new java.util.TreeSet
            r4.<init>()
            p000.AbstractC0984xh.m6664(r1, r4)
            return r4
    }

    /* JADX INFO: renamed from: ξ */
    public static android.widget.LinearLayout m6132(android.content.Context r25, java.util.ArrayList r26, p000.p70 r27, java.lang.String r28) {
            r1 = r25
            r1.getClass()
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r2 = r0.density
            r3 = 0
            r4 = 1
            android.content.res.Resources r0 = r1.getResources()     // Catch: java.lang.Throwable -> L29
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L29
            int r0 = r0.uiMode     // Catch: java.lang.Throwable -> L29
            r0 = r0 & 48
            r5 = 32
            if (r0 != r5) goto L23
            r0 = r4
            goto L24
        L23:
            r0 = r3
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L29
            goto L30
        L29:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L30:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r6 = r0 instanceof p000.eo1
            if (r6 == 0) goto L37
            r0 = r5
        L37:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5f
            nv1 r5 = new nv1
            r14 = 419430399(0x18ffffff, float:6.6174445E-24)
            r15 = 553648127(0x20ffffff, float:4.3368084E-19)
            r6 = -15263972(0xffffffffff17171c, float:-2.0083342E38)
            r7 = -14342607(0xffffffffff252631, float:-2.1952092E38)
            r8 = 620756991(0x24ffffff, float:1.11022296E-16)
            r9 = -1
            r10 = -1275068417(0xffffffffb3ffffff, float:-1.1920928E-7)
            r11 = -1493172225(0xffffffffa6ffffff, float:-1.7763567E-15)
            r12 = 587202559(0x22ffffff, float:6.9388935E-18)
            r13 = -1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L7e
        L5f:
            nv1 r6 = new nv1
            r15 = -855051(0xfffffffffff2f3f5, float:NaN)
            r16 = 301989888(0x12000000, float:4.038968E-28)
            r7 = -1
            r8 = -526086(0xfffffffffff7f8fa, float:NaN)
            r9 = 335544320(0x14000000, float:6.4623485E-27)
            r10 = -15329245(0xffffffffff161823, float:-1.9950952E38)
            r11 = -9735552(0xffffffffff6b7280, float:-3.129631E38)
            r12 = -7697778(0xffffffffff8a8a8e, float:NaN)
            r13 = 251658240(0xf000000, float:6.3108872E-30)
            r14 = -15329245(0xffffffffff161823, float:-1.9950952E38)
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r5 = r6
        L7e:
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r1)
            r7 = r28
            r6.setTag(r7)
            r6.setOrientation(r4)
            r7 = 14
            int r0 = m6121(r1, r7)
            r8 = 10
            int r9 = m6121(r1, r8)
            int r10 = m6121(r1, r7)
            r11 = 12
            int r12 = m6121(r1, r11)
            r6.setPadding(r0, r9, r10, r12)
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            int r10 = r5.f7767
            int r12 = r5.f7768
            int[] r10 = new int[]{r10, r12}
            r0.<init>(r9, r10)
            r9 = 18
            int r9 = m6121(r1, r9)
            float r9 = (float) r9
            r0.setCornerRadius(r9)
            int r9 = m6121(r1, r4)
            int r10 = r5.f7769
            r0.setStroke(r9, r10)
            r6.setBackground(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r9 = -1
            r10 = -2
            r0.<init>(r9, r10)
            int r12 = m6121(r1, r11)
            r13 = 6
            int r14 = m6121(r1, r13)
            int r15 = m6121(r1, r11)
            r28 = r9
            r9 = 8
            int r13 = m6121(r1, r9)
            r0.setMargins(r12, r14, r15, r13)
            r6.setLayoutParams(r0)
            r6.setClickable(r4)
            r6.setFocusable(r4)
            r0 = 1086324736(0x40c00000, float:6.0)
            float r2 = r2 * r0
            r6.setElevation(r2)
            b9 r0 = new b9
            r2 = 7
            r12 = r27
            r0.<init>(r2, r12)
            r6.setOnClickListener(r0)
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r1)
            r0.setOrientation(r3)
            r2 = 16
            r0.setGravity(r2)
            android.widget.LinearLayout r12 = new android.widget.LinearLayout
            r12.<init>(r1)
            r12.setOrientation(r4)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r14 = 1065353216(0x3f800000, float:1.0)
            r13.<init>(r3, r10, r14)
            r12.setLayoutParams(r13)
            android.widget.TextView r13 = new android.widget.TextView
            r13.<init>(r1)
            java.lang.String r15 = "DY Helper"
            r13.setText(r15)
            r15 = 1097859072(0x41700000, float:15.0)
            r13.setTextSize(r15)
            r13.setIncludeFontPadding(r3)
            r15 = 0
            r13.setTypeface(r15, r4)
            int r10 = r5.f7770
            r13.setTextColor(r10)
            r12.addView(r13)
            android.widget.TextView r13 = new android.widget.TextView
            r13.<init>(r1)
            java.lang.String r14 = "快捷操作，也可打开完整操作菜单"
            r13.setText(r14)
            r14 = 1093664768(0x41300000, float:11.0)
            r13.setTextSize(r14)
            r13.setIncludeFontPadding(r3)
            int r7 = r5.f7771
            r13.setTextColor(r7)
            r7 = 3
            int r7 = m6121(r1, r7)
            r13.setPadding(r3, r7, r3, r3)
            r12.addView(r13)
            r0.addView(r12)
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r1)
            java.lang.String r12 = "更多"
            r7.setText(r12)
            r7.setTextSize(r14)
            r7.setIncludeFontPadding(r3)
            r7.setTypeface(r15, r4)
            r12 = 17
            r7.setGravity(r12)
            int r12 = r5.f7774
            r7.setTextColor(r12)
            r12 = 9
            int r13 = m6121(r1, r12)
            r14 = 5
            int r15 = m6121(r1, r14)
            int r12 = m6121(r1, r12)
            int r14 = m6121(r1, r14)
            r7.setPadding(r13, r15, r12, r14)
            android.graphics.drawable.GradientDrawable r12 = new android.graphics.drawable.GradientDrawable
            r12.<init>()
            int r13 = r5.f7773
            r12.setColor(r13)
            int r11 = m6121(r1, r11)
            float r11 = (float) r11
            r12.setCornerRadius(r11)
            r7.setBackground(r12)
            r0.addView(r7)
            r6.addView(r0)
            boolean r0 = r26.isEmpty()
            if (r0 != 0) goto L42b
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r1)
            r7.setOrientation(r4)
            int r0 = m6121(r1, r8)
            r7.setPadding(r3, r0, r3, r3)
            r11 = 2
            r12 = r26
            java.util.ArrayList r0 = p000.AbstractC0984xh.m6631(r11, r12)
            java.util.Iterator r12 = r0.iterator()
        L1d2:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L425
            java.lang.Object r0 = r12.next()
            r13 = r0
            java.util.List r13 = (java.util.List) r13
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            r14.<init>(r1)
            r14.setOrientation(r3)
            r14.setGravity(r2)
            java.util.Iterator r15 = r13.iterator()
            r18 = r3
        L1f0:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L3ca
            java.lang.Object r0 = r15.next()
            int r19 = r18 + 1
            if (r18 < 0) goto L3c4
            r11 = r0
            mv1 r11 = (p000.mv1) r11
            boolean r4 = r11.f7294
            java.lang.String r9 = r11.f7291
            java.lang.String r8 = r11.f7290
            int r2 = r5.f7772
            if (r4 != 0) goto L20d
            r0 = r2
            goto L234
        L20d:
            java.lang.String r0 = r11.f7293     // Catch: java.lang.Throwable -> L218
            int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Throwable -> L218
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L218
            goto L21f
        L218:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L21f:
            r3 = -119723(0xfffffffffffe2c55, float:NaN)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r21 = r3
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L22e
            r0 = r21
        L22e:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
        L234:
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r1)
            r21 = r12
            r12 = 0
            r3.setOrientation(r12)
            r12 = 16
            r3.setGravity(r12)
            r20 = r13
            r12 = 10
            int r13 = m6121(r1, r12)
            r23 = r6
            r22 = r15
            r15 = 8
            int r6 = m6121(r1, r15)
            r24 = r7
            int r7 = m6121(r1, r12)
            int r12 = m6121(r1, r15)
            r3.setPadding(r13, r6, r7, r12)
            int r6 = r5.f7776
            int r7 = r5.f7775
            if (r4 == 0) goto L28f
            r12 = 419430399(0x18ffffff, float:6.6174445E-24)
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            android.graphics.drawable.GradientDrawable r7 = p000.lz1.m3681(r7)
            r13 = 14
            int r15 = m6121(r1, r13)
            float r15 = (float) r15
            r7.setCornerRadius(r15)
            r15 = 1
            int r13 = m6121(r1, r15)
            r7.setStroke(r13, r6)
            android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
            r13 = 0
            r6.<init>(r12, r7, r13)
            r13 = 14
            goto L2a6
        L28f:
            r15 = 1
            android.graphics.drawable.GradientDrawable r7 = p000.lz1.m3681(r7)
            r13 = 14
            int r12 = m6121(r1, r13)
            float r12 = (float) r12
            r7.setCornerRadius(r12)
            int r12 = m6121(r1, r15)
            r7.setStroke(r12, r6)
            r6 = r7
        L2a6:
            r3.setBackground(r6)
            if (r4 == 0) goto L2ae
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L2b1
        L2ae:
            r6 = 1057300152(0x3f051eb8, float:0.52)
        L2b1:
            r3.setAlpha(r6)
            r3.setClickable(r15)
            r3.setFocusable(r4)
            if (r4 == 0) goto L2be
            r4 = r8
            goto L2c4
        L2be:
            java.lang.String r4 = "，"
            java.lang.String r4 = p000.lz1.m3688(r8, r4, r9)
        L2c4:
            r3.setContentDescription(r4)
            hi r4 = new hi
            r6 = 7
            r4.<init>(r6, r11)
            r3.setOnClickListener(r4)
            android.widget.ImageView r4 = new android.widget.ImageView
            r4.<init>(r1)
            x01 r6 = p000.x01.f11964
            int r7 = r11.f7292
            android.graphics.drawable.Drawable r6 = r6.m6475(r1, r7)
            r4.setImageDrawable(r6)
            android.content.res.ColorStateList r6 = android.content.res.ColorStateList.valueOf(r28)
            r4.setImageTintList(r6)
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>()
            r15 = 1
            r6.setShape(r15)
            r6.setColor(r0)
            r4.setBackground(r6)
            r0 = 7
            int r6 = m6121(r1, r0)
            int r7 = m6121(r1, r0)
            int r11 = m6121(r1, r0)
            int r0 = m6121(r1, r0)
            r4.setPadding(r6, r7, r11, r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r6 = 30
            int r7 = m6121(r1, r6)
            int r6 = m6121(r1, r6)
            r0.<init>(r7, r6)
            r15 = 8
            int r6 = m6121(r1, r15)
            r0.setMarginEnd(r6)
            r4.setLayoutParams(r0)
            r3.addView(r4)
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r1)
            r15 = 1
            r0.setOrientation(r15)
            r12 = 16
            r0.setGravity(r12)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = -2
            r11 = 0
            r4.<init>(r11, r7, r6)
            r0.setLayoutParams(r4)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r1)
            r4.setText(r8)
            r6 = 1095761920(0x41500000, float:13.0)
            r4.setTextSize(r6)
            r4.setMaxLines(r15)
            android.text.TextUtils$TruncateAt r6 = android.text.TextUtils.TruncateAt.END
            r4.setEllipsize(r6)
            r4.setIncludeFontPadding(r11)
            r7 = 0
            r4.setTypeface(r7, r15)
            r4.setTextColor(r10)
            r0.addView(r4)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r1)
            r4.setText(r9)
            r7 = 1092616192(0x41200000, float:10.0)
            r4.setTextSize(r7)
            r4.setMaxLines(r15)
            r4.setEllipsize(r6)
            r4.setIncludeFontPadding(r11)
            r4.setTextColor(r2)
            r2 = 2
            int r6 = m6121(r1, r2)
            r4.setPadding(r11, r6, r11, r11)
            r0.addView(r4)
            r3.addView(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r4 = 54
            int r4 = m6121(r1, r4)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r11, r4, r6)
            if (r18 != 0) goto L3a3
            r4 = 6
            int r6 = m6121(r1, r4)
            r0.setMarginEnd(r6)
            goto L3ab
        L3a3:
            r4 = 6
            int r6 = m6121(r1, r4)
            r0.setMarginStart(r6)
        L3ab:
            r14.addView(r3, r0)
            r11 = r2
            r2 = r12
            r18 = r19
            r13 = r20
            r12 = r21
            r15 = r22
            r6 = r23
            r7 = r24
            r3 = 0
            r4 = 1
            r8 = 10
            r9 = 8
            goto L1f0
        L3c4:
            p000.AbstractC1021yh.m6917()
            r17 = 0
            throw r17
        L3ca:
            r23 = r6
            r24 = r7
            r21 = r12
            r20 = r13
            r13 = 14
            r17 = 0
            r12 = r2
            r2 = 2
            int r0 = r20.size()
            r15 = 1
            if (r0 != r15) goto L3fe
            android.view.View r0 = new android.view.View
            r0.<init>(r1)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = 54
            int r4 = m6121(r1, r4)
            r6 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r3.<init>(r11, r4, r6)
            r4 = 6
            int r7 = m6121(r1, r4)
            r3.setMarginStart(r7)
            r14.addView(r0, r3)
            goto L402
        L3fe:
            r4 = 6
            r6 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
        L402:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r3 = r28
            r7 = -2
            r0.<init>(r3, r7)
            r8 = 8
            int r9 = m6121(r1, r8)
            r0.bottomMargin = r9
            r9 = r24
            r9.addView(r14, r0)
            r7 = r9
            r3 = r11
            r4 = r15
            r6 = r23
            r11 = r2
            r9 = r8
            r2 = r12
            r12 = r21
            r8 = 10
            goto L1d2
        L425:
            r14 = r6
            r9 = r7
            r14.addView(r9)
            goto L42c
        L42b:
            r14 = r6
        L42c:
            return r14
    }

    /* JADX INFO: renamed from: ο */
    public static void m6133(p000.C0794sd r9) {
            long r0 = r9.f9836
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto Ldb
            java.util.Map r2 = m6126()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3.put(r2, r9)
            java.lang.Object r9 = p000.ui1.f10844
            java.util.Collection r9 = r3.values()
            r9.getClass()
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            ib1 r3 = new ib1
            r4 = 3
            r3.<init>(r4)
            java.util.List r9 = p000.AbstractC0984xh.m6658(r9, r3)
            java.util.Iterator r9 = r9.iterator()
        L36:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto Lc5
            java.lang.Object r3 = r9.next()
            sd r3 = (p000.C0794sd) r3
            td r4 = r3.m5469()
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r6 = "conversation_short_id"
            long r7 = r3.f9836
            r5.put(r6, r7)
            ip1 r6 = r3.f9837
            java.lang.String r6 = r6.name()
            java.lang.String r7 = "harvest"
            r5.put(r7, r6)
            ip1 r6 = r3.f9838
            java.lang.String r6 = r6.name()
            java.lang.String r7 = "plant"
            r5.put(r7, r6)
            ip1 r6 = r3.f9839
            java.lang.String r6 = r6.name()
            java.lang.String r7 = "water"
            r5.put(r7, r6)
            java.lang.String r6 = "seed_mode"
            java.lang.String r7 = r4.name()
            r5.put(r6, r7)
            td r6 = p000.EnumC0831td.f10319
            if (r4 != r6) goto L87
            java.lang.Integer r4 = r3.f9840
            if (r4 != 0) goto L89
            java.lang.Object r4 = org.json.JSONObject.NULL
            goto L89
        L87:
            java.lang.Object r4 = org.json.JSONObject.NULL
        L89:
            java.lang.String r6 = "seed_id"
            r5.put(r6, r4)
            java.util.Set r3 = r3.f9842
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9b:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto Lb2
            java.lang.Object r6 = r3.next()
            r7 = r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 <= 0) goto L9b
            r4.add(r6)
            goto L9b
        Lb2:
            java.util.List r3 = p000.AbstractC0984xh.m6657(r4)
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>(r3)
            java.lang.String r3 = "excluded_seed_ids"
            r5.put(r3, r4)
            r2.put(r5)
            goto L36
        Lc5:
            java.lang.String r9 = r2.toString()
            r9.getClass()
            java.lang.String r2 = "pet_elf_camp_person_rules_v2"
            p000.ui1.m5875(r2, r9)
            xn0 r9 = p000.xn0.f12237
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.m6764(r0)
            return
        Ldb:
            java.lang.String r9 = "会话短 ID 无效"
            p000.C1080.m7275(r9)
            return
    }

    /* JADX INFO: renamed from: π */
    public static void m6134(android.widget.TextView r2, int r3) {
            if (r3 < 0) goto L15
            android.text.TextPaint r0 = r2.getPaint()
            r1 = 0
            int r0 = r0.getFontMetricsInt(r1)
            if (r3 == r0) goto L14
            int r3 = r3 - r0
            float r3 = (float) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setLineSpacing(r3, r0)
        L14:
            return
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    /* JADX INFO: renamed from: ρ */
    public static byte[] m6135(java.util.ArrayList r4) {
            int r0 = r4.size()
            byte[] r0 = new byte[r0]
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        Lb:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r4.next()
            o62 r2 = (p000.o62) r2
            byte r2 = r2.f7966
            int r3 = r1 + 1
            r0[r1] = r2
            r1 = r3
            goto Lb
        L1f:
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public static final int m6136(int r3) {
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            r0 = r0 & r3
            r1 = 613566756(0x24924924, float:6.344131E-17)
            r1 = r1 & r3
            r2 = -920350135(0xffffffffc9249249, float:-674084.56)
            r3 = r3 & r2
            int r2 = r1 >> 1
            r2 = r2 | r0
            r3 = r3 | r2
            int r0 = r0 << 1
            r0 = r0 & r1
            r3 = r3 | r0
            return r3
    }
}
