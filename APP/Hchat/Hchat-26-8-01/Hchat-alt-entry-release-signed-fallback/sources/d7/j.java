package d7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends o7.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r7.b f2047m;

    public j(int r1, boolean r2) {
            r0 = this;
            int r1 = r1 + 1
            r0.<init>(r1)
            r1 = 0
            if (r2 == 0) goto Le
            r7.h r2 = new r7.h
            r2.<init>(r1)
            goto L13
        Le:
            r7.f r2 = new r7.f
            r2.<init>(r1)
        L13:
            r0.f2047m = r2
            r0.P(r2)
            return
    }

    @Override // k7.c, k7.a
    public final void B(q7.b r7) {
            r6 = this;
            boolean r0 = r7.b()
            if (r0 != 0) goto L7
            return
        L7:
            r7.b r0 = r6.f2047m
            r0.G(r7)
            long r1 = r6.Q()
            int r1 = (int) r1
            r2 = 0
            if (r1 > 0) goto L18
            r6.R(r2)
            return
        L18:
            r6.R(r1)
            q7.b r3 = r7.a(r1)
            k7.a[] r4 = r6.f9567k
        L21:
            int r5 = r4.length
            if (r2 >= r5) goto L2f
            r5 = r4[r2]
            if (r5 != r0) goto L29
            goto L2c
        L29:
            r5.G(r3)
        L2c:
            int r2 = r2 + 1
            goto L21
        L2f:
            r7.c(r1)
            return
    }

    @Override // o7.d, k7.c
    public final void N() {
            r4 = this;
            int r0 = r4.p()
            r7.b r1 = r4.f2047m
            int r2 = r1.p()
            int r0 = r0 - r2
            long r2 = (long) r0
            boolean r0 = r1 instanceof r7.h
            if (r0 == 0) goto L16
            r7.h r1 = (r7.h) r1
            r1.N(r2)
            return
        L16:
            r7.f r1 = (r7.f) r1
            int r0 = (int) r2
            r1.k(r0)
            return
    }

    public final long Q() {
            r2 = this;
            r7.b r0 = r2.f2047m
            boolean r1 = r0 instanceof r7.h
            if (r1 == 0) goto Lb
            r7.h r0 = (r7.h) r0
            long r0 = r0.f11562n
            return r0
        Lb:
            r7.f r0 = (r7.f) r0
            int r0 = r0.f11560n
            long r0 = (long) r0
            return r0
    }

    public void R(int r1) {
            r0 = this;
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "size="
            r0.<init>(r1)
            r7.b r1 = r2.f2047m
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
