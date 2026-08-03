package c5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends c5.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f1030i;

    public e(int r2, x5.f r3) {
            r1 = this;
            r0 = -3
            r1.<init>(r2, r0)
            java.lang.String r2 = r3.f21192h
            r1.f1030i = r2
            return
    }

    @Override // b5.j
    public final boolean c(e5.a r3) {
            r2 = this;
            java.lang.String r0 = ".source"
            r3.write(r0)
            java.lang.String r0 = r2.f1030i
            if (r0 == 0) goto L11
            java.lang.String r1 = " "
            r3.write(r1)
            r3.m(r0)
        L11:
            r3 = 1
            return r3
    }
}
