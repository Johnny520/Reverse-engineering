package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xp extends gg.j implements fg.l {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ qg.t f20240n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20241o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20242p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20243q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20244r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20245s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20246t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20247u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20248v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20249w;

    public xp(android.content.Context r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, qg.t r10) {
            r0 = this;
            r0.f20240n = r10
            r0.f20241o = r2
            r0.f20242p = r3
            r0.f20243q = r4
            r0.f20244r = r1
            r0.f20245s = r5
            r0.f20246t = r6
            r0.f20247u = r7
            r0.f20248v = r8
            r0.f20249w = r9
            java.lang.Class<gg.k> r1 = gg.k.class
            java.lang.Class r4 = eh.a.i(r1)
            java.lang.String r6 = "ScriptPluginMarketPage$requestHistoryInstall(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lh/Hchat/hooks/items/script/market/PluginMarketHistoryVersion;)V"
            r7 = 0
            r3 = 1
            java.lang.String r5 = "requestHistoryInstall"
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r15) {
            r14 = this;
            r3 = r15
            gb.h r3 = (gb.h) r3
            r3.getClass()
            i0.a1 r11 = r14.f20241o
            java.lang.Object r15 = r11.getValue()
            r2 = r15
            gb.o r2 = (gb.o) r2
            if (r2 == 0) goto L44
            i0.a1 r4 = r14.f20242p
            java.lang.Object r15 = r4.getValue()
            java.lang.String r15 = (java.lang.String) r15
            if (r15 != 0) goto L44
            i0.a1 r6 = r14.f20243q
            java.lang.Object r15 = r6.getValue()
            java.lang.String r15 = (java.lang.String) r15
            if (r15 == 0) goto L26
            goto L44
        L26:
            java.lang.String r15 = r3.f4427a
            r4.setValue(r15)
            wb.aq r0 = new wb.aq
            r13 = 0
            android.content.Context r1 = r14.f20244r
            qg.t r5 = r14.f20240n
            i0.a1 r7 = r14.f20245s
            i0.a1 r8 = r14.f20246t
            i0.a1 r9 = r14.f20247u
            i0.a1 r10 = r14.f20248v
            i0.a1 r12 = r14.f20249w
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15 = 3
            r1 = 0
            qg.v.q(r5, r1, r0, r15)
        L44:
            sf.n r15 = sf.n.f12433a
            return r15
    }
}
