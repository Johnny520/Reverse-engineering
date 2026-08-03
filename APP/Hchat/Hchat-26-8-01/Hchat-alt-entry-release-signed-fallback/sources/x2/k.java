package x2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends gg.m implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x2.k f21149h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x2.k f21150i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x2.k f21151j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x2.k f21152k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final x2.k f21153l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final x2.k f21154m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final x2.k f21155n = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21156g;

    static {
            x2.k r0 = new x2.k
            r1 = 2
            r2 = 0
            r0.<init>(r1, r2)
            x2.k.f21149h = r0
            x2.k r0 = new x2.k
            r2 = 1
            r0.<init>(r1, r2)
            x2.k.f21150i = r0
            x2.k r0 = new x2.k
            r2 = 2
            r0.<init>(r1, r2)
            x2.k.f21151j = r0
            x2.k r0 = new x2.k
            r2 = 3
            r0.<init>(r1, r2)
            x2.k.f21152k = r0
            x2.k r0 = new x2.k
            r2 = 4
            r0.<init>(r1, r2)
            x2.k.f21153l = r0
            x2.k r0 = new x2.k
            r2 = 5
            r0.<init>(r1, r2)
            x2.k.f21154m = r0
            x2.k r0 = new x2.k
            r2 = 6
            r0.<init>(r1, r2)
            x2.k.f21155n = r0
            return
    }

    public /* synthetic */ k(int r1, int r2) {
            r0 = this;
            r0.f21156g = r2
            r0.<init>(r1)
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f21156g
            switch(r0) {
                case 0: goto L69;
                case 1: goto L5b;
                case 2: goto L4d;
                case 3: goto L3f;
                case 4: goto L31;
                case 5: goto L23;
                default: goto L5;
            }
        L5:
            x1.f0 r2 = (x1.f0) r2
            u2.m r3 = (u2.m) r3
            x2.v r2 = x2.i.e(r2)
            int r3 = r3.ordinal()
            if (r3 == 0) goto L1c
            r0 = 1
            if (r3 != r0) goto L17
            goto L1d
        L17:
            okio.a.k()
            r2 = 0
            goto L22
        L1c:
            r0 = 0
        L1d:
            r2.setLayoutDirection(r0)
            sf.n r2 = sf.n.f12433a
        L22:
            return r2
        L23:
            x1.f0 r2 = (x1.f0) r2
            u3.c r3 = (u3.c) r3
            x2.v r2 = x2.i.e(r2)
            r2.setSavedStateRegistryOwner(r3)
            sf.n r2 = sf.n.f12433a
            return r2
        L31:
            x1.f0 r2 = (x1.f0) r2
            androidx.lifecycle.q r3 = (androidx.lifecycle.q) r3
            x2.v r2 = x2.i.e(r2)
            r2.setLifecycleOwner(r3)
            sf.n r2 = sf.n.f12433a
            return r2
        L3f:
            x1.f0 r2 = (x1.f0) r2
            u2.c r3 = (u2.c) r3
            x2.v r2 = x2.i.e(r2)
            r2.setDensity(r3)
            sf.n r2 = sf.n.f12433a
            return r2
        L4d:
            x1.f0 r2 = (x1.f0) r2
            y0.o r3 = (y0.o) r3
            x2.v r2 = x2.i.e(r2)
            r2.setModifier(r3)
            sf.n r2 = sf.n.f12433a
            return r2
        L5b:
            x1.f0 r2 = (x1.f0) r2
            fg.l r3 = (fg.l) r3
            x2.v r2 = x2.i.e(r2)
            r2.setReleaseBlock(r3)
            sf.n r2 = sf.n.f12433a
            return r2
        L69:
            x1.f0 r2 = (x1.f0) r2
            fg.l r3 = (fg.l) r3
            x2.v r2 = x2.i.e(r2)
            r2.setUpdateBlock(r3)
            sf.n r2 = sf.n.f12433a
            return r2
    }
}
