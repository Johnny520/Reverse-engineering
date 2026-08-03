package ua;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final java.util.List f13658j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f13659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ia.t f13660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.os.Handler f13661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sa.c f13662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f13663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p4.t f13664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public android.speech.tts.TextToSpeech f13665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayDeque f13667i;

    static {
            java.lang.String r0 = "{@sender}"
            java.lang.String r1 = "{@成员}"
            java.lang.String r2 = "{@转账的人}"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r0 = a.a.y0(r0)
            ua.k.f13658j = r0
            return
    }

    public k(android.content.Context r4, ia.t r5) {
            r3 = this;
            r3.<init>()
            r3.f13659a = r4
            r3.f13660b = r5
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r5.<init>(r0)
            r3.f13661c = r5
            sa.c r5 = new sa.c
            java.lang.String r0 = "Hchat_transfer_notify_manual_v1"
            java.lang.String r1 = "Hchat 自动收款提醒"
            java.lang.String r2 = "[Hchat:TransferNotifier]"
            r5.<init>(r4, r2, r0, r1)
            r3.f13662d = r5
            java.util.concurrent.ConcurrentHashMap$KeySetView r5 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r3.f13663e = r5
            p4.t r5 = new p4.t
            r5.<init>(r4)
            r3.f13664f = r5
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            r3.f13667i = r4
            return
    }

    public final java.lang.String a(java.lang.String r8, k8.o r9, ua.d r10, long r11) {
            r7 = this;
            java.lang.String r0 = r9.f7446c
            java.lang.String r1 = ""
            java.lang.String r2 = r10.f13601c
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto Le
            java.lang.String r2 = r9.f7447d
        Le:
            r0.getClass()
            r9 = 0
            i8.a r3 = h.Hchat.hooks.api.core.WeChatApis.contact()     // Catch: java.lang.Throwable -> L24
            r3.getClass()     // Catch: java.lang.Throwable -> L24
            g8.i r3 = h.Hchat.hooks.api.core.WeChatApis.e()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L26
            java.lang.String r3 = r3.r(r0)     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r3 = move-exception
            goto L32
        L26:
            r3 = r9
        L27:
            if (r3 != 0) goto L2a
            r3 = r1
        L2a:
            boolean r4 = og.m.t0(r3)     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L38
            r3 = r0
            goto L38
        L32:
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L38:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L3e
            r3 = r0
        L3e:
            java.lang.String r3 = (java.lang.String) r3
            r0.getClass()
            r2.getClass()
            r4 = 0
            i8.a r5 = h.Hchat.hooks.api.core.WeChatApis.contact()     // Catch: java.lang.Throwable -> L61
            r5.getClass()     // Catch: java.lang.Throwable -> L61
            g8.i r5 = h.Hchat.hooks.api.core.WeChatApis.e()     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = "@chatroom"
            boolean r6 = og.t.W(r0, r6, r4)     // Catch: java.lang.Throwable -> L61
            if (r6 == 0) goto L65
            if (r5 == 0) goto L63
            java.lang.String r0 = r5.t(r0, r2)     // Catch: java.lang.Throwable -> L61
            goto L72
        L61:
            r0 = move-exception
            goto L6c
        L63:
            r0 = r9
            goto L72
        L65:
            if (r5 == 0) goto L63
            java.lang.String r0 = r5.r(r2)     // Catch: java.lang.Throwable -> L61
            goto L72
        L6c:
            sf.f r5 = new sf.f
            r5.<init>(r0)
            r0 = r5
        L72:
            boolean r5 = r0 instanceof sf.f
            if (r5 == 0) goto L78
            goto L79
        L78:
            r9 = r0
        L79:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L7e
            goto L7f
        L7e:
            r1 = r9
        L7f:
            boolean r9 = og.m.t0(r1)
            if (r9 == 0) goto L86
            goto L87
        L86:
            r2 = r1
        L87:
            java.util.Locale r9 = java.util.Locale.US
            double r0 = r10.f13605g
            java.lang.Double r10 = java.lang.Double.valueOf(r0)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            r0 = 1
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r0)
            java.lang.String r0 = "%.2f"
            java.lang.String r9 = java.lang.String.format(r9, r0, r10)
            java.lang.String r10 = "transfer_time_format"
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            p4.t r1 = r7.f13664f
            java.lang.String r10 = r1.y(r10, r0)
            java.lang.String r10 = a.a.M(r11, r10)
            java.lang.String r11 = "{amount}"
            java.lang.String r8 = og.t.a0(r8, r11, r9, r4)
            java.lang.String r11 = "{金额}"
            java.lang.String r8 = og.t.a0(r8, r11, r9, r4)
            java.lang.String r9 = "{talker}"
            java.lang.String r8 = og.t.a0(r8, r9, r3, r4)
            java.lang.String r9 = "{会话}"
            java.lang.String r8 = og.t.a0(r8, r9, r3, r4)
            java.lang.String r9 = "{sender}"
            java.lang.String r8 = og.t.a0(r8, r9, r2, r4)
            java.lang.String r9 = "{成员}"
            java.lang.String r8 = og.t.a0(r8, r9, r2, r4)
            java.lang.String r9 = "{@sender}"
            java.lang.String r11 = "@"
            java.lang.String r12 = "\u2005"
            java.lang.String r0 = eh.a.n(r11, r2, r12)
            java.lang.String r8 = og.t.a0(r8, r9, r0, r4)
            java.lang.String r9 = "{@成员}"
            java.lang.String r0 = eh.a.n(r11, r2, r12)
            java.lang.String r8 = og.t.a0(r8, r9, r0, r4)
            java.lang.String r9 = "{@转账的人}"
            java.lang.String r11 = eh.a.n(r11, r2, r12)
            java.lang.String r8 = og.t.a0(r8, r9, r11, r4)
            java.lang.String r9 = "{time}"
            java.lang.String r8 = og.t.a0(r8, r9, r10, r4)
            return r8
    }

    public final void b(java.lang.String r14, java.lang.String r15, k8.o r16, ua.d r17, java.util.List r18, long r19, int r21) {
            r13 = this;
            r9 = r21
            boolean r0 = og.m.t0(r14)
            if (r0 != 0) goto L49
            if (r9 < 0) goto L49
            int r0 = r18.size()
            if (r9 >= r0) goto L49
            r6 = r18
            java.lang.Object r0 = r6.get(r9)
            r10 = r0
            na.h r10 = (na.h) r10
            long r0 = r10.f9141d
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L22
            r0 = r2
        L22:
            boolean r4 = r10.f9142e
            if (r4 == 0) goto L2f
            r4 = 2001(0x7d1, double:9.886E-321)
            jg.a r7 = jg.d.f6902g
            long r4 = r7.e(r2, r4)
            long r0 = r0 + r4
        L2f:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L35
            r11 = r2
            goto L36
        L35:
            r11 = r0
        L36:
            ua.j r0 = new ua.j
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10)
            android.os.Handler r14 = r13.f13661c
            r14.postDelayed(r0, r11)
        L49:
            return
    }

    public final boolean c(java.lang.String r13, java.lang.String r14, k8.o r15, ua.d r16, na.h r17, long r18) {
            r12 = this;
            r0 = r17
            java.lang.String r1 = r0.f9140c
            int r0 = r0.f9139b
            r2 = 1
            char[] r3 = new char[r2]
            r4 = 124(0x7c, float:1.74E-43)
            r5 = 0
            r3[r5] = r4
            r4 = 6
            java.util.List r3 = og.m.F0(r1, r3, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = tf.n.e1(r3)
            r4.<init>(r6)
            java.util.Iterator r3 = r3.iterator()
        L20:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L30
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            j8.b.r(r6, r4)
            goto L20
        L30:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r4.iterator()
        L39:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L50
            java.lang.Object r6 = r4.next()
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = og.m.t0(r7)
            if (r7 != 0) goto L39
            r3.add(r6)
            goto L39
        L50:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L60
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
        L5e:
            r7 = r1
            goto L73
        L60:
            jg.a r1 = jg.d.f6902g
            int r1 = r3.size()
            jg.a r4 = jg.d.f6902g
            int r1 = r4.g(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L5e
        L73:
            r1 = 2
            if (r0 == r2) goto L7c
            if (r0 == r1) goto L7c
            r3 = 8
            if (r0 != r3) goto L83
        L7c:
            r6 = r12
            r8 = r15
            r9 = r16
            r10 = r18
            goto L85
        L83:
            r3 = r7
            goto L89
        L85:
            java.lang.String r3 = r6.a(r7, r8, r9, r10)
        L89:
            java.util.List r4 = ua.k.f13658j
            if (r0 == r1) goto Laf
            if (r4 == 0) goto L96
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L96
            goto Lad
        L96:
            java.util.Iterator r1 = r4.iterator()
        L9a:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto Lad
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = og.m.h0(r7, r6, r5)
            if (r6 == 0) goto L9a
            goto Laf
        Lad:
            r1 = r5
            goto Lb0
        Laf:
            r1 = r2
        Lb0:
            java.util.Iterator r4 = r4.iterator()
            r6 = r3
        Lb5:
            boolean r8 = r4.hasNext()
            java.lang.String r9 = ""
            if (r8 == 0) goto Lc8
            java.lang.Object r8 = r4.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r6 = og.t.a0(r6, r8, r9, r5)
            goto Lb5
        Lc8:
            java.lang.CharSequence r4 = og.m.R0(r6)
            java.lang.String r4 = r4.toString()
            k8.g r6 = p.a.q()
            j8.p r8 = h.Hchat.hooks.api.core.WeChatApis.media()
            switch(r0) {
                case 1: goto L12b;
                case 2: goto L12b;
                case 3: goto L122;
                case 4: goto L117;
                case 5: goto L10a;
                case 6: goto Lff;
                case 7: goto Lf4;
                case 8: goto Leb;
                case 9: goto Ldd;
                default: goto Ldb;
            }
        Ldb:
            goto L149
        Ldd:
            if (r8 == 0) goto L149
            j8.h r14 = r8.f6820f
            if (r14 == 0) goto L149
            boolean r13 = r14.A(r13, r7)
            if (r13 != r2) goto L149
            goto L148
        Leb:
            if (r6 == 0) goto L149
            boolean r13 = r6.z(r13, r3)
            if (r13 != r2) goto L149
            goto L148
        Lf4:
            if (r8 == 0) goto L149
            androidx.lifecycle.x r14 = r8.f6819e
            boolean r13 = r14.T(r13, r7, r9)
            if (r13 != r2) goto L149
            goto L148
        Lff:
            if (r8 == 0) goto L149
            j8.f r14 = r8.f6818d
            boolean r13 = r14.v(r13, r7)
            if (r13 != r2) goto L149
            goto L148
        L10a:
            if (r8 == 0) goto L149
            bb.b r14 = r8.f6817c
            if (r14 == 0) goto L149
            boolean r13 = r14.q(r13, r7)
            if (r13 != r2) goto L149
            goto L148
        L117:
            if (r8 == 0) goto L149
            j8.y r14 = r8.f6816b
            boolean r13 = r14.t(r13, r7)
            if (r13 != r2) goto L149
            goto L148
        L122:
            if (r8 == 0) goto L149
            boolean r13 = r8.a(r13, r7)
            if (r13 != r2) goto L149
            goto L148
        L12b:
            if (r1 == 0) goto L140
            boolean r0 = og.m.t0(r14)
            if (r0 != 0) goto L140
            if (r6 == 0) goto L149
            java.util.List r14 = a.a.x0(r14)
            boolean r13 = r6.y(r13, r4, r14)
            if (r13 != r2) goto L149
            goto L148
        L140:
            if (r6 == 0) goto L149
            boolean r13 = r6.x(r13, r4)
            if (r13 != r2) goto L149
        L148:
            return r2
        L149:
            return r5
    }

    public final void d(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "hchat_transfer_"
            android.speech.tts.TextToSpeech r1 = r6.f13665g     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L27
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L25
            r2.<init>()     // Catch: java.lang.Throwable -> L25
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L25
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L25
            r5.append(r3)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L25
            r3 = 1
            int r7 = r1.speak(r7, r3, r2, r0)     // Catch: java.lang.Throwable -> L25
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L25
            goto L2f
        L25:
            r7 = move-exception
            goto L29
        L27:
            r7 = 0
            goto L2f
        L29:
            sf.f r0 = new sf.f
            r0.<init>(r7)
            r7 = r0
        L2f:
            java.lang.Throwable r7 = sf.g.b(r7)
            if (r7 == 0) goto L3c
            ia.t r0 = r6.f13660b
            java.lang.String r1 = "自动收款播报失败"
            r0.invoke(r1, r7)
        L3c:
            return
    }
}
