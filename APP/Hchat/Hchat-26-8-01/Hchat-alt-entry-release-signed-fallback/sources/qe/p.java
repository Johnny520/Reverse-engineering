package qe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends qe.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qe.r f10980c;

    public p(qe.r r1, ud.p r2, qd.r r3) {
            r0 = this;
            r0.f10980c = r1
            r0.<init>(r2, r3)
            return
    }

    @Override // qe.a
    public final boolean a(androidx.lifecycle.e0 r4) {
            r3 = this;
            ud.p r0 = r3.f10932a
            qd.r r1 = r0.f13714l
            qd.j r1 = r4.b(r1)
            r2 = 0
            qd.l r0 = r0.S(r2)
            qd.j r4 = r4.b(r0)
            qe.r r0 = r3.f10980c
            qe.k r0 = r0.f10983c
            qe.l r4 = r0.d(r1, r4)
            boolean r0 = r4.b()
            if (r0 != 0) goto L27
            boolean r4 = r4.d()
            if (r4 == 0) goto L26
            goto L27
        L26:
            return r2
        L27:
            r4 = 1
            return r4
    }
}
