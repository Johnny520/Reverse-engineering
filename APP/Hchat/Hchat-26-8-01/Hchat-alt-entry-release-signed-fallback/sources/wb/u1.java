package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u1 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f19350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19352j;

    public /* synthetic */ u1(java.util.List r1, i0.a1 r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f19349g = r4
            r0.f19350h = r1
            r0.f19351i = r2
            r0.f19352j = r3
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            int r0 = r4.f19349g
            r.d r5 = (r.d) r5
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.getClass()
            r5 = r7 & 17
            switch(r0) {
                case 0: goto L72;
                case 1: goto L43;
                default: goto L14;
            }
        L14:
            r0 = 16
            r1 = 1
            if (r5 == r0) goto L1b
            r5 = r1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            r7 = r7 & r1
            boolean r5 = r6.S(r7, r5)
            if (r5 == 0) goto L3d
            wb.y1 r5 = new wb.y1
            r7 = 2
            java.util.List r0 = r4.f19350h
            i0.a1 r2 = r4.f19351i
            i0.a1 r3 = r4.f19352j
            r5.<init>(r0, r2, r3, r7)
            r7 = -1635756961(0xffffffff9e80545f, float:-1.3587422E-20)
            s0.d r5 = s0.i.e(r7, r5, r6)
            r7 = 48
            r0 = 0
            wb.ho.C3(r0, r5, r6, r7, r1)
            goto L40
        L3d:
            r6.V()
        L40:
            sf.n r5 = sf.n.f12433a
            return r5
        L43:
            r0 = 16
            r1 = 1
            if (r5 == r0) goto L4a
            r5 = r1
            goto L4b
        L4a:
            r5 = 0
        L4b:
            r7 = r7 & r1
            boolean r5 = r6.S(r7, r5)
            if (r5 == 0) goto L6c
            wb.y1 r5 = new wb.y1
            r7 = 1
            java.util.List r0 = r4.f19350h
            i0.a1 r2 = r4.f19351i
            i0.a1 r3 = r4.f19352j
            r5.<init>(r0, r2, r3, r7)
            r7 = 308976833(0x126a9cc1, float:7.4030595E-28)
            s0.d r5 = s0.i.e(r7, r5, r6)
            r7 = 48
            r0 = 0
            wb.ho.C3(r0, r5, r6, r7, r1)
            goto L6f
        L6c:
            r6.V()
        L6f:
            sf.n r5 = sf.n.f12433a
            return r5
        L72:
            r0 = 16
            r1 = 1
            if (r5 == r0) goto L79
            r5 = r1
            goto L7a
        L79:
            r5 = 0
        L7a:
            r7 = r7 & r1
            boolean r5 = r6.S(r7, r5)
            if (r5 == 0) goto L9b
            wb.y1 r5 = new wb.y1
            r7 = 0
            java.util.List r0 = r4.f19350h
            i0.a1 r2 = r4.f19351i
            i0.a1 r3 = r4.f19352j
            r5.<init>(r0, r2, r3, r7)
            r7 = 172679849(0xa4ae2a9, float:9.768576E-33)
            s0.d r5 = s0.i.e(r7, r5, r6)
            r7 = 48
            r0 = 0
            wb.ho.C3(r0, r5, r6, r7, r1)
            goto L9e
        L9b:
            r6.V()
        L9e:
            sf.n r5 = sf.n.f12433a
            return r5
    }
}
