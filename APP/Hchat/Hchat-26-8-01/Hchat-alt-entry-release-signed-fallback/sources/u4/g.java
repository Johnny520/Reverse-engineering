package u4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends u4.i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f13380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v4.a f13381l;

    public g(u4.r r2, u4.t r3, u4.p r4, java.util.ArrayList r5, v4.a r6) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            int r2 = r2.f13410e
            r3 = 1
            if (r2 != r3) goto Le
            r1.f13380k = r5
            r1.f13381l = r6
            return
        Le:
            java.lang.String r3 = "opcode with invalid branchingness: "
            java.lang.String r2 = eh.a.l(r2, r3)
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    @Override // u4.i
    public final void d(u4.h r1) {
            r0 = this;
            r1.u(r0)
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
