package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k4 extends wb.l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q9.g f17193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17194c;

    public k4(int r1, q9.g r2, boolean r3) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f17192a = r1
            r0.f17193b = r2
            r0.f17194c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof wb.k4
            if (r0 != 0) goto L8
            goto L22
        L8:
            wb.k4 r3 = (wb.k4) r3
            int r0 = r2.f17192a
            int r1 = r3.f17192a
            if (r0 == r1) goto L11
            goto L22
        L11:
            q9.g r0 = r2.f17193b
            q9.g r1 = r3.f17193b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L1c
            goto L22
        L1c:
            boolean r0 = r2.f17194c
            boolean r3 = r3.f17194c
            if (r0 == r3) goto L24
        L22:
            r3 = 0
            return r3
        L24:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f17192a
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            q9.g r1 = r2.f17193b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r2.f17194c
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TemplateEditor(index="
            r0.<init>(r1)
            int r1 = r3.f17192a
            r0.append(r1)
            java.lang.String r1 = ", template="
            r0.append(r1)
            q9.g r1 = r3.f17193b
            r0.append(r1)
            java.lang.String r1 = ", canDelete="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r3.f17194c
            java.lang.String r0 = p.a.m(r1, r0, r2)
            return r0
    }
}
