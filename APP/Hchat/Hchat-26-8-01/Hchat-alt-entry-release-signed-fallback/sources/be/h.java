package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile cb.f f798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile java.lang.String f799b;

    public static java.lang.String A(int r4, int r5, int r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 80
            r0.<init>(r1)
            int r1 = ~r5
            r1 = r1 & r4
            r4 = r4 & r5
            r5 = r4 & 1
            if (r5 == 0) goto L13
            java.lang.String r5 = "|public"
            r0.append(r5)
        L13:
            r5 = r4 & 2
            if (r5 == 0) goto L1c
            java.lang.String r5 = "|private"
            r0.append(r5)
        L1c:
            r5 = r4 & 4
            if (r5 == 0) goto L25
            java.lang.String r5 = "|protected"
            r0.append(r5)
        L25:
            r5 = r4 & 8
            if (r5 == 0) goto L2e
            java.lang.String r5 = "|static"
            r0.append(r5)
        L2e:
            r5 = r4 & 16
            if (r5 == 0) goto L37
            java.lang.String r5 = "|final"
            r0.append(r5)
        L37:
            r5 = r4 & 32
            r2 = 1
            if (r5 == 0) goto L49
            if (r6 != r2) goto L44
            java.lang.String r5 = "|super"
            r0.append(r5)
            goto L49
        L44:
            java.lang.String r5 = "|synchronized"
            r0.append(r5)
        L49:
            r5 = r4 & 64
            r3 = 3
            if (r5 == 0) goto L5b
            if (r6 != r3) goto L56
            java.lang.String r5 = "|bridge"
            r0.append(r5)
            goto L5b
        L56:
            java.lang.String r5 = "|volatile"
            r0.append(r5)
        L5b:
            r5 = r4 & 128(0x80, float:1.8E-43)
            if (r5 == 0) goto L6c
            if (r6 != r3) goto L67
            java.lang.String r5 = "|varargs"
            r0.append(r5)
            goto L6c
        L67:
            java.lang.String r5 = "|transient"
            r0.append(r5)
        L6c:
            r5 = r4 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L75
            java.lang.String r5 = "|native"
            r0.append(r5)
        L75:
            r5 = r4 & 512(0x200, float:7.17E-43)
            if (r5 == 0) goto L7e
            java.lang.String r5 = "|interface"
            r0.append(r5)
        L7e:
            r5 = r4 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L87
            java.lang.String r5 = "|abstract"
            r0.append(r5)
        L87:
            r5 = r4 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L90
            java.lang.String r5 = "|strictfp"
            r0.append(r5)
        L90:
            r5 = r4 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L99
            java.lang.String r5 = "|synthetic"
            r0.append(r5)
        L99:
            r5 = r4 & 8192(0x2000, float:1.148E-41)
            if (r5 == 0) goto La2
            java.lang.String r5 = "|annotation"
            r0.append(r5)
        La2:
            r5 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto Lab
            java.lang.String r5 = "|enum"
            r0.append(r5)
        Lab:
            r5 = 65536(0x10000, float:9.1835E-41)
            r5 = r5 & r4
            if (r5 == 0) goto Lb5
            java.lang.String r5 = "|constructor"
            r0.append(r5)
        Lb5:
            r5 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 & r5
            if (r4 == 0) goto Lbf
            java.lang.String r4 = "|declared_synchronized"
            r0.append(r4)
        Lbf:
            if (r1 != 0) goto Lc7
            int r4 = r0.length()
            if (r4 != 0) goto Ld3
        Lc7:
            r4 = 124(0x7c, float:1.74E-43)
            r0.append(r4)
            java.lang.String r4 = a.a.X0(r1)
            r0.append(r4)
        Ld3:
            java.lang.String r4 = r0.substring(r2)
            return r4
    }

    public static final int B(int r0, int r1) {
            int r0 = r0 >> r1
            r0 = r0 & 31
            return r0
    }

    public static boolean C(h.Hchat.hooks.api.model.WeChatMessage r1) {
            boolean r0 = r1.isText()
            if (r0 != 0) goto L15
            boolean r0 = r1.isQuote()
            if (r0 != 0) goto L15
            boolean r1 = r1.isTransfer()
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            return r1
        L15:
            r1 = 1
            return r1
    }

    public static final boolean D(e1.d r6) {
            long r0 = r6.f2304e
            r2 = 32
            long r2 = r0 >>> r2
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L24
            long r2 = r6.f2305f
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L24
            long r2 = r6.f2306g
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L24
            long r2 = r6.f2307h
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L24
            r6 = 1
            return r6
        L24:
            r6 = 0
            return r6
    }

    public static boolean E(java.util.List r3, java.lang.Comparable r4) {
            r0 = 0
            if (r3 == 0) goto L14
            int r1 = r3.size()
            r2 = 1
            if (r1 == r2) goto Lb
            goto L14
        Lb:
            java.lang.Object r3 = r3.get(r0)
            boolean r3 = java.util.Objects.equals(r3, r4)
            return r3
        L14:
            return r0
    }

    public static java.lang.Object F(java.util.List r1) {
            if (r1 == 0) goto L14
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9
            goto L14
        L9:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            return r1
        L14:
            r1 = 0
            return r1
    }

    public static sf.c G(sf.d r2, fg.a r3) {
            sf.m r0 = sf.m.f12432a
            int r2 = r2.ordinal()
            if (r2 == 0) goto L27
            r1 = 1
            if (r2 == r1) goto L1d
            r1 = 2
            if (r2 != r1) goto L18
            sf.o r2 = new sf.o
            r2.<init>()
            r2.f12434g = r3
            r2.f12435h = r0
            return r2
        L18:
            okio.a.k()
            r2 = 0
            return r2
        L1d:
            sf.h r2 = new sf.h
            r2.<init>()
            r2.f12423g = r3
            r2.f12424h = r0
            return r2
        L27:
            sf.i r2 = new sf.i
            r2.<init>(r3)
            return r2
    }

    public static sf.i H(fg.a r1) {
            r1.getClass()
            sf.i r0 = new sf.i
            r0.<init>(r1)
            return r0
    }

    public static na.a I(l3.l r49) {
            r0 = r49
            java.lang.String r1 = "hb_reply_group_items_v1"
            r0.getClass()
            java.lang.String r2 = "hb_reply_enable"
            r3 = 0
            android.content.SharedPreferences r4 = r0.b()     // Catch: java.lang.Throwable -> L13
            boolean r2 = r4.getBoolean(r2, r3)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r2 = r3
        L14:
            r4 = 1
            if (r2 == 0) goto L24
            java.lang.String r5 = "hb_reply_type"
            android.content.SharedPreferences r6 = r0.b()     // Catch: java.lang.Throwable -> L22
            int r5 = r6.getInt(r5, r4)     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            r5 = r4
            goto L25
        L24:
            r5 = r3
        L25:
            java.lang.String r6 = "hb_reply_custom_enable"
            android.content.SharedPreferences r7 = r0.b()     // Catch: java.lang.Throwable -> L30
            boolean r6 = r7.getBoolean(r6, r3)     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
            r6 = r3
        L31:
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r6 == 0) goto L57
            java.lang.String r6 = "hb_reply_delay_value"
            android.content.SharedPreferences r11 = r0.b()     // Catch: java.lang.Throwable -> L40
            int r6 = r11.getInt(r6, r4)     // Catch: java.lang.Throwable -> L40
            goto L41
        L40:
            r6 = r4
        L41:
            if (r6 >= 0) goto L44
            r6 = r3
        L44:
            java.lang.String r11 = "hb_reply_delay_unit"
            android.content.SharedPreferences r12 = r0.b()     // Catch: java.lang.Throwable -> L4f
            int r11 = r12.getInt(r11, r4)     // Catch: java.lang.Throwable -> L4f
            goto L50
        L4f:
            r11 = r4
        L50:
            if (r11 != r4) goto L55
            long r11 = (long) r6
            long r11 = r11 * r7
            goto L59
        L55:
            long r11 = (long) r6
            goto L59
        L57:
            r11 = 0
        L59:
            r6 = 2
            java.lang.String r13 = ""
            if (r5 == r4) goto L68
            if (r5 != r6) goto L61
            goto L68
        L61:
            java.lang.String r14 = "hb_reply_media_paths"
            java.lang.String r14 = r0.d(r14, r13)
            goto L76
        L68:
            java.lang.String r14 = "hb_reply_text"
            java.lang.String r15 = "谢谢老板"
            java.lang.String r14 = r0.d(r14, r15)
            java.lang.String r15 = "hb_reply_templates"
            java.lang.String r14 = r0.d(r15, r14)
        L76:
            java.lang.String r15 = "hb_reply_items_v1"
            java.lang.String r15 = r0.d(r15, r13)
            java.lang.String r6 = "hb_reply_random"
            if (r2 == 0) goto L8d
            boolean r17 = og.m.t0(r15)
            if (r17 != 0) goto L8d
            java.util.List r2 = a7.a.J(r15)
        L8a:
            r31 = r2
            goto La1
        L8d:
            if (r2 == 0) goto L9e
            android.content.SharedPreferences r2 = r0.b()     // Catch: java.lang.Throwable -> L98
            boolean r2 = r2.getBoolean(r6, r3)     // Catch: java.lang.Throwable -> L98
            goto L99
        L98:
            r2 = r3
        L99:
            java.util.List r2 = a7.a.B(r5, r11, r14, r2)
            goto L8a
        L9e:
            tf.t r2 = tf.t.f13167g
            goto L8a
        La1:
            android.content.SharedPreferences r2 = r0.b()     // Catch: java.lang.Throwable -> Lad
            boolean r2 = r2.contains(r1)     // Catch: java.lang.Throwable -> Lad
            if (r2 != r4) goto Lad
            r2 = r4
            goto Lae
        Lad:
            r2 = r3
        Lae:
            if (r2 == 0) goto Lbb
            java.lang.String r1 = r0.d(r1, r13)
            java.util.List r1 = a7.a.J(r1)
            r32 = r1
            goto Lbd
        Lbb:
            r32 = r31
        Lbd:
            na.a r1 = new na.a
            r17 = r7
            boolean r8 = r0.e()
            java.lang.String r2 = "hb_grab_mode"
            android.content.SharedPreferences r7 = r0.b()     // Catch: java.lang.Throwable -> Ld0
            int r2 = r7.getInt(r2, r4)     // Catch: java.lang.Throwable -> Ld0
            goto Ld1
        Ld0:
            r2 = r4
        Ld1:
            java.lang.String r7 = "hb_auto_delay_mode"
            java.lang.String r15 = "hb_auto_delay_value"
            r19 = 0
            int r9 = r0.c(r15, r3)
            java.lang.String r10 = "hb_auto_delay_unit"
            r21 = r1
            int r1 = r0.c(r10, r3)
            r26 = r5
            if (r1 != r4) goto Leb
            long r4 = (long) r9
            long r4 = r4 * r17
            goto Lec
        Leb:
            long r4 = (long) r9
        Lec:
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto Lf2
            r4 = 2
            goto Lf3
        Lf2:
            r4 = r3
        Lf3:
            android.content.SharedPreferences r5 = r0.b()     // Catch: java.lang.Throwable -> Lfb
            int r4 = r5.getInt(r7, r4)     // Catch: java.lang.Throwable -> Lfb
        Lfb:
            int r5 = r0.c(r15, r3)
            int r7 = r0.c(r10, r3)
            r1 = 1
            long r9 = (long) r5
            if (r7 != r1) goto L109
            long r9 = r9 * r17
        L109:
            java.lang.String r1 = "hb_auto_delay_random_min"
            android.content.SharedPreferences r5 = r0.b()     // Catch: java.lang.Throwable -> L114
            int r1 = r5.getInt(r1, r3)     // Catch: java.lang.Throwable -> L114
            goto L115
        L114:
            r1 = r3
        L115:
            if (r1 >= 0) goto L118
            r1 = r3
        L118:
            r7 = r4
            long r3 = (long) r1
            java.lang.String r1 = "hb_auto_delay_random_max"
            android.content.SharedPreferences r15 = r0.b()     // Catch: java.lang.Throwable -> L126
            r5 = 0
            int r1 = r15.getInt(r1, r5)     // Catch: java.lang.Throwable -> L126
            goto L127
        L126:
            r1 = 0
        L127:
            if (r1 >= 0) goto L12a
            r1 = 0
        L12a:
            r15 = r6
            long r5 = (long) r1
            java.lang.String r1 = "hb_skip_self"
            r17 = r2
            android.content.SharedPreferences r2 = r0.b()     // Catch: java.lang.Throwable -> L143
            r18 = r3
            r3 = 0
            boolean r1 = r2.getBoolean(r1, r3)     // Catch: java.lang.Throwable -> L146
            r28 = r11
            r11 = r9
            r9 = r17
            r17 = r1
            goto L14d
        L143:
            r18 = r3
            r3 = 0
        L146:
            r28 = r11
            r11 = r9
            r9 = r17
            r17 = r3
        L14d:
            java.lang.String r1 = "hb_auto_mode"
            android.content.SharedPreferences r2 = r0.b()     // Catch: java.lang.Throwable -> L15e
            int r1 = r2.getInt(r1, r3)     // Catch: java.lang.Throwable -> L15e
            r47 = r18
            r18 = r1
            r1 = r47
            goto L162
        L15e:
            r1 = r18
            r18 = 0
        L162:
            java.lang.String r3 = "hb_auto_whitelist"
            java.lang.String r19 = r0.d(r3, r13)
            java.lang.String r3 = "hb_auto_blacklist"
            java.lang.String r20 = r0.d(r3, r13)
            java.lang.String r3 = "hb_kw_mode"
            android.content.SharedPreferences r4 = r0.b()     // Catch: java.lang.Throwable -> L182
            r10 = 0
            int r3 = r4.getInt(r3, r10)     // Catch: java.lang.Throwable -> L183
            r47 = r21
            r21 = r3
            r3 = r15
            r15 = r5
            r6 = r47
            goto L189
        L182:
            r10 = 0
        L183:
            r3 = r15
            r15 = r5
            r6 = r21
            r21 = r10
        L189:
            java.lang.String r4 = "hb_keywords"
            java.lang.String r22 = r0.d(r4, r13)
            android.content.SharedPreferences r4 = r0.b()     // Catch: java.lang.Throwable -> L19a
            boolean r5 = r4.getBoolean(r3, r10)     // Catch: java.lang.Throwable -> L19a
            r30 = r5
            goto L19c
        L19a:
            r30 = r10
        L19c:
            java.lang.String r3 = "hb_notify_system_enable"
            android.content.SharedPreferences r4 = r0.b()     // Catch: java.lang.Throwable -> L1a9
            boolean r5 = r4.getBoolean(r3, r10)     // Catch: java.lang.Throwable -> L1a9
            r33 = r5
            goto L1ab
        L1a9:
            r33 = r10
        L1ab:
            java.lang.String r3 = "hb_notify_toast_enable"
            android.content.SharedPreferences r4 = r0.b()     // Catch: java.lang.Throwable -> L1b8
            boolean r5 = r4.getBoolean(r3, r10)     // Catch: java.lang.Throwable -> L1b8
            r34 = r5
            goto L1ba
        L1b8:
            r34 = r10
        L1ba:
            java.lang.String r3 = "hb_notify_sound_enable"
            android.content.SharedPreferences r4 = r0.b()     // Catch: java.lang.Throwable -> L1c7
            boolean r5 = r4.getBoolean(r3, r10)     // Catch: java.lang.Throwable -> L1c7
            r35 = r5
            goto L1c9
        L1c7:
            r35 = r10
        L1c9:
            java.lang.String r3 = "hb_notify_sound_mode"
            android.content.SharedPreferences r4 = r0.b()     // Catch: java.lang.Throwable -> L1d6
            int r5 = r4.getInt(r3, r10)     // Catch: java.lang.Throwable -> L1d6
            r36 = r5
            goto L1d8
        L1d6:
            r36 = r10
        L1d8:
            java.lang.String r3 = "hb_notify_vibrate_enable"
            android.content.SharedPreferences r4 = r0.b()     // Catch: java.lang.Throwable -> L1e5
            boolean r5 = r4.getBoolean(r3, r10)     // Catch: java.lang.Throwable -> L1e5
            r37 = r5
            goto L1e7
        L1e5:
            r37 = 0
        L1e7:
            java.lang.String r4 = "hb_notify_sound_uri"
            java.lang.String r38 = r0.d(r4, r13)
            java.lang.String r4 = "hb_notify_text"
            java.lang.String r5 = "抢到红包 {amount} 元"
            java.lang.String r39 = r0.d(r4, r5)
            java.lang.String r10 = "hb_notify_toast_text"
            java.lang.String r4 = r0.d(r4, r5)
            java.lang.String r40 = r0.d(r10, r4)
            java.lang.String r4 = "hb_notify_failed_system_enable"
            android.content.SharedPreferences r10 = r0.b()     // Catch: java.lang.Throwable -> L20d
            r3 = 0
            boolean r4 = r10.getBoolean(r4, r3)     // Catch: java.lang.Throwable -> L20e
            r41 = r4
            goto L210
        L20d:
            r3 = 0
        L20e:
            r41 = r3
        L210:
            java.lang.String r4 = "hb_notify_failed_toast_enable"
            android.content.SharedPreferences r10 = r0.b()     // Catch: java.lang.Throwable -> L21d
            boolean r4 = r10.getBoolean(r4, r3)     // Catch: java.lang.Throwable -> L21d
            r42 = r4
            goto L21f
        L21d:
            r42 = 0
        L21f:
            java.lang.String r4 = "hb_notify_failed_text"
            java.lang.String r10 = "未抢到红包"
            java.lang.String r43 = r0.d(r4, r10)
            java.lang.String r13 = "hb_notify_failed_toast_text"
            java.lang.String r4 = r0.d(r4, r10)
            java.lang.String r44 = r0.d(r13, r4)
            java.lang.String r4 = "hb_announce_enable"
            android.content.SharedPreferences r10 = r0.b()     // Catch: java.lang.Throwable -> L23f
            r3 = 0
            boolean r3 = r10.getBoolean(r4, r3)     // Catch: java.lang.Throwable -> L23c
        L23c:
            r45 = r3
            goto L241
        L23f:
            r3 = 0
            goto L23c
        L241:
            java.lang.String r3 = "hb_announce_text"
            java.lang.String r46 = r0.d(r3, r5)
            r10 = r7
            java.lang.String r7 = "旧版全局设置"
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = r14
            r13 = r1
            r6.<init>(r7, r8, r9, r10, r11, r13, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            return r6
    }

    public static java.util.List J(boolean r19) {
            g8.i r0 = wb.en.c()
            tf.t r1 = tf.t.f13167g
            if (r0 == 0) goto L3aa
            boolean r2 = r0.G()
            r3 = 0
            if (r2 == 0) goto L11
            r2 = r0
            goto L12
        L11:
            r2 = r3
        L12:
            if (r2 == 0) goto L3aa
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.ArrayList r0 = r2.p()     // Catch: java.lang.Throwable -> L1e
            goto L25
        L1e:
            r0 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r0)
            r0 = r5
        L25:
            boolean r5 = r0 instanceof sf.f
            if (r5 == 0) goto L2b
            r0 = r1
        L2b:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L7a
            java.lang.Object r5 = r0.next()
            h.Hchat.hooks.api.model.ContactLabelBean r5 = (h.Hchat.hooks.api.model.ContactLabelBean) r5
            java.lang.String r6 = r5.labelName
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L47
            java.lang.String r6 = r5.labelId
        L47:
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L4e
            goto L31
        L4e:
            java.util.List<java.lang.String> r5 = r5.userNameList
            java.util.Iterator r5 = r5.iterator()
        L54:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L31
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = og.m.t0(r7)
            if (r8 != 0) goto L54
            java.lang.Object r8 = r4.get(r7)
            if (r8 != 0) goto L74
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r4.put(r7, r8)
        L74:
            java.util.List r8 = (java.util.List) r8
            r8.add(r6)
            goto L54
        L7a:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r5 = r4.size()
            int r5 = tf.y.a0(r5)
            r0.<init>(r5)
            java.util.Set r4 = r4.entrySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L91:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Laf
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            java.util.List r5 = tf.m.p1(r5)
            r0.put(r6, r5)
            goto L91
        Laf:
            h8.a r4 = h.Hchat.hooks.api.core.WeChatApis.conversations()
            if (r4 == 0) goto Lba
            java.util.ArrayList r4 = r4.c()
            goto Lbb
        Lba:
            r4 = r3
        Lbb:
            if (r4 != 0) goto Lbe
            r4 = r1
        Lbe:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = tf.n.e1(r4)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
            r7 = r6
        Lcd:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto Lf1
            java.lang.Object r8 = r4.next()
            int r9 = r7 + 1
            if (r7 < 0) goto Led
            l8.b r8 = (l8.b) r8
            java.lang.String r8 = r8.f7898a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            sf.e r10 = new sf.e
            r10.<init>(r8, r7)
            r5.add(r10)
            r7 = r9
            goto Lcd
        Led:
            a.a.Q0()
            throw r3
        Lf1:
            java.util.Map r4 = tf.y.e0(r5)
            c9.z r5 = new c9.z
            r7 = 2
            r5.<init>(r4, r7)
            c9.a0 r4 = new c9.a0
            r7 = 21
            r4.<init>(r5, r7)
            java.util.ArrayList r2 = r2.y()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L10f:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L182
            java.lang.Object r7 = r2.next()
            h.Hchat.hooks.api.model.WeChatContact r7 = (h.Hchat.hooks.api.model.WeChatContact) r7
            java.lang.String r8 = r7.wxId
            java.lang.Object r8 = r0.get(r8)
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L127
            r15 = r1
            goto L128
        L127:
            r15 = r8
        L128:
            java.lang.String r8 = r7.wxId
            boolean r8 = og.m.t0(r8)
            if (r8 == 0) goto L132
            r9 = r3
            goto L17c
        L132:
            java.lang.String r10 = r7.wxId
            java.lang.String r11 = r9.e0.Z(r7, r6)
            java.lang.String r13 = r7.avatarUrl
            java.lang.String r14 = r7.avatarBackupUrl
            java.lang.String r8 = r7.remarkName
            java.lang.String r9 = r7.nickname
            java.lang.String r7 = r7.customWxId
            java.lang.String[] r7 = new java.lang.String[]{r8, r9, r7}
            java.util.List r7 = a.a.y0(r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L153:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L16a
            java.lang.Object r9 = r7.next()
            r12 = r9
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = og.m.t0(r12)
            if (r12 != 0) goto L153
            r8.add(r9)
            goto L153
        L16a:
            java.util.Set r7 = tf.m.T1(r8)
            java.util.List r17 = tf.m.P1(r7)
            wb.jv r9 = new wb.jv
            r12 = 0
            r16 = 0
            r18 = 64
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L17c:
            if (r9 == 0) goto L10f
            r5.add(r9)
            goto L10f
        L182:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r5 = r5.iterator()
        L190:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L1a9
            java.lang.Object r6 = r5.next()
            r7 = r6
            wb.jv r7 = (wb.jv) r7
            java.lang.String r7 = r7.f17140a
            boolean r7 = r0.add(r7)
            if (r7 == 0) goto L190
            r2.add(r6)
            goto L190
        L1a9:
            java.util.List r0 = tf.m.K1(r2, r4)
            if (r19 != 0) goto L1b0
            return r0
        L1b0:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r5 = r0.iterator()
        L1b9:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L1cb
            java.lang.Object r6 = r5.next()
            wb.jv r6 = (wb.jv) r6
            java.lang.String r6 = r6.f17140a
            r2.add(r6)
            goto L1b9
        L1cb:
            g8.i r5 = wb.en.c()
            if (r5 == 0) goto L37a
            i8.a r6 = h.Hchat.hooks.api.core.WeChatApis.contact()
            r6.getClass()
            g8.a r6 = h.Hchat.hooks.api.core.WeChatApis.a()
            if (r6 == 0) goto L1e3
            java.lang.String r6 = r6.c()
            goto L1e4
        L1e3:
            r6 = r3
        L1e4:
            java.lang.String r7 = ""
            if (r6 != 0) goto L1e9
            r6 = r7
        L1e9:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.ArrayList r9 = r5.x()
            java.util.Iterator r9 = r9.iterator()
        L1f6:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L259
            java.lang.Object r10 = r9.next()
            h.Hchat.hooks.api.model.WeChatContact r10 = (h.Hchat.hooks.api.model.WeChatContact) r10
            java.lang.String r11 = r10.wxId
            java.util.LinkedHashMap r11 = r5.w(r11)
            java.lang.String r10 = r10.wxId
            java.util.ArrayList r10 = r5.u(r10)
            java.util.Iterator r10 = r10.iterator()
        L212:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L1f6
            java.lang.Object r12 = r10.next()
            java.lang.String r12 = (java.lang.String) r12
            r12.getClass()
            boolean r13 = og.m.t0(r12)
            if (r13 != 0) goto L212
            boolean r13 = r12.equals(r6)
            if (r13 != 0) goto L212
            boolean r13 = r2.contains(r12)
            if (r13 == 0) goto L234
            goto L212
        L234:
            java.lang.Object r13 = r11.get(r12)
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L23d
            r13 = r7
        L23d:
            java.lang.CharSequence r13 = og.m.R0(r13)
            java.lang.String r13 = r13.toString()
            int r14 = r13.length()
            if (r14 <= 0) goto L252
            java.lang.Object r12 = r8.putIfAbsent(r12, r13)
            java.lang.String r12 = (java.lang.String) r12
            goto L212
        L252:
            java.lang.Object r12 = r8.putIfAbsent(r12, r7)
            java.lang.String r12 = (java.lang.String) r12
            goto L212
        L259:
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L261
            goto L37a
        L261:
            java.util.Set r1 = r8.keySet()
            r1.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = tf.m.P1(r1)
            java.util.ArrayList r1 = r5.q(r1)
            int r2 = tf.n.e1(r1)
            int r2 = tf.y.a0(r2)
            r5 = 16
            if (r2 >= r5) goto L27f
            r2 = r5
        L27f:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L288:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29b
            java.lang.Object r2 = r1.next()
            r6 = r2
            h.Hchat.hooks.api.model.WeChatContact r6 = (h.Hchat.hooks.api.model.WeChatContact) r6
            java.lang.String r6 = r6.wxId
            r5.put(r6, r2)
            goto L288
        L29b:
            java.util.Set r1 = r8.keySet()
            r1.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = tf.n.e1(r1)
            r2.<init>(r6)
            java.util.Iterator r1 = r1.iterator()
        L2b1:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L36f
            java.lang.Object r6 = r1.next()
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r6 = r5.get(r10)
            h.Hchat.hooks.api.model.WeChatContact r6 = (h.Hchat.hooks.api.model.WeChatContact) r6
            if (r6 == 0) goto L2c9
            java.lang.String r9 = r6.remarkName
            goto L2ca
        L2c9:
            r9 = r3
        L2ca:
            if (r6 == 0) goto L2cf
            java.lang.String r11 = r6.nickname
            goto L2d0
        L2cf:
            r11 = r3
        L2d0:
            java.lang.Object r12 = r8.get(r10)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String[] r9 = new java.lang.String[]{r9, r11, r12}
            java.util.List r9 = a.a.y0(r9)
            java.util.Iterator r9 = r9.iterator()
        L2e2:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L2f8
            java.lang.Object r11 = r9.next()
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L2e2
            boolean r12 = og.m.t0(r12)
            if (r12 == 0) goto L2f9
            goto L2e2
        L2f8:
            r11 = r3
        L2f9:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L2fe
            r11 = r7
        L2fe:
            boolean r9 = og.m.t0(r11)
            if (r9 == 0) goto L308
            r10.getClass()
            r11 = r10
        L308:
            r10.getClass()
            if (r6 == 0) goto L310
            java.lang.String r9 = r6.avatarUrl
            goto L311
        L310:
            r9 = r3
        L311:
            if (r9 != 0) goto L315
            r13 = r7
            goto L316
        L315:
            r13 = r9
        L316:
            if (r6 == 0) goto L31b
            java.lang.String r9 = r6.avatarBackupUrl
            goto L31c
        L31b:
            r9 = r3
        L31c:
            if (r9 != 0) goto L320
            r14 = r7
            goto L321
        L320:
            r14 = r9
        L321:
            if (r6 == 0) goto L32e
            java.lang.String r9 = r6.customWxId
            if (r9 == 0) goto L32e
            boolean r12 = og.m.t0(r9)
            if (r12 != 0) goto L32e
            goto L32f
        L32e:
            r9 = r3
        L32f:
            if (r6 == 0) goto L33c
            java.lang.String r6 = r6.nickname
            if (r6 == 0) goto L33c
            boolean r12 = og.m.t0(r6)
            if (r12 != 0) goto L33c
            goto L33d
        L33c:
            r6 = r3
        L33d:
            java.lang.Object r12 = r8.get(r10)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L34c
            boolean r15 = og.m.t0(r12)
            if (r15 != 0) goto L34c
            goto L34d
        L34c:
            r12 = r3
        L34d:
            java.lang.String r15 = "群成员"
            java.lang.String[] r6 = new java.lang.String[]{r9, r6, r12, r15}
            java.util.ArrayList r6 = a.a.z0(r6)
            java.util.Set r6 = tf.m.T1(r6)
            java.util.List r17 = tf.m.P1(r6)
            wb.jv r9 = new wb.jv
            r12 = 0
            r15 = 0
            r16 = 0
            r18 = 96
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2.add(r9)
            goto L2b1
        L36f:
            a9.h r1 = new a9.h
            r3 = 20
            r1.<init>(r3)
            java.util.List r1 = tf.m.K1(r2, r1)
        L37a:
            java.util.ArrayList r0 = tf.m.F1(r0, r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L38c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3a5
            java.lang.Object r3 = r0.next()
            r5 = r3
            wb.jv r5 = (wb.jv) r5
            java.lang.String r5 = r5.f17140a
            boolean r5 = r1.add(r5)
            if (r5 == 0) goto L38c
            r2.add(r3)
            goto L38c
        L3a5:
            java.util.List r0 = tf.m.K1(r2, r4)
            return r0
        L3aa:
            return r1
    }

    public static java.util.List K(java.util.Collection r2, java.util.function.Function r3) {
            if (r2 == 0) goto L29
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            goto L29
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L16:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.apply(r1)
            r0.add(r1)
            goto L16
        L28:
            return r0
        L29:
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            return r2
    }

    public static java.lang.String L(java.lang.String r3) {
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "￥"
            java.lang.String r1 = ""
            r2 = 0
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "¥"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "元"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = ","
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            boolean r0 = og.m.t0(r3)
            if (r0 == 0) goto L32
            goto L45
        L32:
            java.lang.String r0 = "[0-9]+(?:\\.[0-9]{0,2})?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L47
        L45:
            r3 = 0
            return r3
        L47:
            java.lang.String r0 = "."
            java.lang.String r3 = og.m.B0(r3, r0)
            return r3
    }

    public static void M(ac.o r4, ac.k r5, byte r6, java.lang.String r7, int r8) {
            java.util.HashMap r4 = r4.f196f
            r0 = 1
            if (r6 == r0) goto L5e
            r0 = 2
            if (r6 == r0) goto L51
            r0 = 3
            if (r6 == r0) goto L40
            r0 = 4
            if (r6 == r0) goto L2b
            ac.d r6 = new ac.d
            int r0 = r5.f177h
            long r0 = r5.r(r0)
            int r2 = r5.f177h
            int r2 = r2 + 8
            r5.f177h = r2
            double r0 = java.lang.Double.longBitsToDouble(r0)
            r6.<init>()
            r6.f166a = r8
            r6.f168b = r0
            r4.put(r7, r6)
            return
        L2b:
            ac.g r6 = new ac.g
            int r0 = r5.f177h
            long r0 = r5.r(r0)
            int r2 = r5.f177h
            int r2 = r2 + 8
            r5.f177h = r2
            r6.<init>(r8, r0)
            r4.put(r7, r6)
            return
        L40:
            ac.e r6 = new ac.e
            int r5 = r5.q()
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r6.<init>(r8, r5)
            r4.put(r7, r6)
            return
        L51:
            ac.f r6 = new ac.f
            int r5 = r5.q()
            r6.<init>(r8, r5)
            r4.put(r7, r6)
            return
        L5e:
            ac.c r6 = new ac.c
            java.lang.Object r1 = r5.f179j
            byte[] r1 = (byte[]) r1
            int r2 = r5.f177h
            int r3 = r2 + 1
            r5.f177h = r3
            r5 = r1[r2]
            if (r5 != r0) goto L6f
            goto L70
        L6f:
            r0 = 0
        L70:
            r6.<init>(r8, r0)
            r4.put(r7, r6)
            return
    }

    public static void N(ac.o r13, ac.k r14, byte r15, java.lang.String r16, int r17, int r18, byte r19) {
            r0 = r15
            r1 = r16
            java.util.HashMap r2 = r13.f196f
            r3 = 9
            r4 = 1
            r5 = 0
            if (r0 == r3) goto L16
            r3 = 10
            if (r0 == r3) goto L16
            r3 = 11
            if (r0 != r3) goto L14
            goto L16
        L14:
            r3 = r5
            goto L17
        L16:
            r3 = r4
        L17:
            if (r3 == 0) goto L1f
            int r6 = r14.q()
        L1d:
            r11 = r6
            goto L28
        L1f:
            short r6 = r14.u()
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            goto L1d
        L28:
            if (r3 == 0) goto L2c
            r3 = 4
            goto L2d
        L2c:
            r3 = 2
        L2d:
            r6 = r19 & 64
            if (r6 == 0) goto L33
            r12 = r4
            goto L34
        L33:
            r12 = r5
        L34:
            if (r12 == 0) goto L41
            r6 = 32
            if (r11 != r6) goto L3b
            goto L41
        L3b:
            java.lang.String r13 = "name size not match"
            j8.o.A(r13)
            return
        L41:
            r6 = 6
            r7 = 7
            switch(r0) {
                case 9: goto L4c;
                case 10: goto L4a;
                case 11: goto L47;
                default: goto L46;
            }
        L46:
            goto L4d
        L47:
            r0 = 8
            goto L4d
        L4a:
            r0 = r7
            goto L4d
        L4c:
            r0 = r6
        L4d:
            if (r0 == r6) goto Lf6
            if (r0 == r7) goto Lcd
            if (r12 == 0) goto L65
            java.lang.String r10 = r14.w(r11)
            ac.h r7 = new ac.h
            int r9 = r17 + r3
            r12 = 1
            r8 = r18
            r7.<init>(r8, r9, r10, r11, r12)
            r2.put(r1, r7)
            return
        L65:
            ac.k r0 = r13.f198h
            java.lang.Object r5 = r0.f179j
            byte[] r5 = (byte[]) r5
            int r6 = r0.f177h
            int r7 = r6 + 1
            r0.f177h = r7
            r5 = r5[r6]
            r5 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r6 = r0.w(r5)
            java.util.HashMap r7 = r13.f193c
            java.lang.Object r7 = r7.get(r6)
            ac.s r7 = (ac.s) r7
            int r5 = r5 + r4
            int r4 = r11 - r5
            if (r4 < 0) goto Lc5
            if (r7 == 0) goto La9
            java.lang.Object r5 = r0.f179j     // Catch: java.lang.Exception -> La0
            byte[] r5 = (byte[]) r5     // Catch: java.lang.Exception -> La0
            int r0 = r0.f177h     // Catch: java.lang.Exception -> La0
            java.util.LinkedHashSet r10 = ac.s.a(r5, r0, r4)     // Catch: java.lang.Exception -> La0
            ac.h r7 = new ac.h     // Catch: java.lang.Exception -> La0
            int r9 = r17 + 2
            r12 = 0
            r8 = r18
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> La0
            r2.put(r1, r7)     // Catch: java.lang.Exception -> La0
            goto Lbf
        La0:
            r0 = move-exception
            java.lang.String r1 = "FastKV"
            java.lang.String r13 = r13.f192b
            android.util.Log.e(r1, r13, r0)
            goto Lbf
        La9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "object with tag: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = " without encoder"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            g4.a.m(r13, r0)
        Lbf:
            int r13 = r17 + r3
            int r13 = r13 + r11
            r14.f177h = r13
            return
        Lc5:
            java.lang.Exception r13 = new java.lang.Exception
            java.lang.String r0 = "parse dara failed"
            r13.<init>(r0)
            throw r13
        Lcd:
            if (r12 == 0) goto Ld5
            java.lang.String r13 = r14.w(r11)
        Ld3:
            r10 = r13
            goto Le9
        Ld5:
            r14.getClass()
            byte[] r13 = new byte[r11]
            java.lang.Object r0 = r14.f179j
            byte[] r0 = (byte[]) r0
            int r4 = r14.f177h
            java.lang.System.arraycopy(r0, r4, r13, r5, r11)
            int r0 = r14.f177h
            int r0 = r0 + r11
            r14.f177h = r0
            goto Ld3
        Le9:
            ac.a r7 = new ac.a
            int r9 = r17 + r3
            r8 = r18
            r7.<init>(r8, r9, r10, r11, r12)
            r2.put(r1, r7)
            return
        Lf6:
            if (r12 == 0) goto Lfe
            java.lang.String r13 = r14.w(r11)
        Lfc:
            r10 = r13
            goto L103
        Lfe:
            java.lang.String r13 = r14.w(r11)
            goto Lfc
        L103:
            ac.i r7 = new ac.i
            int r9 = r17 + r3
            r8 = r18
            r7.<init>(r8, r9, r10, r11, r12)
            r2.put(r1, r7)
            return
    }

    public static boolean O(ac.o r11, boolean r12) {
            java.lang.String r1 = "FastKV"
            r2 = 0
            if (r12 == 0) goto Lb
            java.lang.String r12 = "miss cipher"
            g4.a.m(r11, r12)
            return r2
        Lb:
            ac.k r4 = r11.f198h
            java.lang.String r12 = r11.f192b
            r0 = 12
            r4.f177h = r0
        L13:
            int r8 = r4.f177h     // Catch: java.lang.Exception -> L46
            int r0 = r11.f194d     // Catch: java.lang.Exception -> L46
            java.lang.String r3 = "parse dara failed"
            r5 = 1
            if (r8 >= r0) goto La4
            java.lang.Object r0 = r4.f179j     // Catch: java.lang.Exception -> L46
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Exception -> L46
            int r6 = r8 + 1
            r4.f177h = r6     // Catch: java.lang.Exception -> L46
            r9 = r0[r8]     // Catch: java.lang.Exception -> L46
            r7 = r9 & 63
            byte r7 = (byte) r7     // Catch: java.lang.Exception -> L46
            if (r7 < r5) goto L9e
            r10 = 11
            if (r7 > r10) goto L9e
            int r3 = r8 + 2
            r4.f177h = r3     // Catch: java.lang.Exception -> L46
            r0 = r0[r6]     // Catch: java.lang.Exception -> L46
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L96
            r6 = 5
            if (r9 >= 0) goto L80
            int r3 = r3 + r0
            r4.f177h = r3     // Catch: java.lang.Exception -> L46
            if (r7 > r6) goto L4a
            int[] r0 = ac.o.f190z     // Catch: java.lang.Exception -> L46
            r0 = r0[r7]     // Catch: java.lang.Exception -> L46
            goto L65
        L46:
            r0 = move-exception
            r11 = r0
            goto Lb0
        L4a:
            r0 = 9
            if (r7 == r0) goto L56
            r0 = 10
            if (r7 == r0) goto L56
            if (r7 != r10) goto L55
            goto L56
        L55:
            r5 = r2
        L56:
            if (r5 == 0) goto L5d
            int r0 = r4.q()     // Catch: java.lang.Exception -> L46
            goto L65
        L5d:
            short r0 = r4.u()     // Catch: java.lang.Exception -> L46
            r3 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r3
        L65:
            int r3 = r4.f177h     // Catch: java.lang.Exception -> L46
            int r3 = r3 + r0
            r4.f177h = r3     // Catch: java.lang.Exception -> L46
            int r0 = r11.f204n     // Catch: java.lang.Exception -> L46
            int r5 = r3 - r8
            int r5 = r5 + r0
            r11.f204n = r5     // Catch: java.lang.Exception -> L46
            java.util.ArrayList r0 = r11.f205o     // Catch: java.lang.Exception -> L46
            ac.r r5 = new ac.r     // Catch: java.lang.Exception -> L46
            r5.<init>()     // Catch: java.lang.Exception -> L46
            r5.f219g = r8     // Catch: java.lang.Exception -> L46
            r5.f220h = r3     // Catch: java.lang.Exception -> L46
            r0.add(r5)     // Catch: java.lang.Exception -> L46
            goto L13
        L80:
            java.lang.String r0 = r4.w(r0)     // Catch: java.lang.Exception -> L46
            r5 = r7
            int r7 = r4.f177h     // Catch: java.lang.Exception -> L46
            if (r5 > r6) goto L8e
            M(r11, r4, r5, r0, r7)     // Catch: java.lang.Exception -> L46
            r3 = r11
            goto L93
        L8e:
            r3 = r11
            r6 = r0
            N(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L46
        L93:
            r11 = r3
            goto L13
        L96:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L46
            java.lang.String r0 = "invalid key size"
            r11.<init>(r0)     // Catch: java.lang.Exception -> L46
            throw r11     // Catch: java.lang.Exception -> L46
        L9e:
            java.lang.Exception r11 = new java.lang.Exception     // Catch: java.lang.Exception -> L46
            r11.<init>(r3)     // Catch: java.lang.Exception -> L46
            throw r11     // Catch: java.lang.Exception -> L46
        La4:
            if (r8 == r0) goto Laf
            java.lang.Exception r11 = new java.lang.Exception
            r11.<init>(r3)
            android.util.Log.e(r1, r12, r11)
            return r2
        Laf:
            return r5
        Lb0:
            android.util.Log.e(r1, r12, r11)
            return r2
    }

    public static final void P(l0.k r2, i0.a r3, int r4) {
        L0:
            int r0 = r2.f7715v
            if (r4 <= r0) goto L8
            int r1 = r2.f7714u
            if (r4 < r1) goto Lc
        L8:
            if (r0 != 0) goto Ld
            if (r4 != 0) goto Ld
        Lc:
            return
        Ld:
            r2.M()
            int r0 = r2.f7715v
            boolean r0 = r2.y(r0)
            if (r0 == 0) goto L1b
            r3.k()
        L1b:
            r2.j()
            goto L0
    }

    public static java.lang.String Q(java.lang.String r2) {
            java.lang.String r0 = "title"
            java.lang.String r0 = p0(r2, r0)
            java.lang.String r2 = R(r2)
            boolean r1 = og.m.t0(r2)
            if (r1 == 0) goto L11
            return r0
        L11:
            java.lang.String r1 = "\n\n引用："
            java.lang.String r2 = wb.en.h(r0, r1, r2)
            return r2
    }

    public static java.lang.String R(java.lang.String r5) {
            java.lang.String r0 = o0(r5)
            java.lang.String r1 = n0(r0)
            java.lang.String r2 = "type"
            java.lang.String r2 = p0(r0, r2)
            java.lang.String r3 = "49"
            boolean r3 = r2.equals(r3)
            java.lang.String r4 = "title"
            if (r3 != 0) goto L20
            java.lang.String r3 = "57"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2f
        L20:
            java.lang.String r2 = e0(r1)
            java.lang.String r2 = p0(r2, r4)
            boolean r3 = og.m.t0(r2)
            if (r3 != 0) goto L2f
            return r2
        L2f:
            java.lang.String r1 = e0(r1)
            java.lang.String r0 = p0(r0, r4)
            java.lang.String r2 = "refermsg"
            java.lang.String r5 = p0(r5, r2)
            java.lang.String[] r5 = new java.lang.String[]{r1, r0, r5}
            java.lang.String r5 = x(r5)
            return r5
    }

    public static java.util.HashMap S(java.io.InputStream r4) {
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L40
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L40
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L40
            r1.<init>(r4, r2)     // Catch: java.lang.Exception -> L40
            r0.<init>(r1)     // Catch: java.lang.Exception -> L40
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L36
            r4.<init>()     // Catch: java.lang.Throwable -> L36
        L11:
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L1b
            r0.close()     // Catch: java.lang.Exception -> L40
            return r4
        L1b:
            r2 = 0
            r3 = 8
            java.lang.String r2 = r1.substring(r2, r3)     // Catch: java.lang.Throwable -> L36
            r3 = 16
            int r2 = java.lang.Integer.parseInt(r2, r3)     // Catch: java.lang.Throwable -> L36
            r3 = 9
            java.lang.String r1 = r1.substring(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L36
            r4.put(r2, r1)     // Catch: java.lang.Throwable -> L36
            goto L11
        L36:
            r4 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Exception -> L40
        L3f:
            throw r4     // Catch: java.lang.Exception -> L40
        L40:
            r4 = move-exception
            af.g r0 = new af.g
            java.lang.String r1 = "Failed to read res-map file"
            r0.<init>(r1, r4)
            throw r0
    }

    public static m3.b T(java.nio.MappedByteBuffer r13) {
            java.nio.ByteBuffer r13 = r13.duplicate()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r13.order(r0)
            int r0 = r13.position()
            int r0 = r0 + 4
            r13.position(r0)
            short r0 = r13.getShort()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 100
            java.lang.String r2 = "Cannot read metadata."
            if (r0 > r1) goto Lcd
            int r1 = r13.position()
            int r1 = r1 + 6
            r13.position(r1)
            r1 = 0
            r3 = r1
        L2b:
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r6 = -1
            if (r3 >= r0) goto L59
            int r8 = r13.getInt()
            int r9 = r13.position()
            int r9 = r9 + 4
            r13.position(r9)
            int r9 = r13.getInt()
            long r9 = (long) r9
            long r9 = r9 & r4
            int r11 = r13.position()
            int r11 = r11 + 4
            r13.position(r11)
            r11 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r11 != r8) goto L56
            goto L5a
        L56:
            int r3 = r3 + 1
            goto L2b
        L59:
            r9 = r6
        L5a:
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 == 0) goto Lc8
            int r0 = r13.position()
            long r6 = (long) r0
            long r6 = r9 - r6
            int r0 = (int) r6
            int r3 = r13.position()
            int r3 = r3 + r0
            r13.position(r3)
            int r0 = r13.position()
            int r0 = r0 + 12
            r13.position(r0)
            int r0 = r13.getInt()
            long r6 = (long) r0
            long r6 = r6 & r4
        L7d:
            long r11 = (long) r1
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r0 >= 0) goto Lc8
            int r0 = r13.getInt()
            int r3 = r13.getInt()
            long r11 = (long) r3
            long r11 = r11 & r4
            r13.getInt()
            r3 = 1164798569(0x456d6a69, float:3798.6506)
            if (r3 == r0) goto L9d
            r3 = 1701669481(0x656d6a69, float:7.0072736E22)
            if (r3 != r0) goto L9a
            goto L9d
        L9a:
            int r1 = r1 + 1
            goto L7d
        L9d:
            long r11 = r11 + r9
            int r0 = (int) r11
            r13.position(r0)
            m3.b r0 = new m3.b
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r1 = j8.b.d(r13, r1)
            int r2 = r13.position()
            int r2 = r2 + r1
            r0.f8716j = r13
            r0.f8713g = r2
            int r13 = r13.getInt(r2)
            int r2 = r2 - r13
            r0.f8714h = r2
            java.lang.Object r13 = r0.f8716j
            java.nio.ByteBuffer r13 = (java.nio.ByteBuffer) r13
            short r13 = r13.getShort(r2)
            r0.f8715i = r13
            return r0
        Lc8:
            j8.o.y(r2)
        Lcb:
            r13 = 0
            return r13
        Lcd:
            j8.o.y(r2)
            goto Lcb
    }

    public static java.lang.Object U(java.util.List r1) {
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.remove(r0)
            return r1
    }

    public static java.lang.String V(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            boolean r0 = og.m.t0(r6)
            if (r0 == 0) goto L8
            goto L8c
        L8:
            java.lang.String r0 = "<"
            java.lang.String r1 = "(?:\\s[^>]*)?>(.*?)</"
            java.lang.String r2 = ">"
            java.lang.String r0 = bc.e.k(r0, r7, r1, r7, r2)
            og.l r1 = og.l.f9834h
            og.l r3 = og.l.f9835i
            og.l[] r1 = new og.l[]{r1, r3}
            java.util.Set r1 = tf.d0.W(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
            r4 = r3
        L26:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L36
            java.lang.Object r5 = r1.next()
            og.l r5 = (og.l) r5
            int r5 = r5.f9837g
            r4 = r4 | r5
            goto L26
        L36:
            int r1 = l3.w.f(r4)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            r0.getClass()
            java.util.regex.Matcher r0 = r0.matcher(r6)
            r0.getClass()
            og.i r0 = a7.a.b(r0, r3, r6)
            if (r0 == 0) goto L8c
            java.lang.String r1 = r0.c()
            r4 = 62
            r5 = 6
            int r4 = og.m.q0(r1, r4, r3, r5)
            int r4 = r4 + 1
            java.lang.String r1 = r1.substring(r3, r4)
            java.lang.String r3 = "</"
            java.lang.String r7 = eh.a.n(r3, r7, r2)
            lg.d r0 = r0.b()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r8)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r0.getClass()
            int r8 = r0.f8042g
            int r0 = r0.f8043h
            int r0 = r0 + 1
            java.lang.StringBuilder r6 = og.m.C0(r6, r8, r0, r7)
            java.lang.String r6 = r6.toString()
        L8c:
            return r6
    }

    public static java.lang.String W(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            boolean r0 = og.m.t0(r4)
            if (r0 == 0) goto L7
            return r4
        L7:
            og.k r0 = new og.k
            java.lang.String r1 = "(?:\\s[^>]*)?>(.*?)</"
            java.lang.String r2 = ">"
            java.lang.String r3 = "<"
            java.lang.String r1 = bc.e.k(r3, r5, r1, r5, r2)
            og.l r2 = og.l.f9834h
            og.l r3 = og.l.f9835i
            og.l[] r2 = new og.l[]{r2, r3}
            java.util.Set r2 = tf.d0.W(r2)
            r0.<init>(r1, r2)
            eb.g r1 = new eb.g
            r2 = 8
            r1.<init>(r2, r6, r5)
            java.lang.String r4 = r0.e(r4, r1)
            return r4
    }

    public static final b.e X(java.lang.Object r11, java.lang.reflect.Method r12, fg.p r13) {
            r12.getClass()
            r13.getClass()
            java.lang.Class r0 = r12.getDeclaringClass()
            r0.getClass()
            r1 = 0
            if (r11 != 0) goto L13
        L10:
            r4 = r1
            goto Lc5
        L13:
            java.util.IdentityHashMap r2 = new java.util.IdentityHashMap
            r2.<init>()
            java.util.Set r2 = java.util.Collections.newSetFromMap(r2)
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r3.<init>()
            r2.add(r11)
            k8.c r4 = new k8.c
            r5 = 0
            r4.<init>(r11, r5)
            r3.add(r4)
        L2d:
            boolean r11 = r3.isEmpty()
            if (r11 != 0) goto L10
            java.lang.Object r11 = r3.removeFirst()
            k8.c r11 = (k8.c) r11
            java.lang.Object r4 = r11.f7396a
            int r11 = r11.f7397b
            boolean r6 = r0.isInstance(r4)
            if (r6 == 0) goto L45
            goto Lc5
        L45:
            r6 = 4
            if (r11 < r6) goto L49
            goto L2d
        L49:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Class r7 = r4.getClass()
        L52:
            if (r7 == 0) goto La6
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto La6
            java.util.List r8 = h.Hchat.utils.KavaReflector.declaredFields(r7)
            java.util.Iterator r8 = r8.iterator()
        L64:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto La1
            java.lang.Object r9 = r8.next()
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            int r10 = r9.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isStatic(r10)
            if (r10 != 0) goto L64
            java.lang.Class r10 = r9.getType()
            boolean r10 = r10.isPrimitive()
            if (r10 != 0) goto L64
            java.lang.Class r10 = r9.getType()
            boolean r10 = r10.isArray()
            if (r10 == 0) goto L8f
            goto L64
        L8f:
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.readField(r9, r4)
            if (r9 == 0) goto L64
            java.lang.String r10 = "com.tencent.mm.ui.chatting.component."
            boolean r10 = eh.a.z(r10, r9, r5)
            if (r10 == 0) goto L64
            r6.add(r9)
            goto L64
        La1:
            java.lang.Class r7 = r7.getSuperclass()
            goto L52
        La6:
            java.util.Iterator r4 = r6.iterator()
        Laa:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L2d
            java.lang.Object r6 = r4.next()
            boolean r7 = r2.add(r6)
            if (r7 == 0) goto Laa
            k8.c r7 = new k8.c
            int r8 = r11 + 1
            r7.<init>(r6, r8)
            r3.add(r7)
            goto Laa
        Lc5:
            if (r4 != 0) goto Ld9
            java.lang.Class r11 = r12.getDeclaringClass()
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = "未找到多选消息原生退出组件: "
            java.lang.String r11 = r12.concat(r11)
            r13.invoke(r11, r1)
            return r1
        Ld9:
            b.e r11 = new b.e
            r11.<init>(r4, r12)
            return r11
    }

    public static java.util.List Y(java.util.List r1, nd.b0 r2) {
            if (r1 == 0) goto Ld
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9
            goto Ld
        L9:
            r1.add(r2)
            return r1
        Ld:
            java.util.ArrayList r1 = new java.util.ArrayList
            r0 = 1
            r1.<init>(r0)
            r1.add(r2)
            return r1
    }

    public static java.util.List Z(java.util.List r1, java.lang.Object r2, java.lang.Object r3) {
            if (r1 == 0) goto L18
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9
            goto L18
        L9:
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L14
            r1.set(r2, r3)
            return r1
        L14:
            r1.add(r3)
            return r1
        L18:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 1
            r1.<init>(r2)
            r1.add(r3)
            return r1
    }

    public static final u2.e a(android.content.Context r3) {
            android.content.res.Resources r0 = r3.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r0 = r0.fontScale
            u2.e r1 = new u2.e
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            v2.a r2 = v2.b.a(r0)
            if (r2 != 0) goto L21
            u2.n r2 = new u2.n
            r2.<init>(r0)
        L21:
            r1.<init>(r3, r0, r2)
            return r1
    }

    public static void a0(h.Hchat.hooks.api.model.WeChatMessage r5, java.lang.String r6) {
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = h.Hchat.hooks.api.core.WeChatApis.database()
            if (r0 == 0) goto L5a
            i8.c r1 = h.Hchat.hooks.api.core.WeChatApis.message()
            if (r1 == 0) goto L19
            k8.s r1 = h.Hchat.hooks.api.core.WeChatApis.m()
            if (r1 == 0) goto L19
            java.lang.String r2 = r5.talker
            h.Hchat.hooks.api.model.WeChatMessage r1 = r1.b(r2)
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 == 0) goto L5a
            long r1 = r1.msgId
            long r3 = r5.msgId
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L5a
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.String r2 = "content"
            r1.put(r2, r6)
            int r2 = r5.type
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "msgType"
            r1.put(r3, r2)
            int r2 = r5.isSend
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "isSend"
            r1.put(r3, r2)
            java.lang.String r2 = "digest"
            java.lang.String r6 = s(r5, r6)
            r1.put(r2, r6)
            java.lang.String r5 = r5.talker
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r6 = "rconversation"
            java.lang.String r2 = "username=?"
            r0.update(r6, r1, r2, r5)
        L5a:
            return
    }

    public static final e1.d b(float r17, float r18, float r19, float r20, long r21) {
            r0 = 32
            long r1 = r21 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r21 & r2
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r5 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r4)
            long r7 = (long) r1
            long r0 = r5 << r0
            long r2 = r2 & r7
            long r9 = r0 | r2
            e1.d r4 = new e1.d
            r11 = r9
            r13 = r9
            r15 = r9
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r4.<init>(r5, r6, r7, r8, r9, r11, r13, r15)
            return r4
    }

    public static java.util.List b0(java.util.Iterator r3) {
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L9
            z7.i r3 = z7.i.f22607g
            return r3
        L9:
            z7.c r1 = new z7.c
            r2 = 2
            r1.<init>(r2)
        Lf:
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r3.next()
            r1.add(r0)
            boolean r0 = r3.hasNext()
            goto Lf
        L1d:
            int r3 = r1.f22586i
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 <= r0) goto L26
            r1.m()
        L26:
            return r1
    }

    public static final void c(y0.o r7, s0.d r8, i0.h0 r9, int r10) {
            r0 = -1854833411(0xffffffff91717cfd, float:-1.9050063E-28)
            r9.b0(r0)
            boolean r0 = r9.f(r7)
            if (r0 == 0) goto Le
            r0 = 4
            goto Lf
        Le:
            r0 = 2
        Lf:
            r0 = r0 | r10
            r1 = r0 & 19
            r2 = 18
            r3 = 1
            if (r1 == r2) goto L19
            r1 = r3
            goto L1a
        L19:
            r1 = 0
        L1a:
            r0 = r0 & r3
            boolean r0 = r9.S(r0, r1)
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r9.P()
            i0.e r1 = i0.l.f5952a
            if (r0 != r1) goto L2e
            h0.p0 r0 = h0.p0.f4968a
            r9.k0(r0)
        L2e:
            v1.n0 r0 = (v1.n0) r0
            long r1 = r9.T
            int r1 = java.lang.Long.hashCode(r1)
            s0.h r2 = r9.l()
            y0.o r4 = y0.a.c(r9, r7)
            x1.f r5 = x1.g.f20914f
            r5.getClass()
            x1.y r5 = x1.f.f20883b
            r9.d0()
            boolean r6 = r9.S
            if (r6 == 0) goto L50
            r9.k(r5)
            goto L53
        L50:
            r9.n0()
        L53:
            x1.e r5 = x1.f.f20886e
            i0.r.A(r5, r9, r0)
            x1.e r0 = x1.f.f20885d
            i0.r.A(r0, r9, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            x1.e r1 = x1.f.f20887f
            i0.r.A(r1, r9, r0)
            x1.d r0 = x1.f.f20888g
            i0.r.w(r0, r9)
            x1.e r0 = x1.f.f20884c
            i0.r.A(r0, r9, r4)
            r0 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.invoke(r9, r0)
            r9.p(r3)
            goto L7f
        L7c:
            r9.V()
        L7f:
            i0.r1 r9 = r9.t()
            if (r9 == 0) goto L8d
            b0.q r0 = new b0.q
            r1 = 5
            r0.<init>(r7, r8, r10, r1)
            r9.f6035d = r0
        L8d:
            return
    }

    public static java.lang.String c0(java.lang.String r7) {
            java.lang.String r0 = "payerdes"
            java.lang.String r1 = "receiverdes"
            java.lang.String r2 = "feedesc"
            java.lang.String r3 = "title"
            java.lang.String r4 = "desc"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            java.util.List r0 = a.a.y0(r0)
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            r5 = 0
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = p0(r7, r1)
            java.lang.String r1 = j(r1)
            if (r1 == 0) goto L16
            goto L2f
        L2e:
            r1 = r5
        L2f:
            if (r1 == 0) goto L32
            return r1
        L32:
            java.lang.String r0 = "total_fee"
            java.lang.String r0 = p0(r7, r0)
            java.lang.String r1 = "feederval"
            java.lang.String r1 = p0(r7, r1)
            java.lang.String r6 = "fee"
            java.lang.String r6 = p0(r7, r6)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r6}
            java.lang.String r0 = x(r0)
            java.lang.Long r0 = og.t.g0(r0)
            if (r0 == 0) goto L57
            long r0 = r0.longValue()
            goto L7b
        L57:
            java.lang.String r0 = p0(r7, r2)
            java.lang.String r1 = p0(r7, r3)
            java.lang.String r7 = p0(r7, r4)
            java.lang.String[] r7 = new java.lang.String[]{r0, r1, r7}
            java.lang.String r7 = x(r7)
            java.lang.String r7 = j(r7)
            if (r7 == 0) goto L75
            java.lang.Long r5 = i(r7)
        L75:
            if (r5 == 0) goto La0
            long r0 = r5.longValue()
        L7b:
            java.math.BigDecimal r7 = new java.math.BigDecimal
            r7.<init>(r0)
            r0 = 2
            java.math.BigDecimal r7 = r7.movePointLeft(r0)
            int r0 = r7.signum()
            if (r0 != 0) goto L94
            java.math.BigDecimal r7 = new java.math.BigDecimal
            java.math.BigInteger r0 = java.math.BigInteger.ZERO
            r1 = 0
            r7.<init>(r0, r1)
            goto L98
        L94:
            java.math.BigDecimal r7 = r7.stripTrailingZeros()
        L98:
            java.lang.String r7 = r7.toPlainString()
            r7.getClass()
            return r7
        La0:
            java.lang.String r7 = ""
            return r7
    }

    public static final java.lang.Object[] d(int r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object[] r6) {
            int r0 = r6.length
            int r0 = r0 + 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 6
            tf.l.r0(r1, r3, r6, r2, r0)
            int r1 = r3 + 2
            int r2 = r6.length
            tf.l.n0(r1, r3, r6, r2, r0)
            r0[r3] = r4
            int r3 = r3 + 1
            r0[r3] = r5
            return r0
    }

    public static java.lang.String d0(java.lang.String r4) {
            java.lang.String r0 = c0(r4)
            java.lang.String r1 = "feedesc"
            java.lang.String r1 = p0(r4, r1)
            java.lang.String r2 = "title"
            java.lang.String r2 = p0(r4, r2)
            java.lang.String r3 = "desc"
            java.lang.String r4 = p0(r4, r3)
            java.lang.String[] r4 = new java.lang.String[]{r1, r2, r4}
            java.lang.String r4 = x(r4)
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L25
            return r4
        L25:
            java.lang.String r4 = "￥"
            java.lang.String r4 = r4.concat(r0)
            return r4
    }

    public static final java.lang.Object[] e(int r3, java.lang.Object[] r4) {
            int r0 = r4.length
            int r0 = r0 + (-2)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 6
            tf.l.r0(r1, r3, r4, r2, r0)
            int r1 = r3 + 2
            int r2 = r4.length
            tf.l.n0(r3, r1, r4, r2, r0)
            return r0
    }

    public static java.lang.String e0(java.lang.String r3) {
            java.lang.String r0 = "&lt;"
            java.lang.String r1 = "<"
            r2 = 0
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "&gt;"
            java.lang.String r1 = ">"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "&amp;"
            java.lang.String r1 = "&"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "&quot;"
            java.lang.String r1 = "\""
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "&apos;"
            java.lang.String r1 = "'"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            return r3
    }

    public static final java.lang.Object[] f(int r3, java.lang.Object[] r4) {
            int r0 = r4.length
            int r0 = r0 + (-1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 6
            tf.l.r0(r1, r3, r4, r2, r0)
            int r1 = r3 + 1
            int r2 = r4.length
            tf.l.n0(r3, r1, r4, r2, r0)
            return r0
    }

    public static f9.f f0(h.Hchat.hooks.api.model.WeChatMessage r6, java.lang.String r7, java.lang.Object r8) {
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = h.Hchat.hooks.api.core.WeChatApis.database()
            r1 = 0
            if (r0 == 0) goto L74
            long r2 = r6.msgId
            boolean r8 = r0.updateNativeMessageContent(r2, r7, r8)
            r2 = 1
            if (r8 == 0) goto L16
            f9.f r6 = new f9.f
            r6.<init>(r2, r2)
            return r6
        L16:
            android.content.ContentValues r8 = new android.content.ContentValues
            r8.<init>()
            java.lang.String r3 = "content"
            r8.put(r3, r7)
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            java.lang.String r3 = r6.talker
            java.lang.String r3 = r0.messageTableForTalker(r3)
            r3.getClass()
            boolean r4 = og.m.t0(r3)
            if (r4 != 0) goto L35
            goto L36
        L35:
            r3 = 0
        L36:
            if (r3 == 0) goto L3b
            r7.add(r3)
        L3b:
            java.lang.String r3 = "message"
            r7.add(r3)
            java.util.Iterator r7 = r7.iterator()
            r7.getClass()
        L47:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r7.next()
            r3.getClass()
            java.lang.String r3 = (java.lang.String) r3
            long r4 = r6.msgId
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.String r5 = "msgId=?"
            int r3 = r0.update(r3, r8, r5, r4)
            if (r3 <= 0) goto L47
            f9.f r6 = new f9.f
            r6.<init>(r2, r1)
            return r6
        L6e:
            f9.f r6 = new f9.f
            r6.<init>(r1, r1)
            return r6
        L74:
            f9.f r6 = new f9.f
            r6.<init>(r1, r1)
            return r6
    }

    public static boolean g(java.util.Collection r1, java.util.function.Predicate r2) {
            if (r1 == 0) goto L20
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9
            goto L20
        L9:
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r1.next()
            boolean r0 = r2.test(r0)
            if (r0 != 0) goto Ld
            goto L20
        L1e:
            r1 = 1
            return r1
        L20:
            r1 = 0
            return r1
    }

    public static java.lang.String g0(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            java.lang.String r8 = u(r8)
            java.lang.String r0 = "title"
            java.lang.String r7 = V(r7, r0, r8)
            java.lang.String r8 = o0(r7)
            boolean r1 = og.m.t0(r8)
            if (r1 != 0) goto L9b
            boolean r1 = og.m.t0(r9)
            if (r1 != 0) goto L9b
            java.lang.String r1 = n0(r8)
            boolean r2 = og.m.t0(r1)
            if (r2 == 0) goto L26
            r1 = r8
            goto L88
        L26:
            java.lang.String r2 = u(r9)
            java.lang.String r3 = "&lt;title&gt;"
            r4 = 1
            boolean r3 = og.m.h0(r1, r3, r4)
            og.l r5 = og.l.f9835i
            og.l r6 = og.l.f9834h
            if (r3 == 0) goto L59
            java.lang.String r3 = "&lt;/title&gt;"
            boolean r3 = og.m.h0(r1, r3, r4)
            if (r3 == 0) goto L59
            og.k r3 = new og.k
            og.l[] r4 = new og.l[]{r6, r5}
            java.util.Set r4 = tf.d0.W(r4)
            java.lang.String r5 = "&lt;title&gt;.*?&lt;/title&gt;"
            r3.<init>(r5, r4)
            ca.s r4 = new ca.s
            r5 = 3
            r4.<init>(r2, r5)
            java.lang.String r2 = r3.e(r1, r4)
            goto L82
        L59:
            java.lang.String r3 = "<title>"
            boolean r3 = og.m.h0(r1, r3, r4)
            if (r3 == 0) goto L82
            java.lang.String r3 = "</title>"
            boolean r3 = og.m.h0(r1, r3, r4)
            if (r3 == 0) goto L82
            og.k r3 = new og.k
            og.l[] r4 = new og.l[]{r6, r5}
            java.util.Set r4 = tf.d0.W(r4)
            java.lang.String r5 = "<title>.*?</title>"
            r3.<init>(r5, r4)
            ca.s r4 = new ca.s
            r5 = 4
            r4.<init>(r2, r5)
            java.lang.String r2 = r3.e(r1, r4)
        L82:
            java.lang.String r1 = "content"
            java.lang.String r1 = V(r8, r1, r2)
        L88:
            java.lang.String r9 = u(r9)
            java.lang.String r9 = V(r1, r0, r9)
            boolean r0 = r9.equals(r8)
            if (r0 != 0) goto L9b
            r0 = 0
            java.lang.String r7 = og.t.a0(r7, r8, r9, r0)
        L9b:
            return r7
    }

    public static java.lang.String h(java.lang.String r3) {
            java.lang.String r3 = L(r3)
            r0 = 0
            if (r3 == 0) goto L50
            java.lang.String r1 = ""
            r2 = 46
            java.lang.String r1 = og.m.J0(r3, r2, r1)
            int r1 = r1.length()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r2 = og.m.i0(r3, r2)
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            r1 = r0
        L1f:
            if (r1 == 0) goto L26
            int r1 = r1.intValue()
            goto L27
        L26:
            r1 = 0
        L27:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch: java.lang.Throwable -> L40
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L40
            java.math.BigDecimal r3 = java.math.BigDecimal.ZERO     // Catch: java.lang.Throwable -> L40
            int r3 = r2.compareTo(r3)     // Catch: java.lang.Throwable -> L40
            if (r3 >= 0) goto L35
            goto L50
        L35:
            java.math.RoundingMode r3 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.Throwable -> L40
            java.math.BigDecimal r3 = r2.setScale(r1, r3)     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = r3.toPlainString()     // Catch: java.lang.Throwable -> L40
            goto L47
        L40:
            r3 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r3)
            r3 = r1
        L47:
            boolean r1 = r3 instanceof sf.f
            if (r1 == 0) goto L4d
            goto L4e
        L4d:
            r0 = r3
        L4e:
            java.lang.String r0 = (java.lang.String) r0
        L50:
            return r0
    }

    public static void h0(be.a r3, ud.e r4) {
            boolean r0 = r3.h(r4)     // Catch: java.lang.Exception -> L1d java.lang.BootstrapMethodError -> L1f java.lang.StackOverflowError -> L21
            if (r0 == 0) goto L23
            java.util.List r0 = r4.f13699v     // Catch: java.lang.Exception -> L1d java.lang.BootstrapMethodError -> L1f java.lang.StackOverflowError -> L21
            be.g r1 = new be.g     // Catch: java.lang.Exception -> L1d java.lang.BootstrapMethodError -> L1f java.lang.StackOverflowError -> L21
            r2 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Exception -> L1d java.lang.BootstrapMethodError -> L1f java.lang.StackOverflowError -> L21
            r0.forEach(r1)     // Catch: java.lang.Exception -> L1d java.lang.BootstrapMethodError -> L1f java.lang.StackOverflowError -> L21
            java.util.List r0 = r4.f13697t     // Catch: java.lang.Exception -> L1d java.lang.BootstrapMethodError -> L1f java.lang.StackOverflowError -> L21
            be.g r1 = new be.g     // Catch: java.lang.Exception -> L1d java.lang.BootstrapMethodError -> L1f java.lang.StackOverflowError -> L21
            r2 = 1
            r1.<init>(r3, r2)     // Catch: java.lang.Exception -> L1d java.lang.BootstrapMethodError -> L1f java.lang.StackOverflowError -> L21
            r0.forEach(r1)     // Catch: java.lang.Exception -> L1d java.lang.BootstrapMethodError -> L1f java.lang.StackOverflowError -> L21
            return
        L1d:
            r0 = move-exception
            goto L24
        L1f:
            r0 = move-exception
            goto L24
        L21:
            r0 = move-exception
            goto L24
        L23:
            return
        L24:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " in pass: "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r4.getClass()
            xe.h.a(r4, r3, r0)
            return
    }

    public static java.lang.Long i(java.lang.String r6) {
            java.lang.String r6 = L(r6)
            r0 = 0
            if (r6 == 0) goto L50
            boolean r1 = og.m.t0(r6)
            if (r1 == 0) goto Le
            goto L50
        Le:
            r1 = 0
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch: java.lang.Throwable -> L31
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L31
            java.math.BigDecimal r6 = java.math.BigDecimal.ZERO     // Catch: java.lang.Throwable -> L31
            int r6 = r2.compareTo(r6)     // Catch: java.lang.Throwable -> L31
            if (r6 >= 0) goto L1d
            goto L50
        L1d:
            r6 = 2
            java.math.BigDecimal r6 = r2.movePointRight(r6)     // Catch: java.lang.Throwable -> L31
            java.math.RoundingMode r2 = java.math.RoundingMode.HALF_UP     // Catch: java.lang.Throwable -> L31
            java.math.BigDecimal r6 = r6.setScale(r1, r2)     // Catch: java.lang.Throwable -> L31
            long r2 = r6.longValueExact()     // Catch: java.lang.Throwable -> L31
            java.lang.Long r6 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L31
            goto L38
        L31:
            r6 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r6)
            r6 = r2
        L38:
            boolean r2 = r6 instanceof sf.f
            if (r2 == 0) goto L3e
            r6 = r0
        L3e:
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 == 0) goto L50
            long r2 = r6.longValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L4d
            r1 = 1
        L4d:
            if (r1 == 0) goto L50
            r0 = r6
        L50:
            return r0
    }

    public static void i0(be.a r3, ud.r r4) {
            md.b r0 = md.b.f8848c     // Catch: java.lang.Exception -> Lf java.lang.BootstrapMethodError -> L11 java.lang.StackOverflowError -> L13
            md.f r1 = r4.f8877g     // Catch: java.lang.Exception -> Lf java.lang.BootstrapMethodError -> L11 java.lang.StackOverflowError -> L13
            boolean r0 = r1.b(r0)     // Catch: java.lang.Exception -> Lf java.lang.BootstrapMethodError -> L11 java.lang.StackOverflowError -> L13
            if (r0 == 0) goto Lb
            return
        Lb:
            r3.g(r4)     // Catch: java.lang.Exception -> Lf java.lang.BootstrapMethodError -> L11 java.lang.StackOverflowError -> L13
            return
        Lf:
            r0 = move-exception
            goto L14
        L11:
            r0 = move-exception
            goto L14
        L13:
            r0 = move-exception
        L14:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " in pass: "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r4.getClass()
            xe.h.a(r4, r3, r0)
            return
    }

    public static java.lang.String j(java.lang.String r3) {
            java.lang.String r0 = ","
            java.lang.String r1 = ""
            r2 = 0
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "[0-9]+(?:\\.[0-9]{1,2})?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.util.regex.Matcher r0 = r0.matcher(r3)
            r0.getClass()
            og.i r3 = a7.a.b(r0, r2, r3)
            if (r3 == 0) goto L28
            java.lang.String r3 = r3.c()
            java.lang.String r3 = h(r3)
            return r3
        L28:
            r3 = 0
            return r3
    }

    public static java.lang.String j0(h.Hchat.hooks.api.model.WeChatMessage r4, java.lang.String r5) {
            java.lang.String r0 = r4.content
            r1 = 6
            java.lang.String r2 = ":\n"
            r3 = 0
            int r0 = og.m.r0(r0, r2, r3, r3, r1)
            boolean r1 = r4.isGroupChat()
            if (r1 == 0) goto L25
            boolean r1 = r4.isIncoming()
            if (r1 == 0) goto L25
            if (r0 <= 0) goto L25
            java.lang.String r4 = r4.content
            int r0 = r0 + 2
            java.lang.String r4 = r4.substring(r3, r0)
            java.lang.String r4 = r4.concat(r5)
            return r4
        L25:
            return r5
    }

    public static boolean k(java.util.Collection r1, java.util.function.Predicate r2) {
            if (r1 == 0) goto L1f
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9
            goto L1f
        L9:
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r1.next()
            boolean r0 = r2.test(r0)
            if (r0 == 0) goto Ld
            r1 = 1
            return r1
        L1f:
            r1 = 0
            return r1
    }

    public static boolean k0(java.lang.Object r7, java.lang.String r8, int r9) {
            java.lang.Class r0 = r7.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L9:
            if (r0 == 0) goto L60
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L60
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L47
            java.lang.Object r4 = r2.next()
            r5 = r4
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 != 0) goto L20
            java.lang.Class r5 = r5.getType()
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L20
            r3.add(r4)
            goto L20
        L47:
            java.util.Iterator r2 = r3.iterator()
        L4b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            r1.add(r3)
            goto L4b
        L5b:
            java.lang.Class r0 = r0.getSuperclass()
            goto L9
        L60:
            java.util.Iterator r0 = r1.iterator()
        L64:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto Lcb
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r1, r7)
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L7c
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L7d
        L7c:
            r3 = 0
        L7d:
            if (r3 == 0) goto L64
            r4 = 1357911(0x14b857, float:1.902839E-39)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            boolean r5 = h.Hchat.utils.KavaReflector.writeField(r1, r7, r5)
            if (r5 != 0) goto L8d
            goto L64
        L8d:
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r6.<init>()     // Catch: java.lang.Throwable -> La9
            r6.append(r8)     // Catch: java.lang.Throwable -> La9
            r6.append(r4)     // Catch: java.lang.Throwable -> La9
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> La9
            boolean r2 = og.m.h0(r5, r4, r2)     // Catch: java.lang.Throwable -> La9
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> La9
            goto Lb0
        La9:
            r2 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r2)
            r2 = r4
        Lb0:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r5 = r2 instanceof sf.f
            if (r5 == 0) goto Lb7
            r2 = r4
        Lb7:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            h.Hchat.utils.KavaReflector.writeField(r1, r7, r3)
            if (r2 == 0) goto L64
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            boolean r7 = h.Hchat.utils.KavaReflector.writeField(r1, r7, r8)
            return r7
        Lcb:
            return r2
    }

    public static java.lang.String l(long r1) {
            java.lang.String r0 = "msg_"
            java.lang.String r1 = bc.e.g(r1, r0)
            return r1
    }

    public static void l0(java.lang.Object r8) {
            java.lang.String r0 = "coverTimeStampMs="
            java.lang.Class r1 = r8.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        Lb:
            if (r1 == 0) goto L62
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L62
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L22:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L49
            java.lang.Object r5 = r3.next()
            r6 = r5
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            int r7 = r6.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 != 0) goto L22
            java.lang.Class r6 = r6.getType()
            java.lang.Class r7 = java.lang.Long.TYPE
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L22
            r4.add(r5)
            goto L22
        L49:
            java.util.Iterator r3 = r4.iterator()
        L4d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5d
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r2.add(r4)
            goto L4d
        L5d:
            java.lang.Class r1 = r1.getSuperclass()
            goto Lb
        L62:
            java.util.Iterator r1 = r2.iterator()
        L66:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lcf
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r2, r8)
            boolean r4 = r3 instanceof java.lang.Long
            if (r4 == 0) goto L7d
            java.lang.Long r3 = (java.lang.Long) r3
            goto L7e
        L7d:
            r3 = 0
        L7e:
            if (r3 == 0) goto L66
            r4 = 1357911246813(0x13c29d147dd, double:6.70897297152E-312)
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            boolean r6 = h.Hchat.utils.KavaReflector.writeField(r2, r8, r6)
            if (r6 != 0) goto L90
            goto L66
        L90:
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> Lad
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad
            r7.<init>()     // Catch: java.lang.Throwable -> Lad
            r7.append(r0)     // Catch: java.lang.Throwable -> Lad
            r7.append(r4)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> Lad
            r5 = 0
            boolean r4 = og.m.h0(r6, r4, r5)     // Catch: java.lang.Throwable -> Lad
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> Lad
            goto Lb4
        Lad:
            r4 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r4)
            r4 = r5
        Lb4:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r6 = r4 instanceof sf.f
            if (r6 == 0) goto Lbb
            r4 = r5
        Lbb:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            h.Hchat.utils.KavaReflector.writeField(r2, r8, r3)
            if (r4 == 0) goto L66
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            h.Hchat.utils.KavaReflector.writeField(r2, r8, r0)
        Lcf:
            return
    }

    public static final void m(int r2, int r3) {
            if (r2 < 0) goto L5
            if (r2 >= r3) goto L5
            return
        L5:
            java.lang.String r0 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = p.a.j(r2, r0, r1, r3)
            okio.a.i(r2)
            return
    }

    public static void m0(e5.a r11, k5.w r12, boolean r13) {
            w5.a r0 = r12.f7291m
            int r1 = r12.f7290l
            r2 = 0
            if (r13 == 0) goto L90
            f5.a r13 = f5.a.f3258l
            boolean r13 = r13.a(r1)
            if (r13 == 0) goto L90
            f5.a r13 = f5.a.f3259m
            boolean r13 = r13.a(r1)
            if (r13 == 0) goto L90
            if (r0 == 0) goto L90
            int r13 = r0.h()
            r3 = 1
            if (r13 == 0) goto L80
            r4 = 6
            if (r13 == r4) goto L74
            r4 = 2
            if (r13 == r4) goto L6c
            r4 = 3
            if (r13 == r4) goto L64
            r4 = 4
            if (r13 == r4) goto L5c
            r4 = 16
            if (r13 == r4) goto L51
            r4 = 17
            if (r13 == r4) goto L45
            r4 = 30
            if (r13 == r4) goto L87
            r4 = 31
            if (r13 == r4) goto L3e
        L3c:
            r3 = r2
            goto L87
        L3e:
            r13 = r0
            b6.a r13 = (b6.a) r13
            boolean r13 = r13.f492g
            r3 = r3 ^ r13
            goto L87
        L45:
            r13 = r0
            b6.d r13 = (b6.d) r13
            double r4 = r13.f495g
            r6 = 0
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 != 0) goto L3c
            goto L87
        L51:
            r13 = r0
            b6.e r13 = (b6.e) r13
            float r13 = r13.f496g
            r4 = 0
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 != 0) goto L3c
            goto L87
        L5c:
            r13 = r0
            b6.f r13 = (b6.f) r13
            int r13 = r13.f497g
            if (r13 != 0) goto L3c
            goto L87
        L64:
            r13 = r0
            b6.c r13 = (b6.c) r13
            char r13 = r13.f494g
            if (r13 != 0) goto L3c
            goto L87
        L6c:
            r13 = r0
            b6.i r13 = (b6.i) r13
            short r13 = r13.f500g
            if (r13 != 0) goto L3c
            goto L87
        L74:
            r13 = r0
            b6.g r13 = (b6.g) r13
            long r4 = r13.f498g
            r6 = 0
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 != 0) goto L3c
            goto L87
        L80:
            r13 = r0
            b6.b r13 = (b6.b) r13
            byte r13 = r13.f493g
            if (r13 != 0) goto L3c
        L87:
            if (r3 != 0) goto L8f
            java.lang.String r13 = "# The value of this static final field might be set in the static constructor\n"
            r11.write(r13)
            goto L90
        L8f:
            r0 = 0
        L90:
            java.lang.String r13 = ".field "
            r11.write(r13)
            int r13 = r12.f7294p
            r3 = 7
            if (r13 != r3) goto L9d
            java.util.Set r13 = java.util.Collections.EMPTY_SET
            goto La5
        L9d:
            java.util.Set r13 = f5.c.a(r13)
            java.util.EnumSet r13 = java.util.EnumSet.copyOf(r13)
        La5:
            f5.a[] r3 = f5.a.f3260n
            int r4 = r3.length
            r5 = r2
            r6 = r5
        Laa:
            if (r5 >= r4) goto Lbc
            r7 = r3[r5]
            boolean r8 = r7.f3267k
            if (r8 == 0) goto Lb9
            int r7 = r7.f3263g
            r7 = r7 & r1
            if (r7 == 0) goto Lb9
            int r6 = r6 + 1
        Lb9:
            int r5 = r5 + 1
            goto Laa
        Lbc:
            f5.a[] r4 = new f5.a[r6]
            int r5 = r3.length
            r7 = r2
            r8 = r7
        Lc1:
            if (r7 >= r5) goto Ld6
            r9 = r3[r7]
            boolean r10 = r9.f3267k
            if (r10 == 0) goto Ld3
            int r10 = r9.f3263g
            r10 = r10 & r1
            if (r10 == 0) goto Ld3
            int r10 = r8 + 1
            r4[r8] = r9
            r8 = r10
        Ld3:
            int r7 = r7 + 1
            goto Lc1
        Ld6:
            r1 = 32
            if (r2 >= r6) goto Le7
            r3 = r4[r2]
            java.lang.String r3 = r3.f3264h
            r11.write(r3)
            r11.write(r1)
            int r2 = r2 + 1
            goto Ld6
        Le7:
            java.util.Iterator r13 = r13.iterator()
        Leb:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L100
            java.lang.Object r2 = r13.next()
            f5.c r2 = (f5.c) r2
            java.lang.String r2 = r2.f3274h
            r11.write(r2)
            r11.write(r1)
            goto Leb
        L100:
            java.lang.String r13 = r12.getName()
            r11.s(r13)
            r13 = 58
            r11.write(r13)
            java.lang.String r13 = r12.getType()
            r11.t(r13)
            if (r0 == 0) goto L11d
            java.lang.String r13 = " = "
            r11.write(r13)
            r11.g(r0)
        L11d:
            r13 = 10
            r11.write(r13)
            k5.u r13 = r12.f7288j
            int r12 = r12.f7292n
            java.util.Set r12 = o5.e.a(r13, r12)
            int r13 = r12.size()
            if (r13 <= 0) goto L140
            r11.w()
            java.util.Set r12 = (java.util.Set) r12
            ac.p.Q(r11, r12)
            r11.u()
            java.lang.String r12 = ".end field\n"
            r11.write(r12)
        L140:
            return
    }

    public static final void n(int r2, int r3) {
            if (r2 < 0) goto L5
            if (r2 > r3) goto L5
            return
        L5:
            java.lang.String r0 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = p.a.j(r2, r0, r1, r3)
            okio.a.i(r2)
            return
    }

    public static java.lang.String n0(java.lang.String r4) {
            boolean r0 = og.m.t0(r4)
            if (r0 == 0) goto L7
            goto L62
        L7:
            og.l r0 = og.l.f9834h
            og.l r1 = og.l.f9835i
            og.l[] r0 = new og.l[]{r0, r1}
            java.util.Set r0 = tf.d0.W(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L1b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r0.next()
            og.l r3 = (og.l) r3
            int r3 = r3.f9837g
            r2 = r2 | r3
            goto L1b
        L2b:
            int r0 = l3.w.f(r2)
            java.lang.String r2 = "<content(?:\\s[^>]*)?>(.*?)</content>"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r2, r0)
            r0.getClass()
            java.util.regex.Matcher r0 = r0.matcher(r4)
            r0.getClass()
            og.i r4 = a7.a.b(r0, r1, r4)
            if (r4 == 0) goto L5f
            java.util.List r4 = r4.a()
            r0 = 1
            java.lang.Object r4 = tf.m.w1(r0, r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L5f
            java.lang.String r0 = "<![CDATA["
            java.lang.String r4 = og.m.A0(r4, r0)
            java.lang.String r0 = "]]>"
            java.lang.String r4 = og.m.B0(r4, r0)
            goto L60
        L5f:
            r4 = 0
        L60:
            if (r4 != 0) goto L64
        L62:
            java.lang.String r4 = ""
        L64:
            return r4
    }

    public static final void o(int r3, int r4, int r5) {
            java.lang.String r0 = "fromIndex: "
            if (r3 < 0) goto L13
            if (r4 > r5) goto L13
            if (r3 > r4) goto L9
            return
        L9:
            java.lang.String r5 = " > toIndex: "
            java.lang.String r3 = p.a.j(r3, r0, r5, r4)
            j8.o.t(r3)
            return
        L13:
            java.lang.String r1 = ", toIndex: "
            java.lang.String r2 = ", size: "
            java.lang.StringBuilder r3 = eh.a.s(r3, r4, r0, r1, r2)
            j8.o.e(r5, r3)
            return
    }

    public static java.lang.String o0(java.lang.String r4) {
            boolean r0 = og.m.t0(r4)
            if (r0 == 0) goto L7
            goto L4d
        L7:
            og.l r0 = og.l.f9834h
            og.l r1 = og.l.f9835i
            og.l[] r0 = new og.l[]{r0, r1}
            java.util.Set r0 = tf.d0.W(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L1b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r0.next()
            og.l r3 = (og.l) r3
            int r3 = r3.f9837g
            r2 = r2 | r3
            goto L1b
        L2b:
            int r0 = l3.w.f(r2)
            java.lang.String r2 = "<refermsg(?:\\s[^>]*)?>(.*?)</refermsg>"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r2, r0)
            r0.getClass()
            java.util.regex.Matcher r0 = r0.matcher(r4)
            r0.getClass()
            og.i r4 = a7.a.b(r0, r1, r4)
            if (r4 == 0) goto L4a
            java.lang.String r4 = r4.c()
            goto L4b
        L4a:
            r4 = 0
        L4b:
            if (r4 != 0) goto L4f
        L4d:
            java.lang.String r4 = ""
        L4f:
            return r4
    }

    public static final boolean p(e1.c r2, float r3, float r4) {
            float r0 = r2.f2296a
            float r1 = r2.f2298c
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L1a
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 > 0) goto L1a
            float r3 = r2.f2297b
            float r2 = r2.f2299d
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 > 0) goto L1a
            int r2 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r2 > 0) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public static java.lang.String p0(java.lang.String r5, java.lang.String r6) {
            boolean r0 = og.m.t0(r5)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r0 = "(?:\\s[^>]*)?>(.*?)</"
            java.lang.String r2 = ">"
            java.lang.String r3 = "<"
            java.lang.String r6 = bc.e.k(r3, r6, r0, r6, r2)
            og.l r0 = og.l.f9834h
            og.l r2 = og.l.f9835i
            og.l[] r0 = new og.l[]{r0, r2}
            java.util.Set r0 = tf.d0.W(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = r2
        L27:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L37
            java.lang.Object r4 = r0.next()
            og.l r4 = (og.l) r4
            int r4 = r4.f9837g
            r3 = r3 | r4
            goto L27
        L37:
            int r0 = l3.w.f(r3)
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6, r0)
            r6.getClass()
            java.util.regex.Matcher r6 = r6.matcher(r5)
            r6.getClass()
            og.i r5 = a7.a.b(r6, r2, r5)
            if (r5 == 0) goto L5b
            java.util.List r5 = r5.a()
            r6 = 1
            java.lang.Object r5 = tf.m.w1(r6, r5)
            java.lang.String r5 = (java.lang.String) r5
            goto L5c
        L5b:
            r5 = 0
        L5c:
            if (r5 != 0) goto L5f
            goto L60
        L5f:
            r1 = r5
        L60:
            java.lang.String r5 = "<![CDATA["
            java.lang.String r5 = og.m.A0(r1, r5)
            java.lang.String r6 = "]]>"
            java.lang.String r5 = og.m.B0(r5, r6)
            java.lang.String r5 = e0(r5)
            return r5
    }

    public static java.lang.String q(java.nio.ByteBuffer r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L5:
            boolean r1 = r6.hasRemaining()
            if (r1 != 0) goto L10
            java.lang.String r6 = r0.toString()
            return r6
        L10:
            byte r1 = r6.get()
            r1 = r1 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            if (r1 != 0) goto L1e
            java.lang.String r6 = r0.toString()
            return r6
        L1e:
            r2 = 128(0x80, float:1.8E-43)
            if (r1 >= r2) goto L26
            r0.append(r1)
            goto L5
        L26:
            r3 = r1 & 224(0xe0, float:3.14E-43)
            r4 = 192(0xc0, float:2.69E-43)
            if (r3 != r4) goto L48
            byte r3 = r6.get()
            r4 = r3 & 192(0xc0, float:2.69E-43)
            if (r4 != r2) goto L40
            r1 = r1 & 31
            int r1 = r1 << 6
            r2 = r3 & 63
            r1 = r1 | r2
            char r1 = (char) r1
            r0.append(r1)
            goto L5
        L40:
            java.io.UTFDataFormatException r6 = new java.io.UTFDataFormatException
            java.lang.String r0 = "bad second byte"
            r6.<init>(r0)
            throw r6
        L48:
            r3 = r1 & 240(0xf0, float:3.36E-43)
            r4 = 224(0xe0, float:3.14E-43)
            if (r3 != r4) goto L77
            byte r3 = r6.get()
            byte r4 = r6.get()
            r5 = r3 & 192(0xc0, float:2.69E-43)
            if (r5 != r2) goto L6f
            r5 = r4 & 192(0xc0, float:2.69E-43)
            if (r5 != r2) goto L6f
            r1 = r1 & 15
            int r1 = r1 << 12
            r2 = r3 & 63
            int r2 = r2 << 6
            r1 = r1 | r2
            r2 = r4 & 63
            r1 = r1 | r2
            char r1 = (char) r1
            r0.append(r1)
            goto L5
        L6f:
            java.io.UTFDataFormatException r6 = new java.io.UTFDataFormatException
            java.lang.String r0 = "bad second or third byte"
            r6.<init>(r0)
            throw r6
        L77:
            java.io.UTFDataFormatException r6 = new java.io.UTFDataFormatException
            java.lang.String r0 = "bad byte"
            r6.<init>(r0)
            throw r6
    }

    public static na.a r(l3.l r2, java.util.List r3, na.a r4) {
            java.lang.String r0 = "hb_rule_default_template_id"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.d(r0, r1)
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
            r1 = r0
            na.j r1 = (na.j) r1
            java.lang.String r1 = r1.f9150a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lc
            goto L23
        L22:
            r0 = 0
        L23:
            na.j r0 = (na.j) r0
            if (r0 == 0) goto L36
            java.lang.String r2 = r0.f9151b
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L31
            java.lang.String r2 = "默认规则"
        L31:
            na.a r2 = ac.p.d(r0, r2, r4)
            return r2
        L36:
            return r4
    }

    public static java.lang.String s(h.Hchat.hooks.api.model.WeChatMessage r3, java.lang.String r4) {
            r0 = 0
            r1 = 6
            java.lang.String r2 = ":\n"
            int r0 = og.m.r0(r4, r2, r0, r0, r1)
            boolean r1 = r3.isGroupChat()
            if (r1 == 0) goto L16
            if (r0 <= 0) goto L16
            int r0 = r0 + 2
            java.lang.String r4 = r4.substring(r0)
        L16:
            boolean r0 = r3.isTransfer()
            if (r0 == 0) goto L21
            java.lang.String r3 = d0(r4)
            return r3
        L21:
            boolean r3 = r3.isQuote()
            if (r3 == 0) goto L2c
            java.lang.String r3 = Q(r4)
            return r3
        L2c:
            return r4
    }

    public static f9.h t(android.content.Context r10, long r11) {
            i8.c r0 = h.Hchat.hooks.api.core.WeChatApis.message()
            if (r0 == 0) goto L6a
            k8.s r0 = h.Hchat.hooks.api.core.WeChatApis.m()
            if (r0 == 0) goto L6a
            h.Hchat.hooks.api.model.WeChatMessage r11 = r0.c(r11)
            if (r11 == 0) goto L6a
            boolean r12 = C(r11)
            if (r12 != 0) goto L19
            goto L6a
        L19:
            java.lang.String r12 = r11.bodyContent()
            boolean r7 = r11.isQuote()
            boolean r8 = r11.isTransfer()
            f9.h r0 = new f9.h
            long r1 = r11.msgId
            java.lang.String r3 = r11.talker
            if (r8 == 0) goto L32
            java.lang.String r4 = d0(r12)
            goto L3a
        L32:
            if (r7 == 0) goto L39
            java.lang.String r4 = Q(r12)
            goto L3a
        L39:
            r4 = r12
        L3a:
            if (r8 == 0) goto L41
            java.lang.String r5 = c0(r12)
            goto L4b
        L41:
            if (r7 == 0) goto L4a
            java.lang.String r5 = "title"
            java.lang.String r5 = p0(r12, r5)
            goto L4b
        L4a:
            r5 = r12
        L4b:
            if (r7 == 0) goto L53
            java.lang.String r12 = R(r12)
        L51:
            r6 = r12
            goto L56
        L53:
            java.lang.String r12 = ""
            goto L51
        L56:
            java.lang.String r12 = "Hchat_edit_message_backup"
            android.content.SharedPreferences r10 = ub.b.c(r10, r12)
            long r11 = r11.msgId
            java.lang.String r11 = l(r11)
            boolean r9 = r10.contains(r11)
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L6a:
            r10 = 0
            return r10
    }

    public static java.lang.String u(java.lang.String r3) {
            java.lang.String r0 = "&"
            java.lang.String r1 = "&amp;"
            r2 = 0
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "<"
            java.lang.String r1 = "&lt;"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = ">"
            java.lang.String r1 = "&gt;"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            return r3
    }

    public static java.util.List v(java.util.Collection r3, java.util.function.Predicate r4) {
            if (r3 == 0) goto L27
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            goto L27
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r3.next()
            boolean r2 = r4.test(r1)
            if (r2 == 0) goto L12
            r0.add(r1)
            goto L12
        L26:
            return r0
        L27:
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            return r3
    }

    public static java.lang.Object w(java.util.List r4, java.util.function.Predicate r5) {
            r0 = 0
            if (r4 == 0) goto L25
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto La
            goto L25
        La:
            java.util.Iterator r4 = r4.iterator()
            r1 = r0
        Lf:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r4.next()
            boolean r3 = r5.test(r2)
            if (r3 == 0) goto Lf
            if (r1 == 0) goto L22
            goto L25
        L22:
            r1 = r2
            goto Lf
        L24:
            return r1
        L25:
            return r0
    }

    public static java.lang.String x(java.lang.String... r4) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r4[r1]
            boolean r3 = og.m.t0(r2)
            if (r3 != 0) goto Ld
            goto L11
        Ld:
            int r1 = r1 + 1
            goto L2
        L10:
            r2 = 0
        L11:
            if (r2 != 0) goto L16
            java.lang.String r4 = ""
            return r4
        L16:
            return r2
    }

    public static g0.b y(g0.b r2, u2.m r3, i2.n0 r4, u2.c r5, m2.d r6) {
            if (r2 == 0) goto L23
            u2.m r0 = r2.f3966a
            if (r3 != r0) goto L23
            i2.n0 r0 = i2.e0.h(r4, r3)
            i2.n0 r1 = r2.f3967b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L23
            float r0 = r5.d()
            u2.d r1 = r2.f3968c
            float r1 = r1.f13339g
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L23
            m2.d r0 = r2.f3969d
            if (r6 != r0) goto L23
            return r2
        L23:
            g0.b r2 = g0.b.f3965h
            if (r2 == 0) goto L48
            u2.m r0 = r2.f3966a
            if (r3 != r0) goto L48
            i2.n0 r0 = i2.e0.h(r4, r3)
            i2.n0 r1 = r2.f3967b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L48
            float r0 = r5.d()
            u2.d r1 = r2.f3968c
            float r1 = r1.f13339g
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L48
            m2.d r0 = r2.f3969d
            if (r6 != r0) goto L48
            return r2
        L48:
            g0.b r2 = new g0.b
            i2.n0 r4 = i2.e0.h(r4, r3)
            float r0 = r5.d()
            float r5 = r5.q0()
            u2.d r1 = new u2.d
            r1.<init>(r0, r5)
            r2.<init>(r3, r4, r1, r6)
            g0.b.f3965h = r2
            return r2
    }

    public static hh.c z(org.luckypray.dexkit.DexKitBridge r10, jh.b r11) {
            r10.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 4
            int r2 = r11.b(r1)
            r3 = 0
            if (r2 == 0) goto L15
            int r2 = r11.f(r2)
            goto L16
        L15:
            r2 = r3
        L16:
            r4 = r3
        L17:
            if (r4 >= r2) goto L26e
            jh.a r5 = new jh.a
            r5.<init>()
            int r6 = r11.b(r1)
            r7 = 0
            if (r6 == 0) goto L39
            int r6 = r11.e(r6)
            int r8 = r4 * 4
            int r8 = r8 + r6
            int r6 = r11.a(r8)
            java.nio.ByteBuffer r8 = r11.f4332b
            r8.getClass()
            r5.c(r6, r8)
            goto L3a
        L39:
            r5 = r7
        L3a:
            r5.getClass()
            r6 = 6
            int r6 = r5.b(r6)
            if (r6 == 0) goto L4e
            java.nio.ByteBuffer r8 = r5.f4332b
            int r9 = r5.f4331a
            int r6 = r6 + r9
            byte r6 = r8.get(r6)
            goto L4f
        L4e:
            r6 = r3
        L4f:
            int r6 = a7.a.u(r6)
            int r8 = t3.c.b(r6)
            switch(r8) {
                case 0: goto L23f;
                case 1: goto L21b;
                case 2: goto L1f7;
                case 3: goto L1d2;
                case 4: goto L1ac;
                case 5: goto L187;
                case 6: goto L161;
                case 7: goto Lfc;
                case 8: goto Le8;
                case 9: goto Ld4;
                case 10: goto Lc0;
                case 11: goto Lac;
                case 12: goto L98;
                case 13: goto L88;
                case 14: goto L5f;
                default: goto L5a;
            }
        L5a:
            okio.a.k()
            r10 = 0
            return r10
        L5f:
            jh.e r7 = new jh.e
            r7.<init>()
            g6.c r5 = r5.p(r7)
            r5.getClass()
            jh.e r5 = (jh.e) r5
            int r7 = r5.b(r1)
            if (r7 == 0) goto L81
            byte r8 = (byte) r3
            java.nio.ByteBuffer r9 = r5.f4332b
            int r5 = r5.f4331a
            int r7 = r7 + r5
            byte r5 = r9.get(r7)
            if (r8 == r5) goto L81
            r5 = 1
            goto L82
        L81:
            r5 = r3
        L82:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            goto L262
        L88:
            jh.l r7 = new jh.l
            r7.<init>()
            g6.c r5 = r5.p(r7)
            r5.getClass()
            jh.l r5 = (jh.l) r5
            goto L262
        L98:
            jh.c r7 = new jh.c
            r7.<init>()
            g6.c r5 = r5.p(r7)
            r5.getClass()
            jh.c r5 = (jh.c) r5
            hh.a r5 = ac.p.s(r10, r5)
            goto L262
        Lac:
            jh.b r7 = new jh.b
            r7.<init>()
            g6.c r5 = r5.p(r7)
            r5.getClass()
            jh.b r5 = (jh.b) r5
            hh.c r5 = z(r10, r5)
            goto L262
        Lc0:
            jh.o r7 = new jh.o
            r7.<init>()
            g6.c r5 = r5.p(r7)
            r5.getClass()
            jh.o r5 = (jh.o) r5
            hh.l r5 = fb.v0.r(r10, r5)
            goto L262
        Ld4:
            jh.p r7 = new jh.p
            r7.<init>()
            g6.c r5 = r5.p(r7)
            r5.getClass()
            jh.p r5 = (jh.p) r5
            hh.o r5 = g4.a.p(r10, r5)
            goto L262
        Le8:
            jh.d r7 = new jh.d
            r7.<init>()
            g6.c r5 = r5.p(r7)
            r5.getClass()
            jh.d r5 = (jh.d) r5
            hh.i r5 = f8.i.v(r10, r5)
            goto L262
        Lfc:
            jh.n r8 = new jh.n
            r8.<init>()
            g6.c r5 = r5.p(r8)
            r5.getClass()
            jh.n r5 = (jh.n) r5
            int r8 = r5.b(r1)     // Catch: java.lang.IllegalArgumentException -> L11f
            if (r8 == 0) goto L118
            int r9 = r5.f4331a     // Catch: java.lang.IllegalArgumentException -> L11f
            int r8 = r8 + r9
            java.lang.String r8 = r5.d(r8)     // Catch: java.lang.IllegalArgumentException -> L11f
            goto L119
        L118:
            r8 = r7
        L119:
            r8.getClass()     // Catch: java.lang.IllegalArgumentException -> L11f
            r5 = r8
            goto L262
        L11f:
            int r8 = r5.b(r1)     // Catch: java.lang.Throwable -> L14d
            if (r8 != 0) goto L126
            goto L141
        L126:
            java.nio.ByteBuffer r7 = r5.f4332b     // Catch: java.lang.Throwable -> L14d
            java.nio.ByteBuffer r7 = r7.duplicate()     // Catch: java.lang.Throwable -> L14d
            java.nio.ByteOrder r9 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L14d
            java.nio.ByteBuffer r7 = r7.order(r9)     // Catch: java.lang.Throwable -> L14d
            int r9 = r5.e(r8)     // Catch: java.lang.Throwable -> L14d
            r7.position(r9)     // Catch: java.lang.Throwable -> L14d
            int r5 = r5.f(r8)     // Catch: java.lang.Throwable -> L14d
            int r5 = r5 + r9
            r7.limit(r5)     // Catch: java.lang.Throwable -> L14d
        L141:
            r7.getClass()     // Catch: java.lang.Throwable -> L14d
            java.lang.String r5 = q(r7)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r5 = f8.i.s(r5)     // Catch: java.lang.Throwable -> L14d
            goto L154
        L14d:
            r5 = move-exception
            sf.f r7 = new sf.f
            r7.<init>(r5)
            r5 = r7
        L154:
            java.lang.Throwable r7 = sf.g.b(r5)
            if (r7 != 0) goto L15b
            goto L15d
        L15b:
            java.lang.String r5 = ""
        L15d:
            java.lang.String r5 = (java.lang.String) r5
            goto L262
        L161:
            jh.h r7 = new jh.h
            r7.<init>()
            g6.c r5 = r5.p(r7)
            r5.getClass()
            jh.h r5 = (jh.h) r5
            int r7 = r5.b(r1)
            if (r7 == 0) goto L17f
            java.nio.ByteBuffer r8 = r5.f4332b
            int r5 = r5.f4331a
            int r7 = r7 + r5
            double r7 = r8.getDouble(r7)
            goto L181
        L17f:
            r7 = 0
        L181:
            java.lang.Double r5 = java.lang.Double.valueOf(r7)
            goto L262
        L187:
            jh.i r7 = new jh.i
            r7.<init>()
            g6.c r5 = r5.p(r7)
            r5.getClass()
            jh.i r5 = (jh.i) r5
            int r7 = r5.b(r1)
            if (r7 == 0) goto L1a5
            java.nio.ByteBuffer r8 = r5.f4332b
            int r5 = r5.f4331a
            int r7 = r7 + r5
            float r5 = r8.getFloat(r7)
            goto L1a6
        L1a5:
            r5 = 0
        L1a6:
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            goto L262
        L1ac:
            jh.k r7 = new jh.k
            r7.<init>()
            g6.c r5 = r5.p(r7)
            r5.getClass()
            jh.k r5 = (jh.k) r5
            int r7 = r5.b(r1)
            if (r7 == 0) goto L1ca
            java.nio.ByteBuffer r8 = r5.f4332b
            int r5 = r5.f4331a
            int r7 = r7 + r5
            long r7 = r8.getLong(r7)
            goto L1cc
        L1ca:
            r7 = 0
        L1cc:
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            goto L262
        L1d2:
            jh.j r7 = new jh.j
            r7.<init>()
            g6.c r5 = r5.p(r7)
            r5.getClass()
            jh.j r5 = (jh.j) r5
            int r7 = r5.b(r1)
            if (r7 == 0) goto L1f0
            java.nio.ByteBuffer r8 = r5.f4332b
            int r5 = r5.f4331a
            int r7 = r7 + r5
            int r5 = r8.getInt(r7)
            goto L1f1
        L1f0:
            r5 = r3
        L1f1:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L262
        L1f7:
            jh.g r7 = new jh.g
            r7.<init>()
            g6.c r5 = r5.p(r7)
            r5.getClass()
            jh.g r5 = (jh.g) r5
            int r7 = r5.b(r1)
            if (r7 == 0) goto L215
            java.nio.ByteBuffer r8 = r5.f4332b
            int r5 = r5.f4331a
            int r7 = r7 + r5
            short r5 = r8.getShort(r7)
            goto L216
        L215:
            r5 = r3
        L216:
            java.lang.Short r5 = java.lang.Short.valueOf(r5)
            goto L262
        L21b:
            jh.m r7 = new jh.m
            r7.<init>()
            g6.c r5 = r5.p(r7)
            r5.getClass()
            jh.m r5 = (jh.m) r5
            int r7 = r5.b(r1)
            if (r7 == 0) goto L239
            java.nio.ByteBuffer r8 = r5.f4332b
            int r5 = r5.f4331a
            int r7 = r7 + r5
            short r5 = r8.getShort(r7)
            goto L23a
        L239:
            r5 = r3
        L23a:
            java.lang.Short r5 = java.lang.Short.valueOf(r5)
            goto L262
        L23f:
            jh.f r7 = new jh.f
            r7.<init>()
            g6.c r5 = r5.p(r7)
            r5.getClass()
            jh.f r5 = (jh.f) r5
            int r7 = r5.b(r1)
            if (r7 == 0) goto L25d
            java.nio.ByteBuffer r8 = r5.f4332b
            int r5 = r5.f4331a
            int r7 = r7 + r5
            byte r5 = r8.get(r7)
            goto L25e
        L25d:
            r5 = r3
        L25e:
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
        L262:
            hh.d r7 = new hh.d
            r7.<init>(r5, r6)
            r0.add(r7)
            int r4 = r4 + 1
            goto L17
        L26e:
            hh.c r11 = new hh.c
            r11.<init>(r10, r0)
            return r11
    }
}
