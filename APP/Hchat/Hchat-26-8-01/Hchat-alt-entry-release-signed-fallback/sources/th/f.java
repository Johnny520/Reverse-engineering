package th;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u2.c f13285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f13286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i1.b f13287i;

    public f(u2.c r1, float r2, i1.b r3) {
            r0 = this;
            r0.<init>()
            r0.f13285g = r1
            r0.f13286h = r2
            r0.f13287i = r3
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r9) {
            r8 = this;
            h1.d r9 = (h1.d) r9
            r9.getClass()
            b5.c r0 = r9.z0()
            u2.c r0 = r0.s()
            b5.c r1 = r9.z0()
            u2.c r2 = r8.f13285g
            r1.R(r2)
            float r1 = r8.f13286h     // Catch: java.lang.Throwable -> L49
            b5.c r2 = r9.z0()     // Catch: java.lang.Throwable -> L49
            long r3 = r2.v()     // Catch: java.lang.Throwable -> L49
            f1.u r5 = r2.p()     // Catch: java.lang.Throwable -> L49
            r5.e()     // Catch: java.lang.Throwable -> L49
            java.lang.Object r5 = r2.f469a     // Catch: java.lang.Throwable -> L4b
            androidx.lifecycle.x r5 = (androidx.lifecycle.x) r5     // Catch: java.lang.Throwable -> L4b
            r6 = 0
            r5.S(r1, r1, r6)     // Catch: java.lang.Throwable -> L4b
            i1.b r1 = r8.f13287i     // Catch: java.lang.Throwable -> L4b
            oh.h.u(r9, r1)     // Catch: java.lang.Throwable -> L4b
            f1.u r1 = r2.p()     // Catch: java.lang.Throwable -> L49
            r1.p()     // Catch: java.lang.Throwable -> L49
            r2.U(r3)     // Catch: java.lang.Throwable -> L49
            b5.c r9 = r9.z0()
            r9.R(r0)
            sf.n r9 = sf.n.f12433a
            return r9
        L49:
            r1 = move-exception
            goto L57
        L4b:
            r1 = move-exception
            f1.u r5 = r2.p()     // Catch: java.lang.Throwable -> L49
            r5.p()     // Catch: java.lang.Throwable -> L49
            r2.U(r3)     // Catch: java.lang.Throwable -> L49
            throw r1     // Catch: java.lang.Throwable -> L49
        L57:
            b5.c r9 = r9.z0()
            r9.R(r0)
            throw r1
    }
}
