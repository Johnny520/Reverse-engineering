package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends x1.c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1.j0 f13931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fg.p f13932c;

    public f0(v1.j0 r1, fg.p r2, java.lang.String r3) {
            r0 = this;
            r0.f13931b = r1
            r0.f13932c = r2
            r0.<init>(r3)
            return
    }

    @Override // v1.n0
    public final v1.o0 h(v1.p0 r7, java.util.List r8, long r9) {
            r6 = this;
            v1.j0 r2 = r6.f13931b
            v1.d0 r8 = r2.f13962n
            u2.m r0 = r7.getLayoutDirection()
            r8.f13917g = r0
            float r0 = r7.d()
            r8.f13918h = r0
            float r0 = r7.q0()
            r8.f13919i = r0
            boolean r7 = r7.u0()
            fg.p r0 = r6.f13932c
            r1 = 0
            if (r7 != 0) goto L3f
            x1.f0 r7 = r2.f13955g
            x1.f0 r7 = r7.f20896n
            if (r7 == 0) goto L3f
            r2.f13959k = r1
            v1.a0 r7 = r2.f13963o
            u2.a r8 = new u2.a
            r8.<init>(r9)
            java.lang.Object r7 = r0.invoke(r7, r8)
            r1 = r7
            v1.o0 r1 = (v1.o0) r1
            int r3 = r2.f13959k
            v1.e0 r0 = new v1.e0
            r5 = 0
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L3f:
            r2.f13958j = r1
            u2.a r7 = new u2.a
            r7.<init>(r9)
            java.lang.Object r7 = r0.invoke(r8, r7)
            r1 = r7
            v1.o0 r1 = (v1.o0) r1
            int r3 = r2.f13958j
            v1.e0 r0 = new v1.e0
            r5 = 1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }
}
