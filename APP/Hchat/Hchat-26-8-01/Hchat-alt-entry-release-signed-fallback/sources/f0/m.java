package f0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements n2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n2.g[] f2970a;

    public m(n2.g[] r1) {
            r0 = this;
            r0.<init>()
            r0.f2970a = r1
            return
    }

    @Override // n2.g
    public final void a(k5.n r5) {
            r4 = this;
            n2.g[] r0 = r4.f2970a
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto Le
            r3 = r0[r2]
            r3.a(r5)
            int r2 = r2 + 1
            goto L4
        Le:
            return
    }
}
