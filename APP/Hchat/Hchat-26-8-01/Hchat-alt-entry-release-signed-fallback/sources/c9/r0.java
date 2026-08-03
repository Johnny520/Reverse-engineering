package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1333k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1334l;

    public /* synthetic */ r0(int r1, android.app.Activity r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r0 = this;
            r0.f1329g = r1
            r0.f1331i = r3
            r0.f1330h = r2
            r0.f1332j = r4
            r0.f1333k = r5
            r0.f1334l = r6
            r0.<init>()
            return
    }

    public /* synthetic */ r0(gg.u r2, android.widget.FrameLayout r3, c9.a1 r4, android.view.ViewGroup r5, fg.a r6) {
            r1 = this;
            r0 = 27
            r1.f1329g = r0
            r1.<init>()
            r1.f1334l = r2
            r1.f1332j = r3
            r1.f1331i = r4
            r1.f1333k = r5
            r1.f1330h = r6
            return
    }

    public /* synthetic */ r0(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, int r6) {
            r0 = this;
            r0.f1329g = r6
            r0.f1331i = r1
            r0.f1332j = r2
            r0.f1333k = r3
            r0.f1330h = r4
            r0.f1334l = r5
            r0.<init>()
            return
    }

    private final java.lang.Object e() {
            r10 = this;
            java.lang.Object r0 = r10.f1331i
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r10.f1332j
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r10.f1333k
            e9.c r2 = (e9.c) r2
            java.lang.Object r3 = r10.f1330h
            e9.s r3 = (e9.s) r3
            java.lang.Object r4 = r10.f1334l
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r1.getValue()
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L23:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L3e
            java.lang.Object r7 = r5.next()
            r8 = r7
            e9.c r8 = (e9.c) r8
            java.lang.String r8 = r8.f2391b
            java.lang.String r9 = r2.f2391b
            boolean r8 = gg.l.a(r8, r9)
            if (r8 != 0) goto L23
            r6.add(r7)
            goto L23
        L3e:
            wb.ho.m0(r3, r1, r6)
            java.lang.String r1 = "规则已删除"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            wb.m2 r0 = wb.m2.f17592c
            r4.setValue(r0)
            sf.n r0 = sf.n.f12433a
            return r0
    }

    private final java.lang.Object f() {
            r27 = this;
            r0 = r27
            java.lang.Object r1 = r0.f1331i
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r0.f1332j
            x8.r r2 = (x8.r) r2
            java.lang.Object r3 = r0.f1333k
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r0.f1330h
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r0.f1334l
            i0.a1 r5 = (i0.a1) r5
            x8.b r6 = new x8.b
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.Object r8 = r1.getValue()
            java.util.List r8 = (java.util.List) r8
            int r8 = r8.size()
            int r8 = r8 + 1
            java.lang.String r9 = "规则 "
            java.lang.String r8 = eh.a.l(r8, r9)
            x8.s r9 = new x8.s
            r10 = 0
            r11 = 31
            r9.<init>(r11, r10, r10)
            java.util.List r26 = a.a.x0(r9)
            r9 = 1
            java.lang.String r10 = ""
            r12 = 0
            r13 = 0
            tf.v r14 = tf.v.f13169g
            r18 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r11 = r10
            r15 = r14
            r16 = r14
            r17 = r14
            r20 = r10
            r21 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26)
            java.lang.Object r8 = r1.getValue()
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r8 = tf.m.G1(r8, r6)
            wb.ho.B(r2, r1, r8)
            r3.setValue(r7)
            r4.setValue(r6)
            java.lang.String r1 = "ruleEditor"
            r5.setValue(r1)
            sf.n r1 = sf.n.f12433a
            return r1
    }

    private final java.lang.Object g() {
            r9 = this;
            java.lang.Object r0 = r9.f1331i
            qg.t r0 = (qg.t) r0
            java.lang.Object r1 = r9.f1332j
            r6 = r1
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r1 = r9.f1333k
            r3 = r1
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r1 = r9.f1330h
            r4 = r1
            fb.q1 r4 = (fb.q1) r4
            java.lang.Object r1 = r9.f1334l
            r5 = r1
            i0.a1 r5 = (i0.a1) r5
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.setValue(r1)
            f0.b r2 = new f0.b
            r7 = 0
            r8 = 10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1 = 3
            r3 = 0
            qg.v.q(r0, r3, r2, r1)
            sf.n r0 = sf.n.f12433a
            return r0
    }

    private final java.lang.Object h() {
            r6 = this;
            java.lang.Object r0 = r6.f1331i
            qg.t r0 = (qg.t) r0
            java.lang.Object r1 = r6.f1332j
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r6.f1333k
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r6.f1330h
            r.z r3 = (r.z) r3
            java.lang.Object r4 = r6.f1334l
            java.util.List r4 = (java.util.List) r4
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r1.setValue(r5)
            r1 = 1
            wb.y2.Q(r2, r1)
            ci.j r1 = new ci.j
            r2 = 22
            r5 = 0
            r1.<init>(r3, r4, r5, r2)
            r2 = 3
            qg.v.q(r0, r5, r1, r2)
            sf.n r0 = sf.n.f12433a
            return r0
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r24 = this;
            r1 = r24
            int r0 = r1.f1329g
            r2 = -1
            r3 = 3
            r4 = 1
            r5 = 0
            r6 = 0
            switch(r0) {
                case 0: goto La41;
                case 1: goto L8f5;
                case 2: goto L887;
                case 3: goto L804;
                case 4: goto L7a4;
                case 5: goto L760;
                case 6: goto L70a;
                case 7: goto L6b4;
                case 8: goto L658;
                case 9: goto L608;
                case 10: goto L5cb;
                case 11: goto L589;
                case 12: goto L54c;
                case 13: goto L50b;
                case 14: goto L453;
                case 15: goto L35b;
                case 16: goto L2be;
                case 17: goto L24f;
                case 18: goto L22a;
                case 19: goto L1d3;
                case 20: goto L16f;
                case 21: goto Lcc;
                case 22: goto L7a;
                case 23: goto L75;
                case 24: goto L70;
                case 25: goto L6b;
                case 26: goto L66;
                default: goto Lc;
            }
        Lc:
            java.lang.Object r0 = r1.f1334l
            gg.u r0 = (gg.u) r0
            java.lang.Object r2 = r1.f1332j
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            java.lang.Object r3 = r1.f1331i
            c9.a1 r3 = (c9.a1) r3
            java.lang.Object r4 = r1.f1333k
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r6 = r1.f1330h
            fg.a r6 = (fg.a) r6
            java.lang.Object r0 = r0.f4564g     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L2a
            y1.c1 r0 = (y1.c1) r0     // Catch: java.lang.Throwable -> L30
            r0.f()     // Catch: java.lang.Throwable -> L30
            goto L30
        L2a:
            java.lang.String r0 = "compose"
            gg.l.g(r0)     // Catch: java.lang.Throwable -> L30
            throw r5     // Catch: java.lang.Throwable -> L30
        L30:
            android.view.ViewParent r0 = r2.getParent()     // Catch: java.lang.Throwable -> L40
            boolean r7 = r0 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L40
            if (r7 == 0) goto L3b
            r5 = r0
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5     // Catch: java.lang.Throwable -> L40
        L3b:
            if (r5 == 0) goto L40
            r5.removeView(r2)     // Catch: java.lang.Throwable -> L40
        L40:
            x6.d.p(r2)     // Catch: java.lang.Throwable -> L43
        L43:
            x6.d.p(r4)     // Catch: java.lang.Throwable -> L46
        L46:
            androidx.lifecycle.s r0 = r3.f1096h     // Catch: java.lang.Throwable -> L60
            androidx.lifecycle.l r2 = r0.f300c     // Catch: java.lang.Throwable -> L60
            androidx.lifecycle.l r4 = androidx.lifecycle.l.f289g     // Catch: java.lang.Throwable -> L60
            if (r2 == r4) goto L56
            java.lang.String r2 = "setCurrentState"
            r0.c(r2)     // Catch: java.lang.Throwable -> L60
            r0.e(r4)     // Catch: java.lang.Throwable -> L60
        L56:
            r3.a r0 = r3.f1099k     // Catch: java.lang.Throwable -> L60
            r0.a()     // Catch: java.lang.Throwable -> L60
            androidx.lifecycle.e0 r0 = r3.f1098j     // Catch: java.lang.Throwable -> L60
            r0.a()     // Catch: java.lang.Throwable -> L60
        L60:
            r6.invoke()     // Catch: java.lang.Throwable -> L63
        L63:
            sf.n r0 = sf.n.f12433a
            return r0
        L66:
            java.lang.Object r0 = r1.h()
            return r0
        L6b:
            java.lang.Object r0 = r1.g()
            return r0
        L70:
            java.lang.Object r0 = r1.f()
            return r0
        L75:
            java.lang.Object r0 = r1.e()
            return r0
        L7a:
            java.lang.Object r0 = r1.f1331i
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f1332j
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r1.f1333k
            x9.f r3 = (x9.f) r3
            java.lang.Object r4 = r1.f1330h
            x9.e r4 = (x9.e) r4
            java.lang.Object r5 = r1.f1334l
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r7 = r2.getValue()
            java.util.List r7 = (java.util.List) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L9d:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto Lb8
            java.lang.Object r9 = r7.next()
            r10 = r9
            x9.f r10 = (x9.f) r10
            java.lang.String r10 = r10.f21416a
            java.lang.String r11 = r3.f21416a
            boolean r10 = gg.l.a(r10, r11)
            if (r10 != 0) goto L9d
            r8.add(r9)
            goto L9d
        Lb8:
            wb.ho.K1(r4, r2, r8)
            java.lang.String r2 = "关键词已删除"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r6)
            r0.show()
            wb.p4 r0 = wb.p4.f18399a
            r5.setValue(r0)
        Lc9:
            sf.n r0 = sf.n.f12433a
            return r0
        Lcc:
            java.lang.Object r0 = r1.f1331i
            wb.d6 r0 = (wb.d6) r0
            java.lang.Object r2 = r1.f1332j
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.Object r3 = r1.f1333k
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f1330h
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r6 = r1.f1334l
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r7 = r3.getValue()
            java.util.List r7 = (java.util.List) r7
            int r7 = r7.size()
            int r0 = r0.f15616a
            if (r0 < 0) goto L16a
            if (r0 >= r7) goto L16a
            java.lang.Object r7 = r3.getValue()
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r7.get(r0)
            aa.h r7 = (aa.h) r7
            java.lang.String r7 = r7.f132a
            java.lang.Object r8 = r3.getValue()
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r8 = tf.m.R1(r8)
            r8.remove(r0)
            java.lang.Object r0 = r4.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = tf.n.e1(r0)
            r9.<init>(r10)
            java.util.Iterator r0 = r0.iterator()
        L11e:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L149
            java.lang.Object r10 = r0.next()
            r11 = r10
            aa.a r11 = (aa.a) r11
            java.util.Set r10 = r11.f110g
            java.util.LinkedHashSet r17 = tf.d0.S(r10, r7)
            r21 = 0
            r22 = 1983(0x7bf, float:2.779E-42)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            aa.a r10 = aa.a.a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r9.add(r10)
            goto L11e
        L149:
            r3.setValue(r8)
            r4.setValue(r9)
            android.content.SharedPreferences$Editor r0 = r2.edit()
            java.lang.String r2 = "message_block_templates"
            java.lang.String r3 = a2.a.g(r8)
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r3)
            java.lang.String r2 = "message_block_bindings"
            java.lang.String r3 = a2.a.e(r9)
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r3)
            r0.apply()
        L16a:
            r6.setValue(r5)
            goto Lc9
        L16f:
            java.lang.Object r0 = r1.f1331i
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f1332j
            qg.t r2 = (qg.t) r2
            java.lang.Object r4 = r1.f1333k
            r8 = r4
            i0.a1 r8 = (i0.a1) r8
            java.lang.Object r4 = r1.f1330h
            r9 = r4
            i0.a1 r9 = (i0.a1) r9
            java.lang.Object r4 = r1.f1334l
            r10 = r4
            i0.a1 r10 = (i0.a1) r10
            java.lang.Object r4 = r8.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            boolean r4 = og.m.t0(r4)
            if (r4 != 0) goto L1c7
            java.lang.Object r4 = r9.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            boolean r4 = og.m.t0(r4)
            if (r4 == 0) goto L1af
            goto L1c7
        L1af:
            x8.y r0 = new x8.y
            java.lang.String r4 = "查询中"
            java.lang.String r5 = "正在查询小智控制台..."
            r0.<init>(r4, r5, r6)
            r10.setValue(r0)
            c0.m r7 = new c0.m
            r12 = 18
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            qg.v.q(r2, r11, r7, r3)
            goto L1d0
        L1c7:
            java.lang.String r2 = "请先登录并选择智能体"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r6)
            r0.show()
        L1d0:
            sf.n r0 = sf.n.f12433a
            return r0
        L1d3:
            java.lang.Object r0 = r1.f1331i
            x8.r r0 = (x8.r) r0
            java.lang.Object r2 = r1.f1332j
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r1.f1333k
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f1330h
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r1.f1334l
            i0.a1 r5 = (i0.a1) r5
            java.lang.String r7 = "新配置"
            java.lang.String r9 = wb.ho.u(r3, r7)
            java.lang.Object r7 = r3.getValue()
            java.util.List r7 = (java.util.List) r7
            x8.u r8 = new x8.u
            java.lang.String r10 = ""
            java.lang.String r11 = "https://api.siliconflow.cn/v1"
            java.lang.String r12 = "/chat/completions"
            java.lang.String r13 = "deepseek-ai/DeepSeek-V3"
            java.lang.String r14 = ""
            r15 = 10
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            java.util.ArrayList r7 = tf.m.G1(r7, r8)
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r0.n(r4, r7)
            java.util.List r0 = r0.p()
            r3.setValue(r0)
            r5.setValue(r9)
            java.lang.String r0 = "已新增 "
            java.lang.String r0 = r0.concat(r9)
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r6)
            r0.show()
            goto Lc9
        L22a:
            java.lang.Object r0 = r1.f1331i
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r1.f1332j
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.f1333k
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = r1.f1330h
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r1.f1334l
            i0.a1 r5 = (i0.a1) r5
            r4.setValue(r0)
            r5.setValue(r2)
            java.lang.String r0 = "已恢复为全局文本"
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r6)
            r0.show()
            goto Lc9
        L24f:
            java.lang.Object r0 = r1.f1331i
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f1332j
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r1.f1333k
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f1330h
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r1.f1334l
            i0.a1 r5 = (i0.a1) r5
            java.util.List r7 = wb.ho.f16655w
            jg.a r8 = jg.d.f6902g
            int r8 = r7.size()
            jg.a r9 = jg.d.f6902g
            int r8 = r9.g(r8)
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            r2.setValue(r7)
            java.util.List r2 = wb.ho.f16656x
            int r7 = r2.size()
            int r7 = r9.g(r7)
            java.lang.Object r2 = r2.get(r7)
            java.lang.String r2 = (java.lang.String) r2
            r3.setValue(r2)
            java.util.List r2 = wb.ho.f16657y
            int r3 = r2.size()
            int r3 = r9.g(r3)
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            r4.setValue(r2)
            java.util.List r2 = wb.ho.f16658z
            int r3 = r2.size()
            int r3 = r9.g(r3)
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            r5.setValue(r2)
            java.lang.String r2 = "已随机填充本群卡片"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r6)
            r0.show()
            goto Lc9
        L2be:
            java.lang.Object r0 = r1.f1331i
            wb.l4 r0 = (wb.l4) r0
            java.lang.Object r2 = r1.f1332j
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.Object r3 = r1.f1333k
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f1330h
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r1.f1334l
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r3.getValue()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            wb.k4 r0 = (wb.k4) r0
            int r0 = r0.f17192a
            if (r0 < 0) goto L354
            if (r0 >= r6) goto L354
            java.lang.Object r6 = r3.getValue()
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = r6.get(r0)
            q9.g r6 = (q9.g) r6
            java.lang.String r6 = r6.f10759a
            java.lang.Object r7 = r3.getValue()
            java.util.List r7 = (java.util.List) r7
            java.util.ArrayList r7 = tf.m.R1(r7)
            r7.remove(r0)
            r3.setValue(r7)
            java.lang.Object r0 = r4.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L311:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L32a
            java.lang.Object r8 = r0.next()
            r9 = r8
            q9.h r9 = (q9.h) r9
            java.lang.String r9 = r9.f10770c
            boolean r9 = gg.l.a(r9, r6)
            if (r9 != 0) goto L311
            r7.add(r8)
            goto L311
        L32a:
            r4.setValue(r7)
            android.content.SharedPreferences$Editor r0 = r2.edit()
            java.lang.String r2 = "group_rename_templates"
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            java.lang.String r3 = x6.d.v(r3)
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r3)
            java.lang.String r2 = "group_rename_template_bindings"
            java.lang.Object r3 = r4.getValue()
            java.util.List r3 = (java.util.List) r3
            java.lang.String r3 = x6.d.t(r3)
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r3)
            r0.apply()
        L354:
            wb.h4 r0 = wb.h4.f16488d
            r5.setValue(r0)
            goto Lc9
        L35b:
            java.lang.Object r0 = r1.f1331i
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r1.f1332j
            r3 = r0
            x8.r r3 = (x8.r) r3
            java.lang.Object r0 = r1.f1333k
            r4 = r0
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r0 = r1.f1330h
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r5 = r1.f1334l
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r7 = r0.getValue()
            java.util.Set r7 = (java.util.Set) r7
            boolean r7 = r7.contains(r2)
            if (r7 == 0) goto L389
            java.lang.Object r7 = r0.getValue()
            java.util.Set r7 = (java.util.Set) r7
            java.util.LinkedHashSet r7 = tf.d0.S(r7, r2)
            goto L393
        L389:
            java.lang.Object r7 = r0.getValue()
            java.util.Set r7 = (java.util.Set) r7
            java.util.LinkedHashSet r7 = tf.d0.V(r7, r2)
        L393:
            r0.setValue(r7)
            java.lang.Object r0 = r5.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.getClass()
            java.lang.String r5 = "zhilia_model_favorites_v1"
            r0.getClass()
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r8 = r0.toLowerCase(r8)
            r8.getClass()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3c1
            java.lang.String r9 = ""
            java.lang.String r9 = r3.h(r5, r9)     // Catch: java.lang.Throwable -> L3c1
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L3c1
            goto L3c8
        L3c1:
            r0 = move-exception
            sf.f r9 = new sf.f
            r9.<init>(r0)
            r0 = r9
        L3c8:
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            boolean r10 = r0 instanceof sf.f
            if (r10 == 0) goto L3d2
            r0 = r9
        L3d2:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            org.json.JSONArray r9 = new org.json.JSONArray
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = tf.n.e1(r7)
            r10.<init>(r11)
            java.util.Iterator r11 = r7.iterator()
        L3e6:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L3f6
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            j8.b.r(r12, r10)
            goto L3e6
        L3f6:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L3ff:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L416
            java.lang.Object r12 = r10.next()
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            int r13 = r13.length()
            if (r13 <= 0) goto L3ff
            r11.add(r12)
            goto L3ff
        L416:
            java.util.Set r10 = tf.m.T1(r11)
            java.util.List r10 = tf.m.P1(r10)
            java.util.Iterator r10 = r10.iterator()
        L422:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L432
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            r9.put(r11)
            goto L422
        L432:
            r0.put(r8, r9)
            java.lang.String r0 = r0.toString()
            r0.getClass()
            r3.k(r5, r0)
            boolean r0 = r7.contains(r2)
            if (r0 == 0) goto L448
            java.lang.String r0 = "已收藏模型"
            goto L44a
        L448:
            java.lang.String r0 = "已取消收藏"
        L44a:
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r6)
            r0.show()
            goto Lc9
        L453:
            java.lang.Object r0 = r1.f1331i
            r8 = r0
            i0.a1 r8 = (i0.a1) r8
            java.lang.Object r0 = r1.f1332j
            r9 = r0
            i0.a1 r9 = (i0.a1) r9
            java.lang.Object r0 = r1.f1333k
            r10 = r0
            android.content.SharedPreferences r10 = (android.content.SharedPreferences) r10
            java.lang.Object r0 = r1.f1330h
            r11 = r0
            i0.a1 r11 = (i0.a1) r11
            java.lang.Object r0 = r1.f1334l
            r12 = r0
            i0.a1 r12 = (i0.a1) r12
            wb.bp r0 = new wb.bp
            java.lang.String r3 = "旧版全局设置"
            java.lang.String r4 = "未命中适用聊天时继续使用下方全局设置"
            r0.<init>(r3, r2, r4)
            java.util.List r0 = a.a.x0(r0)
            java.lang.Object r3 = r8.getValue()
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = tf.n.e1(r3)
            r4.<init>(r7)
            java.util.Iterator r3 = r3.iterator()
            r7 = r6
        L48d:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L4be
            java.lang.Object r13 = r3.next()
            int r14 = r7 + 1
            if (r7 < 0) goto L4ba
            na.j r13 = (na.j) r13
            java.lang.String r15 = r13.f9151b
            boolean r16 = og.m.t0(r15)
            if (r16 == 0) goto L4ab
            java.lang.String r15 = "模板 "
            java.lang.String r15 = eh.a.l(r14, r15)
        L4ab:
            java.lang.String r13 = wb.ho.u5(r13)
            wb.bp r2 = new wb.bp
            r2.<init>(r15, r7, r13)
            r4.add(r2)
            r7 = r14
            r2 = -1
            goto L48d
        L4ba:
            a.a.Q0()
            throw r5
        L4be:
            java.util.ArrayList r0 = tf.m.F1(r0, r4)
            java.lang.Object r2 = r8.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L4cc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4ea
            java.lang.Object r3 = r2.next()
            na.j r3 = (na.j) r3
            java.lang.String r3 = r3.f9150a
            java.lang.Object r4 = r9.getValue()
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4e7
            goto L4eb
        L4e7:
            int r6 = r6 + 1
            goto L4cc
        L4ea:
            r6 = -1
        L4eb:
            java.lang.String r2 = "默认规则"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            if (r6 < 0) goto L4f4
            r5 = r3
        L4f4:
            if (r5 == 0) goto L4fb
            int r3 = r5.intValue()
            goto L4fc
        L4fb:
            r3 = -1
        L4fc:
            wb.eh r7 = new wb.eh
            r7.<init>(r8, r9, r10, r11, r12)
            wb.cp r4 = new wb.cp
            r4.<init>(r2, r0, r3, r7)
            r12.setValue(r4)
            goto Lc9
        L50b:
            java.lang.Object r0 = r1.f1331i
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.Object r2 = r1.f1332j
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.f1333k
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = r1.f1330h
            fg.a r4 = (fg.a) r4
            java.lang.Object r5 = r1.f1334l
            i0.a1 r5 = (i0.a1) r5
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.Object r5 = r5.getValue()
            java.util.Set r5 = (java.util.Set) r5
            r7 = r5
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.String r8 = ";;;"
            r11 = 0
            r12 = 62
            r9 = 0
            r10 = 0
            java.lang.String r5 = tf.m.A1(r7, r8, r9, r10, r11, r12)
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r5)
            r0.apply()
            java.lang.String r0 = "标签已保存"
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r6)
            r0.show()
            r4.invoke()
            goto Lc9
        L54c:
            java.lang.Object r0 = r1.f1331i
            fg.l r0 = (fg.l) r0
            java.lang.Object r2 = r1.f1332j
            wb.mu r2 = (wb.mu) r2
            java.lang.Object r3 = r1.f1333k
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = r1.f1330h
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r1.f1334l
            i0.a1 r5 = (i0.a1) r5
            ua.h r7 = r2.f17791b
            java.lang.Object r2 = r4.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r11 = r2.booleanValue()
            java.lang.Object r2 = r5.getValue()
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            r13 = 7
            r8 = 0
            r9 = 0
            r10 = 0
            ua.h r2 = ua.h.a(r7, r8, r9, r10, r11, r12, r13)
            r0.invoke(r2)
            java.lang.String r0 = "适用聊天已保存"
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r6)
            r0.show()
            goto Lc9
        L589:
            java.lang.Object r0 = r1.f1331i
            fg.p r0 = (fg.p) r0
            java.lang.Object r2 = r1.f1332j
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r4 = r1.f1333k
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r1.f1330h
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r7 = r1.f1334l
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r2.booleanValue()
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Integer r4 = og.t.f0(r4)
            if (r4 == 0) goto L5bc
            int r3 = r4.intValue()
            r4 = 300(0x12c, float:4.2E-43)
            int r3 = r9.e0.r(r3, r6, r4)
        L5bc:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.invoke(r2, r3)
            rb.a r0 = (rb.a) r0
            wb.ho.t4(r5, r7, r0)
            goto Lc9
        L5cb:
            java.lang.Object r0 = r1.f1331i
            fg.l r0 = (fg.l) r0
            java.lang.Object r2 = r1.f1332j
            wb.hq r2 = (wb.hq) r2
            java.lang.Object r3 = r1.f1333k
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = r1.f1330h
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r1.f1334l
            i0.a1 r5 = (i0.a1) r5
            na.i r7 = r2.f16679b
            java.lang.Object r2 = r4.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r11 = r2.booleanValue()
            java.lang.Object r2 = r5.getValue()
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            r13 = 7
            r8 = 0
            r9 = 0
            r10 = 0
            na.i r2 = na.i.a(r7, r8, r9, r10, r11, r12, r13)
            r0.invoke(r2)
            java.lang.String r0 = "适用聊天已保存"
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r6)
            r0.show()
            goto Lc9
        L608:
            java.lang.Object r0 = r1.f1331i
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f1332j
            fg.l r2 = (fg.l) r2
            java.lang.Object r3 = r1.f1333k
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f1330h
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r1.f1334l
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r3 = r3.getValue()
            wb.s0 r3 = (wb.s0) r3
            if (r3 != 0) goto L646
            java.lang.Object r3 = r4.getValue()
            java.util.Set r3 = (java.util.Set) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L646
            java.lang.Object r3 = r5.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L646
            java.lang.String r2 = "请先选择群聊"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r6)
            r0.show()
            goto L655
        L646:
            java.lang.Object r0 = r4.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = tf.m.P1(r0)
            r2.invoke(r0)
        L655:
            sf.n r0 = sf.n.f12433a
            return r0
        L658:
            java.lang.Object r0 = r1.f1331i
            wb.v0 r0 = (wb.v0) r0
            java.lang.Object r2 = r1.f1332j
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r1.f1333k
            fg.l r3 = (fg.l) r3
            java.lang.Object r4 = r1.f1330h
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r1.f1334l
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r4 = r4.iterator()
        L67b:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L69a
            java.lang.Object r8 = r4.next()
            r9 = r8
            wb.s0 r9 = (wb.s0) r9
            java.lang.Object r10 = r5.getValue()
            java.util.Set r10 = (java.util.Set) r10
            java.lang.String r9 = r9.f18970a
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L67b
            r7.add(r8)
            goto L67b
        L69a:
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L6ae
            boolean r0 = r0.f19585c
            if (r0 != 0) goto L6ae
            java.lang.String r0 = "请选择联系人"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r6)
            r0.show()
            goto L6b1
        L6ae:
            r3.invoke(r7)
        L6b1:
            sf.n r0 = sf.n.f12433a
            return r0
        L6b4:
            java.lang.Object r0 = r1.f1331i
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            java.lang.Object r2 = r1.f1332j
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            java.lang.Object r3 = r1.f1333k
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r6 = r1.f1330h
            c9.a1 r6 = (c9.a1) r6
            java.lang.Object r7 = r1.f1334l
            gg.u r7 = (gg.u) r7
            boolean r0 = r0.getAndSet(r4)
            if (r0 != 0) goto L707
            java.lang.Object r0 = r7.f4564g     // Catch: java.lang.Throwable -> L6de
            if (r0 == 0) goto L6d8
            y1.c1 r0 = (y1.c1) r0     // Catch: java.lang.Throwable -> L6de
            r0.f()     // Catch: java.lang.Throwable -> L6de
            goto L6de
        L6d8:
            java.lang.String r0 = "compose"
            gg.l.g(r0)     // Catch: java.lang.Throwable -> L6de
            throw r5     // Catch: java.lang.Throwable -> L6de
        L6de:
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r3) goto L6e7
            r3.removeView(r2)
        L6e7:
            x6.d.p(r2)
            x6.d.p(r3)
            androidx.lifecycle.s r0 = r6.f1096h
            androidx.lifecycle.l r2 = r0.f300c
            androidx.lifecycle.l r3 = androidx.lifecycle.l.f289g
            if (r2 == r3) goto L6fd
            java.lang.String r2 = "setCurrentState"
            r0.c(r2)
            r0.e(r3)
        L6fd:
            r3.a r0 = r6.f1099k
            r0.a()
            androidx.lifecycle.e0 r0 = r6.f1098j
            r0.a()
        L707:
            sf.n r0 = sf.n.f12433a
            return r0
        L70a:
            java.lang.Object r0 = r1.f1331i
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            java.lang.Object r2 = r1.f1332j
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            java.lang.Object r3 = r1.f1333k
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r6 = r1.f1330h
            c9.a1 r6 = (c9.a1) r6
            java.lang.Object r7 = r1.f1334l
            gg.u r7 = (gg.u) r7
            boolean r0 = r0.getAndSet(r4)
            if (r0 != 0) goto L75d
            java.lang.Object r0 = r7.f4564g     // Catch: java.lang.Throwable -> L734
            if (r0 == 0) goto L72e
            y1.c1 r0 = (y1.c1) r0     // Catch: java.lang.Throwable -> L734
            r0.f()     // Catch: java.lang.Throwable -> L734
            goto L734
        L72e:
            java.lang.String r0 = "compose"
            gg.l.g(r0)     // Catch: java.lang.Throwable -> L734
            throw r5     // Catch: java.lang.Throwable -> L734
        L734:
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r3) goto L73d
            r3.removeView(r2)
        L73d:
            x6.d.p(r2)
            x6.d.p(r3)
            androidx.lifecycle.s r0 = r6.f1096h
            androidx.lifecycle.l r2 = r0.f300c
            androidx.lifecycle.l r3 = androidx.lifecycle.l.f289g
            if (r2 == r3) goto L753
            java.lang.String r2 = "setCurrentState"
            r0.c(r2)
            r0.e(r3)
        L753:
            r3.a r0 = r6.f1099k
            r0.a()
            androidx.lifecycle.e0 r0 = r6.f1098j
            r0.a()
        L75d:
            sf.n r0 = sf.n.f12433a
            return r0
        L760:
            java.lang.Object r0 = r1.f1331i
            f9.h r0 = (f9.h) r0
            java.lang.Object r2 = r1.f1332j
            fg.p r2 = (fg.p) r2
            java.lang.Object r3 = r1.f1333k
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f1330h
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r1.f1334l
            i0.a1 r5 = (i0.a1) r5
            boolean r0 = r0.f3379d
            if (r0 == 0) goto L792
            java.lang.Object r0 = r3.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r0 = og.m.t0(r0)
            if (r0 == 0) goto L792
            java.lang.String r0 = "请输入金额"
            r4.setValue(r0)
            goto L7a1
        L792:
            java.lang.Object r0 = r3.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r3 = r5.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r2.invoke(r0, r3)
        L7a1:
            sf.n r0 = sf.n.f12433a
            return r0
        L7a4:
            java.lang.Object r0 = r1.f1331i
            r2 = r0
            p8.o r2 = (p8.o) r2
            java.lang.Object r0 = r1.f1332j
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Object r3 = r1.f1333k
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Object r7 = r1.f1330h
            p8.s r7 = (p8.s) r7
            java.lang.Object r8 = r1.f1334l
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L7da
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeOrThrow(r0, r5, r9)     // Catch: java.lang.Throwable -> L7da
            if (r0 == 0) goto L7c9
            java.lang.Class r9 = r3.getDeclaringClass()     // Catch: java.lang.Throwable -> L7da
            boolean r9 = r9.isInstance(r0)     // Catch: java.lang.Throwable -> L7da
            if (r9 != 0) goto L7cb
        L7c9:
            r4 = r6
            goto L7dc
        L7cb:
            java.lang.Object r6 = r7.f10416e     // Catch: java.lang.Throwable -> L7da
            r9 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L7da
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r9, r5, r8}     // Catch: java.lang.Throwable -> L7da
            h.Hchat.utils.KavaReflector.invokeOrThrow(r3, r0, r5)     // Catch: java.lang.Throwable -> L7da
            goto L7dc
        L7da:
            r0 = move-exception
            goto L7e1
        L7dc:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L7da
            goto L7e7
        L7e1:
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L7e7:
            java.lang.Throwable r3 = sf.g.b(r0)
            if (r3 == 0) goto L7fa
            fg.p r2 = r2.f10401b
            java.lang.String r4 = r7.f10412a
            java.lang.String r5 = "调用微信朋友圈原图下载失败: "
            java.lang.String r4 = r5.concat(r4)
            r2.invoke(r4, r3)
        L7fa:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L801
            r0 = r2
        L801:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            return r0
        L804:
            java.lang.Object r0 = r1.f1331i
            r2 = r0
            p8.o r2 = (p8.o) r2
            java.lang.Object r0 = r1.f1332j
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Object r3 = r1.f1333k
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Object r7 = r1.f1330h
            p8.s r7 = (p8.s) r7
            java.lang.Object r8 = r1.f1334l
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L859
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeOrThrow(r0, r5, r9)     // Catch: java.lang.Throwable -> L859
            if (r0 == 0) goto L85f
            java.lang.Class r9 = r3.getDeclaringClass()     // Catch: java.lang.Throwable -> L859
            boolean r9 = r9.isInstance(r0)     // Catch: java.lang.Throwable -> L859
            if (r9 != 0) goto L82c
            goto L85f
        L82c:
            java.lang.Object r10 = r7.f10416e     // Catch: java.lang.Throwable -> L859
            java.lang.String r6 = r7.f10412a     // Catch: java.lang.Throwable -> L859
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L859
            boolean r4 = og.m.t0(r8)     // Catch: java.lang.Throwable -> L859
            if (r4 == 0) goto L83c
            r12 = r6
            goto L83d
        L83c:
            r12 = r8
        L83d:
            java.lang.Boolean r13 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L859
            java.lang.Boolean r14 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L859
            r4 = 31
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L859
            r16 = r6
            java.lang.Object[] r4 = new java.lang.Object[]{r10, r11, r12, r13, r14, r15, r16}     // Catch: java.lang.Throwable -> L859
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeOrThrow(r3, r0, r4)     // Catch: java.lang.Throwable -> L859
            boolean r3 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L859
            if (r3 == 0) goto L85b
            r5 = r0
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L859
            goto L85b
        L859:
            r0 = move-exception
            goto L864
        L85b:
            boolean r6 = gg.l.a(r5, r14)     // Catch: java.lang.Throwable -> L859
        L85f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L859
            goto L86a
        L864:
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L86a:
            java.lang.Throwable r3 = sf.g.b(r0)
            if (r3 == 0) goto L87d
            fg.p r2 = r2.f10401b
            java.lang.String r4 = r7.f10412a
            java.lang.String r5 = "调用微信朋友圈视频下载失败: "
            java.lang.String r4 = r5.concat(r4)
            r2.invoke(r4, r3)
        L87d:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L884
            r0 = r2
        L884:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            return r0
        L887:
            java.lang.Object r0 = r1.f1331i
            r7 = r0
            ia.a0 r7 = (ia.a0) r7
            java.lang.Object r0 = r1.f1330h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f1332j
            p8.l r2 = (p8.l) r2
            java.lang.Object r3 = r1.f1333k
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r3 = r1.f1334l
            ia.c r3 = (ia.c) r3
            java.lang.String r4 = "朋友圈伪互动未找到本地记录: "
            java.lang.Object r14 = r7.f6548k
            monitor-enter(r14)
            p8.f r9 = r7.m(r8)     // Catch: java.lang.Throwable -> L8bc
            java.lang.Object r9 = r9.f10353b     // Catch: java.lang.Throwable -> L8bc
            if (r9 != 0) goto L8be
            ab.b r3 = r7.f6541d     // Catch: java.lang.Throwable -> L8bc
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8bc
            r9.<init>(r4)     // Catch: java.lang.Throwable -> L8bc
            r9.append(r8)     // Catch: java.lang.Throwable -> L8bc
            java.lang.String r4 = r9.toString()     // Catch: java.lang.Throwable -> L8bc
            r3.invoke(r4, r5)     // Catch: java.lang.Throwable -> L8bc
            goto L8df
        L8bc:
            r0 = move-exception
            goto L8f3
        L8be:
            b5.c r4 = r7.f6539b     // Catch: java.lang.Throwable -> L8bc
            ia.c r4 = r4.l(r8)     // Catch: java.lang.Throwable -> L8bc
            ia.c r11 = ia.a0.j(r3, r4)     // Catch: java.lang.Throwable -> L8bc
            ia.c r10 = r7.d(r4)     // Catch: java.lang.Throwable -> L8bc
            boolean r12 = r7.f()     // Catch: java.lang.Throwable -> L8bc
            boolean r13 = r7.e()     // Catch: java.lang.Throwable -> L8bc
            boolean r6 = r7.h(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L8bc
            if (r6 == 0) goto L8df
            b5.c r3 = r7.f6539b     // Catch: java.lang.Throwable -> L8bc
            r3.a(r8, r4)     // Catch: java.lang.Throwable -> L8bc
        L8df:
            monitor-exit(r14)
            if (r6 == 0) goto L8f0
            java.lang.ref.WeakReference r2 = r2.f10394d
            if (r2 == 0) goto L8ed
            java.lang.Object r2 = r2.get()
            r5 = r2
            android.view.View r5 = (android.view.View) r5
        L8ed:
            r7.n(r0, r5)
        L8f0:
            sf.n r0 = sf.n.f12433a
            return r0
        L8f3:
            monitor-exit(r14)
            throw r0
        L8f5:
            java.lang.Object r0 = r1.f1331i
            c9.o2 r0 = (c9.o2) r0
            java.lang.Object r2 = r1.f1330h
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r3 = r1.f1332j
            fg.a r3 = (fg.a) r3
            java.lang.Object r7 = r1.f1333k
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r8 = r1.f1334l
            fg.a r8 = (fg.a) r8
            boolean r9 = r0 instanceof c9.f1
            if (r9 == 0) goto L91d
            c9.f1 r0 = (c9.f1) r0
            java.lang.String r0 = r0.f1190b
            java.lang.Object r4 = r7.getValue()
            java.lang.String r4 = (java.lang.String) r4
            boolean r0 = c9.o2.s(r2, r0, r4)
            goto La26
        L91d:
            boolean r9 = r0 instanceof c9.g1
            if (r9 == 0) goto La3d
            c9.g1 r0 = (c9.g1) r0
            java.lang.String r0 = r0.f1198b
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = (java.lang.String) r7
            r2.getClass()
            r0.getClass()
            java.lang.Object r9 = c9.o2.f1298a
            monitor-enter(r9)
            java.lang.String r10 = c9.o2.a()     // Catch: java.lang.Throwable -> L962
            boolean r11 = og.m.t0(r10)     // Catch: java.lang.Throwable -> L962
            if (r11 == 0) goto L940
            goto La24
        L940:
            java.util.List r11 = c9.o2.j(r2, r10)     // Catch: java.lang.Throwable -> L962
            java.lang.CharSequence r0 = og.m.R0(r0)     // Catch: java.lang.Throwable -> L962
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L962
            if (r7 == 0) goto L965
            java.lang.CharSequence r7 = og.m.R0(r7)     // Catch: java.lang.Throwable -> L962
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L962
            if (r7 == 0) goto L965
            int r12 = r7.length()     // Catch: java.lang.Throwable -> L962
            if (r12 <= 0) goto L95f
            goto L960
        L95f:
            r7 = r5
        L960:
            r14 = r7
            goto L966
        L962:
            r0 = move-exception
            goto La3b
        L965:
            r14 = r5
        L966:
            java.util.Iterator r7 = r11.iterator()     // Catch: java.lang.Throwable -> L962
            r12 = r6
        L96b:
            boolean r13 = r7.hasNext()     // Catch: java.lang.Throwable -> L962
            if (r13 == 0) goto L984
            java.lang.Object r13 = r7.next()     // Catch: java.lang.Throwable -> L962
            c9.a r13 = (c9.a) r13     // Catch: java.lang.Throwable -> L962
            java.lang.String r13 = r13.f1081a     // Catch: java.lang.Throwable -> L962
            boolean r13 = gg.l.a(r13, r0)     // Catch: java.lang.Throwable -> L962
            if (r13 == 0) goto L981
            r7 = r12
            goto L985
        L981:
            int r12 = r12 + 1
            goto L96b
        L984:
            r7 = -1
        L985:
            if (r7 < 0) goto La24
            if (r14 != 0) goto L98b
            r12 = r4
            goto L9bb
        L98b:
            boolean r12 = r14.equals(r0)     // Catch: java.lang.Throwable -> L962
            if (r12 != 0) goto L9ba
            boolean r12 = r11.isEmpty()     // Catch: java.lang.Throwable -> L962
            if (r12 == 0) goto L998
            goto L9ba
        L998:
            java.util.Iterator r12 = r11.iterator()     // Catch: java.lang.Throwable -> L962
        L99c:
            boolean r13 = r12.hasNext()     // Catch: java.lang.Throwable -> L962
            if (r13 == 0) goto L9ba
            java.lang.Object r13 = r12.next()     // Catch: java.lang.Throwable -> L962
            c9.a r13 = (c9.a) r13     // Catch: java.lang.Throwable -> L962
            java.lang.String r13 = r13.f1081a     // Catch: java.lang.Throwable -> L962
            boolean r13 = gg.l.a(r13, r14)     // Catch: java.lang.Throwable -> L962
            if (r13 == 0) goto L99c
            java.util.Set r12 = c9.o2.f(r0, r11)     // Catch: java.lang.Throwable -> L962
            boolean r12 = r12.contains(r14)     // Catch: java.lang.Throwable -> L962
            r12 = r12 ^ r4
            goto L9bb
        L9ba:
            r12 = r6
        L9bb:
            if (r12 != 0) goto L9be
            goto La24
        L9be:
            boolean r12 = r11.isEmpty()     // Catch: java.lang.Throwable -> L962
            if (r12 == 0) goto L9c6
            r15 = r6
            goto L9f7
        L9c6:
            java.util.Iterator r12 = r11.iterator()     // Catch: java.lang.Throwable -> L962
            r13 = r6
        L9cb:
            boolean r15 = r12.hasNext()     // Catch: java.lang.Throwable -> L962
            if (r15 == 0) goto L9f6
            java.lang.Object r15 = r12.next()     // Catch: java.lang.Throwable -> L962
            c9.a r15 = (c9.a) r15     // Catch: java.lang.Throwable -> L962
            java.lang.String r4 = r15.f1083c     // Catch: java.lang.Throwable -> L962
            boolean r4 = gg.l.a(r4, r14)     // Catch: java.lang.Throwable -> L962
            if (r4 == 0) goto L9e9
            java.lang.String r4 = r15.f1081a     // Catch: java.lang.Throwable -> L962
            boolean r4 = gg.l.a(r4, r0)     // Catch: java.lang.Throwable -> L962
            if (r4 != 0) goto L9e9
            r4 = 1
            goto L9ea
        L9e9:
            r4 = r6
        L9ea:
            if (r4 == 0) goto L9f0
            int r13 = r13 + 1
            if (r13 < 0) goto L9f2
        L9f0:
            r4 = 1
            goto L9cb
        L9f2:
            a.a.P0()     // Catch: java.lang.Throwable -> L962
            throw r5     // Catch: java.lang.Throwable -> L962
        L9f6:
            r15 = r13
        L9f7:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L962
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L962
            java.lang.Object r4 = r0.get(r7)     // Catch: java.lang.Throwable -> L962
            r11 = r4
            c9.a r11 = (c9.a) r11     // Catch: java.lang.Throwable -> L962
            r22 = 0
            r23 = 4083(0xff3, float:5.722E-42)
            r12 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            c9.a r4 = c9.a.a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L962
            r0.set(r7, r4)     // Catch: java.lang.Throwable -> L962
            java.util.ArrayList r0 = c9.o2.l(r0)     // Catch: java.lang.Throwable -> L962
            boolean r6 = c9.o2.r(r2, r10, r0)     // Catch: java.lang.Throwable -> L962
        La24:
            monitor-exit(r9)
            r0 = r6
        La26:
            if (r0 == 0) goto La2b
            java.lang.String r4 = "聊天分组已更新"
            goto La2d
        La2b:
            java.lang.String r4 = "更新聊天分组失败"
        La2d:
            c9.j1.p(r2, r4)
            if (r0 == 0) goto La38
            c9.j1.n(r8)
            r3.invoke()
        La38:
            sf.n r5 = sf.n.f12433a
            goto La40
        La3b:
            monitor-exit(r9)
            throw r0
        La3d:
            okio.a.k()
        La40:
            return r5
        La41:
            java.lang.Object r0 = r1.f1331i
            c9.a1 r0 = (c9.a1) r0
            java.lang.Object r2 = r1.f1332j
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            java.lang.Object r3 = r1.f1333k
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r4 = r1.f1330h
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r6 = r1.f1334l
            gg.u r6 = (gg.u) r6
            java.lang.Object r6 = r6.f4564g     // Catch: java.lang.Throwable -> La65
            if (r6 == 0) goto La5f
            y1.c1 r6 = (y1.c1) r6     // Catch: java.lang.Throwable -> La65
            r6.f()     // Catch: java.lang.Throwable -> La65
            goto La65
        La5f:
            java.lang.String r6 = "compose"
            gg.l.g(r6)     // Catch: java.lang.Throwable -> La65
            throw r5     // Catch: java.lang.Throwable -> La65
        La65:
            android.view.ViewParent r6 = r2.getParent()     // Catch: java.lang.Throwable -> La75
            boolean r7 = r6 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> La75
            if (r7 == 0) goto La70
            r5 = r6
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5     // Catch: java.lang.Throwable -> La75
        La70:
            if (r5 == 0) goto La75
            r5.removeView(r2)     // Catch: java.lang.Throwable -> La75
        La75:
            x6.d.p(r2)
            x6.d.p(r3)
            androidx.lifecycle.s r2 = r0.f1096h
            androidx.lifecycle.l r3 = r2.f300c
            androidx.lifecycle.l r5 = androidx.lifecycle.l.f289g
            if (r3 == r5) goto La8b
            java.lang.String r3 = "setCurrentState"
            r2.c(r3)
            r2.e(r5)
        La8b:
            r3.a r2 = r0.f1099k
            r2.a()
            androidx.lifecycle.e0 r0 = r0.f1098j
            r0.a()
            java.util.Map r0 = c9.j1.f1229b
            r0.remove(r4)
            goto Lc9
    }
}
