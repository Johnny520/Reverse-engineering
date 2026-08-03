package qb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f10807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f10809j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f10810k;

    public /* synthetic */ d(android.app.Activity r2, qb.k r3, gg.s r4, int r5) {
            r1 = this;
            r0 = 0
            r1.f10806g = r0
            r1.<init>()
            r1.f10807h = r2
            r1.f10809j = r3
            r1.f10810k = r4
            r1.f10808i = r5
            return
    }

    public /* synthetic */ d(java.lang.String r2, android.view.ViewGroup r3, android.app.Activity r4, int r5) {
            r1 = this;
            r0 = 1
            r1.f10806g = r0
            r1.<init>()
            r1.f10809j = r2
            r1.f10810k = r3
            r1.f10807h = r4
            r1.f10808i = r5
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            int r0 = r6.f10806g
            switch(r0) {
                case 0: goto L6a;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r6.f10809j
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r6.f10810k
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            java.lang.String r2 = "ID: "
            java.lang.String r2 = r2.concat(r0)
            ca.s r3 = new ca.s
            r4 = 18
            r3.<init>(r2, r4)
            android.widget.TextView r2 = uf.d.p(r1, r3)
            if (r2 == 0) goto L21
            goto L2c
        L21:
            ca.s r2 = new ca.s
            r3 = 19
            r2.<init>(r0, r3)
            android.widget.TextView r2 = uf.d.p(r1, r2)
        L2c:
            android.app.Activity r1 = r6.f10807h
            r3 = 1
            if (r2 == 0) goto L5f
            va.a r4 = new va.a
            r5 = 0
            r4.<init>(r1, r0, r5)
            r2.setOnClickListener(r4)
            r2.setClickable(r3)
            r0 = 0
            r2.setFocusable(r0)
            r1 = r0
        L42:
            if (r2 == 0) goto L69
            r5 = 5
            if (r1 >= r5) goto L69
            r2.setOnClickListener(r4)
            r2.setClickable(r3)
            r2.setFocusable(r0)
            android.view.ViewParent r2 = r2.getParent()
            boolean r5 = r2 instanceof android.view.View
            if (r5 == 0) goto L5b
            android.view.View r2 = (android.view.View) r2
            goto L5c
        L5b:
            r2 = 0
        L5c:
            int r1 = r1 + 1
            goto L42
        L5f:
            int r2 = r6.f10808i
            int r2 = r2 + r3
            r3 = 8
            if (r2 >= r3) goto L69
            uf.d.h(r1, r0, r2)
        L69:
            return
        L6a:
            java.lang.Object r0 = r6.f10809j
            qb.k r0 = (qb.k) r0
            java.lang.Object r1 = r6.f10810k
            gg.s r1 = (gg.s) r1
            android.app.Activity r2 = r6.f10807h
            boolean r3 = r2.isFinishing()
            if (r3 != 0) goto L9a
            int r1 = r1.f4562g
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "语音转发完成: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = "/"
            r3.append(r1)
            int r1 = r6.f10808i
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.getClass()
            qb.k.N(r2, r1)
        L9a:
            return
    }
}
