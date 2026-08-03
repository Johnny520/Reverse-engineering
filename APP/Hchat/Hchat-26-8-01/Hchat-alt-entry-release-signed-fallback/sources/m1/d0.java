package m1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m1.e0 f8536h;

    public /* synthetic */ d0(m1.e0 r1, int r2) {
            r0 = this;
            r0.f8535g = r2
            r0.f8536h = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f8535g
            switch(r0) {
                case 0: goto L43;
                default: goto L5;
            }
        L5:
            h1.d r10 = (h1.d) r10
            m1.e0 r0 = r9.f8536h
            m1.c r1 = r0.f8548b
            float r2 = r0.f8557k
            float r0 = r0.f8558l
            b5.c r3 = r10.z0()
            long r4 = r3.v()
            f1.u r6 = r3.p()
            r6.e()
            java.lang.Object r6 = r3.f469a     // Catch: java.lang.Throwable -> L37
            androidx.lifecycle.x r6 = (androidx.lifecycle.x) r6     // Catch: java.lang.Throwable -> L37
            r7 = 0
            r6.S(r2, r0, r7)     // Catch: java.lang.Throwable -> L37
            r1.a(r10)     // Catch: java.lang.Throwable -> L37
            f1.u r10 = r3.p()
            r10.p()
            r3.U(r4)
            sf.n r10 = sf.n.f12433a
            return r10
        L37:
            r10 = move-exception
            f1.u r0 = r3.p()
            r0.p()
            r3.U(r4)
            throw r10
        L43:
            m1.c0 r10 = (m1.c0) r10
            r10 = 1
            m1.e0 r0 = r9.f8536h
            r0.f8550d = r10
            gg.m r10 = r0.f8552f
            r10.invoke()
            sf.n r10 = sf.n.f12433a
            return r10
    }
}
