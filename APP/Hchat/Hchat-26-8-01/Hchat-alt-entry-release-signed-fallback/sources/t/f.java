package t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f extends gg.j implements fg.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f12960n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12961o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12962p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12963q;

    public f(android.content.Context r7, i0.a1 r8, i0.a1 r9) {
            r6 = this;
            r0 = 1
            r6.f12960n = r0
            r6.f12961o = r7
            r6.f12962p = r8
            r6.f12963q = r9
            java.lang.Class<gg.k> r7 = gg.k.class
            java.lang.Class r2 = eh.a.i(r7)
            java.lang.String r4 = "SelectedMessagesMiuixPage$startSend(Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V"
            r5 = 0
            r1 = 0
            java.lang.String r3 = "startSend"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public f(t.h r8, x1.i1 r9, c1.b r10) {
            r7 = this;
            r0 = 0
            r7.f12960n = r0
            r7.f12961o = r8
            r7.f12962p = r9
            r7.f12963q = r10
            java.lang.String r5 = "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;"
            r6 = 0
            r2 = 0
            java.lang.Class<gg.k> r3 = gg.k.class
            java.lang.String r4 = "localRect"
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r19 = this;
            r0 = r19
            int r1 = r0.f12960n
            switch(r1) {
                case 0: goto L184;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f12961o
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r0.f12962p
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r0.f12963q
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r2.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r5 = r3.getValue()
            db.c r5 = (db.c) r5
            java.util.ArrayList r5 = wb.ho.T6(r5)
            java.lang.String r4 = a.a.a1(r4, r5)
            java.lang.String r5 = "请选择群发对象"
            r6 = 0
            if (r4 == 0) goto L31
            goto L42
        L31:
            java.lang.Object r4 = r3.getValue()
            db.c r4 = (db.c) r4
            java.util.List r4 = r4.f2173f
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L41
            r4 = r5
            goto L42
        L41:
            r4 = r6
        L42:
            r7 = 0
            if (r4 == 0) goto L4e
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r4, r7)
            r1.show()
            goto L181
        L4e:
            boolean r4 = r1 instanceof android.app.Activity
            if (r4 == 0) goto L57
            r4 = r1
            android.app.Activity r4 = (android.app.Activity) r4
            r12 = r4
            goto L58
        L57:
            r12 = r6
        L58:
            if (r12 != 0) goto L65
            java.lang.String r2 = "当前页面无法启动群发"
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r7)
            r1.show()
            goto L181
        L65:
            java.lang.Object r1 = r2.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r2 = r3.getValue()
            db.c r2 = (db.c) r2
            java.util.ArrayList r2 = wb.ho.T6(r2)
            java.lang.Object r4 = r3.getValue()
            db.c r4 = (db.c) r4
            java.util.List r4 = r4.f2173f
            java.lang.Object r8 = r3.getValue()
            db.c r8 = (db.c) r8
            int r14 = r8.f2177j
            java.lang.Object r3 = r3.getValue()
            db.c r3 = (db.c) r3
            int r3 = r3.f2178k
            java.util.ArrayList r2 = a.a.E0(r2)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = tf.n.e1(r4)
            r8.<init>(r9)
            java.util.Iterator r4 = r4.iterator()
        La2:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto Lb2
            java.lang.Object r9 = r4.next()
            java.lang.String r9 = (java.lang.String) r9
            j8.b.r(r9, r8)
            goto La2
        Lb2:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r8 = r8.iterator()
        Lbb:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Ld2
            java.lang.Object r9 = r8.next()
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = og.m.t0(r10)
            if (r10 != 0) goto Lbb
            r4.add(r9)
            goto Lbb
        Ld2:
            java.util.Set r4 = tf.m.T1(r4)
            java.util.List r15 = tf.m.P1(r4)
            java.lang.String r4 = a.a.a1(r1, r2)
            if (r4 == 0) goto Lf4
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            c9.t r2 = new c9.t
            r3 = 7
            r2.<init>(r12, r4, r3)
            r1.post(r2)
            goto L181
        Lf4:
            boolean r4 = r15.isEmpty()
            if (r4 == 0) goto Lff
            a.a.S0(r12, r5)
            goto L181
        Lff:
            hb.k0 r4 = a.a.f1g
            if (r4 == 0) goto L181
            gg.u r5 = new gg.u
            r5.<init>()
            r8 = 1
            if (r1 != r8) goto L10d
            r13 = r8
            goto L10e
        L10d:
            r13 = r7
        L10e:
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r10.<init>(r7)
            java.lang.String r1 = "Hchat_selected_messages_config"
            android.content.SharedPreferences r1 = ub.b.c(r12, r1)
            java.lang.String r9 = "selected_messages_background_silent_send"
            boolean r1 = r1.getBoolean(r9, r7)
            if (r1 == 0) goto L123
            r11 = r6
            goto L137
        L123:
            ca.p r1 = new ca.p
            r7 = 4
            r1.<init>(r10, r5, r7)
            if (r13 == 0) goto L12e
            java.lang.String r7 = "微信原生群发助手"
            goto L130
        L12e:
            java.lang.String r7 = "模块群发"
        L130:
            java.lang.String r9 = "正在发送..."
            wb.kv r1 = wb.y2.X1(r12, r1, r7, r9)
            r11 = r1
        L137:
            hb.j0 r18 = new hb.j0
            r9 = 0
            r1 = r8
            r8 = r18
            r8.<init>(r9, r10, r11, r12, r13)
            r7 = r13
            if (r7 == 0) goto L153
            hb.k r3 = r4.f5430c
            r3.getClass()
            java.util.ArrayList r2 = hb.k.c(r2)
            if (r2 == 0) goto L160
            hb.s r6 = r3.f(r2, r15, r8)
            goto L160
        L153:
            hb.c r13 = r4.f5428a
            r17 = r3
            r18 = r8
            r16 = r14
            r14 = r2
            hb.s r6 = r13.h(r14, r15, r16, r17, r18)
        L160:
            r5.f4564g = r6
            if (r6 != 0) goto L177
            r10.set(r1)
            if (r11 == 0) goto L16c
            r11.close()
        L16c:
            if (r7 == 0) goto L171
            java.lang.String r1 = "微信原生群发助手启动失败"
            goto L173
        L171:
            java.lang.String r1 = "模块群发启动失败"
        L173:
            a.a.S0(r12, r1)
            goto L181
        L177:
            if (r7 == 0) goto L17c
            java.lang.String r1 = "已开始微信原生群发"
            goto L17e
        L17c:
            java.lang.String r1 = "已开始模块群发"
        L17e:
            a.a.S0(r12, r1)
        L181:
            sf.n r1 = sf.n.f12433a
            return r1
        L184:
            java.lang.Object r1 = r0.f12961o
            t.h r1 = (t.h) r1
            java.lang.Object r2 = r0.f12962p
            x1.i1 r2 = (x1.i1) r2
            java.lang.Object r3 = r0.f12963q
            c1.b r3 = (c1.b) r3
            e1.c r1 = t.h.k1(r1, r2, r3)
            return r1
    }
}
