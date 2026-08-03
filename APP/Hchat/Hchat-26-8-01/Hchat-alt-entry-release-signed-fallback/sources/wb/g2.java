package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.a f16297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f16299c;

    public g2(c9.a r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f16297a = r1
            r0.f16298b = r2
            r0.f16299c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof wb.g2
            if (r0 != 0) goto L8
            goto L26
        L8:
            wb.g2 r3 = (wb.g2) r3
            c9.a r0 = r2.f16297a
            c9.a r1 = r3.f16297a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            int r0 = r2.f16298b
            int r1 = r3.f16298b
            if (r0 == r1) goto L1c
            goto L26
        L1c:
            java.lang.String r0 = r2.f16299c
            java.lang.String r3 = r3.f16299c
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
            r3 = this;
            c9.a r0 = r3.f16297a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f16298b
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r1 = r3.f16299c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FlattenedConversationGroup(group="
            r0.<init>(r1)
            c9.a r1 = r3.f16297a
            r0.append(r1)
            java.lang.String r1 = ", depth="
            r0.append(r1)
            int r1 = r3.f16298b
            r0.append(r1)
            java.lang.String r1 = ", path="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r3.f16299c
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
