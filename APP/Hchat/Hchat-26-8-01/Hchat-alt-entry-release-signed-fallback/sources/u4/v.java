package u4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends u4.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.e f13521l;

    public v(u4.r r7, u4.t r8, u4.p r9, w4.e r10, v4.a r11) {
            r6 = this;
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            int r7 = r1.f13410e
            r8 = 6
            if (r7 != r8) goto L1a
            if (r10 == 0) goto L13
            r0.f13521l = r10
            return
        L13:
            java.lang.String r7 = "catches == null"
            bsh.j.c(r7)
            r7 = 0
            throw r7
        L1a:
            java.lang.String r8 = "opcode with invalid branchingness: "
            java.lang.String r7 = eh.a.l(r7, r8)
            j8.o.t(r7)
            r7 = 0
            throw r7
    }

    @Override // u4.i
    public final void d(u4.h r1) {
            r0 = this;
            r1.e(r0)
            return
    }

    @Override // u4.i
    public final w4.e e() {
            r1 = this;
            w4.e r0 = r1.f13521l
            return r0
    }

    @Override // u4.d, u4.i
    public final java.lang.String h() {
            r3 = this;
            v4.a r0 = r3.f13370k
            java.lang.String r1 = r0.a()
            boolean r2 = r0 instanceof v4.c0
            if (r2 == 0) goto L10
            v4.c0 r0 = (v4.c0) r0
            java.lang.String r1 = r0.l()
        L10:
            java.lang.String r0 = " "
            java.lang.StringBuilder r0 = bc.e.n(r1, r0)
            w4.e r1 = r3.f13521l
            java.lang.String r1 = u4.u.j(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // u4.i
    public final u4.i i(w4.c r7) {
            r6 = this;
            u4.v r0 = new u4.v
            w4.e r1 = r6.f13521l
            w4.e r4 = r1.d(r7)
            v4.a r5 = r6.f13370k
            u4.r r1 = r6.f13382g
            u4.t r2 = r6.f13383h
            u4.p r3 = r6.f13385j
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }
}
