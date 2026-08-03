package ia;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p8.l f6599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ia.q f6600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f6601j;

    public /* synthetic */ m(int r1, android.app.Activity r2, ia.q r3, p8.l r4) {
            r0 = this;
            r0.f6598g = r1
            r0.f6599h = r4
            r0.f6600i = r3
            r0.f6601j = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f6598g
            switch(r0) {
                case 0: goto L30;
                default: goto L5;
            }
        L5:
            ia.q r0 = r5.f6600i
            b5.c r1 = r0.f6621a
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L12
            goto L2d
        L12:
            p8.l r6 = r5.f6599h
            java.lang.String r2 = r6.f10391a
            if (r2 == 0) goto L2d
            ia.c r3 = r1.l(r2)
            tf.t r4 = tf.t.f13167g
            r1.Q(r2, r4)
            ia.a0 r0 = r0.f6622b
            android.app.Activity r1 = r5.f6601j
            r0.a(r1, r6, r3)
            java.lang.String r6 = "已恢复真实评论"
            ia.q.j(r1, r6)
        L2d:
            sf.n r6 = sf.n.f12433a
            return r6
        L30:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L39
            goto L5a
        L39:
            p8.l r6 = r5.f6599h
            java.lang.String r0 = r6.f10391a
            if (r0 == 0) goto L5a
            ia.q r1 = r5.f6600i
            b5.c r2 = r1.f6621a
            ia.c r2 = r2.l(r0)
            b5.c r3 = r1.f6621a
            tf.t r4 = tf.t.f13167g
            r3.T(r0, r4)
            ia.a0 r0 = r1.f6622b
            android.app.Activity r1 = r5.f6601j
            r0.a(r1, r6, r2)
            java.lang.String r6 = "已恢复真实点赞"
            ia.q.j(r1, r6)
        L5a:
            sf.n r6 = sf.n.f12433a
            return r6
    }
}
