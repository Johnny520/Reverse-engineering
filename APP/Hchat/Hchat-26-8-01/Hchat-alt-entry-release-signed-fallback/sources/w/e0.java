package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f14441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f14442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f14443l;

    public /* synthetic */ e0(java.lang.Object r1, java.lang.Object r2, i0.a1 r3, i0.a1 r4, wf.c r5, int r6) {
            r0 = this;
            r0.f14439h = r6
            r0.f14440i = r1
            r0.f14441j = r2
            r0.f14442k = r3
            r0.f14443l = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    public /* synthetic */ e0(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, wf.c r4, int r5) {
            r0 = this;
            r0.f14439h = r5
            r0.f14441j = r1
            r0.f14442k = r2
            r0.f14443l = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r10, wf.c r11) {
            r9 = this;
            int r0 = r9.f14439h
            switch(r0) {
                case 0: goto L71;
                case 1: goto L58;
                case 2: goto L3b;
                case 3: goto L1e;
                default: goto L5;
            }
        L5:
            w.e0 r1 = new w.e0
            java.lang.Object r0 = r9.f14441j
            r2 = r0
            i.c r2 = (i.c) r2
            java.lang.Object r0 = r9.f14442k
            r3 = r0
            i.c r3 = (i.c) r3
            java.lang.Object r0 = r9.f14443l
            r4 = r0
            i.c r4 = (i.c) r4
            r6 = 4
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r1.f14440i = r10
            return r1
        L1e:
            r6 = r11
            w.e0 r2 = new w.e0
            java.lang.Object r10 = r9.f14440i
            r3 = r10
            wb.s5 r3 = (wb.s5) r3
            java.lang.Object r10 = r9.f14441j
            r4 = r10
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.lang.Object r10 = r9.f14442k
            r5 = r10
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r10 = r9.f14443l
            i0.a1 r10 = (i0.a1) r10
            r8 = 3
            r7 = r6
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        L3b:
            r6 = r11
            w.e0 r2 = new w.e0
            java.lang.Object r10 = r9.f14440i
            r3 = r10
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r10 = r9.f14441j
            r4 = r10
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r10 = r9.f14442k
            r5 = r10
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r10 = r9.f14443l
            i0.a1 r10 = (i0.a1) r10
            r8 = 2
            r7 = r6
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        L58:
            r6 = r11
            w.e0 r2 = new w.e0
            java.lang.Object r11 = r9.f14441j
            r3 = r11
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r11 = r9.f14442k
            r4 = r11
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r11 = r9.f14443l
            r5 = r11
            i0.a1 r5 = (i0.a1) r5
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            r2.f14440i = r10
            return r2
        L71:
            r6 = r11
            w.e0 r2 = new w.e0
            java.lang.Object r11 = r9.f14441j
            r3 = r11
            s1.x r3 = (s1.x) r3
            java.lang.Object r11 = r9.f14442k
            r4 = r11
            w.y0 r4 = (w.y0) r4
            java.lang.Object r11 = r9.f14443l
            r5 = r11
            h0.d1 r5 = (h0.d1) r5
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r2.f14440i = r10
            return r2
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f14439h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L39;
                case 1: goto L2d;
                case 2: goto L21;
                case 3: goto L15;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            w.e0 r2 = (w.e0) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
        L15:
            wf.c r2 = r1.create(r2, r3)
            w.e0 r2 = (w.e0) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
        L21:
            wf.c r2 = r1.create(r2, r3)
            w.e0 r2 = (w.e0) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
        L2d:
            wf.c r2 = r1.create(r2, r3)
            w.e0 r2 = (w.e0) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
        L39:
            wf.c r2 = r1.create(r2, r3)
            w.e0 r2 = (w.e0) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.f14439h
            r1 = 0
            sf.n r2 = sf.n.f12433a
            java.lang.Object r3 = r12.f14443l
            java.lang.Object r4 = r12.f14442k
            java.lang.Object r5 = r12.f14441j
            switch(r0) {
                case 0: goto L117;
                case 1: goto Lbe;
                case 2: goto L75;
                case 3: goto L3a;
                default: goto Le;
            }
        Le:
            java.lang.Object r0 = r12.f14440i
            qg.t r0 = (qg.t) r0
            f8.i.I0(r13)
            wb.n3 r13 = new wb.n3
            i.c r5 = (i.c) r5
            r6 = 7
            r13.<init>(r5, r1, r6)
            r5 = 3
            qg.v.q(r0, r1, r13, r5)
            wb.n3 r13 = new wb.n3
            i.c r4 = (i.c) r4
            r6 = 8
            r13.<init>(r4, r1, r6)
            qg.v.q(r0, r1, r13, r5)
            wb.n3 r13 = new wb.n3
            i.c r3 = (i.c) r3
            r4 = 9
            r13.<init>(r3, r1, r4)
            qg.v.q(r0, r1, r13, r5)
            return r2
        L3a:
            f8.i.I0(r13)
            java.lang.Object r13 = r12.f14440i
            wb.s5 r13 = (wb.s5) r13
            boolean r13 = r13.f18991c
            if (r13 == 0) goto L74
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            android.content.SharedPreferences$Editor r13 = r5.edit()
            i0.a1 r4 = (i0.a1) r4
            og.k r0 = wb.ho.f16633a
            java.lang.Object r0 = r4.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.String r0 = a2.a.g(r0)
            java.lang.String r1 = "message_block_templates"
            android.content.SharedPreferences$Editor r13 = r13.putString(r1, r0)
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r0 = r3.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.String r0 = a2.a.e(r0)
            java.lang.String r1 = "message_block_bindings"
            android.content.SharedPreferences$Editor r13 = r13.putString(r1, r0)
            r13.apply()
        L74:
            return r2
        L75:
            f8.i.I0(r13)
            i0.a1 r5 = (i0.a1) r5
            i0.a1 r4 = (i0.a1) r4
            i0.a1 r3 = (i0.a1) r3
            wb.la r13 = new wb.la
            r0 = 17
            r13.<init>(r5, r4, r3, r0)
            og.k r0 = wb.ho.f16633a
            g8.i r0 = wb.en.c()
            if (r0 == 0) goto Lae
            boolean r1 = r0.G()
            if (r1 != 0) goto L94
            goto Lae
        L94:
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r1.<init>(r3)
            java.lang.Thread r3 = new java.lang.Thread
            r8.b r4 = new r8.b
            r5 = 4
            r4.<init>(r0, r1, r13, r5)
            java.lang.String r13 = "HchatMessageBlockContacts"
            r3.<init>(r4, r13)
            r3.start()
            goto Lbd
        Lae:
            wb.j5 r0 = new wb.j5
            r0.<init>()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r3 = "联系人列表不可用"
            r1.<init>(r3)
            r13.invoke(r0, r1)
        Lbd:
            return r2
        Lbe:
            java.lang.Object r0 = r12.f14440i
            r7 = r0
            qg.t r7 = (qg.t) r7
            f8.i.I0(r13)
            r13 = r5
            i0.a1 r13 = (i0.a1) r13
            og.k r0 = wb.ho.f16633a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r13.setValue(r0)
            r0 = r4
            i0.a1 r0 = (i0.a1) r0
            java.lang.String r1 = ""
            r0.setValue(r1)
            i8.a r1 = h.Hchat.hooks.api.core.WeChatApis.contact()
            r1.getClass()
            g8.i r8 = h.Hchat.hooks.api.core.WeChatApis.e()
            if (r8 == 0) goto L105
            boolean r1 = r8.G()
            if (r1 != 0) goto Lec
            goto L105
        Lec:
            java.lang.Thread r13 = new java.lang.Thread
            r9 = r3
            i0.a1 r9 = (i0.a1) r9
            r10 = r4
            i0.a1 r10 = (i0.a1) r10
            r11 = r5
            i0.a1 r11 = (i0.a1) r11
            b9.c r6 = new b9.c
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.String r0 = "HchatAutoReplyLabels"
            r13.<init>(r6, r0)
            r13.start()
            goto L116
        L105:
            i0.a1 r3 = (i0.a1) r3
            tf.t r1 = tf.t.f13167g
            r3.setValue(r1)
            java.lang.String r1 = "联系人标签不可用"
            r0.setValue(r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r13.setValue(r0)
        L116:
            return r2
        L117:
            f8.i.I0(r13)
            java.lang.Object r13 = r12.f14440i
            qg.t r13 = (qg.t) r13
            w.d0 r0 = new w.d0
            s1.x r5 = (s1.x) r5
            w.y0 r4 = (w.y0) r4
            r6 = 0
            r0.<init>(r5, r4, r1, r6)
            r4 = 1
            qg.v.q(r13, r1, r0, r4)
            ci.j r0 = new ci.j
            h0.d1 r3 = (h0.d1) r3
            r6 = 18
            r0.<init>(r5, r3, r1, r6)
            qg.v.q(r13, r1, r0, r4)
            return r2
    }
}
