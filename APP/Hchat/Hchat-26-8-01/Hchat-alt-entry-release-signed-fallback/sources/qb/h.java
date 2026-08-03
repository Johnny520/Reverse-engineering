package qb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.io.File f10827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f10828c;

    public h(java.io.File r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f10826a = r3
            r0.f10827b = r1
            r0.f10828c = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof qb.h
            if (r0 != 0) goto L8
            goto L26
        L8:
            qb.h r3 = (qb.h) r3
            boolean r0 = r2.f10826a
            boolean r1 = r3.f10826a
            if (r0 == r1) goto L11
            goto L26
        L11:
            java.io.File r0 = r2.f10827b
            java.io.File r1 = r3.f10827b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            java.lang.String r0 = r2.f10828c
            java.lang.String r3 = r3.f10828c
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
            boolean r0 = r2.f10826a
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 * 31
            java.io.File r1 = r2.f10827b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.f10828c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SaveResult(success="
            r0.<init>(r1)
            boolean r1 = r3.f10826a
            r0.append(r1)
            java.lang.String r1 = ", file="
            r0.append(r1)
            java.io.File r1 = r3.f10827b
            r0.append(r1)
            java.lang.String r1 = ", error="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r3.f10828c
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
