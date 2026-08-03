package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements p.g, p.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9893b;

    public f(int r1) {
            r0 = this;
            r0.f9892a = r1
            switch(r1) {
                case 1: goto L1d;
                case 2: goto L15;
                case 3: goto Ld;
                default: goto L5;
            }
        L5:
            r0.<init>()
            r1 = 0
            float r1 = (float) r1
            r0.f9893b = r1
            return
        Ld:
            r0.<init>()
            r1 = 0
            float r1 = (float) r1
            r0.f9893b = r1
            return
        L15:
            r0.<init>()
            r1 = 0
            float r1 = (float) r1
            r0.f9893b = r1
            return
        L1d:
            r0.<init>()
            r1 = 0
            float r1 = (float) r1
            r0.f9893b = r1
            return
    }

    @Override // p.g, p.i
    public final float a() {
            r1 = this;
            int r0 = r1.f9892a
            switch(r0) {
                case 0: goto Le;
                case 1: goto Lb;
                case 2: goto L8;
                default: goto L5;
            }
        L5:
            float r0 = r1.f9893b
            return r0
        L8:
            float r0 = r1.f9893b
            return r0
        Lb:
            float r0 = r1.f9893b
            return r0
        Le:
            float r0 = r1.f9893b
            return r0
    }

    @Override // p.g
    public final void b(v1.p0 r1, int r2, int[] r3, u2.m r4, int[] r5) {
            r0 = this;
            int r1 = r0.f9892a
            switch(r1) {
                case 0: goto L2f;
                case 1: goto L21;
                case 2: goto L13;
                default: goto L5;
            }
        L5:
            u2.m r1 = u2.m.f13354g
            if (r4 != r1) goto Le
            r1 = 0
            p.j.f(r2, r3, r5, r1)
            goto L12
        Le:
            r1 = 1
            p.j.f(r2, r3, r5, r1)
        L12:
            return
        L13:
            u2.m r1 = u2.m.f13354g
            if (r4 != r1) goto L1c
            r1 = 0
            p.j.e(r2, r3, r5, r1)
            goto L20
        L1c:
            r1 = 1
            p.j.e(r2, r3, r5, r1)
        L20:
            return
        L21:
            u2.m r1 = u2.m.f13354g
            if (r4 != r1) goto L2a
            r1 = 0
            p.j.d(r2, r3, r5, r1)
            goto L2e
        L2a:
            r1 = 1
            p.j.d(r2, r3, r5, r1)
        L2e:
            return
        L2f:
            u2.m r1 = u2.m.f13354g
            if (r4 != r1) goto L38
            r1 = 0
            p.j.a(r2, r3, r5, r1)
            goto L3c
        L38:
            r1 = 1
            p.j.a(r2, r3, r5, r1)
        L3c:
            return
    }

    @Override // p.i
    public final void c(int r1, v1.p0 r2, int[] r3, int[] r4) {
            r0 = this;
            int r2 = r0.f9892a
            switch(r2) {
                case 0: goto L14;
                case 1: goto Lf;
                case 2: goto La;
                default: goto L5;
            }
        L5:
            r2 = 0
            p.j.f(r1, r3, r4, r2)
            return
        La:
            r2 = 0
            p.j.e(r1, r3, r4, r2)
            return
        Lf:
            r2 = 0
            p.j.d(r1, r3, r4, r2)
            return
        L14:
            r2 = 0
            p.j.a(r1, r3, r4, r2)
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            int r0 = r1.f9892a
            switch(r0) {
                case 0: goto Le;
                case 1: goto Lb;
                case 2: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "Arrangement#SpaceEvenly"
            return r0
        L8:
            java.lang.String r0 = "Arrangement#SpaceBetween"
            return r0
        Lb:
            java.lang.String r0 = "Arrangement#SpaceAround"
            return r0
        Le:
            java.lang.String r0 = "Arrangement#Center"
            return r0
    }
}
