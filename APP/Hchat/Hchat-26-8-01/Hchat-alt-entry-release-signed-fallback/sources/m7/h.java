package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends z7.m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f8748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8749j;

    public h(z7.f r1, java.lang.String[] r2, int r3) {
            r0 = this;
            r0.f8748i = r2
            r0.f8749j = r3
            r0.<init>(r1)
            return
    }

    @Override // z7.m
    public final java.util.Iterator b(java.lang.Object r3) {
            r2 = this;
            m7.j r3 = (m7.j) r3
            java.lang.String[] r0 = r2.f8748i
            int r1 = r2.f8749j
            java.util.Iterator r3 = r3.Q(r0, r1)
            return r3
    }
}
