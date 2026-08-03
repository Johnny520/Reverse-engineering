package y2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends gg.m implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gg.t f22269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y2.x f22270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u2.k f22271i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f22272j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f22273k;

    public w(gg.t r1, y2.x r2, u2.k r3, long r4, long r6) {
            r0 = this;
            r0.f22269g = r1
            r0.f22270h = r2
            r0.f22271i = r3
            r0.f22272j = r4
            r0.f22273k = r6
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r8 = this;
            y2.x r0 = r8.f22270h
            y2.b0 r1 = r0.getPositionProvider()
            u2.m r5 = r0.getParentLayoutDirection()
            long r6 = r8.f22273k
            u2.k r2 = r8.f22271i
            long r3 = r8.f22272j
            long r0 = r1.e(r2, r3, r5, r6)
            gg.t r2 = r8.f22269g
            r2.f4563g = r0
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
