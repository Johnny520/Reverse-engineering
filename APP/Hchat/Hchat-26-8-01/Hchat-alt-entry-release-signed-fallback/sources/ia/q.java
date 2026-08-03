package ia;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f6619f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f6620g = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b5.c f6621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ia.a0 f6622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ab.b f6623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.content.SharedPreferences f6624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f6625e;

    static {
            java.lang.String r19 = "温"
            java.lang.String r20 = "方"
            java.lang.String r1 = "林"
            java.lang.String r2 = "陈"
            java.lang.String r3 = "周"
            java.lang.String r4 = "吴"
            java.lang.String r5 = "许"
            java.lang.String r6 = "沈"
            java.lang.String r7 = "顾"
            java.lang.String r8 = "江"
            java.lang.String r9 = "苏"
            java.lang.String r10 = "叶"
            java.lang.String r11 = "陆"
            java.lang.String r12 = "夏"
            java.lang.String r13 = "宋"
            java.lang.String r14 = "唐"
            java.lang.String r15 = "程"
            java.lang.String r16 = "韩"
            java.lang.String r17 = "乔"
            java.lang.String r18 = "余"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20}
            ia.q.f6619f = r0
            java.lang.String r19 = "可"
            java.lang.String r20 = "禾"
            java.lang.String r1 = "安"
            java.lang.String r2 = "宁"
            java.lang.String r3 = "然"
            java.lang.String r4 = "辰"
            java.lang.String r5 = "希"
            java.lang.String r6 = "言"
            java.lang.String r7 = "清"
            java.lang.String r8 = "予"
            java.lang.String r9 = "景"
            java.lang.String r10 = "知"
            java.lang.String r11 = "一"
            java.lang.String r12 = "若"
            java.lang.String r13 = "雨"
            java.lang.String r14 = "星"
            java.lang.String r15 = "月"
            java.lang.String r16 = "晨"
            java.lang.String r17 = "乐"
            java.lang.String r18 = "念"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20}
            ia.q.f6620g = r0
            return
    }

    public q(android.content.Context r1, b5.c r2, ia.a0 r3, ab.b r4) {
            r0 = this;
            r0.<init>()
            r0.f6621a = r2
            r0.f6622b = r3
            r0.f6623c = r4
            java.lang.String r2 = "Hchat_moments_fake_interaction_config"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f6624d = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f6625e = r1
            return
    }

    public static java.lang.String c(long r3) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r2 = java.util.Locale.CHINA     // Catch: java.lang.Throwable -> L13
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L13
            java.util.Date r1 = new java.util.Date     // Catch: java.lang.Throwable -> L13
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = r0.format(r1)     // Catch: java.lang.Throwable -> L13
            goto L1a
        L13:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L1a:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L21
            java.lang.String r3 = ""
        L21:
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    public static java.lang.String f() {
            jg.a r0 = jg.d.f6902g
            java.lang.String[] r0 = ia.q.f6619f
            java.lang.Object r0 = tf.l.G0(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String[] r1 = ia.q.f6620g
            java.lang.Object r2 = tf.l.G0(r1)
            java.lang.String r2 = (java.lang.String) r2
            jg.a r3 = jg.d.f6902g
            java.util.Random r3 = r3.f()
            boolean r3 = r3.nextBoolean()
            if (r3 == 0) goto L25
            java.lang.Object r1 = tf.l.G0(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            java.lang.String r0 = wb.en.h(r0, r2, r1)
            return r0
    }

    public static void j(android.app.Activity r1, java.lang.String r2) {
            r0 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r0)
            r1.show()
            return
    }

    public final java.lang.String a(ia.b r5) {
            r4 = this;
            java.lang.String r0 = r5.f6555c
            java.lang.String r5 = r5.f6554b
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            if (r1 <= 0) goto L19
            boolean r1 = gg.l.a(r0, r5)
            if (r1 != 0) goto L19
            return r0
        L19:
            java.util.concurrent.ConcurrentHashMap r0 = r4.f6625e
            java.lang.Object r1 = r0.get(r5)
            if (r1 != 0) goto L5e
            r1 = 0
            g8.i r2 = h.Hchat.hooks.api.core.WeChatApis.contacts()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2f
            java.lang.String r2 = r2.r(r5)     // Catch: java.lang.Throwable -> L2d
            goto L37
        L2d:
            r2 = move-exception
            goto L31
        L2f:
            r2 = r1
            goto L37
        L31:
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L37:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L3d
            r2 = r1
        L3d:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L55
            boolean r3 = og.m.t0(r2)
            r3 = r3 ^ 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L52
            r1 = r2
        L52:
            if (r1 == 0) goto L55
            goto L56
        L55:
            r1 = r5
        L56:
            java.lang.Object r5 = r0.putIfAbsent(r5, r1)
            if (r5 != 0) goto L5d
            goto L5e
        L5d:
            r1 = r5
        L5e:
            r1.getClass()
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    public final java.util.List b(java.util.List r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.f6624d
            java.lang.String r1 = "fake_like_excluded_ids"
            tf.v r2 = tf.v.f13169g
            java.util.Set r0 = r0.getStringSet(r1, r2)
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            r2 = r0
        Le:
            dg.n r4 = tf.m.m1(r4)
            ia.p r0 = new ia.p
            r1 = 0
            r0.<init>(r2, r1)
            ng.i r1 = new ng.i
            r2 = 0
            r1.<init>(r4, r2, r0)
            i2.z r4 = new i2.z
            r0 = 7
            r4.<init>(r0)
            ng.b r0 = new ng.b
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1, r4)
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L36
            tf.t r4 = tf.t.f13167g
            goto L5c
        L36:
            java.lang.Object r4 = r0.next()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L45
            java.util.List r4 = a.a.x0(r4)
            goto L5c
        L45:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r4)
        L4d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L5b
            java.lang.Object r4 = r0.next()
            r1.add(r4)
            goto L4d
        L5b:
            r4 = r1
        L5c:
            return r4
    }

    public final java.util.List d(java.util.List r22, int r23, boolean r24, boolean r25) {
            r21 = this;
            r0 = 1
            r1 = r23
            if (r1 >= r0) goto L6
            r1 = r0
        L6:
            if (r25 == 0) goto Lb
            tf.t r2 = tf.t.f13167g
            goto L1a
        Lb:
            java.util.List r2 = r21.b(r22)
            java.util.List r2 = tf.m.S1(r2)
            java.util.Collections.shuffle(r2)
            java.util.List r2 = tf.m.L1(r1, r2)
        L1a:
            r3 = 0
            if (r25 != 0) goto L22
            if (r24 == 0) goto L20
            goto L22
        L20:
            r1 = r3
            goto L2a
        L22:
            int r4 = r2.size()
            int r1 = r1 - r4
            if (r1 >= 0) goto L2a
            goto L20
        L2a:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Iterator r5 = r2.iterator()
        L33:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L45
            java.lang.Object r6 = r5.next()
            wb.jv r6 = (wb.jv) r6
            java.lang.String r6 = r6.f17141b
            r4.add(r6)
            goto L33
        L45:
            uf.c r5 = a.a.E()
            r6 = r3
        L4a:
            if (r6 >= r1) goto Lb9
            java.lang.String r7 = f()
            r8 = r3
        L51:
            boolean r9 = r4.contains(r7)
            if (r9 == 0) goto L62
            r9 = 20
            if (r8 >= r9) goto L62
            java.lang.String r7 = f()
            int r8 = r8 + 1
            goto L51
        L62:
            boolean r8 = r4.contains(r7)
            if (r8 == 0) goto L81
            r8 = r0
        L69:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            int r8 = r8 + r0
            boolean r10 = r4.contains(r9)
            if (r10 != 0) goto L69
            r13 = r9
            goto L82
        L81:
            r13 = r7
        L82:
            r4.add(r13)
            wb.jv r11 = new wb.jv
            java.util.UUID r7 = java.util.UUID.randomUUID()
            java.lang.String r7 = r7.toString()
            r7.getClass()
            java.lang.String r8 = "-"
            java.lang.String r9 = ""
            java.lang.String r7 = og.t.a0(r7, r8, r9, r3)
            java.lang.String r8 = "wxid_hchat_fake_like_"
            java.lang.String r12 = r8.concat(r7)
            java.lang.String r7 = "虚拟点赞人"
            java.util.List r19 = a.a.x0(r7)
            r20 = 120(0x78, float:1.68E-43)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r5.add(r11)
            int r6 = r6 + 1
            goto L4a
        Lb9:
            uf.c r0 = a.a.t(r5)
            java.util.ArrayList r0 = tf.m.F1(r2, r0)
            r1 = r21
            android.content.SharedPreferences r2 = r1.f6624d
            java.lang.String r4 = "fake_like_random_order"
            boolean r2 = r2.getBoolean(r4, r3)
            if (r2 == 0) goto Ld4
            java.util.List r0 = tf.m.S1(r0)
            java.util.Collections.shuffle(r0)
        Ld4:
            return r0
    }

    public final void e(android.app.Activity r6, p8.l r7, int r8, int r9) {
            r5 = this;
            java.lang.String r0 = r7.f10391a
            if (r0 == 0) goto L34
            b5.c r1 = r5.f6621a
            ia.c r2 = r1.l(r0)
            java.util.List r3 = r2.f6559b
            java.util.ArrayList r3 = tf.m.R1(r3)
            if (r8 < 0) goto L34
            int r4 = r3.size()
            if (r8 >= r4) goto L34
            if (r9 < 0) goto L34
            int r4 = r3.size()
            if (r9 >= r4) goto L34
            java.lang.Object r8 = r3.remove(r8)
            ia.b r8 = (ia.b) r8
            r3.add(r9, r8)
            r1.Q(r0, r3)
            ia.a0 r8 = r5.f6622b
            r8.a(r6, r7, r2)
            r5.g(r6, r7)
        L34:
            return
    }

    public final void g(android.app.Activity r14, p8.l r15) {
            r13 = this;
            r14.getClass()
            r15.getClass()
            java.lang.String r0 = r15.f10391a
            if (r0 == 0) goto L91
            b5.c r1 = r13.f6621a
            ia.c r0 = r1.l(r0)
            java.util.List r6 = r0.f6559b
            uf.c r0 = a.a.E()
            sf.e r1 = new sf.e
            java.lang.String r2 = "新增伪评论"
            java.lang.String r3 = "选择好友、填写评论并设置评论时间"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.Iterator r1 = r6.iterator()
        L26:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r1.next()
            ia.b r2 = (ia.b) r2
            java.lang.String r3 = r13.a(r2)
            long r4 = r2.f6557e
            java.lang.String r4 = c(r4)
            java.lang.String r5 = " · "
            java.lang.String r3 = wb.en.h(r3, r5, r4)
            java.lang.String r2 = r2.f6556d
            sf.e r4 = new sf.e
            r4.<init>(r3, r2)
            r0.add(r4)
            goto L26
        L4d:
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L5f
            sf.e r1 = new sf.e
            java.lang.String r2 = "清空伪评论"
            java.lang.String r3 = "移除该朋友圈的全部伪评论，恢复真实评论显示"
            r1.<init>(r2, r3)
            r0.add(r1)
        L5f:
            uf.c r10 = a.a.t(r0)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L6d
            java.lang.String r0 = "暂无伪评论"
        L6b:
            r9 = r0
            goto L7a
        L6d:
            int r0 = r6.size()
            java.lang.String r1 = "共 "
            java.lang.String r2 = " 条，列表顺序即显示顺序"
            java.lang.String r0 = eh.a.m(r0, r1, r2)
            goto L6b
        L7a:
            c9.k r1 = new c9.k
            r7 = 7
            r4 = 0
            r2 = r13
            r3 = r14
            r5 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            k.s1 r12 = new k.s1
            r14 = 7
            r12.<init>(r14)
            java.lang.String r8 = "朋友圈伪评论"
            r11 = r1
            r7 = r3
            wb.y2.W1(r7, r8, r9, r10, r11, r12)
        L91:
            return
    }

    public final void h(android.app.Activity r16, p8.l r17, java.util.ArrayList r18, java.util.LinkedHashSet r19, java.lang.String r20) {
            r15 = this;
            r0 = r17
            java.lang.String r1 = r0.f10391a
            if (r1 == 0) goto L2e
            c9.a0 r2 = new c9.a0
            r3 = 20
            r12 = r19
            r2.<init>(r12, r3)
            r3 = r18
            java.util.List r5 = tf.m.K1(r3, r2)
            ia.j r6 = new ia.j
            r4 = r16
            r6.<init>(r15, r1, r4, r0)
            k.s1 r7 = new k.s1
            r0 = 7
            r7.<init>(r0)
            r13 = 0
            r14 = 1152(0x480, float:1.614E-42)
            java.lang.String r9 = "保存"
            r10 = 0
            r11 = 0
            r8 = r20
            wb.y2.U1(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L2e:
            return
    }

    public final void i(android.app.Activity r11, p8.l r12, java.util.List r13, int r14, boolean r15, boolean r16) {
            r10 = this;
            java.util.List r2 = r10.b(r13)
            boolean r13 = r2.isEmpty()
            if (r13 == 0) goto L12
            if (r15 != 0) goto L12
            java.lang.String r12 = "没有可选择的好友"
            j(r11, r12)
            return
        L12:
            r13 = 1
            r0 = 0
            if (r15 == 0) goto L18
            r7 = r0
            goto L24
        L18:
            int r1 = r2.size()
            if (r1 >= r13) goto L1f
            r1 = r13
        L1f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7 = r1
        L24:
            if (r16 == 0) goto L2a
            java.lang.String r1 = "凭空生成点赞数量"
        L28:
            r8 = r1
            goto L2d
        L2a:
            java.lang.String r1 = "设置伪造点赞数量"
            goto L28
        L2d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            if (r14 <= 0) goto L34
            goto L35
        L34:
            r13 = 0
        L35:
            if (r13 == 0) goto L38
            r0 = r1
        L38:
            if (r0 == 0) goto L48
            int r13 = r0.intValue()
            if (r7 == 0) goto L54
            int r14 = r7.intValue()
            if (r13 <= r14) goto L54
            r13 = r14
            goto L54
        L48:
            r13 = 50
            if (r7 == 0) goto L54
            int r14 = r7.intValue()
            int r13 = java.lang.Math.min(r13, r14)
        L54:
            ia.k r0 = new ia.k
            r1 = r10
            r5 = r11
            r6 = r12
            r3 = r15
            r4 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            k.s1 r9 = new k.s1
            r12 = 7
            r9.<init>(r12)
            r6 = 1
            r3 = r11
            r5 = r13
            r4 = r8
            r8 = r0
            wb.y2.a2(r3, r4, r5, r6, r7, r8, r9)
            return
    }
}
