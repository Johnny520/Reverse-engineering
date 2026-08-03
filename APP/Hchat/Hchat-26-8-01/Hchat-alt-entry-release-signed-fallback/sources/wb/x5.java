package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x5 extends wb.b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wb.r5 f20082a;

    public x5(wb.r5 r1) {
            r0 = this;
            r0.<init>()
            r0.f20082a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L12
        L3:
            boolean r0 = r2 instanceof wb.x5
            if (r0 != 0) goto L8
            goto L10
        L8:
            wb.x5 r2 = (wb.x5) r2
            wb.r5 r0 = r1.f20082a
            wb.r5 r2 = r2.f20082a
            if (r0 == r2) goto L12
        L10:
            r2 = 0
            return r2
        L12:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            wb.r5 r0 = r1.f20082a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DefaultRuleEditor(kind="
            r0.<init>(r1)
            wb.r5 r1 = r2.f20082a
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
