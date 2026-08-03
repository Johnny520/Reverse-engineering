package y5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements u5.a, t5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5.f f22301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22303c;

    public a(f5.f r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            int r0 = r2.t()
            int r1 = r3.f3295m
            if (r1 != r0) goto L24
            r2.f22301a = r3
            r3 = r4 & (-256(0xffffffffffffff00, float:NaN))
            if (r3 != 0) goto L12
            goto L1f
        L12:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r0 = "Invalid register: v%d. Must be between v0 and v255, inclusive."
            ah.a.q(r0, r3)
        L1f:
            r2.f22302b = r4
            r2.f22303c = r5
            return
        L24:
            java.lang.String r3 = r3.f3291i
            java.lang.String r4 = eh.a.B(r0)
            java.lang.String r5 = "Invalid opcode "
            java.lang.String r0 = " for "
            java.lang.String r3 = bc.e.j(r5, r3, r0, r4)
            j8.o.t(r3)
            r3 = 0
            throw r3
    }

    @Override // t5.d
    public int c() {
            r1 = this;
            int r0 = r1.t()
            int r0 = eh.a.c(r0)
            int r0 = r0 / 2
            return r0
    }

    @Override // t5.g
    public final int h() {
            r1 = this;
            int r0 = r1.f22302b
            return r0
    }

    @Override // t5.d
    public final f5.f i() {
            r1 = this;
            f5.f r0 = r1.f22301a
            return r0
    }

    @Override // t5.f
    public final int l() {
            r1 = this;
            int r0 = r1.f22303c
            return r0
    }

    public final int t() {
            r1 = this;
            r0 = 23
            return r0
    }
}
