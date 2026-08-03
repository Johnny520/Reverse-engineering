package u4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends u4.i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v4.a f13370k;

    public d(u4.r r1, u4.t r2, u4.o r3, u4.p r4, v4.a r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            if (r5 == 0) goto L8
            r0.f13370k = r5
            return
        L8:
            java.lang.String r1 = "cst == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
    }

    @Override // u4.i
    public java.lang.String h() {
            r1 = this;
            v4.a r0 = r1.f13370k
            java.lang.String r0 = r0.a()
            return r0
    }
}
