package g0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v1.b1 f4023h;

    public /* synthetic */ g(v1.b1 r1, int r2) {
            r0 = this;
            r0.f4022g = r2
            r0.f4023h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f4022g
            v1.a1 r10 = (v1.a1) r10
            switch(r0) {
                case 0: goto L80;
                case 1: goto L79;
                case 2: goto L72;
                case 3: goto L2c;
                case 4: goto L25;
                case 5: goto L1e;
                case 6: goto L17;
                case 7: goto L10;
                default: goto L7;
            }
        L7:
            r0 = 0
            v1.b1 r1 = r9.f4023h
            v1.a1.E(r10, r1, r0, r0)
        Ld:
            sf.n r10 = sf.n.f12433a
            return r10
        L10:
            r0 = 0
            v1.b1 r1 = r9.f4023h
            v1.a1.E(r10, r1, r0, r0)
            goto Ld
        L17:
            r0 = 0
            v1.b1 r1 = r9.f4023h
            v1.a1.B(r10, r1, r0, r0)
            goto Ld
        L1e:
            r0 = 0
            v1.b1 r1 = r9.f4023h
            v1.a1.E(r10, r1, r0, r0)
            goto Ld
        L25:
            r0 = 0
            v1.b1 r1 = r9.f4023h
            v1.a1.E(r10, r1, r0, r0)
            goto Ld
        L2c:
            u2.m r0 = r10.m()
            u2.m r1 = u2.m.f13354g
            v1.b1 r2 = r9.f4023h
            r3 = 0
            r5 = 0
            r6 = 0
            if (r0 == r1) goto L63
            int r0 = r10.w()
            if (r0 != 0) goto L41
            goto L63
        L41:
            int r0 = r10.w()
            int r1 = r2.f13900g
            int r0 = r0 - r1
            int r1 = (int) r3
            int r0 = r0 - r1
            long r3 = (long) r0
            r0 = 32
            long r3 = r3 << r0
            long r0 = (long) r1
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r7
            long r0 = r0 | r3
            v1.a1.e(r10, r2)
            long r3 = r2.f13904k
            long r0 = u2.j.d(r0, r3)
            r2.A0(r0, r5, r6)
            goto L6f
        L63:
            v1.a1.e(r10, r2)
            long r0 = r2.f13904k
            long r0 = u2.j.d(r3, r0)
            r2.A0(r0, r5, r6)
        L6f:
            sf.n r10 = sf.n.f12433a
            return r10
        L72:
            r0 = 0
            v1.b1 r1 = r9.f4023h
            v1.a1.E(r10, r1, r0, r0)
            goto Ld
        L79:
            r0 = 0
            v1.b1 r1 = r9.f4023h
            v1.a1.B(r10, r1, r0, r0)
            goto Ld
        L80:
            r0 = 0
            v1.b1 r1 = r9.f4023h
            v1.a1.B(r10, r1, r0, r0)
            goto Ld
    }
}
