package v8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v8.q f14216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v8.h f14217i;

    public /* synthetic */ b(v8.h r2, v8.q r3) {
            r1 = this;
            r0 = 2
            r1.f14215g = r0
            r1.<init>()
            r1.f14217i = r2
            r1.f14216h = r3
            return
    }

    public /* synthetic */ b(v8.q r1, v8.h r2, int r3) {
            r0 = this;
            r0.f14215g = r3
            r0.f14216h = r1
            r0.f14217i = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r4 = this;
            int r0 = r4.f14215g
            switch(r0) {
                case 0: goto L78;
                case 1: goto L32;
                case 2: goto Lf;
                default: goto L5;
            }
        L5:
            v8.q r0 = r4.f14216h
            v8.h r1 = r4.f14217i
            r0.k(r1)
        Lc:
            sf.n r0 = sf.n.f12433a
            return r0
        Lf:
            v8.h r0 = r4.f14217i
            boolean r1 = r0.f14260q
            if (r1 == 0) goto L2f
            v8.q r1 = r4.f14216h
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = r1.f14278e
            java.lang.String r3 = r0.f14244a
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L22
            goto L2f
        L22:
            r2 = 0
            r0.f14260q = r2
            r2 = 1
            r0.f14261r = r2
            java.lang.String r2 = "等待下载完成回调超时"
            r0.f14262s = r2
            r1.k(r0)
        L2f:
            sf.n r0 = sf.n.f12433a
            return r0
        L32:
            v8.h r0 = r4.f14217i
            java.lang.String r1 = r0.f14257n
            java.lang.String r0 = r0.f14258o
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            ng.j r0 = tf.l.k0(r0)
            r9.p r1 = new r9.p
            r2 = 16
            r1.<init>(r2)
            ng.i r2 = new ng.i
            r3 = 1
            r2.<init>(r0, r3, r1)
            ng.c r0 = ng.m.S(r2)
            v8.o r1 = v8.o.f14271n
            ng.t r0 = ng.m.W(r0, r1)
            ng.j r1 = r0.f9459a
            java.util.Iterator r1 = r1.iterator()
        L5d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L75
            fg.l r2 = r0.f9460b
            java.lang.Object r3 = r1.next()
            java.lang.Object r2 = r2.invoke(r3)
            java.io.File r2 = (java.io.File) r2
            v8.q r3 = r4.f14216h
            r3.a(r2)
            goto L5d
        L75:
            sf.n r0 = sf.n.f12433a
            return r0
        L78:
            v8.q r0 = r4.f14216h
            v8.h r1 = r4.f14217i
            r0.k(r1)
            goto Lc
    }
}
