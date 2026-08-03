package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends android.database.ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.c f22128a;

    public u2(sg.c r1, android.os.Handler r2) {
            r0 = this;
            r0.f22128a = r1
            r0.<init>(r2)
            return
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean r1, android.net.Uri r2) {
            r0 = this;
            sg.c r1 = r0.f22128a
            sf.n r2 = sf.n.f12433a
            r1.p(r2)
            return
    }
}
