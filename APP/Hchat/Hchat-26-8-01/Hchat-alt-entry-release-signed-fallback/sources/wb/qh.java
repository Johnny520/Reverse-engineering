package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qh implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f18653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f18654i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.l f18655j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ db.c f18656k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f18657l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f18658m;

    public /* synthetic */ qh(android.app.Activity r2, long r3, java.util.List r5, fg.l r6, db.c r7, int r8) {
            r1 = this;
            r0 = 1
            r1.f18652g = r0
            r1.<init>()
            r1.f18658m = r2
            r1.f18653h = r3
            r1.f18654i = r5
            r1.f18655j = r6
            r1.f18656k = r7
            r1.f18657l = r8
            return
    }

    public /* synthetic */ qh(android.content.Context r2, java.util.List r3, long r4, fg.l r6, db.c r7, int r8) {
            r1 = this;
            r0 = 0
            r1.f18652g = r0
            r1.<init>()
            r1.f18658m = r2
            r1.f18654i = r3
            r1.f18653h = r4
            r1.f18655j = r6
            r1.f18656k = r7
            r1.f18657l = r8
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r10 = this;
            int r0 = r10.f18652g
            switch(r0) {
                case 0: goto L20;
                default: goto L5;
            }
        L5:
            android.content.Context r0 = r10.f18658m
            android.app.Activity r0 = (android.app.Activity) r0
            ca.k r1 = new ca.k
            r6 = 9
            java.util.List r2 = r10.f18654i
            fg.l r3 = r10.f18655j
            db.c r4 = r10.f18656k
            int r5 = r10.f18657l
            r1.<init>(r2, r3, r4, r5, r6)
            long r2 = r10.f18653h
            wb.ho.g7(r0, r2, r1)
            sf.n r0 = sf.n.f12433a
            return r0
        L20:
            android.content.Context r0 = r10.f18658m
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L2b
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
        L29:
            r2 = r1
            goto L2d
        L2b:
            r1 = 0
            goto L29
        L2d:
            r1 = 0
            if (r2 != 0) goto L3a
            java.lang.String r2 = "当前页面无法打开时间选择器"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r1)
            r0.show()
            goto L91
        L3a:
            java.util.List r6 = r10.f18654i
            int r0 = r6.size()
            r3 = 1
            if (r0 <= r3) goto L44
            r1 = r3
        L44:
            r3 = r2
            wb.qh r2 = new wb.qh
            long r4 = r10.f18653h
            fg.l r7 = r10.f18655j
            db.c r8 = r10.f18656k
            int r9 = r10.f18657l
            r2.<init>(r3, r4, r6, r7, r8, r9)
            wb.gh r0 = new wb.gh
            r0.<init>(r7, r8, r6, r9)
            uf.c r4 = a.a.E()
            sf.e r5 = new sf.e
            java.lang.String r6 = "修改时间"
            java.lang.String r7 = "重新选择该计划时间"
            r5.<init>(r6, r7)
            r4.add(r5)
            if (r1 == 0) goto L75
            sf.e r1 = new sf.e
            java.lang.String r5 = "删除时间"
            java.lang.String r6 = "从当前任务移除该计划时间"
            r1.<init>(r5, r6)
            r4.add(r1)
        L75:
            uf.c r5 = a.a.t(r4)
            wb.l7 r6 = new wb.l7
            r1 = 14
            r6.<init>(r2, r1, r0)
            k.s1 r7 = new k.s1
            r0 = 25
            r7.<init>(r0)
            wb.lv r8 = wb.lv.f17583j
            r2 = r3
            java.lang.String r3 = "计划时间"
            java.lang.String r4 = ""
            wb.y2.Q1(r2, r3, r4, r5, r6, r7, r8)
        L91:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
