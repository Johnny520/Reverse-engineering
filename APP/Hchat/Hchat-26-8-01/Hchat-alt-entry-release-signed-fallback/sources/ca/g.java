package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ca.e0 f1505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f1506i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p8.v f1507j;

    public /* synthetic */ g(ca.e0 r1, android.app.Activity r2, p8.v r3, int r4) {
            r0 = this;
            r0.f1504g = r4
            r0.f1505h = r1
            r0.f1506i = r2
            r0.f1507j = r3
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r14) {
            r13 = this;
            int r0 = r13.f1504g
            switch(r0) {
                case 0: goto L65;
                case 1: goto L35;
                case 2: goto L1e;
                default: goto L5;
            }
        L5:
            java.util.List r14 = (java.util.List) r14
            r14.getClass()
            ca.m r0 = new ca.m
            r1 = 1
            ca.e0 r2 = r13.f1505h
            android.app.Activity r3 = r13.f1506i
            r0.<init>(r2, r3, r14, r1)
            p8.v r14 = r13.f1507j
            java.lang.String r1 = "转发至标签"
            r2.k(r3, r14, r1, r0)
        L1b:
            sf.n r14 = sf.n.f12433a
            return r14
        L1e:
            java.util.List r14 = (java.util.List) r14
            r14.getClass()
            ca.m r0 = new ca.m
            r1 = 0
            ca.e0 r2 = r13.f1505h
            android.app.Activity r3 = r13.f1506i
            r0.<init>(r2, r3, r14, r1)
            p8.v r14 = r13.f1507j
            java.lang.String r1 = "转发给好友"
            r2.k(r3, r14, r1, r0)
            goto L1b
        L35:
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r0 = 0
            r1 = 1
            if (r14 != r1) goto L41
            r6 = r1
            goto L42
        L41:
            r6 = r0
        L42:
            if (r6 != r1) goto L46
            r12 = r1
            goto L47
        L46:
            r12 = r0
        L47:
            if (r12 == 0) goto L4d
            java.lang.String r14 = "选择官方群发好友"
        L4b:
            r10 = r14
            goto L50
        L4d:
            java.lang.String r14 = "选择群发对象"
            goto L4b
        L50:
            ca.k r2 = new ca.k
            r7 = 0
            ca.e0 r3 = r13.f1505h
            android.app.Activity r4 = r13.f1506i
            p8.v r5 = r13.f1507j
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.String r11 = "发送"
            r9 = r2
            r7 = r3
            r8 = r4
            r7.p(r8, r9, r10, r11, r12)
            goto L1b
        L65:
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            ca.e0 r0 = r13.f1505h
            android.app.Activity r1 = r13.f1506i
            p8.v r2 = r13.f1507j
            if (r14 == 0) goto Le6
            r3 = 1
            if (r14 == r3) goto Ld3
            r3 = 2
            if (r14 == r3) goto Lc7
            r3 = 3
            if (r14 == r3) goto L96
            r3 = 4
            if (r14 == r3) goto L81
            goto Lf2
        L81:
            r0.getClass()
            ca.g r14 = new ca.g
            r3 = 3
            r14.<init>(r0, r1, r2, r3)
            ca.l r2 = new ca.l
            r2.<init>(r0, r1, r14)
            java.lang.String r14 = "转发至标签"
            r3 = 0
            r0.e(r1, r2, r14, r3)
            goto Lf2
        L96:
            r0.getClass()
            sf.e r14 = new sf.e
            java.lang.String r3 = "模块通道"
            java.lang.String r4 = "支持好友、群聊、公众号和标签"
            r14.<init>(r3, r4)
            sf.e r3 = new sf.e
            java.lang.String r4 = "微信原生群发助手"
            java.lang.String r5 = "仅选择好友并按原生队列发送"
            r3.<init>(r4, r5)
            sf.e[] r14 = new sf.e[]{r14, r3}
            java.util.List r4 = a.a.y0(r14)
            ca.g r5 = new ca.g
            r14 = 1
            r5.<init>(r0, r1, r2, r14)
            bi.c r6 = new bi.c
            r14 = 7
            r6.<init>(r14)
            java.lang.String r2 = "选择群发通道"
            java.lang.String r3 = ""
            wb.y2.R1(r1, r2, r3, r4, r5, r6)
            goto Lf2
        Lc7:
            ca.o r14 = new ca.o
            r3 = 3
            r14.<init>(r0, r1, r3)
            java.lang.String r3 = "分享朋友圈"
            r0.k(r1, r2, r3, r14)
            goto Lf2
        Ld3:
            r0.getClass()
            r14 = r2
            ca.g r2 = new ca.g
            r3 = 2
            r2.<init>(r0, r1, r14, r3)
            java.lang.String r3 = "选择转发对象"
            java.lang.String r4 = "转发"
            r5 = 0
            r0.p(r1, r2, r3, r4, r5)
            goto Lf2
        Le6:
            r14 = r2
            ca.o r2 = new ca.o
            r3 = 2
            r2.<init>(r0, r1, r3)
            java.lang.String r3 = "转发到朋友圈"
            r0.k(r1, r14, r3, r2)
        Lf2:
            sf.n r14 = sf.n.f12433a
            return r14
    }
}
