package u4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends u4.i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13519k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.Object f13520l;

    public u(u4.r r2, u4.t r3, u4.o r4, u4.p r5, z4.g r6) {
            r1 = this;
            r0 = 0
            r1.f13519k = r0
            r1.<init>(r2, r3, r4, r5)
            int r2 = r2.f13410e
            r3 = 5
            if (r2 != r3) goto L17
            if (r6 == 0) goto L10
            r1.f13520l = r6
            return
        L10:
            java.lang.String r2 = "cases == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
        L17:
            java.lang.String r2 = "bogus branchingness"
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public u(u4.r r2, u4.t r3, u4.p r4, w4.e r5) {
            r1 = this;
            r0 = 1
            r1.f13519k = r0
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            int r2 = r2.f13410e
            r3 = 6
            if (r2 != r3) goto L18
            if (r5 == 0) goto L11
            r1.f13520l = r5
            return
        L11:
            java.lang.String r2 = "catches == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
        L18:
            java.lang.String r3 = "opcode with invalid branchingness: "
            java.lang.String r2 = eh.a.l(r2, r3)
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public static java.lang.String j(w4.e r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.lang.String r1 = "catch"
            r0.append(r1)
            int r1 = r4.size()
            r2 = 0
        L11:
            if (r2 >= r1) goto L26
            java.lang.String r3 = " "
            r0.append(r3)
            w4.c r3 = r4.getType(r2)
            java.lang.String r3 = r3.a()
            r0.append(r3)
            int r2 = r2 + 1
            goto L11
        L26:
            java.lang.String r4 = r0.toString()
            return r4
    }

    @Override // u4.i
    public final void d(u4.h r2) {
            r1 = this;
            int r0 = r1.f13519k
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            r2.l(r1)
            return
        L9:
            r2.x(r1)
            return
    }

    @Override // u4.i
    public final w4.e e() {
            r1 = this;
            int r0 = r1.f13519k
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f13520l
            w4.e r0 = (w4.e) r0
            return r0
        La:
            w4.b r0 = w4.b.f14847i
            return r0
    }

    @Override // u4.i
    public final java.lang.String h() {
            r1 = this;
            int r0 = r1.f13519k
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f13520l
            w4.e r0 = (w4.e) r0
            java.lang.String r0 = j(r0)
            return r0
        Le:
            java.lang.Object r0 = r1.f13520l
            z4.g r0 = (z4.g) r0
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // u4.i
    public final u4.i i(w4.c r5) {
            r4 = this;
            int r0 = r4.f13519k
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            u4.u r0 = new u4.u
            java.lang.Object r1 = r4.f13520l
            w4.e r1 = (w4.e) r1
            w4.e r5 = r1.d(r5)
            u4.r r1 = r4.f13382g
            u4.t r2 = r4.f13383h
            u4.p r3 = r4.f13385j
            r0.<init>(r1, r2, r3, r5)
            return r0
        L19:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "unsupported"
            r5.<init>(r0)
            throw r5
    }
}
