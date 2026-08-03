package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20294a;

    public y4(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.f20294a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof wb.y4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.y4 r4 = (wb.y4) r4
            boolean r1 = r3.f20294a
            boolean r4 = r4.f20294a
            if (r1 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.f20294a
            int r0 = java.lang.Boolean.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MarkdownInlineState(bold="
            r0.<init>(r1)
            boolean r1 = r2.f20294a
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
