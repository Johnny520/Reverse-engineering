package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qs implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f18719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18721j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18722k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.j1 f18723l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ wb.yt f18724m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.j1 f18725n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18726o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18727p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18728q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18731t;

    public /* synthetic */ qs(android.content.Context r2, java.lang.String r3, i0.j1 r4, i0.a1 r5, i0.j1 r6, wb.yt r7, i0.j1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12, i0.a1 r13, i0.a1 r14) {
            r1 = this;
            r0 = 1
            r1.f18718g = r0
            r1.<init>()
            r1.f18719h = r2
            r1.f18720i = r3
            r1.f18721j = r4
            r1.f18722k = r5
            r1.f18723l = r6
            r1.f18724m = r7
            r1.f18725n = r8
            r1.f18726o = r9
            r1.f18727p = r10
            r1.f18728q = r11
            r1.f18729r = r12
            r1.f18730s = r13
            r1.f18731t = r14
            return
    }

    public /* synthetic */ qs(i0.j1 r2, i0.j1 r3, java.lang.String r4, android.content.Context r5, wb.yt r6, i0.j1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12, i0.a1 r13, i0.a1 r14) {
            r1 = this;
            r0 = 0
            r1.f18718g = r0
            r1.<init>()
            r1.f18723l = r2
            r1.f18721j = r3
            r1.f18720i = r4
            r1.f18719h = r5
            r1.f18724m = r6
            r1.f18725n = r7
            r1.f18722k = r8
            r1.f18726o = r9
            r1.f18727p = r10
            r1.f18728q = r11
            r1.f18729r = r12
            r1.f18730s = r13
            r1.f18731t = r14
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r20) {
            r19 = this;
            r0 = r19
            int r1 = r0.f18718g
            switch(r1) {
                case 0: goto Le8;
                default: goto L7;
            }
        L7:
            android.content.Context r5 = r0.f18719h
            java.lang.String r4 = r0.f18720i
            i0.a1 r3 = r0.f18721j
            i0.a1 r8 = r0.f18722k
            i0.j1 r2 = r0.f18723l
            wb.yt r6 = r0.f18724m
            i0.j1 r7 = r0.f18725n
            i0.a1 r9 = r0.f18726o
            i0.a1 r10 = r0.f18727p
            i0.a1 r11 = r0.f18728q
            i0.a1 r12 = r0.f18729r
            i0.a1 r13 = r0.f18730s
            i0.a1 r14 = r0.f18731t
            r1 = r20
            fb.d1 r1 = (fb.d1) r1
            r1.getClass()
            boolean r15 = r1.f3495m
            r16 = r2
            java.lang.String r2 = r1.f3483a
            r17 = r3
            r3 = 0
            if (r15 == 0) goto L3e
            java.lang.String r1 = "请先解锁该对话"
            android.widget.Toast r1 = android.widget.Toast.makeText(r5, r1, r3)
            r1.show()
            goto Le5
        L3e:
            java.util.concurrent.ConcurrentHashMap r15 = wb.vt.f19843a
            r2.getClass()
            java.util.concurrent.ConcurrentHashMap r15 = wb.vt.f19843a
            java.lang.Object r18 = r15.get(r2)
            r3 = r18
            wb.yt r3 = (wb.yt) r3
            if (r3 == 0) goto L82
            boolean r18 = r3.L()
            if (r18 != 0) goto L77
            r18 = r6
            i0.j1 r6 = r3.E
            java.lang.Object r6 = r6.getValue()
            if (r6 != 0) goto L77
            i0.j1 r6 = r3.D
            java.lang.Object r6 = r6.getValue()
            if (r6 != 0) goto L77
            i0.j1 r6 = r3.B
            java.lang.Object r6 = r6.getValue()
            if (r6 != 0) goto L77
            i0.j1 r3 = r3.C
            java.lang.Object r3 = r3.getValue()
            if (r3 == 0) goto L84
        L77:
            java.lang.String r1 = "该对话正在运行或有待确认操作，请先处理后再删除"
            r2 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r5, r1, r2)
            r1.show()
            goto Le5
        L82:
            r18 = r6
        L84:
            boolean r3 = r2.equals(r4)
            if (r3 == 0) goto L91
            java.lang.Object r1 = r17.getValue()
            fb.c1 r1 = (fb.c1) r1
            goto L93
        L91:
            fb.c1 r1 = r1.f3497o
        L93:
            wb.y2.F0(r5, r1)
            fb.g1 r1 = fb.g1.f3523a
            fb.g1.e(r5, r2)
            r15.remove(r2)
            java.lang.String r1 = wb.vt.f19844b
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto La9
            r1 = 0
            wb.vt.f19844b = r1
        La9:
            java.lang.Object r1 = r8.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r1 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8.setValue(r1)
            boolean r1 = r2.equals(r4)
            if (r1 == 0) goto Le5
            java.util.List r1 = fb.g1.i(r5)
            java.lang.Object r1 = tf.m.v1(r1)
            r15 = r1
            fb.d1 r15 = (fb.d1) r15
            if (r15 != 0) goto Lda
            r15 = 0
            r2 = r16
            r3 = r17
            r6 = r18
            wb.y2.k1(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto Le5
        Lda:
            r2 = r16
            r3 = r17
            r6 = r18
            r16 = 0
            wb.y2.l1(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        Le5:
            sf.n r1 = sf.n.f12433a
            return r1
        Le8:
            i0.j1 r2 = r0.f18723l
            i0.a1 r3 = r0.f18721j
            java.lang.String r4 = r0.f18720i
            android.content.Context r5 = r0.f18719h
            wb.yt r6 = r0.f18724m
            i0.j1 r7 = r0.f18725n
            i0.a1 r8 = r0.f18722k
            i0.a1 r9 = r0.f18726o
            i0.a1 r10 = r0.f18727p
            i0.a1 r11 = r0.f18728q
            i0.a1 r12 = r0.f18729r
            i0.a1 r13 = r0.f18730s
            i0.a1 r14 = r0.f18731t
            r15 = r20
            fb.d1 r15 = (fb.d1) r15
            r15.getClass()
            r16 = 1
            wb.y2.l1(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
