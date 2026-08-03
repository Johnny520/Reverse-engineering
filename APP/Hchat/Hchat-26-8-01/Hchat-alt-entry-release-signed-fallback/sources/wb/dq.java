package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class dq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f15771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f15772b;

    public dq(java.lang.Object r1, java.lang.String r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f15771a = r2
            r0.f15772b = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof wb.dq
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.dq r5 = (wb.dq) r5
            java.lang.String r1 = r4.f15771a
            java.lang.String r3 = r5.f15771a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Object r1 = r4.f15772b
            java.lang.Object r5 = r5.f15772b
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f15771a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Object r1 = r2.f15772b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PopupChoice(label="
            r0.<init>(r1)
            java.lang.String r1 = r2.f15771a
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            java.lang.Object r1 = r2.f15772b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
