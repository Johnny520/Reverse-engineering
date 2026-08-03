package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends yf.i implements fg.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n.k f12756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f12757i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f12758j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f12759k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.f1 f12760l;

    public o1(n.k r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.f1 r5, wf.c r6) {
            r0 = this;
            r0.f12756h = r1
            r0.f12757i = r2
            r0.f12758j = r3
            r0.f12759k = r4
            r0.f12760l = r5
            r1 = 3
            r0.<init>(r1, r6)
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
            r7 = this;
            qg.t r8 = (qg.t) r8
            e1.b r9 = (e1.b) r9
            long r8 = r9.f2294a
            r6 = r10
            wf.c r6 = (wf.c) r6
            sh.o1 r0 = new sh.o1
            i0.a1 r4 = r7.f12759k
            i0.f1 r5 = r7.f12760l
            n.k r1 = r7.f12756h
            i0.a1 r2 = r7.f12757i
            i0.a1 r3 = r7.f12758j
            r0.<init>(r1, r2, r3, r4, r5, r6)
            sf.n r8 = sf.n.f12433a
            r0.invokeSuspend(r8)
            return r8
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
            r1 = this;
            f8.i.I0(r2)
            n.b r2 = new n.b
            r2.<init>()
            n.k r0 = r1.f12756h
            r0.b(r2)
            i0.a1 r0 = r1.f12757i
            r0.setValue(r2)
            i0.a1 r2 = r1.f12758j
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.setValue(r0)
            i0.a1 r2 = r1.f12759k
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.setValue(r0)
            i0.f1 r2 = r1.f12760l
            r0 = 0
            r2.h(r0)
            sf.n r2 = sf.n.f12433a
            return r2
    }
}
