package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 extends wb.r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f18565a;

    public q2(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f18565a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof wb.q2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.q2 r4 = (wb.q2) r4
            java.lang.String r1 = r3.f18565a
            java.lang.String r4 = r4.f18565a
            boolean r4 = gg.l.a(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f18565a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "RuleEditor(talker="
            java.lang.String r1 = ")"
            java.lang.String r2 = r3.f18565a
            java.lang.String r0 = eh.a.n(r0, r2, r1)
            return r0
    }
}
