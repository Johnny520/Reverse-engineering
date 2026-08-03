package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends wb.x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wb.s2 f19353a;

    public u2(wb.s2 r1) {
            r0 = this;
            r0.<init>()
            r0.f19353a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof wb.u2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.u2 r4 = (wb.u2) r4
            wb.s2 r1 = r3.f19353a
            wb.s2 r4 = r4.f19353a
            boolean r4 = gg.l.a(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            wb.s2 r0 = r1.f19353a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ScriptPluginAgent(parentFeature="
            r0.<init>(r1)
            wb.s2 r1 = r2.f19353a
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
