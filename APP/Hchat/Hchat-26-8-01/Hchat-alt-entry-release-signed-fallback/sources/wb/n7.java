package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n7 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17832i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17833j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17834k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17836m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17837n;

    public /* synthetic */ n7(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, int r8) {
            r0 = this;
            r0.f17830g = r8
            r0.f17837n = r1
            r0.f17833j = r2
            r0.f17831h = r3
            r0.f17832i = r4
            r0.f17834k = r5
            r0.f17835l = r6
            r0.f17836m = r7
            r0.<init>()
            return
    }

    public /* synthetic */ n7(java.util.List r2, android.content.Context r3, fg.l r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, java.util.List r8) {
            r1 = this;
            r0 = 1
            r1.f17830g = r0
            r1.<init>()
            r1.f17831h = r2
            r1.f17832i = r3
            r1.f17833j = r4
            r1.f17834k = r5
            r1.f17835l = r6
            r1.f17836m = r7
            r1.f17837n = r8
            return
    }

    public /* synthetic */ n7(wb.k6 r1, java.util.concurrent.atomic.AtomicBoolean r2, java.lang.String r3, i0.j1 r4, android.content.Context r5, wb.yt r6, i0.a1 r7, int r8) {
            r0 = this;
            r0.f17830g = r8
            r0.<init>()
            r0.f17837n = r1
            r0.f17833j = r2
            r0.f17831h = r3
            switch(r8) {
                case 4: goto L17;
                default: goto Le;
            }
        Le:
            r0.f17834k = r4
            r0.f17832i = r5
            r0.f17836m = r6
            r0.f17835l = r7
            return
        L17:
            r0.f17835l = r4
            r0.f17832i = r5
            r0.f17836m = r6
            r0.f17834k = r7
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r12 = this;
            int r0 = r12.f17830g
            switch(r0) {
                case 0: goto L217;
                case 1: goto L11c;
                case 2: goto La6;
                case 3: goto L7d;
                case 4: goto L52;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r12.f17837n
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            java.lang.Object r1 = r12.f17833j
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r12.f17831h
            r4 = r2
            gg.u r4 = (gg.u) r4
            java.lang.Object r2 = r12.f17832i
            r5 = r2
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            java.lang.Object r2 = r12.f17834k
            r6 = r2
            c9.a1 r6 = (c9.a1) r6
            java.lang.Object r2 = r12.f17835l
            r7 = r2
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            java.lang.Object r2 = r12.f17836m
            r8 = r2
            fg.a r8 = (fg.a) r8
            r2 = 0
            r3 = 1
            boolean r0 = r0.compareAndSet(r2, r3)
            if (r0 != 0) goto L2f
            goto L4f
        L2f:
            c9.r0 r3 = new c9.r0
            r3.<init>(r4, r5, r6, r7, r8)
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L46
            r3.invoke()
            goto L4f
        L46:
            wb.cr r0 = new wb.cr
            r2 = 2
            r0.<init>(r3, r2)
            r1.runOnUiThread(r0)
        L4f:
            sf.n r0 = sf.n.f12433a
            return r0
        L52:
            java.lang.Object r0 = r12.f17837n
            wb.k6 r0 = (wb.k6) r0
            java.lang.Object r1 = r12.f17833j
            r2 = r1
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            java.lang.Object r1 = r12.f17831h
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r12.f17835l
            r4 = r1
            i0.j1 r4 = (i0.j1) r4
            java.lang.Object r1 = r12.f17832i
            r5 = r1
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r1 = r12.f17836m
            r6 = r1
            wb.yt r6 = (wb.yt) r6
            java.lang.Object r1 = r12.f17834k
            r7 = r1
            i0.a1 r7 = (i0.a1) r7
            wb.y2.n1(r2, r3, r4, r5, r6, r7)
            r0.invoke()
        L7a:
            sf.n r0 = sf.n.f12433a
            return r0
        L7d:
            java.lang.Object r0 = r12.f17837n
            wb.k6 r0 = (wb.k6) r0
            java.lang.Object r1 = r12.f17833j
            r2 = r1
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            java.lang.Object r1 = r12.f17831h
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r12.f17834k
            r4 = r1
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r1 = r12.f17832i
            r5 = r1
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r1 = r12.f17836m
            r6 = r1
            wb.yt r6 = (wb.yt) r6
            java.lang.Object r1 = r12.f17835l
            r7 = r1
            i0.a1 r7 = (i0.a1) r7
            wb.y2.n1(r2, r3, r4, r5, r6, r7)
            r0.invoke()
            goto L7a
        La6:
            java.lang.Object r0 = r12.f17837n
            wb.b4 r0 = (wb.b4) r0
            java.lang.Object r1 = r12.f17833j
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.Object r2 = r12.f17831h
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r3 = r12.f17832i
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = r12.f17834k
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r12.f17835l
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r12.f17836m
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r7 = r4.getValue()
            java.lang.String r7 = (java.lang.String) r7
            java.util.Set r7 = wb.ho.y6(r7)
            wb.z3 r0 = (wb.z3) r0
            java.lang.String r0 = r0.f20518a
            java.util.LinkedHashSet r7 = tf.d0.S(r7, r0)
            java.lang.String r7 = wb.ho.D5(r7)
            java.lang.Object r8 = r5.getValue()
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        Le7:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L100
            java.lang.Object r10 = r8.next()
            r11 = r10
            o9.r r11 = (o9.r) r11
            java.lang.String r11 = r11.f9698a
            boolean r11 = gg.l.a(r11, r0)
            if (r11 != 0) goto Le7
            r9.add(r10)
            goto Le7
        L100:
            wb.ho.i5(r1, r0, r7, r9)
            r4.setValue(r7)
            r5.setValue(r9)
            r2.remove(r0)
            java.lang.String r0 = "群配置已删除"
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r1)
            r0.show()
            r0 = 0
            r6.setValue(r0)
            goto L7a
        L11c:
            java.lang.Object r0 = r12.f17831h
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r12.f17832i
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r12.f17833j
            fg.l r2 = (fg.l) r2
            java.lang.Object r3 = r12.f17834k
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r12.f17835l
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r12.f17836m
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r12.f17837n
            java.util.List r6 = (java.util.List) r6
            boolean r0 = r0.isEmpty()
            r7 = 0
            if (r0 == 0) goto L14a
            java.lang.String r0 = "请先新增模板"
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r7)
            r0.show()
            goto L214
        L14a:
            java.lang.Object r0 = r3.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = og.m.t0(r0)
            if (r0 == 0) goto L161
            java.lang.String r0 = "请先选择模板"
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r7)
            r0.show()
            goto L214
        L161:
            java.lang.Object r0 = r4.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L178
            java.lang.String r0 = "请先选择群"
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r7)
            r0.show()
            goto L214
        L178:
            java.lang.Object r0 = r5.getValue()
            java.util.List r0 = (java.util.List) r0
            int r1 = tf.n.e1(r0)
            int r1 = tf.y.a0(r1)
            r5 = 16
            if (r1 >= r5) goto L18b
            r1 = r5
        L18b:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L194:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b0
            java.lang.Object r1 = r0.next()
            wb.s0 r1 = (wb.s0) r1
            java.lang.String r7 = r1.f18970a
            java.lang.String r8 = r1.f18971b
            boolean r9 = og.m.t0(r8)
            if (r9 == 0) goto L1ac
            java.lang.String r8 = r1.f18970a
        L1ac:
            r5.put(r7, r8)
            goto L194
        L1b0:
            java.lang.Object r0 = r4.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = tf.n.e1(r0)
            r1.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L1c5:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L211
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r5.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L1da
            goto L202
        L1da:
            java.util.Iterator r7 = r6.iterator()
        L1de:
            boolean r8 = r7.hasNext()
            r9 = 0
            if (r8 == 0) goto L1f5
            java.lang.Object r8 = r7.next()
            r10 = r8
            o9.r r10 = (o9.r) r10
            java.lang.String r10 = r10.f9698a
            boolean r10 = gg.l.a(r10, r4)
            if (r10 == 0) goto L1de
            goto L1f6
        L1f5:
            r8 = r9
        L1f6:
            o9.r r8 = (o9.r) r8
            if (r8 == 0) goto L1fd
            java.lang.String r7 = r8.f9699b
            goto L1fe
        L1fd:
            r7 = r9
        L1fe:
            if (r7 == 0) goto L201
            goto L202
        L201:
            r7 = r4
        L202:
            java.lang.Object r8 = r3.getValue()
            java.lang.String r8 = (java.lang.String) r8
            o9.r r9 = new o9.r
            r9.<init>(r4, r7, r8)
            r1.add(r9)
            goto L1c5
        L211:
            r2.invoke(r1)
        L214:
            sf.n r0 = sf.n.f12433a
            return r0
        L217:
            java.lang.Object r0 = r12.f17837n
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r12.f17833j
            fg.l r1 = (fg.l) r1
            java.lang.Object r2 = r12.f17831h
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r12.f17832i
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = r12.f17834k
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r12.f17835l
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r12.f17836m
            i0.a1 r6 = (i0.a1) r6
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.Iterator r8 = r0.iterator()
        L23c:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L24e
            java.lang.Object r9 = r8.next()
            e9.c r9 = (e9.c) r9
            java.lang.String r9 = r9.f2391b
            r7.add(r9)
            goto L23c
        L24e:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r4.setValue(r8)
            r5.setValue(r8)
            tf.v r4 = tf.v.f13169g
            r6.setValue(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L264:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L27d
            java.lang.Object r5 = r2.next()
            r6 = r5
            e9.c r6 = (e9.c) r6
            java.lang.String r6 = r6.f2391b
            boolean r6 = r7.contains(r6)
            if (r6 != 0) goto L264
            r4.add(r5)
            goto L264
        L27d:
            r1.invoke(r4)
            int r0 = r0.size()
            java.lang.String r1 = "已删除 "
            java.lang.String r2 = " 个会话规则"
            r4 = 0
            wb.en.o(r1, r0, r2, r3, r4)
            goto L7a
    }
}
