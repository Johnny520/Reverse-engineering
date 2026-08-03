package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gh implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f16398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16401k;

    public /* synthetic */ gh(android.content.Context r2, int r3, java.lang.String r4, fg.l r5) {
            r1 = this;
            r0 = 0
            r1.f16397g = r0
            r1.<init>()
            r1.f16400j = r2
            r1.f16399i = r3
            r1.f16401k = r4
            r1.f16398h = r5
            return
    }

    public /* synthetic */ gh(fg.l r2, int r3, java.lang.String r4, fg.l r5) {
            r1 = this;
            r0 = 2
            r1.f16397g = r0
            r1.<init>()
            r1.f16398h = r2
            r1.f16399i = r3
            r1.f16401k = r4
            r1.f16400j = r5
            return
    }

    public /* synthetic */ gh(fg.l r2, db.c r3, java.util.List r4, int r5) {
            r1 = this;
            r0 = 1
            r1.f16397g = r0
            r1.<init>()
            r1.f16398h = r2
            r1.f16400j = r3
            r1.f16401k = r4
            r1.f16399i = r5
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r7 = this;
            int r0 = r7.f16397g
            switch(r0) {
                case 0: goto L63;
                case 1: goto L25;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f16401k
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r7.f16400j
            r4 = r0
            fg.l r4 = (fg.l) r4
            wb.b3 r1 = new wb.b3
            int r0 = r7.f16399i
            java.lang.String r2 = wb.ho.J6(r0)
            r5 = 1
            java.lang.String r6 = "|"
            r1.<init>(r2, r3, r4, r5, r6)
            fg.l r0 = r7.f16398h
            r0.invoke(r1)
        L22:
            sf.n r0 = sf.n.f12433a
            return r0
        L25:
            java.lang.Object r0 = r7.f16400j
            db.c r0 = (db.c) r0
            java.lang.Object r1 = r7.f16401k
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
        L37:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L59
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            if (r3 < 0) goto L54
            r6 = r4
            java.lang.Number r6 = (java.lang.Number) r6
            r6.longValue()
            int r6 = r7.f16399i
            if (r3 == r6) goto L52
            r2.add(r4)
        L52:
            r3 = r5
            goto L37
        L54:
            a.a.Q0()
            r0 = 0
            throw r0
        L59:
            db.c r0 = wb.ho.p7(r0, r2)
            fg.l r1 = r7.f16398h
            r1.invoke(r0)
            goto L22
        L63:
            java.lang.Object r0 = r7.f16400j
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r7.f16401k
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L73
            r2 = r0
            android.app.Activity r2 = (android.app.Activity) r2
            goto L74
        L73:
            r2 = 0
        L74:
            if (r2 != 0) goto L81
            java.lang.String r1 = "当前页面无法打开铃声选择器"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            goto L99
        L81:
            eb.v0 r3 = new eb.v0
            r4 = 5
            fg.l r5 = r7.f16398h
            int r6 = r7.f16399i
            r3.<init>(r5, r6, r0, r4)
            r0 = 1
            if (r6 != r0) goto L94
            wb.vq r0 = wb.vq.f19807a
            r0.c(r2, r3)
            goto L99
        L94:
            wb.vq r0 = wb.vq.f19807a
            r0.d(r2, r1, r3)
        L99:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
