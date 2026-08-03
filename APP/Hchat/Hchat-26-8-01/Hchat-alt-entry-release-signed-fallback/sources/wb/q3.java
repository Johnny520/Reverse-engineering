package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9.j f18566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k9.j f18567b;

    public q3(k9.j r1, k9.j r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f18566a = r1
            r0.f18567b = r2
            return
    }

    public static wb.q3 a(wb.q3 r1, k9.j r2) {
            k9.j r0 = r1.f18566a
            r1.getClass()
            wb.q3 r1 = new wb.q3
            r1.<init>(r0, r2)
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof wb.q3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.q3 r5 = (wb.q3) r5
            k9.j r1 = r4.f18566a
            k9.j r3 = r5.f18566a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            k9.j r1 = r4.f18567b
            k9.j r5 = r5.f18567b
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            k9.j r0 = r2.f18566a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 * 31
            k9.j r1 = r2.f18567b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FloatingShortcutEditorRequest(original="
            r0.<init>(r1)
            k9.j r1 = r2.f18566a
            r0.append(r1)
            java.lang.String r1 = ", draft="
            r0.append(r1)
            k9.j r1 = r2.f18567b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
