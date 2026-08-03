package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 extends gg.m implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y1.a f21982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y1.i2 f21983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ okio.a f21984i;

    public j2(y1.a r1, y1.i2 r2, okio.a r3) {
            r0 = this;
            r0.f21982g = r1
            r0.f21983h = r2
            r0.f21984i = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r2 = this;
            y1.i2 r0 = r2.f21983h
            y1.a r1 = r2.f21982g
            r1.removeOnAttachStateChangeListener(r0)
            k3.a r0 = a7.a.w(r1)
            java.util.ArrayList r0 = r0.f7140a
            okio.a r1 = r2.f21984i
            r0.remove(r1)
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
