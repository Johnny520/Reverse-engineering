package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class np implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gb.o f17955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f17956i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ qg.t f17957j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17958k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17959l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17960m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17961n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17962o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17963p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17964q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17965r;

    public /* synthetic */ np(gb.o r2, android.content.Context r3, qg.t r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12) {
            r1 = this;
            r0 = 1
            r1.f17954g = r0
            r1.<init>()
            r1.f17955h = r2
            r1.f17956i = r3
            r1.f17957j = r4
            r1.f17958k = r5
            r1.f17959l = r6
            r1.f17960m = r7
            r1.f17961n = r8
            r1.f17962o = r9
            r1.f17963p = r10
            r1.f17964q = r11
            r1.f17965r = r12
            return
    }

    public /* synthetic */ np(gb.o r2, qg.t r3, i0.a1 r4, i0.a1 r5, android.content.Context r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12) {
            r1 = this;
            r0 = 0
            r1.f17954g = r0
            r1.<init>()
            r1.f17955h = r2
            r1.f17957j = r3
            r1.f17958k = r4
            r1.f17959l = r5
            r1.f17956i = r6
            r1.f17960m = r7
            r1.f17961n = r8
            r1.f17962o = r9
            r1.f17963p = r10
            r1.f17964q = r11
            r1.f17965r = r12
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r13 = this;
            int r0 = r13.f17954g
            switch(r0) {
                case 0: goto L69;
                default: goto L5;
            }
        L5:
            i0.a1 r11 = r13.f17958k
            java.lang.Object r0 = r11.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L14
            goto L66
        L14:
            i0.a1 r0 = r13.f17959l
            java.lang.Object r0 = r0.getValue()
            gb.s r0 = (gb.s) r0
            android.content.Context r3 = r13.f17956i
            i0.a1 r10 = r13.f17960m
            if (r0 != 0) goto L39
            java.lang.Object r0 = r10.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L30
            java.lang.String r0 = "当前微信账号资料尚未就绪"
        L30:
            r1 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r1)
            r0.show()
            goto L66
        L39:
            i0.a1 r5 = r13.f17961n
            java.lang.Object r0 = r5.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r11.setValue(r0)
            java.lang.String r0 = ""
            r10.setValue(r0)
            wb.cq r1 = new wb.cq
            r12 = 0
            gb.o r4 = r13.f17955h
            i0.a1 r6 = r13.f17962o
            i0.a1 r7 = r13.f17963p
            i0.a1 r8 = r13.f17964q
            i0.a1 r9 = r13.f17965r
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = 3
            qg.t r2 = r13.f17957j
            r3 = 0
            qg.v.q(r2, r3, r1, r0)
        L66:
            sf.n r0 = sf.n.f12433a
            return r0
        L69:
            i0.a1 r4 = r13.f17958k
            java.lang.Object r0 = r4.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto La0
            i0.a1 r0 = r13.f17959l
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L7e
            goto La0
        L7e:
            gb.o r3 = r13.f17955h
            java.lang.String r0 = r3.f4449a
            r4.setValue(r0)
            k.g1 r1 = new k.g1
            r11 = 0
            android.content.Context r2 = r13.f17956i
            i0.a1 r5 = r13.f17960m
            i0.a1 r6 = r13.f17961n
            i0.a1 r7 = r13.f17962o
            i0.a1 r8 = r13.f17963p
            i0.a1 r9 = r13.f17964q
            i0.a1 r10 = r13.f17965r
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = 3
            qg.t r2 = r13.f17957j
            r3 = 0
            qg.v.q(r2, r3, r1, r0)
        La0:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
