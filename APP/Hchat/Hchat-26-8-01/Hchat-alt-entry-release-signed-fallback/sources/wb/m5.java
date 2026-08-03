package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wb.s0 f17595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wb.l5 f17596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f17597c;

    public m5(wb.s0 r1, wb.l5 r2, java.util.List r3) {
            r0 = this;
            r0.<init>()
            r0.f17595a = r1
            r0.f17596b = r2
            r0.f17597c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof wb.m5
            if (r0 != 0) goto L8
            goto L26
        L8:
            wb.m5 r3 = (wb.m5) r3
            wb.s0 r0 = r2.f17595a
            wb.s0 r1 = r3.f17595a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            wb.l5 r0 = r2.f17596b
            wb.l5 r1 = r3.f17596b
            if (r0 == r1) goto L1c
            goto L26
        L1c:
            java.util.List r0 = r2.f17597c
            java.util.List r3 = r3.f17597c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L28
        L26:
            r3 = 0
            return r3
        L28:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            wb.s0 r0 = r2.f17595a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            wb.l5 r1 = r2.f17596b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List r0 = r2.f17597c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MessageBlockContactOption(contact="
            r0.<init>(r1)
            wb.s0 r1 = r2.f17595a
            r0.append(r1)
            java.lang.String r1 = ", kind="
            r0.append(r1)
            wb.l5 r1 = r2.f17596b
            r0.append(r1)
            java.lang.String r1 = ", labelNames="
            r0.append(r1)
            java.util.List r1 = r2.f17597c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
