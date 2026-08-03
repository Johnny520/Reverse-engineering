package d5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends d5.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1998b;

    public l(int r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f1998b = r2
            return
    }

    @Override // d5.m
    public final void a(e5.a r3) {
            r2 = this;
            int r0 = r2.f1998b
            if (r0 < 0) goto L9
            r1 = 43
            r3.write(r1)
        L9:
            r3.z(r0)
            return
    }
}
