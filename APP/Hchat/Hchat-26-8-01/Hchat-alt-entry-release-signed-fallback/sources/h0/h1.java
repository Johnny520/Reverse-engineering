package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h1 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u2.c f4906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f4907i;

    public /* synthetic */ h1(u2.c r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f4905g = r3
            r0.f4906h = r1
            r0.f4907i = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f4905g
            switch(r0) {
                case 0: goto L3d;
                default: goto L5;
            }
        L5:
            fg.a r7 = (fg.a) r7
            h0.g1 r0 = new h0.g1
            r1 = 0
            r0.<init>(r7, r1)
            h0.h1 r7 = new h0.h1
            u2.c r2 = r6.f4906h
            i0.a1 r3 = r6.f4907i
            r7.<init>(r2, r3, r1)
            boolean r1 = k.c1.a()
            if (r1 == 0) goto L36
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 != r2) goto L25
            k.q1 r1 = k.q1.f7044b
            goto L27
        L25:
            k.q1 r1 = k.q1.f7045c
        L27:
            boolean r2 = k.c1.a()
            if (r2 == 0) goto L33
            k.z0 r2 = new k.z0
            r2.<init>(r0, r7, r1)
            goto L3c
        L33:
            y0.l r2 = y0.l.f21818a
            goto L3c
        L36:
            java.lang.String r7 = "Magnifier is only supported on API level 28 and higher."
            j8.o.w(r7)
            r2 = 0
        L3c:
            return r2
        L3d:
            u2.h r7 = (u2.h) r7
            long r0 = r7.f13346a
            float r0 = u2.h.b(r0)
            u2.c r1 = r6.f4906h
            int r0 = r1.G0(r0)
            long r2 = r7.f13346a
            float r7 = u2.h.a(r2)
            int r7 = r1.G0(r7)
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            long r2 = (long) r7
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            u2.l r7 = new u2.l
            r7.<init>(r0)
            i0.a1 r0 = r6.f4907i
            r0.setValue(r7)
            sf.n r7 = sf.n.f12433a
            return r7
    }
}
