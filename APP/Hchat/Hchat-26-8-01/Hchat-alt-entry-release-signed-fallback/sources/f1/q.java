package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends y0.n implements x1.v, x1.z1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public fg.l f3107u;

    public q(fg.l r1) {
            r0 = this;
            r0.<init>()
            r0.f3107u = r1
            return
    }

    @Override // x1.z1
    public final boolean A() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // x1.z1
    public final void X0(f2.y r7) {
            r6 = this;
            r0 = 2
            x1.i1 r0 = x1.k.t(r6, r0)
            boolean r1 = r0.L
            if (r1 != 0) goto L4d
            f1.o0 r1 = f1.c0.f3037a
            if (r1 != 0) goto L15
            f1.o0 r1 = new f1.o0
            r1.<init>()
            f1.c0.f3037a = r1
            goto L18
        L15:
            r1.e()
        L18:
            f1.o0 r1 = f1.c0.f3037a
            r1.getClass()
            x1.f0 r2 = r0.f20943u
            u2.c r2 = r2.E
            r1.f3098w = r2
            long r2 = r0.f13902i
            long r2 = r9.e0.q0(r2)
            r1.f3097v = r2
            w0.f r0 = w0.q.e()
            if (r0 == 0) goto L36
            fg.l r2 = r0.e()
            goto L37
        L36:
            r2 = 0
        L37:
            w0.f r3 = w0.q.h(r0)
            fg.l r4 = r6.f3107u     // Catch: java.lang.Throwable -> L48
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L48
            w0.q.k(r0, r3, r2)
            f1.r0 r0 = r1.f3094s
            boolean r1 = r1.f3095t
            goto L54
        L48:
            r7 = move-exception
            w0.q.k(r0, r3, r2)
            throw r7
        L4d:
            f1.r0 r1 = r0.J
            boolean r0 = r0.K
            r5 = r1
            r1 = r0
            r0 = r5
        L54:
            if (r1 != 0) goto L57
            return
        L57:
            f2.w.d(r7, r0)
            return
    }

    @Override // y0.n
    public final boolean Z0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // x1.v
    public final v1.o0 j(v1.p0 r3, v1.m0 r4, long r5) {
            r2 = this;
            v1.b1 r4 = r4.Q(r5)
            int r5 = r4.f13900g
            int r6 = r4.f13901h
            f1.p r0 = new f1.p
            r1 = 0
            r0.<init>(r4, r1, r2)
            tf.u r4 = tf.u.f13168g
            v1.o0 r3 = r3.z(r5, r6, r4, r0)
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BlockGraphicsLayerModifier(block="
            r0.<init>(r1)
            fg.l r1 = r2.f3107u
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
