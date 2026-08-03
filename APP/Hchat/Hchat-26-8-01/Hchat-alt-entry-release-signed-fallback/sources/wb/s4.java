package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wb.t4 f18986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f18987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1.f f18988c;

    public s4(wb.t4 r1, java.lang.String r2, m1.f r3) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.f18986a = r1
            r0.f18987b = r2
            r0.f18988c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof wb.s4
            if (r0 != 0) goto L8
            goto L26
        L8:
            wb.s4 r3 = (wb.s4) r3
            wb.t4 r0 = r2.f18986a
            wb.t4 r1 = r3.f18986a
            if (r0 == r1) goto L11
            goto L26
        L11:
            java.lang.String r0 = r2.f18987b
            java.lang.String r1 = r3.f18987b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            m1.f r0 = r2.f18988c
            m1.f r3 = r3.f18988c
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L28
        L26:
            r3 = 0
            return r3
        L28:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            wb.t4 r0 = r3.f18986a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f18987b
            int r0 = eh.a.g(r0, r1, r2)
            m1.f r1 = r3.f18988c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MainNavItem(tab="
            r0.<init>(r1)
            wb.t4 r1 = r2.f18986a
            r0.append(r1)
            java.lang.String r1 = ", label="
            r0.append(r1)
            java.lang.String r1 = r2.f18987b
            r0.append(r1)
            java.lang.String r1 = ", icon="
            r0.append(r1)
            m1.f r1 = r2.f18988c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
