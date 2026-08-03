package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rp extends gg.j implements fg.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f18930n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ qg.t f18931o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18932p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18933q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18934r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18935s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18936t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18937u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18938v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18939w;

    public rp(android.content.Context r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, qg.t r10) {
            r0 = this;
            r0.f18930n = r1
            r0.f18931o = r10
            r0.f18932p = r2
            r0.f18933q = r3
            r0.f18934r = r4
            r0.f18935s = r5
            r0.f18936t = r6
            r0.f18937u = r7
            r0.f18938v = r8
            r0.f18939w = r9
            java.lang.Class<gg.k> r1 = gg.k.class
            java.lang.Class r4 = eh.a.i(r1)
            java.lang.String r6 = "PluginMarketUploadDialog$startUpload(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V"
            r7 = 0
            r3 = 0
            java.lang.String r5 = "startUpload"
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r10 = this;
            i0.a1 r8 = r10.f18932p
            boolean r0 = wb.y2.H(r8)
            if (r0 != 0) goto Lde
            i0.a1 r0 = r10.f18933q
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L18
            goto Lde
        L18:
            i0.a1 r1 = r10.f18934r
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            r2 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L49
            java.lang.Object r3 = r2.next()
            r4 = r3
            eb.c0 r4 = (eb.c0) r4
            java.lang.Object r5 = r0.getValue()
            java.util.Set r5 = (java.util.Set) r5
            java.lang.String r4 = r4.f2506a
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L2a
            r1.add(r3)
            goto L2a
        L49:
            boolean r0 = r1.isEmpty()
            android.content.Context r2 = r10.f18930n
            i0.a1 r4 = r10.f18935s
            if (r0 == 0) goto L54
            goto L8f
        L54:
            java.util.Iterator r0 = r1.iterator()
        L58:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L8f
            java.lang.Object r3 = r0.next()
            eb.c0 r3 = (eb.c0) r3
            java.lang.Object r5 = r4.getValue()
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r3 = r3.f2506a
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L76
            java.lang.String r3 = ""
        L76:
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            boolean r3 = og.m.t0(r3)
            if (r3 == 0) goto L58
            java.lang.String r0 = "在线插件名不能为空"
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            goto Lde
        L8f:
            int r0 = tf.n.e1(r1)
            int r0 = tf.y.a0(r0)
            r3 = 16
            if (r0 >= r3) goto L9c
            r0 = r3
        L9c:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
        La5:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lc0
            java.lang.Object r5 = r0.next()
            eb.c0 r5 = (eb.c0) r5
            java.lang.String r5 = r5.f2506a
            wb.tp r6 = new wb.tp
            wb.sp r7 = wb.sp.f19124g
            java.lang.String r9 = "等待上传"
            r6.<init>(r7, r9)
            r3.put(r5, r6)
            goto La5
        Lc0:
            i0.a1 r0 = r10.f18936t
            r0.setValue(r3)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r8.setValue(r3)
            r3 = r0
            wb.gn r0 = new wb.gn
            r9 = 0
            i0.a1 r5 = r10.f18937u
            i0.a1 r6 = r10.f18938v
            i0.a1 r7 = r10.f18939w
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 3
            qg.t r2 = r10.f18931o
            r3 = 0
            qg.v.q(r2, r3, r0, r1)
        Lde:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
