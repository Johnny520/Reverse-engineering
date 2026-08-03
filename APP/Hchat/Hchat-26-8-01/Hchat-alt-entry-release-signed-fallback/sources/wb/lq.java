package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class lq extends wb.mq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17538a;

    public lq(int r1) {
            r0 = this;
            r0.<init>()
            r0.f17538a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof wb.lq
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.lq r4 = (wb.lq) r4
            int r1 = r3.f17538a
            int r4 = r4.f17538a
            if (r1 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f17538a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "StepEditor(index="
            java.lang.String r1 = ")"
            int r2 = r3.f17538a
            java.lang.String r0 = eh.a.m(r2, r0, r1)
            return r0
    }
}
