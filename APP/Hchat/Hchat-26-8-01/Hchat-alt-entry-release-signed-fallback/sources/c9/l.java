package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ aa.c f1245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f1246i;

    public /* synthetic */ l(aa.c r1, android.app.Activity r2, int r3) {
            r0 = this;
            r0.f1244g = r3
            r0.f1245h = r1
            r0.f1246i = r2
            r0.<init>()
            return
    }

    public /* synthetic */ l(android.app.Activity r2, aa.c r3) {
            r1 = this;
            r0 = 2
            r1.f1244g = r0
            r1.<init>()
            r1.f1246i = r2
            r1.f1245h = r3
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f1244g
            sf.n r1 = sf.n.f12433a
            android.app.Activity r2 = r6.f1246i
            aa.c r3 = r6.f1245h
            switch(r0) {
                case 0: goto L6c;
                case 1: goto L5e;
                case 2: goto L19;
                default: goto Lb;
            }
        Lb:
            c9.y r7 = (c9.y) r7
            r7.getClass()
            r3.invoke()
            android.os.Handler r0 = c9.b0.f1104a
            c9.b0.i(r2, r7)
            return r1
        L19:
            java.util.List r7 = (java.util.List) r7
            r7.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r4 = tf.n.e1(r7)
            r0.<init>(r4)
            java.util.Iterator r4 = r7.iterator()
        L2b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L3d
            java.lang.Object r5 = r4.next()
            wb.jv r5 = (wb.jv) r5
            java.lang.String r5 = r5.f17140a
            r0.add(r5)
            goto L2b
        L3d:
            r4 = 0
            boolean r0 = c9.o2.t(r2, r4, r0)
            android.os.Handler r4 = c9.b0.f1104a
            if (r0 == 0) goto L53
            int r7 = r7.size()
            java.lang.String r4 = "已移出 "
            java.lang.String r5 = " 个会话"
            java.lang.String r7 = eh.a.m(r7, r4, r5)
            goto L55
        L53:
            java.lang.String r7 = "移出会话失败"
        L55:
            c9.b0.h(r2, r7)
            if (r0 == 0) goto L5d
            r3.invoke()
        L5d:
            return r1
        L5e:
            c9.y r7 = (c9.y) r7
            r7.getClass()
            r3.invoke()
            android.os.Handler r0 = c9.b0.f1104a
            c9.b0.i(r2, r7)
            return r1
        L6c:
            c9.y r7 = (c9.y) r7
            r7.getClass()
            r3.invoke()
            android.os.Handler r0 = c9.b0.f1104a
            c9.b0.i(r2, r7)
            return r1
    }
}
