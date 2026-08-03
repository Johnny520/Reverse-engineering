package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class mu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ua.h f17791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17792c;

    public mu(int r1, ua.h r2, boolean r3) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f17790a = r1
            r0.f17791b = r2
            r0.f17792c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof wb.mu
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.mu r5 = (wb.mu) r5
            int r1 = r4.f17790a
            int r3 = r5.f17790a
            if (r1 == r3) goto L13
            return r2
        L13:
            ua.h r1 = r4.f17791b
            ua.h r3 = r5.f17791b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            boolean r1 = r4.f17792c
            boolean r5 = r5.f17792c
            if (r1 == r5) goto L25
            return r2
        L25:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f17790a
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            ua.h r1 = r2.f17791b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r2.f17792c
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TransferBindingEditorRequest(index="
            r0.<init>(r1)
            int r1 = r3.f17790a
            r0.append(r1)
            java.lang.String r1 = ", binding="
            r0.append(r1)
            ua.h r1 = r3.f17791b
            r0.append(r1)
            java.lang.String r1 = ", canDelete="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r3.f17792c
            java.lang.String r0 = p.a.m(r1, r0, r2)
            return r0
    }
}
