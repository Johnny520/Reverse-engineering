package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f2653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2654i;

    public /* synthetic */ s0(long r1, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f2652g = r4
            r0.f2653h = r1
            r0.f2654i = r3
            r0.<init>()
            return
    }

    public /* synthetic */ s0(java.lang.Object r1, long r2, int r4) {
            r0 = this;
            r0.f2652g = r4
            r0.f2654i = r1
            r0.f2653h = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f2652g
            sf.n r1 = sf.n.f12433a
            long r2 = r7.f2653h
            java.lang.Object r4 = r7.f2654i
            switch(r0) {
                case 0: goto L92;
                case 1: goto L77;
                case 2: goto L5d;
                case 3: goto L16;
                default: goto Lb;
            }
        Lb:
            v1.b1 r4 = (v1.b1) r4
            v1.a1 r8 = (v1.a1) r8
            r8.getClass()
            v1.a1.C(r8, r4, r2)
            return r1
        L16:
            v8.q r4 = (v8.q) r4
            java.io.File r8 = (java.io.File) r8
            boolean r0 = r8.isFile()
            r1 = 0
            if (r0 == 0) goto L58
            java.lang.String r0 = r8.getName()
            r0.getClass()
            java.lang.String r5 = "image_"
            boolean r0 = og.t.d0(r0, r5, r1)
            if (r0 != 0) goto L3f
            java.lang.String r0 = r8.getName()
            r0.getClass()
            java.lang.String r5 = "video_"
            boolean r0 = og.t.d0(r0, r5, r1)
            if (r0 == 0) goto L58
        L3f:
            long r5 = r8.lastModified()
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 > 0) goto L58
            java.lang.String r8 = r4.g(r8)
            if (r8 == 0) goto L58
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = r4.f14279f
            boolean r8 = r0.contains(r8)
            r0 = 1
            r8 = r8 ^ r0
            if (r8 != r0) goto L58
            r1 = r0
        L58:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            return r8
        L5d:
            fg.l r4 = (fg.l) r4
            v1.t r8 = (v1.t) r8
            r8.getClass()
            long r5 = r8.F()
            boolean r8 = u2.l.a(r2, r5)
            if (r8 != 0) goto L76
            u2.l r8 = new u2.l
            r8.<init>(r5)
            r4.invoke(r8)
        L76:
            return r1
        L77:
            s.t r4 = (s.t) r4
            i.c r8 = (i.c) r8
            java.lang.Object r8 = r8.d()
            u2.j r8 = (u2.j) r8
            long r5 = r8.f13347a
            long r2 = u2.j.c(r5, r2)
            int r8 = s.t.f12094r
            r4.e(r2)
            i.e0 r8 = r4.f12097c
            r8.invoke()
            return r1
        L92:
            java.lang.String r4 = (java.lang.String) r4
            j8.p r8 = (j8.p) r8
            boolean r8 = h.Hchat.hooks.items.script.ScriptWaBridge.g(r4, r2, r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
    }
}
