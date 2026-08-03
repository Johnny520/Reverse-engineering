package u4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends u4.i {
    public m(u4.r r1, u4.t r2, u4.o r3, u4.o r4) {
            r0 = this;
            u4.p r4 = u4.p.p(r4)
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public m(u4.r r1, u4.t r2, u4.o r3, u4.p r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            int r1 = r1.f13410e
            r2 = 5
            if (r1 == r2) goto L19
            r2 = 6
            if (r1 == r2) goto L19
            if (r3 == 0) goto L18
            r2 = 1
            if (r1 != r2) goto L11
            goto L18
        L11:
            java.lang.String r1 = "can't mix branchingness with result"
            j8.o.t(r1)
            r1 = 0
            throw r1
        L18:
            return
        L19:
            java.lang.String r2 = "opcode with invalid branchingness: "
            java.lang.String r1 = eh.a.l(r1, r2)
            j8.o.t(r1)
            r1 = 0
            throw r1
    }

    @Override // u4.i
    public final void d(u4.h r1) {
            r0 = this;
            r1.o(r0)
            return
    }

    @Override // u4.i
    public final w4.e e() {
            r1 = this;
            w4.b r0 = w4.b.f14847i
            return r0
    }

    @Override // u4.i
    public final u4.i i(w4.c r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "unsupported"
            r2.<init>(r0)
            throw r2
    }
}
