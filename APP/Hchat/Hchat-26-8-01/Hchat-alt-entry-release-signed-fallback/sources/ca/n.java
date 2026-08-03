package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.io.Serializable f1538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1542l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1543m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1544n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1545o;

    public /* synthetic */ n(java.io.Serializable r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, int r9) {
            r0 = this;
            r0.f1537g = r9
            r0.f1538h = r1
            r0.f1539i = r2
            r0.f1540j = r3
            r0.f1541k = r4
            r0.f1542l = r5
            r0.f1543m = r6
            r0.f1544n = r7
            r0.f1545o = r8
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            int r0 = r8.f1537g
            switch(r0) {
                case 0: goto L57;
                default: goto L5;
            }
        L5:
            java.io.Serializable r0 = r8.f1538h
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r8.f1539i
            fb.b r1 = (fb.b) r1
            java.lang.Object r2 = r8.f1540j
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r8.f1541k
            java.io.Serializable r3 = (java.io.Serializable) r3
            java.lang.Object r4 = r8.f1542l
            gg.u r4 = (gg.u) r4
            java.lang.Object r5 = r8.f1543m
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r8.f1544n
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r7 = r8.f1545o
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            boolean r0 = gg.l.a(r5, r0)
            if (r0 == 0) goto L56
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.setValue(r0)
            r5 = 0
            wb.y2.L0(r7, r5)
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f3400a
            boolean r0 = r0.get()
            if (r0 != 0) goto L56
            boolean r0 = r3 instanceof sf.f
            if (r0 != 0) goto L4c
            java.lang.Object r0 = r4.f4564g
            java.lang.String r0 = (java.lang.String) r0
            goto L4e
        L4c:
            java.lang.String r0 = "自动压缩失败，已使用原上下文"
        L4e:
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
        L56:
            return
        L57:
            java.io.Serializable r0 = r8.f1538h
            r2 = r0
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            java.lang.Object r0 = r8.f1539i
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            java.lang.Object r1 = r8.f1540j
            wb.kv r1 = (wb.kv) r1
            java.lang.Object r3 = r8.f1541k
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r4 = r8.f1543m
            r5 = r4
            fg.l r5 = (fg.l) r5
            java.lang.Object r4 = r8.f1544n
            r6 = r4
            ca.e0 r6 = (ca.e0) r6
            java.lang.Object r4 = r8.f1545o
            r7 = r4
            p8.v r7 = (p8.v) r7
            boolean r4 = r2.get()
            if (r4 == 0) goto L7e
            goto L9b
        L7e:
            r4 = 1
            r0.set(r4)
            r1.close()
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L9b
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L9b
            c9.w r1 = new c9.w
            java.lang.Object r4 = r8.f1542l
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.postOnAnimation(r1)
        L9b:
            return
    }
}
