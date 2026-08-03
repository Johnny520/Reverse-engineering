package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class fu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f16280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f16281b;

    public fu(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f16280a = r1
            r0.f16281b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof wb.fu
            if (r0 != 0) goto L8
            goto L1f
        L8:
            wb.fu r3 = (wb.fu) r3
            java.lang.String r0 = r2.f16280a
            java.lang.String r1 = r3.f16280a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            java.lang.String r0 = r2.f16281b
            java.lang.String r3 = r3.f16281b
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L21
        L1f:
            r3 = 0
            return r3
        L21:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f16280a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.f16281b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", label="
            java.lang.String r1 = ")"
            java.lang.String r2 = "TemplateVariable(token="
            java.lang.String r3 = r5.f16280a
            java.lang.String r4 = r5.f16281b
            java.lang.String r0 = bc.e.k(r2, r3, r0, r4, r1)
            return r0
    }
}
