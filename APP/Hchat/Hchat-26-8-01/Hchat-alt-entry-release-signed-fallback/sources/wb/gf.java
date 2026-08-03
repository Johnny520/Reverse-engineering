package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gf implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f16388h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16389i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16390j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16391k;

    public /* synthetic */ gf(android.content.Context r2, boolean r3, ba.n r4, fg.a r5) {
            r1 = this;
            r0 = 0
            r1.f16387g = r0
            r1.<init>()
            r1.f16389i = r2
            r1.f16388h = r3
            r1.f16390j = r4
            r1.f16391k = r5
            return
    }

    public /* synthetic */ gf(boolean r2, i0.a1 r3, i0.a1 r4, i0.a1 r5) {
            r1 = this;
            r0 = 1
            r1.f16387g = r0
            r1.<init>()
            r1.f16388h = r2
            r1.f16389i = r3
            r1.f16390j = r4
            r1.f16391k = r5
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r14 = this;
            int r0 = r14.f16387g
            switch(r0) {
                case 0: goto L48;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r14.f16389i
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r1 = r14.f16390j
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r14.f16391k
            i0.a1 r2 = (i0.a1) r2
            boolean r3 = r14.f16388h
            if (r3 == 0) goto L45
            java.lang.Object r3 = r0.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r3 = r3 ^ 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.setValue(r3)
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L45
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setValue(r0)
            java.lang.Object r0 = r2.getValue()
            n1.a r0 = (n1.a) r0
            r1 = 6
            n1.c r0 = (n1.c) r0
            r0.a(r1)
        L45:
            sf.n r0 = sf.n.f12433a
            return r0
        L48:
            java.lang.Object r0 = r14.f16389i
            r3 = r0
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r0 = r14.f16390j
            r4 = r0
            ba.n r4 = (ba.n) r4
            java.lang.Object r0 = r14.f16391k
            r5 = r0
            fg.a r5 = (fg.a) r5
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L60
            r0 = r3
            android.app.Activity r0 = (android.app.Activity) r0
        L5e:
            r2 = r0
            goto L62
        L60:
            r0 = 0
            goto L5e
        L62:
            if (r2 == 0) goto Lb0
            c9.n0 r1 = new c9.n0
            r6 = 15
            r13 = r5
            r5 = r3
            r3 = r4
            r4 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            r0 = r4
            r4 = r3
            r3 = r5
            r5 = r0
            r0 = r2
            boolean r2 = r14.f16388h
            if (r2 != 0) goto L7c
            r1.invoke()
            goto Lb0
        L7c:
            java.lang.String r7 = r4.f615h
            sf.e r2 = new sf.e
            java.lang.String r6 = "更换气泡"
            java.lang.String r8 = "重新选择一张本地图片"
            r2.<init>(r6, r8)
            sf.e r6 = new sf.e
            java.lang.String r8 = "恢复微信气泡"
            java.lang.String r9 = "删除当前自定义气泡"
            r6.<init>(r8, r9)
            sf.e[] r2 = new sf.e[]{r2, r6}
            java.util.List r9 = a.a.y0(r2)
            c9.k r10 = new c9.k
            r6 = 16
            r2 = r1
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            k.s1 r11 = new k.s1
            r2 = 25
            r11.<init>(r2)
            wb.lv r12 = wb.lv.f17583j
            java.lang.String r8 = "管理当前气泡图片"
            r6 = r0
            wb.y2.Q1(r6, r7, r8, r9, r10, r11, r12)
        Lb0:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
